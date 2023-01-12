package typings.reactRouterGuard

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Default[T /* <: ComponentType[Any] */] extends StObject {
    
    var default: T
  }
  object Default {
    
    inline def apply[T /* <: ComponentType[Any] */](default: T): Default[T] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Default[?], T /* <: ComponentType[Any] */] (val x: Self & Default[T]) extends AnyVal {
      
      inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
}
