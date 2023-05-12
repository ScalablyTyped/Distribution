package typings.shippo.mod

import typings.shippo.mod.Manifest.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Manifest
  extends StObject
     with Metadata {
  
  var address_from: String
  
  var carrier_account: String
  
  var documents: js.Array[String]
  
  var errors: js.UndefOr[js.Array[String]] = js.undefined
  
  var shipment_date: String
  
  var status: Status
  
  var transactions: js.UndefOr[js.Array[String]] = js.undefined
}
object Manifest {
  
  inline def apply(
    address_from: String,
    carrier_account: String,
    documents: js.Array[String],
    object_created: String,
    object_id: String,
    object_owner: String,
    object_updated: String,
    shipment_date: String,
    status: Status
  ): Manifest = {
    val __obj = js.Dynamic.literal(address_from = address_from.asInstanceOf[js.Any], carrier_account = carrier_account.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], object_created = object_created.asInstanceOf[js.Any], object_id = object_id.asInstanceOf[js.Any], object_owner = object_owner.asInstanceOf[js.Any], object_updated = object_updated.asInstanceOf[js.Any], shipment_date = shipment_date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Manifest] (val x: Self) extends AnyVal {
    
    inline def setAddress_from(value: String): Self = StObject.set(x, "address_from", value.asInstanceOf[js.Any])
    
    inline def setCarrier_account(value: String): Self = StObject.set(x, "carrier_account", value.asInstanceOf[js.Any])
    
    inline def setDocuments(value: js.Array[String]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsVarargs(value: String*): Self = StObject.set(x, "documents", js.Array(value*))
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setShipment_date(value: String): Self = StObject.set(x, "shipment_date", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTransactions(value: js.Array[String]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsUndefined: Self = StObject.set(x, "transactions", js.undefined)
    
    inline def setTransactionsVarargs(value: String*): Self = StObject.set(x, "transactions", js.Array(value*))
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.shippo.shippoStrings.QUEUED
    - typings.shippo.shippoStrings.SUCCESS
    - typings.shippo.shippoStrings.ERROR
  */
  trait Status extends StObject
  object Status {
    
    inline def ERROR: typings.shippo.shippoStrings.ERROR = "ERROR".asInstanceOf[typings.shippo.shippoStrings.ERROR]
    
    inline def QUEUED: typings.shippo.shippoStrings.QUEUED = "QUEUED".asInstanceOf[typings.shippo.shippoStrings.QUEUED]
    
    inline def SUCCESS: typings.shippo.shippoStrings.SUCCESS = "SUCCESS".asInstanceOf[typings.shippo.shippoStrings.SUCCESS]
  }
}
