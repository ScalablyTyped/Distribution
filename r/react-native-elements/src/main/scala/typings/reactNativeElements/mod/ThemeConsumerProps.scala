package typings.reactNativeElements.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeConsumerProps[T] extends StObject {
  
  def children(props: ThemeProps[T]): ReactNode
}
object ThemeConsumerProps {
  
  inline def apply[T](children: ThemeProps[T] => ReactNode): ThemeConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ThemeConsumerProps[T]]
  }
  
  extension [Self <: ThemeConsumerProps[?], T](x: Self & ThemeConsumerProps[T]) {
    
    inline def setChildren(value: ThemeProps[T] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
