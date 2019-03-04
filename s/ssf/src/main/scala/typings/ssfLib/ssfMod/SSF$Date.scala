package typings
package ssfLib.ssfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSF$Date extends js.Object {
  /** number of whole days since relevant epoch, 0 <= D */
  var D: scala.Double
  /** integral number of hours since midnight, 0 <= H < 24 */
  var H: scala.Double
  /** integral number of minutes since the last hour, 0 <= M < 60 */
  var M: scala.Double
  /** integral number of seconds since the last minute, 0 <= S < 60 */
  var S: scala.Double
  /** number of seconds since midnight, 0 <= T < 86400 */
  var T: scala.Double
  /** integral day portion, subject to gregorian YMD constraints */
  var d: scala.Double
  /** integral month portion, 1 <= m <= 12 */
  var m: scala.Double
  /** integral day of week (0=Sunday .. 6=Saturday) 0 <= q <= 6 */
  var q: scala.Double
  /** sub-second part of time, 0 <= u < 1 */
  var u: scala.Double
  /** integral year portion, epoch_year <= y */
  var y: scala.Double
}

object SSF$Date {
  @scala.inline
  def apply(
    D: scala.Double,
    H: scala.Double,
    M: scala.Double,
    S: scala.Double,
    T: scala.Double,
    d: scala.Double,
    m: scala.Double,
    q: scala.Double,
    u: scala.Double,
    y: scala.Double
  ): SSF$Date = {
    val __obj = js.Dynamic.literal(D = D, H = H, M = M, S = S, T = T, d = d, m = m, q = q, u = u, y = y)
  
    __obj.asInstanceOf[SSF$Date]
  }
}

