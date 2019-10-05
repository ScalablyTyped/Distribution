package typings.qDashRetry.qDashRetryMod

import typings.q.qMod.IPromise
import typings.qDashRetry.qDashRetryMod.qMod.IRetryOptions
import typings.qDashRetry.qDashRetryMod.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "retry")
@js.native
object retry extends js.Object {
  def apply[U](process: js.Function0[IPromise[U] | U]): Promise[U] = js.native
  def apply[U](process: js.Function0[IPromise[U] | U], limit: Double): Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit]
  ): Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    limit: Double
  ): Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    options: IRetryOptions
  ): Promise[U] = js.native
  def apply[U](process: js.Function0[IPromise[U] | U], options: IRetryOptions): Promise[U] = js.native
}

