package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var disableLibraryParam: js.UndefOr[Boolean] = js.native
  var htmlAttributes: js.UndefOr[ImgixHTMLAttributes] = js.native
  var imgixParams: js.UndefOr[ImigixParams] = js.native
  var src: String = js.native
}

object BackgroundProps {
  @scala.inline
  def apply(src: String): BackgroundProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundProps]
  }
  @scala.inline
  implicit class BackgroundPropsOps[Self <: BackgroundProps] (val x: Self) extends AnyVal {
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisableLibraryParam(value: Boolean): Self = this.set("disableLibraryParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableLibraryParam: Self = this.set("disableLibraryParam", js.undefined)
    @scala.inline
    def setHtmlAttributes(value: ImgixHTMLAttributes): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    @scala.inline
    def setImgixParams(value: ImigixParams): Self = this.set("imgixParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgixParams: Self = this.set("imgixParams", js.undefined)
  }
  
}

