package typings.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CpuUsageThrottleOptions extends js.Object {
  var halfLife: js.UndefOr[Double] = js.native
  var interval: js.UndefOr[Double] = js.native
  var limit: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double] = js.native
}

object CpuUsageThrottleOptions {
  @scala.inline
  def apply(): CpuUsageThrottleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CpuUsageThrottleOptions]
  }
  @scala.inline
  implicit class CpuUsageThrottleOptionsOps[Self <: CpuUsageThrottleOptions] (val x: Self) extends AnyVal {
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
    def setHalfLife(value: Double): Self = this.set("halfLife", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHalfLife: Self = this.set("halfLife", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
  }
  
}

