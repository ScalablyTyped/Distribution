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

