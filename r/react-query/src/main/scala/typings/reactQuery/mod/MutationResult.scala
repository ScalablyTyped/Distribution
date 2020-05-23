package typings.reactQuery.mod

import typings.reactQuery.reactQueryStrings.error
import typings.reactQuery.reactQueryStrings.idle
import typings.reactQuery.reactQueryStrings.loading
import typings.reactQuery.reactQueryStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactQuery.mod.IdleMutationResult[TResult]
  - typings.reactQuery.mod.LoadingMutationResult[TResult]
  - typings.reactQuery.mod.ErrorMutationResult[TResult]
  - typings.reactQuery.mod.SuccessMutationResult[TResult]
*/
trait MutationResult[TResult] extends js.Object

object MutationResult {
  @scala.inline
  def IdleMutationResult[TResult](error: Null, promise: js.Promise[TResult], reset: () => Unit, status: idle, data: TResult = null): MutationResult[TResult] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[TResult]]
  }
  @scala.inline
  def LoadingMutationResult[TResult](
    promise: js.Promise[TResult],
    reset: () => Unit,
    status: loading,
    data: TResult = null,
    error: js.Any = null
  ): MutationResult[TResult] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[TResult]]
  }
  @scala.inline
  def ErrorMutationResult[TResult](
    promise: js.Promise[TResult],
    reset: () => Unit,
    status: error,
    data: TResult = null,
    error: js.Any = null
  ): MutationResult[TResult] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[TResult]]
  }
  @scala.inline
  def SuccessMutationResult[TResult](
    data: TResult,
    promise: js.Promise[TResult],
    reset: () => Unit,
    status: success,
    error: js.Any = null
  ): MutationResult[TResult] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[TResult]]
  }
}

