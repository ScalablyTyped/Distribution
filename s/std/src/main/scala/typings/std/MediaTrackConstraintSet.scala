package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTrackConstraintSet extends StObject {
  
  var aspectRatio: js.UndefOr[ConstrainDouble] = js.native
  
  var autoGainControl: js.UndefOr[ConstrainBoolean] = js.native
  
  var channelCount: js.UndefOr[ConstrainULong] = js.native
  
  var deviceId: js.UndefOr[ConstrainDOMString] = js.native
  
  var echoCancellation: js.UndefOr[ConstrainBoolean] = js.native
  
  var facingMode: js.UndefOr[ConstrainDOMString] = js.native
  
  var frameRate: js.UndefOr[ConstrainDouble] = js.native
  
  var groupId: js.UndefOr[ConstrainDOMString] = js.native
  
  var height: js.UndefOr[ConstrainULong] = js.native
  
  var latency: js.UndefOr[ConstrainDouble] = js.native
  
  var noiseSuppression: js.UndefOr[ConstrainBoolean] = js.native
  
  var resizeMode: js.UndefOr[ConstrainDOMString] = js.native
  
  var sampleRate: js.UndefOr[ConstrainULong] = js.native
  
  var sampleSize: js.UndefOr[ConstrainULong] = js.native
  
  var width: js.UndefOr[ConstrainULong] = js.native
}
object MediaTrackConstraintSet {
  
  @scala.inline
  def apply(): MediaTrackConstraintSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackConstraintSet]
  }
  
  @scala.inline
  implicit class MediaTrackConstraintSetMutableBuilder[Self <: MediaTrackConstraintSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspectRatio(value: ConstrainDouble): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    @scala.inline
    def setAutoGainControl(value: ConstrainBoolean): Self = StObject.set(x, "autoGainControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoGainControlUndefined: Self = StObject.set(x, "autoGainControl", js.undefined)
    
    @scala.inline
    def setChannelCount(value: ConstrainULong): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
    
    @scala.inline
    def setDeviceId(value: ConstrainDOMString): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setDeviceIdVarargs(value: java.lang.String*): Self = StObject.set(x, "deviceId", js.Array(value :_*))
    
    @scala.inline
    def setEchoCancellation(value: ConstrainBoolean): Self = StObject.set(x, "echoCancellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEchoCancellationUndefined: Self = StObject.set(x, "echoCancellation", js.undefined)
    
    @scala.inline
    def setFacingMode(value: ConstrainDOMString): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacingModeUndefined: Self = StObject.set(x, "facingMode", js.undefined)
    
    @scala.inline
    def setFacingModeVarargs(value: java.lang.String*): Self = StObject.set(x, "facingMode", js.Array(value :_*))
    
    @scala.inline
    def setFrameRate(value: ConstrainDouble): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    @scala.inline
    def setGroupId(value: ConstrainDOMString): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setGroupIdVarargs(value: java.lang.String*): Self = StObject.set(x, "groupId", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: ConstrainULong): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLatency(value: ConstrainDouble): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    @scala.inline
    def setNoiseSuppression(value: ConstrainBoolean): Self = StObject.set(x, "noiseSuppression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoiseSuppressionUndefined: Self = StObject.set(x, "noiseSuppression", js.undefined)
    
    @scala.inline
    def setResizeMode(value: ConstrainDOMString): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    
    @scala.inline
    def setResizeModeVarargs(value: java.lang.String*): Self = StObject.set(x, "resizeMode", js.Array(value :_*))
    
    @scala.inline
    def setSampleRate(value: ConstrainULong): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    
    @scala.inline
    def setSampleSize(value: ConstrainULong): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    
    @scala.inline
    def setWidth(value: ConstrainULong): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
