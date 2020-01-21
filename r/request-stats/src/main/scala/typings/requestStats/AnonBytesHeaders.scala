package typings.requestStats

import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBytesHeaders extends js.Object {
  /**
    * Number of bytes sent back to the client
    */
  var bytes: Double
  /**
    * The headers sent back to the client
    */
  var headers: OutgoingHttpHeaders
  /**
    * The original `http.ServerResponse` object
    */
  var raw: ServerResponse
  /**
    * The HTTP status code returned to the client
    */
  var status: Double
}

object AnonBytesHeaders {
  @scala.inline
  def apply(bytes: Double, headers: OutgoingHttpHeaders, raw: ServerResponse, status: Double): AnonBytesHeaders = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBytesHeaders]
  }
}

