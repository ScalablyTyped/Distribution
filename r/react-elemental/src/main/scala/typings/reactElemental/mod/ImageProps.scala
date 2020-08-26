package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ImgHTMLAttributes
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageProps extends ImgHTMLAttributes[HTMLImageElement] {
  @JSName("alt")
  val alt_ImageProps: String = js.native
  @JSName("height")
  val height_ImageProps: js.UndefOr[String] = js.native
  val imgStyle: js.UndefOr[CSSProperties] = js.native
  val `lazy`: js.UndefOr[Boolean] = js.native
  val showIntermediate: js.UndefOr[Boolean] = js.native
  @JSName("width")
  val width_ImageProps: js.UndefOr[String] = js.native
}

object ImageProps {
  @scala.inline
  def apply(alt: String): ImageProps = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
  @scala.inline
  implicit class ImagePropsOps[Self <: ImageProps] (val x: Self) extends AnyVal {
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
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setImgStyle(value: CSSProperties): Self = this.set("imgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgStyle: Self = this.set("imgStyle", js.undefined)
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    @scala.inline
    def setShowIntermediate(value: Boolean): Self = this.set("showIntermediate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowIntermediate: Self = this.set("showIntermediate", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

