package typings.atPulumiAws.typesOutputMod.elastictranscoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresetAudio extends js.Object {
  /**
    * The method of organizing audio channels and tracks. Use Audio:Channels to specify the number of channels in your output, and Audio:AudioPackingMode to specify the number of tracks and their relation to the channels. If you do not specify an Audio:AudioPackingMode, Elastic Transcoder uses SingleTrack.
    */
  var audioPackingMode: js.UndefOr[String] = js.undefined
  /**
    * The bit rate of the video stream in the output file, in kilobits/second. You can configure variable bit rate or constant bit rate encoding.
    */
  var bitRate: js.UndefOr[String] = js.undefined
  /**
    * The number of audio channels in the output file
    */
  var channels: js.UndefOr[String] = js.undefined
  /**
    * The video codec for the output file. Valid values are `gif`, `H.264`, `mpeg2`, `vp8`, and `vp9`.
    */
  var codec: js.UndefOr[String] = js.undefined
  /**
    * The sample rate of the audio stream in the output file, in hertz. Valid values are: `auto`, `22050`, `32000`, `44100`, `48000`, `96000`
    */
  var sampleRate: js.UndefOr[String] = js.undefined
}

object PresetAudio {
  @scala.inline
  def apply(
    audioPackingMode: String = null,
    bitRate: String = null,
    channels: String = null,
    codec: String = null,
    sampleRate: String = null
  ): PresetAudio = {
    val __obj = js.Dynamic.literal()
    if (audioPackingMode != null) __obj.updateDynamic("audioPackingMode")(audioPackingMode)
    if (bitRate != null) __obj.updateDynamic("bitRate")(bitRate)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (codec != null) __obj.updateDynamic("codec")(codec)
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate)
    __obj.asInstanceOf[PresetAudio]
  }
}

