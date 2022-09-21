package typings.reactAsync.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectedProps[T] extends StObject {
  
  var children: js.UndefOr[RejectedChildren[T]] = js.undefined
  
  var persist: js.UndefOr[Boolean] = js.undefined
}
object RejectedProps {
  
  inline def apply[T](): RejectedProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectedProps[T]]
  }
  
  extension [Self <: RejectedProps[?], T](x: Self & RejectedProps[T]) {
    
    inline def setChildren(value: RejectedChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction2(value: (/* error */ js.Error, /* state */ AsyncRejected[T, AbstractState[T]]) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
  }
}
