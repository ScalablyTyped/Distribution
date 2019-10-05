package typings.qDashRetry.qDashRetryMod

import typings.q.qMod.IWhenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "Promise")
@js.native
object Promise extends js.Object {
  def apply[T](
    resolver: js.Function3[
      /* resolve */ js.Function1[/* val */ js.UndefOr[IWhenable[T]], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      /* notify */ js.Function1[/* progress */ js.Any, Unit], 
      Unit
    ]
  ): typings.q.qMod.Promise[T] = js.native
}

