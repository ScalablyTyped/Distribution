package typings.recurlyRecurlyJs.libApplePayNativeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplePayShippingMethodSelectedEvent extends StObject {
  
  /**
    * The shipping method selected by the user.
    */
  var shippingMethod: Any
}
object ApplePayShippingMethodSelectedEvent {
  
  inline def apply(shippingMethod: Any): ApplePayShippingMethodSelectedEvent = {
    val __obj = js.Dynamic.literal(shippingMethod = shippingMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayShippingMethodSelectedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayShippingMethodSelectedEvent] (val x: Self) extends AnyVal {
    
    inline def setShippingMethod(value: Any): Self = StObject.set(x, "shippingMethod", value.asInstanceOf[js.Any])
  }
}
