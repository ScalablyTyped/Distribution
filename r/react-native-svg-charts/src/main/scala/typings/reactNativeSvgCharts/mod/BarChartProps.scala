package typings.reactNativeSvgCharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarChartProps[T] extends ChartProps[T] {
  
  var spacingInner: js.UndefOr[Double] = js.native
  
  var spacingOuter: js.UndefOr[Double] = js.native
}
object BarChartProps {
  
  @scala.inline
  def apply[T](data: js.Array[T]): BarChartProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarChartProps[T]]
  }
  
  @scala.inline
  implicit class BarChartPropsMutableBuilder[Self <: BarChartProps[_], T] (val x: Self with BarChartProps[T]) extends AnyVal {
    
    @scala.inline
    def setSpacingInner(value: Double): Self = StObject.set(x, "spacingInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingInnerUndefined: Self = StObject.set(x, "spacingInner", js.undefined)
    
    @scala.inline
    def setSpacingOuter(value: Double): Self = StObject.set(x, "spacingOuter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingOuterUndefined: Self = StObject.set(x, "spacingOuter", js.undefined)
  }
}
