package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardStyle extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var shadowColor: js.UndefOr[String] = js.undefined
  var shadowOffset: js.UndefOr[Height] = js.undefined
  var shadowOpacity: js.UndefOr[Double] = js.undefined
  var shadowRadius: js.UndefOr[Double] = js.undefined
}

object CardStyle {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    borderRadius: js.UndefOr[Double] = js.undefined,
    borderWidth: js.UndefOr[Double] = js.undefined,
    shadowColor: String = null,
    shadowOffset: Height = null,
    shadowOpacity: js.UndefOr[Double] = js.undefined,
    shadowRadius: js.UndefOr[Double] = js.undefined
  ): CardStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOpacity)) __obj.updateDynamic("shadowOpacity")(shadowOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowRadius)) __obj.updateDynamic("shadowRadius")(shadowRadius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardStyle]
  }
}

