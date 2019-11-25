package typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredProps extends js.Object {
  // height of the viewer displayed on screen
  var height: Double
  // current active tool (TOOL_NONE, TOOL_PAN, TOOL_ZOOM_IN, TOOL_ZOOM_OUT)
  var tool: Tool
  // value of the viewer (current point of view)
  var value: Value | Null
  // width of the viewer displayed on screen
  var width: Double
  // handler tool changed
  def onChangeTool(tool: Tool): Unit
  // handler something changed
  def onChangeValue(value: Value): Unit
}

object RequiredProps {
  @scala.inline
  def apply(
    height: Double,
    onChangeTool: Tool => Unit,
    onChangeValue: Value => Unit,
    tool: Tool,
    width: Double,
    value: Value = null
  ): RequiredProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], onChangeTool = js.Any.fromFunction1(onChangeTool), onChangeValue = js.Any.fromFunction1(onChangeValue), tool = tool.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredProps]
  }
}

