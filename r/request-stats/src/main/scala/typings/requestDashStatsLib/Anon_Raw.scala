package typings
package requestDashStatsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Raw extends js.Object {
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

