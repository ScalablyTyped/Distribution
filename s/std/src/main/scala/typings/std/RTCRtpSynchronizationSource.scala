package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpSynchronizationSource
  extends StObject
     with RTCRtpContributingSource {
  
  var voiceActivityFlag: js.UndefOr[scala.Boolean] = js.undefined
}
object RTCRtpSynchronizationSource {
  
  inline def apply(rtpTimestamp: Double, source: Double, timestamp: Double): RTCRtpSynchronizationSource = {
    val __obj = js.Dynamic.literal(rtpTimestamp = rtpTimestamp.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpSynchronizationSource]
  }
  
  extension [Self <: RTCRtpSynchronizationSource](x: Self) {
    
    inline def setVoiceActivityFlag(value: scala.Boolean): Self = StObject.set(x, "voiceActivityFlag", value.asInstanceOf[js.Any])
    
    inline def setVoiceActivityFlagUndefined: Self = StObject.set(x, "voiceActivityFlag", js.undefined)
  }
}
