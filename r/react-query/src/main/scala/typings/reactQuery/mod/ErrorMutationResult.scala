package typings.reactQuery.mod

import typings.reactQuery.reactQueryStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorMutationResult[TResult]
  extends MutationResultBase[TResult]
     with MutationResult[TResult] {
  @JSName("data")
  var data_ErrorMutationResult: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("status")
  var status_ErrorMutationResult: error
}

object ErrorMutationResult {
  @scala.inline
  def apply[TResult](
    promise: js.Promise[TResult],
    reset: () => Unit,
    status: error,
    data: js.UndefOr[scala.Nothing] = js.undefined,
    error: js.Any = null
  ): ErrorMutationResult[TResult] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorMutationResult[TResult]]
  }
}

