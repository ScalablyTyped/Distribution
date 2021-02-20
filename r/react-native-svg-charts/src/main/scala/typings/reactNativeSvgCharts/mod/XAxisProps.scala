package typings.reactNativeSvgCharts.mod

import typings.reactNativeSvgCharts.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XAxisProps[T] extends AxisProps[T] {
  
  var contentInset: js.UndefOr[Left] = js.native
  
  var xAccessor: js.UndefOr[AccessorFunction[T, _]] = js.native
}
object XAxisProps {
  
  @scala.inline
  def apply[T](data: js.Array[T]): XAxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxisProps[T]]
  }
  
  @scala.inline
  implicit class XAxisPropsMutableBuilder[Self <: XAxisProps[_], T] (val x: Self with XAxisProps[T]) extends AnyVal {
    
    @scala.inline
    def setContentInset(value: Left): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
    
    @scala.inline
    def setXAccessor(value: /* props */ AccessorFunctionProps[T] => _): Self = StObject.set(x, "xAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXAccessorUndefined: Self = StObject.set(x, "xAccessor", js.undefined)
  }
}
