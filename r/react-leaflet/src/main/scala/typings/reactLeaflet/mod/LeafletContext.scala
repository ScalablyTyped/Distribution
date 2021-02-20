package typings.reactLeaflet.mod

import typings.leaflet.mod.Layer
import typings.leaflet.mod.Map_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeafletContext extends StObject {
  
  var layerContainer: js.UndefOr[LayerContainer] = js.native
  
  var map: js.UndefOr[Map_] = js.native
  
  var pane: js.UndefOr[String] = js.native
  
  var popupContainer: js.UndefOr[Layer] = js.native
}
object LeafletContext {
  
  @scala.inline
  def apply(): LeafletContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeafletContext]
  }
  
  @scala.inline
  implicit class LeafletContextMutableBuilder[Self <: LeafletContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerContainer(value: LayerContainer): Self = StObject.set(x, "layerContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerContainerUndefined: Self = StObject.set(x, "layerContainer", js.undefined)
    
    @scala.inline
    def setMap(value: Map_): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setPopupContainer(value: Layer): Self = StObject.set(x, "popupContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupContainerUndefined: Self = StObject.set(x, "popupContainer", js.undefined)
  }
}
