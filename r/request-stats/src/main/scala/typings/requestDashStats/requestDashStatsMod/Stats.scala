package typings.requestDashStats.requestDashStatsMod

import typings.requestDashStats.Anon_Bytes
import typings.requestDashStats.Anon_BytesHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  /**
    * `true` if the connection was closed correctly and `false` otherwise
    */
  var ok: Boolean
  var req: Anon_Bytes
  var res: Anon_BytesHeaders
  /**
    * The milliseconds it took to serve the request
    */
  var time: Double
}

object Stats {
  @scala.inline
  def apply(ok: Boolean, req: Anon_Bytes, res: Anon_BytesHeaders, time: Double): Stats = {
    val __obj = js.Dynamic.literal(ok = ok, req = req, res = res, time = time)
  
    __obj.asInstanceOf[Stats]
  }
}

