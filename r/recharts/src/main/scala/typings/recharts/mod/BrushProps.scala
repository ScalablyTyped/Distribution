package typings.recharts.mod

import typings.react.mod.ReactNode
import typings.recharts.anon.PartialMargin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrushProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[js.Array[Any]] = js.undefined
  
  var dataKey: js.UndefOr[DataKey] = js.undefined
  
  var endIndex: js.UndefOr[Double] = js.undefined
  
  var fill: js.UndefOr[String] = js.undefined
  
  var gap: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var leaveTimeOut: js.UndefOr[Double] = js.undefined
  
  var onChange: js.UndefOr[RechartsFunction] = js.undefined
  
  var padding: js.UndefOr[PartialMargin] = js.undefined
  
  var startIndex: js.UndefOr[Double] = js.undefined
  
  var stroke: js.UndefOr[String] = js.undefined
  
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.undefined
  
  var travellerWidth: js.UndefOr[Double] = js.undefined
  
  var updateId: js.UndefOr[String | Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object BrushProps {
  
  inline def apply(): BrushProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrushProps]
  }
  
  extension [Self <: BrushProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataKey(value: DataKey): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    inline def setDataKeyFunction1(value: /* dataObject */ Any => String | Double | (js.Tuple2[Double, Double]) | Null): Self = StObject.set(x, "dataKey", js.Any.fromFunction1(value))
    
    inline def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLeaveTimeOut(value: Double): Self = StObject.set(x, "leaveTimeOut", value.asInstanceOf[js.Any])
    
    inline def setLeaveTimeOutUndefined: Self = StObject.set(x, "leaveTimeOut", js.undefined)
    
    inline def setOnChange(value: RechartsFunction): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setPadding(value: PartialMargin): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setTickFormatter(value: /* value */ Any => Any): Self = StObject.set(x, "tickFormatter", js.Any.fromFunction1(value))
    
    inline def setTickFormatterUndefined: Self = StObject.set(x, "tickFormatter", js.undefined)
    
    inline def setTravellerWidth(value: Double): Self = StObject.set(x, "travellerWidth", value.asInstanceOf[js.Any])
    
    inline def setTravellerWidthUndefined: Self = StObject.set(x, "travellerWidth", js.undefined)
    
    inline def setUpdateId(value: String | Double): Self = StObject.set(x, "updateId", value.asInstanceOf[js.Any])
    
    inline def setUpdateIdUndefined: Self = StObject.set(x, "updateId", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
