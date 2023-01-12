package typings.reactLeaflet.mod

import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.TileEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayerEvents extends StObject {
  
  var onload: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  
  var onloading: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.undefined
  
  var ontileerror: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.undefined
  
  var ontileload: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.undefined
  
  var ontileloadstart: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.undefined
  
  var ontileunload: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.undefined
}
object TileLayerEvents {
  
  inline def apply(): TileLayerEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayerEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileLayerEvents] (val x: Self) extends AnyVal {
    
    inline def setOnload(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
    
    inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
    
    inline def setOnloading(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onloading", js.Any.fromFunction1(value))
    
    inline def setOnloadingUndefined: Self = StObject.set(x, "onloading", js.undefined)
    
    inline def setOntileerror(value: /* event */ TileEvent => Unit): Self = StObject.set(x, "ontileerror", js.Any.fromFunction1(value))
    
    inline def setOntileerrorUndefined: Self = StObject.set(x, "ontileerror", js.undefined)
    
    inline def setOntileload(value: /* event */ TileEvent => Unit): Self = StObject.set(x, "ontileload", js.Any.fromFunction1(value))
    
    inline def setOntileloadUndefined: Self = StObject.set(x, "ontileload", js.undefined)
    
    inline def setOntileloadstart(value: /* event */ TileEvent => Unit): Self = StObject.set(x, "ontileloadstart", js.Any.fromFunction1(value))
    
    inline def setOntileloadstartUndefined: Self = StObject.set(x, "ontileloadstart", js.undefined)
    
    inline def setOntileunload(value: /* event */ TileEvent => Unit): Self = StObject.set(x, "ontileunload", js.Any.fromFunction1(value))
    
    inline def setOntileunloadUndefined: Self = StObject.set(x, "ontileunload", js.undefined)
  }
}
