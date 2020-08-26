package typings.reactQuery.mod

import typings.reactQuery.reactQueryStrings.idle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdleMutationResult[TResult]
  extends MutationResultBase[TResult]
     with MutationResult[TResult] {
  @JSName("data")
  var data_IdleMutationResult: js.UndefOr[scala.Nothing] = js.native
  @JSName("error")
  var error_IdleMutationResult: Null = js.native
  @JSName("status")
  var status_IdleMutationResult: idle = js.native
}

object IdleMutationResult {
  @scala.inline
  def apply[TResult](error: Null, promise: js.Promise[TResult], reset: () => Unit, status: idle): IdleMutationResult[TResult] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleMutationResult[TResult]]
  }
  @scala.inline
  implicit class IdleMutationResultOps[Self <: IdleMutationResult[_], TResult] (val x: Self with IdleMutationResult[TResult]) extends AnyVal {
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
    def setError(value: Null): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: idle): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

