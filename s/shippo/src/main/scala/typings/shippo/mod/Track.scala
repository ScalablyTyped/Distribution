package typings.shippo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Track extends StObject {
  
  var address_from: Location
  
  var address_to: Location
  
  var carrier: Carriers
  
  var eta: String
  
  var messages: js.Array[String]
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var original_eta: String
  
  var servicelevel: ServiceLevel
  
  var tracking_history: js.Array[TrackingStatus]
  
  var tracking_number: String
  
  var tracking_status: TrackingStatus
  
  var transaction: String
}
object Track {
  
  inline def apply(
    address_from: Location,
    address_to: Location,
    carrier: Carriers,
    eta: String,
    messages: js.Array[String],
    original_eta: String,
    servicelevel: ServiceLevel,
    tracking_history: js.Array[TrackingStatus],
    tracking_number: String,
    tracking_status: TrackingStatus,
    transaction: String
  ): Track = {
    val __obj = js.Dynamic.literal(address_from = address_from.asInstanceOf[js.Any], address_to = address_to.asInstanceOf[js.Any], carrier = carrier.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], original_eta = original_eta.asInstanceOf[js.Any], servicelevel = servicelevel.asInstanceOf[js.Any], tracking_history = tracking_history.asInstanceOf[js.Any], tracking_number = tracking_number.asInstanceOf[js.Any], tracking_status = tracking_status.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Track]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Track] (val x: Self) extends AnyVal {
    
    inline def setAddress_from(value: Location): Self = StObject.set(x, "address_from", value.asInstanceOf[js.Any])
    
    inline def setAddress_to(value: Location): Self = StObject.set(x, "address_to", value.asInstanceOf[js.Any])
    
    inline def setCarrier(value: Carriers): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setEta(value: String): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: js.Array[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: String*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOriginal_eta(value: String): Self = StObject.set(x, "original_eta", value.asInstanceOf[js.Any])
    
    inline def setServicelevel(value: ServiceLevel): Self = StObject.set(x, "servicelevel", value.asInstanceOf[js.Any])
    
    inline def setTracking_history(value: js.Array[TrackingStatus]): Self = StObject.set(x, "tracking_history", value.asInstanceOf[js.Any])
    
    inline def setTracking_historyVarargs(value: TrackingStatus*): Self = StObject.set(x, "tracking_history", js.Array(value*))
    
    inline def setTracking_number(value: String): Self = StObject.set(x, "tracking_number", value.asInstanceOf[js.Any])
    
    inline def setTracking_status(value: TrackingStatus): Self = StObject.set(x, "tracking_status", value.asInstanceOf[js.Any])
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
