package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Lifted 1 members from Set(react-leaflet.react-leaflet.MapControlProps) */ trait LayersControlProps
  extends leafletLib.leafletMod.ControlNs.LayersOptions
     with LayersControlEvents {
  var children: Children
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
}

object LayersControlProps {
  @scala.inline
  def apply(
    children: Children,
    autoZIndex: js.UndefOr[scala.Boolean] = js.undefined,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    hideSingleBase: js.UndefOr[scala.Boolean] = js.undefined,
    leaflet: LeafletContext = null,
    onbaselayerchange: js.Function1[/* event */ leafletLib.leafletMod.LayersControlEvent, scala.Unit] = null,
    onoverlayadd: js.Function1[/* event */ leafletLib.leafletMod.LayersControlEvent, scala.Unit] = null,
    onoverlayremove: js.Function1[/* event */ leafletLib.leafletMod.LayersControlEvent, scala.Unit] = null,
    position: leafletLib.leafletMod.ControlPosition = null
  ): LayersControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(autoZIndex)) __obj.updateDynamic("autoZIndex")(autoZIndex)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(hideSingleBase)) __obj.updateDynamic("hideSingleBase")(hideSingleBase)
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet)
    if (onbaselayerchange != null) __obj.updateDynamic("onbaselayerchange")(onbaselayerchange)
    if (onoverlayadd != null) __obj.updateDynamic("onoverlayadd")(onoverlayadd)
    if (onoverlayremove != null) __obj.updateDynamic("onoverlayremove")(onoverlayremove)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[LayersControlProps]
  }
}

