package typings.atPulumiAws.typesOutputMod.elastictranscoderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresetVideo extends js.Object {
  /**
    * The display aspect ratio of the video in the output file. Valid values are: `auto`, `1:1`, `4:3`, `3:2`, `16:9`. (Note; to better control resolution and aspect ratio of output videos, we recommend that you use the values `maxWidth`, `maxHeight`, `sizingPolicy`, `paddingPolicy`, and `displayAspectRatio` instead of `resolution` and `aspectRatio`.)
    */
  var aspectRatio: js.UndefOr[String] = js.undefined
  /**
    * The bit rate of the video stream in the output file, in kilobits/second. You can configure variable bit rate or constant bit rate encoding.
    */
  var bitRate: js.UndefOr[String] = js.undefined
  /**
    * The video codec for the output file. Valid values are `gif`, `H.264`, `mpeg2`, `vp8`, and `vp9`.
    */
  var codec: js.UndefOr[String] = js.undefined
  /**
    * The value that Elastic Transcoder adds to the metadata in the output file. If you set DisplayAspectRatio to auto, Elastic Transcoder chooses an aspect ratio that ensures square pixels. If you specify another option, Elastic Transcoder sets that value in the output file.
    */
  var displayAspectRatio: js.UndefOr[String] = js.undefined
  /**
    * Whether to use a fixed value for Video:FixedGOP. Not applicable for containers of type gif. Valid values are true and false. Also known as, Fixed Number of Frames Between Keyframes.
    */
  var fixedGop: js.UndefOr[String] = js.undefined
  /**
    * The frames per second for the video stream in the output file. The following values are valid: `auto`, `10`, `15`, `23.97`, `24`, `25`, `29.97`, `30`, `50`, `60`.
    */
  var frameRate: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of frames between key frames. Not applicable for containers of type gif.
    */
  var keyframesMaxDist: js.UndefOr[String] = js.undefined
  /**
    * If you specify auto for FrameRate, Elastic Transcoder uses the frame rate of the input video for the frame rate of the output video, up to the maximum frame rate. If you do not specify a MaxFrameRate, Elastic Transcoder will use a default of 30.
    */
  var maxFrameRate: js.UndefOr[String] = js.undefined
  /**
    * The maximum height of the watermark.
    */
  var maxHeight: js.UndefOr[String] = js.undefined
  /**
    * The maximum width of the watermark.
    */
  var maxWidth: js.UndefOr[String] = js.undefined
  /**
    * When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of the output video to make the total size of the output video match the values that you specified for `maxWidth` and `maxHeight`.
    */
  var paddingPolicy: js.UndefOr[String] = js.undefined
  /**
    * The width and height of the video in the output file, in pixels. Valid values are `auto` and `widthxheight`. (see note for `aspectRatio`)
    */
  var resolution: js.UndefOr[String] = js.undefined
  /**
    * A value that controls scaling of the watermark. Valid values are: `Fit`, `Stretch`, `ShrinkToFit`
    */
  var sizingPolicy: js.UndefOr[String] = js.undefined
}

object PresetVideo {
  @scala.inline
  def apply(
    aspectRatio: String = null,
    bitRate: String = null,
    codec: String = null,
    displayAspectRatio: String = null,
    fixedGop: String = null,
    frameRate: String = null,
    keyframesMaxDist: String = null,
    maxFrameRate: String = null,
    maxHeight: String = null,
    maxWidth: String = null,
    paddingPolicy: String = null,
    resolution: String = null,
    sizingPolicy: String = null
  ): PresetVideo = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio)
    if (bitRate != null) __obj.updateDynamic("bitRate")(bitRate)
    if (codec != null) __obj.updateDynamic("codec")(codec)
    if (displayAspectRatio != null) __obj.updateDynamic("displayAspectRatio")(displayAspectRatio)
    if (fixedGop != null) __obj.updateDynamic("fixedGop")(fixedGop)
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate)
    if (keyframesMaxDist != null) __obj.updateDynamic("keyframesMaxDist")(keyframesMaxDist)
    if (maxFrameRate != null) __obj.updateDynamic("maxFrameRate")(maxFrameRate)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth)
    if (paddingPolicy != null) __obj.updateDynamic("paddingPolicy")(paddingPolicy)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution)
    if (sizingPolicy != null) __obj.updateDynamic("sizingPolicy")(sizingPolicy)
    __obj.asInstanceOf[PresetVideo]
  }
}

