package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpContributingSource extends StObject {
  
  /* standard dom */
  var audioLevel: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var rtpTimestamp: Double
  
  /* standard dom */
  var source: Double
  
  /* standard dom */
  var timestamp: DOMHighResTimeStamp
}
object RTCRtpContributingSource {
  
  inline def apply(rtpTimestamp: Double, source: Double, timestamp: DOMHighResTimeStamp): RTCRtpContributingSource = {
    val __obj = js.Dynamic.literal(rtpTimestamp = rtpTimestamp.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpContributingSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCRtpContributingSource] (val x: Self) extends AnyVal {
    
    inline def setAudioLevel(value: Double): Self = StObject.set(x, "audioLevel", value.asInstanceOf[js.Any])
    
    inline def setAudioLevelUndefined: Self = StObject.set(x, "audioLevel", js.undefined)
    
    inline def setRtpTimestamp(value: Double): Self = StObject.set(x, "rtpTimestamp", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
