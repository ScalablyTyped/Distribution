package typings.pulumiAws.inputMod.elastictranscoder

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresetThumbnails extends js.Object {
  /**
    * The display aspect ratio of the video in the output file. Valid values are: `auto`, `1:1`, `4:3`, `3:2`, `16:9`. (Note; to better control resolution and aspect ratio of output videos, we recommend that you use the values `maxWidth`, `maxHeight`, `sizingPolicy`, `paddingPolicy`, and `displayAspectRatio` instead of `resolution` and `aspectRatio`.)
    */
  var aspectRatio: js.UndefOr[Input[String]] = js.native
  /**
    * The format of thumbnails, if any. Valid formats are jpg and png.
    */
  var format: js.UndefOr[Input[String]] = js.native
  /**
    * The approximate number of seconds between thumbnails. The value must be an integer. The actual interval can vary by several seconds from one thumbnail to the next.
    */
  var interval: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum height of the watermark.
    */
  var maxHeight: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum width of the watermark.
    */
  var maxWidth: js.UndefOr[Input[String]] = js.native
  /**
    * When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of the output video to make the total size of the output video match the values that you specified for `maxWidth` and `maxHeight`.
    */
  var paddingPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * The width and height of the video in the output file, in pixels. Valid values are `auto` and `widthxheight`. (see note for `aspectRatio`)
    */
  var resolution: js.UndefOr[Input[String]] = js.native
  /**
    * A value that controls scaling of the watermark. Valid values are: `Fit`, `Stretch`, `ShrinkToFit`
    */
  var sizingPolicy: js.UndefOr[Input[String]] = js.native
}

object PresetThumbnails {
  @scala.inline
  def apply(
    aspectRatio: Input[String] = null,
    format: Input[String] = null,
    interval: Input[String] = null,
    maxHeight: Input[String] = null,
    maxWidth: Input[String] = null,
    paddingPolicy: Input[String] = null,
    resolution: Input[String] = null,
    sizingPolicy: Input[String] = null
  ): PresetThumbnails = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (paddingPolicy != null) __obj.updateDynamic("paddingPolicy")(paddingPolicy.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (sizingPolicy != null) __obj.updateDynamic("sizingPolicy")(sizingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresetThumbnails]
  }
}

