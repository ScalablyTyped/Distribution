package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.GET
import typings.reactDashNative.reactDashNativeStrings.POST
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
  var body: js.UndefOr[String] = js.undefined
  /*
    * Additional HTTP headers to send with the request.
    * NOTE: On Android, this can only be used with GET requests.
    */
  var headers: js.UndefOr[js.Any] = js.undefined
  /*
    * The HTTP Method to use. Defaults to GET if not specified.
    * NOTE: On Android, only GET and POST are supported.
    */
  var method: js.UndefOr[GET | POST] = js.undefined
  /*
    * The URI to load in the WebView. Can be a local or remote file.
    */
  var uri: js.UndefOr[String] = js.undefined
}

object WebViewUriSource {
  @scala.inline
  def apply(body: String = null, headers: js.Any = null, method: GET | POST = null, uri: String = null): WebViewUriSource = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[WebViewUriSource]
  }
}

