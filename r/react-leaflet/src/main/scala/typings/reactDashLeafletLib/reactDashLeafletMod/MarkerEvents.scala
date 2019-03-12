package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerEvents extends js.Object {
  var onadd: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var onclick: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var oncontextmenu: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var ondblclick: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var ondrag: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var ondragend: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.DragEndEvent, scala.Unit]] = js.undefined
  var ondragstart: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var onmousedown: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var onmouseout: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var onmouseover: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var onmove: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var onpopupclose: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.PopupEvent, scala.Unit]] = js.undefined
  var onpopupopen: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.PopupEvent, scala.Unit]] = js.undefined
  var onremove: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
}

object MarkerEvents {
  @scala.inline
  def apply(
    onadd: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onclick: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    oncontextmenu: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    ondblclick: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    ondrag: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    ondragend: /* event */ leafletLib.leafletMod.DragEndEvent => scala.Unit = null,
    ondragstart: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onmousedown: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    onmouseout: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    onmouseover: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    onmove: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onpopupclose: /* event */ leafletLib.leafletMod.PopupEvent => scala.Unit = null,
    onpopupopen: /* event */ leafletLib.leafletMod.PopupEvent => scala.Unit = null,
    onremove: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null
  ): MarkerEvents = {
    val __obj = js.Dynamic.literal()
    if (onadd != null) __obj.updateDynamic("onadd")(js.Any.fromFunction1(onadd))
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1(onclick))
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(js.Any.fromFunction1(oncontextmenu))
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(js.Any.fromFunction1(ondblclick))
    if (ondrag != null) __obj.updateDynamic("ondrag")(js.Any.fromFunction1(ondrag))
    if (ondragend != null) __obj.updateDynamic("ondragend")(js.Any.fromFunction1(ondragend))
    if (ondragstart != null) __obj.updateDynamic("ondragstart")(js.Any.fromFunction1(ondragstart))
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(js.Any.fromFunction1(onmousedown))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1(onmouseout))
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(js.Any.fromFunction1(onmouseover))
    if (onmove != null) __obj.updateDynamic("onmove")(js.Any.fromFunction1(onmove))
    if (onpopupclose != null) __obj.updateDynamic("onpopupclose")(js.Any.fromFunction1(onpopupclose))
    if (onpopupopen != null) __obj.updateDynamic("onpopupopen")(js.Any.fromFunction1(onpopupopen))
    if (onremove != null) __obj.updateDynamic("onremove")(js.Any.fromFunction1(onremove))
    __obj.asInstanceOf[MarkerEvents]
  }
}

