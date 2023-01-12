package typings.randomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type Distribution[T] = js.Function1[/* engine */ Engine, T]
  
  trait Engine extends StObject {
    
    def next(): Double
  }
  object Engine {
    
    inline def apply(next: () => Double): Engine = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[Engine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Engine] (val x: Self) extends AnyVal {
      
      inline def setNext(value: () => Double): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  type StringDistribution = js.Function2[/* engine */ Engine, /* length */ Double, String]
}
