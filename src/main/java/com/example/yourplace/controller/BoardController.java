package com.example.yourplace.controller;

import com.example.yourplace.dto.BoardDto;
import com.example.yourplace.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

@AllArgsConstructor
public class BoardController {

    private BoardService boardService;

    @GetMapping("/")
    public String list(Model model){
        List<BoardDto> boardList=boardService.getBoardlist();

        model.addAttribute("boardList", boardList);
        return "board/list";
    }



}
