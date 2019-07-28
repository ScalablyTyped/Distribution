package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewHtmlSource extends js.Object {
  /*
    * The base URL to be used for any relative links in the HTML.
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  /*
    * A static HTML page to display in the WebView.
    */
  var html: String
}

object WebViewHtmlSource {
  @scala.inline
  def apply(html: String, baseUrl: String = null): WebViewHtmlSource = {
    val __obj = js.Dynamic.literal(html = html)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    __obj.asInstanceOf[WebViewHtmlSource]
  }
}

