package typings.reactLeaflet.mod

import typings.leaflet.mod.Layer
import typings.leaflet.mod.Map_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeafletContext extends StObject {
  
  var layerContainer: js.UndefOr[LayerContainer] = js.undefined
  
  var map: js.UndefOr[Map_] = js.undefined
  
  var pane: js.UndefOr[String] = js.undefined
  
  var popupContainer: js.UndefOr[Layer] = js.undefined
}
object LeafletContext {
  
  inline def apply(): LeafletContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeafletContext]
  }
  
  extension [Self <: LeafletContext](x: Self) {
    
    inline def setLayerContainer(value: LayerContainer): Self = StObject.set(x, "layerContainer", value.asInstanceOf[js.Any])
    
    inline def setLayerContainerUndefined: Self = StObject.set(x, "layerContainer", js.undefined)
    
    inline def setMap(value: Map_): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    inline def setPopupContainer(value: Layer): Self = StObject.set(x, "popupContainer", value.asInstanceOf[js.Any])
    
    inline def setPopupContainerUndefined: Self = StObject.set(x, "popupContainer", js.undefined)
  }
}
