package typings.reactMapGl.mod

import typings.mapboxGl.mod.Map
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapContextProps extends StObject {
  
  var eventManager: js.UndefOr[EventManager] = js.native
  
  var isDragging: Boolean = js.native
  
  var map: js.UndefOr[Map] = js.native
  
  var mapContainer: HTMLElement | Null = js.native
  
  var onViewStateChange: js.UndefOr[ContextViewStateChangeHandler] = js.native
  
  var onViewportChange: js.UndefOr[ContextViewportChangeHandler] = js.native
  
  var viewport: js.UndefOr[typings.viewportMercatorProject.mod.default] = js.native
}
object MapContextProps {
  
  @scala.inline
  def apply(isDragging: Boolean): MapContextProps = {
    val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapContextProps]
  }
  
  @scala.inline
  implicit class MapContextPropsMutableBuilder[Self <: MapContextProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventManager(value: EventManager): Self = StObject.set(x, "eventManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventManagerUndefined: Self = StObject.set(x, "eventManager", js.undefined)
    
    @scala.inline
    def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapContainer(value: HTMLElement): Self = StObject.set(x, "mapContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapContainerNull: Self = StObject.set(x, "mapContainer", null)
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setOnViewStateChange(value: /* info */ ContextViewStateChangeInfo => Unit): Self = StObject.set(x, "onViewStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnViewStateChangeUndefined: Self = StObject.set(x, "onViewStateChange", js.undefined)
    
    @scala.inline
    def setOnViewportChange(
      value: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Unit
    ): Self = StObject.set(x, "onViewportChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnViewportChangeUndefined: Self = StObject.set(x, "onViewportChange", js.undefined)
    
    @scala.inline
    def setViewport(value: typings.viewportMercatorProject.mod.default): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
