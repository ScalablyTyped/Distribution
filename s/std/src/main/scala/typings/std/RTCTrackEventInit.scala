package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCTrackEventInit extends EventInit {
  
  var receiver: RTCRtpReceiver = js.native
  
  var streams: js.UndefOr[js.Array[MediaStream]] = js.native
  
  var track: MediaStreamTrack = js.native
  
  var transceiver: RTCRtpTransceiver = js.native
}
object RTCTrackEventInit {
  
  @scala.inline
  def apply(receiver: RTCRtpReceiver, track: MediaStreamTrack, transceiver: RTCRtpTransceiver): RTCTrackEventInit = {
    val __obj = js.Dynamic.literal(receiver = receiver.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], transceiver = transceiver.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCTrackEventInit]
  }
  
  @scala.inline
  implicit class RTCTrackEventInitMutableBuilder[Self <: RTCTrackEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReceiver(value: RTCRtpReceiver): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreams(value: js.Array[MediaStream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
    
    @scala.inline
    def setStreamsVarargs(value: MediaStream*): Self = StObject.set(x, "streams", js.Array(value :_*))
    
    @scala.inline
    def setTrack(value: MediaStreamTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransceiver(value: RTCRtpTransceiver): Self = StObject.set(x, "transceiver", value.asInstanceOf[js.Any])
  }
}
