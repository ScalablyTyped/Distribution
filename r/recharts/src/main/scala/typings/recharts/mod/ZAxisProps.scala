package typings.recharts.mod

import typings.recharts.rechartsStrings.category
import typings.recharts.rechartsStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZAxisProps extends StObject {
  
  // The key of data displayed in the axis
  var dataKey: js.UndefOr[DataKey] = js.undefined
  
  // The name of data displayed in the axis
  var name: js.UndefOr[String | Double] = js.undefined
  
  // The range of axis
  var range: js.UndefOr[js.Array[Double]] = js.undefined
  
  var scale: js.UndefOr[ScaleType | RechartsFunction] = js.undefined
  
  var `type`: js.UndefOr[number | category] = js.undefined
  
  // The unit of data displayed in the axis
  var unit: js.UndefOr[String | Double] = js.undefined
  
  // The unique id of z-axis
  var zAxisId: js.UndefOr[String | Double] = js.undefined
}
object ZAxisProps {
  
  @scala.inline
  def apply(): ZAxisProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZAxisProps]
  }
  
  @scala.inline
  implicit class ZAxisPropsMutableBuilder[Self <: ZAxisProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataKey(value: DataKey): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataKeyFunction1(value: /* dataObject */ js.Any => String | Double | (js.Tuple2[Double, Double]) | Null): Self = StObject.set(x, "dataKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
    
    @scala.inline
    def setName(value: String | Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value :_*))
    
    @scala.inline
    def setScale(value: ScaleType | RechartsFunction): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setType(value: number | category): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnit(value: String | Double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setZAxisId(value: String | Double): Self = StObject.set(x, "zAxisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZAxisIdUndefined: Self = StObject.set(x, "zAxisId", js.undefined)
  }
}
