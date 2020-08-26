package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.mod.MKPropTypes.font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloatingLabelProperties extends js.Object {
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  var floatingLabelAniDuration: js.UndefOr[Double] = js.native
  var floatingLabelBottomMargin: js.UndefOr[Double] = js.native
  var floatingLabelEnabled: js.UndefOr[Boolean] = js.native
  var floatingLabelFont: js.UndefOr[font] = js.native
}

object FloatingLabelProperties {
  @scala.inline
  def apply(): FloatingLabelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatingLabelProperties]
  }
  @scala.inline
  implicit class FloatingLabelPropertiesOps[Self <: FloatingLabelProperties] (val x: Self) extends AnyVal {
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
    def setAllowFontScaling(value: Boolean): Self = this.set("allowFontScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFontScaling: Self = this.set("allowFontScaling", js.undefined)
    @scala.inline
    def setFloatingLabelAniDuration(value: Double): Self = this.set("floatingLabelAniDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingLabelAniDuration: Self = this.set("floatingLabelAniDuration", js.undefined)
    @scala.inline
    def setFloatingLabelBottomMargin(value: Double): Self = this.set("floatingLabelBottomMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingLabelBottomMargin: Self = this.set("floatingLabelBottomMargin", js.undefined)
    @scala.inline
    def setFloatingLabelEnabled(value: Boolean): Self = this.set("floatingLabelEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingLabelEnabled: Self = this.set("floatingLabelEnabled", js.undefined)
    @scala.inline
    def setFloatingLabelFont(value: font): Self = this.set("floatingLabelFont", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingLabelFont: Self = this.set("floatingLabelFont", js.undefined)
  }
  
}

