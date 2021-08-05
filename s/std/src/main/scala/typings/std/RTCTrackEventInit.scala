package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCTrackEventInit
  extends StObject
     with EventInit {
  
  var receiver: RTCRtpReceiver
  
  var streams: js.UndefOr[js.Array[MediaStream]] = js.undefined
  
  var track: MediaStreamTrack
  
  var transceiver: RTCRtpTransceiver
}
object RTCTrackEventInit {
  
  inline def apply(receiver: RTCRtpReceiver, track: MediaStreamTrack, transceiver: RTCRtpTransceiver): RTCTrackEventInit = {
    val __obj = js.Dynamic.literal(receiver = receiver.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], transceiver = transceiver.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCTrackEventInit]
  }
  
  extension [Self <: RTCTrackEventInit](x: Self) {
    
    inline def setReceiver(value: RTCRtpReceiver): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setStreams(value: js.Array[MediaStream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
    
    inline def setStreamsVarargs(value: MediaStream*): Self = StObject.set(x, "streams", js.Array(value :_*))
    
    inline def setTrack(value: MediaStreamTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTransceiver(value: RTCRtpTransceiver): Self = StObject.set(x, "transceiver", value.asInstanceOf[js.Any])
  }
}
