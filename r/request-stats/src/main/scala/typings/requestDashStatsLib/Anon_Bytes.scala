package typings
package requestDashStatsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bytes extends js.Object {
  /**
    * Number of bytes sent by the client
    */
  var bytes: scala.Double
  /**
    * The headers sent by the client
    */
  var headers: nodeLib.httpMod.IncomingHttpHeaders
  /**
    * The remote ip
    */
  var ip: java.lang.String
  /**
    * The HTTP method used by the client
    */
  var method: java.lang.String
  /**
    * The path part of the request URL
    */
  var path: java.lang.String
  /**
    * The original `http.IncomingMessage` object
    */
  var raw: nodeLib.httpMod.IncomingMessage
}

object Anon_Bytes {
  @scala.inline
  def apply(
    bytes: scala.Double,
    headers: nodeLib.httpMod.IncomingHttpHeaders,
    ip: java.lang.String,
    method: java.lang.String,
    path: java.lang.String,
    raw: nodeLib.httpMod.IncomingMessage
  ): Anon_Bytes = {
    val __obj = js.Dynamic.literal(bytes = bytes, headers = headers, ip = ip, method = method, path = path, raw = raw)
  
    __obj.asInstanceOf[Anon_Bytes]
  }
}

