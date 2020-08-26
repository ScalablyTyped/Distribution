package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardStyle extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var borderColor: js.UndefOr[String] = js.native
  var borderRadius: js.UndefOr[Double] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var shadowColor: js.UndefOr[String] = js.native
  var shadowOffset: js.UndefOr[Height] = js.native
  var shadowOpacity: js.UndefOr[Double] = js.native
  var shadowRadius: js.UndefOr[Double] = js.native
}

object CardStyle {
  @scala.inline
  def apply(): CardStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardStyle]
  }
  @scala.inline
  implicit class CardStyleOps[Self <: CardStyle] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setShadowColor(value: String): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    @scala.inline
    def setShadowOffset(value: Height): Self = this.set("shadowOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOffset: Self = this.set("shadowOffset", js.undefined)
    @scala.inline
    def setShadowOpacity(value: Double): Self = this.set("shadowOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOpacity: Self = this.set("shadowOpacity", js.undefined)
    @scala.inline
    def setShadowRadius(value: Double): Self = this.set("shadowRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowRadius: Self = this.set("shadowRadius", js.undefined)
  }
  
}

