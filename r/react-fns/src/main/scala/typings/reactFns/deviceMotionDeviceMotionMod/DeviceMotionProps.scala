package typings.reactFns.deviceMotionDeviceMotionMod

import typings.std.DeviceAcceleration
import typings.std.DeviceRotationRate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceMotionProps extends js.Object {
  var acceleration: DeviceAcceleration | Null
  var accelerationIncludingGravity: DeviceAcceleration | Null
  var interval: Double | Null
  var rotationRate: DeviceRotationRate | Null
}

object DeviceMotionProps {
  @scala.inline
  def apply(
    acceleration: DeviceAcceleration = null,
    accelerationIncludingGravity: DeviceAcceleration = null,
    interval: Int | Double = null,
    rotationRate: DeviceRotationRate = null
  ): DeviceMotionProps = {
    val __obj = js.Dynamic.literal()
    if (acceleration != null) __obj.updateDynamic("acceleration")(acceleration.asInstanceOf[js.Any])
    if (accelerationIncludingGravity != null) __obj.updateDynamic("accelerationIncludingGravity")(accelerationIncludingGravity.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (rotationRate != null) __obj.updateDynamic("rotationRate")(rotationRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMotionProps]
  }
}

