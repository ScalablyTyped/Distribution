package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewHTMLAttributes[T] extends HTMLAttributes[T] {
  var allowFullScreen: js.UndefOr[Boolean] = js.undefined
  var allowpopups: js.UndefOr[Boolean] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autosize: js.UndefOr[Boolean] = js.undefined
  var blinkfeatures: js.UndefOr[String] = js.undefined
  var disableblinkfeatures: js.UndefOr[String] = js.undefined
  var disableguestresize: js.UndefOr[Boolean] = js.undefined
  var disablewebsecurity: js.UndefOr[Boolean] = js.undefined
  var guestinstance: js.UndefOr[String] = js.undefined
  var httpreferrer: js.UndefOr[String] = js.undefined
  var nodeintegration: js.UndefOr[Boolean] = js.undefined
  var partition: js.UndefOr[String] = js.undefined
  var plugins: js.UndefOr[Boolean] = js.undefined
  var preload: js.UndefOr[String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var useragent: js.UndefOr[String] = js.undefined
  var webpreferences: js.UndefOr[String] = js.undefined
}

object WebViewHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    allowFullScreen: js.UndefOr[Boolean] = js.undefined,
    allowpopups: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autosize: js.UndefOr[Boolean] = js.undefined,
    blinkfeatures: String = null,
    disableblinkfeatures: String = null,
    disableguestresize: js.UndefOr[Boolean] = js.undefined,
    disablewebsecurity: js.UndefOr[Boolean] = js.undefined,
    guestinstance: String = null,
    httpreferrer: String = null,
    nodeintegration: js.UndefOr[Boolean] = js.undefined,
    partition: String = null,
    plugins: js.UndefOr[Boolean] = js.undefined,
    preload: String = null,
    src: String = null,
    useragent: String = null,
    webpreferences: String = null
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

