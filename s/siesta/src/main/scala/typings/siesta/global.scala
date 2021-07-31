package typings.siesta

import typings.siesta.Siesta.Harness.IBrowserSingleton
import typings.siesta.Siesta.Harness.IHarnessNodeJS
import typings.siesta.Siesta.ITest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Siesta {
    
    object Harness {
      
      @JSGlobal("Siesta.Harness")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Siesta.Harness.Browser")
      @js.native
      def Browser: IBrowserSingleton = js.native
      @scala.inline
      def Browser_=(x: IBrowserSingleton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Browser")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Siesta.Harness.NodeJS")
      @js.native
      def NodeJS: IHarnessNodeJS = js.native
      @scala.inline
      def NodeJS_=(x: IHarnessNodeJS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NodeJS")(x.asInstanceOf[js.Any])
    }
    
    object Test {
      
      object Simulate {
        
        // NOTE https://github.com/DefinitelyTyped/DefinitelyTyped/pull/3135
        object KeyCodes {
          
          @JSGlobal("Siesta.Test.Simulate.KeyCodes")
          @js.native
          val ^ : js.Any = js.native
          
          // = 32,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.0")
          @js.native
          val `0`: Double = js.native
          
          // = 48,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.1")
          @js.native
          val `1`: Double = js.native
          
          // = 49,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.2")
          @js.native
          val `2`: Double = js.native
          
          // = 50,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.3")
          @js.native
          val `3`: Double = js.native
          
          // = 51,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.4")
          @js.native
          val `4`: Double = js.native
          
          // = 52,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.5")
          @js.native
          val `5`: Double = js.native
          
          // = 53,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.6")
          @js.native
          val `6`: Double = js.native
          
          // = 54,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.7")
          @js.native
          val `7`: Double = js.native
          
          // = 55,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.8")
          @js.native
          val `8`: Double = js.native
          
          // = 56,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.9")
          @js.native
          val `9`: Double = js.native
          
          // = 57,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.A")
          @js.native
          def A: Double = js.native
          
          // = 17,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.ALT")
          @js.native
          def ALT: Double = js.native
          @scala.inline
          def ALT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALT")(x.asInstanceOf[js.Any])
          
          @scala.inline
          def A_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("A")(x.asInstanceOf[js.Any])
          
          // = 221,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.'")
          @js.native
          def Apostrophe: Double = js.native
          
          @scala.inline
          def Apostrophe_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("'")(x.asInstanceOf[js.Any])
          
          // = 65,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.B")
          @js.native
          def B: Double = js.native
          
          // = 8,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.BACKSPACE")
          @js.native
          def BACKSPACE: Double = js.native
          @scala.inline
          def BACKSPACE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKSPACE")(x.asInstanceOf[js.Any])
          
          @scala.inline
          def B_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("B")(x.asInstanceOf[js.Any])
          
          // = 219,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.\\")
          @js.native
          def Backslash: Double = js.native
          
          @scala.inline
          def Backslash_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\\")(x.asInstanceOf[js.Any])
          
          // = 66,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.C")
          @js.native
          def C: Double = js.native
          
          // = 19,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.CAPS")
          @js.native
          def CAPS: Double = js.native
          @scala.inline
          def CAPS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAPS")(x.asInstanceOf[js.Any])
          
          // = 16,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.CTRL")
          @js.native
          def CTRL: Double = js.native
          @scala.inline
          def CTRL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CTRL")(x.asInstanceOf[js.Any])
          
          @scala.inline
          def C_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C")(x.asInstanceOf[js.Any])
          
          // = 9,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.\r")
          @js.native
          def Carriagereturn: Double = js.native
          
          @scala.inline
          def Carriagereturn_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\r")(x.asInstanceOf[js.Any])
          
          // = 8,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.\t")
          @js.native
          def Charactertabulation: Double = js.native
          
          @scala.inline
          def Charactertabulation_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\t")(x.asInstanceOf[js.Any])
          
          // = 187,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.,")
          @js.native
          def Comma: Double = js.native
          
          @scala.inline
          def Comma_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(",")(x.asInstanceOf[js.Any])
          
          // = 67,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.D")
          @js.native
          def D: Double = js.native
          
          // = 45,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.DELETE")
          @js.native
          def DELETE: Double = js.native
          @scala.inline
          def DELETE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETE")(x.asInstanceOf[js.Any])
          
          // = 39,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.DOWN")
          @js.native
          def DOWN: Double = js.native
          @scala.inline
          def DOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOWN")(x.asInstanceOf[js.Any])
          
          @scala.inline
          def D_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("D")(x.asInstanceOf[js.Any])
          
          // = 189,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes..")
          @js.native
          def Dot: Double = js.native
          
          @scala.inline
          def Dot_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(".")(x.asInstanceOf[js.Any])
          
          // = 68,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.E")
          @js.native
          def E: Double = js.native
          
          // = 34,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.END")
          @js.native
          def END: Double = js.native
          @scala.inline
          def END_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END")(x.asInstanceOf[js.Any])
          
          // = 13,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.ENTER")
          @js.native
          def ENTER: Double = js.native
          @scala.inline
          def ENTER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTER")(x.asInstanceOf[js.Any])
          
          // = 20,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.ESCAPE")
          @js.native
          def ESCAPE: Double = js.native
          @scala.inline
          def ESCAPE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ESCAPE")(x.asInstanceOf[js.Any])
          
          @scala.inline
          def E_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("E")(x.asInstanceOf[js.Any])
          
          // = 186,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.=")
          @js.native
          def Equalssign: Double = js.native
          
          @scala.inline
          def Equalssign_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("=")(x.asInstanceOf[js.Any])
          
          // = 69,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.F")
          @js.native
          def F: Double = js.native
          
          // = 222,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.F1")
          @js.native
          def F1: Double = js.native
          
          // = 120,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.F10")
          @js.native
          def F10: Double = js.native
          @scala.inline
          def F10_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F10")(x.asInstanceOf[js.Any])
          
          // = 121,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.F11")
          @js.native
          def F11: Double = js.native
          @scala.inline
          def F11_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F11")(x.asInstanceOf[js.Any])
          
          // = 122,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.F12")
          @js.native
          def F12: Double = js.native
          @scala.inline
          def F12_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F12")(x.asInstanceOf[js.Any])
          
          @scala.inline
          def F1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F1")(x.asInstanceOf[js.Any])
          
          // = 112,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.F2")
          @js.native
          def F2: Double = js.native
          @scala.inline
          def F2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F2")(x.asInstanceOf[js.Any])
          
          // = 113,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.F3")
          @js.native
          def F3: Double = js.native
          @scala.inline
          def F3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F3")(x.asInstanceOf[js.Any])
          
          // = 114,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.F4")
          @js.native
          def F4: Double = js.native
          @scala.inline
          def F4_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F4")(x.asInstanceOf[js.Any])
          
          // = 115,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.F5")
          @js.native
          def F5: Double = js.native
          @scala.inline
          def F5_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F5")(x.asInstanceOf[js.Any])
          
          // = 116,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.F6")
          @js.native
          def F6: Double = js.native
          @scala.inline
          def F6_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F6")(x.asInstanceOf[js.Any])
          
          // = 117,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.F7")
          @js.native
          def F7: Double = js.native
          @scala.inline
          def F7_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F7")(x.asInstanceOf[js.Any])
          
          // = 118,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.F8")
          @js.native
          def F8: Double = js.native
          @scala.inline
          def F8_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F8")(x.asInstanceOf[js.Any])
          
          // = 119,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.F9")
          @js.native
          def F9: Double = js.native
          @scala.inline
          def F9_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F9")(x.asInstanceOf[js.Any])
          
          @scala.inline
          def F_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F")(x.asInstanceOf[js.Any])
          
          // = 70,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.G")
          @js.native
          def G: Double = js.native
          @scala.inline
          def G_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("G")(x.asInstanceOf[js.Any])
          
          // = 191,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.`")
          @js.native
          def Graveaccent: Double = js.native
          
          @scala.inline
          def Graveaccent_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("`")(x.asInstanceOf[js.Any])
          
          // = 71,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.H")
          @js.native
          def H: Double = js.native
          
          // = 35,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.HOME")
          @js.native
          def HOME: Double = js.native
          @scala.inline
          def HOME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOME")(x.asInstanceOf[js.Any])
          
          @scala.inline
          def H_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("H")(x.asInstanceOf[js.Any])
          
          // = 72,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.I")
          @js.native
          def I: Double = js.native
          
          // = 40,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.INSERT")
          @js.native
          def INSERT: Double = js.native
          @scala.inline
          def INSERT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSERT")(x.asInstanceOf[js.Any])
          
          @scala.inline
          def I_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("I")(x.asInstanceOf[js.Any])
          
          // = 73,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.J")
          @js.native
          def J: Double = js.native
          @scala.inline
          def J_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("J")(x.asInstanceOf[js.Any])
          
          // = 74,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.K")
          @js.native
          def K: Double = js.native
          @scala.inline
          def K_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("K")(x.asInstanceOf[js.Any])
          
          // = 75,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.L")
          @js.native
          def L: Double = js.native
          
          // = 36,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.LEFT")
          @js.native
          def LEFT: Double = js.native
          @scala.inline
          def LEFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
          
          @scala.inline
          def L_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("L")(x.asInstanceOf[js.Any])
          
          // = 76,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.M")
          @js.native
          def M: Double = js.native
          @scala.inline
          def M_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("M")(x.asInstanceOf[js.Any])
          
          // = 77,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.N")
          @js.native
          def N: Double = js.native
          
          // = 105,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.NUM*")
          @js.native
          def NUM: Double = js.native
          
          // = 90,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.NUM0")
          @js.native
          def NUM0: Double = js.native
          @scala.inline
          def NUM0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM0")(x.asInstanceOf[js.Any])
          
          // = 96,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.NUM1")
          @js.native
          def NUM1: Double = js.native
          @scala.inline
          def NUM1_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM1")(x.asInstanceOf[js.Any])
          
          // = 97,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.NUM2")
          @js.native
          def NUM2: Double = js.native
          @scala.inline
          def NUM2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM2")(x.asInstanceOf[js.Any])
          
          // = 98,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.NUM3")
          @js.native
          def NUM3: Double = js.native
          @scala.inline
          def NUM3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM3")(x.asInstanceOf[js.Any])
          
          // = 99,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.NUM4")
          @js.native
          def NUM4: Double = js.native
          @scala.inline
          def NUM4_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM4")(x.asInstanceOf[js.Any])
          
          // = 100,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.NUM5")
          @js.native
          def NUM5: Double = js.native
          @scala.inline
          def NUM5_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM5")(x.asInstanceOf[js.Any])
          
          // = 101,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.NUM6")
          @js.native
          def NUM6: Double = js.native
          @scala.inline
          def NUM6_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM6")(x.asInstanceOf[js.Any])
          
          // = 102,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.NUM7")
          @js.native
          def NUM7: Double = js.native
          @scala.inline
          def NUM7_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM7")(x.asInstanceOf[js.Any])
          
          // = 103,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.NUM8")
          @js.native
          def NUM8: Double = js.native
          @scala.inline
          def NUM8_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM8")(x.asInstanceOf[js.Any])
          
          // = 104,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.NUM9")
          @js.native
          def NUM9: Double = js.native
          @scala.inline
          def NUM9_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM9")(x.asInstanceOf[js.Any])
          
          // = 27,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.NUM-LOCK")
          @js.native
          def NUMLOCK: Double = js.native
          
          @scala.inline
          def NUMLOCK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM-LOCK")(x.asInstanceOf[js.Any])
          
          // = 106,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.NUM+")
          @js.native
          def NUMPlussign: Double = js.native
          
          @scala.inline
          def NUMPlussign_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM+")(x.asInstanceOf[js.Any])
          
          @scala.inline
          def NUM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM*")(x.asInstanceOf[js.Any])
          
          @scala.inline
          def N_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("N")(x.asInstanceOf[js.Any])
          
          // = 78,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.O")
          @js.native
          def O: Double = js.native
          @scala.inline
          def O_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("O")(x.asInstanceOf[js.Any])
          
          // = 79,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.P")
          @js.native
          def P: Double = js.native
          
          // = 33,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.PAGE-DOWN")
          @js.native
          def PAGEDOWN: Double = js.native
          
          @scala.inline
          def PAGEDOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAGE-DOWN")(x.asInstanceOf[js.Any])
          
          // = 44,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.PAGE-UP")
          @js.native
          def PAGEUP: Double = js.native
          
          @scala.inline
          def PAGEUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAGE-UP")(x.asInstanceOf[js.Any])
          
          // = 18,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.PAUSE-BREAK")
          @js.native
          def PAUSEBREAK: Double = js.native
          
          @scala.inline
          def PAUSEBREAK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAUSE-BREAK")(x.asInstanceOf[js.Any])
          
          // = 145,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.PRINT")
          @js.native
          def PRINT: Double = js.native
          @scala.inline
          def PRINT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRINT")(x.asInstanceOf[js.Any])
          
          @scala.inline
          def P_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("P")(x.asInstanceOf[js.Any])
          
          // = 80,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.Q")
          @js.native
          def Q: Double = js.native
          @scala.inline
          def Q_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Q")(x.asInstanceOf[js.Any])
          
          // = 81,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.R")
          @js.native
          def R: Double = js.native
          
          // = 13,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.RETURN")
          @js.native
          def RETURN: Double = js.native
          @scala.inline
          def RETURN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RETURN")(x.asInstanceOf[js.Any])
          
          // = 38,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.RIGHT")
          @js.native
          def RIGHT: Double = js.native
          @scala.inline
          def RIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
          
          @scala.inline
          def R_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("R")(x.asInstanceOf[js.Any])
          
          // = 82,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.S")
          @js.native
          def S: Double = js.native
          
          // = 144,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.SCROLL-LOCK")
          @js.native
          def SCROLLLOCK: Double = js.native
          
          @scala.inline
          def SCROLLLOCK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL-LOCK")(x.asInstanceOf[js.Any])
          
          // = 13,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.SHIFT")
          @js.native
          def SHIFT: Double = js.native
          @scala.inline
          def SHIFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHIFT")(x.asInstanceOf[js.Any])
          
          @scala.inline
          def S_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("S")(x.asInstanceOf[js.Any])
          
          // = 107,
          //'NUM-' = 109,
          //'NUM.' = 110,
          //'NUM/' = 111,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.;")
          @js.native
          def Semicolon: Double = js.native
          
          @scala.inline
          def Semicolon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(";")(x.asInstanceOf[js.Any])
          
          // = 190,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes./")
          @js.native
          def Slash: Double = js.native
          
          @scala.inline
          def Slash_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("/")(x.asInstanceOf[js.Any])
          
          // = 46,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes. ")
          @js.native
          def Space: Double = js.native
          
          @scala.inline
          def Space_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(" ")(x.asInstanceOf[js.Any])
          
          // = 83,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.T")
          @js.native
          def T: Double = js.native
          
          // = 9,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.TAB")
          @js.native
          def TAB: Double = js.native
          @scala.inline
          def TAB_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB")(x.asInstanceOf[js.Any])
          
          @scala.inline
          def T_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("T")(x.asInstanceOf[js.Any])
          
          // = 84,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.U")
          @js.native
          def U: Double = js.native
          
          // = 37,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.UP")
          @js.native
          def UP: Double = js.native
          @scala.inline
          def UP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UP")(x.asInstanceOf[js.Any])
          
          @scala.inline
          def U_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("U")(x.asInstanceOf[js.Any])
          
          // = 85,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.V")
          @js.native
          def V: Double = js.native
          @scala.inline
          def V_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("V")(x.asInstanceOf[js.Any])
          
          // = 86,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.W")
          @js.native
          def W: Double = js.native
          @scala.inline
          def W_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("W")(x.asInstanceOf[js.Any])
          
          // = 87,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.X")
          @js.native
          def X: Double = js.native
          @scala.inline
          def X_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X")(x.asInstanceOf[js.Any])
          
          // = 88,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.Y")
          @js.native
          def Y: Double = js.native
          @scala.inline
          def Y_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Y")(x.asInstanceOf[js.Any])
          
          // = 89,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.Z")
          @js.native
          def Z: Double = js.native
          @scala.inline
          def Z_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z")(x.asInstanceOf[js.Any])
          
          // = 192,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.[")
          @js.native
          val `[`: Double = js.native
          
          // = 220,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.]")
          @js.native
          val `]`: Double = js.native
          
          // = 188,
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.-")
          @js.native
          def _dash: Double = js.native
          
          @scala.inline
          def _dash_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("-")(x.asInstanceOf[js.Any])
          
          @JSGlobal("Siesta.Test.Simulate.KeyCodes.\b")
          @js.native
          def _empty: Double = js.native
          
          @scala.inline
          def _empty_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\b")(x.asInstanceOf[js.Any])
        }
      }
    }
  }
  
  @scala.inline
  def StartTest_(testScript: js.Function1[/* t */ ITest, Unit]): Unit = js.Dynamic.global.applyDynamic("StartTest")(testScript.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* was `typeof StartTest` */
  @scala.inline
  def describe(testScript: js.Function1[/* t */ ITest, Unit]): Unit = js.Dynamic.global.applyDynamic("describe")(testScript.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* was `typeof StartTest` */
  @scala.inline
  def startTest(testScript: js.Function1[/* t */ ITest, Unit]): Unit = js.Dynamic.global.applyDynamic("startTest")(testScript.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
