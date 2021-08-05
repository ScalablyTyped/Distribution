package typings.reactLeaflet.mod

import typings.leaflet.mod.LayerEvent
import typings.leaflet.mod.LeafletMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureGroupEvents extends StObject {
  
  var onclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  
  var oncontextmenu: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  
  var ondblclick: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  
  var onlayeradd: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.undefined
  
  var onlayerremove: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.undefined
  
  var onmouseout: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
  
  var onmouseover: js.UndefOr[js.Function1[/* event */ LeafletMouseEvent, Unit]] = js.undefined
}
object FeatureGroupEvents {
  
  inline def apply(): FeatureGroupEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureGroupEvents]
  }
  
  extension [Self <: FeatureGroupEvents](x: Self) {
    
    inline def setOnclick(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    inline def setOncontextmenu(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "oncontextmenu", js.Any.fromFunction1(value))
    
    inline def setOncontextmenuUndefined: Self = StObject.set(x, "oncontextmenu", js.undefined)
    
    inline def setOndblclick(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "ondblclick", js.Any.fromFunction1(value))
    
    inline def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
    
    inline def setOnlayeradd(value: /* event */ LayerEvent => Unit): Self = StObject.set(x, "onlayeradd", js.Any.fromFunction1(value))
    
    inline def setOnlayeraddUndefined: Self = StObject.set(x, "onlayeradd", js.undefined)
    
    inline def setOnlayerremove(value: /* event */ LayerEvent => Unit): Self = StObject.set(x, "onlayerremove", js.Any.fromFunction1(value))
    
    inline def setOnlayerremoveUndefined: Self = StObject.set(x, "onlayerremove", js.undefined)
    
    inline def setOnmouseout(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1(value))
    
    inline def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
    
    inline def setOnmouseover(value: /* event */ LeafletMouseEvent => Unit): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1(value))
    
    inline def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
  }
}
