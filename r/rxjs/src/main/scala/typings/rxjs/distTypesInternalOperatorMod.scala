package typings.rxjs

import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalTypesMod.TeardownLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorMod {
  
  trait Operator[T, R] extends StObject {
    
    def call(subscriber: Subscriber[R], source: Any): TeardownLogic
  }
  object Operator {
    
    inline def apply[T, R](call: (Subscriber[R], Any) => TeardownLogic): Operator[T, R] = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction2(call))
      __obj.asInstanceOf[Operator[T, R]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Operator[?, ?], T, R] (val x: Self & (Operator[T, R])) extends AnyVal {
      
      inline def setCall(value: (Subscriber[R], Any) => TeardownLogic): Self = StObject.set(x, "call", js.Any.fromFunction2(value))
    }
  }
}
