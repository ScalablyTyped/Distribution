package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoFrameCallbackMetadata extends StObject {
  
  /* standard dom */
  var captureTime: js.UndefOr[DOMHighResTimeStamp] = js.undefined
  
  /* standard dom */
  var expectedDisplayTime: DOMHighResTimeStamp
  
  /* standard dom */
  var height: Double
  
  /* standard dom */
  var mediaTime: Double
  
  /* standard dom */
  var presentationTime: DOMHighResTimeStamp
  
  /* standard dom */
  var presentedFrames: Double
  
  /* standard dom */
  var processingDuration: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var receiveTime: js.UndefOr[DOMHighResTimeStamp] = js.undefined
  
  /* standard dom */
  var rtpTimestamp: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var width: Double
}
object VideoFrameCallbackMetadata {
  
  inline def apply(
    expectedDisplayTime: DOMHighResTimeStamp,
    height: Double,
    mediaTime: Double,
    presentationTime: DOMHighResTimeStamp,
    presentedFrames: Double,
    width: Double
  ): VideoFrameCallbackMetadata = {
    val __obj = js.Dynamic.literal(expectedDisplayTime = expectedDisplayTime.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], mediaTime = mediaTime.asInstanceOf[js.Any], presentationTime = presentationTime.asInstanceOf[js.Any], presentedFrames = presentedFrames.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFrameCallbackMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoFrameCallbackMetadata] (val x: Self) extends AnyVal {
    
    inline def setCaptureTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "captureTime", value.asInstanceOf[js.Any])
    
    inline def setCaptureTimeUndefined: Self = StObject.set(x, "captureTime", js.undefined)
    
    inline def setExpectedDisplayTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "expectedDisplayTime", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMediaTime(value: Double): Self = StObject.set(x, "mediaTime", value.asInstanceOf[js.Any])
    
    inline def setPresentationTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "presentationTime", value.asInstanceOf[js.Any])
    
    inline def setPresentedFrames(value: Double): Self = StObject.set(x, "presentedFrames", value.asInstanceOf[js.Any])
    
    inline def setProcessingDuration(value: Double): Self = StObject.set(x, "processingDuration", value.asInstanceOf[js.Any])
    
    inline def setProcessingDurationUndefined: Self = StObject.set(x, "processingDuration", js.undefined)
    
    inline def setReceiveTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "receiveTime", value.asInstanceOf[js.Any])
    
    inline def setReceiveTimeUndefined: Self = StObject.set(x, "receiveTime", js.undefined)
    
    inline def setRtpTimestamp(value: Double): Self = StObject.set(x, "rtpTimestamp", value.asInstanceOf[js.Any])
    
    inline def setRtpTimestampUndefined: Self = StObject.set(x, "rtpTimestamp", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
