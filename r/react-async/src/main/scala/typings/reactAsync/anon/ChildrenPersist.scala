package typings.reactAsync.anon

import typings.react.mod.ReactNode
import typings.reactAsync.mod.AbstractState
import typings.reactAsync.mod.AsyncFulfilled
import typings.reactAsync.mod.AsyncInitial
import typings.reactAsync.mod.AsyncPending
import typings.reactAsync.mod.AsyncRejected
import typings.reactAsync.mod.RejectedChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenPersist[T /* <: js.Object */] extends StObject {
  
  var children: js.UndefOr[RejectedChildren[T]] = js.undefined
  
  var persist: js.UndefOr[Boolean] = js.undefined
  
  var state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]])
}
object ChildrenPersist {
  
  @scala.inline
  def apply[T /* <: js.Object */](
    state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]])
  ): ChildrenPersist[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenPersist[T]]
  }
  
  @scala.inline
  implicit class ChildrenPersistMutableBuilder[Self <: ChildrenPersist[?], T /* <: js.Object */] (val x: Self & ChildrenPersist[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: RejectedChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction2(
      value: (/* error */ typings.std.Error, /* state */ AsyncRejected[T, AbstractState[T]]) => ReactNode
    ): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    @scala.inline
    def setState(
      value: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]])
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
