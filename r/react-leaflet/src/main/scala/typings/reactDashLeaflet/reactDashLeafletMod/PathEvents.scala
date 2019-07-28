package typings.reactDashLeaflet.reactDashLeafletMod

import typings.leaflet.leafletMod.LeafletEvent
import typings.leaflet.leafletMod.LeafletMouseEvent
import typings.leaflet.leafletMod.PopupEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathEvents extends js.Object {
  var onadd: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var oncontextmenu: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var ondblclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onmousedown: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onmouseout: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onmouseover: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onpopupclose: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.undefined
  var onpopupopen: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.undefined
  var onremove: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
}

object PathEvents {
  @scala.inline
  def apply(
    onadd: /* event */ LeafletEvent => Unit = null,
    onclick: /* event */ LeafletMouseEvent => Unit = null,
    oncontextmenu: /* event */ LeafletMouseEvent => Unit = null,
    ondblclick: /* event */ LeafletMouseEvent => Unit = null,
    onmousedown: /* event */ LeafletMouseEvent => Unit = null,
    onmouseout: /* event */ LeafletMouseEvent => Unit = null,
    onmouseover: /* event */ LeafletMouseEvent => Unit = null,
    onpopupclose: /* event */ PopupEvent => Unit = null,
    onpopupopen: /* event */ PopupEvent => Unit = null,
    onremove: /* event */ LeafletEvent => Unit = null
  ): PathEvents = {
    val __obj = js.Dynamic.literal()
    if (onadd != null) __obj.updateDynamic("onadd")(js.Any.fromFunction1(onadd))
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1(onclick))
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(js.Any.fromFunction1(oncontextmenu))
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(js.Any.fromFunction1(ondblclick))
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(js.Any.fromFunction1(onmousedown))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1(onmouseout))
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(js.Any.fromFunction1(onmouseover))
    if (onpopupclose != null) __obj.updateDynamic("onpopupclose")(js.Any.fromFunction1(onpopupclose))
    if (onpopupopen != null) __obj.updateDynamic("onpopupopen")(js.Any.fromFunction1(onpopupopen))
    if (onremove != null) __obj.updateDynamic("onremove")(js.Any.fromFunction1(onremove))
    __obj.asInstanceOf[PathEvents]
  }
}

