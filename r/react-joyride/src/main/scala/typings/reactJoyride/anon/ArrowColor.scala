package typings.reactJoyride.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowColor extends js.Object {
  var arrowColor: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var beaconSize: js.UndefOr[Double] = js.undefined
  var overlayColor: js.UndefOr[String] = js.undefined
  var primaryColor: js.UndefOr[String] = js.undefined
  var spotlightShadow: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ArrowColor {
  @scala.inline
  def apply(
    arrowColor: String = null,
    backgroundColor: String = null,
    beaconSize: js.UndefOr[Double] = js.undefined,
    overlayColor: String = null,
    primaryColor: String = null,
    spotlightShadow: String = null,
    textColor: String = null,
    width: String | Double = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): ArrowColor = {
    val __obj = js.Dynamic.literal()
    if (arrowColor != null) __obj.updateDynamic("arrowColor")(arrowColor.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(beaconSize)) __obj.updateDynamic("beaconSize")(beaconSize.get.asInstanceOf[js.Any])
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (spotlightShadow != null) __obj.updateDynamic("spotlightShadow")(spotlightShadow.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowColor]
  }
}

