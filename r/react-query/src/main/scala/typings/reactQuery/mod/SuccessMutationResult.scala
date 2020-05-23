package typings.reactQuery.mod

import typings.reactQuery.reactQueryStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessMutationResult[TResult]
  extends MutationResultBase[TResult]
     with MutationResult[TResult] {
  @JSName("data")
  var data_SuccessMutationResult: TResult
  @JSName("error")
  var error_SuccessMutationResult: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("status")
  var status_SuccessMutationResult: success
}

object SuccessMutationResult {
  @scala.inline
  def apply[TResult](
    data: TResult,
    promise: js.Promise[TResult],
    reset: () => Unit,
    status: success,
    error: js.Any = null
  ): SuccessMutationResult[TResult] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessMutationResult[TResult]]
  }
}

