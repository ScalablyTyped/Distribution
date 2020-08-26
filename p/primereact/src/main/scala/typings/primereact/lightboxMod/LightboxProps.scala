package typings.primereact.lightboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LightboxProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var easing: js.UndefOr[String] = js.native
  var effectDuration: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var images: js.UndefOr[js.Array[_]] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var target: js.UndefOr[String] = js.native
}

object LightboxProps {
  @scala.inline
  def apply(): LightboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LightboxProps]
  }
  @scala.inline
  implicit class LightboxPropsOps[Self <: LightboxProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setEffectDuration(value: String): Self = this.set("effectDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectDuration: Self = this.set("effectDuration", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImagesVarargs(value: js.Any*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[_]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

