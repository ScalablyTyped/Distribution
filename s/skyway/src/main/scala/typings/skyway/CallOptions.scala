package typings.skyway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallOptions extends js.Object {
  var audioBandwidth: js.UndefOr[Double] = js.undefined
  var audioCodec: js.UndefOr[String] = js.undefined
  var audioReceiveEnabled: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var videoBandWidth: js.UndefOr[Double] = js.undefined
  var videoCodec: js.UndefOr[String] = js.undefined
  var videoReceiveEnabled: js.UndefOr[Boolean] = js.undefined
}

object CallOptions {
  @scala.inline
  def apply(
    audioBandwidth: js.UndefOr[Double] = js.undefined,
    audioCodec: String = null,
    audioReceiveEnabled: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    metadata: js.Any = null,
    videoBandWidth: js.UndefOr[Double] = js.undefined,
    videoCodec: String = null,
    videoReceiveEnabled: js.UndefOr[Boolean] = js.undefined
  ): CallOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audioBandwidth)) __obj.updateDynamic("audioBandwidth")(audioBandwidth.get.asInstanceOf[js.Any])
    if (audioCodec != null) __obj.updateDynamic("audioCodec")(audioCodec.asInstanceOf[js.Any])
    if (!js.isUndefined(audioReceiveEnabled)) __obj.updateDynamic("audioReceiveEnabled")(audioReceiveEnabled.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(videoBandWidth)) __obj.updateDynamic("videoBandWidth")(videoBandWidth.get.asInstanceOf[js.Any])
    if (videoCodec != null) __obj.updateDynamic("videoCodec")(videoCodec.asInstanceOf[js.Any])
    if (!js.isUndefined(videoReceiveEnabled)) __obj.updateDynamic("videoReceiveEnabled")(videoReceiveEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOptions]
  }
}

