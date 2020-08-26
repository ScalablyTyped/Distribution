package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageBitmapRenderingContextSettings extends js.Object {
  var alpha: js.UndefOr[scala.Boolean] = js.native
}

object ImageBitmapRenderingContextSettings {
  @scala.inline
  def apply(): ImageBitmapRenderingContextSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageBitmapRenderingContextSettings]
  }
  @scala.inline
  implicit class ImageBitmapRenderingContextSettingsOps[Self <: ImageBitmapRenderingContextSettings] (val x: Self) extends AnyVal {
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
    def setAlpha(value: scala.Boolean): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
  }
  
}

