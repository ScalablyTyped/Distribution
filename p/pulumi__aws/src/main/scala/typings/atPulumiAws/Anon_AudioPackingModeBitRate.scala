package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AudioPackingModeBitRate extends js.Object {
  var audioPackingMode: js.UndefOr[Input[String]] = js.undefined
  var bitRate: js.UndefOr[Input[String]] = js.undefined
  var channels: js.UndefOr[Input[String]] = js.undefined
  var codec: js.UndefOr[Input[String]] = js.undefined
  var sampleRate: js.UndefOr[Input[String]] = js.undefined
}

object Anon_AudioPackingModeBitRate {
  @scala.inline
  def apply(
    audioPackingMode: Input[String] = null,
    bitRate: Input[String] = null,
    channels: Input[String] = null,
    codec: Input[String] = null,
    sampleRate: Input[String] = null
  ): Anon_AudioPackingModeBitRate = {
    val __obj = js.Dynamic.literal()
    if (audioPackingMode != null) __obj.updateDynamic("audioPackingMode")(audioPackingMode.asInstanceOf[js.Any])
    if (bitRate != null) __obj.updateDynamic("bitRate")(bitRate.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (codec != null) __obj.updateDynamic("codec")(codec.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AudioPackingModeBitRate]
  }
}

