package typings.atPulumiAws.elastictranscoderPresetMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.elastictranscoder.PresetAudio
import typings.atPulumiAws.typesInputMod.elastictranscoder.PresetAudioCodecOptions
import typings.atPulumiAws.typesInputMod.elastictranscoder.PresetThumbnails
import typings.atPulumiAws.typesInputMod.elastictranscoder.PresetVideo
import typings.atPulumiAws.typesInputMod.elastictranscoder.PresetVideoWatermark
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresetArgs extends js.Object {
  /**
    * Audio parameters object (documented below).
    */
  val audio: js.UndefOr[Input[PresetAudio]] = js.undefined
  /**
    * Codec options for the audio parameters (documented below)
    */
  val audioCodecOptions: js.UndefOr[Input[PresetAudioCodecOptions]] = js.undefined
  /**
    * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
    */
  val container: Input[String]
  /**
    * A description of the preset (maximum 255 characters)
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the preset. (maximum 40 characters)
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Thumbnail parameters object (documented below)
    */
  val thumbnails: js.UndefOr[Input[PresetThumbnails]] = js.undefined
  val `type`: js.UndefOr[Input[String]] = js.undefined
  /**
    * Video parameters object (documented below)
    */
  val video: js.UndefOr[Input[PresetVideo]] = js.undefined
  val videoCodecOptions: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Watermark parameters for the video parameters (documented below)
    * * `videoCodecOptions` (Optional, Forces new resource) Codec options for the video parameters
    */
  val videoWatermarks: js.UndefOr[Input[js.Array[Input[PresetVideoWatermark]]]] = js.undefined
}

object PresetArgs {
  @scala.inline
  def apply(
    container: Input[String],
    audio: Input[PresetAudio] = null,
    audioCodecOptions: Input[PresetAudioCodecOptions] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    thumbnails: Input[PresetThumbnails] = null,
    `type`: Input[String] = null,
    video: Input[PresetVideo] = null,
    videoCodecOptions: Input[StringDictionary[_]] = null,
    videoWatermarks: Input[js.Array[Input[PresetVideoWatermark]]] = null
  ): PresetArgs = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (audioCodecOptions != null) __obj.updateDynamic("audioCodecOptions")(audioCodecOptions.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (videoCodecOptions != null) __obj.updateDynamic("videoCodecOptions")(videoCodecOptions.asInstanceOf[js.Any])
    if (videoWatermarks != null) __obj.updateDynamic("videoWatermarks")(videoWatermarks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresetArgs]
  }
}

