package typings.reactLeaflet.mod

import typings.leaflet.mod.DragEndEvent
import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.LeafletMouseEvent
import typings.leaflet.mod.PopupEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerEvents extends StObject {
  
  var onadd: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  
  var onclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  
  var oncontextmenu: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  
  var ondblclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  
  var ondrag: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  
  var ondragend: js.UndefOr[js.Function1[/* event */ DragEndEvent, Unit]] = js.undefined
  
  var ondragstart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  
  var onmousedown: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  
  var onmouseout: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  
  var onmouseover: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  
  var onmove: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  
  var onpopupclose: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.undefined
  
  var onpopupopen: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.undefined
  
  var onremove: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
}
object MarkerEvents {
  
  @scala.inline
  def apply(): MarkerEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerEvents]
  }
  
  @scala.inline
  implicit class MarkerEventsMutableBuilder[Self <: MarkerEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnadd(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onadd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnaddUndefined: Self = StObject.set(x, "onadd", js.undefined)
    
    @scala.inline
    def setOnclick(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    @scala.inline
    def setOncontextmenu(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "oncontextmenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOncontextmenuUndefined: Self = StObject.set(x, "oncontextmenu", js.undefined)
    
    @scala.inline
    def setOndblclick(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "ondblclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
    
    @scala.inline
    def setOndrag(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "ondrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOndragUndefined: Self = StObject.set(x, "ondrag", js.undefined)
    
    @scala.inline
    def setOndragend(value: /* event */ DragEndEvent => Unit): Self = StObject.set(x, "ondragend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOndragendUndefined: Self = StObject.set(x, "ondragend", js.undefined)
    
    @scala.inline
    def setOndragstart(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "ondragstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOndragstartUndefined: Self = StObject.set(x, "ondragstart", js.undefined)
    
    @scala.inline
    def setOnmousedown(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onmousedown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmousedownUndefined: Self = StObject.set(x, "onmousedown", js.undefined)
    
    @scala.inline
    def setOnmouseout(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
    
    @scala.inline
    def setOnmouseover(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
    
    @scala.inline
    def setOnmove(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onmove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmoveUndefined: Self = StObject.set(x, "onmove", js.undefined)
    
    @scala.inline
    def setOnpopupclose(value: /* event */ PopupEvent => Unit): Self = StObject.set(x, "onpopupclose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnpopupcloseUndefined: Self = StObject.set(x, "onpopupclose", js.undefined)
    
    @scala.inline
    def setOnpopupopen(value: /* event */ PopupEvent => Unit): Self = StObject.set(x, "onpopupopen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnpopupopenUndefined: Self = StObject.set(x, "onpopupopen", js.undefined)
    
    @scala.inline
    def setOnremove(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onremove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnremoveUndefined: Self = StObject.set(x, "onremove", js.undefined)
  }
}
