package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the rate at which the device is rotating around all three axes. */
@js.native
trait DeviceRotationRate extends js.Object {
  val alpha: Double | Null = js.native
  val beta: Double | Null = js.native
  val gamma: Double | Null = js.native
}

object DeviceRotationRate {
  @scala.inline
  def apply(): DeviceRotationRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceRotationRate]
  }
  @scala.inline
  implicit class DeviceRotationRateOps[Self <: DeviceRotationRate] (val x: Self) extends AnyVal {
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

