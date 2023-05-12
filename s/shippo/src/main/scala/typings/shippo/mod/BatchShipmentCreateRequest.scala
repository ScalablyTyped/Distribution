package typings.shippo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchShipmentCreateRequest extends StObject {
  
  var carrier_account: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var servicelevel_token: js.UndefOr[String] = js.undefined
  
  var shipment: CreateShipmentRequest | String
}
object BatchShipmentCreateRequest {
  
  inline def apply(shipment: CreateShipmentRequest | String): BatchShipmentCreateRequest = {
    val __obj = js.Dynamic.literal(shipment = shipment.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchShipmentCreateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchShipmentCreateRequest] (val x: Self) extends AnyVal {
    
    inline def setCarrier_account(value: String): Self = StObject.set(x, "carrier_account", value.asInstanceOf[js.Any])
    
    inline def setCarrier_accountUndefined: Self = StObject.set(x, "carrier_account", js.undefined)
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setServicelevel_token(value: String): Self = StObject.set(x, "servicelevel_token", value.asInstanceOf[js.Any])
    
    inline def setServicelevel_tokenUndefined: Self = StObject.set(x, "servicelevel_token", js.undefined)
    
    inline def setShipment(value: CreateShipmentRequest | String): Self = StObject.set(x, "shipment", value.asInstanceOf[js.Any])
  }
}
