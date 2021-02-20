package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.anon.Data
import typings.sentryTypes.anon.Description
import typings.sentryTypes.anon.PickSpanContextExcludekey
import typings.sentryTypes.transactionMod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spanMod {
  
  @js.native
  trait Span extends SpanContext {
    
    /**
      * Use {@link startChild}
      * @deprecated
      */
    def child(): Span = js.native
    def child(spanContext: PickSpanContextExcludekey): Span = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("data")
    var data_Span: StringDictionary[js.Any] = js.native
    
    /**
      * Sets the finish timestamp on the current span.
      * @param endTimestamp Takes an endTimestamp if the end should not be the time when you call this function.
      */
    def finish(): Unit = js.native
    def finish(endTimestamp: Double): Unit = js.native
    
    /** Convert the object to JSON for w. spans array info only */
    def getTraceContext(): Data = js.native
    
    /**
      * Determines whether span was successful (HTTP200)
      */
    def isSuccess(): Boolean = js.native
    
    /**
      * Sets the data attribute on the current span
      * @param key Data key
      * @param value Data value
      */
    def setData(key: String, value: js.Any): this.type = js.native
    
    /**
      * Sets the status attribute on the current span based on the http code
      * @param httpStatus http code used to set the status
      */
    def setHttpStatus(httpStatus: Double): this.type = js.native
    
    /**
      * Sets the status attribute on the current span
      * See: {@sentry/tracing SpanStatus} for possible values
      * @param status http code used to set the status
      */
    def setStatus(status: String): this.type = js.native
    
    /**
      * Sets the tag attribute on the current span
      * @param key Tag key
      * @param value Tag value
      */
    def setTag(key: String, value: String): this.type = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("spanId")
    var spanId_Span: String = js.native
    
    /**
      * Creates a new `Span` while setting the current `Span.id` as `parentSpanId`.
      * Also the `sampled` decision will be inherited.
      */
    def startChild(): Span = js.native
    def startChild(spanContext: PickSpanContextExcludekey): Span = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("startTimestamp")
    var startTimestamp_Span: Double = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("tags")
    var tags_Span: StringDictionary[String] = js.native
    
    /** Convert the object to JSON */
    def toJSON(): Description = js.native
    
    /** Return a traceparent compatible header string */
    def toTraceparent(): String = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("traceId")
    var traceId_Span: String = js.native
    
    /**
      * The transaction containing this span
      */
    var transaction: js.UndefOr[Transaction] = js.native
  }
  
  @js.native
  trait SpanContext extends StObject {
    
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
    implicit class SpanContextMutableBuilder[Self <: SpanContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEndTimestamp(value: Double): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimestampUndefined: Self = StObject.set(x, "endTimestamp", js.undefined)
      
      @scala.inline
      def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
      
      @scala.inline
      def setParentSpanId(value: String): Self = StObject.set(x, "parentSpanId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentSpanIdUndefined: Self = StObject.set(x, "parentSpanId", js.undefined)
      
      @scala.inline
      def setSampled(value: Boolean): Self = StObject.set(x, "sampled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampledUndefined: Self = StObject.set(x, "sampled", js.undefined)
      
      @scala.inline
      def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanIdUndefined: Self = StObject.set(x, "spanId", js.undefined)
      
      @scala.inline
      def setStartTimestamp(value: Double): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceIdUndefined: Self = StObject.set(x, "traceId", js.undefined)
    }
  }
}
