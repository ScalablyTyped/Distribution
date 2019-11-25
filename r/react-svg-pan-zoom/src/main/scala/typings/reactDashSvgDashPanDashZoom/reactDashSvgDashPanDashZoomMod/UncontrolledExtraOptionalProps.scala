package typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UncontrolledExtraOptionalProps extends js.Object {
  // current active tool (TOOL_NONE, TOOL_PAN, TOOL_ZOOM_IN, TOOL_ZOOM_OUT)
  var tool: Tool
  // value of the viewer (current point of view)
  var value: Value | Null
  // handler tool changed
  def onChangeTool(tool: Tool): Unit
  // handler something changed
  def onChangeValue(value: Value): Unit
}

object UncontrolledExtraOptionalProps {
  @scala.inline
  def apply(onChangeTool: Tool => Unit, onChangeValue: Value => Unit, tool: Tool, value: Value = null): UncontrolledExtraOptionalProps = {
    val __obj = js.Dynamic.literal(onChangeTool = js.Any.fromFunction1(onChangeTool), onChangeValue = js.Any.fromFunction1(onChangeValue), tool = tool.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncontrolledExtraOptionalProps]
  }
}

