package typings
package qiniuDashJsLib.qiniuDashJsMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audio")(audio)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("video")(video)
    __obj.asInstanceOf[AvAudioInfo]
  }
}

