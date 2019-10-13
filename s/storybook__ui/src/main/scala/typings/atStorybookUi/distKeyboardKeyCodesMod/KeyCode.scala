package typings.atStorybookUi.distKeyboardKeyCodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyCode extends js.Object

@JSImport("@storybook/ui/dist/keyboard/keyCodes", "KeyCode")
@js.native
object KeyCode extends js.Object {
  @js.native
  sealed trait ABNT_C1 extends KeyCode
  
  @js.native
  sealed trait ABNT_C2 extends KeyCode
  
  @js.native
  sealed trait Alt extends KeyCode
  
  @js.native
  sealed trait Backspace extends KeyCode
  
  @js.native
  sealed trait CapsLock extends KeyCode
  
  @js.native
  sealed trait ContextMenu extends KeyCode
  
  @js.native
  sealed trait Ctrl extends KeyCode
  
  @js.native
  sealed trait Delete extends KeyCode
  
  @js.native
  sealed trait DownArrow extends KeyCode
  
  @js.native
  sealed trait End extends KeyCode
  
  @js.native
  sealed trait Enter extends KeyCode
  
  @js.native
  sealed trait Escape extends KeyCode
  
  @js.native
  sealed trait F1 extends KeyCode
  
  @js.native
  sealed trait F10 extends KeyCode
  
  @js.native
  sealed trait F11 extends KeyCode
  
  @js.native
  sealed trait F12 extends KeyCode
  
  @js.native
  sealed trait F13 extends KeyCode
  
  @js.native
  sealed trait F14 extends KeyCode
  
  @js.native
  sealed trait F15 extends KeyCode
  
  @js.native
  sealed trait F16 extends KeyCode
  
  @js.native
  sealed trait F17 extends KeyCode
  
  @js.native
  sealed trait F18 extends KeyCode
  
  @js.native
  sealed trait F19 extends KeyCode
  
  @js.native
  sealed trait F2 extends KeyCode
  
  @js.native
  sealed trait F3 extends KeyCode
  
  @js.native
  sealed trait F4 extends KeyCode
  
  @js.native
  sealed trait F5 extends KeyCode
  
  @js.native
  sealed trait F6 extends KeyCode
  
  @js.native
  sealed trait F7 extends KeyCode
  
  @js.native
  sealed trait F8 extends KeyCode
  
  @js.native
  sealed trait F9 extends KeyCode
  
  @js.native
  sealed trait Home extends KeyCode
  
  @js.native
  sealed trait Insert extends KeyCode
  
  @js.native
  sealed trait KEY_0 extends KeyCode
  
  @js.native
  sealed trait KEY_1 extends KeyCode
  
  @js.native
  sealed trait KEY_2 extends KeyCode
  
  @js.native
  sealed trait KEY_3 extends KeyCode
  
  @js.native
  sealed trait KEY_4 extends KeyCode
  
  @js.native
  sealed trait KEY_5 extends KeyCode
  
  @js.native
  sealed trait KEY_6 extends KeyCode
  
  @js.native
  sealed trait KEY_7 extends KeyCode
  
  @js.native
  sealed trait KEY_8 extends KeyCode
  
  @js.native
  sealed trait KEY_9 extends KeyCode
  
  @js.native
  sealed trait KEY_A extends KeyCode
  
  @js.native
  sealed trait KEY_B extends KeyCode
  
  @js.native
  sealed trait KEY_C extends KeyCode
  
  @js.native
  sealed trait KEY_D extends KeyCode
  
  @js.native
  sealed trait KEY_E extends KeyCode
  
  @js.native
  sealed trait KEY_F extends KeyCode
  
  @js.native
  sealed trait KEY_G extends KeyCode
  
  @js.native
  sealed trait KEY_H extends KeyCode
  
  @js.native
  sealed trait KEY_I extends KeyCode
  
  /**
    * Cover all key codes when IME is processing input.
    */
  @js.native
  sealed trait KEY_IN_COMPOSITION extends KeyCode
  
  @js.native
  sealed trait KEY_J extends KeyCode
  
  @js.native
  sealed trait KEY_K extends KeyCode
  
  @js.native
  sealed trait KEY_L extends KeyCode
  
  @js.native
  sealed trait KEY_M extends KeyCode
  
  @js.native
  sealed trait KEY_N extends KeyCode
  
  @js.native
  sealed trait KEY_O extends KeyCode
  
  @js.native
  sealed trait KEY_P extends KeyCode
  
  @js.native
  sealed trait KEY_Q extends KeyCode
  
  @js.native
  sealed trait KEY_R extends KeyCode
  
  @js.native
  sealed trait KEY_S extends KeyCode
  
  @js.native
  sealed trait KEY_T extends KeyCode
  
  @js.native
  sealed trait KEY_U extends KeyCode
  
  @js.native
  sealed trait KEY_V extends KeyCode
  
  @js.native
  sealed trait KEY_W extends KeyCode
  
  @js.native
  sealed trait KEY_X extends KeyCode
  
  @js.native
  sealed trait KEY_Y extends KeyCode
  
  @js.native
  sealed trait KEY_Z extends KeyCode
  
  @js.native
  sealed trait LeftArrow extends KeyCode
  
  /**
    * Placed last to cover the length of the enum.
    * Please do not depend on this value!
    */
  @js.native
  sealed trait MAX_VALUE extends KeyCode
  
  @js.native
  sealed trait Meta extends KeyCode
  
  @js.native
  sealed trait NUMPAD_0 extends KeyCode
  
  @js.native
  sealed trait NUMPAD_1 extends KeyCode
  
  @js.native
  sealed trait NUMPAD_2 extends KeyCode
  
  @js.native
  sealed trait NUMPAD_3 extends KeyCode
  
  @js.native
  sealed trait NUMPAD_4 extends KeyCode
  
  @js.native
  sealed trait NUMPAD_5 extends KeyCode
  
  @js.native
  sealed trait NUMPAD_6 extends KeyCode
  
  @js.native
  sealed trait NUMPAD_7 extends KeyCode
  
  @js.native
  sealed trait NUMPAD_8 extends KeyCode
  
  @js.native
  sealed trait NUMPAD_9 extends KeyCode
  
  @js.native
  sealed trait NUMPAD_ADD extends KeyCode
  
  @js.native
  sealed trait NUMPAD_DECIMAL extends KeyCode
  
  @js.native
  sealed trait NUMPAD_DIVIDE extends KeyCode
  
  @js.native
  sealed trait NUMPAD_MULTIPLY extends KeyCode
  
  @js.native
  sealed trait NUMPAD_SEPARATOR extends KeyCode
  
  @js.native
  sealed trait NUMPAD_SUBTRACT extends KeyCode
  
  @js.native
  sealed trait NumLock extends KeyCode
  
  /**
    * Either the angle bracket key or the backslash key on the RT 102-key keyboard.
    */
  @js.native
  sealed trait OEM_102 extends KeyCode
  
  /**
    * Used for miscellaneous characters; it can vary by keyboard.
    */
  @js.native
  sealed trait OEM_8 extends KeyCode
  
  @js.native
  sealed trait PageDown extends KeyCode
  
  @js.native
  sealed trait PageUp extends KeyCode
  
  @js.native
  sealed trait PauseBreak extends KeyCode
  
  @js.native
  sealed trait RightArrow extends KeyCode
  
  @js.native
  sealed trait ScrollLock extends KeyCode
  
  @js.native
  sealed trait Shift extends KeyCode
  
  @js.native
  sealed trait Space extends KeyCode
  
  @js.native
  sealed trait Tab extends KeyCode
  
  /**
    * Used for miscellaneous characters; it can vary by keyboard.
    * For the US standard keyboard, the '\|' key
    */
  @js.native
  sealed trait US_BACKSLASH extends KeyCode
  
  /**
    * Used for miscellaneous characters; it can vary by keyboard.
    * For the US standard keyboard, the '`~' key
    */
  @js.native
  sealed trait US_BACKTICK extends KeyCode
  
  /**
    * Used for miscellaneous characters; it can vary by keyboard.
    * For the US standard keyboard, the ']}' key
    */
  @js.native
  sealed trait US_CLOSE_SQUARE_BRACKET extends KeyCode
  
  /**
    * For any country/region, the ',' key
    * For the US standard keyboard, the ',<' key
    */
  @js.native
  sealed trait US_COMMA extends KeyCode
  
  /**
    * For any country/region, the '.' key
    * For the US standard keyboard, the '.>' key
    */
  @js.native
  sealed trait US_DOT extends KeyCode
  
  /**
    * For any country/region, the '+' key
    * For the US standard keyboard, the '=+' key
    */
  @js.native
  sealed trait US_EQUAL extends KeyCode
  
  /**
    * For any country/region, the '-' key
    * For the US standard keyboard, the '-_' key
    */
  @js.native
  sealed trait US_MINUS extends KeyCode
  
  /**
    * Used for miscellaneous characters; it can vary by keyboard.
    * For the US standard keyboard, the '[{' key
    */
  @js.native
  sealed trait US_OPEN_SQUARE_BRACKET extends KeyCode
  
  /**
    * Used for miscellaneous characters; it can vary by keyboard.
    * For the US standard keyboard, the ''"' key
    */
  @js.native
  sealed trait US_QUOTE extends KeyCode
  
  /**
    * Used for various key characters that can vary by keyboard
    */
  /**
    * Used for miscellaneous characters; it can vary by keyboard.
    * For the US standard keyboard, the ';:' key
    */
  @js.native
  sealed trait US_SEMICOLON extends KeyCode
  
  /**
    * Used for miscellaneous characters; it can vary by keyboard.
    * For the US standard keyboard, the '/?' key
    */
  @js.native
  sealed trait US_SLASH extends KeyCode
  
  @js.native
  sealed trait Unknown extends KeyCode
  
  @js.native
  sealed trait UpArrow extends KeyCode
  
  /* 110 */ val ABNT_C1: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.ABNT_C1 with Double = js.native
  /* 111 */ val ABNT_C2: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.ABNT_C2 with Double = js.native
  /* 6 */ val Alt: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.Alt with Double = js.native
  /* 1 */ val Backspace: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.Backspace with Double = js.native
  /* 7 */ val CapsLock: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.CapsLock with Double = js.native
  /* 58 */ val ContextMenu: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.ContextMenu with Double = js.native
  /* 5 */ val Ctrl: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.Ctrl with Double = js.native
  /* 20 */ val Delete: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.Delete with Double = js.native
  /* 18 */ val DownArrow: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.DownArrow with Double = js.native
  /* 13 */ val End: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.End with Double = js.native
  /* 3 */ val Enter: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.Enter with Double = js.native
  /* 9 */ val Escape: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.Escape with Double = js.native
  /* 59 */ val F1: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F1 with Double = js.native
  /* 68 */ val F10: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F10 with Double = js.native
  /* 69 */ val F11: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F11 with Double = js.native
  /* 70 */ val F12: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F12 with Double = js.native
  /* 71 */ val F13: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F13 with Double = js.native
  /* 72 */ val F14: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F14 with Double = js.native
  /* 73 */ val F15: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F15 with Double = js.native
  /* 74 */ val F16: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F16 with Double = js.native
  /* 75 */ val F17: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F17 with Double = js.native
  /* 76 */ val F18: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F18 with Double = js.native
  /* 77 */ val F19: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F19 with Double = js.native
  /* 60 */ val F2: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F2 with Double = js.native
  /* 61 */ val F3: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F3 with Double = js.native
  /* 62 */ val F4: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F4 with Double = js.native
  /* 63 */ val F5: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F5 with Double = js.native
  /* 64 */ val F6: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F6 with Double = js.native
  /* 65 */ val F7: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F7 with Double = js.native
  /* 66 */ val F8: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F8 with Double = js.native
  /* 67 */ val F9: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.F9 with Double = js.native
  /* 14 */ val Home: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.Home with Double = js.native
  /* 19 */ val Insert: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.Insert with Double = js.native
  /* 21 */ val KEY_0: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_0 with Double = js.native
  /* 22 */ val KEY_1: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_1 with Double = js.native
  /* 23 */ val KEY_2: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_2 with Double = js.native
  /* 24 */ val KEY_3: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_3 with Double = js.native
  /* 25 */ val KEY_4: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_4 with Double = js.native
  /* 26 */ val KEY_5: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_5 with Double = js.native
  /* 27 */ val KEY_6: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_6 with Double = js.native
  /* 28 */ val KEY_7: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_7 with Double = js.native
  /* 29 */ val KEY_8: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_8 with Double = js.native
  /* 30 */ val KEY_9: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_9 with Double = js.native
  /* 31 */ val KEY_A: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_A with Double = js.native
  /* 32 */ val KEY_B: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_B with Double = js.native
  /* 33 */ val KEY_C: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_C with Double = js.native
  /* 34 */ val KEY_D: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_D with Double = js.native
  /* 35 */ val KEY_E: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_E with Double = js.native
  /* 36 */ val KEY_F: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_F with Double = js.native
  /* 37 */ val KEY_G: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_G with Double = js.native
  /* 38 */ val KEY_H: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_H with Double = js.native
  /* 39 */ val KEY_I: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_I with Double = js.native
  /* 109 */ val KEY_IN_COMPOSITION: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_IN_COMPOSITION with Double = js.native
  /* 40 */ val KEY_J: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_J with Double = js.native
  /* 41 */ val KEY_K: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_K with Double = js.native
  /* 42 */ val KEY_L: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_L with Double = js.native
  /* 43 */ val KEY_M: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_M with Double = js.native
  /* 44 */ val KEY_N: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_N with Double = js.native
  /* 45 */ val KEY_O: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_O with Double = js.native
  /* 46 */ val KEY_P: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_P with Double = js.native
  /* 47 */ val KEY_Q: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_Q with Double = js.native
  /* 48 */ val KEY_R: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_R with Double = js.native
  /* 49 */ val KEY_S: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_S with Double = js.native
  /* 50 */ val KEY_T: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_T with Double = js.native
  /* 51 */ val KEY_U: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_U with Double = js.native
  /* 52 */ val KEY_V: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_V with Double = js.native
  /* 53 */ val KEY_W: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_W with Double = js.native
  /* 54 */ val KEY_X: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_X with Double = js.native
  /* 55 */ val KEY_Y: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_Y with Double = js.native
  /* 56 */ val KEY_Z: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.KEY_Z with Double = js.native
  /* 15 */ val LeftArrow: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.LeftArrow with Double = js.native
  /* 112 */ val MAX_VALUE: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.MAX_VALUE with Double = js.native
  /* 57 */ val Meta: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.Meta with Double = js.native
  /* 93 */ val NUMPAD_0: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.NUMPAD_0 with Double = js.native
  /* 94 */ val NUMPAD_1: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.NUMPAD_1 with Double = js.native
  /* 95 */ val NUMPAD_2: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.NUMPAD_2 with Double = js.native
  /* 96 */ val NUMPAD_3: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.NUMPAD_3 with Double = js.native
  /* 97 */ val NUMPAD_4: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.NUMPAD_4 with Double = js.native
  /* 98 */ val NUMPAD_5: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.NUMPAD_5 with Double = js.native
  /* 99 */ val NUMPAD_6: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.NUMPAD_6 with Double = js.native
  /* 100 */ val NUMPAD_7: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.NUMPAD_7 with Double = js.native
  /* 101 */ val NUMPAD_8: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.NUMPAD_8 with Double = js.native
  /* 102 */ val NUMPAD_9: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.NUMPAD_9 with Double = js.native
  /* 104 */ val NUMPAD_ADD: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.NUMPAD_ADD with Double = js.native
  /* 107 */ val NUMPAD_DECIMAL: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.NUMPAD_DECIMAL with Double = js.native
  /* 108 */ val NUMPAD_DIVIDE: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.NUMPAD_DIVIDE with Double = js.native
  /* 103 */ val NUMPAD_MULTIPLY: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.NUMPAD_MULTIPLY with Double = js.native
  /* 105 */ val NUMPAD_SEPARATOR: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.NUMPAD_SEPARATOR with Double = js.native
  /* 106 */ val NUMPAD_SUBTRACT: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.NUMPAD_SUBTRACT with Double = js.native
  /* 78 */ val NumLock: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.NumLock with Double = js.native
  /* 92 */ val OEM_102: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.OEM_102 with Double = js.native
  /* 91 */ val OEM_8: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.OEM_8 with Double = js.native
  /* 12 */ val PageDown: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.PageDown with Double = js.native
  /* 11 */ val PageUp: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.PageUp with Double = js.native
  /* 7 */ val PauseBreak: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.PauseBreak with Double = js.native
  /* 17 */ val RightArrow: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.RightArrow with Double = js.native
  /* 79 */ val ScrollLock: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.ScrollLock with Double = js.native
  /* 4 */ val Shift: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.Shift with Double = js.native
  /* 10 */ val Space: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.Space with Double = js.native
  /* 2 */ val Tab: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.Tab with Double = js.native
  /* 88 */ val US_BACKSLASH: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.US_BACKSLASH with Double = js.native
  /* 86 */ val US_BACKTICK: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.US_BACKTICK with Double = js.native
  /* 89 */ val US_CLOSE_SQUARE_BRACKET: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.US_CLOSE_SQUARE_BRACKET with Double = js.native
  /* 82 */ val US_COMMA: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.US_COMMA with Double = js.native
  /* 84 */ val US_DOT: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.US_DOT with Double = js.native
  /* 81 */ val US_EQUAL: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.US_EQUAL with Double = js.native
  /* 83 */ val US_MINUS: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.US_MINUS with Double = js.native
  /* 87 */ val US_OPEN_SQUARE_BRACKET: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.US_OPEN_SQUARE_BRACKET with Double = js.native
  /* 90 */ val US_QUOTE: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.US_QUOTE with Double = js.native
  /* 80 */ val US_SEMICOLON: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.US_SEMICOLON with Double = js.native
  /* 85 */ val US_SLASH: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.US_SLASH with Double = js.native
  /* 0 */ val Unknown: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.Unknown with Double = js.native
  /* 16 */ val UpArrow: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyCode.UpArrow with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyCode with Double] = js.native
}

