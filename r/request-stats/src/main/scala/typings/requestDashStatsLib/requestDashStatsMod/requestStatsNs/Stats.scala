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
  var req: requestDashStatsLib.Anon_Bytes
  var res: requestDashStatsLib.Anon_BytesHeaders
  /**
    * The milliseconds it took to serve the request
    */
  var time: scala.Double
}

object Stats {
  @scala.inline
  def apply(
    ok: scala.Boolean,
    req: requestDashStatsLib.Anon_Bytes,
    res: requestDashStatsLib.Anon_BytesHeaders,
    time: scala.Double
  ): Stats = {
    val __obj = js.Dynamic.literal(ok = ok, req = req, res = res, time = time)
  
    __obj.asInstanceOf[Stats]
  }
}

