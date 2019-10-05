package typings.atPulumiAws.typesInputMod.elastictranscoder

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresetAudio extends js.Object {
  /**
    * The method of organizing audio channels and tracks. Use Audio:Channels to specify the number of channels in your output, and Audio:AudioPackingMode to specify the number of tracks and their relation to the channels. If you do not specify an Audio:AudioPackingMode, Elastic Transcoder uses SingleTrack.
    */
  var audioPackingMode: js.UndefOr[Input[String]] = js.undefined
  /**
    * The bit rate of the video stream in the output file, in kilobits/second. You can configure variable bit rate or constant bit rate encoding.
    */
  var bitRate: js.UndefOr[Input[String]] = js.undefined
  /**
    * The number of audio channels in the output file
    */
  var channels: js.UndefOr[Input[String]] = js.undefined
  /**
    * The video codec for the output file. Valid values are `gif`, `H.264`, `mpeg2`, `vp8`, and `vp9`.
    */
  var codec: js.UndefOr[Input[String]] = js.undefined
  /**
    * The sample rate of the audio stream in the output file, in hertz. Valid values are: `auto`, `22050`, `32000`, `44100`, `48000`, `96000`
    */
  var sampleRate: js.UndefOr[Input[String]] = js.undefined
}

object PresetAudio {
  @scala.inline
  def apply(
    audioPackingMode: Input[String] = null,
    bitRate: Input[String] = null,
    channels: Input[String] = null,
    codec: Input[String] = null,
    sampleRate: Input[String] = null
  ): PresetAudio = {
    val __obj = js.Dynamic.literal()
    if (audioPackingMode != null) __obj.updateDynamic("audioPackingMode")(audioPackingMode.asInstanceOf[js.Any])
    if (bitRate != null) __obj.updateDynamic("bitRate")(bitRate.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (codec != null) __obj.updateDynamic("codec")(codec.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresetAudio]
  }
}

