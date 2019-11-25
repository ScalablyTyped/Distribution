package typings.ssf.ssfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSF$Date extends js.Object {
  /** number of whole days since relevant epoch, 0 <= D */
  var D: Double
  /** integral number of hours since midnight, 0 <= H < 24 */
  var H: Double
  /** integral number of minutes since the last hour, 0 <= M < 60 */
  var M: Double
  /** integral number of seconds since the last minute, 0 <= S < 60 */
  var S: Double
  /** number of seconds since midnight, 0 <= T < 86400 */
  var T: Double
  /** integral day portion, subject to gregorian YMD constraints */
  var d: Double
  /** integral month portion, 1 <= m <= 12 */
  var m: Double
  /** integral day of week (0=Sunday .. 6=Saturday) 0 <= q <= 6 */
  var q: Double
  /** sub-second part of time, 0 <= u < 1 */
  var u: Double
  /** integral year portion, epoch_year <= y */
  var y: Double
}

object SSF$Date {
  @scala.inline
  def apply(
    D: Double,
    H: Double,
    M: Double,
    S: Double,
    T: Double,
    d: Double,
    m: Double,
    q: Double,
    u: Double,
    y: Double
  ): SSF$Date = {
    val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], H = H.asInstanceOf[js.Any], M = M.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], T = T.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SSF$Date]
  }
}

