package typings.reactLeaflet.mod

import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.TileEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileLayerEvents extends StObject {
  
  var onload: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var onloading: js.UndefOr[js.Function1[/* event */ LeafletEvent, Unit]] = js.native
  
  var ontileerror: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.native
  
  var ontileload: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.native
  
  var ontileloadstart: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.native
  
  var ontileunload: js.UndefOr[js.Function1[/* event */ TileEvent, Unit]] = js.native
}
object TileLayerEvents {
  
  @scala.inline
  def apply(): TileLayerEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayerEvents]
  }
  
  @scala.inline
  implicit class TileLayerEventsMutableBuilder[Self <: TileLayerEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnload(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
    
    @scala.inline
    def setOnloading(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "onloading", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnloadingUndefined: Self = StObject.set(x, "onloading", js.undefined)
    
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
