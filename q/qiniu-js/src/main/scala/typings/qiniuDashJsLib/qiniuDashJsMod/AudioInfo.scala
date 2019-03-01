package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioInfo extends js.Object {
  var bit_rate: java.lang.String
  var channels: scala.Double
  var codec_name: java.lang.String
  var codec_type: java.lang.String
  var duration: java.lang.String
  var index: scala.Double
  var nb_frames: java.lang.String
  var r_frame_rate: java.lang.String
  var sample_fmt: java.lang.String
  var sample_rate: java.lang.String
  var start_time: java.lang.String
  var tags: qiniuDashJsLib.Anon_Creationtime
}

object AudioInfo {
  @scala.inline
  def apply(
    bit_rate: java.lang.String,
    channels: scala.Double,
    codec_name: java.lang.String,
    codec_type: java.lang.String,
    duration: java.lang.String,
    index: scala.Double,
    nb_frames: java.lang.String,
    r_frame_rate: java.lang.String,
    sample_fmt: java.lang.String,
    sample_rate: java.lang.String,
    start_time: java.lang.String,
    tags: qiniuDashJsLib.Anon_Creationtime
  ): AudioInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bit_rate")(bit_rate)
    __obj.updateDynamic("channels")(channels)
    __obj.updateDynamic("codec_name")(codec_name)
    __obj.updateDynamic("codec_type")(codec_type)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("nb_frames")(nb_frames)
    __obj.updateDynamic("r_frame_rate")(r_frame_rate)
    __obj.updateDynamic("sample_fmt")(sample_fmt)
    __obj.updateDynamic("sample_rate")(sample_rate)
    __obj.updateDynamic("start_time")(start_time)
    __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[AudioInfo]
  }
}

