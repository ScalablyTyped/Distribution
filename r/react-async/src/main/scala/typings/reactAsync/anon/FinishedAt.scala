package typings.reactAsync.anon

import typings.reactAsync.reactAsyncBooleans.`false`
import typings.reactAsync.reactAsyncBooleans.`true`
import typings.reactAsync.reactAsyncStrings.pending
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinishedAt[T] extends js.Object {
  
  var data: js.UndefOr[T] = js.native
  
  var error: js.UndefOr[typings.std.Error] = js.native
  
  var finishedAt: js.UndefOr[scala.Nothing] = js.native
  
  var isFulfilled: `false` = js.native
  
  var isInitial: `false` = js.native
  
  var isLoading: `true` = js.native
  
  var isPending: `true` = js.native
  
  var isRejected: `false` = js.native
  
  var isResolved: `false` = js.native
  
  var isSettled: `false` = js.native
  
  var startedAt: Date = js.native
  
  var status: pending = js.native
  
  var value: js.UndefOr[T | typings.std.Error] = js.native
}
object FinishedAt {
  
  @scala.inline
  def apply[T](
    isFulfilled: `false`,
    isInitial: `false`,
    isLoading: `true`,
    isPending: `true`,
    isRejected: `false`,
    isResolved: `false`,
    isSettled: `false`,
    startedAt: Date,
    status: pending
  ): FinishedAt[T] = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isPending = isPending.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], isResolved = isResolved.asInstanceOf[js.Any], isSettled = isSettled.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishedAt[T]]
  }
  
  @scala.inline
  implicit class FinishedAtOps[Self <: FinishedAt[_], T] (val x: Self with FinishedAt[T]) extends AnyVal {
    
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
    def setIsLoading(value: `true`): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPending(value: `true`): Self = this.set("isPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRejected(value: `false`): Self = this.set("isRejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResolved(value: `false`): Self = this.set("isResolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSettled(value: `false`): Self = this.set("isSettled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAt(value: Date): Self = this.set("startedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: pending): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setError(value: typings.std.Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setValue(value: T | typings.std.Error): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
