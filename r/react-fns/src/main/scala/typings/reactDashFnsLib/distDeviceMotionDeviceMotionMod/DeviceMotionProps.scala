package typings
package reactDashFnsLib.distDeviceMotionDeviceMotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceMotionProps extends js.Object {
  var acceleration: stdLib.DeviceAcceleration | scala.Null
  var accelerationIncludingGravity: stdLib.DeviceAcceleration | scala.Null
  var interval: scala.Double | scala.Null
  var rotationRate: stdLib.DeviceRotationRate | scala.Null
}

object DeviceMotionProps {
  @scala.inline
  def apply(
    acceleration: stdLib.DeviceAcceleration = null,
    accelerationIncludingGravity: stdLib.DeviceAcceleration = null,
    interval: scala.Int | scala.Double = null,
    rotationRate: stdLib.DeviceRotationRate = null
  ): DeviceMotionProps = {
    val __obj = js.Dynamic.literal()
    if (acceleration != null) __obj.updateDynamic("acceleration")(acceleration)
    if (accelerationIncludingGravity != null) __obj.updateDynamic("accelerationIncludingGravity")(accelerationIncludingGravity)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (rotationRate != null) __obj.updateDynamic("rotationRate")(rotationRate)
    __obj.asInstanceOf[DeviceMotionProps]
  }
}

