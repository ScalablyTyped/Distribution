package typings.reactRange.anon

import typings.reactRange.typesMod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowOverlap extends js.Object {
  var allowOverlap: Boolean = js.native
  var direction: Direction = js.native
  var disabled: Boolean = js.native
  var max: Double = js.native
  var min: Double = js.native
  var rtl: Boolean = js.native
  var step: Double = js.native
}

object AllowOverlap {
  @scala.inline
  def apply(
    allowOverlap: Boolean,
    direction: Direction,
    disabled: Boolean,
    max: Double,
    min: Double,
    rtl: Boolean,
    step: Double
  ): AllowOverlap = {
    val __obj = js.Dynamic.literal(allowOverlap = allowOverlap.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowOverlap]
  }
  @scala.inline
  implicit class AllowOverlapOps[Self <: AllowOverlap] (val x: Self) extends AnyVal {
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
    def setAllowOverlap(value: Boolean): Self = this.set("allowOverlap", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: Direction): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
  }
  
}

