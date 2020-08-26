package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementAnimation extends js.Object {
  var duration: Double = js.native
  var interpolation: js.UndefOr[Interpolation] = js.native
  var startDelay: js.UndefOr[Double] = js.native
}

object ElementAnimation {
  @scala.inline
  def apply(duration: Double): ElementAnimation = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAnimation]
  }
  @scala.inline
  implicit class ElementAnimationOps[Self <: ElementAnimation] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterpolation(value: Interpolation): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
    @scala.inline
    def setStartDelay(value: Double): Self = this.set("startDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDelay: Self = this.set("startDelay", js.undefined)
  }
  
}

