package typings.qiniuJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvAudioInfo extends js.Object {
  
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
  implicit class AvAudioInfoOps[Self <: AvAudioInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAudio(value: AudioInfo): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: AvFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo(value: VideoInfo): Self = this.set("video", value.asInstanceOf[js.Any])
  }
}
