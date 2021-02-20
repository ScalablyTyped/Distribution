package typings.reactNativeSvgCharts.mod

import typings.reactNativeSvgCharts.anon.PartialLineProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridProps[T] extends StObject {
  
  var belowChart: js.UndefOr[Boolean] = js.native
  
  var direction: js.UndefOr[GridDirection] = js.native
  
  var svg: js.UndefOr[PartialLineProps] = js.native
  
  var ticks: js.UndefOr[js.Array[T]] = js.native
  
  var x: js.UndefOr[js.Function1[/* t */ T, Double]] = js.native
  
  var y: js.UndefOr[js.Function1[/* t */ T, Double]] = js.native
}
object GridProps {
  
  @scala.inline
  def apply[T](): GridProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps[T]]
  }
  
  @scala.inline
  implicit class GridPropsMutableBuilder[Self <: GridProps[_], T] (val x: Self with GridProps[T]) extends AnyVal {
    
    @scala.inline
    def setBelowChart(value: Boolean): Self = StObject.set(x, "belowChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBelowChartUndefined: Self = StObject.set(x, "belowChart", js.undefined)
    
    @scala.inline
    def setDirection(value: GridDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setSvg(value: PartialLineProps): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    
    @scala.inline
    def setTicks(value: js.Array[T]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: T*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    
    @scala.inline
    def setX(value: /* t */ T => Double): Self = StObject.set(x, "x", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: /* t */ T => Double): Self = StObject.set(x, "y", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
