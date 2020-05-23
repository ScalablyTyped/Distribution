package typings.rcGesture.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var angle: Double
  var time: js.Any
  var velocity: Double
  var x: Double
  var y: Double
  var z: Double
}

object Time {
  @scala.inline
  def apply(angle: Double, time: js.Any, velocity: Double, x: Double, y: Double, z: Double): Time = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
}

