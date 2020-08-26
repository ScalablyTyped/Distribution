package typings.reactQuery.mod

import typings.reactQuery.reactQueryStrings.loading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadingMutationResult[TResult]
  extends MutationResultBase[TResult]
     with MutationResult[TResult] {
  @JSName("data")
  var data_LoadingMutationResult: js.UndefOr[scala.Nothing] = js.native
  @JSName("error")
  var error_LoadingMutationResult: js.UndefOr[scala.Nothing] = js.native
  @JSName("status")
  var status_LoadingMutationResult: loading = js.native
}

object LoadingMutationResult {
  @scala.inline
  def apply[TResult](promise: js.Promise[TResult], reset: () => Unit, status: loading): LoadingMutationResult[TResult] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingMutationResult[TResult]]
  }
  @scala.inline
  implicit class LoadingMutationResultOps[Self <: LoadingMutationResult[_], TResult] (val x: Self with LoadingMutationResult[TResult]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStatus(value: loading): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

