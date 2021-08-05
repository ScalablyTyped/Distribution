package typings.skyway

import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomOptions extends StObject {
  
  var audioBandwidth: js.UndefOr[Double] = js.undefined
  
  var audioCodec: js.UndefOr[String] = js.undefined
  
  var audioReceiveEnabled: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var stream: js.UndefOr[MediaStream] = js.undefined
  
  var videoBandwidth: js.UndefOr[Double] = js.undefined
  
  var videoCodec: js.UndefOr[String] = js.undefined
  
  var videoReceiveEnabled: js.UndefOr[Boolean] = js.undefined
}
object RoomOptions {
  
  inline def apply(): RoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomOptions]
  }
  
  extension [Self <: RoomOptions](x: Self) {
    
    inline def setAudioBandwidth(value: Double): Self = StObject.set(x, "audioBandwidth", value.asInstanceOf[js.Any])
    
    inline def setAudioBandwidthUndefined: Self = StObject.set(x, "audioBandwidth", js.undefined)
    
    inline def setAudioCodec(value: String): Self = StObject.set(x, "audioCodec", value.asInstanceOf[js.Any])
    
    inline def setAudioCodecUndefined: Self = StObject.set(x, "audioCodec", js.undefined)
    
    inline def setAudioReceiveEnabled(value: Boolean): Self = StObject.set(x, "audioReceiveEnabled", value.asInstanceOf[js.Any])
    
    inline def setAudioReceiveEnabledUndefined: Self = StObject.set(x, "audioReceiveEnabled", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setStream(value: MediaStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    inline def setVideoBandwidth(value: Double): Self = StObject.set(x, "videoBandwidth", value.asInstanceOf[js.Any])
    
    inline def setVideoBandwidthUndefined: Self = StObject.set(x, "videoBandwidth", js.undefined)
    
    inline def setVideoCodec(value: String): Self = StObject.set(x, "videoCodec", value.asInstanceOf[js.Any])
    
    inline def setVideoCodecUndefined: Self = StObject.set(x, "videoCodec", js.undefined)
    
    inline def setVideoReceiveEnabled(value: Boolean): Self = StObject.set(x, "videoReceiveEnabled", value.asInstanceOf[js.Any])
    
    inline def setVideoReceiveEnabledUndefined: Self = StObject.set(x, "videoReceiveEnabled", js.undefined)
  }
}
