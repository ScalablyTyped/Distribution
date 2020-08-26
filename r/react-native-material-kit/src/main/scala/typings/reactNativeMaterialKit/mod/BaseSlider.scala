package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseSlider extends ViewProps {
  var lowerTrackColor: js.UndefOr[String] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double] = js.native
  var thumbPadding: js.UndefOr[Double] = js.native
  var thumbRadius: js.UndefOr[Double] = js.native
  var trackSize: js.UndefOr[Double] = js.native
  var upperTrackColor: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
}

object BaseSlider {
  @scala.inline
  def apply(): BaseSlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSlider]
  }
  @scala.inline
  implicit class BaseSliderOps[Self <: BaseSlider] (val x: Self) extends AnyVal {
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
    def setLowerTrackColor(value: String): Self = this.set("lowerTrackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowerTrackColor: Self = this.set("lowerTrackColor", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setThumbPadding(value: Double): Self = this.set("thumbPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbPadding: Self = this.set("thumbPadding", js.undefined)
    @scala.inline
    def setThumbRadius(value: Double): Self = this.set("thumbRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbRadius: Self = this.set("thumbRadius", js.undefined)
    @scala.inline
    def setTrackSize(value: Double): Self = this.set("trackSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackSize: Self = this.set("trackSize", js.undefined)
    @scala.inline
    def setUpperTrackColor(value: String): Self = this.set("upperTrackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpperTrackColor: Self = this.set("upperTrackColor", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

