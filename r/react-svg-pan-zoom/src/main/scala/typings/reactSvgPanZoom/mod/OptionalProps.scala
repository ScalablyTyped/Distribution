package typings.reactSvgPanZoom.mod

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import typings.reactSvgPanZoom.AnonBackground
import typings.reactSvgPanZoom.AnonBottom
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
  var customMiniature: ReactElement | ComponentType[js.Object]
  // override default toolbar component
  // TODO: specify function type more clearly
  var customToolbar: (Component[_, js.Object, _]) | StatelessComponent[_]
  // perform PAN if the mouse is on viewer border
  var detectAutoPan: Boolean
  var detectPinchGesture: Boolean
  // detect zoom operation performed trough pinch gesture or mouse scroll
  var detectWheel: Boolean
  // Turn off zoom on double click
  var disableDoubleClickZoomWithToolAuto: Boolean
  var miniatureProps: AnonBackground
  // modifier keys //https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/getModifierState
  var modifierKeys: js.Array[String]
  // if disabled the user can move the image outside the viewer
  var preventPanOutside: Boolean
  // how much scale in or out
  var scaleFactor: Double
  // maximum amount of scale a user can zoom in to
  var scaleFactorMax: Double
  // minimum amount of a scale a user can zoom out of
  var scaleFactorMin: Double
  // how much scale in or out on mouse wheel (requires detectWheel enabled)
  var scaleFactorOnWheel: Double
  // CSS style of the Viewer
  var style: js.Object
  var toolbarProps: AnonBottom
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
  // handler pan action performed
  def onPan[T](event: ViewerMouseEvent[T]): Unit
  // handler zoom level changed
  def onZoom[T](event: ViewerMouseEvent[T]): Unit
}

object OptionalProps {
  @scala.inline
  def apply(
    SVGBackground: String,
    background: String,
    className: String,
    customMiniature: ReactElement | ComponentType[js.Object],
    customToolbar: (Component[_, js.Object, _]) | StatelessComponent[_],
    detectAutoPan: Boolean,
    detectPinchGesture: Boolean,
    detectWheel: Boolean,
    disableDoubleClickZoomWithToolAuto: Boolean,
    miniatureProps: AnonBackground,
    modifierKeys: js.Array[String],
    onClick: ViewerMouseEvent[js.Any] => Unit,
    onDoubleClick: ViewerMouseEvent[js.Any] => Unit,
    onMouseDown: ViewerMouseEvent[js.Any] => Unit,
    onMouseMove: ViewerMouseEvent[js.Any] => Unit,
    onMouseUp: ViewerMouseEvent[js.Any] => Unit,
    onPan: ViewerMouseEvent[js.Any] => Unit,
    onZoom: ViewerMouseEvent[js.Any] => Unit,
    preventPanOutside: Boolean,
    scaleFactor: Double,
    scaleFactorMax: Double,
    scaleFactorMin: Double,
    scaleFactorOnWheel: Double,
    style: js.Object,
    toolbarProps: AnonBottom
  ): OptionalProps = {
    val __obj = js.Dynamic.literal(SVGBackground = SVGBackground.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], customMiniature = customMiniature.asInstanceOf[js.Any], customToolbar = customToolbar.asInstanceOf[js.Any], detectAutoPan = detectAutoPan.asInstanceOf[js.Any], detectPinchGesture = detectPinchGesture.asInstanceOf[js.Any], detectWheel = detectWheel.asInstanceOf[js.Any], disableDoubleClickZoomWithToolAuto = disableDoubleClickZoomWithToolAuto.asInstanceOf[js.Any], miniatureProps = miniatureProps.asInstanceOf[js.Any], modifierKeys = modifierKeys.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onDoubleClick = js.Any.fromFunction1(onDoubleClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseUp = js.Any.fromFunction1(onMouseUp), onPan = js.Any.fromFunction1(onPan), onZoom = js.Any.fromFunction1(onZoom), preventPanOutside = preventPanOutside.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any], scaleFactorMax = scaleFactorMax.asInstanceOf[js.Any], scaleFactorMin = scaleFactorMin.asInstanceOf[js.Any], scaleFactorOnWheel = scaleFactorOnWheel.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], toolbarProps = toolbarProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OptionalProps]
  }
}

