package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AspectRatioFormat extends js.Object {
  var aspectRatio: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var format: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var interval: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var maxHeight: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var maxWidth: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var paddingPolicy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var resolution: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var sizingPolicy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_AspectRatioFormat {
  @scala.inline
  def apply(
    aspectRatio: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    format: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    interval: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    maxHeight: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    maxWidth: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    paddingPolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    resolution: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sizingPolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

