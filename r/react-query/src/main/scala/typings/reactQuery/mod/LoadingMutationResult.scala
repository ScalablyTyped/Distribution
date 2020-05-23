package typings.reactQuery.mod

import typings.reactQuery.reactQueryStrings.loading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingMutationResult[TResult]
  extends MutationResultBase[TResult]
     with MutationResult[TResult] {
  @JSName("data")
  var data_LoadingMutationResult: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("error")
  var error_LoadingMutationResult: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("status")
  var status_LoadingMutationResult: loading
}

object LoadingMutationResult {
  @scala.inline
  def apply[TResult](
    promise: js.Promise[TResult],
    reset: () => Unit,
    status: loading,
    data: TResult = null,
    error: js.Any = null
  ): LoadingMutationResult[TResult] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingMutationResult[TResult]]
  }
}

