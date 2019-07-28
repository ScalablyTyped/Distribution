package typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitMod

import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.dashed
import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.dotted
import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardActionStyle extends js.Object {
  var borderStyle: js.UndefOr[solid | dotted | dashed] = js.undefined
  var borderTopColor: js.UndefOr[String] = js.undefined
  var borderTopWidth: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
}

object CardActionStyle {
  @scala.inline
  def apply(
    borderStyle: solid | dotted | dashed = null,
    borderTopColor: String = null,
    borderTopWidth: Int | Double = null,
    padding: Int | Double = null
  ): CardActionStyle = {
    val __obj = js.Dynamic.literal()
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (borderTopColor != null) __obj.updateDynamic("borderTopColor")(borderTopColor)
    if (borderTopWidth != null) __obj.updateDynamic("borderTopWidth")(borderTopWidth.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardActionStyle]
  }
}

