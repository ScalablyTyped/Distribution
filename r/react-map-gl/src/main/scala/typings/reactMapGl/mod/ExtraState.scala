package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraState extends StObject {
  
  var inTransition: js.UndefOr[Boolean] = js.undefined
  
  var isDragging: js.UndefOr[Boolean] = js.undefined
  
  var isHovering: js.UndefOr[Boolean] = js.undefined
  
  var isPanning: js.UndefOr[Boolean] = js.undefined
  
  var isRotating: js.UndefOr[Boolean] = js.undefined
  
  var isZooming: js.UndefOr[Boolean] = js.undefined
}
object ExtraState {
  
  inline def apply(): ExtraState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtraState] (val x: Self) extends AnyVal {
    
    inline def setInTransition(value: Boolean): Self = StObject.set(x, "inTransition", value.asInstanceOf[js.Any])
    
    inline def setInTransitionUndefined: Self = StObject.set(x, "inTransition", js.undefined)
    
    inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    
    inline def setIsDraggingUndefined: Self = StObject.set(x, "isDragging", js.undefined)
    
    inline def setIsHovering(value: Boolean): Self = StObject.set(x, "isHovering", value.asInstanceOf[js.Any])
    
    inline def setIsHoveringUndefined: Self = StObject.set(x, "isHovering", js.undefined)
    
    inline def setIsPanning(value: Boolean): Self = StObject.set(x, "isPanning", value.asInstanceOf[js.Any])
    
    inline def setIsPanningUndefined: Self = StObject.set(x, "isPanning", js.undefined)
    
    inline def setIsRotating(value: Boolean): Self = StObject.set(x, "isRotating", value.asInstanceOf[js.Any])
    
    inline def setIsRotatingUndefined: Self = StObject.set(x, "isRotating", js.undefined)
    
    inline def setIsZooming(value: Boolean): Self = StObject.set(x, "isZooming", value.asInstanceOf[js.Any])
    
    inline def setIsZoomingUndefined: Self = StObject.set(x, "isZooming", js.undefined)
  }
}
