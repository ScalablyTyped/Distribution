package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombinedData extends js.Object {
  
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
  implicit class CombinedDataOps[Self <: CombinedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBarData(value: BarData): Self = this.set("barData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarData: Self = this.set("barData", js.undefined)
    
    @scala.inline
    def setBubbleData(value: BubbleData): Self = this.set("bubbleData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleData: Self = this.set("bubbleData", js.undefined)
    
    @scala.inline
    def setCandleData(value: CandleStickData): Self = this.set("candleData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCandleData: Self = this.set("candleData", js.undefined)
    
    @scala.inline
    def setLineData(value: LineData): Self = this.set("lineData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineData: Self = this.set("lineData", js.undefined)
    
    @scala.inline
    def setScatterData(value: ScatterData): Self = this.set("scatterData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScatterData: Self = this.set("scatterData", js.undefined)
  }
}
