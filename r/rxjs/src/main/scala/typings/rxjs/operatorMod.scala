package typings.rxjs

import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.TeardownLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMod {
  
  trait Operator[T, R] extends StObject {
    
    def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic
  }
  object Operator {
    
    inline def apply[T, R](call: (Subscriber[R], js.Any) => TeardownLogic): Operator[T, R] = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction2(call))
      __obj.asInstanceOf[Operator[T, R]]
    }
    
    extension [Self <: Operator[?, ?], T, R](x: Self & (Operator[T, R])) {
      
      inline def setCall(value: (Subscriber[R], js.Any) => TeardownLogic): Self = StObject.set(x, "call", js.Any.fromFunction2(value))
    }
  }
}
