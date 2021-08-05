package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcSeriesPoint
  extends StObject
     with AbstractSeriesPoint {
  
  var angle: Double
  
  var angle0: Double
  
  var color: js.UndefOr[String | Double] = js.undefined
  
  var fill: js.UndefOr[String | Double] = js.undefined
  
  var opacity: js.UndefOr[String | Double] = js.undefined
  
  var radius: Double
  
  var radius0: Double
  
  var stroke: js.UndefOr[String | Double] = js.undefined
}
object ArcSeriesPoint {
  
  inline def apply(angle: Double, angle0: Double, radius: Double, radius0: Double): ArcSeriesPoint = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], angle0 = angle0.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], radius0 = radius0.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcSeriesPoint]
  }
  
  extension [Self <: ArcSeriesPoint](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngle0(value: Double): Self = StObject.set(x, "angle0", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFill(value: String | Double): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setOpacity(value: String | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadius0(value: Double): Self = StObject.set(x, "radius0", value.asInstanceOf[js.Any])
    
    inline def setStroke(value: String | Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
