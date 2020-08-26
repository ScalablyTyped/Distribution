package typings.reactAsync.anon

import typings.reactAsync.reactAsyncBooleans.`false`
import typings.reactAsync.reactAsyncBooleans.`true`
import typings.reactAsync.reactAsyncStrings.fulfilled
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data[T] extends js.Object {
  var data: T = js.native
  var error: js.UndefOr[scala.Nothing] = js.native
  var finishedAt: Date = js.native
  var isFulfilled: `true` = js.native
  var isInitial: `false` = js.native
  var isLoading: `false` = js.native
  var isPending: `false` = js.native
  var isRejected: `false` = js.native
  var isResolved: `true` = js.native
  var isSettled: `true` = js.native
  var startedAt: Date = js.native
  var status: fulfilled = js.native
  var value: T = js.native
}

object Data {
  @scala.inline
  def apply[T](
    data: T,
    finishedAt: Date,
    isFulfilled: `true`,
    isInitial: `false`,
    isLoading: `false`,
    isPending: `false`,
    isRejected: `false`,
    isResolved: `true`,
    isSettled: `true`,
    startedAt: Date,
    status: fulfilled,
    value: T
  ): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], finishedAt = finishedAt.asInstanceOf[js.Any], isFulfilled = isFulfilled.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isPending = isPending.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], isResolved = isResolved.asInstanceOf[js.Any], isSettled = isSettled.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
  @scala.inline
  implicit class DataOps[Self <: Data[_], T] (val x: Self with Data[T]) extends AnyVal {
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
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinishedAt(value: Date): Self = this.set("finishedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFulfilled(value: `true`): Self = this.set("isFulfilled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInitial(value: `false`): Self = this.set("isInitial", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLoading(value: `false`): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPending(value: `false`): Self = this.set("isPending", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRejected(value: `false`): Self = this.set("isRejected", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsResolved(value: `true`): Self = this.set("isResolved", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSettled(value: `true`): Self = this.set("isSettled", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartedAt(value: Date): Self = this.set("startedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: fulfilled): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

