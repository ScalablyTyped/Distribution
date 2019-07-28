package typings.request.requestMod

import typings.request.Anon_MimeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpArchiveRequest extends js.Object {
  var headers: js.UndefOr[js.Array[NameValuePair]] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var postData: js.UndefOr[Anon_MimeType] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object HttpArchiveRequest {
  @scala.inline
  def apply(
    headers: js.Array[NameValuePair] = null,
    method: String = null,
    postData: Anon_MimeType = null,
    url: String = null
  ): HttpArchiveRequest = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (postData != null) __obj.updateDynamic("postData")(postData)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[HttpArchiveRequest]
  }
}

