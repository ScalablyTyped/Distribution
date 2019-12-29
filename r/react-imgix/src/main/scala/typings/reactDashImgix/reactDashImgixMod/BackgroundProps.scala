package typings.reactDashImgix.reactDashImgixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disableLibraryParam: js.UndefOr[Boolean] = js.undefined
  var htmlAttributes: js.UndefOr[ImgixHTMLAttributes] = js.undefined
  var imgixParams: js.UndefOr[ImigixParams] = js.undefined
  var src: String
}

object BackgroundProps {
  @scala.inline
  def apply(
    src: String,
    className: String = null,
    disableLibraryParam: js.UndefOr[Boolean] = js.undefined,
    htmlAttributes: ImgixHTMLAttributes = null,
    imgixParams: ImigixParams = null
  ): BackgroundProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLibraryParam)) __obj.updateDynamic("disableLibraryParam")(disableLibraryParam.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (imgixParams != null) __obj.updateDynamic("imgixParams")(imgixParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundProps]
  }
}

