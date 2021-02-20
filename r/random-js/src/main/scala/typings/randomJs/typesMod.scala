package typings.randomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Distribution[T] = js.Function1[/* engine */ Engine, T]
  
  @js.native
  trait Engine extends StObject {
    
    def next(): Double = js.native
  }
  object Engine {
    
    @scala.inline
    def apply(next: () => Double): Engine = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[Engine]
    }
    
    @scala.inline
    implicit class EngineMutableBuilder[Self <: Engine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: () => Double): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  type StringDistribution = js.Function2[/* engine */ Engine, /* length */ Double, String]
}
