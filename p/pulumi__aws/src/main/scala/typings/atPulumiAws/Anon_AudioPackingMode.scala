package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AudioPackingMode extends js.Object {
  var audioPackingMode: js.UndefOr[String] = js.undefined
  var bitRate: js.UndefOr[String] = js.undefined
  var channels: js.UndefOr[String] = js.undefined
  var codec: js.UndefOr[String] = js.undefined
  var sampleRate: js.UndefOr[String] = js.undefined
}

object Anon_AudioPackingMode {
  @scala.inline
  def apply(
    audioPackingMode: String = null,
    bitRate: String = null,
    channels: String = null,
    codec: String = null,
    sampleRate: String = null
  ): Anon_AudioPackingMode = {
    val __obj = js.Dynamic.literal()
    if (audioPackingMode != null) __obj.updateDynamic("audioPackingMode")(audioPackingMode)
    if (bitRate != null) __obj.updateDynamic("bitRate")(bitRate)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (codec != null) __obj.updateDynamic("codec")(codec)
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate)
    __obj.asInstanceOf[Anon_AudioPackingMode]
  }
}

