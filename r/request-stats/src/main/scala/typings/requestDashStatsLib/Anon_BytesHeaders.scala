package typings
package requestDashStatsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BytesHeaders extends js.Object {
  /**
    * Number of bytes sent back to the client
    */
  var bytes: scala.Double
  /**
    * The headers sent back to the client
    */
  var headers: nodeLib.httpMod.OutgoingHttpHeaders
  /**
    * The original `http.ServerResponse` object
    */
  var raw: nodeLib.httpMod.ServerResponse
  /**
    * The HTTP status code returned to the client
    */
  var status: scala.Double
}

object Anon_BytesHeaders {
  @scala.inline
  def apply(
    bytes: scala.Double,
    headers: nodeLib.httpMod.OutgoingHttpHeaders,
    raw: nodeLib.httpMod.ServerResponse,
    status: scala.Double
  ): Anon_BytesHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bytes")(bytes)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Anon_BytesHeaders]
  }
}

