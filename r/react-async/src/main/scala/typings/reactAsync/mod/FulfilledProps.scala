package typings.reactAsync.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FulfilledProps[T] extends StObject {
  
  var children: js.UndefOr[FulfilledChildren[T]] = js.undefined
  
  var persist: js.UndefOr[Boolean] = js.undefined
}
object FulfilledProps {
  
  inline def apply[T](): FulfilledProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FulfilledProps[T]]
  }
  
  extension [Self <: FulfilledProps[?], T](x: Self & FulfilledProps[T]) {
    
    inline def setChildren(value: FulfilledChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction2(value: (T, /* state */ AsyncFulfilled[T, AbstractState[T]]) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
  }
}
