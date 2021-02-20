package typings.ranjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object _ts {
  
  @js.native
  trait Commons extends StObject {
    
    def reset(): Unit = js.native
    
    def update(x: js.Array[Double]): Unit = js.native
  }
  object Commons {
    
    @scala.inline
    def apply(reset: () => Unit, update: js.Array[Double] => Unit): Commons = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Commons]
    }
    
    @scala.inline
    implicit class CommonsMutableBuilder[Self <: Commons] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: js.Array[Double] => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
