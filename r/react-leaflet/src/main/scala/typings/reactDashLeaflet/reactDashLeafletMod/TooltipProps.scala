package typings.reactDashLeaflet.reactDashLeafletMod

import typings.leaflet.leafletMod.Direction
import typings.leaflet.leafletMod.PointExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.leaflet.leafletMod.DivOverlayOptions because Already inherited
- typings.leaflet.leafletMod.TooltipOptions because var conflicts: className, offset, pane, zoomAnimation. Inlined direction, interactive, opacity, permanent, sticky */ trait TooltipProps extends DivOverlayProps {
  var direction: js.UndefOr[Direction] = js.undefined
  var interactive: js.UndefOr[Boolean] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var permanent: js.UndefOr[Boolean] = js.undefined
  var sticky: js.UndefOr[Boolean] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    children: Children = null,
    className: String = null,
    direction: Direction = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    offset: PointExpression = null,
    onClose: () => Unit = null,
    onOpen: () => Unit = null,
    opacity: Int | Double = null,
    pane: String = null,
    permanent: js.UndefOr[Boolean] = js.undefined,
    sticky: js.UndefOr[Boolean] = js.undefined,
    zoomAnimation: js.UndefOr[Boolean] = js.undefined
  ): TooltipProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (!js.isUndefined(permanent)) __obj.updateDynamic("permanent")(permanent)
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky)
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation)
    __obj.asInstanceOf[TooltipProps]
  }
}

