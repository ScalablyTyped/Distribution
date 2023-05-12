package typings.shippo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterTrackRequest extends StObject {
  
  var carrier: Carriers
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var tracking_number: String
}
object RegisterTrackRequest {
  
  inline def apply(carrier: Carriers, tracking_number: String): RegisterTrackRequest = {
    val __obj = js.Dynamic.literal(carrier = carrier.asInstanceOf[js.Any], tracking_number = tracking_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTrackRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterTrackRequest] (val x: Self) extends AnyVal {
    
    inline def setCarrier(value: Carriers): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setTracking_number(value: String): Self = StObject.set(x, "tracking_number", value.asInstanceOf[js.Any])
  }
}
