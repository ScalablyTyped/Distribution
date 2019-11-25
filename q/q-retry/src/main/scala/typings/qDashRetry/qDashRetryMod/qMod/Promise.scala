package typings.qDashRetry.qDashRetryMod.qMod

import typings.q.qMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise[T] extends js.Object {
  def retry[U](process: js.Function1[/* value */ T, IPromise[U] | U]): typings.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](process: js.Function1[/* value */ T, IPromise[U] | U], limit: Double): typings.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](
    process: js.Function1[/* value */ T, IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit]
  ): typings.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](
    process: js.Function1[/* value */ T, IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    limit: Double
  ): typings.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](
    process: js.Function1[/* value */ T, IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    options: IRetryOptions
  ): typings.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](process: js.Function1[/* value */ T, IPromise[U] | U], options: IRetryOptions): typings.qDashRetry.qDashRetryMod.qMod.Promise[U] = js.native
}

