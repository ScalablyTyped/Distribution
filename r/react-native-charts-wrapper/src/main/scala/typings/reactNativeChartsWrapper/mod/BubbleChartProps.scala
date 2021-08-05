package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BubbleChartProps
  extends StObject
     with BarLineChartBase {
  
  var data: js.UndefOr[BubbleData] = js.undefined
}
object BubbleChartProps {
  
  inline def apply(): BubbleChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BubbleChartProps]
  }
  
  extension [Self <: BubbleChartProps](x: Self) {
    
    inline def setData(value: BubbleData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
