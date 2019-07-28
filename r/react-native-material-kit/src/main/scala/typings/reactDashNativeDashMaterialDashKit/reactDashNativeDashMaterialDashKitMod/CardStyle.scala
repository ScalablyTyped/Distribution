package typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitMod

import typings.reactDashNativeDashMaterialDashKit.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardStyle extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var shadowColor: js.UndefOr[String] = js.undefined
  var shadowOffset: js.UndefOr[Anon_Height] = js.undefined
  var shadowOpacity: js.UndefOr[Double] = js.undefined
  var shadowRadius: js.UndefOr[Double] = js.undefined
}

object CardStyle {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    borderRadius: Int | Double = null,
    borderWidth: Int | Double = null,
    shadowColor: String = null,
    shadowOffset: Anon_Height = null,
    shadowOpacity: Int | Double = null,
    shadowRadius: Int | Double = null
  ): CardStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset)
    if (shadowOpacity != null) __obj.updateDynamic("shadowOpacity")(shadowOpacity.asInstanceOf[js.Any])
    if (shadowRadius != null) __obj.updateDynamic("shadowRadius")(shadowRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardStyle]
  }
}

