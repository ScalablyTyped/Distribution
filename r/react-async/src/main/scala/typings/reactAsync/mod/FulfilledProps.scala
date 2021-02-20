package typings.reactAsync.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FulfilledProps[T] extends StObject {
  
  var children: js.UndefOr[FulfilledChildren[T]] = js.native
  
  var persist: js.UndefOr[Boolean] = js.native
}
object FulfilledProps {
  
  @scala.inline
  def apply[T](): FulfilledProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FulfilledProps[T]]
  }
  
  @scala.inline
  implicit class FulfilledPropsMutableBuilder[Self <: FulfilledProps[_], T] (val x: Self with FulfilledProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: FulfilledChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction2(value: (T, /* state */ AsyncFulfilled[T, AbstractState[T]]) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
  }
}
