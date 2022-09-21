package typings.rxjs.internalTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionLike
  extends StObject
     with Unsubscribable {
  
  val closed: Boolean
}
object SubscriptionLike {
  
  inline def apply(closed: Boolean, unsubscribe: () => Unit): SubscriptionLike = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[SubscriptionLike]
  }
  
  extension [Self <: SubscriptionLike](x: Self) {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
  }
}
