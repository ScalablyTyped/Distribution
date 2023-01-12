package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.anon.Data
import typings.sentryTypes.anon.Description
import typings.sentryTypes.anon.PickSpanContextExcludekey
import typings.sentryTypes.typesInstrumenterMod.Instrumenter
import typings.sentryTypes.typesMiscMod.Primitive
import typings.sentryTypes.typesTransactionMod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSpanMod {
  
  @js.native
  trait Span
    extends StObject
       with SpanContext {
    
    /**
      * @inheritDoc
      */
    @JSName("data")
    var data_Span: StringDictionary[Any] = js.native
    
    /**
      * Sets the finish timestamp on the current span.
      * @param endTimestamp Takes an endTimestamp if the end should not be the time when you call this function.
      */
    def finish(): Unit = js.native
    def finish(endTimestamp: Double): Unit = js.native
    
    /** Convert the object to JSON for w. spans array info only */
    def getTraceContext(): Data = js.native
    
    /**
      * The instrumenter that created this span.
      */
    @JSName("instrumenter")
    var instrumenter_Span: Instrumenter = js.native
    
    /**
      * Determines whether span was successful (HTTP200)
      */
    def isSuccess(): Boolean = js.native
    
    /**
      * Sets the data attribute on the current span
      * @param key Data key
      * @param value Data value
      */
    def setData(key: String, value: Any): this.type = js.native
    
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
      * Sets the tag attribute on the current span.
      *
      * Can also be used to unset a tag, by passing `undefined`.
      *
      * @param key Tag key
      * @param value Tag value
      */
    def setTag(key: String, value: Primitive): this.type = js.native
    
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
    var tags_Span: StringDictionary[Primitive] = js.native
    
    /** Returns the current span properties as a `SpanContext` */
    def toContext(): SpanContext = js.native
    
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
    
    /** Updates the current span with a new `SpanContext` */
    def updateWithContext(spanContext: SpanContext): this.type = js.native
  }
  
  trait SpanContext extends StObject {
    
    /**
      * Data of the Span.
      */
    var data: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Description of the Span.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Timestamp in seconds (epoch time) indicating when the span ended.
      */
    var endTimestamp: js.UndefOr[Double] = js.undefined
    
    /**
      * The instrumenter that created this span.
      */
    var instrumenter: js.UndefOr[Instrumenter] = js.undefined
    
    /**
      * Operation of the Span.
      */
    var op: js.UndefOr[String] = js.undefined
    
    /**
      * Parent Span ID
      */
    var parentSpanId: js.UndefOr[String] = js.undefined
    
    /**
      * Was this span chosen to be sent as part of the sample?
      */
    var sampled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Span ID
      */
    var spanId: js.UndefOr[String] = js.undefined
    
    /**
      * Timestamp in seconds (epoch time) indicating when the span started.
      */
    var startTimestamp: js.UndefOr[Double] = js.undefined
    
    /**
      * Completion status of the Span.
      * See: {@sentry/tracing SpanStatus} for possible values
      */
    var status: js.UndefOr[String] = js.undefined
    
    /**
      * Tags of the Span.
      */
    var tags: js.UndefOr[StringDictionary[Primitive]] = js.undefined
    
    /**
      * Trace ID
      */
    var traceId: js.UndefOr[String] = js.undefined
  }
  object SpanContext {
    
    inline def apply(): SpanContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpanContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpanContext] (val x: Self) extends AnyVal {
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEndTimestamp(value: Double): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
      
      inline def setEndTimestampUndefined: Self = StObject.set(x, "endTimestamp", js.undefined)
      
      inline def setInstrumenter(value: Instrumenter): Self = StObject.set(x, "instrumenter", value.asInstanceOf[js.Any])
      
      inline def setInstrumenterUndefined: Self = StObject.set(x, "instrumenter", js.undefined)
      
      inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
      
      inline def setParentSpanId(value: String): Self = StObject.set(x, "parentSpanId", value.asInstanceOf[js.Any])
      
      inline def setParentSpanIdUndefined: Self = StObject.set(x, "parentSpanId", js.undefined)
      
      inline def setSampled(value: Boolean): Self = StObject.set(x, "sampled", value.asInstanceOf[js.Any])
      
      inline def setSampledUndefined: Self = StObject.set(x, "sampled", js.undefined)
      
      inline def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
      
      inline def setSpanIdUndefined: Self = StObject.set(x, "spanId", js.undefined)
      
      inline def setStartTimestamp(value: Double): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
      
      inline def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTags(value: StringDictionary[Primitive]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
      
      inline def setTraceIdUndefined: Self = StObject.set(x, "traceId", js.undefined)
    }
  }
}
