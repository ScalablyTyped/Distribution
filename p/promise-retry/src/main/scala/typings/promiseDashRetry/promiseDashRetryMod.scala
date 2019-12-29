package typings.promiseDashRetry

import typings.retry.retryMod.OperationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-retry", JSImport.Namespace)
@js.native
object promiseDashRetryMod extends js.Object {
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
  /**
    * A function that is retryable, by having implicitly-bound params for both an error handler and an attempt number.
    *
    * @param retry The retry callback upon any rejection. Essentially throws the error on in the form of a { retried: err }
    * wrapper, and tags it with a 'code' field of value "EPROMISERETRY" so that it is recognised as needing retrying. Call
    * this from the catch() block when you want to retry a rejected attempt.
    * @param attempt The number of the attempt.
    * @returns A Promise for anything (eg. a HTTP response).
    */
  type RetryableFn[ResolutionType] = js.Function2[
    /* retry */ js.Function1[/* error */ js.Any, scala.Nothing], 
    /* attempt */ Double, 
    js.Promise[ResolutionType]
  ]
}

