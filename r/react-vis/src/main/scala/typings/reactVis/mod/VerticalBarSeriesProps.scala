package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerticalBarSeriesProps
  extends StObject
     with AbstractSeriesProps[VerticalBarSeriesPoint] {
  
  var barWidth: Double
}
object VerticalBarSeriesProps {
  
  @scala.inline
  def apply(barWidth: Double): VerticalBarSeriesProps = {
    val __obj = js.Dynamic.literal(barWidth = barWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalBarSeriesProps]
  }
  
  @scala.inline
  implicit class VerticalBarSeriesPropsMutableBuilder[Self <: VerticalBarSeriesProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
  }
}
