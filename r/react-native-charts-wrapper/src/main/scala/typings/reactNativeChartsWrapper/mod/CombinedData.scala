package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CombinedData extends StObject {
  
  var barData: js.UndefOr[BarData] = js.undefined
  
  var bubbleData: js.UndefOr[BubbleData] = js.undefined
  
  var candleData: js.UndefOr[CandleStickData] = js.undefined
  
  var lineData: js.UndefOr[LineData] = js.undefined
  
  var scatterData: js.UndefOr[ScatterData] = js.undefined
}
object CombinedData {
  
  inline def apply(): CombinedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombinedData]
  }
  
  extension [Self <: CombinedData](x: Self) {
    
    inline def setBarData(value: BarData): Self = StObject.set(x, "barData", value.asInstanceOf[js.Any])
    
    inline def setBarDataUndefined: Self = StObject.set(x, "barData", js.undefined)
    
    inline def setBubbleData(value: BubbleData): Self = StObject.set(x, "bubbleData", value.asInstanceOf[js.Any])
    
    inline def setBubbleDataUndefined: Self = StObject.set(x, "bubbleData", js.undefined)
    
    inline def setCandleData(value: CandleStickData): Self = StObject.set(x, "candleData", value.asInstanceOf[js.Any])
    
    inline def setCandleDataUndefined: Self = StObject.set(x, "candleData", js.undefined)
    
    inline def setLineData(value: LineData): Self = StObject.set(x, "lineData", value.asInstanceOf[js.Any])
    
    inline def setLineDataUndefined: Self = StObject.set(x, "lineData", js.undefined)
    
    inline def setScatterData(value: ScatterData): Self = StObject.set(x, "scatterData", value.asInstanceOf[js.Any])
    
    inline def setScatterDataUndefined: Self = StObject.set(x, "scatterData", js.undefined)
  }
}
