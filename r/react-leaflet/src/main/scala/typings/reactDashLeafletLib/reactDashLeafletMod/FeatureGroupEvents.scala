package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureGroupEvents extends js.Object {
  var onclick: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var oncontextmenu: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var ondblclick: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var onlayeradd: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LayerEvent, scala.Unit]] = js.undefined
  var onlayerremove: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LayerEvent, scala.Unit]] = js.undefined
  var onmouseout: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var onmouseover: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
}

object FeatureGroupEvents {
  @scala.inline
  def apply(
    onclick: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    oncontextmenu: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    ondblclick: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    onlayeradd: js.Function1[/* event */ leafletLib.leafletMod.LayerEvent, scala.Unit] = null,
    onlayerremove: js.Function1[/* event */ leafletLib.leafletMod.LayerEvent, scala.Unit] = null,
    onmouseout: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    onmouseover: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null
  ): FeatureGroupEvents = {
    val __obj = js.Dynamic.literal()
    if (onclick != null) __obj.updateDynamic("onclick")(onclick)
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(oncontextmenu)
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(ondblclick)
    if (onlayeradd != null) __obj.updateDynamic("onlayeradd")(onlayeradd)
    if (onlayerremove != null) __obj.updateDynamic("onlayerremove")(onlayerremove)
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(onmouseout)
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(onmouseover)
    __obj.asInstanceOf[FeatureGroupEvents]
  }
}

