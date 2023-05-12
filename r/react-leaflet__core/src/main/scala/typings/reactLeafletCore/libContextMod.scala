package typings.reactLeafletCore

import typings.leaflet.mod.Control_.Layers
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerGroup_
import typings.leaflet.mod.Map_
import typings.react.mod.Context
import typings.react.mod.Provider
import typings.reactLeafletCore.anon.PartialLeafletContextInte
import typings.reactLeafletCore.anon.ReadonlyversionnumbermapM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextMod {
  
  @JSImport("@react-leaflet/core/lib/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-leaflet/core/lib/context", "CONTEXT_VERSION")
  @js.native
  val CONTEXT_VERSION: /* 1 */ Double = js.native
  
  @JSImport("@react-leaflet/core/lib/context", "LeafletContext")
  @js.native
  val LeafletContext: Context[ReadonlyversionnumbermapM | Null] = js.native
  
  @JSImport("@react-leaflet/core/lib/context", "LeafletProvider")
  @js.native
  val LeafletProvider: Provider[ReadonlyversionnumbermapM | Null] = js.native
  
  inline def createLeafletContext(map: Map_): LeafletContextInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("createLeafletContext")(map.asInstanceOf[js.Any]).asInstanceOf[LeafletContextInterface]
  
  inline def extendContext(source: LeafletContextInterface, extra: PartialLeafletContextInte): LeafletContextInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("extendContext")(source.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[LeafletContextInterface]
  
  inline def useLeafletContext(): LeafletContextInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("useLeafletContext")().asInstanceOf[LeafletContextInterface]
  
  trait ControlledLayer extends StObject {
    
    def addLayer(layer: Layer): Unit
    
    def removeLayer(layer: Layer): Unit
  }
  object ControlledLayer {
    
    inline def apply(addLayer: Layer => Unit, removeLayer: Layer => Unit): ControlledLayer = {
      val __obj = js.Dynamic.literal(addLayer = js.Any.fromFunction1(addLayer), removeLayer = js.Any.fromFunction1(removeLayer))
      __obj.asInstanceOf[ControlledLayer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlledLayer] (val x: Self) extends AnyVal {
      
      inline def setAddLayer(value: Layer => Unit): Self = StObject.set(x, "addLayer", js.Any.fromFunction1(value))
      
      inline def setRemoveLayer(value: Layer => Unit): Self = StObject.set(x, "removeLayer", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Readonly<{  __version :number,   map :leaflet.leaflet.Map,   layerContainer :@react-leaflet/core.@react-leaflet/core/lib/context.ControlledLayer | leaflet.leaflet.LayerGroup<any> | undefined,   layersControl :leaflet.leaflet.Control.Layers | undefined,   overlayContainer :leaflet.leaflet.Layer | undefined,   pane :string | undefined}> */
  trait LeafletContextInterface extends StObject {
    
    val __version: Double
    
    val layerContainer: js.UndefOr[ControlledLayer | LayerGroup_[Any]] = js.undefined
    
    val layersControl: js.UndefOr[Layers] = js.undefined
    
    val map: Map_
    
    val overlayContainer: js.UndefOr[Layer] = js.undefined
    
    val pane: js.UndefOr[String] = js.undefined
  }
  object LeafletContextInterface {
    
    inline def apply(__version: Double, map: Map_): LeafletContextInterface = {
      val __obj = js.Dynamic.literal(__version = __version.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeafletContextInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LeafletContextInterface] (val x: Self) extends AnyVal {
      
      inline def setLayerContainer(value: ControlledLayer | LayerGroup_[Any]): Self = StObject.set(x, "layerContainer", value.asInstanceOf[js.Any])
      
      inline def setLayerContainerUndefined: Self = StObject.set(x, "layerContainer", js.undefined)
      
      inline def setLayersControl(value: Layers): Self = StObject.set(x, "layersControl", value.asInstanceOf[js.Any])
      
      inline def setLayersControlUndefined: Self = StObject.set(x, "layersControl", js.undefined)
      
      inline def setMap(value: Map_): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setOverlayContainer(value: Layer): Self = StObject.set(x, "overlayContainer", value.asInstanceOf[js.Any])
      
      inline def setOverlayContainerUndefined: Self = StObject.set(x, "overlayContainer", js.undefined)
      
      inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
      
      inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
      
      inline def set__version(value: Double): Self = StObject.set(x, "__version", value.asInstanceOf[js.Any])
    }
  }
}
