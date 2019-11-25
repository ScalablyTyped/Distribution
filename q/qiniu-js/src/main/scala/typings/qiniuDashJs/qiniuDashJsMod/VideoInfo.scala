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
    val __obj = js.Dynamic.literal(bit_rate = bit_rate.asInstanceOf[js.Any], codec_name = codec_name.asInstanceOf[js.Any], codec_type = codec_type.asInstanceOf[js.Any], display_aspect_ratio = display_aspect_ratio.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nb_frames = nb_frames.asInstanceOf[js.Any], pix_fmt = pix_fmt.asInstanceOf[js.Any], r_frame_rate = r_frame_rate.asInstanceOf[js.Any], sample_aspect_ratio = sample_aspect_ratio.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VideoInfo]
  }
}

