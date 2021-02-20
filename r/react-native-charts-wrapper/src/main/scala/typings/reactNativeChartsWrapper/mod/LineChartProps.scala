package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineChartProps extends BarLineChartBase {
  
  var data: LineData = js.native
}
object LineChartProps {
  
  @scala.inline
  def apply(data: LineData): LineChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineChartProps]
  }
  
  @scala.inline
  implicit class LineChartPropsMutableBuilder[Self <: LineChartProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: LineData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
