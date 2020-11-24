package typings.reactNativeSvgCharts.mod

import typings.reactNativeSvgCharts.anon.CornerRadius
import typings.reactNativeSvgCharts.anon.PartialPathProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieChartData extends js.Object {
  
  var arc: js.UndefOr[CornerRadius] = js.native
  
  var key: String | Double = js.native
  
  var svg: js.UndefOr[PartialPathProps] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object PieChartData {
  
  @scala.inline
  def apply(key: String | Double): PieChartData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartData]
  }
  
  @scala.inline
  implicit class PieChartDataOps[Self <: PieChartData] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArc(value: CornerRadius): Self = this.set("arc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArc: Self = this.set("arc", js.undefined)
    
    @scala.inline
    def setSvg(value: PartialPathProps): Self = this.set("svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvg: Self = this.set("svg", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
