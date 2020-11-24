package typings.reactLeaflet.mod

import typings.leaflet.mod.DragEndEvent
import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.LeafletMouseEvent
import typings.leaflet.mod.PopupEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerEvents extends js.Object {
  
  var onadd: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var onclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var oncontextmenu: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var ondblclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var ondrag: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var ondragend: js.UndefOr[js.Function1[/* event */ DragEndEvent, Unit]] = js.native
  
  var ondragstart: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var onmousedown: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var onmouseout: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var onmouseover: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var onmove: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var onpopupclose: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.native
  
  var onpopupopen: js.UndefOr[js.Function1[/* event */ PopupEvent, Unit]] = js.native
  
  var onremove: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
}
object MarkerEvents {
  
  @scala.inline
  def apply(): MarkerEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerEvents]
  }
  
  @scala.inline
  implicit class MarkerEventsOps[Self <: MarkerEvents] (val x: Self) extends AnyVal {
    
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
    def setOnadd(value: /* event */ LeafletEvent => Unit): Self = this.set("onadd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnadd: Self = this.set("onadd", js.undefined)
    
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
    def setOnmousedown(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("onmousedown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnmousedown: Self = this.set("onmousedown", js.undefined)
    
    @scala.inline
    def setOnmouseout(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("onmouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnmouseout: Self = this.set("onmouseout", js.undefined)
    
    @scala.inline
    def setOnmouseover(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("onmouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnmouseover: Self = this.set("onmouseover", js.undefined)
    
    @scala.inline
    def setOnmove(value: /* event */ LeafletEvent => Unit): Self = this.set("onmove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnmove: Self = this.set("onmove", js.undefined)
    
    @scala.inline
    def setOnpopupclose(value: /* event */ PopupEvent => Unit): Self = this.set("onpopupclose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnpopupclose: Self = this.set("onpopupclose", js.undefined)
    
    @scala.inline
    def setOnpopupopen(value: /* event */ PopupEvent => Unit): Self = this.set("onpopupopen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnpopupopen: Self = this.set("onpopupopen", js.undefined)
    
    @scala.inline
    def setOnremove(value: /* event */ LeafletEvent => Unit): Self = this.set("onremove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnremove: Self = this.set("onremove", js.undefined)
  }
}
