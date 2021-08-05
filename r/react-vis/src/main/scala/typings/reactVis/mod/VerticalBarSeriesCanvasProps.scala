package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerticalBarSeriesCanvasProps
  extends StObject
     with AbstractSeriesProps[VerticalBarSeriesPoint] {
  
  var barWidth: Double
}
object VerticalBarSeriesCanvasProps {
  
  inline def apply(barWidth: Double): VerticalBarSeriesCanvasProps = {
    val __obj = js.Dynamic.literal(barWidth = barWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalBarSeriesCanvasProps]
  }
  
  extension [Self <: VerticalBarSeriesCanvasProps](x: Self) {
    
    inline def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
  }
}
