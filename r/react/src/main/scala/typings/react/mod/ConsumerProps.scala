package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerProps[T] extends StObject {
  
  def children(value: T): ReactNode
}
object ConsumerProps {
  
  @scala.inline
  def apply[T](children: T => ReactNode): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ConsumerProps[T]]
  }
  
  @scala.inline
  implicit class ConsumerPropsMutableBuilder[Self <: ConsumerProps[?], T] (val x: Self & ConsumerProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: T => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
