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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapEvents extends StObject {
  
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
  
  inline def apply(): MapEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapEvents]
  }
  
  extension [Self <: MapEvents](x: Self) {
    
    inline def setOnautopanstart(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onautopanstart", js.Any.fromFunction1(value))
    
    inline def setOnautopanstartUndefined: Self = StObject.set(x, "onautopanstart", js.undefined)
    
    inline def setOnbaselayerchange(value: /* event */ LayersControlEvent => Unit): Self = StObject.set(x, "onbaselayerchange", js.Any.fromFunction1(value))
    
    inline def setOnbaselayerchangeUndefined: Self = StObject.set(x, "onbaselayerchange", js.undefined)
    
    inline def setOnblur(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onblur", js.Any.fromFunction1(value))
    
    inline def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
    
    inline def setOnclick(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    inline def setOncontextmenu(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "oncontextmenu", js.Any.fromFunction1(value))
    
    inline def setOncontextmenuUndefined: Self = StObject.set(x, "oncontextmenu", js.undefined)
    
    inline def setOndblclick(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "ondblclick", js.Any.fromFunction1(value))
    
    inline def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
    
    inline def setOndrag(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "ondrag", js.Any.fromFunction1(value))
    
    inline def setOndragUndefined: Self = StObject.set(x, "ondrag", js.undefined)
    
    inline def setOndragend(value: /* event */ DragEndEvent => Unit): Self = StObject.set(x, "ondragend", js.Any.fromFunction1(value))
    
    inline def setOndragendUndefined: Self = StObject.set(x, "ondragend", js.undefined)
    
    inline def setOndragstart(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "ondragstart", js.Any.fromFunction1(value))
    
    inline def setOndragstartUndefined: Self = StObject.set(x, "ondragstart", js.undefined)
    
    inline def setOnfocus(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onfocus", js.Any.fromFunction1(value))
    
    inline def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
    
    inline def setOnlayeradd(value: /* event */ LayerEvent => Unit): Self = StObject.set(x, "onlayeradd", js.Any.fromFunction1(value))
    
    inline def setOnlayeraddUndefined: Self = StObject.set(x, "onlayeradd", js.undefined)
    
    inline def setOnlayerremove(value: /* event */ LayerEvent => Unit): Self = StObject.set(x, "onlayerremove", js.Any.fromFunction1(value))
    
    inline def setOnlayerremoveUndefined: Self = StObject.set(x, "onlayerremove", js.undefined)
    
    inline def setOnload(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
    
    inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
    
    inline def setOnlocationerror(value: /* event */ ErrorEvent => Unit): Self = StObject.set(x, "onlocationerror", js.Any.fromFunction1(value))
    
    inline def setOnlocationerrorUndefined: Self = StObject.set(x, "onlocationerror", js.undefined)
    
    inline def setOnlocationfound(value: /* event */ LocationEvent => Unit): Self = StObject.set(x, "onlocationfound", js.Any.fromFunction1(value))
    
    inline def setOnlocationfoundUndefined: Self = StObject.set(x, "onlocationfound", js.undefined)
    
    inline def setOnmousedown(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onmousedown", js.Any.fromFunction1(value))
    
    inline def setOnmousedownUndefined: Self = StObject.set(x, "onmousedown", js.undefined)
    
    inline def setOnmousemove(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onmousemove", js.Any.fromFunction1(value))
    
    inline def setOnmousemoveUndefined: Self = StObject.set(x, "onmousemove", js.undefined)
    
    inline def setOnmouseout(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1(value))
    
    inline def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
    
    inline def setOnmouseover(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1(value))
    
    inline def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
    
    inline def setOnmouseup(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onmouseup", js.Any.fromFunction1(value))
    
    inline def setOnmouseupUndefined: Self = StObject.set(x, "onmouseup", js.undefined)
    
    inline def setOnmove(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onmove", js.Any.fromFunction1(value))
    
    inline def setOnmoveUndefined: Self = StObject.set(x, "onmove", js.undefined)
    
    inline def setOnmoveend(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onmoveend", js.Any.fromFunction1(value))
    
    inline def setOnmoveendUndefined: Self = StObject.set(x, "onmoveend", js.undefined)
    
    inline def setOnmovestart(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onmovestart", js.Any.fromFunction1(value))
    
    inline def setOnmovestartUndefined: Self = StObject.set(x, "onmovestart", js.undefined)
    
    inline def setOnoverlayadd(value: /* event */ LayersControlEvent => Unit): Self = StObject.set(x, "onoverlayadd", js.Any.fromFunction1(value))
    
    inline def setOnoverlayaddUndefined: Self = StObject.set(x, "onoverlayadd", js.undefined)
    
    inline def setOnoverlayremove(value: /* event */ LayersControlEvent => Unit): Self = StObject.set(x, "onoverlayremove", js.Any.fromFunction1(value))
    
    inline def setOnoverlayremoveUndefined: Self = StObject.set(x, "onoverlayremove", js.undefined)
    
    inline def setOnpopupclose(value: /* event */ PopupEvent => Unit): Self = StObject.set(x, "onpopupclose", js.Any.fromFunction1(value))
    
    inline def setOnpopupcloseUndefined: Self = StObject.set(x, "onpopupclose", js.undefined)
    
    inline def setOnpopupopen(value: /* event */ PopupEvent => Unit): Self = StObject.set(x, "onpopupopen", js.Any.fromFunction1(value))
    
    inline def setOnpopupopenUndefined: Self = StObject.set(x, "onpopupopen", js.undefined)
    
    inline def setOnpreclick(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onpreclick", js.Any.fromFunction1(value))
    
    inline def setOnpreclickUndefined: Self = StObject.set(x, "onpreclick", js.undefined)
    
    inline def setOnresize(value: /* event */ ResizeEvent => Unit): Self = StObject.set(x, "onresize", js.Any.fromFunction1(value))
    
    inline def setOnresizeUndefined: Self = StObject.set(x, "onresize", js.undefined)
    
    inline def setOnunload(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onunload", js.Any.fromFunction1(value))
    
    inline def setOnunloadUndefined: Self = StObject.set(x, "onunload", js.undefined)
    
    inline def setOnviewreset(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onviewreset", js.Any.fromFunction1(value))
    
    inline def setOnviewresetUndefined: Self = StObject.set(x, "onviewreset", js.undefined)
    
    inline def setOnzoomend(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onzoomend", js.Any.fromFunction1(value))
    
    inline def setOnzoomendUndefined: Self = StObject.set(x, "onzoomend", js.undefined)
    
    inline def setOnzoomlevelschange(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onzoomlevelschange", js.Any.fromFunction1(value))
    
    inline def setOnzoomlevelschangeUndefined: Self = StObject.set(x, "onzoomlevelschange", js.undefined)
    
    inline def setOnzoomstart(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onzoomstart", js.Any.fromFunction1(value))
    
    inline def setOnzoomstartUndefined: Self = StObject.set(x, "onzoomstart", js.undefined)
  }
}
