package typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitMod

import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.absolute
import typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitStrings.relative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardMenuStyle extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[absolute | relative] = js.undefined
  var right: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object CardMenuStyle {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    position: absolute | relative = null,
    right: Int | Double = null,
    top: Int | Double = null
  ): CardMenuStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardMenuStyle]
  }
}

