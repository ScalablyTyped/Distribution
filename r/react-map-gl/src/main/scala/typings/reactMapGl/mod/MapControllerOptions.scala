package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapControllerOptions extends js.Object {
  
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
  implicit class MapControllerOptionsOps[Self <: MapControllerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsInteractive(value: Boolean): Self = this.set("isInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleClickZoom(value: Boolean): Self = this.set("doubleClickZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleClickZoom: Self = this.set("doubleClickZoom", js.undefined)
    
    @scala.inline
    def setDragPan(value: Boolean): Self = this.set("dragPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragPan: Self = this.set("dragPan", js.undefined)
    
    @scala.inline
    def setDragRotate(value: Boolean): Self = this.set("dragRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragRotate: Self = this.set("dragRotate", js.undefined)
    
    @scala.inline
    def setEventManager(value: js.Any): Self = this.set("eventManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventManager: Self = this.set("eventManager", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setOnStateChange(value: /* state */ MapState => Unit): Self = this.set("onStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStateChange: Self = this.set("onStateChange", js.undefined)
    
    @scala.inline
    def setOnViewportChange(
      value: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Unit
    ): Self = this.set("onViewportChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnViewportChange: Self = this.set("onViewportChange", js.undefined)
    
    @scala.inline
    def setScrollZoom(value: Boolean): Self = this.set("scrollZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollZoom: Self = this.set("scrollZoom", js.undefined)
    
    @scala.inline
    def setTouchRotate(value: Boolean): Self = this.set("touchRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchRotate: Self = this.set("touchRotate", js.undefined)
    
    @scala.inline
    def setTouchZoom(value: Boolean): Self = this.set("touchZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchZoom: Self = this.set("touchZoom", js.undefined)
  }
}
