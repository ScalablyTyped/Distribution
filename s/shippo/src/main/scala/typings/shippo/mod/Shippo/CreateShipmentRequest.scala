package typings.shippo.mod.Shippo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateShipmentRequest extends StObject {
  
  var address_from: CreateAddressRequest | String
  
  var address_return: js.UndefOr[CreateAddressRequest | String] = js.undefined
  
  var address_to: CreateAddressRequest | String
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var customs_declaration: js.UndefOr[CreateCustomsDeclarationRequest] = js.undefined
  
  var extra: js.UndefOr[ShipmentExtras] = js.undefined
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var parcels: String | CreateParcelRequest | js.Array[CreateParcelRequest]
  
  var shipment_date: js.UndefOr[String] = js.undefined
}
object CreateShipmentRequest {
  
  inline def apply(
    address_from: CreateAddressRequest | String,
    address_to: CreateAddressRequest | String,
    parcels: String | CreateParcelRequest | js.Array[CreateParcelRequest]
  ): CreateShipmentRequest = {
    val __obj = js.Dynamic.literal(address_from = address_from.asInstanceOf[js.Any], address_to = address_to.asInstanceOf[js.Any], parcels = parcels.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateShipmentRequest]
  }
  
  extension [Self <: CreateShipmentRequest](x: Self) {
    
    inline def setAddress_from(value: CreateAddressRequest | String): Self = StObject.set(x, "address_from", value.asInstanceOf[js.Any])
    
    inline def setAddress_return(value: CreateAddressRequest | String): Self = StObject.set(x, "address_return", value.asInstanceOf[js.Any])
    
    inline def setAddress_returnUndefined: Self = StObject.set(x, "address_return", js.undefined)
    
    inline def setAddress_to(value: CreateAddressRequest | String): Self = StObject.set(x, "address_to", value.asInstanceOf[js.Any])
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setCustoms_declaration(value: CreateCustomsDeclarationRequest): Self = StObject.set(x, "customs_declaration", value.asInstanceOf[js.Any])
    
    inline def setCustoms_declarationUndefined: Self = StObject.set(x, "customs_declaration", js.undefined)
    
    inline def setExtra(value: ShipmentExtras): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setParcels(value: String | CreateParcelRequest | js.Array[CreateParcelRequest]): Self = StObject.set(x, "parcels", value.asInstanceOf[js.Any])
    
    inline def setParcelsVarargs(value: CreateParcelRequest*): Self = StObject.set(x, "parcels", js.Array(value*))
    
    inline def setShipment_date(value: String): Self = StObject.set(x, "shipment_date", value.asInstanceOf[js.Any])
    
    inline def setShipment_dateUndefined: Self = StObject.set(x, "shipment_date", js.undefined)
  }
}
