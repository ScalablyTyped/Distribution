package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoInfo extends js.Object {
  var bit_rate: java.lang.String
  var codec_name: java.lang.String
  var codec_type: java.lang.String
  var display_aspect_ratio: java.lang.String
  var duration: java.lang.String
  var height: scala.Double
  var index: scala.Double
  var nb_frames: java.lang.String
  var pix_fmt: java.lang.String
  var r_frame_rate: java.lang.String
  var sample_aspect_ratio: java.lang.String
  var start_time: java.lang.String
  var tags: qiniuDashJsLib.Anon_Creationtime
  var width: scala.Double
}

object VideoInfo {
  @scala.inline
  def apply(
    bit_rate: java.lang.String,
    codec_name: java.lang.String,
    codec_type: java.lang.String,
    display_aspect_ratio: java.lang.String,
    duration: java.lang.String,
    height: scala.Double,
    index: scala.Double,
    nb_frames: java.lang.String,
    pix_fmt: java.lang.String,
    r_frame_rate: java.lang.String,
    sample_aspect_ratio: java.lang.String,
    start_time: java.lang.String,
    tags: qiniuDashJsLib.Anon_Creationtime,
    width: scala.Double
  ): VideoInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bit_rate")(bit_rate)
    __obj.updateDynamic("codec_name")(codec_name)
    __obj.updateDynamic("codec_type")(codec_type)
    __obj.updateDynamic("display_aspect_ratio")(display_aspect_ratio)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("nb_frames")(nb_frames)
    __obj.updateDynamic("pix_fmt")(pix_fmt)
    __obj.updateDynamic("r_frame_rate")(r_frame_rate)
    __obj.updateDynamic("sample_aspect_ratio")(sample_aspect_ratio)
    __obj.updateDynamic("start_time")(start_time)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[VideoInfo]
  }
}

