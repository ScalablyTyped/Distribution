package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationControlProps extends BaseControlProps {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onViewStateChange: js.UndefOr[js.Function1[/* info */ ViewStateChangeInfo, scala.Unit]] = js.undefined
  var onViewportChange: js.UndefOr[js.Function1[/* viewport */ ViewState, scala.Unit]] = js.undefined
  var showCompass: js.UndefOr[scala.Boolean] = js.undefined
  var showZoom: js.UndefOr[scala.Boolean] = js.undefined
}

object NavigationControlProps {
  @scala.inline
  def apply(
    captureClick: js.UndefOr[scala.Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[scala.Boolean] = js.undefined,
    captureDrag: js.UndefOr[scala.Boolean] = js.undefined,
    captureScroll: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    onViewStateChange: js.Function1[/* info */ ViewStateChangeInfo, scala.Unit] = null,
    onViewportChange: js.Function1[/* viewport */ ViewState, scala.Unit] = null,
    showCompass: js.UndefOr[scala.Boolean] = js.undefined,
    showZoom: js.UndefOr[scala.Boolean] = js.undefined
  ): NavigationControlProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick)
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick)
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag)
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onViewStateChange != null) __obj.updateDynamic("onViewStateChange")(onViewStateChange)
    if (onViewportChange != null) __obj.updateDynamic("onViewportChange")(onViewportChange)
    if (!js.isUndefined(showCompass)) __obj.updateDynamic("showCompass")(showCompass)
    if (!js.isUndefined(showZoom)) __obj.updateDynamic("showZoom")(showZoom)
    __obj.asInstanceOf[NavigationControlProps]
  }
}

