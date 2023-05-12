package typings.shippo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateManifestRequest
  extends StObject
     with Asyncable {
  
  var address_from: CreateAddressRequest | String
  
  var carrier_account: String
  
  var shipment_date: String
  
  var transactions: js.UndefOr[js.Array[String]] = js.undefined
}
object CreateManifestRequest {
  
  inline def apply(address_from: CreateAddressRequest | String, carrier_account: String, shipment_date: String): CreateManifestRequest = {
    val __obj = js.Dynamic.literal(address_from = address_from.asInstanceOf[js.Any], carrier_account = carrier_account.asInstanceOf[js.Any], shipment_date = shipment_date.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateManifestRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateManifestRequest] (val x: Self) extends AnyVal {
    
    inline def setAddress_from(value: CreateAddressRequest | String): Self = StObject.set(x, "address_from", value.asInstanceOf[js.Any])
    
    inline def setCarrier_account(value: String): Self = StObject.set(x, "carrier_account", value.asInstanceOf[js.Any])
    
    inline def setShipment_date(value: String): Self = StObject.set(x, "shipment_date", value.asInstanceOf[js.Any])
    
    inline def setTransactions(value: js.Array[String]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsUndefined: Self = StObject.set(x, "transactions", js.undefined)
    
    inline def setTransactionsVarargs(value: String*): Self = StObject.set(x, "transactions", js.Array(value*))
  }
}
