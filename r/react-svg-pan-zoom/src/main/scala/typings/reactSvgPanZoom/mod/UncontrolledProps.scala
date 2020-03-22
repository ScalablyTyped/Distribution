package typings.reactSvgPanZoom.mod

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import typings.reactSvgPanZoom.AnonBackground
import typings.reactSvgPanZoom.AnonPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-svg-pan-zoom.react-svg-pan-zoom.UncontrolledRequiredProps & std.Partial<react-svg-pan-zoom.react-svg-pan-zoom.OptionalProps> & std.Partial<react-svg-pan-zoom.react-svg-pan-zoom.UncontrolledExtraOptionalProps> */
trait UncontrolledProps extends js.Object {
  var SVGBackground: js.UndefOr[String] = js.undefined
  var background: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var customMiniature: js.UndefOr[ReactElement | ComponentType[js.Object]] = js.undefined
  var customToolbar: js.UndefOr[(Component[_, js.Object, _]) | StatelessComponent[_]] = js.undefined
  var detectAutoPan: js.UndefOr[Boolean] = js.undefined
  var detectPinchGesture: js.UndefOr[Boolean] = js.undefined
  var detectWheel: js.UndefOr[Boolean] = js.undefined
  var disableDoubleClickZoomWithToolAuto: js.UndefOr[Boolean] = js.undefined
  // height of the viewer displayed on screen
  var height: Double
  var miniatureProps: js.UndefOr[AnonBackground] = js.undefined
  var modifierKeys: js.UndefOr[js.Array[String]] = js.undefined
  var onChangeTool: js.UndefOr[js.Function1[/* tool */ Tool, Unit]] = js.undefined
  var onChangeValue: js.UndefOr[js.Function1[/* value */ Value, Unit]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.undefined
  var onDoubleClick: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.undefined
  var onMouseMove: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.undefined
  var onMouseUp: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.undefined
  var onPan: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.undefined
  var onZoom: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.undefined
  var preventPanOutside: js.UndefOr[Boolean] = js.undefined
  var scaleFactor: js.UndefOr[Double] = js.undefined
  var scaleFactorMax: js.UndefOr[Double] = js.undefined
  var scaleFactorMin: js.UndefOr[Double] = js.undefined
  var scaleFactorOnWheel: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tool: js.UndefOr[Tool] = js.undefined
  var toolbarProps: js.UndefOr[AnonPosition] = js.undefined
  var value: js.UndefOr[Value] = js.undefined
  // width of the viewer displayed on screen
  var width: Double
}

object UncontrolledProps {
  @scala.inline
  def apply(
    height: Double,
    width: Double,
    SVGBackground: String = null,
    background: String = null,
    className: String = null,
    customMiniature: ReactElement | ComponentType[js.Object] = null,
    customToolbar: (Component[_, js.Object, _]) | StatelessComponent[_] = null,
    detectAutoPan: js.UndefOr[Boolean] = js.undefined,
    detectPinchGesture: js.UndefOr[Boolean] = js.undefined,
    detectWheel: js.UndefOr[Boolean] = js.undefined,
    disableDoubleClickZoomWithToolAuto: js.UndefOr[Boolean] = js.undefined,
    miniatureProps: AnonBackground = null,
    modifierKeys: js.Array[String] = null,
    onChangeTool: /* tool */ Tool => Unit = null,
    onChangeValue: /* value */ Value => Unit = null,
    onClick: /* event */ ViewerMouseEvent[_] => Unit = null,
    onDoubleClick: /* event */ ViewerMouseEvent[_] => Unit = null,
    onMouseDown: /* event */ ViewerMouseEvent[_] => Unit = null,
    onMouseMove: /* event */ ViewerMouseEvent[_] => Unit = null,
    onMouseUp: /* event */ ViewerMouseEvent[_] => Unit = null,
    onPan: /* event */ ViewerMouseEvent[_] => Unit = null,
    onZoom: /* event */ ViewerMouseEvent[_] => Unit = null,
    preventPanOutside: js.UndefOr[Boolean] = js.undefined,
    scaleFactor: Int | Double = null,
    scaleFactorMax: Int | Double = null,
    scaleFactorMin: Int | Double = null,
    scaleFactorOnWheel: Int | Double = null,
    style: js.Object = null,
    tool: Tool = null,
    toolbarProps: AnonPosition = null,
    value: Value = null
  ): UncontrolledProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (SVGBackground != null) __obj.updateDynamic("SVGBackground")(SVGBackground.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customMiniature != null) __obj.updateDynamic("customMiniature")(customMiniature.asInstanceOf[js.Any])
    if (customToolbar != null) __obj.updateDynamic("customToolbar")(customToolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(detectAutoPan)) __obj.updateDynamic("detectAutoPan")(detectAutoPan.asInstanceOf[js.Any])
    if (!js.isUndefined(detectPinchGesture)) __obj.updateDynamic("detectPinchGesture")(detectPinchGesture.asInstanceOf[js.Any])
    if (!js.isUndefined(detectWheel)) __obj.updateDynamic("detectWheel")(detectWheel.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDoubleClickZoomWithToolAuto)) __obj.updateDynamic("disableDoubleClickZoomWithToolAuto")(disableDoubleClickZoomWithToolAuto.asInstanceOf[js.Any])
    if (miniatureProps != null) __obj.updateDynamic("miniatureProps")(miniatureProps.asInstanceOf[js.Any])
    if (modifierKeys != null) __obj.updateDynamic("modifierKeys")(modifierKeys.asInstanceOf[js.Any])
    if (onChangeTool != null) __obj.updateDynamic("onChangeTool")(js.Any.fromFunction1(onChangeTool))
    if (onChangeValue != null) __obj.updateDynamic("onChangeValue")(js.Any.fromFunction1(onChangeValue))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPan != null) __obj.updateDynamic("onPan")(js.Any.fromFunction1(onPan))
    if (onZoom != null) __obj.updateDynamic("onZoom")(js.Any.fromFunction1(onZoom))
    if (!js.isUndefined(preventPanOutside)) __obj.updateDynamic("preventPanOutside")(preventPanOutside.asInstanceOf[js.Any])
    if (scaleFactor != null) __obj.updateDynamic("scaleFactor")(scaleFactor.asInstanceOf[js.Any])
    if (scaleFactorMax != null) __obj.updateDynamic("scaleFactorMax")(scaleFactorMax.asInstanceOf[js.Any])
    if (scaleFactorMin != null) __obj.updateDynamic("scaleFactorMin")(scaleFactorMin.asInstanceOf[js.Any])
    if (scaleFactorOnWheel != null) __obj.updateDynamic("scaleFactorOnWheel")(scaleFactorOnWheel.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tool != null) __obj.updateDynamic("tool")(tool.asInstanceOf[js.Any])
    if (toolbarProps != null) __obj.updateDynamic("toolbarProps")(toolbarProps.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncontrolledProps]
  }
}

