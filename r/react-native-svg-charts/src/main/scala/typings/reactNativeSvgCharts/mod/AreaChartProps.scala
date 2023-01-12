package typings.reactNativeSvgCharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaChartProps[T]
  extends StObject
     with ChartProps[T] {
  
  var start: js.UndefOr[Double] = js.undefined
}
object AreaChartProps {
  
  inline def apply[T](data: js.Array[T]): AreaChartProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaChartProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AreaChartProps[?], T] (val x: Self & AreaChartProps[T]) extends AnyVal {
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
