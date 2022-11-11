package typings.sentryTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.typesInstrumenterMod.Instrumenter
import typings.sentryTypes.typesMiscMod.Primitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@sentry/types.@sentry/types/types/span.SpanContext, std.Exclude<keyof @sentry/types.@sentry/types/types/span.SpanContext, 'sampled' | 'traceId' | 'parentSpanId'>> */
trait PickSpanContextExcludekey extends StObject {
  
  var data: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var endTimestamp: js.UndefOr[Double] = js.undefined
  
  var instrumenter: js.UndefOr[Instrumenter] = js.undefined
  
  var op: js.UndefOr[String] = js.undefined
  
  var spanId: js.UndefOr[String] = js.undefined
  
  var startTimestamp: js.UndefOr[Double] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[StringDictionary[Primitive]] = js.undefined
}
object PickSpanContextExcludekey {
  
  inline def apply(): PickSpanContextExcludekey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickSpanContextExcludekey]
  }
  
  extension [Self <: PickSpanContextExcludekey](x: Self) {
    
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
    
    inline def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
    
    inline def setSpanIdUndefined: Self = StObject.set(x, "spanId", js.undefined)
    
    inline def setStartTimestamp(value: Double): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: StringDictionary[Primitive]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
