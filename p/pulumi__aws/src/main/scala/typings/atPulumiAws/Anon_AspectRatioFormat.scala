package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AspectRatioFormat extends js.Object {
  var aspectRatio: js.UndefOr[Input[String]] = js.undefined
  var format: js.UndefOr[Input[String]] = js.undefined
  var interval: js.UndefOr[Input[String]] = js.undefined
  var maxHeight: js.UndefOr[Input[String]] = js.undefined
  var maxWidth: js.UndefOr[Input[String]] = js.undefined
  var paddingPolicy: js.UndefOr[Input[String]] = js.undefined
  var resolution: js.UndefOr[Input[String]] = js.undefined
  var sizingPolicy: js.UndefOr[Input[String]] = js.undefined
}

object Anon_AspectRatioFormat {
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
  ): Anon_AspectRatioFormat = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (paddingPolicy != null) __obj.updateDynamic("paddingPolicy")(paddingPolicy.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (sizingPolicy != null) __obj.updateDynamic("sizingPolicy")(sizingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AspectRatioFormat]
  }
}

