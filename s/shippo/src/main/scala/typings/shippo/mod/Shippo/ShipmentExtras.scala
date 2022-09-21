package typings.shippo.mod.Shippo

import typings.shippo.shippoStrings.ADULT
import typings.shippo.shippoStrings.CARRIER_CONFIRMATION
import typings.shippo.shippoStrings.CERTIFIED
import typings.shippo.shippoStrings.INDIRECT
import typings.shippo.shippoStrings.STANDARD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShipmentExtras extends StObject {
  
  var authority_to_leave: js.UndefOr[Boolean] = js.undefined
  
  var bypass_address_validation: js.UndefOr[Boolean] = js.undefined
  
  var customer_branch: js.UndefOr[String] = js.undefined
  
  var premium: js.UndefOr[Boolean] = js.undefined
  
  var request_retail_rates: js.UndefOr[Boolean] = js.undefined
  
  var saturday_delivery: js.UndefOr[Boolean] = js.undefined
  
  var signature_confirmation: js.UndefOr[STANDARD | ADULT | CERTIFIED | INDIRECT | CARRIER_CONFIRMATION] = js.undefined
}
object ShipmentExtras {
  
  inline def apply(): ShipmentExtras = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShipmentExtras]
  }
  
  extension [Self <: ShipmentExtras](x: Self) {
    
    inline def setAuthority_to_leave(value: Boolean): Self = StObject.set(x, "authority_to_leave", value.asInstanceOf[js.Any])
    
    inline def setAuthority_to_leaveUndefined: Self = StObject.set(x, "authority_to_leave", js.undefined)
    
    inline def setBypass_address_validation(value: Boolean): Self = StObject.set(x, "bypass_address_validation", value.asInstanceOf[js.Any])
    
    inline def setBypass_address_validationUndefined: Self = StObject.set(x, "bypass_address_validation", js.undefined)
    
    inline def setCustomer_branch(value: String): Self = StObject.set(x, "customer_branch", value.asInstanceOf[js.Any])
    
    inline def setCustomer_branchUndefined: Self = StObject.set(x, "customer_branch", js.undefined)
    
    inline def setPremium(value: Boolean): Self = StObject.set(x, "premium", value.asInstanceOf[js.Any])
    
    inline def setPremiumUndefined: Self = StObject.set(x, "premium", js.undefined)
    
    inline def setRequest_retail_rates(value: Boolean): Self = StObject.set(x, "request_retail_rates", value.asInstanceOf[js.Any])
    
    inline def setRequest_retail_ratesUndefined: Self = StObject.set(x, "request_retail_rates", js.undefined)
    
    inline def setSaturday_delivery(value: Boolean): Self = StObject.set(x, "saturday_delivery", value.asInstanceOf[js.Any])
    
    inline def setSaturday_deliveryUndefined: Self = StObject.set(x, "saturday_delivery", js.undefined)
    
    inline def setSignature_confirmation(value: STANDARD | ADULT | CERTIFIED | INDIRECT | CARRIER_CONFIRMATION): Self = StObject.set(x, "signature_confirmation", value.asInstanceOf[js.Any])
    
    inline def setSignature_confirmationUndefined: Self = StObject.set(x, "signature_confirmation", js.undefined)
  }
}
