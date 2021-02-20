package typings.reactLeaflet.mod

import typings.leaflet.mod.LayerEvent
import typings.leaflet.mod.LeafletMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureGroupEvents extends StObject {
  
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
  implicit class FeatureGroupEventsMutableBuilder[Self <: FeatureGroupEvents] (val x: Self) extends AnyVal {
    
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
    def setOnlayeradd(value: /* event */ LayerEvent => Unit): Self = StObject.set(x, "onlayeradd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnlayeraddUndefined: Self = StObject.set(x, "onlayeradd", js.undefined)
    
    @scala.inline
    def setOnlayerremove(value: /* event */ LayerEvent => Unit): Self = StObject.set(x, "onlayerremove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnlayerremoveUndefined: Self = StObject.set(x, "onlayerremove", js.undefined)
    
    @scala.inline
    def setOnmouseout(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
    
    @scala.inline
    def setOnmouseover(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
  }
}
