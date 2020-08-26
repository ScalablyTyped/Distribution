package typings.reactLeaflet.mod

import typings.leaflet.mod.DragEndEvent
import typings.leaflet.mod.ErrorEvent
import typings.leaflet.mod.LayerEvent
import typings.leaflet.mod.LayersControlEvent
import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.LeafletMouseEvent
import typings.leaflet.mod.LocationEvent
import typings.leaflet.mod.PopupEvent
import typings.leaflet.mod.ResizeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapEvents extends js.Object {
  var onautopanstart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var onbaselayerchange: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.native
  var onblur: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var onclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  var oncontextmenu: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  var ondblclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  var ondrag: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var ondragend: js.UndefOr[js.Function1[/* event */ DragEndEvent, Unit]] = js.native
  var ondragstart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var onfocus: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var onlayeradd: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.native
  var onlayerremove: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.native
  var onload: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var onlocationerror: js.UndefOr[js.Function1[/* event */ ErrorEvent, Unit]] = js.native
  var onlocationfound: js.UndefOr[js.Function1[/* event */ LocationEvent, Unit]] = js.native
  var onmousedown: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  var onmousemove: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  var onmouseout: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  var onmouseover: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  var onmouseup: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  var onmove: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var onmoveend: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var onmovestart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var onoverlayadd: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.native
  var onoverlayremove: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.native
  var onpopupclose: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.native
  var onpopupopen: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.native
  var onpreclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  var onresize: js.UndefOr[js.Function1[/* event */ ResizeEvent, Unit]] = js.native
  var onunload: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var onviewreset: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var onzoomend: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var onzoomlevelschange: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  var onzoomstart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
}

object MapEvents {
  @scala.inline
  def apply(): MapEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapEvents]
  }
  @scala.inline
  implicit class MapEventsOps[Self <: MapEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnautopanstart(value: /* event */ LeafletEvent => Unit): Self = this.set("onautopanstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnautopanstart: Self = this.set("onautopanstart", js.undefined)
    @scala.inline
    def setOnbaselayerchange(value: /* event */ LayersControlEvent => Unit): Self = this.set("onbaselayerchange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnbaselayerchange: Self = this.set("onbaselayerchange", js.undefined)
    @scala.inline
    def setOnblur(value: /* event */ LeafletEvent => Unit): Self = this.set("onblur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnblur: Self = this.set("onblur", js.undefined)
    @scala.inline
    def setOnclick(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("onclick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    @scala.inline
    def setOncontextmenu(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("oncontextmenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOncontextmenu: Self = this.set("oncontextmenu", js.undefined)
    @scala.inline
    def setOndblclick(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("ondblclick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOndblclick: Self = this.set("ondblclick", js.undefined)
    @scala.inline
    def setOndrag(value: /* event */ LeafletEvent => Unit): Self = this.set("ondrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOndrag: Self = this.set("ondrag", js.undefined)
    @scala.inline
    def setOndragend(value: /* event */ DragEndEvent => Unit): Self = this.set("ondragend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOndragend: Self = this.set("ondragend", js.undefined)
    @scala.inline
    def setOndragstart(value: /* event */ LeafletEvent => Unit): Self = this.set("ondragstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOndragstart: Self = this.set("ondragstart", js.undefined)
    @scala.inline
    def setOnfocus(value: /* event */ LeafletEvent => Unit): Self = this.set("onfocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnfocus: Self = this.set("onfocus", js.undefined)
    @scala.inline
    def setOnlayeradd(value: /* event */ LayerEvent => Unit): Self = this.set("onlayeradd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnlayeradd: Self = this.set("onlayeradd", js.undefined)
    @scala.inline
    def setOnlayerremove(value: /* event */ LayerEvent => Unit): Self = this.set("onlayerremove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnlayerremove: Self = this.set("onlayerremove", js.undefined)
    @scala.inline
    def setOnload(value: /* event */ LeafletEvent => Unit): Self = this.set("onload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    @scala.inline
    def setOnlocationerror(value: /* event */ ErrorEvent => Unit): Self = this.set("onlocationerror", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnlocationerror: Self = this.set("onlocationerror", js.undefined)
    @scala.inline
    def setOnlocationfound(value: /* event */ LocationEvent => Unit): Self = this.set("onlocationfound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnlocationfound: Self = this.set("onlocationfound", js.undefined)
    @scala.inline
    def setOnmousedown(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("onmousedown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmousedown: Self = this.set("onmousedown", js.undefined)
    @scala.inline
    def setOnmousemove(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("onmousemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmousemove: Self = this.set("onmousemove", js.undefined)
    @scala.inline
    def setOnmouseout(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("onmouseout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmouseout: Self = this.set("onmouseout", js.undefined)
    @scala.inline
    def setOnmouseover(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("onmouseover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmouseover: Self = this.set("onmouseover", js.undefined)
    @scala.inline
    def setOnmouseup(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("onmouseup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmouseup: Self = this.set("onmouseup", js.undefined)
    @scala.inline
    def setOnmove(value: /* event */ LeafletEvent => Unit): Self = this.set("onmove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmove: Self = this.set("onmove", js.undefined)
    @scala.inline
    def setOnmoveend(value: /* event */ LeafletEvent => Unit): Self = this.set("onmoveend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmoveend: Self = this.set("onmoveend", js.undefined)
    @scala.inline
    def setOnmovestart(value: /* event */ LeafletEvent => Unit): Self = this.set("onmovestart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmovestart: Self = this.set("onmovestart", js.undefined)
    @scala.inline
    def setOnoverlayadd(value: /* event */ LayersControlEvent => Unit): Self = this.set("onoverlayadd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnoverlayadd: Self = this.set("onoverlayadd", js.undefined)
    @scala.inline
    def setOnoverlayremove(value: /* event */ LayersControlEvent => Unit): Self = this.set("onoverlayremove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnoverlayremove: Self = this.set("onoverlayremove", js.undefined)
    @scala.inline
    def setOnpopupclose(value: /* event */ PopupEvent => Unit): Self = this.set("onpopupclose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnpopupclose: Self = this.set("onpopupclose", js.undefined)
    @scala.inline
    def setOnpopupopen(value: /* event */ PopupEvent => Unit): Self = this.set("onpopupopen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnpopupopen: Self = this.set("onpopupopen", js.undefined)
    @scala.inline
    def setOnpreclick(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("onpreclick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnpreclick: Self = this.set("onpreclick", js.undefined)
    @scala.inline
    def setOnresize(value: /* event */ ResizeEvent => Unit): Self = this.set("onresize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnresize: Self = this.set("onresize", js.undefined)
    @scala.inline
    def setOnunload(value: /* event */ LeafletEvent => Unit): Self = this.set("onunload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnunload: Self = this.set("onunload", js.undefined)
    @scala.inline
    def setOnviewreset(value: /* event */ LeafletEvent => Unit): Self = this.set("onviewreset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnviewreset: Self = this.set("onviewreset", js.undefined)
    @scala.inline
    def setOnzoomend(value: /* event */ LeafletEvent => Unit): Self = this.set("onzoomend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnzoomend: Self = this.set("onzoomend", js.undefined)
    @scala.inline
    def setOnzoomlevelschange(value: /* event */ LeafletEvent => Unit): Self = this.set("onzoomlevelschange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnzoomlevelschange: Self = this.set("onzoomlevelschange", js.undefined)
    @scala.inline
    def setOnzoomstart(value: /* event */ LeafletEvent => Unit): Self = this.set("onzoomstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnzoomstart: Self = this.set("onzoomstart", js.undefined)
  }
  
}

