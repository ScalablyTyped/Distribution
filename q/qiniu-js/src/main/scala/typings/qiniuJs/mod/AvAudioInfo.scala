package typings.qiniuJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvAudioInfo extends StObject {
  
  var audio: AudioInfo
  
  var format: AvFormat
  
  var video: VideoInfo
}
object AvAudioInfo {
  
  inline def apply(audio: AudioInfo, format: AvFormat, video: VideoInfo): AvAudioInfo = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvAudioInfo]
  }
  
  extension [Self <: AvAudioInfo](x: Self) {
    
    inline def setAudio(value: AudioInfo): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: AvFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: VideoInfo): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
