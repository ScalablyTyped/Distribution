package typings.qiniuDashJs.qiniuDashJsMod

import typings.qiniuDashJs.Anon_Creationtime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoInfo extends js.Object {
  var bit_rate: String
  var codec_name: String
  var codec_type: String
  var display_aspect_ratio: String
  var duration: String
  var height: Double
  var index: Double
  var nb_frames: String
  var pix_fmt: String
  var r_frame_rate: String
  var sample_aspect_ratio: String
  var start_time: String
  var tags: Anon_Creationtime
  var width: Double
}

object VideoInfo {
  @scala.inline
  def apply(
    bit_rate: String,
    codec_name: String,
    codec_type: String,
    display_aspect_ratio: String,
    duration: String,
    height: Double,
    index: Double,
    nb_frames: String,
    pix_fmt: String,
    r_frame_rate: String,
    sample_aspect_ratio: String,
    start_time: String,
    tags: Anon_Creationtime,
    width: Double
  ): VideoInfo = {
    val __obj = js.Dynamic.literal(bit_rate = bit_rate, codec_name = codec_name, codec_type = codec_type, display_aspect_ratio = display_aspect_ratio, duration = duration, height = height, index = index, nb_frames = nb_frames, pix_fmt = pix_fmt, r_frame_rate = r_frame_rate, sample_aspect_ratio = sample_aspect_ratio, start_time = start_time, tags = tags, width = width)
  
    __obj.asInstanceOf[VideoInfo]
  }
}

