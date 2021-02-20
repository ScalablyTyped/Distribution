package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombinedData extends StObject {
  
  var barData: js.UndefOr[BarData] = js.native
  
  var bubbleData: js.UndefOr[BubbleData] = js.native
  
  var candleData: js.UndefOr[CandleStickData] = js.native
  
  var lineData: js.UndefOr[LineData] = js.native
  
  var scatterData: js.UndefOr[ScatterData] = js.native
}
object CombinedData {
  
  @scala.inline
  def apply(): CombinedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombinedData]
  }
  
  @scala.inline
  implicit class CombinedDataMutableBuilder[Self <: CombinedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarData(value: BarData): Self = StObject.set(x, "barData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarDataUndefined: Self = StObject.set(x, "barData", js.undefined)
    
    @scala.inline
    def setBubbleData(value: BubbleData): Self = StObject.set(x, "bubbleData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbleDataUndefined: Self = StObject.set(x, "bubbleData", js.undefined)
    
    @scala.inline
    def setCandleData(value: CandleStickData): Self = StObject.set(x, "candleData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandleDataUndefined: Self = StObject.set(x, "candleData", js.undefined)
    
    @scala.inline
    def setLineData(value: LineData): Self = StObject.set(x, "lineData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDataUndefined: Self = StObject.set(x, "lineData", js.undefined)
    
    @scala.inline
    def setScatterData(value: ScatterData): Self = StObject.set(x, "scatterData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScatterDataUndefined: Self = StObject.set(x, "scatterData", js.undefined)
  }
}
