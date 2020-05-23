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
  def apply(
    x: js.UndefOr[Null | Double] = js.undefined,
    y: js.UndefOr[Null | Double] = js.undefined,
    z: js.UndefOr[Null | Double] = js.undefined
  ): DeviceMotionEventAccelerationInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMotionEventAccelerationInit]
  }
}

