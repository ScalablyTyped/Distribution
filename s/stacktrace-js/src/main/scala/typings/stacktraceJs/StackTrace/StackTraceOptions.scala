package typings.stacktraceJs.StackTrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackTraceOptions extends js.Object {
  
  var filter: js.UndefOr[js.Function1[/* stackFrame */ StackFrame, Boolean]] = js.native
  
  var offline: js.UndefOr[Boolean] = js.native
  
  var sourceCache: js.UndefOr[SourceCache] = js.native
}
object StackTraceOptions {
  
  @scala.inline
  def apply(): StackTraceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackTraceOptions]
  }
  
  @scala.inline
  implicit class StackTraceOptionsOps[Self <: StackTraceOptions] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: /* stackFrame */ StackFrame => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setOffline(value: Boolean): Self = this.set("offline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffline: Self = this.set("offline", js.undefined)
    
    @scala.inline
    def setSourceCache(value: SourceCache): Self = this.set("sourceCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCache: Self = this.set("sourceCache", js.undefined)
  }
}
