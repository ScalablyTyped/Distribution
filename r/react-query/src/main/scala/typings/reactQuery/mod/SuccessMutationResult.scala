package typings.reactQuery.mod

import typings.reactQuery.reactQueryStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessMutationResult[TResult]
  extends MutationResultBase[TResult]
     with MutationResult[TResult] {
  @JSName("data")
  var data_SuccessMutationResult: TResult = js.native
  @JSName("error")
  var error_SuccessMutationResult: js.UndefOr[scala.Nothing] = js.native
  @JSName("status")
  var status_SuccessMutationResult: success = js.native
}

object SuccessMutationResult {
  @scala.inline
  def apply[TResult](data: TResult, promise: js.Promise[TResult], reset: () => Unit, status: success): SuccessMutationResult[TResult] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessMutationResult[TResult]]
  }
  @scala.inline
  implicit class SuccessMutationResultOps[Self <: SuccessMutationResult[_], TResult] (val x: Self with SuccessMutationResult[TResult]) extends AnyVal {
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
    def setData(value: TResult): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: success): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

