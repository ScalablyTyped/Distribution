package typings.reactMdForm.typesMod

import typings.reactMdForm.reactMdFormStrings.drag
import typings.reactMdForm.reactMdFormStrings.mousedown
import typings.reactMdForm.reactMdFormStrings.mousemove
import typings.reactMdForm.reactMdFormStrings.mouseup
import typings.reactMdForm.reactMdFormStrings.touchend
import typings.reactMdForm.reactMdFormStrings.touchmove
import typings.reactMdForm.reactMdFormStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderDragAction
  extends SliderDragValues
     with SliderAction {
  
  var eventType: mousedown | mousemove | mouseup | touchstart | touchmove | touchend = js.native
  
  var `type`: drag = js.native
}
object SliderDragAction {
  
  @scala.inline
  def apply(
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
    `type`: drag,
    vertical: Boolean,
    width: Double
  ): SliderDragAction = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderDragAction]
  }
  
  @scala.inline
  implicit class SliderDragActionOps[Self <: SliderDragAction] (val x: Self) extends AnyVal {
    
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
    def setEventType(value: mousedown | mousemove | mouseup | touchstart | touchmove | touchend): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: drag): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
