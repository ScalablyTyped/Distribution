package typings.reactFns.deviceMotionDeviceMotionMod

import typings.std.DeviceAcceleration
import typings.std.DeviceRotationRate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceMotionProps extends js.Object {
  var acceleration: DeviceAcceleration | Null = js.native
  var accelerationIncludingGravity: DeviceAcceleration | Null = js.native
  var interval: Double | Null = js.native
  var rotationRate: DeviceRotationRate | Null = js.native
}

object DeviceMotionProps {
  @scala.inline
  def apply(): DeviceMotionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMotionProps]
  }
  @scala.inline
  implicit class DeviceMotionPropsOps[Self <: DeviceMotionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcceleration(value: DeviceAcceleration): Self = this.set("acceleration", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccelerationNull: Self = this.set("acceleration", null)
    @scala.inline
    def setAccelerationIncludingGravity(value: DeviceAcceleration): Self = this.set("accelerationIncludingGravity", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccelerationIncludingGravityNull: Self = this.set("accelerationIncludingGravity", null)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntervalNull: Self = this.set("interval", null)
    @scala.inline
    def setRotationRate(value: DeviceRotationRate): Self = this.set("rotationRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotationRateNull: Self = this.set("rotationRate", null)
  }
  
}

