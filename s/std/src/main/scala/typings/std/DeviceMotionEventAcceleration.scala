package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceMotionEventAcceleration extends js.Object {
  val x: Double | Null
  val y: Double | Null
  val z: Double | Null
}

object DeviceMotionEventAcceleration {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null, z: Int | Double = null): DeviceMotionEventAcceleration = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMotionEventAcceleration]
  }
}

