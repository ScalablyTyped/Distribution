package typings.shippo.mod.Shippo

import typings.shippo.anon.Create
import typings.shippo.anon.CreateList
import typings.shippo.anon.ListRetrieve
import typings.shippo.anon.Retrieve
import typings.shippo.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shippo extends StObject {
  
  var address: typings.shippo.anon.List
  
  var carrieraccount: ListRetrieve
  
  var parcel: CreateList
  
  var rate: `0`
  
  var shipment: Create
  
  var transaction: Retrieve
}
object Shippo {
  
  inline def apply(
    address: typings.shippo.anon.List,
    carrieraccount: ListRetrieve,
    parcel: CreateList,
    rate: `0`,
    shipment: Create,
    transaction: Retrieve
  ): typings.shippo.mod.Shippo.Shippo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], carrieraccount = carrieraccount.asInstanceOf[js.Any], parcel = parcel.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], shipment = shipment.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.shippo.mod.Shippo.Shippo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typings.shippo.mod.Shippo.Shippo] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: typings.shippo.anon.List): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setCarrieraccount(value: ListRetrieve): Self = StObject.set(x, "carrieraccount", value.asInstanceOf[js.Any])
    
    inline def setParcel(value: CreateList): Self = StObject.set(x, "parcel", value.asInstanceOf[js.Any])
    
    inline def setRate(value: `0`): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setShipment(value: Create): Self = StObject.set(x, "shipment", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: Retrieve): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
