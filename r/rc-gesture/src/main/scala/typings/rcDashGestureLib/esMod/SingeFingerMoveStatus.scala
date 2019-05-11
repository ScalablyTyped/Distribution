package typings
package rcDashGestureLib.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingeFingerMoveStatus extends js.Object {
  var angle: scala.Double
  var time: scala.Double
  var velocity: scala.Double
  var x: scala.Double
  var y: scala.Double
  var z: scala.Double
}

object SingeFingerMoveStatus {
  @scala.inline
  def apply(
    angle: scala.Double,
    time: scala.Double,
    velocity: scala.Double,
    x: scala.Double,
    y: scala.Double,
    z: scala.Double
  ): SingeFingerMoveStatus = {
    val __obj = js.Dynamic.literal(angle = angle, time = time, velocity = velocity, x = x, y = y, z = z)
  
    __obj.asInstanceOf[SingeFingerMoveStatus]
  }
}

