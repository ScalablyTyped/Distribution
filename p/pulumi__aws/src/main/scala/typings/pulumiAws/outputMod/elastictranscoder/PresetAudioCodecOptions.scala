package typings.pulumiAws.outputMod.elastictranscoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresetAudioCodecOptions extends js.Object {
  /**
    * The bit depth of a sample is how many bits of information are included in the audio samples. Valid values are `16` and `24`. (FLAC/PCM Only)
    */
  var bitDepth: js.UndefOr[String] = js.native
  /**
    * The order the bits of a PCM sample are stored in. The supported value is LittleEndian. (PCM Only)
    */
  var bitOrder: js.UndefOr[String] = js.native
  /**
    * If you specified AAC for Audio:Codec, choose the AAC profile for the output file.
    */
  var profile: js.UndefOr[String] = js.native
  /**
    * Whether audio samples are represented with negative and positive numbers (signed) or only positive numbers (unsigned). The supported value is Signed. (PCM Only)
    */
  var signed: js.UndefOr[String] = js.native
}

object PresetAudioCodecOptions {
  @scala.inline
  def apply(): PresetAudioCodecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetAudioCodecOptions]
  }
  @scala.inline
  implicit class PresetAudioCodecOptionsOps[Self <: PresetAudioCodecOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBitDepth(value: String): Self = this.set("bitDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitDepth: Self = this.set("bitDepth", js.undefined)
    @scala.inline
    def setBitOrder(value: String): Self = this.set("bitOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitOrder: Self = this.set("bitOrder", js.undefined)
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setSigned(value: String): Self = this.set("signed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigned: Self = this.set("signed", js.undefined)
  }
  
}

