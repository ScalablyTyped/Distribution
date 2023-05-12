package typings.shippo.mod

import typings.shippo.mod.Batch.ObjectResults
import typings.shippo.mod.Batch.ShipmentListWrapper
import typings.shippo.mod.Batch.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Batch
  extends StObject
     with Metadata {
  
  var batch_shipments: ShipmentListWrapper
  
  var default_carrier_account: String
  
  var default_servicelevel_token: String
  
  var label_filetype: js.UndefOr[LabelFileType] = js.undefined
  
  var label_url: String
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var object_results: ObjectResults
  
  var status: Status
  
  var test: js.UndefOr[Boolean] = js.undefined
}
object Batch {
  
  inline def apply(
    batch_shipments: ShipmentListWrapper,
    default_carrier_account: String,
    default_servicelevel_token: String,
    label_url: String,
    object_created: String,
    object_id: String,
    object_owner: String,
    object_results: ObjectResults,
    object_updated: String,
    status: Status
  ): Batch = {
    val __obj = js.Dynamic.literal(batch_shipments = batch_shipments.asInstanceOf[js.Any], default_carrier_account = default_carrier_account.asInstanceOf[js.Any], default_servicelevel_token = default_servicelevel_token.asInstanceOf[js.Any], label_url = label_url.asInstanceOf[js.Any], object_created = object_created.asInstanceOf[js.Any], object_id = object_id.asInstanceOf[js.Any], object_owner = object_owner.asInstanceOf[js.Any], object_results = object_results.asInstanceOf[js.Any], object_updated = object_updated.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Batch]
  }
  
  trait ErrorMessage extends StObject {
    
    var shipment: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ErrorMessage {
    
    inline def apply(): ErrorMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorMessage] (val x: Self) extends AnyVal {
      
      inline def setShipment(value: js.Array[String]): Self = StObject.set(x, "shipment", value.asInstanceOf[js.Any])
      
      inline def setShipmentUndefined: Self = StObject.set(x, "shipment", js.undefined)
      
      inline def setShipmentVarargs(value: String*): Self = StObject.set(x, "shipment", js.Array(value*))
    }
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Batch] (val x: Self) extends AnyVal {
    
    inline def setBatch_shipments(value: ShipmentListWrapper): Self = StObject.set(x, "batch_shipments", value.asInstanceOf[js.Any])
    
    inline def setDefault_carrier_account(value: String): Self = StObject.set(x, "default_carrier_account", value.asInstanceOf[js.Any])
    
    inline def setDefault_servicelevel_token(value: String): Self = StObject.set(x, "default_servicelevel_token", value.asInstanceOf[js.Any])
    
    inline def setLabel_filetype(value: LabelFileType): Self = StObject.set(x, "label_filetype", value.asInstanceOf[js.Any])
    
    inline def setLabel_filetypeUndefined: Self = StObject.set(x, "label_filetype", js.undefined)
    
    inline def setLabel_url(value: String): Self = StObject.set(x, "label_url", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setObject_results(value: ObjectResults): Self = StObject.set(x, "object_results", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.shippo.shippoStrings.creation_succeeded
    - typings.shippo.shippoStrings.creation_failed
    - typings.shippo.shippoStrings.purchase_succeeded
    - typings.shippo.shippoStrings.purchase_failed
  */
  trait ObjectResult extends StObject
  object ObjectResult {
    
    inline def creation_failed: typings.shippo.shippoStrings.creation_failed = "creation_failed".asInstanceOf[typings.shippo.shippoStrings.creation_failed]
    
    inline def creation_succeeded: typings.shippo.shippoStrings.creation_succeeded = "creation_succeeded".asInstanceOf[typings.shippo.shippoStrings.creation_succeeded]
    
    inline def purchase_failed: typings.shippo.shippoStrings.purchase_failed = "purchase_failed".asInstanceOf[typings.shippo.shippoStrings.purchase_failed]
    
    inline def purchase_succeeded: typings.shippo.shippoStrings.purchase_succeeded = "purchase_succeeded".asInstanceOf[typings.shippo.shippoStrings.purchase_succeeded]
  }
  
  trait ObjectResults extends StObject {
    
    var creation_failed: Double
    
    var creation_succeeded: Double
    
    var purchase_failed: Double
    
    var purchase_succeeded: Double
  }
  object ObjectResults {
    
    inline def apply(
      creation_failed: Double,
      creation_succeeded: Double,
      purchase_failed: Double,
      purchase_succeeded: Double
    ): ObjectResults = {
      val __obj = js.Dynamic.literal(creation_failed = creation_failed.asInstanceOf[js.Any], creation_succeeded = creation_succeeded.asInstanceOf[js.Any], purchase_failed = purchase_failed.asInstanceOf[js.Any], purchase_succeeded = purchase_succeeded.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectResults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectResults] (val x: Self) extends AnyVal {
      
      inline def setCreation_failed(value: Double): Self = StObject.set(x, "creation_failed", value.asInstanceOf[js.Any])
      
      inline def setCreation_succeeded(value: Double): Self = StObject.set(x, "creation_succeeded", value.asInstanceOf[js.Any])
      
      inline def setPurchase_failed(value: Double): Self = StObject.set(x, "purchase_failed", value.asInstanceOf[js.Any])
      
      inline def setPurchase_succeeded(value: Double): Self = StObject.set(x, "purchase_succeeded", value.asInstanceOf[js.Any])
    }
  }
  
  trait Shipment extends StObject {
    
    var carrier_account: js.UndefOr[String] = js.undefined
    
    var messages: js.UndefOr[js.Array[ErrorMessage]] = js.undefined
    
    var metadata: js.UndefOr[String] = js.undefined
    
    var object_id: String
    
    var servicelevel_token: js.UndefOr[String] = js.undefined
    
    var shipment: String
    
    var status: typings.shippo.mod.Batch.Shipment.Status
    
    var transaction: js.UndefOr[String] = js.undefined
  }
  object Shipment {
    
    inline def apply(object_id: String, shipment: String, status: typings.shippo.mod.Batch.Shipment.Status): typings.shippo.mod.Batch.Shipment = {
      val __obj = js.Dynamic.literal(object_id = object_id.asInstanceOf[js.Any], shipment = shipment.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.shippo.mod.Batch.Shipment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.shippo.mod.Batch.Shipment] (val x: Self) extends AnyVal {
      
      inline def setCarrier_account(value: String): Self = StObject.set(x, "carrier_account", value.asInstanceOf[js.Any])
      
      inline def setCarrier_accountUndefined: Self = StObject.set(x, "carrier_account", js.undefined)
      
      inline def setMessages(value: js.Array[ErrorMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMessagesVarargs(value: ErrorMessage*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setObject_id(value: String): Self = StObject.set(x, "object_id", value.asInstanceOf[js.Any])
      
      inline def setServicelevel_token(value: String): Self = StObject.set(x, "servicelevel_token", value.asInstanceOf[js.Any])
      
      inline def setServicelevel_tokenUndefined: Self = StObject.set(x, "servicelevel_token", js.undefined)
      
      inline def setShipment(value: String): Self = StObject.set(x, "shipment", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: typings.shippo.mod.Batch.Shipment.Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
      
      inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.shippo.shippoStrings.INVALID
      - typings.shippo.shippoStrings.VALID
      - typings.shippo.shippoStrings.INCOMPLETE
      - typings.shippo.shippoStrings.TRANSACTION_FAILED
    */
    trait Status extends StObject
    object Status {
      
      inline def INCOMPLETE: typings.shippo.shippoStrings.INCOMPLETE = "INCOMPLETE".asInstanceOf[typings.shippo.shippoStrings.INCOMPLETE]
      
      inline def INVALID: typings.shippo.shippoStrings.INVALID = "INVALID".asInstanceOf[typings.shippo.shippoStrings.INVALID]
      
      inline def TRANSACTION_FAILED: typings.shippo.shippoStrings.TRANSACTION_FAILED = "TRANSACTION_FAILED".asInstanceOf[typings.shippo.shippoStrings.TRANSACTION_FAILED]
      
      inline def VALID: typings.shippo.shippoStrings.VALID = "VALID".asInstanceOf[typings.shippo.shippoStrings.VALID]
    }
  }
  
  trait ShipmentListWrapper extends StObject {
    
    var next: js.UndefOr[String] = js.undefined
    
    var previous: js.UndefOr[String] = js.undefined
    
    var results: js.UndefOr[js.Array[typings.shippo.mod.Batch.Shipment]] = js.undefined
  }
  object ShipmentListWrapper {
    
    inline def apply(): ShipmentListWrapper = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShipmentListWrapper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShipmentListWrapper] (val x: Self) extends AnyVal {
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      inline def setResults(value: js.Array[typings.shippo.mod.Batch.Shipment]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setResultsVarargs(value: typings.shippo.mod.Batch.Shipment*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.shippo.shippoStrings.VALIDATING
    - typings.shippo.shippoStrings.VALID
    - typings.shippo.shippoStrings.INVALID
    - typings.shippo.shippoStrings.PURCHASING
    - typings.shippo.shippoStrings.PURCHASED
  */
  trait Status extends StObject
  object Status {
    
    inline def INVALID: typings.shippo.shippoStrings.INVALID = "INVALID".asInstanceOf[typings.shippo.shippoStrings.INVALID]
    
    inline def PURCHASED: typings.shippo.shippoStrings.PURCHASED = "PURCHASED".asInstanceOf[typings.shippo.shippoStrings.PURCHASED]
    
    inline def PURCHASING: typings.shippo.shippoStrings.PURCHASING = "PURCHASING".asInstanceOf[typings.shippo.shippoStrings.PURCHASING]
    
    inline def VALID: typings.shippo.shippoStrings.VALID = "VALID".asInstanceOf[typings.shippo.shippoStrings.VALID]
    
    inline def VALIDATING: typings.shippo.shippoStrings.VALIDATING = "VALIDATING".asInstanceOf[typings.shippo.shippoStrings.VALIDATING]
  }
}
