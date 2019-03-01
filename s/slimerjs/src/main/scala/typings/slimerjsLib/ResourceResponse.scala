package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceResponse extends js.Object {
  var body: js.Any
  var bodySize: scala.Double
  var contentCharset: java.lang.String
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var httpVersion: HttpVersion
  var id: scala.Double
  var isFileDownloading: scala.Boolean
  var redirectURL: js.UndefOr[java.lang.String] = js.undefined
  var referrer: java.lang.String
  var stage: java.lang.String
  var status: scala.Double
  var statusText: java.lang.String
  var time: stdLib.Date
  var url: java.lang.String
}

object ResourceResponse {
  @scala.inline
  def apply(
    body: js.Any,
    bodySize: scala.Double,
    contentCharset: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    httpVersion: HttpVersion,
    id: scala.Double,
    isFileDownloading: scala.Boolean,
    referrer: java.lang.String,
    stage: java.lang.String,
    status: scala.Double,
    statusText: java.lang.String,
    time: stdLib.Date,
    url: java.lang.String,
    contentType: java.lang.String = null,
    redirectURL: java.lang.String = null
  ): ResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("bodySize")(bodySize)
    __obj.updateDynamic("contentCharset")(contentCharset)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("httpVersion")(httpVersion)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isFileDownloading")(isFileDownloading)
    __obj.updateDynamic("referrer")(referrer)
    __obj.updateDynamic("stage")(stage)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusText")(statusText)
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("url")(url)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (redirectURL != null) __obj.updateDynamic("redirectURL")(redirectURL)
    __obj.asInstanceOf[ResourceResponse]
  }
}

