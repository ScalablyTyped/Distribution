package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersControlProps
  extends leafletLib.leafletMod.ControlNs.LayersOptions
     with reactDashLeafletLib.Anon_Leaflet
     with LayersControlEvents {
  var children: Children
}

object LayersControlProps {
  @scala.inline
  def apply(
    children: Children,
    autoZIndex: js.UndefOr[scala.Boolean] = js.undefined,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    hideSingleBase: js.UndefOr[scala.Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    onbaselayerchange: /* event */ leafletLib.leafletMod.LayersControlEvent => scala.Unit = null,
    onoverlayadd: /* event */ leafletLib.leafletMod.LayersControlEvent => scala.Unit = null,
    onoverlayremove: /* event */ leafletLib.leafletMod.LayersControlEvent => scala.Unit = null,
    position: leafletLib.leafletMod.ControlPosition = null
  ): LayersControlProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(autoZIndex)) __obj.updateDynamic("autoZIndex")(autoZIndex)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(hideSingleBase)) __obj.updateDynamic("hideSingleBase")(hideSingleBase)
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (onbaselayerchange != null) __obj.updateDynamic("onbaselayerchange")(js.Any.fromFunction1(onbaselayerchange))
    if (onoverlayadd != null) __obj.updateDynamic("onoverlayadd")(js.Any.fromFunction1(onoverlayadd))
    if (onoverlayremove != null) __obj.updateDynamic("onoverlayremove")(js.Any.fromFunction1(onoverlayremove))
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[LayersControlProps]
  }
}

