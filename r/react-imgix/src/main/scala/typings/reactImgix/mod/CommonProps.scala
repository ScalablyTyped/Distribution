package typings.reactImgix.mod

import typings.react.mod.RefObject
import typings.std.HTMLImageElement
import typings.std.HTMLPictureElement
import typings.std.HTMLSourceElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var htmlAttributes: js.UndefOr[ImgixHTMLAttributes] = js.native
  var onMounted: js.UndefOr[
    js.Function1[
      /* ref */ js.UndefOr[RefObject[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]], 
      Unit
    ]
  ] = js.native
}

object CommonProps {
  @scala.inline
  def apply(): CommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonProps]
  }
  @scala.inline
  implicit class CommonPropsOps[Self <: CommonProps] (val x: Self) extends AnyVal {
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
    def setHtmlAttributes(value: ImgixHTMLAttributes): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    @scala.inline
    def setOnMounted(
      value: /* ref */ js.UndefOr[RefObject[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]] => Unit
    ): Self = this.set("onMounted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMounted: Self = this.set("onMounted", js.undefined)
  }
  
}

