package typings.reactDashLeaflet.reactDashLeafletMod

import typings.leaflet.leafletMod.LatLngExpression
import typings.leaflet.leafletMod.PointExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.leaflet.leafletMod.PopupOptions because var conflicts: className, offset, pane, zoomAnimation. Inlined autoClose, autoPan, autoPanPadding, autoPanPaddingBottomRight, autoPanPaddingTopLeft, closeButton, closeOnClick, closeOnEscapeKey, keepInView, maxHeight, maxWidth, minWidth */ trait PopupProps extends DivOverlayProps {
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var autoPan: js.UndefOr[Boolean] = js.undefined
  var autoPanPadding: js.UndefOr[PointExpression] = js.undefined
  var autoPanPaddingBottomRight: js.UndefOr[PointExpression] = js.undefined
  var autoPanPaddingTopLeft: js.UndefOr[PointExpression] = js.undefined
  var closeButton: js.UndefOr[Boolean] = js.undefined
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var closeOnEscapeKey: js.UndefOr[Boolean] = js.undefined
  var keepInView: js.UndefOr[Boolean] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[LatLngExpression] = js.undefined
}

object PopupProps {
  @scala.inline
  def apply(
    children: Children,
    autoClose: js.UndefOr[Boolean] = js.undefined,
    autoPan: js.UndefOr[Boolean] = js.undefined,
    autoPanPadding: PointExpression = null,
    autoPanPaddingBottomRight: PointExpression = null,
    autoPanPaddingTopLeft: PointExpression = null,
    className: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    closeOnEscapeKey: js.UndefOr[Boolean] = js.undefined,
    keepInView: js.UndefOr[Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    offset: PointExpression = null,
    onClose: () => Unit = null,
    onOpen: () => Unit = null,
    pane: String = null,
    position: LatLngExpression = null,
    zoomAnimation: js.UndefOr[Boolean] = js.undefined
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
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation)
    __obj.asInstanceOf[PopupProps]
  }
}

