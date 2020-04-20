package typings.rcGesture.mod

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
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingeFingerMoveStatus]
  }
}

