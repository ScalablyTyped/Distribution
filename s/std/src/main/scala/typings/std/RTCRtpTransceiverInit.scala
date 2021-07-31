package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpTransceiverInit extends StObject {
  
  var direction: js.UndefOr[RTCRtpTransceiverDirection] = js.undefined
  
  var sendEncodings: js.UndefOr[js.Array[RTCRtpEncodingParameters]] = js.undefined
  
  var streams: js.UndefOr[js.Array[MediaStream]] = js.undefined
}
object RTCRtpTransceiverInit {
  
  @scala.inline
  def apply(): RTCRtpTransceiverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpTransceiverInit]
  }
  
  @scala.inline
  implicit class RTCRtpTransceiverInitMutableBuilder[Self <: RTCRtpTransceiverInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: RTCRtpTransceiverDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setSendEncodings(value: js.Array[RTCRtpEncodingParameters]): Self = StObject.set(x, "sendEncodings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendEncodingsUndefined: Self = StObject.set(x, "sendEncodings", js.undefined)
    
    @scala.inline
    def setSendEncodingsVarargs(value: RTCRtpEncodingParameters*): Self = StObject.set(x, "sendEncodings", js.Array(value :_*))
    
    @scala.inline
    def setStreams(value: js.Array[MediaStream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
    
    @scala.inline
    def setStreamsVarargs(value: MediaStream*): Self = StObject.set(x, "streams", js.Array(value :_*))
  }
}
