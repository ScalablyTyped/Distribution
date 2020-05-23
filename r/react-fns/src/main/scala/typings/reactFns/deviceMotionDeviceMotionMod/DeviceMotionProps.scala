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
    interval: Double = null.asInstanceOf[Double],
    rotationRate: DeviceRotationRate = null
  ): DeviceMotionProps = {
    val __obj = js.Dynamic.literal(acceleration = acceleration.asInstanceOf[js.Any], accelerationIncludingGravity = accelerationIncludingGravity.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], rotationRate = rotationRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMotionProps]
  }
}

