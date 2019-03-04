package typings
package rollingDashRateDashLimiterLib.rollingDashRateDashLimiterMod.RollingRateLimiterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompatibleRedisClient extends js.Object {
  def multi(): js.Any
}

object CompatibleRedisClient {
  @scala.inline
  def apply(multi: js.Function0[js.Any]): CompatibleRedisClient = {
    val __obj = js.Dynamic.literal(multi = multi)
  
    __obj.asInstanceOf[CompatibleRedisClient]
  }
}

