package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalBarSeriesCanvasProps
  extends StObject
     with AbstractSeriesProps[HorizontalBarSeriesPoint] {
  
  var barWidth: Double
}
object HorizontalBarSeriesCanvasProps {
  
  @scala.inline
  def apply(barWidth: Double): HorizontalBarSeriesCanvasProps = {
    val __obj = js.Dynamic.literal(barWidth = barWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalBarSeriesCanvasProps]
  }
  
  @scala.inline
  implicit class HorizontalBarSeriesCanvasPropsMutableBuilder[Self <: HorizontalBarSeriesCanvasProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
  }
}
