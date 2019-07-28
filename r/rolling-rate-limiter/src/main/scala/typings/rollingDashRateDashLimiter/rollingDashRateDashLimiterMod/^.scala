package typings.rollingDashRateDashLimiter.rollingDashRateDashLimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rolling-rate-limiter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: InMemoryOptions): SyncOrAsyncLimiter = js.native
  def apply(options: WithRedisOptions): AsyncLimiter = js.native
}

