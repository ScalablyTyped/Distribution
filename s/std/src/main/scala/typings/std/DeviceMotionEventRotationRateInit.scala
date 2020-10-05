package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceMotionEventRotationRateInit extends js.Object {
  var alpha: js.UndefOr[Double | Null] = js.native
  var beta: js.UndefOr[Double | Null] = js.native
  var gamma: js.UndefOr[Double | Null] = js.native
}

object DeviceMotionEventRotationRateInit {
  @scala.inline
  def apply(): DeviceMotionEventRotationRateInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMotionEventRotationRateInit]
  }
  @scala.inline
  implicit class DeviceMotionEventRotationRateInitOps[Self <: DeviceMotionEventRotationRateInit] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setAlphaNull: Self = this.set("alpha", null)
    @scala.inline
    def setBeta(value: Double): Self = this.set("beta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeta: Self = this.set("beta", js.undefined)
    @scala.inline
    def setBetaNull: Self = this.set("beta", null)
    @scala.inline
    def setGamma(value: Double): Self = this.set("gamma", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGamma: Self = this.set("gamma", js.undefined)
    @scala.inline
    def setGammaNull: Self = this.set("gamma", null)
  }
  
}

