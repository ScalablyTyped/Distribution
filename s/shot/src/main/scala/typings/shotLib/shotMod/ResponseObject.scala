package typings
package shotLib.shotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseObject extends js.Object {
  /** an object containing the response headers. */
  var headers: Headers
  /** the payload as a UTF-8 encoded string. */
  var payload: java.lang.String
  /** an object containing the raw request and response objects where: */
  var raw: shotLib.Anon_Req
  /** the raw payload as a Buffer. */
  var rawPayload: nodeLib.Buffer
  /** the HTTP status code. */
  var statusCode: scala.Double
  /** the HTTP status message. */
  var statusMessage: java.lang.String
  /** an object containing the response trailers. */
  var trailers: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object ResponseObject {
  @scala.inline
  def apply(
    headers: Headers,
    payload: java.lang.String,
    raw: shotLib.Anon_Req,
    rawPayload: nodeLib.Buffer,
    statusCode: scala.Double,
    statusMessage: java.lang.String,
    trailers: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): ResponseObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("payload")(payload)
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("rawPayload")(rawPayload)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.updateDynamic("statusMessage")(statusMessage)
    __obj.updateDynamic("trailers")(trailers)
    __obj.asInstanceOf[ResponseObject]
  }
}

