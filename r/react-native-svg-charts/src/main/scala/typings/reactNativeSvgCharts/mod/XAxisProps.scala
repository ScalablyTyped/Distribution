package typings.reactNativeSvgCharts.mod

import typings.reactNativeSvgCharts.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAxisProps[T]
  extends StObject
     with AxisProps[T] {
  
  var contentInset: js.UndefOr[Left] = js.undefined
  
  var xAccessor: js.UndefOr[AccessorFunction[T, Any]] = js.undefined
}
object XAxisProps {
  
  inline def apply[T](data: js.Array[T]): XAxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxisProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XAxisProps[?], T] (val x: Self & XAxisProps[T]) extends AnyVal {
    
    inline def setContentInset(value: Left): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    inline def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
    
    inline def setXAccessor(value: /* props */ AccessorFunctionProps[T] => Any): Self = StObject.set(x, "xAccessor", js.Any.fromFunction1(value))
    
    inline def setXAccessorUndefined: Self = StObject.set(x, "xAccessor", js.undefined)
  }
}
