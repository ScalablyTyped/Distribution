package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineChartProps
  extends StObject
     with BarLineChartBase {
  
  var data: LineData
}
object LineChartProps {
  
  inline def apply(data: LineData): LineChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineChartProps]
  }
  
  extension [Self <: LineChartProps](x: Self) {
    
    inline def setData(value: LineData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
