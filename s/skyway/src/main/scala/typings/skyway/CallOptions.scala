package typings.skyway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallOptions extends StObject {
  
  var audioBandwidth: js.UndefOr[Double] = js.native
  
  var audioCodec: js.UndefOr[String] = js.native
  
  var audioReceiveEnabled: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var metadata: js.UndefOr[js.Any] = js.native
  
  var videoBandWidth: js.UndefOr[Double] = js.native
  
  var videoCodec: js.UndefOr[String] = js.native
  
  var videoReceiveEnabled: js.UndefOr[Boolean] = js.native
}
object CallOptions {
  
  @scala.inline
  def apply(): CallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallOptions]
  }
  
  @scala.inline
  implicit class CallOptionsMutableBuilder[Self <: CallOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioBandwidth(value: Double): Self = StObject.set(x, "audioBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioBandwidthUndefined: Self = StObject.set(x, "audioBandwidth", js.undefined)
    
    @scala.inline
    def setAudioCodec(value: String): Self = StObject.set(x, "audioCodec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioCodecUndefined: Self = StObject.set(x, "audioCodec", js.undefined)
    
    @scala.inline
    def setAudioReceiveEnabled(value: Boolean): Self = StObject.set(x, "audioReceiveEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioReceiveEnabledUndefined: Self = StObject.set(x, "audioReceiveEnabled", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setVideoBandWidth(value: Double): Self = StObject.set(x, "videoBandWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoBandWidthUndefined: Self = StObject.set(x, "videoBandWidth", js.undefined)
    
    @scala.inline
    def setVideoCodec(value: String): Self = StObject.set(x, "videoCodec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCodecUndefined: Self = StObject.set(x, "videoCodec", js.undefined)
    
    @scala.inline
    def setVideoReceiveEnabled(value: Boolean): Self = StObject.set(x, "videoReceiveEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoReceiveEnabledUndefined: Self = StObject.set(x, "videoReceiveEnabled", js.undefined)
  }
}
