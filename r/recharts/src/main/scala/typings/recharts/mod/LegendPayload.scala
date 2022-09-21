package typings.recharts.mod

import typings.recharts.anon.StrokeDasharray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendPayload extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var id: Any
  
  var payload: js.UndefOr[StrokeDasharray] = js.undefined
  
  var `type`: LegendType
  
  var value: Any
}
object LegendPayload {
  
  inline def apply(id: Any, `type`: LegendType, value: Any): LegendPayload = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendPayload]
  }
  
  extension [Self <: LegendPayload](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: StrokeDasharray): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setType(value: LegendType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
