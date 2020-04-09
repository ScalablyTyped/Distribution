package typings.rax.mod

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
    if (HTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(allowFullScreen)) __obj.updateDynamic("allowFullScreen")(allowFullScreen.asInstanceOf[js.Any])
    if (!js.isUndefined(allowpopups)) __obj.updateDynamic("allowpopups")(allowpopups.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(autosize)) __obj.updateDynamic("autosize")(autosize.asInstanceOf[js.Any])
    if (blinkfeatures != null) __obj.updateDynamic("blinkfeatures")(blinkfeatures.asInstanceOf[js.Any])
    if (disableblinkfeatures != null) __obj.updateDynamic("disableblinkfeatures")(disableblinkfeatures.asInstanceOf[js.Any])
    if (!js.isUndefined(disableguestresize)) __obj.updateDynamic("disableguestresize")(disableguestresize.asInstanceOf[js.Any])
    if (!js.isUndefined(disablewebsecurity)) __obj.updateDynamic("disablewebsecurity")(disablewebsecurity.asInstanceOf[js.Any])
    if (guestinstance != null) __obj.updateDynamic("guestinstance")(guestinstance.asInstanceOf[js.Any])
    if (httpreferrer != null) __obj.updateDynamic("httpreferrer")(httpreferrer.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeintegration)) __obj.updateDynamic("nodeintegration")(nodeintegration.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (!js.isUndefined(plugins)) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (useragent != null) __obj.updateDynamic("useragent")(useragent.asInstanceOf[js.Any])
    if (webpreferences != null) __obj.updateDynamic("webpreferences")(webpreferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewHTMLAttributes[T]]
  }
}

