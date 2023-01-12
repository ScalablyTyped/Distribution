package typings.reactAsync.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingProps[T] extends StObject {
  
  var children: js.UndefOr[PendingChildren[T]] = js.undefined
  
  var initial: js.UndefOr[Boolean] = js.undefined
}
object PendingProps {
  
  inline def apply[T](): PendingProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PendingProps[?], T] (val x: Self & PendingProps[T]) extends AnyVal {
    
    inline def setChildren(value: PendingChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* state */ AsyncPending[T, AbstractState[T]] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
  }
}
