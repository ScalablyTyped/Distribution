package typings.reactImgix.mod

import typings.react.mod.RefObject
import typings.std.HTMLImageElement
import typings.std.HTMLPictureElement
import typings.std.HTMLSourceElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var htmlAttributes: js.UndefOr[ImgixHTMLAttributes] = js.undefined
  var onMounted: js.UndefOr[
    js.Function1[
      /* ref */ js.UndefOr[RefObject[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]], 
      Unit
    ]
  ] = js.undefined
}

object CommonProps {
  @scala.inline
  def apply(
    className: String = null,
    htmlAttributes: ImgixHTMLAttributes = null,
    onMounted: /* ref */ js.UndefOr[RefObject[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]] => Unit = null
  ): CommonProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (onMounted != null) __obj.updateDynamic("onMounted")(js.Any.fromFunction1(onMounted))
    __obj.asInstanceOf[CommonProps]
  }
}

