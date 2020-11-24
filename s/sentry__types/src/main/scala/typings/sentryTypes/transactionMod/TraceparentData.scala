package typings.sentryTypes.transactionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@sentry/types.@sentry/types/dist/transaction.TransactionContext, 'traceId' | 'parentSpanId' | 'parentSampled'> */
@js.native
trait TraceparentData extends js.Object {
  
  var parentSampled: js.UndefOr[Boolean] = js.native
  
  var parentSpanId: js.UndefOr[String] = js.native
  
  var traceId: js.UndefOr[String] = js.native
}
object TraceparentData {
  
  @scala.inline
  def apply(): TraceparentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceparentData]
  }
  
  @scala.inline
  implicit class TraceparentDataOps[Self <: TraceparentData] (val x: Self) extends AnyVal {
    
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
    def setParentSampled(value: Boolean): Self = this.set("parentSampled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentSampled: Self = this.set("parentSampled", js.undefined)
    
    @scala.inline
    def setParentSpanId(value: String): Self = this.set("parentSpanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentSpanId: Self = this.set("parentSpanId", js.undefined)
    
    @scala.inline
    def setTraceId(value: String): Self = this.set("traceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceId: Self = this.set("traceId", js.undefined)
  }
}
