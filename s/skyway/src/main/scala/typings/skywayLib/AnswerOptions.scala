package typings
package skywayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnswerOptions extends js.Object {
  var audioBandwidth: js.UndefOr[scala.Double] = js.undefined
  var audioCodec: js.UndefOr[java.lang.String] = js.undefined
  var videoBandwidth: js.UndefOr[scala.Double] = js.undefined
  var videoCodec: js.UndefOr[java.lang.String] = js.undefined
}

object AnswerOptions {
  @scala.inline
  def apply(
    audioBandwidth: scala.Int | scala.Double = null,
    audioCodec: java.lang.String = null,
    videoBandwidth: scala.Int | scala.Double = null,
    videoCodec: java.lang.String = null
  ): AnswerOptions = {
    val __obj = js.Dynamic.literal()
    if (audioBandwidth != null) __obj.updateDynamic("audioBandwidth")(audioBandwidth.asInstanceOf[js.Any])
    if (audioCodec != null) __obj.updateDynamic("audioCodec")(audioCodec)
    if (videoBandwidth != null) __obj.updateDynamic("videoBandwidth")(videoBandwidth.asInstanceOf[js.Any])
    if (videoCodec != null) __obj.updateDynamic("videoCodec")(videoCodec)
    __obj.asInstanceOf[AnswerOptions]
  }
}

