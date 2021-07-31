package typings.skyway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnswerOptions extends StObject {
  
  var audioBandwidth: js.UndefOr[Double] = js.undefined
  
  var audioCodec: js.UndefOr[String] = js.undefined
  
  var videoBandwidth: js.UndefOr[Double] = js.undefined
  
  var videoCodec: js.UndefOr[String] = js.undefined
}
object AnswerOptions {
  
  @scala.inline
  def apply(): AnswerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerOptions]
  }
  
  @scala.inline
  implicit class AnswerOptionsMutableBuilder[Self <: AnswerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioBandwidth(value: Double): Self = StObject.set(x, "audioBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioBandwidthUndefined: Self = StObject.set(x, "audioBandwidth", js.undefined)
    
    @scala.inline
    def setAudioCodec(value: String): Self = StObject.set(x, "audioCodec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioCodecUndefined: Self = StObject.set(x, "audioCodec", js.undefined)
    
    @scala.inline
    def setVideoBandwidth(value: Double): Self = StObject.set(x, "videoBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoBandwidthUndefined: Self = StObject.set(x, "videoBandwidth", js.undefined)
    
    @scala.inline
    def setVideoCodec(value: String): Self = StObject.set(x, "videoCodec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCodecUndefined: Self = StObject.set(x, "videoCodec", js.undefined)
  }
}
