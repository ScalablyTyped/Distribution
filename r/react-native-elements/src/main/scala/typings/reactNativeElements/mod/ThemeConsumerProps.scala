package typings.reactNativeElements.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeConsumerProps[T] extends StObject {
  
  def children(props: ThemeProps[T]): ReactNode = js.native
}
object ThemeConsumerProps {
  
  @scala.inline
  def apply[T](children: ThemeProps[T] => ReactNode): ThemeConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ThemeConsumerProps[T]]
  }
  
  @scala.inline
  implicit class ThemeConsumerPropsMutableBuilder[Self <: ThemeConsumerProps[_], T] (val x: Self with ThemeConsumerProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ThemeProps[T] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
