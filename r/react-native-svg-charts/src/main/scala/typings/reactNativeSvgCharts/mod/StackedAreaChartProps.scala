package typings.reactNativeSvgCharts.mod

import typings.d3Shape.mod.Series
import typings.react.mod.Component
import typings.reactNativeSvg.libTypescriptElementsLinearGradientMod.LinearGradientProps
import typings.reactNativeSvg.libTypescriptElementsRadialGradientMod.RadialGradientProps
import typings.reactNativeSvgCharts.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackedAreaChartProps[T]
  extends StObject
     with ChartProps[T] {
  
  var colors: js.Array[String]
  
  var extras: js.UndefOr[js.Array[Any]] = js.undefined
  
  var keys: js.Array[/* keyof T */ String]
  
  var offset: js.UndefOr[OffsetFunction] = js.undefined
  
  var order: js.UndefOr[OrderFunction] = js.undefined
  
  var renderDecorator: js.UndefOr[js.Function0[js.Object]] = js.undefined
  
  var renderGradient: js.UndefOr[
    js.Function1[
      /* props */ Color[T], 
      Component[LinearGradientProps | RadialGradientProps, js.Object, Any]
    ]
  ] = js.undefined
  
  var showGrid: js.UndefOr[Boolean] = js.undefined
}
object StackedAreaChartProps {
  
  inline def apply[T](colors: js.Array[String], data: js.Array[T], keys: js.Array[/* keyof T */ String]): StackedAreaChartProps[T] = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackedAreaChartProps[T]]
  }
  
  extension [Self <: StackedAreaChartProps[?], T](x: Self & StackedAreaChartProps[T]) {
    
    inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setExtras(value: js.Array[Any]): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
    
    inline def setExtrasUndefined: Self = StObject.set(x, "extras", js.undefined)
    
    inline def setExtrasVarargs(value: Any*): Self = StObject.set(x, "extras", js.Array(value*))
    
    inline def setKeys(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setOffset(value: (/* series */ Series[Any, Any], /* order */ js.Array[Double]) => Unit): Self = StObject.set(x, "offset", js.Any.fromFunction2(value))
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrder(value: /* series */ Series[Any, Any] => js.Array[Double]): Self = StObject.set(x, "order", js.Any.fromFunction1(value))
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setRenderDecorator(value: () => js.Object): Self = StObject.set(x, "renderDecorator", js.Any.fromFunction0(value))
    
    inline def setRenderDecoratorUndefined: Self = StObject.set(x, "renderDecorator", js.undefined)
    
    inline def setRenderGradient(
      value: /* props */ Color[T] => Component[LinearGradientProps | RadialGradientProps, js.Object, Any]
    ): Self = StObject.set(x, "renderGradient", js.Any.fromFunction1(value))
    
    inline def setRenderGradientUndefined: Self = StObject.set(x, "renderGradient", js.undefined)
    
    inline def setShowGrid(value: Boolean): Self = StObject.set(x, "showGrid", value.asInstanceOf[js.Any])
    
    inline def setShowGridUndefined: Self = StObject.set(x, "showGrid", js.undefined)
  }
}
