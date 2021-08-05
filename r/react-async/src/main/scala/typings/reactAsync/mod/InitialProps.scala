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
  
  inline def apply[T](): InitialProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialProps[T]]
  }
  
  extension [Self <: InitialProps[?], T](x: Self & InitialProps[T]) {
    
    inline def setChildren(value: InitialChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* state */ AsyncInitial[T, AbstractState[T]] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
  }
}
