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
  
  @scala.inline
  def apply(): RTCIceCandidateDictionary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceCandidateDictionary]
  }
  
  @scala.inline
  implicit class RTCIceCandidateDictionaryMutableBuilder[Self <: RTCIceCandidateDictionary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFoundation(value: java.lang.String): Self = StObject.set(x, "foundation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoundationUndefined: Self = StObject.set(x, "foundation", js.undefined)
    
    @scala.inline
    def setIp(value: java.lang.String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    @scala.inline
    def setMsMTurnSessionId(value: java.lang.String): Self = StObject.set(x, "msMTurnSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsMTurnSessionIdUndefined: Self = StObject.set(x, "msMTurnSessionId", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setProtocol(value: RTCIceProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setRelatedAddress(value: java.lang.String): Self = StObject.set(x, "relatedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedAddressUndefined: Self = StObject.set(x, "relatedAddress", js.undefined)
    
    @scala.inline
    def setRelatedPort(value: Double): Self = StObject.set(x, "relatedPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedPortUndefined: Self = StObject.set(x, "relatedPort", js.undefined)
    
    @scala.inline
    def setTcpType(value: RTCIceTcpCandidateType): Self = StObject.set(x, "tcpType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpTypeUndefined: Self = StObject.set(x, "tcpType", js.undefined)
    
    @scala.inline
    def setType(value: RTCIceCandidateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
