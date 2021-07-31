package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableMod {
  
  @JSImport("rxjs/internal/symbol/observable", "observable")
  @js.native
  val observable: String | js.Symbol = js.native
  
  object global {
    
    trait SymbolConstructor extends StObject {
      
      val observable: js.Symbol
    }
    object SymbolConstructor {
      
      @scala.inline
      def apply(observable: js.Symbol): SymbolConstructor = {
        val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
        __obj.asInstanceOf[SymbolConstructor]
      }
      
      @scala.inline
      implicit class SymbolConstructorMutableBuilder[Self <: SymbolConstructor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObservable(value: js.Symbol): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
      }
    }
  }
}
