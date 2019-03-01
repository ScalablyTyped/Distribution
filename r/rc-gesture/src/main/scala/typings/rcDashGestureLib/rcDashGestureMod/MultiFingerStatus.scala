package typings
package rcDashGestureLib.rcDashGestureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiFingerStatus extends js.Object {
  var angle: scala.Double
  var x: scala.Double
  var y: scala.Double
  var z: scala.Double
}

object MultiFingerStatus {
  @scala.inline
  def apply(angle: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): MultiFingerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("angle")(angle)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("z")(z)
    __obj.asInstanceOf[MultiFingerStatus]
  }
}

