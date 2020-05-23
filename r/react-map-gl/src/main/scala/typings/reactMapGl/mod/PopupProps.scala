package typings.reactMapGl.mod

import typings.reactMapGl.reactMapGlStrings.`bottom-left`
import typings.reactMapGl.reactMapGlStrings.`bottom-right`
import typings.reactMapGl.reactMapGlStrings.`top-left`
import typings.reactMapGl.reactMapGlStrings.`top-right`
import typings.reactMapGl.reactMapGlStrings.bottom
import typings.reactMapGl.reactMapGlStrings.left
import typings.reactMapGl.reactMapGlStrings.right
import typings.reactMapGl.reactMapGlStrings.top
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
    altitude: js.UndefOr[Double] = js.undefined,
    anchor: top | `top-left` | `top-right` | bottom | `bottom-left` | `bottom-right` | left | right = null,
    captureClick: js.UndefOr[Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[Boolean] = js.undefined,
    captureDrag: js.UndefOr[Boolean] = js.undefined,
    captureScroll: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    dynamicPosition: js.UndefOr[Boolean] = js.undefined,
    offsetLeft: js.UndefOr[Double] = js.undefined,
    offsetTop: js.UndefOr[Double] = js.undefined,
    onClose: () => Unit = null,
    sortByDepth: js.UndefOr[Boolean] = js.undefined,
    tipSize: js.UndefOr[Double] = js.undefined
  ): PopupProps = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicPosition)) __obj.updateDynamic("dynamicPosition")(dynamicPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetLeft)) __obj.updateDynamic("offsetLeft")(offsetLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetTop)) __obj.updateDynamic("offsetTop")(offsetTop.get.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (!js.isUndefined(sortByDepth)) __obj.updateDynamic("sortByDepth")(sortByDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tipSize)) __obj.updateDynamic("tipSize")(tipSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupProps]
  }
}

