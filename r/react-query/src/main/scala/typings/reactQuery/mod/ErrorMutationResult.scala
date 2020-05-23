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
    data: TResult = null,
    error: js.Any = null
  ): ErrorMutationResult[TResult] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorMutationResult[TResult]]
  }
}

