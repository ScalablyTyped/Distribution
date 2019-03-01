package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathEvents extends js.Object {
  var onadd: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var onclick: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var oncontextmenu: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var ondblclick: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var onmousedown: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var onmouseout: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var onmouseover: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var onpopupclose: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.PopupEvent, scala.Unit]] = js.undefined
  var onpopupopen: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.PopupEvent, scala.Unit]] = js.undefined
  var onremove: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
}

object PathEvents {
  @scala.inline
  def apply(
    onadd: js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit] = null,
    onclick: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    oncontextmenu: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    ondblclick: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    onmousedown: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    onmouseout: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    onmouseover: js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit] = null,
    onpopupclose: js.Function1[/* event */ leafletLib.leafletMod.PopupEvent, scala.Unit] = null,
    onpopupopen: js.Function1[/* event */ leafletLib.leafletMod.PopupEvent, scala.Unit] = null,
    onremove: js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit] = null
  ): PathEvents = {
    val __obj = js.Dynamic.literal()
    if (onadd != null) __obj.updateDynamic("onadd")(onadd)
    if (onclick != null) __obj.updateDynamic("onclick")(onclick)
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(oncontextmenu)
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(ondblclick)
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(onmousedown)
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(onmouseout)
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(onmouseover)
    if (onpopupclose != null) __obj.updateDynamic("onpopupclose")(onpopupclose)
    if (onpopupopen != null) __obj.updateDynamic("onpopupopen")(onpopupopen)
    if (onremove != null) __obj.updateDynamic("onremove")(onremove)
    __obj.asInstanceOf[PathEvents]
  }
}

