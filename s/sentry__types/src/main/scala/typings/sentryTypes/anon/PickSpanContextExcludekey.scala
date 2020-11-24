package typings.sentryTypes.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@sentry/types.@sentry/types/dist/span.SpanContext, std.Exclude<keyof @sentry/types.@sentry/types/dist/span.SpanContext, 'spanId' | 'sampled' | 'traceId' | 'parentSpanId'>> */
@js.native
trait PickSpanContextExcludekey extends js.Object {
  
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var endTimestamp: js.UndefOr[Double] = js.native
  
  var op: js.UndefOr[String] = js.native
  
  var startTimestamp: js.UndefOr[Double] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[StringDictionary[String]] = js.native
}
object PickSpanContextExcludekey {
  
  @scala.inline
  def apply(): PickSpanContextExcludekey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickSpanContextExcludekey]
  }
  
  @scala.inline
  implicit class PickSpanContextExcludekeyOps[Self <: PickSpanContextExcludekey] (val x: Self) extends AnyVal {
    
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
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEndTimestamp(value: Double): Self = this.set("endTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimestamp: Self = this.set("endTimestamp", js.undefined)
    
    @scala.inline
    def setOp(value: String): Self = this.set("op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOp: Self = this.set("op", js.undefined)
    
    @scala.inline
    def setStartTimestamp(value: Double): Self = this.set("startTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimestamp: Self = this.set("startTimestamp", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
