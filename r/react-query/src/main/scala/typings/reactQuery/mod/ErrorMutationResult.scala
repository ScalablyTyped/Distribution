package typings.reactQuery.mod

import typings.reactQuery.reactQueryStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorMutationResult[TResult]
  extends MutationResultBase[TResult]
     with MutationResult[TResult] {
  @JSName("data")
  var data_ErrorMutationResult: js.UndefOr[scala.Nothing] = js.native
  @JSName("status")
  var status_ErrorMutationResult: error = js.native
}

object ErrorMutationResult {
  @scala.inline
  def apply[TResult](promise: js.Promise[TResult], reset: () => Unit, status: error): ErrorMutationResult[TResult] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorMutationResult[TResult]]
  }
  @scala.inline
  implicit class ErrorMutationResultOps[Self <: ErrorMutationResult[_], TResult] (val x: Self with ErrorMutationResult[TResult]) extends AnyVal {
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
    def setStatus(value: error): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

