package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- leafletLib.leafletMod.DivOverlayOptions because var conflicts: pane. Inlined className, offset, zoomAnimation */ trait DivOverlayProps extends MapComponentProps {
  var children: Children
  var className: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[leafletLib.leafletMod.PointExpression] = js.undefined
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var zoomAnimation: js.UndefOr[scala.Boolean] = js.undefined
}

object DivOverlayProps {
  @scala.inline
  def apply(
    children: Children,
    className: java.lang.String = null,
    leaflet: LeafletContext = null,
    offset: leafletLib.leafletMod.PointExpression = null,
    onClose: () => scala.Unit = null,
    onOpen: () => scala.Unit = null,
    pane: java.lang.String = null,
    zoomAnimation: js.UndefOr[scala.Boolean] = js.undefined
  ): DivOverlayProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation)
    __obj.asInstanceOf[DivOverlayProps]
  }
}

