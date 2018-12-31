package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WheelEvent[T]
  extends MouseEvent[T, reactLib.NativeWheelEvent] {
  var deltaMode: scala.Double
  var deltaX: scala.Double
  var deltaY: scala.Double
  var deltaZ: scala.Double
}

