package typings.reactDashLeaflet.reactDashLeafletMod

import typings.leaflet.leafletMod.DragEndEvent
import typings.leaflet.leafletMod.ErrorEvent
import typings.leaflet.leafletMod.LayerEvent
import typings.leaflet.leafletMod.LayersControlEvent
import typings.leaflet.leafletMod.LeafletEvent
import typings.leaflet.leafletMod.LeafletMouseEvent
import typings.leaflet.leafletMod.LocationEvent
import typings.leaflet.leafletMod.PopupEvent
import typings.leaflet.leafletMod.ResizeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapEvents extends js.Object {
  var onautopanstart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onbaselayerchange: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.undefined
  var onblur: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var oncontextmenu: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var ondblclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var ondrag: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var ondragend: js.UndefOr[js.Function1[/* event */ DragEndEvent, Unit]] = js.undefined
  var ondragstart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onfocus: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onlayeradd: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.undefined
  var onlayerremove: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.undefined
  var onload: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onlocationerror: js.UndefOr[js.Function1[/* event */ ErrorEvent, Unit]] = js.undefined
  var onlocationfound: js.UndefOr[js.Function1[/* event */ LocationEvent, Unit]] = js.undefined
  var onmousedown: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onmousemove: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onmouseout: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onmouseover: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onmouseup: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onmove: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onmoveend: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onmovestart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onoverlayadd: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.undefined
  var onoverlayremove: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.undefined
  var onpopupclose: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.undefined
  var onpopupopen: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.undefined
  var onpreclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  var onresize: js.UndefOr[js.Function1[/* event */ ResizeEvent, Unit]] = js.undefined
  var onunload: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onviewreset: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onzoomend: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onzoomlevelschange: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  var onzoomstart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
}

object MapEvents {
  @scala.inline
  def apply(
    onautopanstart: /* event */ LeafletEvent => Unit = null,
    onbaselayerchange: /* event */ LayersControlEvent => Unit = null,
    onblur: /* event */ LeafletEvent => Unit = null,
    onclick: /* event */ LeafletMouseEvent => Unit = null,
    oncontextmenu: /* event */ LeafletMouseEvent => Unit = null,
    ondblclick: /* event */ LeafletMouseEvent => Unit = null,
    ondrag: /* event */ LeafletEvent => Unit = null,
    ondragend: /* event */ DragEndEvent => Unit = null,
    ondragstart: /* event */ LeafletEvent => Unit = null,
    onfocus: /* event */ LeafletEvent => Unit = null,
    onlayeradd: /* event */ LayerEvent => Unit = null,
    onlayerremove: /* event */ LayerEvent => Unit = null,
    onload: /* event */ LeafletEvent => Unit = null,
    onlocationerror: /* event */ ErrorEvent => Unit = null,
    onlocationfound: /* event */ LocationEvent => Unit = null,
    onmousedown: /* event */ LeafletMouseEvent => Unit = null,
    onmousemove: /* event */ LeafletMouseEvent => Unit = null,
    onmouseout: /* event */ LeafletMouseEvent => Unit = null,
    onmouseover: /* event */ LeafletMouseEvent => Unit = null,
    onmouseup: /* event */ LeafletMouseEvent => Unit = null,
    onmove: /* event */ LeafletEvent => Unit = null,
    onmoveend: /* event */ LeafletEvent => Unit = null,
    onmovestart: /* event */ LeafletEvent => Unit = null,
    onoverlayadd: /* event */ LayersControlEvent => Unit = null,
    onoverlayremove: /* event */ LayersControlEvent => Unit = null,
    onpopupclose: /* event */ PopupEvent => Unit = null,
    onpopupopen: /* event */ PopupEvent => Unit = null,
    onpreclick: /* event */ LeafletMouseEvent => Unit = null,
    onresize: /* event */ ResizeEvent => Unit = null,
    onunload: /* event */ LeafletEvent => Unit = null,
    onviewreset: /* event */ LeafletEvent => Unit = null,
    onzoomend: /* event */ LeafletEvent => Unit = null,
    onzoomlevelschange: /* event */ LeafletEvent => Unit = null,
    onzoomstart: /* event */ LeafletEvent => Unit = null
  ): MapEvents = {
    val __obj = js.Dynamic.literal()
    if (onautopanstart != null) __obj.updateDynamic("onautopanstart")(js.Any.fromFunction1(onautopanstart))
    if (onbaselayerchange != null) __obj.updateDynamic("onbaselayerchange")(js.Any.fromFunction1(onbaselayerchange))
    if (onblur != null) __obj.updateDynamic("onblur")(js.Any.fromFunction1(onblur))
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1(onclick))
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(js.Any.fromFunction1(oncontextmenu))
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(js.Any.fromFunction1(ondblclick))
    if (ondrag != null) __obj.updateDynamic("ondrag")(js.Any.fromFunction1(ondrag))
    if (ondragend != null) __obj.updateDynamic("ondragend")(js.Any.fromFunction1(ondragend))
    if (ondragstart != null) __obj.updateDynamic("ondragstart")(js.Any.fromFunction1(ondragstart))
    if (onfocus != null) __obj.updateDynamic("onfocus")(js.Any.fromFunction1(onfocus))
    if (onlayeradd != null) __obj.updateDynamic("onlayeradd")(js.Any.fromFunction1(onlayeradd))
    if (onlayerremove != null) __obj.updateDynamic("onlayerremove")(js.Any.fromFunction1(onlayerremove))
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1(onload))
    if (onlocationerror != null) __obj.updateDynamic("onlocationerror")(js.Any.fromFunction1(onlocationerror))
    if (onlocationfound != null) __obj.updateDynamic("onlocationfound")(js.Any.fromFunction1(onlocationfound))
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(js.Any.fromFunction1(onmousedown))
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(js.Any.fromFunction1(onmousemove))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1(onmouseout))
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(js.Any.fromFunction1(onmouseover))
    if (onmouseup != null) __obj.updateDynamic("onmouseup")(js.Any.fromFunction1(onmouseup))
    if (onmove != null) __obj.updateDynamic("onmove")(js.Any.fromFunction1(onmove))
    if (onmoveend != null) __obj.updateDynamic("onmoveend")(js.Any.fromFunction1(onmoveend))
    if (onmovestart != null) __obj.updateDynamic("onmovestart")(js.Any.fromFunction1(onmovestart))
    if (onoverlayadd != null) __obj.updateDynamic("onoverlayadd")(js.Any.fromFunction1(onoverlayadd))
    if (onoverlayremove != null) __obj.updateDynamic("onoverlayremove")(js.Any.fromFunction1(onoverlayremove))
    if (onpopupclose != null) __obj.updateDynamic("onpopupclose")(js.Any.fromFunction1(onpopupclose))
    if (onpopupopen != null) __obj.updateDynamic("onpopupopen")(js.Any.fromFunction1(onpopupopen))
    if (onpreclick != null) __obj.updateDynamic("onpreclick")(js.Any.fromFunction1(onpreclick))
    if (onresize != null) __obj.updateDynamic("onresize")(js.Any.fromFunction1(onresize))
    if (onunload != null) __obj.updateDynamic("onunload")(js.Any.fromFunction1(onunload))
    if (onviewreset != null) __obj.updateDynamic("onviewreset")(js.Any.fromFunction1(onviewreset))
    if (onzoomend != null) __obj.updateDynamic("onzoomend")(js.Any.fromFunction1(onzoomend))
    if (onzoomlevelschange != null) __obj.updateDynamic("onzoomlevelschange")(js.Any.fromFunction1(onzoomlevelschange))
    if (onzoomstart != null) __obj.updateDynamic("onzoomstart")(js.Any.fromFunction1(onzoomstart))
    __obj.asInstanceOf[MapEvents]
  }
}

