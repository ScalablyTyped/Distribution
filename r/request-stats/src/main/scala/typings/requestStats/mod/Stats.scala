package typings.requestStats.mod

import typings.requestStats.anon.Bytes
import typings.requestStats.anon.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  /**
    * `true` if the connection was closed correctly and `false` otherwise
    */
  var ok: Boolean
  var req: Bytes
  var res: Headers
  /**
    * The milliseconds it took to serve the request
    */
  var time: Double
}

object Stats {
  @scala.inline
  def apply(ok: Boolean, req: Bytes, res: Headers, time: Double): Stats = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

