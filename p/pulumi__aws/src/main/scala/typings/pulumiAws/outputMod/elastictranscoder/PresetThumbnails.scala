package typings.pulumiAws.outputMod.elastictranscoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresetThumbnails extends js.Object {
  /**
    * The aspect ratio of thumbnails. The following values are valid: auto, 1:1, 4:3, 3:2, 16:9
    */
  var aspectRatio: js.UndefOr[String] = js.native
  /**
    * The format of thumbnails, if any. Valid formats are jpg and png.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The approximate number of seconds between thumbnails. The value must be an integer. The actual interval can vary by several seconds from one thumbnail to the next.
    */
  var interval: js.UndefOr[String] = js.native
  /**
    * The maximum height of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 3072, inclusive.
    */
  var maxHeight: js.UndefOr[String] = js.native
  /**
    * The maximum width of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 4096, inclusive.
    */
  var maxWidth: js.UndefOr[String] = js.native
  /**
    * When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match the values that you specified for thumbnail MaxWidth and MaxHeight settings.
    */
  var paddingPolicy: js.UndefOr[String] = js.native
  /**
    * The width and height of thumbnail files in pixels, in the format WidthxHeight, where both values are even integers. The values cannot exceed the width and height that you specified in the Video:Resolution object. (To better control resolution and aspect ratio of thumbnails, we recommend that you use the thumbnail values `maxWidth`, `maxHeight`, `sizingPolicy`, and `paddingPolicy` instead of `resolution` and `aspectRatio`. The two groups of settings are mutually exclusive. Do not use them together)
    */
  var resolution: js.UndefOr[String] = js.native
  /**
    * A value that controls scaling of thumbnails. Valid values are: `Fit`, `Fill`, `Stretch`, `Keep`, `ShrinkToFit`, and `ShrinkToFill`.
    */
  var sizingPolicy: js.UndefOr[String] = js.native
}

object PresetThumbnails {
  @scala.inline
  def apply(
    aspectRatio: String = null,
    format: String = null,
    interval: String = null,
    maxHeight: String = null,
    maxWidth: String = null,
    paddingPolicy: String = null,
    resolution: String = null,
    sizingPolicy: String = null
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

