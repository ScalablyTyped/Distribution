package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewHtmlSource extends js.Object {
  /*
    * The base URL to be used for any relative links in the HTML.
    */
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  /*
    * A static HTML page to display in the WebView.
    */
  var html: java.lang.String
}

object WebViewHtmlSource {
  @scala.inline
  def apply(html: java.lang.String, baseUrl: java.lang.String = null): WebViewHtmlSource = {
    val __obj = js.Dynamic.literal(html = html)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    __obj.asInstanceOf[WebViewHtmlSource]
  }
}

