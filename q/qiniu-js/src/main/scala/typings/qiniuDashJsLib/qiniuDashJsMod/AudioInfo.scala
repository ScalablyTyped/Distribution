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
    val __obj = js.Dynamic.literal(bit_rate = bit_rate, channels = channels, codec_name = codec_name, codec_type = codec_type, duration = duration, index = index, nb_frames = nb_frames, r_frame_rate = r_frame_rate, sample_fmt = sample_fmt, sample_rate = sample_rate, start_time = start_time, tags = tags)
  
    __obj.asInstanceOf[AudioInfo]
  }
}

