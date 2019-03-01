package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseInfo extends js.Object {
  var allResponseHeaders: js.UndefOr[java.lang.String] = js.undefined
  /** Can be string or bytearray depending on request.binaryStringResponseBody field */
  var body: js.UndefOr[java.lang.String | stdLib.Uint8Array] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var responseAvailable: scala.Boolean
  var state: js.UndefOr[js.Any] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}

object ResponseInfo {
  @scala.inline
  def apply(
    responseAvailable: scala.Boolean,
    allResponseHeaders: java.lang.String = null,
    body: java.lang.String | stdLib.Uint8Array = null,
    contentType: java.lang.String = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    state: js.Any = null,
    statusCode: scala.Int | scala.Double = null,
    statusText: java.lang.String = null
  ): ResponseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("responseAvailable")(responseAvailable)
    if (allResponseHeaders != null) __obj.updateDynamic("allResponseHeaders")(allResponseHeaders)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (state != null) __obj.updateDynamic("state")(state)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[ResponseInfo]
  }
}

