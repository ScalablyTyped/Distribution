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
  def IdleMutationResult[TResult](error: Null, promise: js.Promise[TResult], reset: () => Unit, status: idle): MutationResult[TResult] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[TResult]]
  }
  @scala.inline
  def LoadingMutationResult[TResult](promise: js.Promise[TResult], reset: () => Unit, status: loading): MutationResult[TResult] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[TResult]]
  }
  @scala.inline
  def ErrorMutationResult[TResult](promise: js.Promise[TResult], reset: () => Unit, status: error): MutationResult[TResult] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[TResult]]
  }
  @scala.inline
  def SuccessMutationResult[TResult](data: TResult, promise: js.Promise[TResult], reset: () => Unit, status: success): MutationResult[TResult] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[TResult]]
  }
}

