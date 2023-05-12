package typings.shippo.mod

import typings.shippo.mod.Transaction.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction
  extends StObject
     with Metadata {
  
  var commercial_invoice_url: String
  
  var eta: String
  
  var label_file_type: LabelFileType
  
  var label_url: String
  
  var messages: js.Array[Message]
  
  var metadata: String
  
  var object_state: ObjectState
  
  var qr_code_url: String
  
  var rate: Rate
  
  var status: Status
  
  var test: Boolean
  
  var tracking_number: String
  
  var tracking_status: TrackingStatuses
  
  var tracking_url_provider: String
}
object Transaction {
  
  inline def apply(
    commercial_invoice_url: String,
    eta: String,
    label_file_type: LabelFileType,
    label_url: String,
    messages: js.Array[Message],
    metadata: String,
    object_created: String,
    object_id: String,
    object_owner: String,
    object_state: ObjectState,
    object_updated: String,
    qr_code_url: String,
    rate: Rate,
    status: Status,
    test: Boolean,
    tracking_number: String,
    tracking_status: TrackingStatuses,
    tracking_url_provider: String
  ): Transaction = {
    val __obj = js.Dynamic.literal(commercial_invoice_url = commercial_invoice_url.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], label_file_type = label_file_type.asInstanceOf[js.Any], label_url = label_url.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], object_created = object_created.asInstanceOf[js.Any], object_id = object_id.asInstanceOf[js.Any], object_owner = object_owner.asInstanceOf[js.Any], object_state = object_state.asInstanceOf[js.Any], object_updated = object_updated.asInstanceOf[js.Any], qr_code_url = qr_code_url.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], tracking_number = tracking_number.asInstanceOf[js.Any], tracking_status = tracking_status.asInstanceOf[js.Any], tracking_url_provider = tracking_url_provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
    
    inline def setCommercial_invoice_url(value: String): Self = StObject.set(x, "commercial_invoice_url", value.asInstanceOf[js.Any])
    
    inline def setEta(value: String): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
    
    inline def setLabel_file_type(value: LabelFileType): Self = StObject.set(x, "label_file_type", value.asInstanceOf[js.Any])
    
    inline def setLabel_url(value: String): Self = StObject.set(x, "label_url", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject_state(value: ObjectState): Self = StObject.set(x, "object_state", value.asInstanceOf[js.Any])
    
    inline def setQr_code_url(value: String): Self = StObject.set(x, "qr_code_url", value.asInstanceOf[js.Any])
    
    inline def setRate(value: Rate): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTracking_number(value: String): Self = StObject.set(x, "tracking_number", value.asInstanceOf[js.Any])
    
    inline def setTracking_status(value: TrackingStatuses): Self = StObject.set(x, "tracking_status", value.asInstanceOf[js.Any])
    
    inline def setTracking_url_provider(value: String): Self = StObject.set(x, "tracking_url_provider", value.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.shippo.shippoStrings.WAITING
    - typings.shippo.shippoStrings.QUEUED
    - typings.shippo.shippoStrings.SUCCESS
    - typings.shippo.shippoStrings.ERROR
    - typings.shippo.shippoStrings.REFUNDED
    - typings.shippo.shippoStrings.REFUNDPENDING
    - typings.shippo.shippoStrings.REFUNDREJECTED
  */
  trait Status extends StObject
  object Status {
    
    inline def ERROR: typings.shippo.shippoStrings.ERROR = "ERROR".asInstanceOf[typings.shippo.shippoStrings.ERROR]
    
    inline def QUEUED: typings.shippo.shippoStrings.QUEUED = "QUEUED".asInstanceOf[typings.shippo.shippoStrings.QUEUED]
    
    inline def REFUNDED: typings.shippo.shippoStrings.REFUNDED = "REFUNDED".asInstanceOf[typings.shippo.shippoStrings.REFUNDED]
    
    inline def REFUNDPENDING: typings.shippo.shippoStrings.REFUNDPENDING = "REFUNDPENDING".asInstanceOf[typings.shippo.shippoStrings.REFUNDPENDING]
    
    inline def REFUNDREJECTED: typings.shippo.shippoStrings.REFUNDREJECTED = "REFUNDREJECTED".asInstanceOf[typings.shippo.shippoStrings.REFUNDREJECTED]
    
    inline def SUCCESS: typings.shippo.shippoStrings.SUCCESS = "SUCCESS".asInstanceOf[typings.shippo.shippoStrings.SUCCESS]
    
    inline def WAITING: typings.shippo.shippoStrings.WAITING = "WAITING".asInstanceOf[typings.shippo.shippoStrings.WAITING]
  }
}
