package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryAddressInput extends StObject {
  
  var deliveryAddress: js.UndefOr[MailingAddressInput] = js.undefined
}
object DeliveryAddressInput {
  
  inline def apply(): DeliveryAddressInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryAddressInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeliveryAddressInput] (val x: Self) extends AnyVal {
    
    inline def setDeliveryAddress(value: MailingAddressInput): Self = StObject.set(x, "deliveryAddress", value.asInstanceOf[js.Any])
    
    inline def setDeliveryAddressUndefined: Self = StObject.set(x, "deliveryAddress", js.undefined)
  }
}
