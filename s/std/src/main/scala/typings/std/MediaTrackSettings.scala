package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTrackSettings extends StObject {
  
  var aspectRatio: js.UndefOr[Double] = js.native
  
  var autoGainControl: js.UndefOr[scala.Boolean] = js.native
  
  var channelCount: js.UndefOr[Double] = js.native
  
  var deviceId: js.UndefOr[java.lang.String] = js.native
  
  var echoCancellation: js.UndefOr[scala.Boolean] = js.native
  
  var facingMode: js.UndefOr[java.lang.String] = js.native
  
  var frameRate: js.UndefOr[Double] = js.native
  
  var groupId: js.UndefOr[java.lang.String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var latency: js.UndefOr[Double] = js.native
  
  var noiseSuppression: js.UndefOr[scala.Boolean] = js.native
  
  var resizeMode: js.UndefOr[java.lang.String] = js.native
  
  var sampleRate: js.UndefOr[Double] = js.native
  
  var sampleSize: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object MediaTrackSettings {
  
  @scala.inline
  def apply(): MediaTrackSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackSettings]
  }
  
  @scala.inline
  implicit class MediaTrackSettingsMutableBuilder[Self <: MediaTrackSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    @scala.inline
    def setAutoGainControl(value: scala.Boolean): Self = StObject.set(x, "autoGainControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoGainControlUndefined: Self = StObject.set(x, "autoGainControl", js.undefined)
    
    @scala.inline
    def setChannelCount(value: Double): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
    
    @scala.inline
    def setDeviceId(value: java.lang.String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setEchoCancellation(value: scala.Boolean): Self = StObject.set(x, "echoCancellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEchoCancellationUndefined: Self = StObject.set(x, "echoCancellation", js.undefined)
    
    @scala.inline
    def setFacingMode(value: java.lang.String): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacingModeUndefined: Self = StObject.set(x, "facingMode", js.undefined)
    
    @scala.inline
    def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    @scala.inline
    def setGroupId(value: java.lang.String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    @scala.inline
    def setNoiseSuppression(value: scala.Boolean): Self = StObject.set(x, "noiseSuppression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoiseSuppressionUndefined: Self = StObject.set(x, "noiseSuppression", js.undefined)
    
    @scala.inline
    def setResizeMode(value: java.lang.String): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    
    @scala.inline
    def setSampleSize(value: Double): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
