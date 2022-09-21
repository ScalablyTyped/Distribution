package typings.skywayJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnswerOption extends StObject {
  
  var audioBandwidth: js.UndefOr[Double] = js.undefined
  
  var audioCodec: js.UndefOr[String] = js.undefined
  
  var audioReceiveEnabled: js.UndefOr[Boolean] = js.undefined
  
  var videoBandwidth: js.UndefOr[Double] = js.undefined
  
  var videoCodec: js.UndefOr[String] = js.undefined
  
  var videoReceiveEnabled: js.UndefOr[Boolean] = js.undefined
}
object AnswerOption {
  
  inline def apply(): AnswerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerOption]
  }
  
  extension [Self <: AnswerOption](x: Self) {
    
    inline def setAudioBandwidth(value: Double): Self = StObject.set(x, "audioBandwidth", value.asInstanceOf[js.Any])
    
    inline def setAudioBandwidthUndefined: Self = StObject.set(x, "audioBandwidth", js.undefined)
    
    inline def setAudioCodec(value: String): Self = StObject.set(x, "audioCodec", value.asInstanceOf[js.Any])
    
    inline def setAudioCodecUndefined: Self = StObject.set(x, "audioCodec", js.undefined)
    
    inline def setAudioReceiveEnabled(value: Boolean): Self = StObject.set(x, "audioReceiveEnabled", value.asInstanceOf[js.Any])
    
    inline def setAudioReceiveEnabledUndefined: Self = StObject.set(x, "audioReceiveEnabled", js.undefined)
    
    inline def setVideoBandwidth(value: Double): Self = StObject.set(x, "videoBandwidth", value.asInstanceOf[js.Any])
    
    inline def setVideoBandwidthUndefined: Self = StObject.set(x, "videoBandwidth", js.undefined)
    
    inline def setVideoCodec(value: String): Self = StObject.set(x, "videoCodec", value.asInstanceOf[js.Any])
    
    inline def setVideoCodecUndefined: Self = StObject.set(x, "videoCodec", js.undefined)
    
    inline def setVideoReceiveEnabled(value: Boolean): Self = StObject.set(x, "videoReceiveEnabled", value.asInstanceOf[js.Any])
    
    inline def setVideoReceiveEnabledUndefined: Self = StObject.set(x, "videoReceiveEnabled", js.undefined)
  }
}
