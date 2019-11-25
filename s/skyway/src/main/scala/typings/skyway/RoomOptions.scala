package typings.skyway

import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomOptions extends js.Object {
  var audioBandwidth: js.UndefOr[Double] = js.undefined
  var audioCodec: js.UndefOr[String] = js.undefined
  var audioReceiveEnabled: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var stream: js.UndefOr[MediaStream] = js.undefined
  var videoBandwidth: js.UndefOr[Double] = js.undefined
  var videoCodec: js.UndefOr[String] = js.undefined
  var videoReceiveEnabled: js.UndefOr[Boolean] = js.undefined
}

object RoomOptions {
  @scala.inline
  def apply(
    audioBandwidth: Int | Double = null,
    audioCodec: String = null,
    audioReceiveEnabled: js.UndefOr[Boolean] = js.undefined,
    mode: String = null,
    stream: MediaStream = null,
    videoBandwidth: Int | Double = null,
    videoCodec: String = null,
    videoReceiveEnabled: js.UndefOr[Boolean] = js.undefined
  ): RoomOptions = {
    val __obj = js.Dynamic.literal()
    if (audioBandwidth != null) __obj.updateDynamic("audioBandwidth")(audioBandwidth.asInstanceOf[js.Any])
    if (audioCodec != null) __obj.updateDynamic("audioCodec")(audioCodec.asInstanceOf[js.Any])
    if (!js.isUndefined(audioReceiveEnabled)) __obj.updateDynamic("audioReceiveEnabled")(audioReceiveEnabled.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (videoBandwidth != null) __obj.updateDynamic("videoBandwidth")(videoBandwidth.asInstanceOf[js.Any])
    if (videoCodec != null) __obj.updateDynamic("videoCodec")(videoCodec.asInstanceOf[js.Any])
    if (!js.isUndefined(videoReceiveEnabled)) __obj.updateDynamic("videoReceiveEnabled")(videoReceiveEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomOptions]
  }
}

