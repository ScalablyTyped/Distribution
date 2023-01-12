package typings.reactNativeSvgCharts.mod

import typings.reactNativeSvgCharts.anon.PartialLineProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridProps[T] extends StObject {
  
  var belowChart: js.UndefOr[Boolean] = js.undefined
  
  var direction: js.UndefOr[GridDirection] = js.undefined
  
  var svg: js.UndefOr[PartialLineProps] = js.undefined
  
  var ticks: js.UndefOr[js.Array[T]] = js.undefined
  
  var x: js.UndefOr[js.Function1[/* t */ T, Double]] = js.undefined
  
  var y: js.UndefOr[js.Function1[/* t */ T, Double]] = js.undefined
}
object GridProps {
  
  inline def apply[T](): GridProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridProps[?], T] (val x: Self & GridProps[T]) extends AnyVal {
    
    inline def setBelowChart(value: Boolean): Self = StObject.set(x, "belowChart", value.asInstanceOf[js.Any])
    
    inline def setBelowChartUndefined: Self = StObject.set(x, "belowChart", js.undefined)
    
    inline def setDirection(value: GridDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setSvg(value: PartialLineProps): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    
    inline def setTicks(value: js.Array[T]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    inline def setTicksVarargs(value: T*): Self = StObject.set(x, "ticks", js.Array(value*))
    
    inline def setX(value: /* t */ T => Double): Self = StObject.set(x, "x", js.Any.fromFunction1(value))
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: /* t */ T => Double): Self = StObject.set(x, "y", js.Any.fromFunction1(value))
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
