package typings.promiseDashRetry.promiseDashRetryMod

import typings.retry.retryMod.OperationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-retry", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[ResolutionType](options: OperationOptions, retryableFn: RetryableFn[ResolutionType]): js.Promise[ResolutionType] = js.native
  /**
    * Wrap all functions of the object with retry. The params can be entered in either order, just like in the original library.
    *
    * @param retryableFn The function to retry.
    * @param options The options for how long/often to retry the function for.
    * @returns The Promise resolved by the input retryableFn, or rejected (if not retried) from its catch block.
    */
  def apply[ResolutionType](retryableFn: RetryableFn[ResolutionType]): js.Promise[ResolutionType] = js.native
  def apply[ResolutionType](retryableFn: RetryableFn[ResolutionType], options: OperationOptions): js.Promise[ResolutionType] = js.native
}

