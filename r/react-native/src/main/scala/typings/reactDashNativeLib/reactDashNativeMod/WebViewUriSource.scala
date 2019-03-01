package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewUriSource extends js.Object {
  /*
    * The HTTP body to send with the request. This must be a valid
    * UTF-8 string, and will be sent exactly as specified, with no
    * additional encoding (e.g. URL-escaping or base64) applied.
    * NOTE: On Android, this can only be used with POST requests.
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /*
    * Additional HTTP headers to send with the request.
    * NOTE: On Android, this can only be used with GET requests.
    */
  var headers: js.UndefOr[js.Any] = js.undefined
  /*
    * The HTTP Method to use. Defaults to GET if not specified.
    * NOTE: On Android, only GET and POST are supported.
    */
  var method: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.GET | reactDashNativeLib.reactDashNativeLibStrings.POST
  ] = js.undefined
  /*
    * The URI to load in the WebView. Can be a local or remote file.
    */
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object WebViewUriSource {
  @scala.inline
  def apply(
    body: java.lang.String = null,
    headers: js.Any = null,
    method: reactDashNativeLib.reactDashNativeLibStrings.GET | reactDashNativeLib.reactDashNativeLibStrings.POST = null,
    uri: java.lang.String = null
  ): WebViewUriSource = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[WebViewUriSource]
  }
}

