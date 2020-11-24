package typings.reactMdForm.typesMod

import typings.reactMdForm.reactMdFormStrings.decrement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderDecrementAction
  extends SliderStepParts
     with SliderAction {
  
  var dragging: Boolean = js.native
  
  var `type`: decrement = js.native
}
object SliderDecrementAction {
  
  @scala.inline
  def apply(dragging: Boolean, max: Double, min: Double, step: Double, `type`: decrement): SliderDecrementAction = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderDecrementAction]
  }
  
  @scala.inline
  implicit class SliderDecrementActionOps[Self <: SliderDecrementAction] (val x: Self) extends AnyVal {
    
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
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: decrement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
