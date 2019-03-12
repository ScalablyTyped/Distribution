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
    onclick: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    oncontextmenu: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    ondblclick: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    onlayeradd: /* event */ leafletLib.leafletMod.LayerEvent => scala.Unit = null,
    onlayerremove: /* event */ leafletLib.leafletMod.LayerEvent => scala.Unit = null,
    onmouseout: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    onmouseover: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null
  ): FeatureGroupEvents = {
    val __obj = js.Dynamic.literal()
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1(onclick))
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(js.Any.fromFunction1(oncontextmenu))
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(js.Any.fromFunction1(ondblclick))
    if (onlayeradd != null) __obj.updateDynamic("onlayeradd")(js.Any.fromFunction1(onlayeradd))
    if (onlayerremove != null) __obj.updateDynamic("onlayerremove")(js.Any.fromFunction1(onlayerremove))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1(onmouseout))
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(js.Any.fromFunction1(onmouseover))
    __obj.asInstanceOf[FeatureGroupEvents]
  }
}

