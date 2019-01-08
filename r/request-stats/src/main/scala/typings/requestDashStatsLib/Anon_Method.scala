package typings
package requestDashStatsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
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

