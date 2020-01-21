package typings.rcGesture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAngle extends js.Object {
  var angle: Double
  var x: Double
  var y: Double
  var z: Double
}

object AnonAngle {
  @scala.inline
  def apply(angle: Double, x: Double, y: Double, z: Double): AnonAngle = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAngle]
  }
}

