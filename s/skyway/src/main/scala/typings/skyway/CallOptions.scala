package typings.skyway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallOptions extends StObject {
  
  var audioBandwidth: js.UndefOr[Double] = js.undefined
  
  var audioCodec: js.UndefOr[String] = js.undefined
  
  var audioReceiveEnabled: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[js.Any] = js.undefined
  
  var videoBandWidth: js.UndefOr[Double] = js.undefined
  
  var videoCodec: js.UndefOr[String] = js.undefined
  
  var videoReceiveEnabled: js.UndefOr[Boolean] = js.undefined
}
object CallOptions {
  
  inline def apply(): CallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallOptions]
  }
  
  extension [Self <: CallOptions](x: Self) {
    
    inline def setAudioBandwidth(value: Double): Self = StObject.set(x, "audioBandwidth", value.asInstanceOf[js.Any])
    
    inline def setAudioBandwidthUndefined: Self = StObject.set(x, "audioBandwidth", js.undefined)
    
    inline def setAudioCodec(value: String): Self = StObject.set(x, "audioCodec", value.asInstanceOf[js.Any])
    
    inline def setAudioCodecUndefined: Self = StObject.set(x, "audioCodec", js.undefined)
    
    inline def setAudioReceiveEnabled(value: Boolean): Self = StObject.set(x, "audioReceiveEnabled", value.asInstanceOf[js.Any])
    
    inline def setAudioReceiveEnabledUndefined: Self = StObject.set(x, "audioReceiveEnabled", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setVideoBandWidth(value: Double): Self = StObject.set(x, "videoBandWidth", value.asInstanceOf[js.Any])
    
    inline def setVideoBandWidthUndefined: Self = StObject.set(x, "videoBandWidth", js.undefined)
    
    inline def setVideoCodec(value: String): Self = StObject.set(x, "videoCodec", value.asInstanceOf[js.Any])
    
    inline def setVideoCodecUndefined: Self = StObject.set(x, "videoCodec", js.undefined)
    
    inline def setVideoReceiveEnabled(value: Boolean): Self = StObject.set(x, "videoReceiveEnabled", value.asInstanceOf[js.Any])
    
    inline def setVideoReceiveEnabledUndefined: Self = StObject.set(x, "videoReceiveEnabled", js.undefined)
  }
}
