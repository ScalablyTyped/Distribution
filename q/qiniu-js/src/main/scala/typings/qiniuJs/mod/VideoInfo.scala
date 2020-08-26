package typings.qiniuJs.mod

import typings.qiniuJs.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoInfo extends js.Object {
  var bit_rate: String = js.native
  var codec_name: String = js.native
  var codec_type: String = js.native
  var display_aspect_ratio: String = js.native
  var duration: String = js.native
  var height: Double = js.native
  var index: Double = js.native
  var nb_frames: String = js.native
  var pix_fmt: String = js.native
  var r_frame_rate: String = js.native
  var sample_aspect_ratio: String = js.native
  var start_time: String = js.native
  var tags: Dictkey = js.native
  var width: Double = js.native
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
    tags: Dictkey,
    width: Double
  ): VideoInfo = {
    val __obj = js.Dynamic.literal(bit_rate = bit_rate.asInstanceOf[js.Any], codec_name = codec_name.asInstanceOf[js.Any], codec_type = codec_type.asInstanceOf[js.Any], display_aspect_ratio = display_aspect_ratio.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nb_frames = nb_frames.asInstanceOf[js.Any], pix_fmt = pix_fmt.asInstanceOf[js.Any], r_frame_rate = r_frame_rate.asInstanceOf[js.Any], sample_aspect_ratio = sample_aspect_ratio.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoInfo]
  }
  @scala.inline
  implicit class VideoInfoOps[Self <: VideoInfo] (val x: Self) extends AnyVal {
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
    def setCodec_name(value: String): Self = this.set("codec_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodec_type(value: String): Self = this.set("codec_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay_aspect_ratio(value: String): Self = this.set("display_aspect_ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setNb_frames(value: String): Self = this.set("nb_frames", value.asInstanceOf[js.Any])
    @scala.inline
    def setPix_fmt(value: String): Self = this.set("pix_fmt", value.asInstanceOf[js.Any])
    @scala.inline
    def setR_frame_rate(value: String): Self = this.set("r_frame_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSample_aspect_ratio(value: String): Self = this.set("sample_aspect_ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart_time(value: String): Self = this.set("start_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Dictkey): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

