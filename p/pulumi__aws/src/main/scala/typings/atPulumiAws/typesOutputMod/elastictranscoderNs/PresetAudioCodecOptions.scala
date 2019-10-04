package typings.atPulumiAws.typesOutputMod.elastictranscoderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresetAudioCodecOptions extends js.Object {
  /**
    * The bit depth of a sample is how many bits of information are included in the audio samples. Valid values are `16` and `24`. (FLAC/PCM Only)
    */
  var bitDepth: js.UndefOr[String] = js.undefined
  /**
    * The order the bits of a PCM sample are stored in. The supported value is LittleEndian. (PCM Only)
    */
  var bitOrder: js.UndefOr[String] = js.undefined
  /**
    * If you specified AAC for Audio:Codec, choose the AAC profile for the output file.
    */
  var profile: js.UndefOr[String] = js.undefined
  /**
    * Whether audio samples are represented with negative and positive numbers (signed) or only positive numbers (unsigned). The supported value is Signed. (PCM Only)
    */
  var signed: js.UndefOr[String] = js.undefined
}

object PresetAudioCodecOptions {
  @scala.inline
  def apply(bitDepth: String = null, bitOrder: String = null, profile: String = null, signed: String = null): PresetAudioCodecOptions = {
    val __obj = js.Dynamic.literal()
    if (bitDepth != null) __obj.updateDynamic("bitDepth")(bitDepth)
    if (bitOrder != null) __obj.updateDynamic("bitOrder")(bitOrder)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (signed != null) __obj.updateDynamic("signed")(signed)
    __obj.asInstanceOf[PresetAudioCodecOptions]
  }
}

