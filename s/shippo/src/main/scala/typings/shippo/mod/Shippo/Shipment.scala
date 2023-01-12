package typings.shippo.mod.Shippo

import typings.shippo.shippoStrings.ERROR
import typings.shippo.shippoStrings.QUEUED
import typings.shippo.shippoStrings.SUCCESS
import typings.shippo.shippoStrings.WAITING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://goshippo.com/docs/reference#shipments
trait Shipment
  extends StObject
     with Metadata {
  
  var address_from: Address | String
  
  var address_return: js.UndefOr[Address | String] = js.undefined
  
  var address_to: Address | String
  
  var parcels: js.Array[Parcel]
  
  var rates: js.Array[Rate]
  
  var shipment_date: js.UndefOr[String] = js.undefined
  
  var status: WAITING | QUEUED | SUCCESS | ERROR
  
  var test: js.UndefOr[Boolean] = js.undefined
}
object Shipment {
  
  inline def apply(
    address_from: Address | String,
    address_to: Address | String,
    object_created: String,
    object_id: String,
    object_owner: String,
    object_updated: String,
    parcels: js.Array[Parcel],
    rates: js.Array[Rate],
    status: WAITING | QUEUED | SUCCESS | ERROR
  ): Shipment = {
    val __obj = js.Dynamic.literal(address_from = address_from.asInstanceOf[js.Any], address_to = address_to.asInstanceOf[js.Any], object_created = object_created.asInstanceOf[js.Any], object_id = object_id.asInstanceOf[js.Any], object_owner = object_owner.asInstanceOf[js.Any], object_updated = object_updated.asInstanceOf[js.Any], parcels = parcels.asInstanceOf[js.Any], rates = rates.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shipment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shipment] (val x: Self) extends AnyVal {
    
    inline def setAddress_from(value: Address | String): Self = StObject.set(x, "address_from", value.asInstanceOf[js.Any])
    
    inline def setAddress_return(value: Address | String): Self = StObject.set(x, "address_return", value.asInstanceOf[js.Any])
    
    inline def setAddress_returnUndefined: Self = StObject.set(x, "address_return", js.undefined)
    
    inline def setAddress_to(value: Address | String): Self = StObject.set(x, "address_to", value.asInstanceOf[js.Any])
    
    inline def setParcels(value: js.Array[Parcel]): Self = StObject.set(x, "parcels", value.asInstanceOf[js.Any])
    
    inline def setParcelsVarargs(value: Parcel*): Self = StObject.set(x, "parcels", js.Array(value*))
    
    inline def setRates(value: js.Array[Rate]): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
    
    inline def setRatesVarargs(value: Rate*): Self = StObject.set(x, "rates", js.Array(value*))
    
    inline def setShipment_date(value: String): Self = StObject.set(x, "shipment_date", value.asInstanceOf[js.Any])
    
    inline def setShipment_dateUndefined: Self = StObject.set(x, "shipment_date", js.undefined)
    
    inline def setStatus(value: WAITING | QUEUED | SUCCESS | ERROR): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
