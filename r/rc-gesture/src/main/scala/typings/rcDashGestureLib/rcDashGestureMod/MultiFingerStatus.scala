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
    val __obj = js.Dynamic.literal(angle = angle, x = x, y = y, z = z)
  
    __obj.asInstanceOf[MultiFingerStatus]
  }
}

