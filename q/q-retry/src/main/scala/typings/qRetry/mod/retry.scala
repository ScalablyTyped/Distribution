package typings.qRetry.mod

import typings.q.mod.IPromise
import typings.qRetry.mod.qAugmentingMod.IRetryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("q-retry", "retry")
@js.native
object retry extends js.Object {
  
  def apply[U](process: js.Function0[IPromise[U] | U]): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  def apply[U](process: js.Function0[IPromise[U] | U], limit: Double): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit]
  ): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    limit: Double
  ): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  def apply[U](
    process: js.Function0[IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ Double, Unit],
    options: IRetryOptions
  ): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
  def apply[U](process: js.Function0[IPromise[U] | U], options: IRetryOptions): typings.qRetry.mod.qAugmentingMod.Promise[U] = js.native
}
