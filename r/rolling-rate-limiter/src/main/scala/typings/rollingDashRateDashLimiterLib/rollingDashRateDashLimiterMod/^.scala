package typings
package rollingDashRateDashLimiterLib.rollingDashRateDashLimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rolling-rate-limiter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    options: rollingDashRateDashLimiterLib.rollingDashRateDashLimiterMod.RollingRateLimiterNs.InMemoryOptions
  ): rollingDashRateDashLimiterLib.rollingDashRateDashLimiterMod.RollingRateLimiterNs.SyncOrAsyncLimiter = js.native
  def apply(
    options: rollingDashRateDashLimiterLib.rollingDashRateDashLimiterMod.RollingRateLimiterNs.WithRedisOptions
  ): rollingDashRateDashLimiterLib.rollingDashRateDashLimiterMod.RollingRateLimiterNs.AsyncLimiter = js.native
}

