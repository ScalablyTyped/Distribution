package typings.reactNativeSvgCharts.mod

import typings.reactNativeSvgCharts.anon.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YAxisProps[T]
  extends StObject
     with AxisProps[T] {
  
  var contentInset: js.UndefOr[Top] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var yAccessor: js.UndefOr[AccessorFunction[T, Any]] = js.undefined
}
object YAxisProps {
  
  inline def apply[T](data: js.Array[T]): YAxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAxisProps[T]]
  }
  
  extension [Self <: YAxisProps[?], T](x: Self & YAxisProps[T]) {
    
    inline def setContentInset(value: Top): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    inline def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setYAccessor(value: /* props */ AccessorFunctionProps[T] => Any): Self = StObject.set(x, "yAccessor", js.Any.fromFunction1(value))
    
    inline def setYAccessorUndefined: Self = StObject.set(x, "yAccessor", js.undefined)
  }
}
