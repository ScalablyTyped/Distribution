package typings.siesta.Siesta.Test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Siesta.Test.Simulate")
@js.native
object Simulate extends js.Object {
  /**
    * @mixin
    */
  @js.native
  trait IEvent extends js.Object {
    var simulateEventsWith: String = js.native
    def simulateEvent(el: js.Any, `type`: String): Unit = js.native
    def simulateEvent(el: js.Any, `type`: String, the: js.Any): Unit = js.native
    def simulateEvent(el: js.Any, `type`: String, the: js.Any, suppressLog: Boolean): Unit = js.native
  }
  
  /**
    * @mixin
    */
  @js.native
  trait IKeyboard extends js.Object {
    def keyPress(el: js.Any, key: String, options: js.Any): Unit = js.native
    def `type`(el: js.Any, text: String): Unit = js.native
    def `type`(el: js.Any, text: String, callback: js.Function): Unit = js.native
    def `type`(el: js.Any, text: String, callback: js.Function, scope: js.Any): Unit = js.native
    def `type`(el: js.Any, text: String, callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
  }
  
  /**
    * @mixin
    */
  @js.native
  trait IMouse extends js.Object {
    var dragDelay: Double = js.native
    var dragPrecision: Double = js.native
    var moveCursorBetweenPoints: Boolean = js.native
    def click(): Unit = js.native
    def click(callback: js.Function): Unit = js.native
    def click(callback: js.Function, scope: js.Any): Unit = js.native
    def click(callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
    def click(el: js.Any): Unit = js.native
    def click(el: js.Any, callback: js.Function): Unit = js.native
    def click(el: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
    def click(el: js.Any, callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
    def doubleClick(): Unit = js.native
    def doubleClick(callback: js.Function): Unit = js.native
    def doubleClick(callback: js.Function, scope: js.Any): Unit = js.native
    def doubleClick(callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
    def doubleClick(el: js.Any): Unit = js.native
    def doubleClick(el: js.Any, callback: js.Function): Unit = js.native
    def doubleClick(el: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
    def doubleClick(el: js.Any, callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
    def drag(source: js.Any): Unit = js.native
    def drag(source: js.Any, target: js.Any): Unit = js.native
    def drag(source: js.Any, target: js.Any, delta: js.Array[Double]): Unit = js.native
    def drag(source: js.Any, target: js.Any, delta: js.Array[Double], callback: js.Function): Unit = js.native
    def drag(source: js.Any, target: js.Any, delta: js.Array[Double], callback: js.Function, scope: js.Any): Unit = js.native
    def drag(
      source: js.Any,
      target: js.Any,
      delta: js.Array[Double],
      callback: js.Function,
      scope: js.Any,
      options: js.Any
    ): Unit = js.native
    def dragBy(source: js.Any, delta: js.Array[Double]): Unit = js.native
    def dragBy(source: js.Any, delta: js.Array[Double], callback: js.Function): Unit = js.native
    def dragBy(source: js.Any, delta: js.Array[Double], callback: js.Function, scope: js.Any): Unit = js.native
    def dragBy(source: js.Any, delta: js.Array[Double], callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
    def dragBy(
      source: js.Any,
      delta: js.Array[Double],
      callback: js.Function,
      scope: js.Any,
      options: js.Any,
      dragOnly: Boolean
    ): Unit = js.native
    def dragTo(source: js.Any, target: js.Any): Unit = js.native
    def dragTo(source: js.Any, target: js.Any, callback: js.Function): Unit = js.native
    def dragTo(source: js.Any, target: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
    def dragTo(source: js.Any, target: js.Any, callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
    def dragTo(
      source: js.Any,
      target: js.Any,
      callback: js.Function,
      scope: js.Any,
      options: js.Any,
      dragOnly: Boolean
    ): Unit = js.native
    def mouseDown(el: js.Any, options: js.Any): Unit = js.native
    def mouseOut(el: js.Any, options: js.Any): Unit = js.native
    def mouseOver(el: js.Any, options: js.Any): Unit = js.native
    def mouseUp(el: js.Any, options: js.Any): Unit = js.native
    def moveCursorBy(delta: js.Array[Double]): Unit = js.native
    def moveCursorBy(delta: js.Array[Double], callback: js.Function): Unit = js.native
    def moveCursorBy(delta: js.Array[Double], callback: js.Function, scope: js.Any): Unit = js.native
    def moveCursorTo(): Unit = js.native
    def moveCursorTo(target: js.Any): Unit = js.native
    def moveCursorTo(target: js.Any, callback: js.Function): Unit = js.native
    def moveCursorTo(target: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
    def moveMouseBy(delta: js.Array[Double]): Unit = js.native
    def moveMouseBy(delta: js.Array[Double], callback: js.Function): Unit = js.native
    def moveMouseBy(delta: js.Array[Double], callback: js.Function, scope: js.Any): Unit = js.native
    def moveMouseTo(): Unit = js.native
    def moveMouseTo(target: js.Any): Unit = js.native
    def moveMouseTo(target: js.Any, callback: js.Function): Unit = js.native
    def moveMouseTo(target: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
    def rightClick(): Unit = js.native
    def rightClick(callback: js.Function): Unit = js.native
    def rightClick(callback: js.Function, scope: js.Any): Unit = js.native
    def rightClick(callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
    def rightClick(el: js.Any): Unit = js.native
    def rightClick(el: js.Any, callback: js.Function): Unit = js.native
    def rightClick(el: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
    def rightClick(el: js.Any, callback: js.Function, scope: js.Any, options: js.Any): Unit = js.native
  }
  
  // NOTE https://github.com/DefinitelyTyped/DefinitelyTyped/pull/3135
  @js.native
  object KeyCodes extends js.Object {
     // = 32,
    var `0`: Double = js.native
     // = 48,
    var `1`: Double = js.native
     // = 49,
    var `2`: Double = js.native
     // = 50,
    var `3`: Double = js.native
     // = 51,
    var `4`: Double = js.native
     // = 52,
    var `5`: Double = js.native
     // = 53,
    var `6`: Double = js.native
     // = 54,
    var `7`: Double = js.native
     // = 55,
    var `8`: Double = js.native
     // = 56,
    var `9`: Double = js.native
     // = 57,
    var A: Double = js.native
     // = 17,
    var ALT: Double = js.native
     // = 221,
    @JSName("'")
    var Apostrophe: Double = js.native
     // = 65,
    var B: Double = js.native
     // = 8,
    var BACKSPACE: Double = js.native
     // = 219,
    @JSName("\\")
    var Backslash: Double = js.native
    @JSName("\b")
    var Backspace: Double = js.native
     // = 66,
    var C: Double = js.native
     // = 19,
    var CAPS: Double = js.native
     // = 16,
    var CTRL: Double = js.native
     // = 9,
    @JSName("\r")
    var Carriagereturn: Double = js.native
     // = 8,
    @JSName("\t")
    var Charactertabulation: Double = js.native
     // = 187,
    @JSName(",")
    var Comma: Double = js.native
     // = 67,
    var D: Double = js.native
     // = 45,
    var DELETE: Double = js.native
     // = 39,
    var DOWN: Double = js.native
     // = 189,
    @JSName(".")
    var Dot: Double = js.native
     // = 68,
    var E: Double = js.native
     // = 34,
    var END: Double = js.native
     // = 13,
    var ENTER: Double = js.native
     // = 20,
    var ESCAPE: Double = js.native
     // = 186,
    @JSName("=")
    var Equalssign: Double = js.native
     // = 69,
    var F: Double = js.native
     // = 222,
    var F1: Double = js.native
     // = 120,
    var F10: Double = js.native
     // = 121,
    var F11: Double = js.native
     // = 122,
    var F12: Double = js.native
     // = 112,
    var F2: Double = js.native
     // = 113,
    var F3: Double = js.native
     // = 114,
    var F4: Double = js.native
     // = 115,
    var F5: Double = js.native
     // = 116,
    var F6: Double = js.native
     // = 117,
    var F7: Double = js.native
     // = 118,
    var F8: Double = js.native
     // = 119,
    var F9: Double = js.native
     // = 70,
    var G: Double = js.native
     // = 191,
    @JSName("`")
    var Graveaccent: Double = js.native
     // = 71,
    var H: Double = js.native
     // = 35,
    var HOME: Double = js.native
     // = 72,
    var I: Double = js.native
     // = 40,
    var INSERT: Double = js.native
     // = 73,
    var J: Double = js.native
     // = 74,
    var K: Double = js.native
     // = 75,
    var L: Double = js.native
     // = 36,
    var LEFT: Double = js.native
     // = 76,
    var M: Double = js.native
     // = 77,
    var N: Double = js.native
     // = 27,
    var `NUM-LOCK`: Double = js.native
     // = 90,
    var NUM0: Double = js.native
     // = 96,
    var NUM1: Double = js.native
     // = 97,
    var NUM2: Double = js.native
     // = 98,
    var NUM3: Double = js.native
     // = 99,
    var NUM4: Double = js.native
     // = 100,
    var NUM5: Double = js.native
     // = 101,
    var NUM6: Double = js.native
     // = 102,
    var NUM7: Double = js.native
     // = 103,
    var NUM8: Double = js.native
     // = 104,
    var NUM9: Double = js.native
     // = 105,
    @JSName("NUM*")
    var NUMAsterisk: Double = js.native
     // = 106,
    @JSName("NUM+")
    var NUMPlussign: Double = js.native
     // = 78,
    var O: Double = js.native
     // = 79,
    var P: Double = js.native
     // = 33,
    var `PAGE-DOWN`: Double = js.native
     // = 44,
    var `PAGE-UP`: Double = js.native
     // = 18,
    var `PAUSE-BREAK`: Double = js.native
     // = 145,
    var PRINT: Double = js.native
     // = 80,
    var Q: Double = js.native
     // = 81,
    var R: Double = js.native
     // = 13,
    var RETURN: Double = js.native
     // = 38,
    var RIGHT: Double = js.native
     // = 82,
    var S: Double = js.native
     // = 144,
    var `SCROLL-LOCK`: Double = js.native
     // = 13,
    var SHIFT: Double = js.native
     // = 107,
    //'NUM-' = 109,
    //'NUM.' = 110,
    //'NUM/' = 111,
    @JSName(";")
    var Semicolon: Double = js.native
     // = 190,
    @JSName("/")
    var Slash: Double = js.native
     // = 46,
    @JSName(" ")
    var Space: Double = js.native
     // = 83,
    var T: Double = js.native
     // = 9,
    var TAB: Double = js.native
     // = 84,
    var U: Double = js.native
     // = 37,
    var UP: Double = js.native
     // = 85,
    var V: Double = js.native
     // = 86,
    var W: Double = js.native
     // = 87,
    var X: Double = js.native
     // = 88,
    var Y: Double = js.native
     // = 89,
    var Z: Double = js.native
     // = 192,
    var `[`: Double = js.native
     // = 220,
    var `]`: Double = js.native
     // = 188,
    @JSName("-")
    var _dash: Double = js.native
  }
  
}

