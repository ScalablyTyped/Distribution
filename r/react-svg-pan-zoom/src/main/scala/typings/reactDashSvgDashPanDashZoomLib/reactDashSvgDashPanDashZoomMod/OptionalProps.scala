package typings
package reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalProps extends js.Object {
  // background of the svg
  var SVGBackground: java.lang.String
  // background of the viewer
  var background: java.lang.String
  // className of the Viewer
  var className: java.lang.String
  // override default toolbar component
  // TODO: specify function type more clearly
  var customToolbar: (reactLib.reactMod.Component[_, js.Object, _]) | reactLib.reactMod.ReactNs.StatelessComponent[_]
  // perform PAN if the mouse is on viewer border
  var detectAutoPan: scala.Boolean
  // detect zoom operation performed trough pinch gesture or mouse scroll
  var detectWheel: scala.Boolean
  // modifier keys //https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/getModifierState
  var modifierKeys: js.Array[java.lang.String]
  // if disabled the user can move the image outside the viewer
  var preventPanOutside: scala.Boolean
  // how much scale in or out
  var scaleFactor: scala.Double
  // CSS style of the Viewer
  var style: js.Object
  // current active tool (TOOL_NONE, TOOL_PAN, TOOL_ZOOM_IN, TOOL_ZOOM_OUT)
  var tool: Tool
  // toolbar position
  var toolbarPosition: ToolbarPosition
  // value of the viewer (current point of view)
  var value: Value | scala.Null
  // handler tool changed
  def onChangeTool(tool: Tool): scala.Unit
  // handler something changed
  def onChangeValue(value: Value): scala.Unit
  // Note: The `T` type parameter is the type of the `target` of the event:
  // handler click
  def onClick[T](event: ViewerMouseEvent[T]): scala.Unit
  // handler double click
  def onDoubleClick[T](event: ViewerMouseEvent[T]): scala.Unit
  // handler mousedown
  def onMouseDown[T](event: ViewerMouseEvent[T]): scala.Unit
  // handler mousemove
  def onMouseMove[T](event: ViewerMouseEvent[T]): scala.Unit
  // handler mouseup
  def onMouseUp[T](event: ViewerMouseEvent[T]): scala.Unit
}

object OptionalProps {
  @scala.inline
  def apply(
    SVGBackground: java.lang.String,
    background: java.lang.String,
    className: java.lang.String,
    customToolbar: (reactLib.reactMod.Component[_, js.Object, _]) | reactLib.reactMod.ReactNs.StatelessComponent[_],
    detectAutoPan: scala.Boolean,
    detectWheel: scala.Boolean,
    modifierKeys: js.Array[java.lang.String],
    onChangeTool: Tool => scala.Unit,
    onChangeValue: Value => scala.Unit,
    onClick: ViewerMouseEvent[js.Any] => scala.Unit,
    onDoubleClick: ViewerMouseEvent[js.Any] => scala.Unit,
    onMouseDown: ViewerMouseEvent[js.Any] => scala.Unit,
    onMouseMove: ViewerMouseEvent[js.Any] => scala.Unit,
    onMouseUp: ViewerMouseEvent[js.Any] => scala.Unit,
    preventPanOutside: scala.Boolean,
    scaleFactor: scala.Double,
    style: js.Object,
    tool: Tool,
    toolbarPosition: ToolbarPosition,
    value: Value = null
  ): OptionalProps = {
    val __obj = js.Dynamic.literal(SVGBackground = SVGBackground, background = background, className = className, customToolbar = customToolbar.asInstanceOf[js.Any], detectAutoPan = detectAutoPan, detectWheel = detectWheel, modifierKeys = modifierKeys, onChangeTool = js.Any.fromFunction1(onChangeTool), onChangeValue = js.Any.fromFunction1(onChangeValue), onClick = js.Any.fromFunction1(onClick), onDoubleClick = js.Any.fromFunction1(onDoubleClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseUp = js.Any.fromFunction1(onMouseUp), preventPanOutside = preventPanOutside, scaleFactor = scaleFactor, style = style, tool = tool, toolbarPosition = toolbarPosition)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OptionalProps]
  }
}

