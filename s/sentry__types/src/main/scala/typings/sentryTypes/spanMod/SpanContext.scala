package typings.sentryTypes.spanMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpanContext extends js.Object {
  
  /**
    * Data of the Span.
    */
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Description of the Span.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Timestamp in seconds (epoch time) indicating when the span ended.
    */
  var endTimestamp: js.UndefOr[Double] = js.native
  
  /**
    * Operation of the Span.
    */
  var op: js.UndefOr[String] = js.native
  
  /**
    * Parent Span ID
    */
  var parentSpanId: js.UndefOr[String] = js.native
  
  /**
    * Was this span chosen to be sent as part of the sample?
    */
  var sampled: js.UndefOr[Boolean] = js.native
  
  /**
    * Span ID
    */
  var spanId: js.UndefOr[String] = js.native
  
  /**
    * Timestamp in seconds (epoch time) indicating when the span started.
    */
  var startTimestamp: js.UndefOr[Double] = js.native
  
  /**
    * Completion status of the Span.
    * See: {@sentry/tracing SpanStatus} for possible values
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Tags of the Span.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Trace ID
    */
  var traceId: js.UndefOr[String] = js.native
}
object SpanContext {
  
  @scala.inline
  def apply(): SpanContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpanContext]
  }
  
  @scala.inline
  implicit class SpanContextOps[Self <: SpanContext] (val x: Self) extends AnyVal {
    
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
    def setParentSpanId(value: String): Self = this.set("parentSpanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentSpanId: Self = this.set("parentSpanId", js.undefined)
    
    @scala.inline
    def setSampled(value: Boolean): Self = this.set("sampled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampled: Self = this.set("sampled", js.undefined)
    
    @scala.inline
    def setSpanId(value: String): Self = this.set("spanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpanId: Self = this.set("spanId", js.undefined)
    
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
    
    @scala.inline
    def setTraceId(value: String): Self = this.set("traceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceId: Self = this.set("traceId", js.undefined)
  }
}
