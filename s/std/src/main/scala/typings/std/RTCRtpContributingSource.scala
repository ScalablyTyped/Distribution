package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpContributingSource extends StObject {
  
  var audioLevel: js.UndefOr[Double] = js.undefined
  
  var rtpTimestamp: Double
  
  var source: Double
  
  var timestamp: Double
}
object RTCRtpContributingSource {
  
  @scala.inline
  def apply(rtpTimestamp: Double, source: Double, timestamp: Double): RTCRtpContributingSource = {
    val __obj = js.Dynamic.literal(rtpTimestamp = rtpTimestamp.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpContributingSource]
  }
  
  @scala.inline
  implicit class RTCRtpContributingSourceMutableBuilder[Self <: RTCRtpContributingSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioLevel(value: Double): Self = StObject.set(x, "audioLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioLevelUndefined: Self = StObject.set(x, "audioLevel", js.undefined)
    
    @scala.inline
    def setRtpTimestamp(value: Double): Self = StObject.set(x, "rtpTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
