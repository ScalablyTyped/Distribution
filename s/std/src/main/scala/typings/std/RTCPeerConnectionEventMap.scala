package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCPeerConnectionEventMap extends StObject {
  
  /* standard dom */
  var connectionstatechange: Event
  
  /* standard dom */
  var datachannel: RTCDataChannelEvent
  
  /* standard dom */
  var icecandidate: RTCPeerConnectionIceEvent
  
  /* standard dom */
  var icecandidateerror: Event
  
  /* standard dom */
  var iceconnectionstatechange: Event
  
  /* standard dom */
  var icegatheringstatechange: Event
  
  /* standard dom */
  var negotiationneeded: Event
  
  /* standard dom */
  var signalingstatechange: Event
  
  /* standard dom */
  var track: RTCTrackEvent
}
object RTCPeerConnectionEventMap {
  
  inline def apply(
    connectionstatechange: Event,
    datachannel: RTCDataChannelEvent,
    icecandidate: RTCPeerConnectionIceEvent,
    icecandidateerror: Event,
    iceconnectionstatechange: Event,
    icegatheringstatechange: Event,
    negotiationneeded: Event,
    signalingstatechange: Event,
    track: RTCTrackEvent
  ): RTCPeerConnectionEventMap = {
    val __obj = js.Dynamic.literal(connectionstatechange = connectionstatechange.asInstanceOf[js.Any], datachannel = datachannel.asInstanceOf[js.Any], icecandidate = icecandidate.asInstanceOf[js.Any], icecandidateerror = icecandidateerror.asInstanceOf[js.Any], iceconnectionstatechange = iceconnectionstatechange.asInstanceOf[js.Any], icegatheringstatechange = icegatheringstatechange.asInstanceOf[js.Any], negotiationneeded = negotiationneeded.asInstanceOf[js.Any], signalingstatechange = signalingstatechange.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCPeerConnectionEventMap] (val x: Self) extends AnyVal {
    
    inline def setConnectionstatechange(value: Event): Self = StObject.set(x, "connectionstatechange", value.asInstanceOf[js.Any])
    
    inline def setDatachannel(value: RTCDataChannelEvent): Self = StObject.set(x, "datachannel", value.asInstanceOf[js.Any])
    
    inline def setIcecandidate(value: RTCPeerConnectionIceEvent): Self = StObject.set(x, "icecandidate", value.asInstanceOf[js.Any])
    
    inline def setIcecandidateerror(value: Event): Self = StObject.set(x, "icecandidateerror", value.asInstanceOf[js.Any])
    
    inline def setIceconnectionstatechange(value: Event): Self = StObject.set(x, "iceconnectionstatechange", value.asInstanceOf[js.Any])
    
    inline def setIcegatheringstatechange(value: Event): Self = StObject.set(x, "icegatheringstatechange", value.asInstanceOf[js.Any])
    
    inline def setNegotiationneeded(value: Event): Self = StObject.set(x, "negotiationneeded", value.asInstanceOf[js.Any])
    
    inline def setSignalingstatechange(value: Event): Self = StObject.set(x, "signalingstatechange", value.asInstanceOf[js.Any])
    
    inline def setTrack(value: RTCTrackEvent): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
