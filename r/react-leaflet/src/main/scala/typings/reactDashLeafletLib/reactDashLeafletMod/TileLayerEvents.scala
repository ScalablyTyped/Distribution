package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileLayerEvents extends js.Object {
  var onload: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var onloading: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var ontileerror: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.TileEvent, scala.Unit]] = js.undefined
  var ontileload: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.TileEvent, scala.Unit]] = js.undefined
  var ontileloadstart: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.TileEvent, scala.Unit]] = js.undefined
  var ontileunload: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.TileEvent, scala.Unit]] = js.undefined
}

object TileLayerEvents {
  @scala.inline
  def apply(
    onload: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onloading: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    ontileerror: /* event */ leafletLib.leafletMod.TileEvent => scala.Unit = null,
    ontileload: /* event */ leafletLib.leafletMod.TileEvent => scala.Unit = null,
    ontileloadstart: /* event */ leafletLib.leafletMod.TileEvent => scala.Unit = null,
    ontileunload: /* event */ leafletLib.leafletMod.TileEvent => scala.Unit = null
  ): TileLayerEvents = {
    val __obj = js.Dynamic.literal()
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1(onload))
    if (onloading != null) __obj.updateDynamic("onloading")(js.Any.fromFunction1(onloading))
    if (ontileerror != null) __obj.updateDynamic("ontileerror")(js.Any.fromFunction1(ontileerror))
    if (ontileload != null) __obj.updateDynamic("ontileload")(js.Any.fromFunction1(ontileload))
    if (ontileloadstart != null) __obj.updateDynamic("ontileloadstart")(js.Any.fromFunction1(ontileloadstart))
    if (ontileunload != null) __obj.updateDynamic("ontileunload")(js.Any.fromFunction1(ontileunload))
    __obj.asInstanceOf[TileLayerEvents]
  }
}

