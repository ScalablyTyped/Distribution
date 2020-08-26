package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MKRangeSliderProperties extends BaseSlider {
  var maxValue: js.UndefOr[Double] = js.native
  var minValue: js.UndefOr[Double] = js.native
  var onChange: js.UndefOr[js.Function1[/* curValue */ Max, Unit]] = js.native
  var onConfirm: js.UndefOr[js.Function1[/* curValue */ Max, Unit]] = js.native
  var onStart: js.UndefOr[js.Function0[Unit]] = js.native
}

object MKRangeSliderProperties {
  @scala.inline
  def apply(): MKRangeSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKRangeSliderProperties]
  }
  @scala.inline
  implicit class MKRangeSliderPropertiesOps[Self <: MKRangeSliderProperties] (val x: Self) extends AnyVal {
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
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setOnChange(value: /* curValue */ Max => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnConfirm(value: /* curValue */ Max => Unit): Self = this.set("onConfirm", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnConfirm: Self = this.set("onConfirm", js.undefined)
    @scala.inline
    def setOnStart(value: () => Unit): Self = this.set("onStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
  }
  
}

