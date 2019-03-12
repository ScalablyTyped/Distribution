package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapEvents extends js.Object {
  var onautopanstart: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var onbaselayerchange: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LayersControlEvent, scala.Unit]] = js.undefined
  var onblur: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var onclick: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var oncontextmenu: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var ondblclick: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var ondrag: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var ondragend: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.DragEndEvent, scala.Unit]] = js.undefined
  var ondragstart: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var onfocus: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var onlayeradd: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LayerEvent, scala.Unit]] = js.undefined
  var onlayerremove: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LayerEvent, scala.Unit]] = js.undefined
  var onload: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var onlocationerror: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.ErrorEvent, scala.Unit]] = js.undefined
  var onlocationfound: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LocationEvent, scala.Unit]] = js.undefined
  var onmousedown: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var onmousemove: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var onmouseout: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var onmouseover: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var onmouseup: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var onmove: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var onmoveend: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var onmovestart: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var onoverlayadd: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LayersControlEvent, scala.Unit]] = js.undefined
  var onoverlayremove: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LayersControlEvent, scala.Unit]] = js.undefined
  var onpopupclose: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.PopupEvent, scala.Unit]] = js.undefined
  var onpopupopen: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.PopupEvent, scala.Unit]] = js.undefined
  var onpreclick: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletMouseEvent, scala.Unit]] = js.undefined
  var onresize: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.ResizeEvent, scala.Unit]] = js.undefined
  var onunload: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var onviewreset: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var onzoomend: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var onzoomlevelschange: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
  var onzoomstart: js.UndefOr[js.Function1[/* event */ leafletLib.leafletMod.LeafletEvent, scala.Unit]] = js.undefined
}

object MapEvents {
  @scala.inline
  def apply(
    onautopanstart: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onbaselayerchange: /* event */ leafletLib.leafletMod.LayersControlEvent => scala.Unit = null,
    onblur: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onclick: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    oncontextmenu: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    ondblclick: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    ondrag: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    ondragend: /* event */ leafletLib.leafletMod.DragEndEvent => scala.Unit = null,
    ondragstart: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onfocus: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onlayeradd: /* event */ leafletLib.leafletMod.LayerEvent => scala.Unit = null,
    onlayerremove: /* event */ leafletLib.leafletMod.LayerEvent => scala.Unit = null,
    onload: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onlocationerror: /* event */ leafletLib.leafletMod.ErrorEvent => scala.Unit = null,
    onlocationfound: /* event */ leafletLib.leafletMod.LocationEvent => scala.Unit = null,
    onmousedown: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    onmousemove: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    onmouseout: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    onmouseover: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    onmouseup: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    onmove: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onmoveend: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onmovestart: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onoverlayadd: /* event */ leafletLib.leafletMod.LayersControlEvent => scala.Unit = null,
    onoverlayremove: /* event */ leafletLib.leafletMod.LayersControlEvent => scala.Unit = null,
    onpopupclose: /* event */ leafletLib.leafletMod.PopupEvent => scala.Unit = null,
    onpopupopen: /* event */ leafletLib.leafletMod.PopupEvent => scala.Unit = null,
    onpreclick: /* event */ leafletLib.leafletMod.LeafletMouseEvent => scala.Unit = null,
    onresize: /* event */ leafletLib.leafletMod.ResizeEvent => scala.Unit = null,
    onunload: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onviewreset: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onzoomend: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onzoomlevelschange: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null,
    onzoomstart: /* event */ leafletLib.leafletMod.LeafletEvent => scala.Unit = null
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

