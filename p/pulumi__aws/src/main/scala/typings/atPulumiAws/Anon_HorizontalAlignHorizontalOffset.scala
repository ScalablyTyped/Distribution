package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HorizontalAlignHorizontalOffset extends js.Object {
  var horizontalAlign: js.UndefOr[Input[String]] = js.undefined
  var horizontalOffset: js.UndefOr[Input[String]] = js.undefined
  var id: js.UndefOr[Input[String]] = js.undefined
  var maxHeight: js.UndefOr[Input[String]] = js.undefined
  var maxWidth: js.UndefOr[Input[String]] = js.undefined
  var opacity: js.UndefOr[Input[String]] = js.undefined
  var sizingPolicy: js.UndefOr[Input[String]] = js.undefined
  var target: js.UndefOr[Input[String]] = js.undefined
  var verticalAlign: js.UndefOr[Input[String]] = js.undefined
  var verticalOffset: js.UndefOr[Input[String]] = js.undefined
}

object Anon_HorizontalAlignHorizontalOffset {
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
  ): Anon_HorizontalAlignHorizontalOffset = {
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
    __obj.asInstanceOf[Anon_HorizontalAlignHorizontalOffset]
  }
}

