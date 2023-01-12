package typings.reactAsync.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettledProps[T] extends StObject {
  
  var children: js.UndefOr[SettledChildren[T]] = js.undefined
  
  var persist: js.UndefOr[Boolean] = js.undefined
}
object SettledProps {
  
  inline def apply[T](): SettledProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettledProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SettledProps[?], T] (val x: Self & SettledProps[T]) extends AnyVal {
    
    inline def setChildren(value: SettledChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(
      value: /* state */ (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]]) => ReactNode
    ): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
  }
}
