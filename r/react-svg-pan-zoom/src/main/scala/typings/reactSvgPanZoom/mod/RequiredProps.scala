package typings.reactSvgPanZoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequiredProps extends js.Object {
  
  // height of the viewer displayed on screen
  var height: Double = js.native
  
  // handler tool changed
  def onChangeTool(tool: Tool): Unit = js.native
  
  // handler something changed
  def onChangeValue(value: Value): Unit = js.native
  
  // current active tool (TOOL_NONE, TOOL_PAN, TOOL_ZOOM_IN, TOOL_ZOOM_OUT)
  var tool: Tool = js.native
  
  // value of the viewer (current point of view)
  var value: Value | Null = js.native
  
  // width of the viewer displayed on screen
  var width: Double = js.native
}
object RequiredProps {
  
  @scala.inline
  def apply(
    height: Double,
    onChangeTool: Tool => Unit,
    onChangeValue: Value => Unit,
    tool: Tool,
    width: Double
  ): RequiredProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], onChangeTool = js.Any.fromFunction1(onChangeTool), onChangeValue = js.Any.fromFunction1(onChangeValue), tool = tool.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredProps]
  }
  
  @scala.inline
  implicit class RequiredPropsOps[Self <: RequiredProps] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeTool(value: Tool => Unit): Self = this.set("onChangeTool", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeValue(value: Value => Unit): Self = this.set("onChangeValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTool(value: Tool): Self = this.set("tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
