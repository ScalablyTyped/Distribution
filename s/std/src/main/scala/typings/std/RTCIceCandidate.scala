package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The RTCIceCandidate interface—part of the WebRTC API—represents a candidate Internet Connectivity Establishment (ICE) configuration which may be used to establish an RTCPeerConnection. */
@js.native
trait RTCIceCandidate extends js.Object {
  
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
  implicit class RTCIceCandidateOps[Self <: RTCIceCandidate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCandidate(value: java.lang.String): Self = this.set("candidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => RTCIceCandidateInit): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setComponent(value: RTCIceComponent): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentNull: Self = this.set("component", null)
    
    @scala.inline
    def setFoundation(value: java.lang.String): Self = this.set("foundation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoundationNull: Self = this.set("foundation", null)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortNull: Self = this.set("port", null)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityNull: Self = this.set("priority", null)
    
    @scala.inline
    def setProtocol(value: RTCIceProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolNull: Self = this.set("protocol", null)
    
    @scala.inline
    def setRelatedAddress(value: java.lang.String): Self = this.set("relatedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedAddressNull: Self = this.set("relatedAddress", null)
    
    @scala.inline
    def setRelatedPort(value: Double): Self = this.set("relatedPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedPortNull: Self = this.set("relatedPort", null)
    
    @scala.inline
    def setSdpMLineIndex(value: Double): Self = this.set("sdpMLineIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpMLineIndexNull: Self = this.set("sdpMLineIndex", null)
    
    @scala.inline
    def setSdpMid(value: java.lang.String): Self = this.set("sdpMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpMidNull: Self = this.set("sdpMid", null)
    
    @scala.inline
    def setTcpType(value: RTCIceTcpCandidateType): Self = this.set("tcpType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpTypeNull: Self = this.set("tcpType", null)
    
    @scala.inline
    def setType(value: RTCIceCandidateType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
    
    @scala.inline
    def setUsernameFragment(value: java.lang.String): Self = this.set("usernameFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameFragmentNull: Self = this.set("usernameFragment", null)
  }
}
