package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraState extends StObject {
  
  var inTransition: js.UndefOr[Boolean] = js.native
  
  var isDragging: js.UndefOr[Boolean] = js.native
  
  var isHovering: js.UndefOr[Boolean] = js.native
  
  var isPanning: js.UndefOr[Boolean] = js.native
  
  var isRotating: js.UndefOr[Boolean] = js.native
  
  var isZooming: js.UndefOr[Boolean] = js.native
}
object ExtraState {
  
  @scala.inline
  def apply(): ExtraState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraState]
  }
  
  @scala.inline
  implicit class ExtraStateMutableBuilder[Self <: ExtraState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInTransition(value: Boolean): Self = StObject.set(x, "inTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInTransitionUndefined: Self = StObject.set(x, "inTransition", js.undefined)
    
    @scala.inline
    def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDraggingUndefined: Self = StObject.set(x, "isDragging", js.undefined)
    
    @scala.inline
    def setIsHovering(value: Boolean): Self = StObject.set(x, "isHovering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHoveringUndefined: Self = StObject.set(x, "isHovering", js.undefined)
    
    @scala.inline
    def setIsPanning(value: Boolean): Self = StObject.set(x, "isPanning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPanningUndefined: Self = StObject.set(x, "isPanning", js.undefined)
    
    @scala.inline
    def setIsRotating(value: Boolean): Self = StObject.set(x, "isRotating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRotatingUndefined: Self = StObject.set(x, "isRotating", js.undefined)
    
    @scala.inline
    def setIsZooming(value: Boolean): Self = StObject.set(x, "isZooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsZoomingUndefined: Self = StObject.set(x, "isZooming", js.undefined)
  }
}
