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
  
  var yAccessor: js.UndefOr[AccessorFunction[T, js.Any]] = js.undefined
}
object YAxisProps {
  
  @scala.inline
  def apply[T](data: js.Array[T]): YAxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAxisProps[T]]
  }
  
  @scala.inline
  implicit class YAxisPropsMutableBuilder[Self <: YAxisProps[?], T] (val x: Self & YAxisProps[T]) extends AnyVal {
    
    @scala.inline
    def setContentInset(value: Top): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setYAccessor(value: /* props */ AccessorFunctionProps[T] => js.Any): Self = StObject.set(x, "yAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYAccessorUndefined: Self = StObject.set(x, "yAccessor", js.undefined)
  }
}
