package typings.rxjs.distTypesInternalTypesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionLike] (val x: Self) extends AnyVal {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
  }
}
