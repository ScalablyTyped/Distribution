package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HorizontalBarSeriesProps extends AbstractSeriesProps[HorizontalBarSeriesPoint] {
  
  var barWidth: Double = js.native
}
object HorizontalBarSeriesProps {
  
  @scala.inline
  def apply(barWidth: Double): HorizontalBarSeriesProps = {
    val __obj = js.Dynamic.literal(barWidth = barWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalBarSeriesProps]
  }
  
  @scala.inline
  implicit class HorizontalBarSeriesPropsMutableBuilder[Self <: HorizontalBarSeriesProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
  }
}
