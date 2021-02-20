package typings.reactLeaflet.mod

import typings.leaflet.mod.LayersControlEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayersControlEvents extends StObject {
  
  var onbaselayerchange: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.native
  
  var onoverlayadd: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.native
  
  var onoverlayremove: js.UndefOr[js.Function1[/* event */ LayersControlEvent, Unit]] = js.native
}
object LayersControlEvents {
  
  @scala.inline
  def apply(): LayersControlEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersControlEvents]
  }
  
  @scala.inline
  implicit class LayersControlEventsMutableBuilder[Self <: LayersControlEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnbaselayerchange(value: /* event */ LayersControlEvent => Unit): Self = StObject.set(x, "onbaselayerchange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnbaselayerchangeUndefined: Self = StObject.set(x, "onbaselayerchange", js.undefined)
    
    @scala.inline
    def setOnoverlayadd(value: /* event */ LayersControlEvent => Unit): Self = StObject.set(x, "onoverlayadd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnoverlayaddUndefined: Self = StObject.set(x, "onoverlayadd", js.undefined)
    
    @scala.inline
    def setOnoverlayremove(value: /* event */ LayersControlEvent => Unit): Self = StObject.set(x, "onoverlayremove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnoverlayremoveUndefined: Self = StObject.set(x, "onoverlayremove", js.undefined)
  }
}
