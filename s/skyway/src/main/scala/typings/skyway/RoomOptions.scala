package typings.skyway

import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomOptions extends StObject {
  
  var audioBandwidth: js.UndefOr[Double] = js.native
  
  var audioCodec: js.UndefOr[String] = js.native
  
  var audioReceiveEnabled: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var stream: js.UndefOr[MediaStream] = js.native
  
  var videoBandwidth: js.UndefOr[Double] = js.native
  
  var videoCodec: js.UndefOr[String] = js.native
  
  var videoReceiveEnabled: js.UndefOr[Boolean] = js.native
}
object RoomOptions {
  
  @scala.inline
  def apply(): RoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomOptions]
  }
  
  @scala.inline
  implicit class RoomOptionsMutableBuilder[Self <: RoomOptions] (val x: Self) extends AnyVal {
    
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
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setStream(value: MediaStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    @scala.inline
    def setVideoBandwidth(value: Double): Self = StObject.set(x, "videoBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoBandwidthUndefined: Self = StObject.set(x, "videoBandwidth", js.undefined)
    
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
