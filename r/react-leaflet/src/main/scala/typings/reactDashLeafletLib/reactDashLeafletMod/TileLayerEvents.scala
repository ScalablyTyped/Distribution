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

