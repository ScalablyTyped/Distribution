package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceMotionEventInit extends EventInit {
  var acceleration: js.UndefOr[DeviceAccelerationDict | scala.Null] = js.undefined
  var accelerationIncludingGravity: js.UndefOr[DeviceAccelerationDict | scala.Null] = js.undefined
  var interval: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var rotationRate: js.UndefOr[DeviceRotationRateDict | scala.Null] = js.undefined
}

object DeviceMotionEventInit {
  @scala.inline
  def apply(
    acceleration: DeviceAccelerationDict = null,
    accelerationIncludingGravity: DeviceAccelerationDict = null,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    interval: scala.Int | scala.Double = null,
    rotationRate: DeviceRotationRateDict = null
  ): DeviceMotionEventInit = {
    val __obj = js.Dynamic.literal()
    if (acceleration != null) __obj.updateDynamic("acceleration")(acceleration)
    if (accelerationIncludingGravity != null) __obj.updateDynamic("accelerationIncludingGravity")(accelerationIncludingGravity)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (rotationRate != null) __obj.updateDynamic("rotationRate")(rotationRate)
    __obj.asInstanceOf[DeviceMotionEventInit]
  }
}

