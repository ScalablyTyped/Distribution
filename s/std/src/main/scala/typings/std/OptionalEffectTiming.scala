package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalEffectTiming extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var direction: js.UndefOr[PlaybackDirection] = js.native
  var duration: js.UndefOr[Double | java.lang.String] = js.native
  var easing: js.UndefOr[java.lang.String] = js.native
  var endDelay: js.UndefOr[Double] = js.native
  var fill: js.UndefOr[FillMode] = js.native
  var iterationStart: js.UndefOr[Double] = js.native
  var iterations: js.UndefOr[Double] = js.native
}

object OptionalEffectTiming {
  @scala.inline
  def apply(): OptionalEffectTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalEffectTiming]
  }
  @scala.inline
  implicit class OptionalEffectTimingOps[Self <: OptionalEffectTiming] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDirection(value: PlaybackDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDuration(value: Double | java.lang.String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: java.lang.String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setEndDelay(value: Double): Self = this.set("endDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDelay: Self = this.set("endDelay", js.undefined)
    @scala.inline
    def setFill(value: FillMode): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setIterationStart(value: Double): Self = this.set("iterationStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterationStart: Self = this.set("iterationStart", js.undefined)
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
  }
  
}

