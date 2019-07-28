package typings.shot.shotMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.shot.Anon_Req
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseObject extends js.Object {
  /** an object containing the response headers. */
  var headers: Headers
  /** the payload as a UTF-8 encoded string. */
  var payload: String
  /** an object containing the raw request and response objects where: */
  var raw: Anon_Req
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
    raw: Anon_Req,
    rawPayload: Buffer,
    statusCode: Double,
    statusMessage: String,
    trailers: StringDictionary[js.Any]
  ): ResponseObject = {
    val __obj = js.Dynamic.literal(headers = headers, payload = payload, raw = raw, rawPayload = rawPayload, statusCode = statusCode, statusMessage = statusMessage, trailers = trailers)
  
    __obj.asInstanceOf[ResponseObject]
  }
}

