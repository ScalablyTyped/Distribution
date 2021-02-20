package typings.reactAsync.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncProps[T] extends AsyncOptions[T] {
  
  var children: js.UndefOr[AsyncChildren[T]] = js.native
}
object AsyncProps {
  
  @scala.inline
  def apply[T](): AsyncProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncProps[T]]
  }
  
  @scala.inline
  implicit class AsyncPropsMutableBuilder[Self <: AsyncProps[_], T] (val x: Self with AsyncProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: AsyncChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* state */ AsyncState[T, AbstractState[T]] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
