package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolarViewBox extends StObject {
  
  var cx: js.UndefOr[Double] = js.undefined
  
  var cy: js.UndefOr[Double] = js.undefined
  
  var endAngle: js.UndefOr[Double] = js.undefined
  
  var innerRadius: js.UndefOr[Double] = js.undefined
  
  var outerRadius: js.UndefOr[Double] = js.undefined
  
  var startAngle: js.UndefOr[Double] = js.undefined
}
object PolarViewBox {
  
  @scala.inline
  def apply(): PolarViewBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolarViewBox]
  }
  
  @scala.inline
  implicit class PolarViewBoxMutableBuilder[Self <: PolarViewBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    @scala.inline
    def setOuterRadius(value: Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRadiusUndefined: Self = StObject.set(x, "outerRadius", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
