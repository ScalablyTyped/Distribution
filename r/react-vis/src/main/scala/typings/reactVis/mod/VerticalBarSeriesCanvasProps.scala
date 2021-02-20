package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerticalBarSeriesCanvasProps extends AbstractSeriesProps[VerticalBarSeriesPoint] {
  
  var barWidth: Double = js.native
}
object VerticalBarSeriesCanvasProps {
  
  @scala.inline
  def apply(barWidth: Double): VerticalBarSeriesCanvasProps = {
    val __obj = js.Dynamic.literal(barWidth = barWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalBarSeriesCanvasProps]
  }
  
  @scala.inline
  implicit class VerticalBarSeriesCanvasPropsMutableBuilder[Self <: VerticalBarSeriesCanvasProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
  }
}
