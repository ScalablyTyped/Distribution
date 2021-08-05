package typings.reactMdForm.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderState extends StObject {
  
  var dragType: SliderDraggingType
  
  var dragging: Boolean
  
  var value: Double
}
object SliderState {
  
  inline def apply(dragging: Boolean, value: Double): SliderState = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], dragType = null)
    __obj.asInstanceOf[SliderState]
  }
  
  extension [Self <: SliderState](x: Self) {
    
    inline def setDragType(value: SliderDraggingType): Self = StObject.set(x, "dragType", value.asInstanceOf[js.Any])
    
    inline def setDragTypeNull: Self = StObject.set(x, "dragType", null)
    
    inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
