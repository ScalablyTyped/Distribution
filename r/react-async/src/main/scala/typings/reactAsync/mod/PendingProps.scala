package typings.reactAsync.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingProps[T] extends StObject {
  
  var children: js.UndefOr[PendingChildren[T]] = js.native
  
  var initial: js.UndefOr[Boolean] = js.native
}
object PendingProps {
  
  @scala.inline
  def apply[T](): PendingProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingProps[T]]
  }
  
  @scala.inline
  implicit class PendingPropsMutableBuilder[Self <: PendingProps[_], T] (val x: Self with PendingProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: PendingChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* state */ AsyncPending[T, AbstractState[T]] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
  }
}
