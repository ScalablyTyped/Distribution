package typings.reactMapGl.mod

import typings.mapboxGl.mod.Map
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapContextProps extends StObject {
  
  var eventManager: js.UndefOr[EventManager] = js.undefined
  
  var isDragging: Boolean
  
  var map: js.UndefOr[Map] = js.undefined
  
  var mapContainer: HTMLElement | Null
  
  var onViewStateChange: js.UndefOr[ContextViewStateChangeHandler] = js.undefined
  
  var onViewportChange: js.UndefOr[ContextViewportChangeHandler] = js.undefined
  
  var viewport: js.UndefOr[typings.viewportMercatorProject.mod.default] = js.undefined
}
object MapContextProps {
  
  inline def apply(isDragging: Boolean): MapContextProps = {
    val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any], mapContainer = null)
    __obj.asInstanceOf[MapContextProps]
  }
  
  extension [Self <: MapContextProps](x: Self) {
    
    inline def setEventManager(value: EventManager): Self = StObject.set(x, "eventManager", value.asInstanceOf[js.Any])
    
    inline def setEventManagerUndefined: Self = StObject.set(x, "eventManager", js.undefined)
    
    inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapContainer(value: HTMLElement): Self = StObject.set(x, "mapContainer", value.asInstanceOf[js.Any])
    
    inline def setMapContainerNull: Self = StObject.set(x, "mapContainer", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setOnViewStateChange(value: /* info */ ContextViewStateChangeInfo => Unit): Self = StObject.set(x, "onViewStateChange", js.Any.fromFunction1(value))
    
    inline def setOnViewStateChangeUndefined: Self = StObject.set(x, "onViewStateChange", js.undefined)
    
    inline def setOnViewportChange(
      value: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Unit
    ): Self = StObject.set(x, "onViewportChange", js.Any.fromFunction3(value))
    
    inline def setOnViewportChangeUndefined: Self = StObject.set(x, "onViewportChange", js.undefined)
    
    inline def setViewport(value: typings.viewportMercatorProject.mod.default): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
