package typings.qiniuDashJs.qiniuDashJsMod

import typings.qiniuDashJs.Anon_Creationtime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioInfo extends js.Object {
  var bit_rate: String
  var channels: Double
  var codec_name: String
  var codec_type: String
  var duration: String
  var index: Double
  var nb_frames: String
  var r_frame_rate: String
  var sample_fmt: String
  var sample_rate: String
  var start_time: String
  var tags: Anon_Creationtime
}

object AudioInfo {
  @scala.inline
  def apply(
    bit_rate: String,
    channels: Double,
    codec_name: String,
    codec_type: String,
    duration: String,
    index: Double,
    nb_frames: String,
    r_frame_rate: String,
    sample_fmt: String,
    sample_rate: String,
    start_time: String,
    tags: Anon_Creationtime
  ): AudioInfo = {
    val __obj = js.Dynamic.literal(bit_rate = bit_rate.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], codec_name = codec_name.asInstanceOf[js.Any], codec_type = codec_type.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nb_frames = nb_frames.asInstanceOf[js.Any], r_frame_rate = r_frame_rate.asInstanceOf[js.Any], sample_fmt = sample_fmt.asInstanceOf[js.Any], sample_rate = sample_rate.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AudioInfo]
  }
}

