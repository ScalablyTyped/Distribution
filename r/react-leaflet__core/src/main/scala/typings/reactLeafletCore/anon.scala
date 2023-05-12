package typings.reactLeafletCore

import typings.leaflet.mod.Control_.Layers
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerGroup_
import typings.leaflet.mod.Map_
import typings.reactLeafletCore.libContextMod.ControlledLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@react-leaflet/core.@react-leaflet/core/lib/context.LeafletContextInterface> */
  trait PartialLeafletContextInte extends StObject {
    
    var __version: js.UndefOr[Double] = js.undefined
    
    var layerContainer: js.UndefOr[ControlledLayer | LayerGroup_[Any]] = js.undefined
    
    var layersControl: js.UndefOr[Layers] = js.undefined
    
    var map: js.UndefOr[Map_] = js.undefined
    
    var overlayContainer: js.UndefOr[Layer] = js.undefined
    
    var pane: js.UndefOr[String] = js.undefined
  }
  object PartialLeafletContextInte {
    
    inline def apply(): PartialLeafletContextInte = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLeafletContextInte]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialLeafletContextInte] (val x: Self) extends AnyVal {
      
      inline def setLayerContainer(value: ControlledLayer | LayerGroup_[Any]): Self = StObject.set(x, "layerContainer", value.asInstanceOf[js.Any])
      
      inline def setLayerContainerUndefined: Self = StObject.set(x, "layerContainer", js.undefined)
      
      inline def setLayersControl(value: Layers): Self = StObject.set(x, "layersControl", value.asInstanceOf[js.Any])
      
      inline def setLayersControlUndefined: Self = StObject.set(x, "layersControl", js.undefined)
      
      inline def setMap(value: Map_): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setOverlayContainer(value: Layer): Self = StObject.set(x, "overlayContainer", value.asInstanceOf[js.Any])
      
      inline def setOverlayContainerUndefined: Self = StObject.set(x, "overlayContainer", js.undefined)
      
      inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
      
      inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
      
      inline def set__version(value: Double): Self = StObject.set(x, "__version", value.asInstanceOf[js.Any])
      
      inline def set__versionUndefined: Self = StObject.set(x, "__version", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  __version :number,   map :leaflet.leaflet.Map,   layerContainer :leaflet.leaflet.LayerGroup<any> | @react-leaflet/core.@react-leaflet/core/lib/context.ControlledLayer | undefined,   layersControl :leaflet.leaflet.Control.Layers | undefined,   overlayContainer :leaflet.leaflet.Layer | undefined,   pane :string | undefined}> */
  trait ReadonlyversionnumbermapM extends StObject {
    
    val __version: Double
    
    val layerContainer: js.UndefOr[LayerGroup_[Any] | ControlledLayer] = js.undefined
    
    val layersControl: js.UndefOr[Layers] = js.undefined
    
    val map: Map_
    
    val overlayContainer: js.UndefOr[Layer] = js.undefined
    
    val pane: js.UndefOr[String] = js.undefined
  }
  object ReadonlyversionnumbermapM {
    
    inline def apply(__version: Double, map: Map_): ReadonlyversionnumbermapM = {
      val __obj = js.Dynamic.literal(__version = __version.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyversionnumbermapM]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyversionnumbermapM] (val x: Self) extends AnyVal {
      
      inline def setLayerContainer(value: LayerGroup_[Any] | ControlledLayer): Self = StObject.set(x, "layerContainer", value.asInstanceOf[js.Any])
      
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
