package typings.reactSpringRafz

import typings.reactSpringRafz.distDeclarationsSrcTypesMod.VoidFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cancel[T /* <: VoidFn */] extends StObject {
    
    def cancel(): Unit
    
    var handler: T
  }
  object Cancel {
    
    inline def apply[T /* <: VoidFn */](cancel: () => Unit, handler: T): Cancel[T] = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), handler = handler.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cancel[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cancel[?], T /* <: VoidFn */] (val x: Self & Cancel[T]) extends AnyVal {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setHandler(value: T): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    }
  }
}
