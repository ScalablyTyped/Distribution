package typings
package skywayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomOptions extends js.Object {
  var audioBandwidth: js.UndefOr[scala.Double] = js.undefined
  var audioCodec: js.UndefOr[java.lang.String] = js.undefined
  var audioReceiveEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var stream: js.UndefOr[stdLib.MediaStream] = js.undefined
  var videoBandwidth: js.UndefOr[scala.Double] = js.undefined
  var videoCodec: js.UndefOr[java.lang.String] = js.undefined
  var videoReceiveEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object RoomOptions {
  @scala.inline
  def apply(
    audioBandwidth: scala.Int | scala.Double = null,
    audioCodec: java.lang.String = null,
    audioReceiveEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    mode: java.lang.String = null,
    stream: stdLib.MediaStream = null,
    videoBandwidth: scala.Int | scala.Double = null,
    videoCodec: java.lang.String = null,
    videoReceiveEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): RoomOptions = {
    val __obj = js.Dynamic.literal()
    if (audioBandwidth != null) __obj.updateDynamic("audioBandwidth")(audioBandwidth.asInstanceOf[js.Any])
    if (audioCodec != null) __obj.updateDynamic("audioCodec")(audioCodec)
    if (!js.isUndefined(audioReceiveEnabled)) __obj.updateDynamic("audioReceiveEnabled")(audioReceiveEnabled)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (videoBandwidth != null) __obj.updateDynamic("videoBandwidth")(videoBandwidth.asInstanceOf[js.Any])
    if (videoCodec != null) __obj.updateDynamic("videoCodec")(videoCodec)
    if (!js.isUndefined(videoReceiveEnabled)) __obj.updateDynamic("videoReceiveEnabled")(videoReceiveEnabled)
    __obj.asInstanceOf[RoomOptions]
  }
}

