package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IframeHTMLAttributes[T] extends HTMLAttributes[T] {
  var allow: js.UndefOr[String] = js.undefined
  var allowFullScreen: js.UndefOr[Boolean] = js.undefined
  var allowTransparency: js.UndefOr[Boolean] = js.undefined
  var frameBorder: js.UndefOr[Double | String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var marginHeight: js.UndefOr[Double] = js.undefined
  var marginWidth: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var referrerPolicy: js.UndefOr[String] = js.undefined
  var sandbox: js.UndefOr[String] = js.undefined
  var scrolling: js.UndefOr[String] = js.undefined
  var seamless: js.UndefOr[Boolean] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcDoc: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object IframeHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    allow: String = null,
    allowFullScreen: js.UndefOr[Boolean] = js.undefined,
    allowTransparency: js.UndefOr[Boolean] = js.undefined,
    frameBorder: Double | String = null,
    height: Double | String = null,
    marginHeight: Int | Double = null,
    marginWidth: Int | Double = null,
    name: String = null,
    referrerPolicy: String = null,
    sandbox: String = null,
    scrolling: String = null,
    seamless: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    srcDoc: String = null,
    width: Double | String = null
  ): IframeHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (allow != null) __obj.updateDynamic("allow")(allow)
    if (!js.isUndefined(allowFullScreen)) __obj.updateDynamic("allowFullScreen")(allowFullScreen)
    if (!js.isUndefined(allowTransparency)) __obj.updateDynamic("allowTransparency")(allowTransparency)
    if (frameBorder != null) __obj.updateDynamic("frameBorder")(frameBorder.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (marginHeight != null) __obj.updateDynamic("marginHeight")(marginHeight.asInstanceOf[js.Any])
    if (marginWidth != null) __obj.updateDynamic("marginWidth")(marginWidth.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy)
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling)
    if (!js.isUndefined(seamless)) __obj.updateDynamic("seamless")(seamless)
    if (src != null) __obj.updateDynamic("src")(src)
    if (srcDoc != null) __obj.updateDynamic("srcDoc")(srcDoc)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IframeHTMLAttributes[T]]
  }
}

