package typings.ranjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object _ts {
  
  trait Commons extends StObject {
    
    def reset(): Unit
    
    def update(x: js.Array[Double]): Unit
  }
  object Commons {
    
    inline def apply(reset: () => Unit, update: js.Array[Double] => Unit): Commons = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Commons]
    }
    
    extension [Self <: Commons](x: Self) {
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: js.Array[Double] => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
