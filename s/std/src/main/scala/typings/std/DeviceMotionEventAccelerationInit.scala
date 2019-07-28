package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceMotionEventAccelerationInit extends js.Object {
  var x: js.UndefOr[Double | Null] = js.undefined
  var y: js.UndefOr[Double | Null] = js.undefined
  var z: js.UndefOr[Double | Null] = js.undefined
}

object DeviceMotionEventAccelerationInit {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null, z: Int | Double = null): DeviceMotionEventAccelerationInit = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMotionEventAccelerationInit]
  }
}

