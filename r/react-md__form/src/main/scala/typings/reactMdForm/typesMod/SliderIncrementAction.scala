package typings.reactMdForm.typesMod

import typings.reactMdForm.reactMdFormStrings.increment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderIncrementAction
  extends StObject
     with SliderStepParts
     with SliderAction {
  
  var dragging: Boolean
  
  var `type`: increment
}
object SliderIncrementAction {
  
  inline def apply(dragging: Boolean, max: Double, min: Double, step: Double): SliderIncrementAction = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("increment")
    __obj.asInstanceOf[SliderIncrementAction]
  }
  
  extension [Self <: SliderIncrementAction](x: Self) {
    
    inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setType(value: increment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
