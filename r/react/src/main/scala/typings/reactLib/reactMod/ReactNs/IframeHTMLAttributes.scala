package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IframeHTMLAttributes[T] extends HTMLAttributes[T] {
  var allow: js.UndefOr[java.lang.String] = js.undefined
  var allowFullScreen: js.UndefOr[scala.Boolean] = js.undefined
  var allowTransparency: js.UndefOr[scala.Boolean] = js.undefined
  var frameBorder: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var marginHeight: js.UndefOr[scala.Double] = js.undefined
  var marginWidth: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var sandbox: js.UndefOr[java.lang.String] = js.undefined
  var scrolling: js.UndefOr[java.lang.String] = js.undefined
  var seamless: js.UndefOr[scala.Boolean] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var srcDoc: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object IframeHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    allow: java.lang.String = null,
    allowFullScreen: js.UndefOr[scala.Boolean] = js.undefined,
    allowTransparency: js.UndefOr[scala.Boolean] = js.undefined,
    frameBorder: scala.Double | java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    marginHeight: scala.Int | scala.Double = null,
    marginWidth: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    sandbox: java.lang.String = null,
    scrolling: java.lang.String = null,
    seamless: js.UndefOr[scala.Boolean] = js.undefined,
    src: java.lang.String = null,
    srcDoc: java.lang.String = null,
    width: scala.Double | java.lang.String = null
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
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling)
    if (!js.isUndefined(seamless)) __obj.updateDynamic("seamless")(seamless)
    if (src != null) __obj.updateDynamic("src")(src)
    if (srcDoc != null) __obj.updateDynamic("srcDoc")(srcDoc)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IframeHTMLAttributes[T]]
  }
}

