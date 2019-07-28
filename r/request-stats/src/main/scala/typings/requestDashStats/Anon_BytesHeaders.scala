package typings.requestDashStats

import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BytesHeaders extends js.Object {
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

object Anon_BytesHeaders {
  @scala.inline
  def apply(bytes: Double, headers: OutgoingHttpHeaders, raw: ServerResponse, status: Double): Anon_BytesHeaders = {
    val __obj = js.Dynamic.literal(bytes = bytes, headers = headers, raw = raw, status = status)
  
    __obj.asInstanceOf[Anon_BytesHeaders]
  }
}

