package typings.request.mod

import typings.request.AnonMimeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpArchiveRequest extends js.Object {
  var headers: js.UndefOr[js.Array[NameValuePair]] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var postData: js.UndefOr[AnonMimeType] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object HttpArchiveRequest {
  @scala.inline
  def apply(
    headers: js.Array[NameValuePair] = null,
    method: String = null,
    postData: AnonMimeType = null,
    url: String = null
  ): HttpArchiveRequest = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (postData != null) __obj.updateDynamic("postData")(postData.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpArchiveRequest]
  }
}

