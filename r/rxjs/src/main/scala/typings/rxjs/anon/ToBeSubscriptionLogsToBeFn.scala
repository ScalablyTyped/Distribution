package typings.rxjs.anon

import typings.rxjs.distTypesInternalTestingTestSchedulerMod.subscriptionLogsToBeFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToBeSubscriptionLogsToBeFn extends StObject {
  
  def toBe(marbles: String): Unit
  def toBe(marbles: js.Array[String]): Unit
  @JSName("toBe")
  var toBe_Original: subscriptionLogsToBeFn
}
object ToBeSubscriptionLogsToBeFn {
  
  inline def apply(toBe: /* marbles */ String | js.Array[String] => Unit): ToBeSubscriptionLogsToBeFn = {
    val __obj = js.Dynamic.literal(toBe = js.Any.fromFunction1(toBe))
    __obj.asInstanceOf[ToBeSubscriptionLogsToBeFn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToBeSubscriptionLogsToBeFn] (val x: Self) extends AnyVal {
    
    inline def setToBe(value: /* marbles */ String | js.Array[String] => Unit): Self = StObject.set(x, "toBe", js.Any.fromFunction1(value))
  }
}
