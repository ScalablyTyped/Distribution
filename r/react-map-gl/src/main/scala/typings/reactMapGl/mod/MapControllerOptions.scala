package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapControllerOptions extends StObject {
  
  var doubleClickZoom: js.UndefOr[Boolean] = js.native
  
  var dragPan: js.UndefOr[Boolean] = js.native
  
  var dragRotate: js.UndefOr[Boolean] = js.native
  
  var eventManager: js.UndefOr[js.Any] = js.native
  
  var isInteractive: Boolean = js.native
  
  var keyboard: js.UndefOr[Boolean] = js.native
  
  var onStateChange: js.UndefOr[js.Function1[/* state */ MapState, Unit]] = js.native
  
  var onViewportChange: js.UndefOr[ContextViewportChangeHandler] = js.native
  
  var scrollZoom: js.UndefOr[Boolean] = js.native
  
  var touchRotate: js.UndefOr[Boolean] = js.native
  
  var touchZoom: js.UndefOr[Boolean] = js.native
}
object MapControllerOptions {
  
  @scala.inline
  def apply(isInteractive: Boolean): MapControllerOptions = {
    val __obj = js.Dynamic.literal(isInteractive = isInteractive.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapControllerOptions]
  }
  
  @scala.inline
  implicit class MapControllerOptionsMutableBuilder[Self <: MapControllerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
    
    @scala.inline
    def setDragPan(value: Boolean): Self = StObject.set(x, "dragPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragPanUndefined: Self = StObject.set(x, "dragPan", js.undefined)
    
    @scala.inline
    def setDragRotate(value: Boolean): Self = StObject.set(x, "dragRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragRotateUndefined: Self = StObject.set(x, "dragRotate", js.undefined)
    
    @scala.inline
    def setEventManager(value: js.Any): Self = StObject.set(x, "eventManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventManagerUndefined: Self = StObject.set(x, "eventManager", js.undefined)
    
    @scala.inline
    def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setOnStateChange(value: /* state */ MapState => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
    
    @scala.inline
    def setOnViewportChange(
      value: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Unit
    ): Self = StObject.set(x, "onViewportChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnViewportChangeUndefined: Self = StObject.set(x, "onViewportChange", js.undefined)
    
    @scala.inline
    def setScrollZoom(value: Boolean): Self = StObject.set(x, "scrollZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollZoomUndefined: Self = StObject.set(x, "scrollZoom", js.undefined)
    
    @scala.inline
    def setTouchRotate(value: Boolean): Self = StObject.set(x, "touchRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchRotateUndefined: Self = StObject.set(x, "touchRotate", js.undefined)
    
    @scala.inline
    def setTouchZoom(value: Boolean): Self = StObject.set(x, "touchZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchZoomUndefined: Self = StObject.set(x, "touchZoom", js.undefined)
  }
}
