package typings.reactNativeSvgCharts.mod

import typings.d3Shape.mod.Series
import typings.react.mod.Component
import typings.reactNativeSvg.mod.LinearGradientProps
import typings.reactNativeSvg.mod.RadialGradientProps
import typings.reactNativeSvgCharts.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackedBarChartProps[T] extends ChartProps[T] {
  
  var colors: js.Array[String] = js.native
  
  var extra: js.UndefOr[js.Function0[js.Object]] = js.native
  
  var extras: js.UndefOr[js.Array[_]] = js.native
  
  var horizontal: js.UndefOr[Boolean] = js.native
  
  var keys: js.Array[/* keyof T */ String] = js.native
  
  var offset: js.UndefOr[OffsetFunction] = js.native
  
  var order: js.UndefOr[OrderFunction] = js.native
  
  var renderGradient: js.UndefOr[
    js.Function1[/* props */ Id, Component[LinearGradientProps | RadialGradientProps, js.Object, _]]
  ] = js.native
  
  var showGrid: js.UndefOr[Boolean] = js.native
  
  var spacingInner: js.UndefOr[Double] = js.native
  
  var spacingOuter: js.UndefOr[Double] = js.native
  
  var strokeColor: js.UndefOr[String] = js.native
}
object StackedBarChartProps {
  
  @scala.inline
  def apply[T](colors: js.Array[String], data: js.Array[T], keys: js.Array[/* keyof T */ String]): StackedBarChartProps[T] = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackedBarChartProps[T]]
  }
  
  @scala.inline
  implicit class StackedBarChartPropsMutableBuilder[Self <: StackedBarChartProps[_], T] (val x: Self with StackedBarChartProps[T]) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setExtra(value: () => js.Object): Self = StObject.set(x, "extra", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    @scala.inline
    def setExtras(value: js.Array[_]): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrasUndefined: Self = StObject.set(x, "extras", js.undefined)
    
    @scala.inline
    def setExtrasVarargs(value: js.Any*): Self = StObject.set(x, "extras", js.Array(value :_*))
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setKeys(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: (/* series */ Series[js.Any, js.Any], /* order */ js.Array[Double]) => Unit): Self = StObject.set(x, "offset", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrder(value: /* series */ Series[js.Any, js.Any] => js.Array[Double]): Self = StObject.set(x, "order", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setRenderGradient(value: /* props */ Id => Component[LinearGradientProps | RadialGradientProps, js.Object, _]): Self = StObject.set(x, "renderGradient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderGradientUndefined: Self = StObject.set(x, "renderGradient", js.undefined)
    
    @scala.inline
    def setShowGrid(value: Boolean): Self = StObject.set(x, "showGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGridUndefined: Self = StObject.set(x, "showGrid", js.undefined)
    
    @scala.inline
    def setSpacingInner(value: Double): Self = StObject.set(x, "spacingInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingInnerUndefined: Self = StObject.set(x, "spacingInner", js.undefined)
    
    @scala.inline
    def setSpacingOuter(value: Double): Self = StObject.set(x, "spacingOuter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingOuterUndefined: Self = StObject.set(x, "spacingOuter", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
  }
}
