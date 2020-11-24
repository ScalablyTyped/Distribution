package typings.reactLeaflet.mod

import typings.leaflet.mod.LayerEvent
import typings.leaflet.mod.LeafletMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureGroupEvents extends js.Object {
  
  var onclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var oncontextmenu: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var ondblclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var onlayeradd: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.native
  
  var onlayerremove: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.native
  
  var onmouseout: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
  
  var onmouseover: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.native
}
object FeatureGroupEvents {
  
  @scala.inline
  def apply(): FeatureGroupEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureGroupEvents]
  }
  
  @scala.inline
  implicit class FeatureGroupEventsOps[Self <: FeatureGroupEvents] (val x: Self) extends AnyVal {
    
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
    def setOnlayeradd(value: /* event */ LayerEvent => Unit): Self = this.set("onlayeradd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnlayeradd: Self = this.set("onlayeradd", js.undefined)
    
    @scala.inline
    def setOnlayerremove(value: /* event */ LayerEvent => Unit): Self = this.set("onlayerremove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnlayerremove: Self = this.set("onlayerremove", js.undefined)
    
    @scala.inline
    def setOnmouseout(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("onmouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnmouseout: Self = this.set("onmouseout", js.undefined)
    
    @scala.inline
    def setOnmouseover(value: /* event */ LeafletMouseEvent => Unit): Self = this.set("onmouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnmouseover: Self = this.set("onmouseover", js.undefined)
  }
}
