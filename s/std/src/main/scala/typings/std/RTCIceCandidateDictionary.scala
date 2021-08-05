package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIceCandidateDictionary
  extends StObject
     with RTCIceGatherCandidate {
  
  var foundation: js.UndefOr[java.lang.String] = js.undefined
  
  var ip: js.UndefOr[java.lang.String] = js.undefined
  
  var msMTurnSessionId: js.UndefOr[java.lang.String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var protocol: js.UndefOr[RTCIceProtocol] = js.undefined
  
  var relatedAddress: js.UndefOr[java.lang.String] = js.undefined
  
  var relatedPort: js.UndefOr[Double] = js.undefined
  
  var tcpType: js.UndefOr[RTCIceTcpCandidateType] = js.undefined
  
  var `type`: js.UndefOr[RTCIceCandidateType] = js.undefined
}
object RTCIceCandidateDictionary {
  
  inline def apply(): RTCIceCandidateDictionary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceCandidateDictionary]
  }
  
  extension [Self <: RTCIceCandidateDictionary](x: Self) {
    
    inline def setFoundation(value: java.lang.String): Self = StObject.set(x, "foundation", value.asInstanceOf[js.Any])
    
    inline def setFoundationUndefined: Self = StObject.set(x, "foundation", js.undefined)
    
    inline def setIp(value: java.lang.String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setMsMTurnSessionId(value: java.lang.String): Self = StObject.set(x, "msMTurnSessionId", value.asInstanceOf[js.Any])
    
    inline def setMsMTurnSessionIdUndefined: Self = StObject.set(x, "msMTurnSessionId", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProtocol(value: RTCIceProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setRelatedAddress(value: java.lang.String): Self = StObject.set(x, "relatedAddress", value.asInstanceOf[js.Any])
    
    inline def setRelatedAddressUndefined: Self = StObject.set(x, "relatedAddress", js.undefined)
    
    inline def setRelatedPort(value: Double): Self = StObject.set(x, "relatedPort", value.asInstanceOf[js.Any])
    
    inline def setRelatedPortUndefined: Self = StObject.set(x, "relatedPort", js.undefined)
    
    inline def setTcpType(value: RTCIceTcpCandidateType): Self = StObject.set(x, "tcpType", value.asInstanceOf[js.Any])
    
    inline def setTcpTypeUndefined: Self = StObject.set(x, "tcpType", js.undefined)
    
    inline def setType(value: RTCIceCandidateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
