package typings.atPulumiAws.typesOutputMod.elastictranscoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresetVideoWatermark extends js.Object {
  /**
    * The horizontal position of the watermark unless you specify a nonzero value for `horzontalOffset`.
    */
  var horizontalAlign: js.UndefOr[String] = js.undefined
  /**
    * The amount by which you want the horizontal position of the watermark to be offset from the position specified by `horizontalAlign`.
    */
  var horizontalOffset: js.UndefOr[String] = js.undefined
  /**
    * A unique identifier for the settings for one watermark. The value of Id can be up to 40 characters long. You can specify settings for up to four watermarks.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The maximum height of the watermark.
    */
  var maxHeight: js.UndefOr[String] = js.undefined
  /**
    * The maximum width of the watermark.
    */
  var maxWidth: js.UndefOr[String] = js.undefined
  /**
    * A percentage that indicates how much you want a watermark to obscure the video in the location where it appears.
    */
  var opacity: js.UndefOr[String] = js.undefined
  /**
    * A value that controls scaling of the watermark. Valid values are: `Fit`, `Stretch`, `ShrinkToFit`
    */
  var sizingPolicy: js.UndefOr[String] = js.undefined
  /**
    * A value that determines how Elastic Transcoder interprets values that you specified for `video_watermarks.horizontal_offset`, `video_watermarks.vertical_offset`, `video_watermarks.max_width`, and `video_watermarks.max_height`. Valid values are `Content` and `Frame`.
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * The vertical position of the watermark unless you specify a nonzero value for `verticalAlign`. Valid values are `Top`, `Bottom`, `Center`.
    */
  var verticalAlign: js.UndefOr[String] = js.undefined
  /**
    * The amount by which you want the vertical position of the watermark to be offset from the position specified by `verticalAlign`
    */
  var verticalOffset: js.UndefOr[String] = js.undefined
}

object PresetVideoWatermark {
  @scala.inline
  def apply(
    horizontalAlign: String = null,
    horizontalOffset: String = null,
    id: String = null,
    maxHeight: String = null,
    maxWidth: String = null,
    opacity: String = null,
    sizingPolicy: String = null,
    target: String = null,
    verticalAlign: String = null,
    verticalOffset: String = null
  ): PresetVideoWatermark = {
    val __obj = js.Dynamic.literal()
    if (horizontalAlign != null) __obj.updateDynamic("horizontalAlign")(horizontalAlign)
    if (horizontalOffset != null) __obj.updateDynamic("horizontalOffset")(horizontalOffset)
    if (id != null) __obj.updateDynamic("id")(id)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    if (sizingPolicy != null) __obj.updateDynamic("sizingPolicy")(sizingPolicy)
    if (target != null) __obj.updateDynamic("target")(target)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (verticalOffset != null) __obj.updateDynamic("verticalOffset")(verticalOffset)
    __obj.asInstanceOf[PresetVideoWatermark]
  }
}

