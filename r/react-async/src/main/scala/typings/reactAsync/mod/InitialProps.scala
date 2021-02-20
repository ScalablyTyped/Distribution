package typings.reactAsync.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialProps[T] extends StObject {
  
  var children: js.UndefOr[InitialChildren[T]] = js.native
  
  var persist: js.UndefOr[Boolean] = js.native
}
object InitialProps {
  
  @scala.inline
  def apply[T](): InitialProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialProps[T]]
  }
  
  @scala.inline
  implicit class InitialPropsMutableBuilder[Self <: InitialProps[_], T] (val x: Self with InitialProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: InitialChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* state */ AsyncInitial[T, AbstractState[T]] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
  }
}
