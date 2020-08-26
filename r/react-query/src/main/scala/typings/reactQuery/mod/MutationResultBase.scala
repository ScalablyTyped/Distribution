package typings.reactQuery.mod

import typings.reactQuery.reactQueryStrings.error
import typings.reactQuery.reactQueryStrings.idle
import typings.reactQuery.reactQueryStrings.loading
import typings.reactQuery.reactQueryStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationResultBase[TResult] extends js.Object {
  var data: js.UndefOr[TResult] = js.native
  var error: Null | js.Any = js.native
  var promise: js.Promise[TResult] = js.native
  var status: idle | loading | error | success = js.native
  def reset(): Unit = js.native
}

object MutationResultBase {
  @scala.inline
  def apply[TResult](promise: js.Promise[TResult], reset: () => Unit, status: idle | loading | error | success): MutationResultBase[TResult] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResultBase[TResult]]
  }
  @scala.inline
  implicit class MutationResultBaseOps[Self <: MutationResultBase[_], TResult] (val x: Self with MutationResultBase[TResult]) extends AnyVal {
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
    def setPromise(value: js.Promise[TResult]): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setStatus(value: idle | loading | error | success): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: TResult): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
  }
  
}

