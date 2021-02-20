package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The RTCIceCandidate interface—part of the WebRTC API—represents a candidate Internet Connectivity Establishment (ICE) configuration which may be used to establish an RTCPeerConnection. */
@js.native
trait RTCIceCandidate extends StObject {
  
  val candidate: java.lang.String = js.native
  
  val component: RTCIceComponent | Null = js.native
  
  val foundation: java.lang.String | Null = js.native
  
  val port: Double | Null = js.native
  
  val priority: Double | Null = js.native
  
  val protocol: RTCIceProtocol | Null = js.native
  
  val relatedAddress: java.lang.String | Null = js.native
  
  val relatedPort: Double | Null = js.native
  
  val sdpMLineIndex: Double | Null = js.native
  
  val sdpMid: java.lang.String | Null = js.native
  
  val tcpType: RTCIceTcpCandidateType | Null = js.native
  
  def toJSON(): RTCIceCandidateInit = js.native
  
  val `type`: RTCIceCandidateType | Null = js.native
  
  val usernameFragment: java.lang.String | Null = js.native
}
object RTCIceCandidate {
  
  @scala.inline
  def apply(candidate: java.lang.String, toJSON: () => RTCIceCandidateInit): RTCIceCandidate = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[RTCIceCandidate]
  }
  
  @scala.inline
  implicit class RTCIceCandidateMutableBuilder[Self <: RTCIceCandidate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidate(value: java.lang.String): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: RTCIceComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentNull: Self = StObject.set(x, "component", null)
    
    @scala.inline
    def setFoundation(value: java.lang.String): Self = StObject.set(x, "foundation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoundationNull: Self = StObject.set(x, "foundation", null)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortNull: Self = StObject.set(x, "port", null)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    @scala.inline
    def setProtocol(value: RTCIceProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    @scala.inline
    def setRelatedAddress(value: java.lang.String): Self = StObject.set(x, "relatedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedAddressNull: Self = StObject.set(x, "relatedAddress", null)
    
    @scala.inline
    def setRelatedPort(value: Double): Self = StObject.set(x, "relatedPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedPortNull: Self = StObject.set(x, "relatedPort", null)
    
    @scala.inline
    def setSdpMLineIndex(value: Double): Self = StObject.set(x, "sdpMLineIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpMLineIndexNull: Self = StObject.set(x, "sdpMLineIndex", null)
    
    @scala.inline
    def setSdpMid(value: java.lang.String): Self = StObject.set(x, "sdpMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpMidNull: Self = StObject.set(x, "sdpMid", null)
    
    @scala.inline
    def setTcpType(value: RTCIceTcpCandidateType): Self = StObject.set(x, "tcpType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpTypeNull: Self = StObject.set(x, "tcpType", null)
    
    @scala.inline
    def setToJSON(value: () => RTCIceCandidateInit): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: RTCIceCandidateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setUsernameFragment(value: java.lang.String): Self = StObject.set(x, "usernameFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameFragmentNull: Self = StObject.set(x, "usernameFragment", null)
  }
}
