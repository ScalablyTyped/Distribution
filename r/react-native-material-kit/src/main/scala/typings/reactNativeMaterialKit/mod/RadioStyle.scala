package typings.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioStyle extends js.Object {
  var borderOffColor: js.UndefOr[String] = js.native
  var borderOnColor: js.UndefOr[String] = js.native
  var extraRippleRadius: js.UndefOr[Double] = js.native
  var fillColor: js.UndefOr[String] = js.native
  var rippleColor: js.UndefOr[String] = js.native
}

object RadioStyle {
  @scala.inline
  def apply(): RadioStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioStyle]
  }
  @scala.inline
  implicit class RadioStyleOps[Self <: RadioStyle] (val x: Self) extends AnyVal {
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
    def setBorderOffColor(value: String): Self = this.set("borderOffColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderOffColor: Self = this.set("borderOffColor", js.undefined)
    @scala.inline
    def setBorderOnColor(value: String): Self = this.set("borderOnColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderOnColor: Self = this.set("borderOnColor", js.undefined)
    @scala.inline
    def setExtraRippleRadius(value: Double): Self = this.set("extraRippleRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraRippleRadius: Self = this.set("extraRippleRadius", js.undefined)
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setRippleColor(value: String): Self = this.set("rippleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleColor: Self = this.set("rippleColor", js.undefined)
  }
  
}

