package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectSeriesPoint
  extends StObject
     with AbstractSeriesPoint {
  
  var color: js.UndefOr[String | Double] = js.undefined
  
  var fill: js.UndefOr[String | Double] = js.undefined
  
  var opacity: js.UndefOr[String | Double] = js.undefined
  
  var stroke: js.UndefOr[String | Double] = js.undefined
  
  var x: String | Double | js.Date
  
  var x0: String | Double | js.Date
  
  var y: String | Double | js.Date
  
  var y0: String | Double | js.Date
}
object RectSeriesPoint {
  
  inline def apply(
    x: String | Double | js.Date,
    x0: String | Double | js.Date,
    y: String | Double | js.Date,
    y0: String | Double | js.Date
  ): RectSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectSeriesPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RectSeriesPoint] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFill(value: String | Double): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setOpacity(value: String | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setStroke(value: String | Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setX(value: String | Double | js.Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX0(value: String | Double | js.Date): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    inline def setY(value: String | Double | js.Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY0(value: String | Double | js.Date): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
  }
}
