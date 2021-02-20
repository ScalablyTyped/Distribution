package typings.reactLeaflet.mod

import typings.leaflet.mod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerContainer extends StObject {
  
  var addLayer: AddLayerHandler = js.native
  
  var removeLayer: RemoveLayerHandler = js.native
}
object LayerContainer {
  
  @scala.inline
  def apply(
    addLayer: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit,
    removeLayer: /* layer */ Layer => Unit
  ): LayerContainer = {
    val __obj = js.Dynamic.literal(addLayer = js.Any.fromFunction3(addLayer), removeLayer = js.Any.fromFunction1(removeLayer))
    __obj.asInstanceOf[LayerContainer]
  }
  
  @scala.inline
  implicit class LayerContainerMutableBuilder[Self <: LayerContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddLayer(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "addLayer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveLayer(value: /* layer */ Layer => Unit): Self = StObject.set(x, "removeLayer", js.Any.fromFunction1(value))
  }
}
