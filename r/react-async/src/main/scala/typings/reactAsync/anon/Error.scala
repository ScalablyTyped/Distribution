package typings.reactAsync.anon

import typings.reactAsync.reactAsyncBooleans.`false`
import typings.reactAsync.reactAsyncStrings.initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  var data: js.UndefOr[scala.Nothing] = js.native
  var error: js.UndefOr[scala.Nothing] = js.native
  var finishedAt: js.UndefOr[scala.Nothing] = js.native
  var initialValue: js.UndefOr[scala.Nothing] = js.native
  var isFulfilled: `false` = js.native
  var isInitial: `false` = js.native
  var isLoading: `false` = js.native
  var isPending: `false` = js.native
  var isRejected: `false` = js.native
  var isResolved: `false` = js.native
  var isSettled: `false` = js.native
  var startedAt: js.UndefOr[scala.Nothing] = js.native
  var status: initial = js.native
  var value: js.UndefOr[scala.Nothing] = js.native
}

object Error {
  @scala.inline
  def apply(
    isFulfilled: `false`,
    isInitial: `false`,
    isLoading: `false`,
    isPending: `false`,
    isRejected: `false`,
    isResolved: `false`,
    isSettled: `false`,
    status: initial
  ): Error = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isPending = isPending.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], isResolved = isResolved.asInstanceOf[js.Any], isSettled = isSettled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
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
    def setIsFulfilled(value: `false`): Self = this.set("isFulfilled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInitial(value: `false`): Self = this.set("isInitial", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLoading(value: `false`): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPending(value: `false`): Self = this.set("isPending", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRejected(value: `false`): Self = this.set("isRejected", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsResolved(value: `false`): Self = this.set("isResolved", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSettled(value: `false`): Self = this.set("isSettled", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: initial): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

