package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- leafletLib.leafletMod.TooltipOptions because var conflicts: className, offset, pane, zoomAnimation. Inlined direction, interactive, opacity, permanent, sticky */ trait TooltipProps extends DivOverlayProps {
  var direction: js.UndefOr[leafletLib.leafletMod.Direction] = js.undefined
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var permanent: js.UndefOr[scala.Boolean] = js.undefined
  var sticky: js.UndefOr[scala.Boolean] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    children: Children,
    className: java.lang.String = null,
    direction: leafletLib.leafletMod.Direction = null,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    offset: leafletLib.leafletMod.PointExpression = null,
    onClose: js.Function0[scala.Unit] = null,
    onOpen: js.Function0[scala.Unit] = null,
    opacity: scala.Int | scala.Double = null,
    pane: java.lang.String = null,
    permanent: js.UndefOr[scala.Boolean] = js.undefined,
    sticky: js.UndefOr[scala.Boolean] = js.undefined,
    zoomAnimation: js.UndefOr[scala.Boolean] = js.undefined
  ): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (!js.isUndefined(permanent)) __obj.updateDynamic("permanent")(permanent)
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky)
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation)
    __obj.asInstanceOf[TooltipProps]
  }
}

