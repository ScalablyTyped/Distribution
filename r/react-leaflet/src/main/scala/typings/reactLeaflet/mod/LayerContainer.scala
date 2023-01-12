package typings.reactLeaflet.mod

import typings.leaflet.mod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerContainer extends StObject {
  
  var addLayer: AddLayerHandler
  
  var removeLayer: RemoveLayerHandler
}
object LayerContainer {
  
  inline def apply(
    addLayer: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit,
    removeLayer: /* layer */ Layer => Unit
  ): LayerContainer = {
    val __obj = js.Dynamic.literal(addLayer = js.Any.fromFunction3(addLayer), removeLayer = js.Any.fromFunction1(removeLayer))
    __obj.asInstanceOf[LayerContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerContainer] (val x: Self) extends AnyVal {
    
    inline def setAddLayer(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "addLayer", js.Any.fromFunction3(value))
    
    inline def setRemoveLayer(value: /* layer */ Layer => Unit): Self = StObject.set(x, "removeLayer", js.Any.fromFunction1(value))
  }
}
