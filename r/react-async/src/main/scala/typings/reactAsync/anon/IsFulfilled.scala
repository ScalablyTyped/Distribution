package typings.reactAsync.anon

import typings.reactAsync.reactAsyncBooleans.`false`
import typings.reactAsync.reactAsyncBooleans.`true`
import typings.reactAsync.reactAsyncStrings.rejected
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsFulfilled[T] extends js.Object {
  var data: js.UndefOr[T] = js.native
  var error: typings.std.Error = js.native
  var finishedAt: Date = js.native
  var isFulfilled: `false` = js.native
  var isInitial: `false` = js.native
  var isLoading: `false` = js.native
  var isPending: `false` = js.native
  var isRejected: `true` = js.native
  var isResolved: `false` = js.native
  var isSettled: `true` = js.native
  var startedAt: Date = js.native
  var status: rejected = js.native
  var value: typings.std.Error = js.native
}

object IsFulfilled {
  @scala.inline
  def apply[T](
    error: typings.std.Error,
    finishedAt: Date,
    isFulfilled: `false`,
    isInitial: `false`,
    isLoading: `false`,
    isPending: `false`,
    isRejected: `true`,
    isResolved: `false`,
    isSettled: `true`,
    startedAt: Date,
    status: rejected,
    value: typings.std.Error
  ): IsFulfilled[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], finishedAt = finishedAt.asInstanceOf[js.Any], isFulfilled = isFulfilled.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isPending = isPending.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], isResolved = isResolved.asInstanceOf[js.Any], isSettled = isSettled.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFulfilled[T]]
  }
  @scala.inline
  implicit class IsFulfilledOps[Self <: IsFulfilled[_], T] (val x: Self with IsFulfilled[T]) extends AnyVal {
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
    def setError(value: typings.std.Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinishedAt(value: Date): Self = this.set("finishedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFulfilled(value: `false`): Self = this.set("isFulfilled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInitial(value: `false`): Self = this.set("isInitial", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLoading(value: `false`): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPending(value: `false`): Self = this.set("isPending", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRejected(value: `true`): Self = this.set("isRejected", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsResolved(value: `false`): Self = this.set("isResolved", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSettled(value: `true`): Self = this.set("isSettled", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartedAt(value: Date): Self = this.set("startedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: rejected): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: typings.std.Error): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

