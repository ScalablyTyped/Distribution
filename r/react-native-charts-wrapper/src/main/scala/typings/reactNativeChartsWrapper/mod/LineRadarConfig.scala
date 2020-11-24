package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Angle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineRadarConfig extends js.Object {
  
  var drawFilled: js.UndefOr[Boolean] = js.native
  
  var fillAlpha: js.UndefOr[Double] = js.native
  
  var fillColor: js.UndefOr[Color] = js.native
  
  var fillGradient: js.UndefOr[Angle] = js.native
  
  var lineWidth: js.UndefOr[Double] = js.native
}
object LineRadarConfig {
  
  @scala.inline
  def apply(): LineRadarConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineRadarConfig]
  }
  
  @scala.inline
  implicit class LineRadarConfigOps[Self <: LineRadarConfig] (val x: Self) extends AnyVal {
    
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
    def setDrawFilled(value: Boolean): Self = this.set("drawFilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawFilled: Self = this.set("drawFilled", js.undefined)
    
    @scala.inline
    def setFillAlpha(value: Double): Self = this.set("fillAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillAlpha: Self = this.set("fillAlpha", js.undefined)
    
    @scala.inline
    def setFillColor(value: Color): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setFillGradient(value: Angle): Self = this.set("fillGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillGradient: Self = this.set("fillGradient", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
  }
}
