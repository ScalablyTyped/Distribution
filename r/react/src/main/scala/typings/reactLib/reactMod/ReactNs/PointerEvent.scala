package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerEvent[T]
  extends MouseEvent[T, reactLib.NativePointerEvent] {
  var height: scala.Double
  var isPrimary: scala.Boolean
  var pointerId: scala.Double
  var pointerType: reactLib.reactLibStrings.mouse | reactLib.reactLibStrings.pen | reactLib.reactLibStrings.touch
  var pressure: scala.Double
  var tiltX: scala.Double
  var tiltY: scala.Double
  var width: scala.Double
}

