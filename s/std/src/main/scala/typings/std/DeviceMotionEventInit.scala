package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceMotionEventInit extends EventInit {
  var acceleration: js.UndefOr[DeviceMotionEventAccelerationInit] = js.native
  var accelerationIncludingGravity: js.UndefOr[DeviceMotionEventAccelerationInit] = js.native
  var interval: js.UndefOr[Double] = js.native
  var rotationRate: js.UndefOr[DeviceMotionEventRotationRateInit] = js.native
}

object DeviceMotionEventInit {
  @scala.inline
  def apply(): DeviceMotionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMotionEventInit]
  }
  @scala.inline
  implicit class DeviceMotionEventInitOps[Self <: DeviceMotionEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcceleration(value: DeviceMotionEventAccelerationInit): Self = this.set("acceleration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceleration: Self = this.set("acceleration", js.undefined)
    @scala.inline
    def setAccelerationIncludingGravity(value: DeviceMotionEventAccelerationInit): Self = this.set("accelerationIncludingGravity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccelerationIncludingGravity: Self = this.set("accelerationIncludingGravity", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setRotationRate(value: DeviceMotionEventRotationRateInit): Self = this.set("rotationRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationRate: Self = this.set("rotationRate", js.undefined)
  }
  
}

