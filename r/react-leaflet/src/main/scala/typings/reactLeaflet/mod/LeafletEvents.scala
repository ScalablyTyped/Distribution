package typings.reactLeaflet.mod

import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.TileEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactLeaflet.mod.LayersControlEvents because var conflicts: onbaselayerchange, onoverlayadd, onoverlayremove. Inlined 
- typings.reactLeaflet.mod.FeatureGroupEvents because var conflicts: onclick, oncontextmenu, ondblclick, onlayeradd, onlayerremove, onmouseout, onmouseover. Inlined 
- typings.reactLeaflet.mod.PathEvents because var conflicts: onadd, onclick, oncontextmenu, ondblclick, onmousedown, onmouseout, onmouseover, onpopupclose, onpopupopen, onremove. Inlined 
- typings.reactLeaflet.mod.TileLayerEvents because var conflicts: onload. Inlined onloading, ontileloadstart, ontileload, ontileunload, ontileerror
- typings.reactLeaflet.mod.MarkerEvents because var conflicts: onclick, oncontextmenu, ondblclick, ondrag, ondragend, ondragstart, onmousedown, onmouseout, onmouseover, onmove, onpopupclose, onpopupopen. Inlined onadd, onremove */ trait LeafletEvents
  extends StObject
     with MapEvents {
  
  var onadd: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  
  var onloading: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  
  var onremove: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  
  var ontileerror: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.undefined
  
  var ontileload: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.undefined
  
  var ontileloadstart: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.undefined
  
  var ontileunload: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.undefined
}
object LeafletEvents {
  
  @scala.inline
  def apply(): LeafletEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeafletEvents]
  }
  
  @scala.inline
  implicit class LeafletEventsMutableBuilder[Self <: LeafletEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnadd(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onadd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnaddUndefined: Self = StObject.set(x, "onadd", js.undefined)
    
    @scala.inline
    def setOnloading(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onloading", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnloadingUndefined: Self = StObject.set(x, "onloading", js.undefined)
    
    @scala.inline
    def setOnremove(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onremove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnremoveUndefined: Self = StObject.set(x, "onremove", js.undefined)
    
    @scala.inline
    def setOntileerror(value: /* event */ TileEvent => Unit): Self = StObject.set(x, "ontileerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOntileerrorUndefined: Self = StObject.set(x, "ontileerror", js.undefined)
    
    @scala.inline
    def setOntileload(value: /* event */ TileEvent => Unit): Self = StObject.set(x, "ontileload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOntileloadUndefined: Self = StObject.set(x, "ontileload", js.undefined)
    
    @scala.inline
    def setOntileloadstart(value: /* event */ TileEvent => Unit): Self = StObject.set(x, "ontileloadstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOntileloadstartUndefined: Self = StObject.set(x, "ontileloadstart", js.undefined)
    
    @scala.inline
    def setOntileunload(value: /* event */ TileEvent => Unit): Self = StObject.set(x, "ontileunload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOntileunloadUndefined: Self = StObject.set(x, "ontileunload", js.undefined)
  }
}
