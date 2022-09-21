package typings.reactNativeSvgCharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarChartProps[T]
  extends StObject
     with ChartProps[T] {
  
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  var spacingInner: js.UndefOr[Double] = js.undefined
  
  var spacingOuter: js.UndefOr[Double] = js.undefined
}
object BarChartProps {
  
  inline def apply[T](data: js.Array[T]): BarChartProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarChartProps[T]]
  }
  
  extension [Self <: BarChartProps[?], T](x: Self & BarChartProps[T]) {
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setSpacingInner(value: Double): Self = StObject.set(x, "spacingInner", value.asInstanceOf[js.Any])
    
    inline def setSpacingInnerUndefined: Self = StObject.set(x, "spacingInner", js.undefined)
    
    inline def setSpacingOuter(value: Double): Self = StObject.set(x, "spacingOuter", value.asInstanceOf[js.Any])
    
    inline def setSpacingOuterUndefined: Self = StObject.set(x, "spacingOuter", js.undefined)
  }
}
