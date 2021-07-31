package typings.reactVis.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineMarkSeriesPoint
  extends StObject
     with AbstractSeriesPoint {
  
  var color: js.UndefOr[String | Double] = js.undefined
  
  var fill: js.UndefOr[String | Double] = js.undefined
  
  var opacity: js.UndefOr[String | Double] = js.undefined
  
  var size: js.UndefOr[String | Double] = js.undefined
  
  var stroke: js.UndefOr[String | Double] = js.undefined
  
  var x: String | Double | Date
  
  var y: String | Double | Date
}
object LineMarkSeriesPoint {
  
  @scala.inline
  def apply(x: String | Double | Date, y: String | Double | Date): LineMarkSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineMarkSeriesPoint]
  }
  
  @scala.inline
  implicit class LineMarkSeriesPointMutableBuilder[Self <: LineMarkSeriesPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFill(value: String | Double): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setOpacity(value: String | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStroke(value: String | Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setX(value: String | Double | Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String | Double | Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
