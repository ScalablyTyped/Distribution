package typings.requestStats.anon

import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bytes extends js.Object {
  /**
    * Number of bytes sent by the client
    */
  var bytes: Double
  /**
    * The headers sent by the client
    */
  var headers: IncomingHttpHeaders
  /**
    * The remote ip
    */
  var ip: String
  /**
    * The HTTP method used by the client
    */
  var method: String
  /**
    * The path part of the request URL
    */
  var path: String
  /**
    * The original `http.IncomingMessage` object
    */
  var raw: IncomingMessage
}

object Bytes {
  @scala.inline
  def apply(
    bytes: Double,
    headers: IncomingHttpHeaders,
    ip: String,
    method: String,
    path: String,
    raw: IncomingMessage
  ): Bytes = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bytes]
  }
}

