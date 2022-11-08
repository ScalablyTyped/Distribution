package typings.recharts.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipPayload extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var dataKey: js.UndefOr[DataKey] = js.undefined
  
  var fill: js.UndefOr[String] = js.undefined
  
  var formatter: js.UndefOr[TooltipFormatter] = js.undefined
  
  var name: String
  
  var payload: js.UndefOr[Any] = js.undefined
  
  var stroke: js.UndefOr[String] = js.undefined
  
  var strokeDasharray: js.UndefOr[String | Double] = js.undefined
  
  var strokeWidth: js.UndefOr[Double | String] = js.undefined
  
  var unit: js.UndefOr[String] = js.undefined
  
  var value: String | Double | (js.Array[String | Double])
}
object TooltipPayload {
  
  inline def apply(name: String, value: String | Double | (js.Array[String | Double])): TooltipPayload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipPayload]
  }
  
  extension [Self <: TooltipPayload](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDataKey(value: DataKey): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    inline def setDataKeyFunction1(value: /* dataObject */ Any => String | Double | (js.Tuple2[Double, Double]) | Null): Self = StObject.set(x, "dataKey", js.Any.fromFunction1(value))
    
    inline def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFormatter(
      value: (/* value */ String | Double | (js.Array[String | Double]), /* name */ String, /* entry */ TooltipPayload, /* index */ Double) => ReactNode
    ): Self = StObject.set(x, "formatter", js.Any.fromFunction4(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeDasharray(value: String | Double): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
    
    inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeWidth(value: Double | String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: String | Double | (js.Array[String | Double])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: (String | Double)*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
