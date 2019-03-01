package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersControlEvents extends js.Object {
  var onbaselayerchange: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LayersControlEvent, scala.Unit]] = js.undefined
  var onoverlayadd: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LayersControlEvent, scala.Unit]] = js.undefined
  var onoverlayremove: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LayersControlEvent, scala.Unit]] = js.undefined
}

object LayersControlEvents {
  @scala.inline
  def apply(
    onbaselayerchange: js.Function1[/* event */ leafletLib.leafletMod.LayersControlEvent, scala.Unit] = null,
    onoverlayadd: js.Function1[/* event */ leafletLib.leafletMod.LayersControlEvent, scala.Unit] = null,
    onoverlayremove: js.Function1[/* event */ leafletLib.leafletMod.LayersControlEvent, scala.Unit] = null
  ): LayersControlEvents = {
    val __obj = js.Dynamic.literal()
    if (onbaselayerchange != null) __obj.updateDynamic("onbaselayerchange")(onbaselayerchange)
    if (onoverlayadd != null) __obj.updateDynamic("onoverlayadd")(onoverlayadd)
    if (onoverlayremove != null) __obj.updateDynamic("onoverlayremove")(onoverlayremove)
    __obj.asInstanceOf[LayersControlEvents]
  }
}

