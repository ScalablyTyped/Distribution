package typings.reachObserveRect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Observe extends StObject {
    
    def observe(): Unit
    
    def unobserve(): Unit
  }
  object Observe {
    
    inline def apply(observe: () => Unit, unobserve: () => Unit): Observe = {
      val __obj = js.Dynamic.literal(observe = js.Any.fromFunction0(observe), unobserve = js.Any.fromFunction0(unobserve))
      __obj.asInstanceOf[Observe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Observe] (val x: Self) extends AnyVal {
      
      inline def setObserve(value: () => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction0(value))
      
      inline def setUnobserve(value: () => Unit): Self = StObject.set(x, "unobserve", js.Any.fromFunction0(value))
    }
  }
}
