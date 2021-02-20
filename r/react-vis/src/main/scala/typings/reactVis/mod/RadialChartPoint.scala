package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialChartPoint extends AbstractSeriesPoint {
  
  var angle: Double = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var subLabel: js.UndefOr[String] = js.native
}
object RadialChartPoint {
  
  @scala.inline
  def apply(angle: Double): RadialChartPoint = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialChartPoint]
  }
  
  @scala.inline
  implicit class RadialChartPointMutableBuilder[Self <: RadialChartPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSubLabel(value: String): Self = StObject.set(x, "subLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubLabelUndefined: Self = StObject.set(x, "subLabel", js.undefined)
  }
}
