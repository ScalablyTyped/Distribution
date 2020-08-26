package typings.qiniuJs.mod

import typings.qiniuJs.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioInfo extends js.Object {
  var bit_rate: String = js.native
  var channels: Double = js.native
  var codec_name: String = js.native
  var codec_type: String = js.native
  var duration: String = js.native
  var index: Double = js.native
  var nb_frames: String = js.native
  var r_frame_rate: String = js.native
  var sample_fmt: String = js.native
  var sample_rate: String = js.native
  var start_time: String = js.native
  var tags: Dictkey = js.native
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
    tags: Dictkey
  ): AudioInfo = {
    val __obj = js.Dynamic.literal(bit_rate = bit_rate.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], codec_name = codec_name.asInstanceOf[js.Any], codec_type = codec_type.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nb_frames = nb_frames.asInstanceOf[js.Any], r_frame_rate = r_frame_rate.asInstanceOf[js.Any], sample_fmt = sample_fmt.asInstanceOf[js.Any], sample_rate = sample_rate.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioInfo]
  }
  @scala.inline
  implicit class AudioInfoOps[Self <: AudioInfo] (val x: Self) extends AnyVal {
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
    def setBit_rate(value: String): Self = this.set("bit_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannels(value: Double): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodec_name(value: String): Self = this.set("codec_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodec_type(value: String): Self = this.set("codec_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setNb_frames(value: String): Self = this.set("nb_frames", value.asInstanceOf[js.Any])
    @scala.inline
    def setR_frame_rate(value: String): Self = this.set("r_frame_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSample_fmt(value: String): Self = this.set("sample_fmt", value.asInstanceOf[js.Any])
    @scala.inline
    def setSample_rate(value: String): Self = this.set("sample_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart_time(value: String): Self = this.set("start_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Dictkey): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

