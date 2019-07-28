package typings.rcDashGesture.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiFingerStatus extends js.Object {
  var angle: Double
  var x: Double
  var y: Double
  var z: Double
}

object MultiFingerStatus {
  @scala.inline
  def apply(angle: Double, x: Double, y: Double, z: Double): MultiFingerStatus = {
    val __obj = js.Dynamic.literal(angle = angle, x = x, y = y, z = z)
  
    __obj.asInstanceOf[MultiFingerStatus]
  }
}

