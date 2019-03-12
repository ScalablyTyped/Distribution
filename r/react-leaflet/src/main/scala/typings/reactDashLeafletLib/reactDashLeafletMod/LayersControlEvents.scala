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
    onbaselayerchange: /* event */ leafletLib.leafletMod.LayersControlEvent => scala.Unit = null,
    onoverlayadd: /* event */ leafletLib.leafletMod.LayersControlEvent => scala.Unit = null,
    onoverlayremove: /* event */ leafletLib.leafletMod.LayersControlEvent => scala.Unit = null
  ): LayersControlEvents = {
    val __obj = js.Dynamic.literal()
    if (onbaselayerchange != null) __obj.updateDynamic("onbaselayerchange")(js.Any.fromFunction1(onbaselayerchange))
    if (onoverlayadd != null) __obj.updateDynamic("onoverlayadd")(js.Any.fromFunction1(onoverlayadd))
    if (onoverlayremove != null) __obj.updateDynamic("onoverlayremove")(js.Any.fromFunction1(onoverlayremove))
    __obj.asInstanceOf[LayersControlEvents]
  }
}

