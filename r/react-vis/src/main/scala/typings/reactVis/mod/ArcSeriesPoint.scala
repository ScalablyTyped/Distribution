package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcSeriesPoint extends AbstractSeriesPoint {
  
  var angle: Double = js.native
  
  var angle0: Double = js.native
  
  var color: js.UndefOr[String | Double] = js.native
  
  var fill: js.UndefOr[String | Double] = js.native
  
  var opacity: js.UndefOr[String | Double] = js.native
  
  var radius: Double = js.native
  
  var radius0: Double = js.native
  
  var stroke: js.UndefOr[String | Double] = js.native
}
object ArcSeriesPoint {
  
  @scala.inline
  def apply(angle: Double, angle0: Double, radius: Double, radius0: Double): ArcSeriesPoint = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], angle0 = angle0.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], radius0 = radius0.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcSeriesPoint]
  }
  
  @scala.inline
  implicit class ArcSeriesPointOps[Self <: ArcSeriesPoint] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngle0(value: Double): Self = this.set("angle0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius0(value: Double): Self = this.set("radius0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String | Double): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFill(value: String | Double): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setOpacity(value: String | Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setStroke(value: String | Double): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
}
