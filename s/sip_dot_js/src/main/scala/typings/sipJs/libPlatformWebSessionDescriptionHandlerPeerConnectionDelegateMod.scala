package typings.sipJs

import typings.std.Event
import typings.std.RTCDataChannelEvent
import typings.std.RTCPeerConnectionIceErrorEvent
import typings.std.RTCPeerConnectionIceEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSessionDescriptionHandlerPeerConnectionDelegateMod {
  
  trait PeerConnectionDelegate extends StObject {
    
    /**
      * This happens whenever the aggregate state of the connection changes.
      * The aggregate state is a combination of the states of all of the
      * individual network transports being used by the connection.
      * @param event - Event.
      */
    var onconnectionstatechange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    /**
      * Triggered when an RTCDataChannel is added to the connection by the
      * remote peer calling createDataChannel().
      * @param event - RTCDataChannelEvent.
      */
    var ondatachannel: js.UndefOr[js.Function1[/* event */ RTCDataChannelEvent, Unit]] = js.undefined
    
    /**
      * Triggered when a new ICE candidate has been found.
      * @param event - RTCPeerConnectionIceEvent.
      */
    var onicecandidate: js.UndefOr[js.Function1[/* event */ RTCPeerConnectionIceEvent, Unit]] = js.undefined
    
    /**
      * Triggered when an error occurred during ICE candidate gathering.
      * @param event - RTCPeerConnectionIceErrorEvent.
      */
    var onicecandidateerror: js.UndefOr[js.Function1[/* event */ RTCPeerConnectionIceErrorEvent, Unit]] = js.undefined
    
    /**
      * This happens whenever the local ICE agent needs to deliver a message to
      * the other peer through the signaling server. This lets the ICE agent
      * perform negotiation with the remote peer without the browser itself
      * needing to know any specifics about the technology being used for
      * signalingTriggered when the IceConnectionState changes.
      * @param event - Event.
      */
    var oniceconnectionstatechange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    /**
      * Triggered when the ICE gathering state changes.
      * @param event - Event.
      */
    var onicegatheringstatechange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    /**
      * Triggered when renegotiation is necessary.
      * @param event - Event.
      */
    var onnegotiationneeded: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    /**
      * Triggered when the SignalingState changes.
      * @param event - Event.
      */
    var onsignalingstatechange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    /**
      * Triggered when a new track is signaled by the remote peer, as a result of setRemoteDescription.
      * @param event - Event.
      */
    var ontrack: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  }
  object PeerConnectionDelegate {
    
    inline def apply(): PeerConnectionDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PeerConnectionDelegate]
    }
    
    extension [Self <: PeerConnectionDelegate](x: Self) {
      
      inline def setOnconnectionstatechange(value: /* event */ Event => Unit): Self = StObject.set(x, "onconnectionstatechange", js.Any.fromFunction1(value))
      
      inline def setOnconnectionstatechangeUndefined: Self = StObject.set(x, "onconnectionstatechange", js.undefined)
      
      inline def setOndatachannel(value: /* event */ RTCDataChannelEvent => Unit): Self = StObject.set(x, "ondatachannel", js.Any.fromFunction1(value))
      
      inline def setOndatachannelUndefined: Self = StObject.set(x, "ondatachannel", js.undefined)
      
      inline def setOnicecandidate(value: /* event */ RTCPeerConnectionIceEvent => Unit): Self = StObject.set(x, "onicecandidate", js.Any.fromFunction1(value))
      
      inline def setOnicecandidateUndefined: Self = StObject.set(x, "onicecandidate", js.undefined)
      
      inline def setOnicecandidateerror(value: /* event */ RTCPeerConnectionIceErrorEvent => Unit): Self = StObject.set(x, "onicecandidateerror", js.Any.fromFunction1(value))
      
      inline def setOnicecandidateerrorUndefined: Self = StObject.set(x, "onicecandidateerror", js.undefined)
      
      inline def setOniceconnectionstatechange(value: /* event */ Event => Unit): Self = StObject.set(x, "oniceconnectionstatechange", js.Any.fromFunction1(value))
      
      inline def setOniceconnectionstatechangeUndefined: Self = StObject.set(x, "oniceconnectionstatechange", js.undefined)
      
      inline def setOnicegatheringstatechange(value: /* event */ Event => Unit): Self = StObject.set(x, "onicegatheringstatechange", js.Any.fromFunction1(value))
      
      inline def setOnicegatheringstatechangeUndefined: Self = StObject.set(x, "onicegatheringstatechange", js.undefined)
      
      inline def setOnnegotiationneeded(value: /* event */ Event => Unit): Self = StObject.set(x, "onnegotiationneeded", js.Any.fromFunction1(value))
      
      inline def setOnnegotiationneededUndefined: Self = StObject.set(x, "onnegotiationneeded", js.undefined)
      
      inline def setOnsignalingstatechange(value: /* event */ Event => Unit): Self = StObject.set(x, "onsignalingstatechange", js.Any.fromFunction1(value))
      
      inline def setOnsignalingstatechangeUndefined: Self = StObject.set(x, "onsignalingstatechange", js.undefined)
      
      inline def setOntrack(value: /* event */ Event => Unit): Self = StObject.set(x, "ontrack", js.Any.fromFunction1(value))
      
      inline def setOntrackUndefined: Self = StObject.set(x, "ontrack", js.undefined)
    }
  }
}
