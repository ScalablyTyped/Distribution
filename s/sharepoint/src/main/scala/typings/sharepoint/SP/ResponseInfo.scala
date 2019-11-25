package typings.sharepoint.SP

import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseInfo extends js.Object {
  var allResponseHeaders: js.UndefOr[String] = js.undefined
  /** Can be string or bytearray depending on request.binaryStringResponseBody field */
  var body: js.UndefOr[String | Uint8Array] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var responseAvailable: Boolean
  var state: js.UndefOr[js.Any] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
}

object ResponseInfo {
  @scala.inline
  def apply(
    responseAvailable: Boolean,
    allResponseHeaders: String = null,
    body: String | Uint8Array = null,
    contentType: String = null,
    headers: StringDictionary[String] = null,
    state: js.Any = null,
    statusCode: Int | Double = null,
    statusText: String = null
  ): ResponseInfo = {
    val __obj = js.Dynamic.literal(responseAvailable = responseAvailable.asInstanceOf[js.Any])
    if (allResponseHeaders != null) __obj.updateDynamic("allResponseHeaders")(allResponseHeaders.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInfo]
  }
}

