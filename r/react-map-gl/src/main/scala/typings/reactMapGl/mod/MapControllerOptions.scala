package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapControllerOptions extends StObject {
  
  var doubleClickZoom: js.UndefOr[Boolean] = js.undefined
  
  var dragPan: js.UndefOr[Boolean] = js.undefined
  
  var dragRotate: js.UndefOr[Boolean] = js.undefined
  
  var eventManager: js.UndefOr[js.Any] = js.undefined
  
  var isInteractive: Boolean
  
  var keyboard: js.UndefOr[Boolean] = js.undefined
  
  var onStateChange: js.UndefOr[js.Function1[/* state */ MapState, Unit]] = js.undefined
  
  var onViewportChange: js.UndefOr[ContextViewportChangeHandler] = js.undefined
  
  var scrollZoom: js.UndefOr[Boolean] = js.undefined
  
  var touchRotate: js.UndefOr[Boolean] = js.undefined
  
  var touchZoom: js.UndefOr[Boolean] = js.undefined
}
object MapControllerOptions {
  
  inline def apply(isInteractive: Boolean): MapControllerOptions = {
    val __obj = js.Dynamic.literal(isInteractive = isInteractive.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapControllerOptions]
  }
  
  extension [Self <: MapControllerOptions](x: Self) {
    
    inline def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
    
    inline def setDragPan(value: Boolean): Self = StObject.set(x, "dragPan", value.asInstanceOf[js.Any])
    
    inline def setDragPanUndefined: Self = StObject.set(x, "dragPan", js.undefined)
    
    inline def setDragRotate(value: Boolean): Self = StObject.set(x, "dragRotate", value.asInstanceOf[js.Any])
    
    inline def setDragRotateUndefined: Self = StObject.set(x, "dragRotate", js.undefined)
    
    inline def setEventManager(value: js.Any): Self = StObject.set(x, "eventManager", value.asInstanceOf[js.Any])
    
    inline def setEventManagerUndefined: Self = StObject.set(x, "eventManager", js.undefined)
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setOnStateChange(value: /* state */ MapState => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
    
    inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
    
    inline def setOnViewportChange(
      value: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Unit
    ): Self = StObject.set(x, "onViewportChange", js.Any.fromFunction3(value))
    
    inline def setOnViewportChangeUndefined: Self = StObject.set(x, "onViewportChange", js.undefined)
    
    inline def setScrollZoom(value: Boolean): Self = StObject.set(x, "scrollZoom", value.asInstanceOf[js.Any])
    
    inline def setScrollZoomUndefined: Self = StObject.set(x, "scrollZoom", js.undefined)
    
    inline def setTouchRotate(value: Boolean): Self = StObject.set(x, "touchRotate", value.asInstanceOf[js.Any])
    
    inline def setTouchRotateUndefined: Self = StObject.set(x, "touchRotate", js.undefined)
    
    inline def setTouchZoom(value: Boolean): Self = StObject.set(x, "touchZoom", value.asInstanceOf[js.Any])
    
    inline def setTouchZoomUndefined: Self = StObject.set(x, "touchZoom", js.undefined)
  }
}
