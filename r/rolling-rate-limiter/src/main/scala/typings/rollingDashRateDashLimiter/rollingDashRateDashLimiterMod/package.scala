package typings.rollingDashRateDashLimiter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rollingDashRateDashLimiterMod {
  type AsyncLimiter = AsyncLimiterWithToken
  type AsyncLimiterCallback = js.Function3[/* err */ js.Any, /* timeLeft */ Double, /* actionsLeft */ Double, Unit]
  type AsyncLimiterWithToken = js.Function2[/* token */ String, /* callback */ AsyncLimiterCallback, Unit]
  type AsyncLimiterWithoutToken = js.Function1[/* callback */ AsyncLimiterCallback, Unit]
  type InMemoryOptions = GeneralOptions
  type SyncLimiter = js.Function1[/* token */ js.UndefOr[String], Double]
  type SyncOrAsyncLimiter = SyncLimiter with AsyncLimiter
}
