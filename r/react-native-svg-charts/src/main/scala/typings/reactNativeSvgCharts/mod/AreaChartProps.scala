package typings.reactNativeSvgCharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaChartProps[T] extends ChartProps[T] {
  
  var start: js.UndefOr[Double] = js.native
}
object AreaChartProps {
  
  @scala.inline
  def apply[T](data: js.Array[T]): AreaChartProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaChartProps[T]]
  }
  
  @scala.inline
  implicit class AreaChartPropsMutableBuilder[Self <: AreaChartProps[_], T] (val x: Self with AreaChartProps[T]) extends AnyVal {
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
