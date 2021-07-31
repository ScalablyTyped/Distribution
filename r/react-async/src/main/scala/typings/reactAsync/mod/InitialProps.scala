package typings.reactAsync.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialProps[T] extends StObject {
  
  var children: js.UndefOr[InitialChildren[T]] = js.undefined
  
  var persist: js.UndefOr[Boolean] = js.undefined
}
object InitialProps {
  
  @scala.inline
  def apply[T](): InitialProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialProps[T]]
  }
  
  @scala.inline
  implicit class InitialPropsMutableBuilder[Self <: InitialProps[?], T] (val x: Self & InitialProps[T]) extends AnyVal {
    
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
