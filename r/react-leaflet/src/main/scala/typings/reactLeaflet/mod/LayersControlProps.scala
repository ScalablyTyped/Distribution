package typings.reactLeaflet.mod

import typings.leaflet.mod.ControlPosition
import typings.leaflet.mod.Control_.LayersOptions
import typings.leaflet.mod.LayersControlEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactLeaflet.mod.MapControlProps because var conflicts: position. Inlined leaflet */ trait LayersControlProps
  extends LayersOptions
     with LayersControlEvents {
  var children: Children
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
}

object LayersControlProps {
  @scala.inline
  def apply(
    autoZIndex: js.UndefOr[Boolean] = js.undefined,
    children: Children = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    hideSingleBase: js.UndefOr[Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    onbaselayerchange: /* event */ LayersControlEvent => Unit = null,
    onoverlayadd: /* event */ LayersControlEvent => Unit = null,
    onoverlayremove: /* event */ LayersControlEvent => Unit = null,
    position: ControlPosition = null
  ): LayersControlProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoZIndex)) __obj.updateDynamic("autoZIndex")(autoZIndex.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSingleBase)) __obj.updateDynamic("hideSingleBase")(hideSingleBase.get.asInstanceOf[js.Any])
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (onbaselayerchange != null) __obj.updateDynamic("onbaselayerchange")(js.Any.fromFunction1(onbaselayerchange))
    if (onoverlayadd != null) __obj.updateDynamic("onoverlayadd")(js.Any.fromFunction1(onoverlayadd))
    if (onoverlayremove != null) __obj.updateDynamic("onoverlayremove")(js.Any.fromFunction1(onoverlayremove))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersControlProps]
  }
}

