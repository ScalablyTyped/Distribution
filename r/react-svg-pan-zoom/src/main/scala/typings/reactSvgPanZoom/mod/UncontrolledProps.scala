package typings.reactSvgPanZoom.mod

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import typings.reactSvgPanZoom.anon.Background
import typings.reactSvgPanZoom.anon.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-svg-pan-zoom.react-svg-pan-zoom.UncontrolledRequiredProps & std.Partial<react-svg-pan-zoom.react-svg-pan-zoom.OptionalProps> & std.Partial<react-svg-pan-zoom.react-svg-pan-zoom.UncontrolledExtraOptionalProps> */
@js.native
trait UncontrolledProps extends js.Object {
  
  var SVGBackground: js.UndefOr[String] = js.native
  
  var background: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var customMiniature: js.UndefOr[ReactElement | ComponentType[js.Object]] = js.native
  
  var customToolbar: js.UndefOr[(Component[_, js.Object, _]) | StatelessComponent[_]] = js.native
  
  var detectAutoPan: js.UndefOr[Boolean] = js.native
  
  var detectPinchGesture: js.UndefOr[Boolean] = js.native
  
  var detectWheel: js.UndefOr[Boolean] = js.native
  
  var disableDoubleClickZoomWithToolAuto: js.UndefOr[Boolean] = js.native
  
  // height of the viewer displayed on screen
  var height: Double = js.native
  
  var miniatureProps: js.UndefOr[Background] = js.native
  
  var modifierKeys: js.UndefOr[js.Array[String]] = js.native
  
  var onChangeTool: js.UndefOr[js.Function1[/* tool */ Tool, Unit]] = js.native
  
  var onChangeValue: js.UndefOr[js.Function1[/* value */ Value, Unit]] = js.native
  
  var onClick: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.native
  
  var onDoubleClick: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.native
  
  var onMouseDown: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.native
  
  var onMouseMove: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.native
  
  var onMouseUp: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.native
  
  var onPan: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.native
  
  var onZoom: js.UndefOr[js.Function1[/* event */ ViewerMouseEvent[_], Unit]] = js.native
  
  var preventPanOutside: js.UndefOr[Boolean] = js.native
  
  var scaleFactor: js.UndefOr[Double] = js.native
  
  var scaleFactorMax: js.UndefOr[Double] = js.native
  
  var scaleFactorMin: js.UndefOr[Double] = js.native
  
  var scaleFactorOnWheel: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var tool: js.UndefOr[Tool] = js.native
  
  var toolbarProps: js.UndefOr[Position] = js.native
  
  var value: js.UndefOr[Value | Null] = js.native
  
  // width of the viewer displayed on screen
  var width: Double = js.native
}
object UncontrolledProps {
  
  @scala.inline
  def apply(height: Double, width: Double): UncontrolledProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncontrolledProps]
  }
  
  @scala.inline
  implicit class UncontrolledPropsOps[Self <: UncontrolledProps] (val x: Self) extends AnyVal {
    
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
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVGBackground(value: String): Self = this.set("SVGBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSVGBackground: Self = this.set("SVGBackground", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCustomMiniature(value: ReactElement | ComponentType[js.Object]): Self = this.set("customMiniature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomMiniature: Self = this.set("customMiniature", js.undefined)
    
    @scala.inline
    def setCustomToolbar(value: (Component[_, js.Object, _]) | StatelessComponent[_]): Self = this.set("customToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomToolbar: Self = this.set("customToolbar", js.undefined)
    
    @scala.inline
    def setDetectAutoPan(value: Boolean): Self = this.set("detectAutoPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectAutoPan: Self = this.set("detectAutoPan", js.undefined)
    
    @scala.inline
    def setDetectPinchGesture(value: Boolean): Self = this.set("detectPinchGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectPinchGesture: Self = this.set("detectPinchGesture", js.undefined)
    
    @scala.inline
    def setDetectWheel(value: Boolean): Self = this.set("detectWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectWheel: Self = this.set("detectWheel", js.undefined)
    
    @scala.inline
    def setDisableDoubleClickZoomWithToolAuto(value: Boolean): Self = this.set("disableDoubleClickZoomWithToolAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDoubleClickZoomWithToolAuto: Self = this.set("disableDoubleClickZoomWithToolAuto", js.undefined)
    
    @scala.inline
    def setMiniatureProps(value: Background): Self = this.set("miniatureProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiniatureProps: Self = this.set("miniatureProps", js.undefined)
    
    @scala.inline
    def setModifierKeysVarargs(value: String*): Self = this.set("modifierKeys", js.Array(value :_*))
    
    @scala.inline
    def setModifierKeys(value: js.Array[String]): Self = this.set("modifierKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifierKeys: Self = this.set("modifierKeys", js.undefined)
    
    @scala.inline
    def setOnChangeTool(value: /* tool */ Tool => Unit): Self = this.set("onChangeTool", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChangeTool: Self = this.set("onChangeTool", js.undefined)
    
    @scala.inline
    def setOnChangeValue(value: /* value */ Value => Unit): Self = this.set("onChangeValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChangeValue: Self = this.set("onChangeValue", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* event */ ViewerMouseEvent[_] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: /* event */ ViewerMouseEvent[_] => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: /* event */ ViewerMouseEvent[_] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: /* event */ ViewerMouseEvent[_] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: /* event */ ViewerMouseEvent[_] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    
    @scala.inline
    def setOnPan(value: /* event */ ViewerMouseEvent[_] => Unit): Self = this.set("onPan", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPan: Self = this.set("onPan", js.undefined)
    
    @scala.inline
    def setOnZoom(value: /* event */ ViewerMouseEvent[_] => Unit): Self = this.set("onZoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnZoom: Self = this.set("onZoom", js.undefined)
    
    @scala.inline
    def setPreventPanOutside(value: Boolean): Self = this.set("preventPanOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventPanOutside: Self = this.set("preventPanOutside", js.undefined)
    
    @scala.inline
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleFactor: Self = this.set("scaleFactor", js.undefined)
    
    @scala.inline
    def setScaleFactorMax(value: Double): Self = this.set("scaleFactorMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleFactorMax: Self = this.set("scaleFactorMax", js.undefined)
    
    @scala.inline
    def setScaleFactorMin(value: Double): Self = this.set("scaleFactorMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleFactorMin: Self = this.set("scaleFactorMin", js.undefined)
    
    @scala.inline
    def setScaleFactorOnWheel(value: Double): Self = this.set("scaleFactorOnWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleFactorOnWheel: Self = this.set("scaleFactorOnWheel", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTool(value: Tool): Self = this.set("tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTool: Self = this.set("tool", js.undefined)
    
    @scala.inline
    def setToolbarProps(value: Position): Self = this.set("toolbarProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarProps: Self = this.set("toolbarProps", js.undefined)
    
    @scala.inline
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
