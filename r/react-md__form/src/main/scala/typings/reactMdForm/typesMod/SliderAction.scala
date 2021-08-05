package typings.reactMdForm.typesMod

import typings.reactMdForm.reactMdFormStrings.mousedown
import typings.reactMdForm.reactMdFormStrings.mousemove
import typings.reactMdForm.reactMdFormStrings.mouseup
import typings.reactMdForm.reactMdFormStrings.touchend
import typings.reactMdForm.reactMdFormStrings.touchmove
import typings.reactMdForm.reactMdFormStrings.touchstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactMdForm.typesMod.SliderIncrementAction
  - typings.reactMdForm.typesMod.SliderDecrementAction
  - typings.reactMdForm.typesMod.SliderMinimumAction
  - typings.reactMdForm.typesMod.SliderMaximumAction
  - typings.reactMdForm.typesMod.SliderDragAction
  - typings.reactMdForm.typesMod.SliderStopAction
  - typings.reactMdForm.typesMod.SliderSetValueAction
*/
trait SliderAction extends StObject
object SliderAction {
  
  inline def SliderDecrementAction(dragging: Boolean, max: Double, min: Double, step: Double): typings.reactMdForm.typesMod.SliderDecrementAction = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("decrement")
    __obj.asInstanceOf[typings.reactMdForm.typesMod.SliderDecrementAction]
  }
  
  inline def SliderDragAction(
    clientX: Double,
    clientY: Double,
    eventType: mousedown | mousemove | mouseup | touchstart | touchmove | touchend,
    height: Double,
    left: Double,
    max: Double,
    min: Double,
    reversed: Boolean,
    step: Double,
    top: Double,
    vertical: Boolean,
    width: Double
  ): typings.reactMdForm.typesMod.SliderDragAction = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("drag")
    __obj.asInstanceOf[typings.reactMdForm.typesMod.SliderDragAction]
  }
  
  inline def SliderIncrementAction(dragging: Boolean, max: Double, min: Double, step: Double): typings.reactMdForm.typesMod.SliderIncrementAction = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("increment")
    __obj.asInstanceOf[typings.reactMdForm.typesMod.SliderIncrementAction]
  }
  
  inline def SliderMaximumAction(max: Double): typings.reactMdForm.typesMod.SliderMaximumAction = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("maximum")
    __obj.asInstanceOf[typings.reactMdForm.typesMod.SliderMaximumAction]
  }
  
  inline def SliderMinimumAction(min: Double): typings.reactMdForm.typesMod.SliderMinimumAction = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("minimum")
    __obj.asInstanceOf[typings.reactMdForm.typesMod.SliderMinimumAction]
  }
  
  inline def SliderSetValueAction(value: Double): typings.reactMdForm.typesMod.SliderSetValueAction = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setValue")
    __obj.asInstanceOf[typings.reactMdForm.typesMod.SliderSetValueAction]
  }
  
  inline def SliderStopAction(): typings.reactMdForm.typesMod.SliderStopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stop")
    __obj.asInstanceOf[typings.reactMdForm.typesMod.SliderStopAction]
  }
}
