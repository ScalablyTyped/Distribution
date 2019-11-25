package typings.skyway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnswerOptions extends js.Object {
  var audioBandwidth: js.UndefOr[Double] = js.undefined
  var audioCodec: js.UndefOr[String] = js.undefined
  var videoBandwidth: js.UndefOr[Double] = js.undefined
  var videoCodec: js.UndefOr[String] = js.undefined
}

object AnswerOptions {
  @scala.inline
  def apply(
    audioBandwidth: Int | Double = null,
    audioCodec: String = null,
    videoBandwidth: Int | Double = null,
    videoCodec: String = null
  ): AnswerOptions = {
    val __obj = js.Dynamic.literal()
    if (audioBandwidth != null) __obj.updateDynamic("audioBandwidth")(audioBandwidth.asInstanceOf[js.Any])
    if (audioCodec != null) __obj.updateDynamic("audioCodec")(audioCodec.asInstanceOf[js.Any])
    if (videoBandwidth != null) __obj.updateDynamic("videoBandwidth")(videoBandwidth.asInstanceOf[js.Any])
    if (videoCodec != null) __obj.updateDynamic("videoCodec")(videoCodec.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnswerOptions]
  }
}

