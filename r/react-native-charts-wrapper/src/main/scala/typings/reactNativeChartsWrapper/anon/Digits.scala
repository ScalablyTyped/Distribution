package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Digits extends js.Object {
  var digits: js.UndefOr[Double] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var markerColor: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.native
  var textColor: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.native
  var textSize: js.UndefOr[Double] = js.native
}

object Digits {
  @scala.inline
  def apply(): Digits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Digits]
  }
  @scala.inline
  implicit class DigitsOps[Self <: Digits] (val x: Self) extends AnyVal {
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
    def setDigits(value: Double): Self = this.set("digits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigits: Self = this.set("digits", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setMarkerColor(value: typings.reactNativeChartsWrapper.mod.Color): Self = this.set("markerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerColor: Self = this.set("markerColor", js.undefined)
    @scala.inline
    def setTextColor(value: typings.reactNativeChartsWrapper.mod.Color): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setTextSize(value: Double): Self = this.set("textSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextSize: Self = this.set("textSize", js.undefined)
  }
  
}

