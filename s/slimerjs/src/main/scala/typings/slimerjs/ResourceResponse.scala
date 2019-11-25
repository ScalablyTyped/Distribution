package typings.slimerjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceResponse extends js.Object {
  var body: js.Any
  var bodySize: Double
  var contentCharset: String
  var contentType: js.UndefOr[String] = js.undefined
  var headers: StringDictionary[String]
  var httpVersion: HttpVersion
  var id: Double
  var isFileDownloading: Boolean
  var redirectURL: js.UndefOr[String] = js.undefined
  var referrer: String
  var stage: String
  var status: Double
  var statusText: String
  var time: Date
  var url: String
}

object ResourceResponse {
  @scala.inline
  def apply(
    body: js.Any,
    bodySize: Double,
    contentCharset: String,
    headers: StringDictionary[String],
    httpVersion: HttpVersion,
    id: Double,
    isFileDownloading: Boolean,
    referrer: String,
    stage: String,
    status: Double,
    statusText: String,
    time: Date,
    url: String,
    contentType: String = null,
    redirectURL: String = null
  ): ResourceResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], bodySize = bodySize.asInstanceOf[js.Any], contentCharset = contentCharset.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFileDownloading = isFileDownloading.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (redirectURL != null) __obj.updateDynamic("redirectURL")(redirectURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceResponse]
  }
}

