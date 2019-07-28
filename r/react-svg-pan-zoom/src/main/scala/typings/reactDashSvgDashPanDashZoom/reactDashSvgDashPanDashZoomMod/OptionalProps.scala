package typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomMod

import typings.react.reactMod.Component
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalProps extends js.Object {
  // background of the svg
  var SVGBackground: String
  // background of the viewer
  var background: String
  // className of the Viewer
  var className: String
  // override default toolbar component
  // TODO: specify function type more clearly
  var customToolbar: (Component[_, js.Object, _]) | StatelessComponent[_]
  // perform PAN if the mouse is on viewer border
  var detectAutoPan: Boolean
  // detect zoom operation performed trough pinch gesture or mouse scroll
  var detectWheel: Boolean
  // modifier keys //https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/getModifierState
  var modifierKeys: js.Array[String]
  // if disabled the user can move the image outside the viewer
  var preventPanOutside: Boolean
  // how much scale in or out
  var scaleFactor: Double
  // CSS style of the Viewer
  var style: js.Object
  // current active tool (TOOL_NONE, TOOL_PAN, TOOL_ZOOM_IN, TOOL_ZOOM_OUT)
  var tool: Tool
  // toolbar position
  var toolbarPosition: ToolbarPosition
  // value of the viewer (current point of view)
  var value: Value | Null
  // handler tool changed
  def onChangeTool(tool: Tool): Unit
  // handler something changed
  def onChangeValue(value: Value): Unit
  // Note: The `T` type parameter is the type of the `target` of the event:
  // handler click
  def onClick[T](event: ViewerMouseEvent[T]): Unit
  // handler double click
  def onDoubleClick[T](event: ViewerMouseEvent[T]): Unit
  // handler mousedown
  def onMouseDown[T](event: ViewerMouseEvent[T]): Unit
  // handler mousemove
  def onMouseMove[T](event: ViewerMouseEvent[T]): Unit
  // handler mouseup
  def onMouseUp[T](event: ViewerMouseEvent[T]): Unit
}

object OptionalProps {
  @scala.inline
  def apply(
    SVGBackground: String,
    background: String,
    className: String,
    customToolbar: (Component[_, js.Object, _]) | StatelessComponent[_],
    detectAutoPan: Boolean,
    detectWheel: Boolean,
    modifierKeys: js.Array[String],
    onChangeTool: Tool => Unit,
    onChangeValue: Value => Unit,
    onClick: ViewerMouseEvent[js.Any] => Unit,
    onDoubleClick: ViewerMouseEvent[js.Any] => Unit,
    onMouseDown: ViewerMouseEvent[js.Any] => Unit,
    onMouseMove: ViewerMouseEvent[js.Any] => Unit,
    onMouseUp: ViewerMouseEvent[js.Any] => Unit,
    preventPanOutside: Boolean,
    scaleFactor: Double,
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

