package typings.rxjs

import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.TeardownLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMod {
  
  @js.native
  trait Operator[T, R] extends StObject {
    
    def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic = js.native
  }
  object Operator {
    
    @scala.inline
    def apply[T, R](call: (Subscriber[R], js.Any) => TeardownLogic): Operator[T, R] = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction2(call))
      __obj.asInstanceOf[Operator[T, R]]
    }
    
    @scala.inline
    implicit class OperatorMutableBuilder[Self <: Operator[_, _], T, R] (val x: Self with (Operator[T, R])) extends AnyVal {
      
      @scala.inline
      def setCall(value: (Subscriber[R], js.Any) => TeardownLogic): Self = StObject.set(x, "call", js.Any.fromFunction2(value))
    }
  }
}
