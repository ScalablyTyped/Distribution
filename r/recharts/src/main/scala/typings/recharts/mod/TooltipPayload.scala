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
  
  var payload: js.UndefOr[js.Any] = js.undefined
  
  var unit: js.UndefOr[String] = js.undefined
  
  var value: String | Double | (js.Array[String | Double])
}
object TooltipPayload {
  
  @scala.inline
  def apply(name: String, value: String | Double | (js.Array[String | Double])): TooltipPayload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipPayload]
  }
  
  @scala.inline
  implicit class TooltipPayloadMutableBuilder[Self <: TooltipPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDataKey(value: DataKey): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataKeyFunction1(value: /* dataObject */ js.Any => String | Double | (js.Tuple2[Double, Double]) | Null): Self = StObject.set(x, "dataKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFormatter(
      value: (/* value */ String | Double | (js.Array[String | Double]), /* name */ String, /* entry */ TooltipPayload, /* index */ Double) => ReactNode
    ): Self = StObject.set(x, "formatter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double | (js.Array[String | Double])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: (String | Double)*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
