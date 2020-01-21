package typings.pulumiAws.inputMod.elastictranscoder

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresetVideoWatermark extends js.Object {
  /**
    * The horizontal position of the watermark unless you specify a nonzero value for `horzontalOffset`.
    */
  var horizontalAlign: js.UndefOr[Input[String]] = js.native
  /**
    * The amount by which you want the horizontal position of the watermark to be offset from the position specified by `horizontalAlign`.
    */
  var horizontalOffset: js.UndefOr[Input[String]] = js.native
  /**
    * A unique identifier for the settings for one watermark. The value of Id can be up to 40 characters long. You can specify settings for up to four watermarks.
    */
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum height of the watermark.
    */
  var maxHeight: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum width of the watermark.
    */
  var maxWidth: js.UndefOr[Input[String]] = js.native
  /**
    * A percentage that indicates how much you want a watermark to obscure the video in the location where it appears.
    */
  var opacity: js.UndefOr[Input[String]] = js.native
  /**
    * A value that controls scaling of the watermark. Valid values are: `Fit`, `Stretch`, `ShrinkToFit`
    */
  var sizingPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * A value that determines how Elastic Transcoder interprets values that you specified for `video_watermarks.horizontal_offset`, `video_watermarks.vertical_offset`, `video_watermarks.max_width`, and `video_watermarks.max_height`. Valid values are `Content` and `Frame`.
    */
  var target: js.UndefOr[Input[String]] = js.native
  /**
    * The vertical position of the watermark unless you specify a nonzero value for `verticalAlign`. Valid values are `Top`, `Bottom`, `Center`.
    */
  var verticalAlign: js.UndefOr[Input[String]] = js.native
  /**
    * The amount by which you want the vertical position of the watermark to be offset from the position specified by `verticalAlign`
    */
  var verticalOffset: js.UndefOr[Input[String]] = js.native
}

object PresetVideoWatermark {
  @scala.inline
  def apply(
    horizontalAlign: Input[String] = null,
    horizontalOffset: Input[String] = null,
    id: Input[String] = null,
    maxHeight: Input[String] = null,
    maxWidth: Input[String] = null,
    opacity: Input[String] = null,
    sizingPolicy: Input[String] = null,
    target: Input[String] = null,
    verticalAlign: Input[String] = null,
    verticalOffset: Input[String] = null
  ): PresetVideoWatermark = {
    val __obj = js.Dynamic.literal()
    if (horizontalAlign != null) __obj.updateDynamic("horizontalAlign")(horizontalAlign.asInstanceOf[js.Any])
    if (horizontalOffset != null) __obj.updateDynamic("horizontalOffset")(horizontalOffset.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (sizingPolicy != null) __obj.updateDynamic("sizingPolicy")(sizingPolicy.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (verticalOffset != null) __obj.updateDynamic("verticalOffset")(verticalOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresetVideoWatermark]
  }
}

