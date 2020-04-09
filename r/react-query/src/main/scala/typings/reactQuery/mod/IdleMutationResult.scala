package typings.reactQuery.mod

import typings.reactQuery.reactQueryStrings.idle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdleMutationResult[TResult]
  extends MutationResultBase[TResult]
     with MutationResult[TResult] {
  @JSName("data")
  var data_IdleMutationResult: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("error")
  var error_IdleMutationResult: Null
  @JSName("status")
  var status_IdleMutationResult: idle
}

object IdleMutationResult {
  @scala.inline
  def apply[TResult](
    error: Null,
    promise: js.Promise[TResult],
    reset: () => Unit,
    status: idle,
    data: js.UndefOr[scala.Nothing] = js.undefined
  ): IdleMutationResult[TResult] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleMutationResult[TResult]]
  }
}

