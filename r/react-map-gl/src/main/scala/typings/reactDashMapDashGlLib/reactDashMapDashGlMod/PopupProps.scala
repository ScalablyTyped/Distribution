package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupProps extends BaseControlProps {
  var altitude: js.UndefOr[scala.Double] = js.undefined
  var anchor: js.UndefOr[
    reactDashMapDashGlLib.reactDashMapDashGlLibStrings.top | reactDashMapDashGlLib.reactDashMapDashGlLibStrings.`top-left` | reactDashMapDashGlLib.reactDashMapDashGlLibStrings.`top-right` | reactDashMapDashGlLib.reactDashMapDashGlLibStrings.bottom | reactDashMapDashGlLib.reactDashMapDashGlLibStrings.`bottom-left` | reactDashMapDashGlLib.reactDashMapDashGlLibStrings.`bottom-right` | reactDashMapDashGlLib.reactDashMapDashGlLibStrings.left | reactDashMapDashGlLib.reactDashMapDashGlLibStrings.right
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var closeButton: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var dynamicPosition: js.UndefOr[scala.Boolean] = js.undefined
  var latitude: scala.Double
  var longitude: scala.Double
  var offsetLeft: js.UndefOr[scala.Double] = js.undefined
  var offsetTop: js.UndefOr[scala.Double] = js.undefined
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var sortByDepth: js.UndefOr[scala.Boolean] = js.undefined
  var tipSize: js.UndefOr[scala.Double] = js.undefined
}

object PopupProps {
  @scala.inline
  def apply(
    latitude: scala.Double,
    longitude: scala.Double,
    altitude: scala.Int | scala.Double = null,
    anchor: reactDashMapDashGlLib.reactDashMapDashGlLibStrings.top | reactDashMapDashGlLib.reactDashMapDashGlLibStrings.`top-left` | reactDashMapDashGlLib.reactDashMapDashGlLibStrings.`top-right` | reactDashMapDashGlLib.reactDashMapDashGlLibStrings.bottom | reactDashMapDashGlLib.reactDashMapDashGlLibStrings.`bottom-left` | reactDashMapDashGlLib.reactDashMapDashGlLibStrings.`bottom-right` | reactDashMapDashGlLib.reactDashMapDashGlLibStrings.left | reactDashMapDashGlLib.reactDashMapDashGlLibStrings.right = null,
    captureClick: js.UndefOr[scala.Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[scala.Boolean] = js.undefined,
    captureDrag: js.UndefOr[scala.Boolean] = js.undefined,
    captureScroll: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    dynamicPosition: js.UndefOr[scala.Boolean] = js.undefined,
    offsetLeft: scala.Int | scala.Double = null,
    offsetTop: scala.Int | scala.Double = null,
    onClose: js.Function0[scala.Unit] = null,
    sortByDepth: js.UndefOr[scala.Boolean] = js.undefined,
    tipSize: scala.Int | scala.Double = null
  ): PopupProps = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick)
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick)
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag)
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (!js.isUndefined(dynamicPosition)) __obj.updateDynamic("dynamicPosition")(dynamicPosition)
    if (offsetLeft != null) __obj.updateDynamic("offsetLeft")(offsetLeft.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (!js.isUndefined(sortByDepth)) __obj.updateDynamic("sortByDepth")(sortByDepth)
    if (tipSize != null) __obj.updateDynamic("tipSize")(tipSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupProps]
  }
}

