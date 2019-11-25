package typings.reactDashJoyride

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrowColor extends js.Object {
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

object Anon_ArrowColor {
  @scala.inline
  def apply(
    arrowColor: String = null,
    backgroundColor: String = null,
    beaconSize: Int | Double = null,
    overlayColor: String = null,
    primaryColor: String = null,
    spotlightShadow: String = null,
    textColor: String = null,
    width: String | Double = null,
    zIndex: Int | Double = null
  ): Anon_ArrowColor = {
    val __obj = js.Dynamic.literal()
    if (arrowColor != null) __obj.updateDynamic("arrowColor")(arrowColor.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (beaconSize != null) __obj.updateDynamic("beaconSize")(beaconSize.asInstanceOf[js.Any])
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (spotlightShadow != null) __obj.updateDynamic("spotlightShadow")(spotlightShadow.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArrowColor]
  }
}

