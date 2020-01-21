package typings.pulumiAws.outputMod.elastictranscoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresetVideo extends js.Object {
  /**
    * The display aspect ratio of the video in the output file. Valid values are: `auto`, `1:1`, `4:3`, `3:2`, `16:9`. (Note; to better control resolution and aspect ratio of output videos, we recommend that you use the values `maxWidth`, `maxHeight`, `sizingPolicy`, `paddingPolicy`, and `displayAspectRatio` instead of `resolution` and `aspectRatio`.)
    */
  var aspectRatio: js.UndefOr[String] = js.native
  /**
    * The bit rate of the video stream in the output file, in kilobits/second. You can configure variable bit rate or constant bit rate encoding.
    */
  var bitRate: js.UndefOr[String] = js.native
  /**
    * The video codec for the output file. Valid values are `gif`, `H.264`, `mpeg2`, `vp8`, and `vp9`.
    */
  var codec: js.UndefOr[String] = js.native
  /**
    * The value that Elastic Transcoder adds to the metadata in the output file. If you set DisplayAspectRatio to auto, Elastic Transcoder chooses an aspect ratio that ensures square pixels. If you specify another option, Elastic Transcoder sets that value in the output file.
    */
  var displayAspectRatio: js.UndefOr[String] = js.native
  /**
    * Whether to use a fixed value for Video:FixedGOP. Not applicable for containers of type gif. Valid values are true and false. Also known as, Fixed Number of Frames Between Keyframes.
    */
  var fixedGop: js.UndefOr[String] = js.native
  /**
    * The frames per second for the video stream in the output file. The following values are valid: `auto`, `10`, `15`, `23.97`, `24`, `25`, `29.97`, `30`, `50`, `60`.
    */
  var frameRate: js.UndefOr[String] = js.native
  /**
    * The maximum number of frames between key frames. Not applicable for containers of type gif.
    */
  var keyframesMaxDist: js.UndefOr[String] = js.native
  /**
    * If you specify auto for FrameRate, Elastic Transcoder uses the frame rate of the input video for the frame rate of the output video, up to the maximum frame rate. If you do not specify a MaxFrameRate, Elastic Transcoder will use a default of 30.
    */
  var maxFrameRate: js.UndefOr[String] = js.native
  /**
    * The maximum height of the watermark.
    */
  var maxHeight: js.UndefOr[String] = js.native
  /**
    * The maximum width of the watermark.
    */
  var maxWidth: js.UndefOr[String] = js.native
  /**
    * When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of the output video to make the total size of the output video match the values that you specified for `maxWidth` and `maxHeight`.
    */
  var paddingPolicy: js.UndefOr[String] = js.native
  /**
    * The width and height of the video in the output file, in pixels. Valid values are `auto` and `widthxheight`. (see note for `aspectRatio`)
    */
  var resolution: js.UndefOr[String] = js.native
  /**
    * A value that controls scaling of the watermark. Valid values are: `Fit`, `Stretch`, `ShrinkToFit`
    */
  var sizingPolicy: js.UndefOr[String] = js.native
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
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (bitRate != null) __obj.updateDynamic("bitRate")(bitRate.asInstanceOf[js.Any])
    if (codec != null) __obj.updateDynamic("codec")(codec.asInstanceOf[js.Any])
    if (displayAspectRatio != null) __obj.updateDynamic("displayAspectRatio")(displayAspectRatio.asInstanceOf[js.Any])
    if (fixedGop != null) __obj.updateDynamic("fixedGop")(fixedGop.asInstanceOf[js.Any])
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (keyframesMaxDist != null) __obj.updateDynamic("keyframesMaxDist")(keyframesMaxDist.asInstanceOf[js.Any])
    if (maxFrameRate != null) __obj.updateDynamic("maxFrameRate")(maxFrameRate.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (paddingPolicy != null) __obj.updateDynamic("paddingPolicy")(paddingPolicy.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (sizingPolicy != null) __obj.updateDynamic("sizingPolicy")(sizingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresetVideo]
  }
}

