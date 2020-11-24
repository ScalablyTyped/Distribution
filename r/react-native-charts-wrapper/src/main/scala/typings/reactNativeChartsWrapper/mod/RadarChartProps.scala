package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadarChartProps extends PieRadarChartBase {
  
  var data: js.UndefOr[RadarData] = js.native
  
  var drawWeb: js.UndefOr[Boolean] = js.native
  
  var skipWebLineCount: js.UndefOr[Double] = js.native
  
  var webAlpha: js.UndefOr[Double] = js.native
  
  var webColor: js.UndefOr[Color] = js.native
  
  var webColorInner: js.UndefOr[Color] = js.native
  
  var webLineWidth: js.UndefOr[Double] = js.native
  
  var webLineWidthInner: js.UndefOr[Double] = js.native
  
  var yAxis: js.UndefOr[typings.reactNativeChartsWrapper.mod.yAxis] = js.native
}
object RadarChartProps {
  
  @scala.inline
  def apply(): RadarChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarChartProps]
  }
  
  @scala.inline
  implicit class RadarChartPropsOps[Self <: RadarChartProps] (val x: Self) extends AnyVal {
    
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
    def setData(value: RadarData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDrawWeb(value: Boolean): Self = this.set("drawWeb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawWeb: Self = this.set("drawWeb", js.undefined)
    
    @scala.inline
    def setSkipWebLineCount(value: Double): Self = this.set("skipWebLineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipWebLineCount: Self = this.set("skipWebLineCount", js.undefined)
    
    @scala.inline
    def setWebAlpha(value: Double): Self = this.set("webAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebAlpha: Self = this.set("webAlpha", js.undefined)
    
    @scala.inline
    def setWebColor(value: Color): Self = this.set("webColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebColor: Self = this.set("webColor", js.undefined)
    
    @scala.inline
    def setWebColorInner(value: Color): Self = this.set("webColorInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebColorInner: Self = this.set("webColorInner", js.undefined)
    
    @scala.inline
    def setWebLineWidth(value: Double): Self = this.set("webLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebLineWidth: Self = this.set("webLineWidth", js.undefined)
    
    @scala.inline
    def setWebLineWidthInner(value: Double): Self = this.set("webLineWidthInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebLineWidthInner: Self = this.set("webLineWidthInner", js.undefined)
    
    @scala.inline
    def setYAxis(value: yAxis): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
  }
}
