package typings.rcDashGesture.rcDashGestureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingeFingerMoveStatus extends js.Object {
  var angle: Double
  var time: Double
  var velocity: Double
  var x: Double
  var y: Double
  var z: Double
}

object SingeFingerMoveStatus {
  @scala.inline
  def apply(angle: Double, time: Double, velocity: Double, x: Double, y: Double, z: Double): SingeFingerMoveStatus = {
    val __obj = js.Dynamic.literal(angle = angle, time = time, velocity = velocity, x = x, y = y, z = z)
  
    __obj.asInstanceOf[SingeFingerMoveStatus]
  }
}

