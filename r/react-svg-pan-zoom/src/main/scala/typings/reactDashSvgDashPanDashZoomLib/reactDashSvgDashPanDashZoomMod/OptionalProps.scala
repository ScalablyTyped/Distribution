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
    onChangeTool: js.Function1[Tool, scala.Unit],
    onChangeValue: js.Function1[Value, scala.Unit],
    onClick: js.Function1[ViewerMouseEvent[js.Any], scala.Unit],
    onDoubleClick: js.Function1[ViewerMouseEvent[js.Any], scala.Unit],
    onMouseDown: js.Function1[ViewerMouseEvent[js.Any], scala.Unit],
    onMouseMove: js.Function1[ViewerMouseEvent[js.Any], scala.Unit],
    onMouseUp: js.Function1[ViewerMouseEvent[js.Any], scala.Unit],
    preventPanOutside: scala.Boolean,
    scaleFactor: scala.Double,
    style: js.Object,
    tool: Tool,
    toolbarPosition: ToolbarPosition,
    value: Value = null
  ): OptionalProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SVGBackground")(SVGBackground)
    __obj.updateDynamic("background")(background)
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("customToolbar")(customToolbar.asInstanceOf[js.Any])
    __obj.updateDynamic("detectAutoPan")(detectAutoPan)
    __obj.updateDynamic("detectWheel")(detectWheel)
    __obj.updateDynamic("modifierKeys")(modifierKeys)
    __obj.updateDynamic("onChangeTool")(onChangeTool)
    __obj.updateDynamic("onChangeValue")(onChangeValue)
    __obj.updateDynamic("onClick")(onClick)
    __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    __obj.updateDynamic("onMouseDown")(onMouseDown)
    __obj.updateDynamic("onMouseMove")(onMouseMove)
    __obj.updateDynamic("onMouseUp")(onMouseUp)
    __obj.updateDynamic("preventPanOutside")(preventPanOutside)
    __obj.updateDynamic("scaleFactor")(scaleFactor)
    __obj.updateDynamic("style")(style)
    __obj.updateDynamic("tool")(tool)
    __obj.updateDynamic("toolbarPosition")(toolbarPosition)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OptionalProps]
  }
}

