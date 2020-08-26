package typings.reactSvgPanZoom.mod

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import typings.reactSvgPanZoom.anon.Background
import typings.reactSvgPanZoom.anon.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalProps extends js.Object {
  // background of the svg
  var SVGBackground: String = js.native
  // background of the viewer
  var background: String = js.native
  // className of the Viewer
  var className: String = js.native
  var customMiniature: ReactElement | ComponentType[js.Object] = js.native
  // override default toolbar component
  // TODO: specify function type more clearly
  var customToolbar: (Component[_, js.Object, _]) | StatelessComponent[_] = js.native
  // perform PAN if the mouse is on viewer border
  var detectAutoPan: Boolean = js.native
  var detectPinchGesture: Boolean = js.native
  // detect zoom operation performed trough pinch gesture or mouse scroll
  var detectWheel: Boolean = js.native
  // Turn off zoom on double click
  var disableDoubleClickZoomWithToolAuto: Boolean = js.native
  var miniatureProps: Background = js.native
  // modifier keys //https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/getModifierState
  var modifierKeys: js.Array[String] = js.native
  // if disabled the user can move the image outside the viewer
  var preventPanOutside: Boolean = js.native
  // how much scale in or out
  var scaleFactor: Double = js.native
  // maximum amount of scale a user can zoom in to
  var scaleFactorMax: Double = js.native
  // minimum amount of a scale a user can zoom out of
  var scaleFactorMin: Double = js.native
  // how much scale in or out on mouse wheel (requires detectWheel enabled)
  var scaleFactorOnWheel: Double = js.native
  // CSS style of the Viewer
  var style: js.Object = js.native
  var toolbarProps: Position = js.native
  // Note: The `T` type parameter is the type of the `target` of the event:
  // handler click
  def onClick[T](event: ViewerMouseEvent[T]): Unit = js.native
  // handler double click
  def onDoubleClick[T](event: ViewerMouseEvent[T]): Unit = js.native
  // handler mousedown
  def onMouseDown[T](event: ViewerMouseEvent[T]): Unit = js.native
  // handler mousemove
  def onMouseMove[T](event: ViewerMouseEvent[T]): Unit = js.native
  // handler mouseup
  def onMouseUp[T](event: ViewerMouseEvent[T]): Unit = js.native
  // handler pan action performed
  def onPan[T](event: ViewerMouseEvent[T]): Unit = js.native
  // handler zoom level changed
  def onZoom[T](event: ViewerMouseEvent[T]): Unit = js.native
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
    miniatureProps: Background,
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
    toolbarProps: Position
  ): OptionalProps = {
    val __obj = js.Dynamic.literal(SVGBackground = SVGBackground.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], customMiniature = customMiniature.asInstanceOf[js.Any], customToolbar = customToolbar.asInstanceOf[js.Any], detectAutoPan = detectAutoPan.asInstanceOf[js.Any], detectPinchGesture = detectPinchGesture.asInstanceOf[js.Any], detectWheel = detectWheel.asInstanceOf[js.Any], disableDoubleClickZoomWithToolAuto = disableDoubleClickZoomWithToolAuto.asInstanceOf[js.Any], miniatureProps = miniatureProps.asInstanceOf[js.Any], modifierKeys = modifierKeys.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onDoubleClick = js.Any.fromFunction1(onDoubleClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseUp = js.Any.fromFunction1(onMouseUp), onPan = js.Any.fromFunction1(onPan), onZoom = js.Any.fromFunction1(onZoom), preventPanOutside = preventPanOutside.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any], scaleFactorMax = scaleFactorMax.asInstanceOf[js.Any], scaleFactorMin = scaleFactorMin.asInstanceOf[js.Any], scaleFactorOnWheel = scaleFactorOnWheel.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], toolbarProps = toolbarProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalProps]
  }
  @scala.inline
  implicit class OptionalPropsOps[Self <: OptionalProps] (val x: Self) extends AnyVal {
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
    def setSVGBackground(value: String): Self = this.set("SVGBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomMiniature(value: ReactElement | ComponentType[js.Object]): Self = this.set("customMiniature", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomToolbar(value: (Component[_, js.Object, _]) | StatelessComponent[_]): Self = this.set("customToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetectAutoPan(value: Boolean): Self = this.set("detectAutoPan", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetectPinchGesture(value: Boolean): Self = this.set("detectPinchGesture", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetectWheel(value: Boolean): Self = this.set("detectWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableDoubleClickZoomWithToolAuto(value: Boolean): Self = this.set("disableDoubleClickZoomWithToolAuto", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiniatureProps(value: Background): Self = this.set("miniatureProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifierKeysVarargs(value: String*): Self = this.set("modifierKeys", js.Array(value :_*))
    @scala.inline
    def setModifierKeys(value: js.Array[String]): Self = this.set("modifierKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClick(value: ViewerMouseEvent[js.Any] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDoubleClick(value: ViewerMouseEvent[js.Any] => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMouseDown(value: ViewerMouseEvent[js.Any] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMouseMove(value: ViewerMouseEvent[js.Any] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMouseUp(value: ViewerMouseEvent[js.Any] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def setOnPan(value: ViewerMouseEvent[js.Any] => Unit): Self = this.set("onPan", js.Any.fromFunction1(value))
    @scala.inline
    def setOnZoom(value: ViewerMouseEvent[js.Any] => Unit): Self = this.set("onZoom", js.Any.fromFunction1(value))
    @scala.inline
    def setPreventPanOutside(value: Boolean): Self = this.set("preventPanOutside", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleFactorMax(value: Double): Self = this.set("scaleFactorMax", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleFactorMin(value: Double): Self = this.set("scaleFactorMin", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleFactorOnWheel(value: Double): Self = this.set("scaleFactorOnWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolbarProps(value: Position): Self = this.set("toolbarProps", value.asInstanceOf[js.Any])
  }
  
}

