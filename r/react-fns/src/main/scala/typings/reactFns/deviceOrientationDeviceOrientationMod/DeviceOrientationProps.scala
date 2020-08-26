package typings.reactFns.deviceOrientationDeviceOrientationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceOrientationProps extends js.Object {
  var absolute: Boolean = js.native
  var alpha: Double | Null = js.native
  var beta: Double | Null = js.native
  var gamma: Double | Null = js.native
}

object DeviceOrientationProps {
  @scala.inline
  def apply(absolute: Boolean): DeviceOrientationProps = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceOrientationProps]
  }
  @scala.inline
  implicit class DeviceOrientationPropsOps[Self <: DeviceOrientationProps] (val x: Self) extends AnyVal {
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
    def setAbsolute(value: Boolean): Self = this.set("absolute", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlphaNull: Self = this.set("alpha", null)
    @scala.inline
    def setBeta(value: Double): Self = this.set("beta", value.asInstanceOf[js.Any])
    @scala.inline
    def setBetaNull: Self = this.set("beta", null)
    @scala.inline
    def setGamma(value: Double): Self = this.set("gamma", value.asInstanceOf[js.Any])
    @scala.inline
    def setGammaNull: Self = this.set("gamma", null)
  }
  
}

