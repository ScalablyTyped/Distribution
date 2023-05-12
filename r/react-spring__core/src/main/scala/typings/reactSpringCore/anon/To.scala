package typings.reactSpringCore.anon

import typings.reactSpringCore.mod.ForwardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait To[T /* <: js.Object */] extends StObject {
  
  var to: ForwardProps[T]
}
object To {
  
  inline def apply[T /* <: js.Object */](to: ForwardProps[T]): To[T] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[To[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: To[?], T /* <: js.Object */] (val x: Self & To[T]) extends AnyVal {
    
    inline def setTo(value: ForwardProps[T]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
