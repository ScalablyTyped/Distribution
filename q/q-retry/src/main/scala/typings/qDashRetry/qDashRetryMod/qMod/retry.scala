package typings.qDashRetry.qDashRetryMod.qMod

import typings.q.qMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q", "retry")
@js.native
object retry extends js.Object {
  def apply[U](process: js.Function0[IPromise[U] | U]): typings.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def apply[U](process: js.Function0[IPromise[U] | U], limit: Double): typings.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit]
  ): typings.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    limit: Double
  ): typings.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    options: IRetryOptions
  ): typings.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def apply[U](process: js.Function0[IPromise[U] | U], options: IRetryOptions): typings.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
}

