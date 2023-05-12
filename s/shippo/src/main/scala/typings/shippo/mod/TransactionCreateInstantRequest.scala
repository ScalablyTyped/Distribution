package typings.shippo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionCreateInstantRequest extends StObject {
  
  var carrier_account: String
  
  var label_file_type: js.UndefOr[LabelFileType] = js.undefined
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var servicelevel_token: ServiceLevels
  
  var shipment: CreateShipmentRequest
}
object TransactionCreateInstantRequest {
  
  inline def apply(carrier_account: String, servicelevel_token: ServiceLevels, shipment: CreateShipmentRequest): TransactionCreateInstantRequest = {
    val __obj = js.Dynamic.literal(carrier_account = carrier_account.asInstanceOf[js.Any], servicelevel_token = servicelevel_token.asInstanceOf[js.Any], shipment = shipment.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionCreateInstantRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransactionCreateInstantRequest] (val x: Self) extends AnyVal {
    
    inline def setCarrier_account(value: String): Self = StObject.set(x, "carrier_account", value.asInstanceOf[js.Any])
    
    inline def setLabel_file_type(value: LabelFileType): Self = StObject.set(x, "label_file_type", value.asInstanceOf[js.Any])
    
    inline def setLabel_file_typeUndefined: Self = StObject.set(x, "label_file_type", js.undefined)
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setServicelevel_token(value: ServiceLevels): Self = StObject.set(x, "servicelevel_token", value.asInstanceOf[js.Any])
    
    inline def setShipment(value: CreateShipmentRequest): Self = StObject.set(x, "shipment", value.asInstanceOf[js.Any])
  }
}
