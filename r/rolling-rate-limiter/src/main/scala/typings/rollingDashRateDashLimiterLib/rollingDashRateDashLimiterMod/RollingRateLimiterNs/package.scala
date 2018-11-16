package typings
package rollingDashRateDashLimiterLib.rollingDashRateDashLimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RollingRateLimiterNs {
  type AsyncLimiter = AsyncLimiterWithToken
  type AsyncLimiterCallback = js.Function3[
    /* err */ js.Any, 
    /* timeLeft */ scala.Double, 
    /* actionsLeft */ scala.Double, 
    scala.Unit
  ]
  type AsyncLimiterWithToken = js.Function2[/* token */ java.lang.String, /* callback */ AsyncLimiterCallback, scala.Unit]
  type AsyncLimiterWithoutToken = js.Function1[/* callback */ AsyncLimiterCallback, scala.Unit]
  type InMemoryOptions = GeneralOptions
  type SyncLimiter = js.Function1[/* token */ js.UndefOr[java.lang.String], scala.Double]
  type SyncOrAsyncLimiter = SyncLimiter with AsyncLimiter
}
