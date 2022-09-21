package typings.sentryTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.miscMod.Primitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var data: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var op: js.UndefOr[String] = js.undefined
  
  var parent_span_id: js.UndefOr[String] = js.undefined
  
  var span_id: String
  
  var start_timestamp: Double
  
  var status: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[StringDictionary[Primitive]] = js.undefined
  
  var timestamp: js.UndefOr[Double] = js.undefined
  
  var trace_id: String
}
object Description {
  
  inline def apply(span_id: String, start_timestamp: Double, trace_id: String): Description = {
    val __obj = js.Dynamic.literal(span_id = span_id.asInstanceOf[js.Any], start_timestamp = start_timestamp.asInstanceOf[js.Any], trace_id = trace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    inline def setParent_span_id(value: String): Self = StObject.set(x, "parent_span_id", value.asInstanceOf[js.Any])
    
    inline def setParent_span_idUndefined: Self = StObject.set(x, "parent_span_id", js.undefined)
    
    inline def setSpan_id(value: String): Self = StObject.set(x, "span_id", value.asInstanceOf[js.Any])
    
    inline def setStart_timestamp(value: Double): Self = StObject.set(x, "start_timestamp", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: StringDictionary[Primitive]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTrace_id(value: String): Self = StObject.set(x, "trace_id", value.asInstanceOf[js.Any])
  }
}
