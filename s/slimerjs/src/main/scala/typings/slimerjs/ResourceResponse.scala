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
    val __obj = js.Dynamic.literal(body = body, bodySize = bodySize, contentCharset = contentCharset, headers = headers, httpVersion = httpVersion, id = id, isFileDownloading = isFileDownloading, referrer = referrer, stage = stage, status = status, statusText = statusText, time = time, url = url)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (redirectURL != null) __obj.updateDynamic("redirectURL")(redirectURL)
    __obj.asInstanceOf[ResourceResponse]
  }
}

