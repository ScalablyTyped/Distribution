package typings.shot.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.shot.AnonReq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseObject extends js.Object {
  /** an object containing the response headers. */
  var headers: Headers
  /** the payload as a UTF-8 encoded string. */
  var payload: String
  /** an object containing the raw request and response objects where: */
  var raw: AnonReq
  /** the raw payload as a Buffer. */
  var rawPayload: Buffer
  /** the HTTP status code. */
  var statusCode: Double
  /** the HTTP status message. */
  var statusMessage: String
  /** an object containing the response trailers. */
  var trailers: StringDictionary[js.Any]
}

object ResponseObject {
  @scala.inline
  def apply(
    headers: Headers,
    payload: String,
    raw: AnonReq,
    rawPayload: Buffer,
    statusCode: Double,
    statusMessage: String,
    trailers: StringDictionary[js.Any]
  ): ResponseObject = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rawPayload = rawPayload.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], trailers = trailers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
}

