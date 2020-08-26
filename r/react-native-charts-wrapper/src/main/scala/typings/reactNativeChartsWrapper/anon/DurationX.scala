package typings.reactNativeChartsWrapper.anon

import typings.reactNativeChartsWrapper.mod.EasingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurationX extends js.Object {
  var durationX: js.UndefOr[Double] = js.native
  var durationY: js.UndefOr[Double] = js.native
  var easingX: js.UndefOr[EasingType] = js.native
  var easingY: js.UndefOr[EasingType] = js.native
}

object DurationX {
  @scala.inline
  def apply(): DurationX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationX]
  }
  @scala.inline
  implicit class DurationXOps[Self <: DurationX] (val x: Self) extends AnyVal {
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
    def setDurationX(value: Double): Self = this.set("durationX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationX: Self = this.set("durationX", js.undefined)
    @scala.inline
    def setDurationY(value: Double): Self = this.set("durationY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationY: Self = this.set("durationY", js.undefined)
    @scala.inline
    def setEasingX(value: EasingType): Self = this.set("easingX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasingX: Self = this.set("easingX", js.undefined)
    @scala.inline
    def setEasingY(value: EasingType): Self = this.set("easingY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasingY: Self = this.set("easingY", js.undefined)
  }
  
}

