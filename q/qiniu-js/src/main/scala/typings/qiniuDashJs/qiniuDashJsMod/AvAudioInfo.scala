package typings.qiniuDashJs.qiniuDashJsMod

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
    val __obj = js.Dynamic.literal(audio = audio, format = format, video = video)
  
    __obj.asInstanceOf[AvAudioInfo]
  }
}

