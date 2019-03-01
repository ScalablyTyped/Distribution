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
    onload: js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit] = null,
    onloading: js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit] = null,
    ontileerror: js.Function1[/* event */ leafletLib.leafletMod.TileEvent, scala.Unit] = null,
    ontileload: js.Function1[/* event */ leafletLib.leafletMod.TileEvent, scala.Unit] = null,
    ontileloadstart: js.Function1[/* event */ leafletLib.leafletMod.TileEvent, scala.Unit] = null,
    ontileunload: js.Function1[/* event */ leafletLib.leafletMod.TileEvent, scala.Unit] = null
  ): TileLayerEvents = {
    val __obj = js.Dynamic.literal()
    if (onload != null) __obj.updateDynamic("onload")(onload)
    if (onloading != null) __obj.updateDynamic("onloading")(onloading)
    if (ontileerror != null) __obj.updateDynamic("ontileerror")(ontileerror)
    if (ontileload != null) __obj.updateDynamic("ontileload")(ontileload)
    if (ontileloadstart != null) __obj.updateDynamic("ontileloadstart")(ontileloadstart)
    if (ontileunload != null) __obj.updateDynamic("ontileunload")(ontileunload)
    __obj.asInstanceOf[TileLayerEvents]
  }
}

