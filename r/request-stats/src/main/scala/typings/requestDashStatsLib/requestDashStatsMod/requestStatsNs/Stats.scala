package typings
package requestDashStatsLib.requestDashStatsMod.requestStatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  /**
    * `true` if the connection was closed correctly and `false` otherwise
    */
  var ok: scala.Boolean
  var req: requestDashStatsLib.Anon_Method
  var res: requestDashStatsLib.Anon_Raw
  /**
    * The milliseconds it took to serve the request
    */
  var time: scala.Double
}

