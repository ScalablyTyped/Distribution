package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIceCandidateAttributes
  extends StObject
     with RTCStats {
  
  var addressSourceUrl: js.UndefOr[java.lang.String] = js.undefined
  
  var candidateType: js.UndefOr[RTCStatsIceCandidateType] = js.undefined
  
  var ipAddress: js.UndefOr[java.lang.String] = js.undefined
  
  var portNumber: js.UndefOr[Double] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var transport: js.UndefOr[java.lang.String] = js.undefined
}
object RTCIceCandidateAttributes {
  
  inline def apply(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): RTCIceCandidateAttributes = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidateAttributes]
  }
  
  extension [Self <: RTCIceCandidateAttributes](x: Self) {
    
    inline def setAddressSourceUrl(value: java.lang.String): Self = StObject.set(x, "addressSourceUrl", value.asInstanceOf[js.Any])
    
    inline def setAddressSourceUrlUndefined: Self = StObject.set(x, "addressSourceUrl", js.undefined)
    
    inline def setCandidateType(value: RTCStatsIceCandidateType): Self = StObject.set(x, "candidateType", value.asInstanceOf[js.Any])
    
    inline def setCandidateTypeUndefined: Self = StObject.set(x, "candidateType", js.undefined)
    
    inline def setIpAddress(value: java.lang.String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setPortNumber(value: Double): Self = StObject.set(x, "portNumber", value.asInstanceOf[js.Any])
    
    inline def setPortNumberUndefined: Self = StObject.set(x, "portNumber", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setTransport(value: java.lang.String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
  }
}
