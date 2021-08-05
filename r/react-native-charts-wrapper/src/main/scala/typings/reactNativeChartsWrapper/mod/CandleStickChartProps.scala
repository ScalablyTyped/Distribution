package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandleStickChartProps
  extends StObject
     with BarLineChartBase {
  
  var data: js.UndefOr[CandleStickData] = js.undefined
}
object CandleStickChartProps {
  
  inline def apply(): CandleStickChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandleStickChartProps]
  }
  
  extension [Self <: CandleStickChartProps](x: Self) {
    
    inline def setData(value: CandleStickData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
