package typings.qiniuJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvAudioInfo extends StObject {
  
  var audio: AudioInfo = js.native
  
  var format: AvFormat = js.native
  
  var video: VideoInfo = js.native
}
object AvAudioInfo {
  
  @scala.inline
  def apply(audio: AudioInfo, format: AvFormat, video: VideoInfo): AvAudioInfo = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvAudioInfo]
  }
  
  @scala.inline
  implicit class AvAudioInfoMutableBuilder[Self <: AvAudioInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: AudioInfo): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: AvFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo(value: VideoInfo): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
