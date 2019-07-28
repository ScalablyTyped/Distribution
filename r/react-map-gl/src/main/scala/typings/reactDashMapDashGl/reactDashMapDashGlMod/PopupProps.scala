package typings.reactDashMapDashGl.reactDashMapDashGlMod

import typings.reactDashMapDashGl.reactDashMapDashGlStrings.`bottom-left`
import typings.reactDashMapDashGl.reactDashMapDashGlStrings.`bottom-right`
import typings.reactDashMapDashGl.reactDashMapDashGlStrings.`top-left`
import typings.reactDashMapDashGl.reactDashMapDashGlStrings.`top-right`
import typings.reactDashMapDashGl.reactDashMapDashGlStrings.bottom
import typings.reactDashMapDashGl.reactDashMapDashGlStrings.left
import typings.reactDashMapDashGl.reactDashMapDashGlStrings.right
import typings.reactDashMapDashGl.reactDashMapDashGlStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupProps extends BaseControlProps {
  var altitude: js.UndefOr[Double] = js.undefined
  var anchor: js.UndefOr[
    top | `top-left` | `top-right` | bottom | `bottom-left` | `bottom-right` | left | right
  ] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closeButton: js.UndefOr[Boolean] = js.undefined
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var dynamicPosition: js.UndefOr[Boolean] = js.undefined
  var latitude: Double
  var longitude: Double
  var offsetLeft: js.UndefOr[Double] = js.undefined
  var offsetTop: js.UndefOr[Double] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var sortByDepth: js.UndefOr[Boolean] = js.undefined
  var tipSize: js.UndefOr[Double] = js.undefined
}

object PopupProps {
  @scala.inline
  def apply(
    latitude: Double,
    longitude: Double,
    altitude: Int | Double = null,
    anchor: top | `top-left` | `top-right` | bottom | `bottom-left` | `bottom-right` | left | right = null,
    captureClick: js.UndefOr[Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[Boolean] = js.undefined,
    captureDrag: js.UndefOr[Boolean] = js.undefined,
    captureScroll: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    dynamicPosition: js.UndefOr[Boolean] = js.undefined,
    offsetLeft: Int | Double = null,
    offsetTop: Int | Double = null,
    onClose: () => Unit = null,
    sortByDepth: js.UndefOr[Boolean] = js.undefined,
    tipSize: Int | Double = null
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
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (!js.isUndefined(sortByDepth)) __obj.updateDynamic("sortByDepth")(sortByDepth)
    if (tipSize != null) __obj.updateDynamic("tipSize")(tipSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupProps]
  }
}

