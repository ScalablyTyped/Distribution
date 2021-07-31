package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapSeriesPoint
  extends StObject
     with AbstractSeriesPoint {
  
  var color: js.UndefOr[String | Double] = js.undefined
  
  var x: Double
  
  var y: Double
}
object HeatmapSeriesPoint {
  
  @scala.inline
  def apply(x: Double, y: Double): HeatmapSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapSeriesPoint]
  }
  
  @scala.inline
  implicit class HeatmapSeriesPointMutableBuilder[Self <: HeatmapSeriesPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String | Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
