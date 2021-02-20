package typings.reactAsync.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettledProps[T] extends StObject {
  
  var children: js.UndefOr[SettledChildren[T]] = js.native
  
  var persist: js.UndefOr[Boolean] = js.native
}
object SettledProps {
  
  @scala.inline
  def apply[T](): SettledProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettledProps[T]]
  }
  
  @scala.inline
  implicit class SettledPropsMutableBuilder[Self <: SettledProps[_], T] (val x: Self with SettledProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: SettledChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(
      value: /* state */ (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]]) => ReactNode
    ): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
  }
}
