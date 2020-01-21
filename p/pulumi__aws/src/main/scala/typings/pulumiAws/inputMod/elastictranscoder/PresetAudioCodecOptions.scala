package typings.pulumiAws.inputMod.elastictranscoder

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresetAudioCodecOptions extends js.Object {
  /**
    * The bit depth of a sample is how many bits of information are included in the audio samples. Valid values are `16` and `24`. (FLAC/PCM Only)
    */
  var bitDepth: js.UndefOr[Input[String]] = js.native
  /**
    * The order the bits of a PCM sample are stored in. The supported value is LittleEndian. (PCM Only)
    */
  var bitOrder: js.UndefOr[Input[String]] = js.native
  /**
    * If you specified AAC for Audio:Codec, choose the AAC profile for the output file.
    */
  var profile: js.UndefOr[Input[String]] = js.native
  /**
    * Whether audio samples are represented with negative and positive numbers (signed) or only positive numbers (unsigned). The supported value is Signed. (PCM Only)
    */
  var signed: js.UndefOr[Input[String]] = js.native
}

object PresetAudioCodecOptions {
  @scala.inline
  def apply(
    bitDepth: Input[String] = null,
    bitOrder: Input[String] = null,
    profile: Input[String] = null,
    signed: Input[String] = null
  ): PresetAudioCodecOptions = {
    val __obj = js.Dynamic.literal()
    if (bitDepth != null) __obj.updateDynamic("bitDepth")(bitDepth.asInstanceOf[js.Any])
    if (bitOrder != null) __obj.updateDynamic("bitOrder")(bitOrder.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (signed != null) __obj.updateDynamic("signed")(signed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresetAudioCodecOptions]
  }
}

