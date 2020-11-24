package typings.sipJs.peerConnectionDelegateMod

import typings.std.Event
import typings.std.RTCDataChannelEvent
import typings.std.RTCPeerConnectionIceErrorEvent
import typings.std.RTCPeerConnectionIceEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeerConnectionDelegate extends js.Object {
  
  /**
    * This happens whenever the aggregate state of the connection changes.
    * The aggregate state is a combination of the states of all of the
    * individual network transports being used by the connection.
    * @param event - Event.
    */
  var onconnectionstatechange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  /**
    * Triggered when an RTCDataChannel is added to the connection by the
    * remote peer calling createDataChannel().
    * @param event - RTCDataChannelEvent.
    */
  var ondatachannel: js.UndefOr[js.Function1[/* event */ RTCDataChannelEvent, Unit]] = js.native
  
  /**
    * Triggered when a new ICE candidate has been found.
    * @param event - RTCPeerConnectionIceEvent.
    */
  var onicecandidate: js.UndefOr[js.Function1[/* event */ RTCPeerConnectionIceEvent, Unit]] = js.native
  
  /**
    * Triggered when an error occurred during ICE candidate gathering.
    * @param event - RTCPeerConnectionIceErrorEvent.
    */
  var onicecandidateerror: js.UndefOr[js.Function1[/* event */ RTCPeerConnectionIceErrorEvent, Unit]] = js.native
  
  /**
    * This happens whenever the local ICE agent needs to deliver a message to
    * the other peer through the signaling server. This lets the ICE agent
    * perform negotiation with the remote peer without the browser itself
    * needing to know any specifics about the technology being used for
    * signalingTriggered when the IceConnectionState changes.
    * @param event - Event.
    */
  var oniceconnectionstatechange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  /**
    * Triggered when the ICE gathering state changes.
    * @param event - Event.
    */
  var onicegatheringstatechange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  /**
    * Triggered when renegotiation is necessary.
    * @param event - Event.
    */
  var onnegotiationneeded: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  /**
    * Triggered when the SignalingState changes.
    * @param event - Event.
    */
  var onsignalingstatechange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  /**
    * Triggered when when a statistics object being monitored is deleted.
    * @param event - Event.
    */
  var onstatsended: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  /**
    * Triggered when a new track is signaled by the remote peer, as a result of setRemoteDescription.
    * @param event - Event.
    */
  var ontrack: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
}
object PeerConnectionDelegate {
  
  @scala.inline
  def apply(): PeerConnectionDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeerConnectionDelegate]
  }
  
  @scala.inline
  implicit class PeerConnectionDelegateOps[Self <: PeerConnectionDelegate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnconnectionstatechange(value: /* event */ Event => Unit): Self = this.set("onconnectionstatechange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnconnectionstatechange: Self = this.set("onconnectionstatechange", js.undefined)
    
    @scala.inline
    def setOndatachannel(value: /* event */ RTCDataChannelEvent => Unit): Self = this.set("ondatachannel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOndatachannel: Self = this.set("ondatachannel", js.undefined)
    
    @scala.inline
    def setOnicecandidate(value: /* event */ RTCPeerConnectionIceEvent => Unit): Self = this.set("onicecandidate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnicecandidate: Self = this.set("onicecandidate", js.undefined)
    
    @scala.inline
    def setOnicecandidateerror(value: /* event */ RTCPeerConnectionIceErrorEvent => Unit): Self = this.set("onicecandidateerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnicecandidateerror: Self = this.set("onicecandidateerror", js.undefined)
    
    @scala.inline
    def setOniceconnectionstatechange(value: /* event */ Event => Unit): Self = this.set("oniceconnectionstatechange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOniceconnectionstatechange: Self = this.set("oniceconnectionstatechange", js.undefined)
    
    @scala.inline
    def setOnicegatheringstatechange(value: /* event */ Event => Unit): Self = this.set("onicegatheringstatechange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnicegatheringstatechange: Self = this.set("onicegatheringstatechange", js.undefined)
    
    @scala.inline
    def setOnnegotiationneeded(value: /* event */ Event => Unit): Self = this.set("onnegotiationneeded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnnegotiationneeded: Self = this.set("onnegotiationneeded", js.undefined)
    
    @scala.inline
    def setOnsignalingstatechange(value: /* event */ Event => Unit): Self = this.set("onsignalingstatechange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnsignalingstatechange: Self = this.set("onsignalingstatechange", js.undefined)
    
    @scala.inline
    def setOnstatsended(value: /* event */ Event => Unit): Self = this.set("onstatsended", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnstatsended: Self = this.set("onstatsended", js.undefined)
    
    @scala.inline
    def setOntrack(value: /* event */ Event => Unit): Self = this.set("ontrack", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOntrack: Self = this.set("ontrack", js.undefined)
  }
}
