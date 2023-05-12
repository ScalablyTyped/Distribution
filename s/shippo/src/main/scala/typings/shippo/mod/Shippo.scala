package typings.shippo.mod

import typings.shippo.anon.Add
import typings.shippo.anon.Create
import typings.shippo.anon.CreateList
import typings.shippo.anon.CreateListRetrieve
import typings.shippo.anon.Getstatus
import typings.shippo.anon.ListRetrieve
import typings.shippo.anon.Retrieve
import typings.shippo.anon.`0`
import typings.shippo.anon.`1`
import typings.shippo.anon.`2`
import typings.shippo.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shippo extends StObject {
  
  var address: Create
  
  var batch: Add
  
  var carrieraccount: `0`
  
  var customsdeclaration: CreateListRetrieve
  
  var customsitem: ListRetrieve
  
  var manifest: `1`
  
  var parcel: typings.shippo.anon.List
  
  var rate: `3`
  
  var refund: `2`
  
  var shipment: Retrieve
  
  var track: Getstatus
  
  var transaction: CreateList
}
object Shippo {
  
  inline def apply(
    address: Create,
    batch: Add,
    carrieraccount: `0`,
    customsdeclaration: CreateListRetrieve,
    customsitem: ListRetrieve,
    manifest: `1`,
    parcel: typings.shippo.anon.List,
    rate: `3`,
    refund: `2`,
    shipment: Retrieve,
    track: Getstatus,
    transaction: CreateList
  ): Shippo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], batch = batch.asInstanceOf[js.Any], carrieraccount = carrieraccount.asInstanceOf[js.Any], customsdeclaration = customsdeclaration.asInstanceOf[js.Any], customsitem = customsitem.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], parcel = parcel.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], refund = refund.asInstanceOf[js.Any], shipment = shipment.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shippo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shippo] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Create): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setBatch(value: Add): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setCarrieraccount(value: `0`): Self = StObject.set(x, "carrieraccount", value.asInstanceOf[js.Any])
    
    inline def setCustomsdeclaration(value: CreateListRetrieve): Self = StObject.set(x, "customsdeclaration", value.asInstanceOf[js.Any])
    
    inline def setCustomsitem(value: ListRetrieve): Self = StObject.set(x, "customsitem", value.asInstanceOf[js.Any])
    
    inline def setManifest(value: `1`): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setParcel(value: typings.shippo.anon.List): Self = StObject.set(x, "parcel", value.asInstanceOf[js.Any])
    
    inline def setRate(value: `3`): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRefund(value: `2`): Self = StObject.set(x, "refund", value.asInstanceOf[js.Any])
    
    inline def setShipment(value: Retrieve): Self = StObject.set(x, "shipment", value.asInstanceOf[js.Any])
    
    inline def setTrack(value: Getstatus): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: CreateList): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
