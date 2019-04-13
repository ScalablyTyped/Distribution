package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewHTMLAttributes[T] extends HTMLAttributes[T] {
  var allowFullScreen: js.UndefOr[scala.Boolean] = js.undefined
  var allowpopups: js.UndefOr[scala.Boolean] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var autosize: js.UndefOr[scala.Boolean] = js.undefined
  var blinkfeatures: js.UndefOr[java.lang.String] = js.undefined
  var disableblinkfeatures: js.UndefOr[java.lang.String] = js.undefined
  var disableguestresize: js.UndefOr[scala.Boolean] = js.undefined
  var disablewebsecurity: js.UndefOr[scala.Boolean] = js.undefined
  var guestinstance: js.UndefOr[java.lang.String] = js.undefined
  var httpreferrer: js.UndefOr[java.lang.String] = js.undefined
  var nodeintegration: js.UndefOr[scala.Boolean] = js.undefined
  var partition: js.UndefOr[java.lang.String] = js.undefined
  var plugins: js.UndefOr[scala.Boolean] = js.undefined
  var preload: js.UndefOr[java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var useragent: js.UndefOr[java.lang.String] = js.undefined
  var webpreferences: js.UndefOr[java.lang.String] = js.undefined
}

object WebViewHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    allowFullScreen: js.UndefOr[scala.Boolean] = js.undefined,
    allowpopups: js.UndefOr[scala.Boolean] = js.undefined,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    autosize: js.UndefOr[scala.Boolean] = js.undefined,
    blinkfeatures: java.lang.String = null,
    disableblinkfeatures: java.lang.String = null,
    disableguestresize: js.UndefOr[scala.Boolean] = js.undefined,
    disablewebsecurity: js.UndefOr[scala.Boolean] = js.undefined,
    guestinstance: java.lang.String = null,
    httpreferrer: java.lang.String = null,
    nodeintegration: js.UndefOr[scala.Boolean] = js.undefined,
    partition: java.lang.String = null,
    plugins: js.UndefOr[scala.Boolean] = js.undefined,
    preload: java.lang.String = null,
    src: java.lang.String = null,
    useragent: java.lang.String = null,
    webpreferences: java.lang.String = null
  ): WebViewHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(allowFullScreen)) __obj.updateDynamic("allowFullScreen")(allowFullScreen)
    if (!js.isUndefined(allowpopups)) __obj.updateDynamic("allowpopups")(allowpopups)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(autosize)) __obj.updateDynamic("autosize")(autosize)
    if (blinkfeatures != null) __obj.updateDynamic("blinkfeatures")(blinkfeatures)
    if (disableblinkfeatures != null) __obj.updateDynamic("disableblinkfeatures")(disableblinkfeatures)
    if (!js.isUndefined(disableguestresize)) __obj.updateDynamic("disableguestresize")(disableguestresize)
    if (!js.isUndefined(disablewebsecurity)) __obj.updateDynamic("disablewebsecurity")(disablewebsecurity)
    if (guestinstance != null) __obj.updateDynamic("guestinstance")(guestinstance)
    if (httpreferrer != null) __obj.updateDynamic("httpreferrer")(httpreferrer)
    if (!js.isUndefined(nodeintegration)) __obj.updateDynamic("nodeintegration")(nodeintegration)
    if (partition != null) __obj.updateDynamic("partition")(partition)
    if (!js.isUndefined(plugins)) __obj.updateDynamic("plugins")(plugins)
    if (preload != null) __obj.updateDynamic("preload")(preload)
    if (src != null) __obj.updateDynamic("src")(src)
    if (useragent != null) __obj.updateDynamic("useragent")(useragent)
    if (webpreferences != null) __obj.updateDynamic("webpreferences")(webpreferences)
    __obj.asInstanceOf[WebViewHTMLAttributes[T]]
  }
}

