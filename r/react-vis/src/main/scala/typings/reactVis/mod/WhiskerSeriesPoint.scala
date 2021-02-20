package typings.reactVis.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhiskerSeriesPoint extends AbstractSeriesPoint {
  
  var color: js.UndefOr[String | Double] = js.native
  
  var opacity: js.UndefOr[String | Double] = js.native
  
  var size: js.UndefOr[String | Double] = js.native
  
  var stroke: js.UndefOr[String | Double] = js.native
  
  var x: String | Double | Date = js.native
  
  var xVariance: js.UndefOr[String | Double] = js.native
  
  var y: String | Double | Date = js.native
  
  var yVariance: js.UndefOr[String | Double] = js.native
}
object WhiskerSeriesPoint {
  
  @scala.inline
  def apply(x: String | Double | Date, y: String | Double | Date): WhiskerSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiskerSeriesPoint]
  }
  
  @scala.inline
  implicit class WhiskerSeriesPointMutableBuilder[Self <: WhiskerSeriesPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
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
    def setXVariance(value: String | Double): Self = StObject.set(x, "xVariance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXVarianceUndefined: Self = StObject.set(x, "xVariance", js.undefined)
    
    @scala.inline
    def setY(value: String | Double | Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYVariance(value: String | Double): Self = StObject.set(x, "yVariance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYVarianceUndefined: Self = StObject.set(x, "yVariance", js.undefined)
  }
}
