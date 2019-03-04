package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- leafletLib.leafletMod.PopupOptions because var conflicts: className, offset, pane, zoomAnimation. Inlined autoClose, autoPan, autoPanPadding, autoPanPaddingBottomRight, autoPanPaddingTopLeft, closeButton, closeOnClick, closeOnEscapeKey, keepInView, maxHeight, maxWidth, minWidth */ trait PopupProps extends DivOverlayProps {
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  var autoPan: js.UndefOr[scala.Boolean] = js.undefined
  var autoPanPadding: js.UndefOr[leafletLib.leafletMod.PointExpression] = js.undefined
  var autoPanPaddingBottomRight: js.UndefOr[leafletLib.leafletMod.PointExpression] = js.undefined
  var autoPanPaddingTopLeft: js.UndefOr[leafletLib.leafletMod.PointExpression] = js.undefined
  var closeButton: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnEscapeKey: js.UndefOr[scala.Boolean] = js.undefined
  var keepInView: js.UndefOr[scala.Boolean] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[leafletLib.leafletMod.LatLngExpression] = js.undefined
}

object PopupProps {
  @scala.inline
  def apply(
    children: Children,
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    autoPan: js.UndefOr[scala.Boolean] = js.undefined,
    autoPanPadding: leafletLib.leafletMod.PointExpression = null,
    autoPanPaddingBottomRight: leafletLib.leafletMod.PointExpression = null,
    autoPanPaddingTopLeft: leafletLib.leafletMod.PointExpression = null,
    className: java.lang.String = null,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnEscapeKey: js.UndefOr[scala.Boolean] = js.undefined,
    keepInView: js.UndefOr[scala.Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    offset: leafletLib.leafletMod.PointExpression = null,
    onClose: js.Function0[scala.Unit] = null,
    onOpen: js.Function0[scala.Unit] = null,
    pane: java.lang.String = null,
    position: leafletLib.leafletMod.LatLngExpression = null,
    zoomAnimation: js.UndefOr[scala.Boolean] = js.undefined
  ): PopupProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (!js.isUndefined(autoPan)) __obj.updateDynamic("autoPan")(autoPan)
    if (autoPanPadding != null) __obj.updateDynamic("autoPanPadding")(autoPanPadding.asInstanceOf[js.Any])
    if (autoPanPaddingBottomRight != null) __obj.updateDynamic("autoPanPaddingBottomRight")(autoPanPaddingBottomRight.asInstanceOf[js.Any])
    if (autoPanPaddingTopLeft != null) __obj.updateDynamic("autoPanPaddingTopLeft")(autoPanPaddingTopLeft.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (!js.isUndefined(closeOnEscapeKey)) __obj.updateDynamic("closeOnEscapeKey")(closeOnEscapeKey)
    if (!js.isUndefined(keepInView)) __obj.updateDynamic("keepInView")(keepInView)
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation)
    __obj.asInstanceOf[PopupProps]
  }
}

