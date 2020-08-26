package typings.seleniumWebdriver.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKey extends js.Object {
  var ADD: String = js.native
  var ALT: String = js.native
  var ARROW_DOWN: String = js.native
  var ARROW_LEFT: String = js.native
  var ARROW_RIGHT: String = js.native
  var ARROW_UP: String = js.native
  var BACK_SPACE: String = js.native
  var CANCEL: String = js.native
  var CLEAR: String = js.native
  var COMMAND: String = js.native
  var CONTROL: String = js.native
  var DECIMAL: String = js.native
  var DELETE: String = js.native
  var DIVIDE: String = js.native
  var DOWN: String = js.native
  var END: String = js.native
  var ENTER: String = js.native
  var EQUALS: String = js.native
  var ESCAPE: String = js.native
  var F1: String = js.native
  var F10: String = js.native
  var F11: String = js.native
  var F12: String = js.native
    // function keys
  var F2: String = js.native
  var F3: String = js.native
  var F4: String = js.native
  var F5: String = js.native
  var F6: String = js.native
  var F7: String = js.native
  var F8: String = js.native
  var F9: String = js.native
    // ^break
  var HELP: String = js.native
  var HOME: String = js.native
  var INSERT: String = js.native
  var LEFT: String = js.native
    // Apple command key
  var META: String = js.native
  var MULTIPLY: String = js.native
  var NULL: String = js.native
  var NUMPAD0: String = js.native
    // number pad keys
  var NUMPAD1: String = js.native
  var NUMPAD2: String = js.native
  var NUMPAD3: String = js.native
  var NUMPAD4: String = js.native
  var NUMPAD5: String = js.native
  var NUMPAD6: String = js.native
  var NUMPAD7: String = js.native
  var NUMPAD8: String = js.native
  var NUMPAD9: String = js.native
  var PAGE_DOWN: String = js.native
  var PAGE_UP: String = js.native
  var PAUSE: String = js.native
  var RETURN: String = js.native
  var RIGHT: String = js.native
  var SEMICOLON: String = js.native
  var SEPARATOR: String = js.native
  var SHIFT: String = js.native
  var SPACE: String = js.native
  var SUBTRACT: String = js.native
  var TAB: String = js.native
  var UP: String = js.native
       // alias for Windows key
  /**
    * Simulate pressing many keys at once in a 'chord'. Takes a sequence of
    * keys or strings, appends each of the values to a string,
    * and adds the chord termination key ({@link Key.NULL}) and returns
    * the resulting string.
    *
    * Note: when the low-level webdriver key handlers see Keys.NULL, active
    * modifier keys (CTRL/ALT/SHIFT/etc) release via a keyup event.
    *
    * @param {...string} var_args The key sequence to concatenate.
    * @return {string} The null-terminated key sequence.
    */
  def chord(var_args: (String | IKey)*): String = js.native
}

object IKey {
  @scala.inline
  def apply(
    ADD: String,
    ALT: String,
    ARROW_DOWN: String,
    ARROW_LEFT: String,
    ARROW_RIGHT: String,
    ARROW_UP: String,
    BACK_SPACE: String,
    CANCEL: String,
    CLEAR: String,
    COMMAND: String,
    CONTROL: String,
    DECIMAL: String,
    DELETE: String,
    DIVIDE: String,
    DOWN: String,
    END: String,
    ENTER: String,
    EQUALS: String,
    ESCAPE: String,
    F1: String,
    F10: String,
    F11: String,
    F12: String,
    F2: String,
    F3: String,
    F4: String,
    F5: String,
    F6: String,
    F7: String,
    F8: String,
    F9: String,
    HELP: String,
    HOME: String,
    INSERT: String,
    LEFT: String,
    META: String,
    MULTIPLY: String,
    NULL: String,
    NUMPAD0: String,
    NUMPAD1: String,
    NUMPAD2: String,
    NUMPAD3: String,
    NUMPAD4: String,
    NUMPAD5: String,
    NUMPAD6: String,
    NUMPAD7: String,
    NUMPAD8: String,
    NUMPAD9: String,
    PAGE_DOWN: String,
    PAGE_UP: String,
    PAUSE: String,
    RETURN: String,
    RIGHT: String,
    SEMICOLON: String,
    SEPARATOR: String,
    SHIFT: String,
    SPACE: String,
    SUBTRACT: String,
    TAB: String,
    UP: String,
    chord: /* repeated */ String | IKey => String
  ): IKey = {
    val __obj = js.Dynamic.literal(ADD = ADD.asInstanceOf[js.Any], ALT = ALT.asInstanceOf[js.Any], ARROW_DOWN = ARROW_DOWN.asInstanceOf[js.Any], ARROW_LEFT = ARROW_LEFT.asInstanceOf[js.Any], ARROW_RIGHT = ARROW_RIGHT.asInstanceOf[js.Any], ARROW_UP = ARROW_UP.asInstanceOf[js.Any], BACK_SPACE = BACK_SPACE.asInstanceOf[js.Any], CANCEL = CANCEL.asInstanceOf[js.Any], CLEAR = CLEAR.asInstanceOf[js.Any], COMMAND = COMMAND.asInstanceOf[js.Any], CONTROL = CONTROL.asInstanceOf[js.Any], DECIMAL = DECIMAL.asInstanceOf[js.Any], DELETE = DELETE.asInstanceOf[js.Any], DIVIDE = DIVIDE.asInstanceOf[js.Any], DOWN = DOWN.asInstanceOf[js.Any], END = END.asInstanceOf[js.Any], ENTER = ENTER.asInstanceOf[js.Any], EQUALS = EQUALS.asInstanceOf[js.Any], ESCAPE = ESCAPE.asInstanceOf[js.Any], F1 = F1.asInstanceOf[js.Any], F10 = F10.asInstanceOf[js.Any], F11 = F11.asInstanceOf[js.Any], F12 = F12.asInstanceOf[js.Any], F2 = F2.asInstanceOf[js.Any], F3 = F3.asInstanceOf[js.Any], F4 = F4.asInstanceOf[js.Any], F5 = F5.asInstanceOf[js.Any], F6 = F6.asInstanceOf[js.Any], F7 = F7.asInstanceOf[js.Any], F8 = F8.asInstanceOf[js.Any], F9 = F9.asInstanceOf[js.Any], HELP = HELP.asInstanceOf[js.Any], HOME = HOME.asInstanceOf[js.Any], INSERT = INSERT.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], META = META.asInstanceOf[js.Any], MULTIPLY = MULTIPLY.asInstanceOf[js.Any], NULL = NULL.asInstanceOf[js.Any], NUMPAD0 = NUMPAD0.asInstanceOf[js.Any], NUMPAD1 = NUMPAD1.asInstanceOf[js.Any], NUMPAD2 = NUMPAD2.asInstanceOf[js.Any], NUMPAD3 = NUMPAD3.asInstanceOf[js.Any], NUMPAD4 = NUMPAD4.asInstanceOf[js.Any], NUMPAD5 = NUMPAD5.asInstanceOf[js.Any], NUMPAD6 = NUMPAD6.asInstanceOf[js.Any], NUMPAD7 = NUMPAD7.asInstanceOf[js.Any], NUMPAD8 = NUMPAD8.asInstanceOf[js.Any], NUMPAD9 = NUMPAD9.asInstanceOf[js.Any], PAGE_DOWN = PAGE_DOWN.asInstanceOf[js.Any], PAGE_UP = PAGE_UP.asInstanceOf[js.Any], PAUSE = PAUSE.asInstanceOf[js.Any], RETURN = RETURN.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], SEMICOLON = SEMICOLON.asInstanceOf[js.Any], SEPARATOR = SEPARATOR.asInstanceOf[js.Any], SHIFT = SHIFT.asInstanceOf[js.Any], SPACE = SPACE.asInstanceOf[js.Any], SUBTRACT = SUBTRACT.asInstanceOf[js.Any], TAB = TAB.asInstanceOf[js.Any], UP = UP.asInstanceOf[js.Any], chord = js.Any.fromFunction1(chord))
    __obj.asInstanceOf[IKey]
  }
  @scala.inline
  implicit class IKeyOps[Self <: IKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setADD(value: String): Self = this.set("ADD", value.asInstanceOf[js.Any])
    @scala.inline
    def setALT(value: String): Self = this.set("ALT", value.asInstanceOf[js.Any])
    @scala.inline
    def setARROW_DOWN(value: String): Self = this.set("ARROW_DOWN", value.asInstanceOf[js.Any])
    @scala.inline
    def setARROW_LEFT(value: String): Self = this.set("ARROW_LEFT", value.asInstanceOf[js.Any])
    @scala.inline
    def setARROW_RIGHT(value: String): Self = this.set("ARROW_RIGHT", value.asInstanceOf[js.Any])
    @scala.inline
    def setARROW_UP(value: String): Self = this.set("ARROW_UP", value.asInstanceOf[js.Any])
    @scala.inline
    def setBACK_SPACE(value: String): Self = this.set("BACK_SPACE", value.asInstanceOf[js.Any])
    @scala.inline
    def setCANCEL(value: String): Self = this.set("CANCEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLEAR(value: String): Self = this.set("CLEAR", value.asInstanceOf[js.Any])
    @scala.inline
    def setCOMMAND(value: String): Self = this.set("COMMAND", value.asInstanceOf[js.Any])
    @scala.inline
    def setCONTROL(value: String): Self = this.set("CONTROL", value.asInstanceOf[js.Any])
    @scala.inline
    def setDECIMAL(value: String): Self = this.set("DECIMAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setDELETE(value: String): Self = this.set("DELETE", value.asInstanceOf[js.Any])
    @scala.inline
    def setDIVIDE(value: String): Self = this.set("DIVIDE", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOWN(value: String): Self = this.set("DOWN", value.asInstanceOf[js.Any])
    @scala.inline
    def setEND(value: String): Self = this.set("END", value.asInstanceOf[js.Any])
    @scala.inline
    def setENTER(value: String): Self = this.set("ENTER", value.asInstanceOf[js.Any])
    @scala.inline
    def setEQUALS(value: String): Self = this.set("EQUALS", value.asInstanceOf[js.Any])
    @scala.inline
    def setESCAPE(value: String): Self = this.set("ESCAPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setF1(value: String): Self = this.set("F1", value.asInstanceOf[js.Any])
    @scala.inline
    def setF10(value: String): Self = this.set("F10", value.asInstanceOf[js.Any])
    @scala.inline
    def setF11(value: String): Self = this.set("F11", value.asInstanceOf[js.Any])
    @scala.inline
    def setF12(value: String): Self = this.set("F12", value.asInstanceOf[js.Any])
    @scala.inline
    def setF2(value: String): Self = this.set("F2", value.asInstanceOf[js.Any])
    @scala.inline
    def setF3(value: String): Self = this.set("F3", value.asInstanceOf[js.Any])
    @scala.inline
    def setF4(value: String): Self = this.set("F4", value.asInstanceOf[js.Any])
    @scala.inline
    def setF5(value: String): Self = this.set("F5", value.asInstanceOf[js.Any])
    @scala.inline
    def setF6(value: String): Self = this.set("F6", value.asInstanceOf[js.Any])
    @scala.inline
    def setF7(value: String): Self = this.set("F7", value.asInstanceOf[js.Any])
    @scala.inline
    def setF8(value: String): Self = this.set("F8", value.asInstanceOf[js.Any])
    @scala.inline
    def setF9(value: String): Self = this.set("F9", value.asInstanceOf[js.Any])
    @scala.inline
    def setHELP(value: String): Self = this.set("HELP", value.asInstanceOf[js.Any])
    @scala.inline
    def setHOME(value: String): Self = this.set("HOME", value.asInstanceOf[js.Any])
    @scala.inline
    def setINSERT(value: String): Self = this.set("INSERT", value.asInstanceOf[js.Any])
    @scala.inline
    def setLEFT(value: String): Self = this.set("LEFT", value.asInstanceOf[js.Any])
    @scala.inline
    def setMETA(value: String): Self = this.set("META", value.asInstanceOf[js.Any])
    @scala.inline
    def setMULTIPLY(value: String): Self = this.set("MULTIPLY", value.asInstanceOf[js.Any])
    @scala.inline
    def setNULL(value: String): Self = this.set("NULL", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMPAD0(value: String): Self = this.set("NUMPAD0", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMPAD1(value: String): Self = this.set("NUMPAD1", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMPAD2(value: String): Self = this.set("NUMPAD2", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMPAD3(value: String): Self = this.set("NUMPAD3", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMPAD4(value: String): Self = this.set("NUMPAD4", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMPAD5(value: String): Self = this.set("NUMPAD5", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMPAD6(value: String): Self = this.set("NUMPAD6", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMPAD7(value: String): Self = this.set("NUMPAD7", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMPAD8(value: String): Self = this.set("NUMPAD8", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUMPAD9(value: String): Self = this.set("NUMPAD9", value.asInstanceOf[js.Any])
    @scala.inline
    def setPAGE_DOWN(value: String): Self = this.set("PAGE_DOWN", value.asInstanceOf[js.Any])
    @scala.inline
    def setPAGE_UP(value: String): Self = this.set("PAGE_UP", value.asInstanceOf[js.Any])
    @scala.inline
    def setPAUSE(value: String): Self = this.set("PAUSE", value.asInstanceOf[js.Any])
    @scala.inline
    def setRETURN(value: String): Self = this.set("RETURN", value.asInstanceOf[js.Any])
    @scala.inline
    def setRIGHT(value: String): Self = this.set("RIGHT", value.asInstanceOf[js.Any])
    @scala.inline
    def setSEMICOLON(value: String): Self = this.set("SEMICOLON", value.asInstanceOf[js.Any])
    @scala.inline
    def setSEPARATOR(value: String): Self = this.set("SEPARATOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHIFT(value: String): Self = this.set("SHIFT", value.asInstanceOf[js.Any])
    @scala.inline
    def setSPACE(value: String): Self = this.set("SPACE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSUBTRACT(value: String): Self = this.set("SUBTRACT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTAB(value: String): Self = this.set("TAB", value.asInstanceOf[js.Any])
    @scala.inline
    def setUP(value: String): Self = this.set("UP", value.asInstanceOf[js.Any])
    @scala.inline
    def setChord(value: /* repeated */ String | IKey => String): Self = this.set("chord", js.Any.fromFunction1(value))
  }
  
}

