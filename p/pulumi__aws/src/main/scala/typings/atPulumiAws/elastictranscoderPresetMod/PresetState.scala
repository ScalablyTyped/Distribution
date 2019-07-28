package typings.atPulumiAws.elastictranscoderPresetMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AspectRatioBitRateCodec
import typings.atPulumiAws.Anon_AspectRatioFormat
import typings.atPulumiAws.Anon_AudioPackingModeBitRate
import typings.atPulumiAws.Anon_BitDepthBitOrder
import typings.atPulumiAws.Anon_HorizontalAlignHorizontalOffset
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresetState extends js.Object {
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Audio parameters object (documented below).
    */
  val audio: js.UndefOr[Input[Anon_AudioPackingModeBitRate]] = js.undefined
  /**
    * Codec options for the audio parameters (documented below)
    */
  val audioCodecOptions: js.UndefOr[Input[Anon_BitDepthBitOrder]] = js.undefined
  /**
    * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
    */
  val container: js.UndefOr[Input[String]] = js.undefined
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
  val thumbnails: js.UndefOr[Input[Anon_AspectRatioFormat]] = js.undefined
  val `type`: js.UndefOr[Input[String]] = js.undefined
  /**
    * Video parameters object (documented below)
    */
  val video: js.UndefOr[Input[Anon_AspectRatioBitRateCodec]] = js.undefined
  val videoCodecOptions: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Watermark parameters for the video parameters (documented below)
    * * `video_codec_options` (Optional, Forces new resource) Codec options for the video parameters
    */
  val videoWatermarks: js.UndefOr[Input[js.Array[Input[Anon_HorizontalAlignHorizontalOffset]]]] = js.undefined
}

object PresetState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    audio: Input[Anon_AudioPackingModeBitRate] = null,
    audioCodecOptions: Input[Anon_BitDepthBitOrder] = null,
    container: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    thumbnails: Input[Anon_AspectRatioFormat] = null,
    `type`: Input[String] = null,
    video: Input[Anon_AspectRatioBitRateCodec] = null,
    videoCodecOptions: Input[StringDictionary[_]] = null,
    videoWatermarks: Input[js.Array[Input[Anon_HorizontalAlignHorizontalOffset]]] = null
  ): PresetState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (audioCodecOptions != null) __obj.updateDynamic("audioCodecOptions")(audioCodecOptions.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (videoCodecOptions != null) __obj.updateDynamic("videoCodecOptions")(videoCodecOptions.asInstanceOf[js.Any])
    if (videoWatermarks != null) __obj.updateDynamic("videoWatermarks")(videoWatermarks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresetState]
  }
}

