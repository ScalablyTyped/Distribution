package typings.qiniuJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvAudioInfo extends js.Object {
  var audio: AudioInfo
  var format: AvFormat
  var video: VideoInfo
}

object AvAudioInfo {
  @scala.inline
  def apply(audio: AudioInfo, format: AvFormat, video: VideoInfo): AvAudioInfo = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvAudioInfo]
  }
}

