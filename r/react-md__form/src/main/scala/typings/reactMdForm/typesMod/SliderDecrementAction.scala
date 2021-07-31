package typings.reactMdForm.typesMod

import typings.reactMdForm.reactMdFormStrings.decrement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderDecrementAction
  extends StObject
     with SliderStepParts
     with SliderAction {
  
  var dragging: Boolean
  
  var `type`: decrement
}
object SliderDecrementAction {
  
  @scala.inline
  def apply(dragging: Boolean, max: Double, min: Double, step: Double): SliderDecrementAction = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("decrement")
    __obj.asInstanceOf[SliderDecrementAction]
  }
  
  @scala.inline
  implicit class SliderDecrementActionMutableBuilder[Self <: SliderDecrementAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: decrement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
