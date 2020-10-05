package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputedEffectTiming extends EffectTiming {
  var activeDuration: js.UndefOr[Double] = js.native
  var currentIteration: js.UndefOr[Double | Null] = js.native
  var endTime: js.UndefOr[Double] = js.native
  var localTime: js.UndefOr[Double | Null] = js.native
  var progress: js.UndefOr[Double | Null] = js.native
}

object ComputedEffectTiming {
  @scala.inline
  def apply(): ComputedEffectTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputedEffectTiming]
  }
  @scala.inline
  implicit class ComputedEffectTimingOps[Self <: ComputedEffectTiming] (val x: Self) extends AnyVal {
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
    def setActiveDuration(value: Double): Self = this.set("activeDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveDuration: Self = this.set("activeDuration", js.undefined)
    @scala.inline
    def setCurrentIteration(value: Double): Self = this.set("currentIteration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentIteration: Self = this.set("currentIteration", js.undefined)
    @scala.inline
    def setCurrentIterationNull: Self = this.set("currentIteration", null)
    @scala.inline
    def setEndTime(value: Double): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setLocalTime(value: Double): Self = this.set("localTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalTime: Self = this.set("localTime", js.undefined)
    @scala.inline
    def setLocalTimeNull: Self = this.set("localTime", null)
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setProgressNull: Self = this.set("progress", null)
  }
  
}

