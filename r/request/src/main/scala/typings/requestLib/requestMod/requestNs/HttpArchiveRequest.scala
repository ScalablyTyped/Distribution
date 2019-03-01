package typings
package requestLib.requestMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpArchiveRequest extends js.Object {
  var headers: js.UndefOr[js.Array[NameValuePair]] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var postData: js.UndefOr[requestLib.Anon_MimeType] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object HttpArchiveRequest {
  @scala.inline
  def apply(
    headers: js.Array[NameValuePair] = null,
    method: java.lang.String = null,
    postData: requestLib.Anon_MimeType = null,
    url: java.lang.String = null
  ): HttpArchiveRequest = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (postData != null) __obj.updateDynamic("postData")(postData)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[HttpArchiveRequest]
  }
}

