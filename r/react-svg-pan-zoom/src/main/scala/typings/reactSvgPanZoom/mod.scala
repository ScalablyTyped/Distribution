package typings.reactSvgPanZoom

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import typings.react.mod.TouchEvent
import typings.reactSvgPanZoom.anon.Background
import typings.reactSvgPanZoom.anon.Position
import typings.reactSvgPanZoom.reactSvgPanZoomNumbers.`2`
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-svg-pan-zoom", "ALIGN_BOTTOM")
  @js.native
  val ALIGN_BOTTOM: /* "bottom" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "ALIGN_CENTER")
  @js.native
  val ALIGN_CENTER: /* "center" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "ALIGN_LEFT")
  @js.native
  val ALIGN_LEFT: /* "left" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "ALIGN_RIGHT")
  @js.native
  val ALIGN_RIGHT: /* "right" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "ALIGN_TOP")
  @js.native
  val ALIGN_TOP: /* "top" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "MODE_IDLE")
  @js.native
  val MODE_IDLE: /* "idle" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "MODE_PANNING")
  @js.native
  val MODE_PANNING: /* "panning" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "MODE_ZOOMING")
  @js.native
  val MODE_ZOOMING: /* "zooming" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "POSITION_BOTTOM")
  @js.native
  val POSITION_BOTTOM: /* "bottom" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "POSITION_LEFT")
  @js.native
  val POSITION_LEFT: /* "left" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "POSITION_NONE")
  @js.native
  val POSITION_NONE: /* "none" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "POSITION_RIGHT")
  @js.native
  val POSITION_RIGHT: /* "right" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "POSITION_TOP")
  @js.native
  val POSITION_TOP: /* "top" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "ReactSVGPanZoom")
  @js.native
  class ReactSVGPanZoom protected ()
    extends Component[Props, js.Object, js.Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
    
    def fitSelection(
      selectionSVGPointX: Double,
      selectionSVGPointY: Double,
      selectionWidth: Double,
      selectionHeight: Double
    ): Unit = js.native
    
    def fitToViewer(): Unit = js.native
    
    def getTool(): Tool = js.native
    
    def getValue(): Value = js.native
    
    def pan(SVGDeltaX: Double, SVGDeltaY: Double): Unit = js.native
    
    def reset(): Unit = js.native
    
    def setPointOnViewerCenter(SVGPointX: Double, SVGPointY: Double, zoomLevel: Double): Unit = js.native
    
    def setTool(tool: Tool): Unit = js.native
    
    def setValue(value: Value): Unit = js.native
    
    def zoom(SVGPointX: Double, SVGPointY: Double, scaleFactor: Double): Unit = js.native
    
    def zoomOnViewerCenter(scaleFactor: Double): Unit = js.native
  }
  
  @JSImport("react-svg-pan-zoom", "TOOL_AUTO")
  @js.native
  val TOOL_AUTO: /* "auto" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "TOOL_NONE")
  @js.native
  val TOOL_NONE: /* "none" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "TOOL_PAN")
  @js.native
  val TOOL_PAN: /* "pan" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "TOOL_ZOOM_IN")
  @js.native
  val TOOL_ZOOM_IN: /* "zoom-in" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "TOOL_ZOOM_OUT")
  @js.native
  val TOOL_ZOOM_OUT: /* "zoom-out" */ String = js.native
  
  @JSImport("react-svg-pan-zoom", "UncontrolledReactSVGPanZoom")
  @js.native
  class UncontrolledReactSVGPanZoom protected ()
    extends Component[UncontrolledProps, js.Object, js.Any] {
    def this(props: UncontrolledProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: UncontrolledProps, context: js.Any) = this()
    
    def fitSelection(
      selectionSVGPointX: Double,
      selectionSVGPointY: Double,
      selectionWidth: Double,
      selectionHeight: Double
    ): Unit = js.native
    
    def fitToViewer(): Unit = js.native
    
    def getTool(): Tool = js.native
    
    def getValue(): Value = js.native
    
    def pan(SVGDeltaX: Double, SVGDeltaY: Double): Unit = js.native
    
    def reset(): Unit = js.native
    
    def setPointOnViewerCenter(SVGPointX: Double, SVGPointY: Double, zoomLevel: Double): Unit = js.native
    
    def setTool(tool: Tool): Unit = js.native
    
    def setValue(value: Value): Unit = js.native
    
    def zoom(SVGPointX: Double, SVGPointY: Double, scaleFactor: Double): Unit = js.native
    
    def zoomOnViewerCenter(scaleFactor: Double): Unit = js.native
  }
  
  @JSImport("react-svg-pan-zoom", "fitSelection")
  @js.native
  def fitSelection(
    value: Value,
    selectionSVGPointX: Double,
    selectionSVGPointY: Double,
    selectionWidth: Double,
    selectionHeight: Double
  ): Value = js.native
  
  @JSImport("react-svg-pan-zoom", "fitToViewer")
  @js.native
  def fitToViewer(value: Value): Value = js.native
  
  @JSImport("react-svg-pan-zoom", "pan")
  @js.native
  def pan(value: Value, SVGDeltaX: Double, SVGDeltaY: Double): Value = js.native
  @JSImport("react-svg-pan-zoom", "pan")
  @js.native
  def pan(value: Value, SVGDeltaX: Double, SVGDeltaY: Double, panLimit: Double): Value = js.native
  
  @JSImport("react-svg-pan-zoom", "reset")
  @js.native
  def reset(value: Value): Value = js.native
  
  @JSImport("react-svg-pan-zoom", "setPointOnViewerCenter")
  @js.native
  def setPointOnViewerCenter(value: Value, SVGPointX: Double, SVGPointY: Double, zoomLevel: Double): Value = js.native
  
  @JSImport("react-svg-pan-zoom", "zoom")
  @js.native
  def zoom(value: Value, SVGPointX: Double, SVGPointY: Double, scaleFactor: Double): Value = js.native
  
  @JSImport("react-svg-pan-zoom", "zoomOnViewerCenter")
  @js.native
  def zoomOnViewerCenter(value: Value, scaleFactor: Double): Value = js.native
  
  type Mode = /* "idle" */ String
  
  @js.native
  trait OptionalProps extends StObject {
    
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
    implicit class OptionalPropsMutableBuilder[Self <: OptionalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomMiniature(value: ReactElement | ComponentType[js.Object]): Self = StObject.set(x, "customMiniature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomToolbar(value: (Component[_, js.Object, _]) | StatelessComponent[_]): Self = StObject.set(x, "customToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectAutoPan(value: Boolean): Self = StObject.set(x, "detectAutoPan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectPinchGesture(value: Boolean): Self = StObject.set(x, "detectPinchGesture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectWheel(value: Boolean): Self = StObject.set(x, "detectWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDoubleClickZoomWithToolAuto(value: Boolean): Self = StObject.set(x, "disableDoubleClickZoomWithToolAuto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiniatureProps(value: Background): Self = StObject.set(x, "miniatureProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifierKeys(value: js.Array[String]): Self = StObject.set(x, "modifierKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifierKeysVarargs(value: String*): Self = StObject.set(x, "modifierKeys", js.Array(value :_*))
      
      @scala.inline
      def setOnClick(value: ViewerMouseEvent[js.Any] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClick(value: ViewerMouseEvent[js.Any] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDown(value: ViewerMouseEvent[js.Any] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMove(value: ViewerMouseEvent[js.Any] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUp(value: ViewerMouseEvent[js.Any] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPan(value: ViewerMouseEvent[js.Any] => Unit): Self = StObject.set(x, "onPan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnZoom(value: ViewerMouseEvent[js.Any] => Unit): Self = StObject.set(x, "onZoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreventPanOutside(value: Boolean): Self = StObject.set(x, "preventPanOutside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSVGBackground(value: String): Self = StObject.set(x, "SVGBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactorMax(value: Double): Self = StObject.set(x, "scaleFactorMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactorMin(value: Double): Self = StObject.set(x, "scaleFactorMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactorOnWheel(value: Double): Self = StObject.set(x, "scaleFactorOnWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarProps(value: Position): Self = StObject.set(x, "toolbarProps", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Point extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Point {
    
    @scala.inline
    def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-svg-pan-zoom.react-svg-pan-zoom.RequiredProps & std.Partial<react-svg-pan-zoom.react-svg-pan-zoom.OptionalProps> */
  @js.native
  trait Props extends StObject {
    
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
    
    // handler tool changed
    def onChangeTool(tool: Tool): Unit = js.native
    
    // handler something changed
    def onChangeValue(value: Value): Unit = js.native
    
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
    
    // current active tool (TOOL_NONE, TOOL_PAN, TOOL_ZOOM_IN, TOOL_ZOOM_OUT)
    var tool: Tool = js.native
    
    var toolbarProps: js.UndefOr[Position] = js.native
    
    // value of the viewer (current point of view)
    var value: Value | Null = js.native
    
    // width of the viewer displayed on screen
    var width: Double = js.native
  }
  object Props {
    
    @scala.inline
    def apply(
      height: Double,
      onChangeTool: Tool => Unit,
      onChangeValue: Value => Unit,
      tool: Tool,
      width: Double
    ): Props = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], onChangeTool = js.Any.fromFunction1(onChangeTool), onChangeValue = js.Any.fromFunction1(onChangeValue), tool = tool.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCustomMiniature(value: ReactElement | ComponentType[js.Object]): Self = StObject.set(x, "customMiniature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomMiniatureUndefined: Self = StObject.set(x, "customMiniature", js.undefined)
      
      @scala.inline
      def setCustomToolbar(value: (Component[_, js.Object, _]) | StatelessComponent[_]): Self = StObject.set(x, "customToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomToolbarUndefined: Self = StObject.set(x, "customToolbar", js.undefined)
      
      @scala.inline
      def setDetectAutoPan(value: Boolean): Self = StObject.set(x, "detectAutoPan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectAutoPanUndefined: Self = StObject.set(x, "detectAutoPan", js.undefined)
      
      @scala.inline
      def setDetectPinchGesture(value: Boolean): Self = StObject.set(x, "detectPinchGesture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectPinchGestureUndefined: Self = StObject.set(x, "detectPinchGesture", js.undefined)
      
      @scala.inline
      def setDetectWheel(value: Boolean): Self = StObject.set(x, "detectWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectWheelUndefined: Self = StObject.set(x, "detectWheel", js.undefined)
      
      @scala.inline
      def setDisableDoubleClickZoomWithToolAuto(value: Boolean): Self = StObject.set(x, "disableDoubleClickZoomWithToolAuto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDoubleClickZoomWithToolAutoUndefined: Self = StObject.set(x, "disableDoubleClickZoomWithToolAuto", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiniatureProps(value: Background): Self = StObject.set(x, "miniatureProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiniaturePropsUndefined: Self = StObject.set(x, "miniatureProps", js.undefined)
      
      @scala.inline
      def setModifierKeys(value: js.Array[String]): Self = StObject.set(x, "modifierKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifierKeysUndefined: Self = StObject.set(x, "modifierKeys", js.undefined)
      
      @scala.inline
      def setModifierKeysVarargs(value: String*): Self = StObject.set(x, "modifierKeys", js.Array(value :_*))
      
      @scala.inline
      def setOnChangeTool(value: Tool => Unit): Self = StObject.set(x, "onChangeTool", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeValue(value: Value => Unit): Self = StObject.set(x, "onChangeValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClick(value: /* event */ ViewerMouseEvent[_] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: /* event */ ViewerMouseEvent[_] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: /* event */ ViewerMouseEvent[_] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: /* event */ ViewerMouseEvent[_] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: /* event */ ViewerMouseEvent[_] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPan(value: /* event */ ViewerMouseEvent[_] => Unit): Self = StObject.set(x, "onPan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPanUndefined: Self = StObject.set(x, "onPan", js.undefined)
      
      @scala.inline
      def setOnZoom(value: /* event */ ViewerMouseEvent[_] => Unit): Self = StObject.set(x, "onZoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnZoomUndefined: Self = StObject.set(x, "onZoom", js.undefined)
      
      @scala.inline
      def setPreventPanOutside(value: Boolean): Self = StObject.set(x, "preventPanOutside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventPanOutsideUndefined: Self = StObject.set(x, "preventPanOutside", js.undefined)
      
      @scala.inline
      def setSVGBackground(value: String): Self = StObject.set(x, "SVGBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSVGBackgroundUndefined: Self = StObject.set(x, "SVGBackground", js.undefined)
      
      @scala.inline
      def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactorMax(value: Double): Self = StObject.set(x, "scaleFactorMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactorMaxUndefined: Self = StObject.set(x, "scaleFactorMax", js.undefined)
      
      @scala.inline
      def setScaleFactorMin(value: Double): Self = StObject.set(x, "scaleFactorMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactorMinUndefined: Self = StObject.set(x, "scaleFactorMin", js.undefined)
      
      @scala.inline
      def setScaleFactorOnWheel(value: Double): Self = StObject.set(x, "scaleFactorOnWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactorOnWheelUndefined: Self = StObject.set(x, "scaleFactorOnWheel", js.undefined)
      
      @scala.inline
      def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTool(value: Tool): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarProps(value: Position): Self = StObject.set(x, "toolbarProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarPropsUndefined: Self = StObject.set(x, "toolbarProps", js.undefined)
      
      @scala.inline
      def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequiredProps extends StObject {
    
    // height of the viewer displayed on screen
    var height: Double = js.native
    
    // handler tool changed
    def onChangeTool(tool: Tool): Unit = js.native
    
    // handler something changed
    def onChangeValue(value: Value): Unit = js.native
    
    // current active tool (TOOL_NONE, TOOL_PAN, TOOL_ZOOM_IN, TOOL_ZOOM_OUT)
    var tool: Tool = js.native
    
    // value of the viewer (current point of view)
    var value: Value | Null = js.native
    
    // width of the viewer displayed on screen
    var width: Double = js.native
  }
  object RequiredProps {
    
    @scala.inline
    def apply(
      height: Double,
      onChangeTool: Tool => Unit,
      onChangeValue: Value => Unit,
      tool: Tool,
      width: Double
    ): RequiredProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], onChangeTool = js.Any.fromFunction1(onChangeTool), onChangeValue = js.Any.fromFunction1(onChangeValue), tool = tool.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredProps]
    }
    
    @scala.inline
    implicit class RequiredPropsMutableBuilder[Self <: RequiredProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeTool(value: Tool => Unit): Self = StObject.set(x, "onChangeTool", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeValue(value: Value => Unit): Self = StObject.set(x, "onChangeValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTool(value: Tool): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type Tool = /* "auto" */ String
  
  type ToolbarPosition = /* "none" */ String
  
  @js.native
  trait UncontrolledExtraOptionalProps extends StObject {
    
    // handler tool changed
    def onChangeTool(tool: Tool): Unit = js.native
    
    // handler something changed
    def onChangeValue(value: Value): Unit = js.native
    
    // current active tool (TOOL_NONE, TOOL_PAN, TOOL_ZOOM_IN, TOOL_ZOOM_OUT)
    var tool: Tool = js.native
    
    // value of the viewer (current point of view)
    var value: Value | Null = js.native
  }
  object UncontrolledExtraOptionalProps {
    
    @scala.inline
    def apply(onChangeTool: Tool => Unit, onChangeValue: Value => Unit, tool: Tool): UncontrolledExtraOptionalProps = {
      val __obj = js.Dynamic.literal(onChangeTool = js.Any.fromFunction1(onChangeTool), onChangeValue = js.Any.fromFunction1(onChangeValue), tool = tool.asInstanceOf[js.Any])
      __obj.asInstanceOf[UncontrolledExtraOptionalProps]
    }
    
    @scala.inline
    implicit class UncontrolledExtraOptionalPropsMutableBuilder[Self <: UncontrolledExtraOptionalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnChangeTool(value: Tool => Unit): Self = StObject.set(x, "onChangeTool", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeValue(value: Value => Unit): Self = StObject.set(x, "onChangeValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTool(value: Tool): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  /* Inlined react-svg-pan-zoom.react-svg-pan-zoom.UncontrolledRequiredProps & std.Partial<react-svg-pan-zoom.react-svg-pan-zoom.OptionalProps> & std.Partial<react-svg-pan-zoom.react-svg-pan-zoom.UncontrolledExtraOptionalProps> */
  @js.native
  trait UncontrolledProps extends StObject {
    
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
    implicit class UncontrolledPropsMutableBuilder[Self <: UncontrolledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCustomMiniature(value: ReactElement | ComponentType[js.Object]): Self = StObject.set(x, "customMiniature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomMiniatureUndefined: Self = StObject.set(x, "customMiniature", js.undefined)
      
      @scala.inline
      def setCustomToolbar(value: (Component[_, js.Object, _]) | StatelessComponent[_]): Self = StObject.set(x, "customToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomToolbarUndefined: Self = StObject.set(x, "customToolbar", js.undefined)
      
      @scala.inline
      def setDetectAutoPan(value: Boolean): Self = StObject.set(x, "detectAutoPan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectAutoPanUndefined: Self = StObject.set(x, "detectAutoPan", js.undefined)
      
      @scala.inline
      def setDetectPinchGesture(value: Boolean): Self = StObject.set(x, "detectPinchGesture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectPinchGestureUndefined: Self = StObject.set(x, "detectPinchGesture", js.undefined)
      
      @scala.inline
      def setDetectWheel(value: Boolean): Self = StObject.set(x, "detectWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectWheelUndefined: Self = StObject.set(x, "detectWheel", js.undefined)
      
      @scala.inline
      def setDisableDoubleClickZoomWithToolAuto(value: Boolean): Self = StObject.set(x, "disableDoubleClickZoomWithToolAuto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDoubleClickZoomWithToolAutoUndefined: Self = StObject.set(x, "disableDoubleClickZoomWithToolAuto", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiniatureProps(value: Background): Self = StObject.set(x, "miniatureProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiniaturePropsUndefined: Self = StObject.set(x, "miniatureProps", js.undefined)
      
      @scala.inline
      def setModifierKeys(value: js.Array[String]): Self = StObject.set(x, "modifierKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifierKeysUndefined: Self = StObject.set(x, "modifierKeys", js.undefined)
      
      @scala.inline
      def setModifierKeysVarargs(value: String*): Self = StObject.set(x, "modifierKeys", js.Array(value :_*))
      
      @scala.inline
      def setOnChangeTool(value: /* tool */ Tool => Unit): Self = StObject.set(x, "onChangeTool", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeToolUndefined: Self = StObject.set(x, "onChangeTool", js.undefined)
      
      @scala.inline
      def setOnChangeValue(value: /* value */ Value => Unit): Self = StObject.set(x, "onChangeValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeValueUndefined: Self = StObject.set(x, "onChangeValue", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ ViewerMouseEvent[_] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: /* event */ ViewerMouseEvent[_] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: /* event */ ViewerMouseEvent[_] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: /* event */ ViewerMouseEvent[_] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: /* event */ ViewerMouseEvent[_] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPan(value: /* event */ ViewerMouseEvent[_] => Unit): Self = StObject.set(x, "onPan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPanUndefined: Self = StObject.set(x, "onPan", js.undefined)
      
      @scala.inline
      def setOnZoom(value: /* event */ ViewerMouseEvent[_] => Unit): Self = StObject.set(x, "onZoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnZoomUndefined: Self = StObject.set(x, "onZoom", js.undefined)
      
      @scala.inline
      def setPreventPanOutside(value: Boolean): Self = StObject.set(x, "preventPanOutside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventPanOutsideUndefined: Self = StObject.set(x, "preventPanOutside", js.undefined)
      
      @scala.inline
      def setSVGBackground(value: String): Self = StObject.set(x, "SVGBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSVGBackgroundUndefined: Self = StObject.set(x, "SVGBackground", js.undefined)
      
      @scala.inline
      def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactorMax(value: Double): Self = StObject.set(x, "scaleFactorMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactorMaxUndefined: Self = StObject.set(x, "scaleFactorMax", js.undefined)
      
      @scala.inline
      def setScaleFactorMin(value: Double): Self = StObject.set(x, "scaleFactorMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactorMinUndefined: Self = StObject.set(x, "scaleFactorMin", js.undefined)
      
      @scala.inline
      def setScaleFactorOnWheel(value: Double): Self = StObject.set(x, "scaleFactorOnWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactorOnWheelUndefined: Self = StObject.set(x, "scaleFactorOnWheel", js.undefined)
      
      @scala.inline
      def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTool(value: Tool): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolUndefined: Self = StObject.set(x, "tool", js.undefined)
      
      @scala.inline
      def setToolbarProps(value: Position): Self = StObject.set(x, "toolbarProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarPropsUndefined: Self = StObject.set(x, "toolbarProps", js.undefined)
      
      @scala.inline
      def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UncontrolledRequiredProps extends StObject {
    
    // height of the viewer displayed on screen
    var height: Double = js.native
    
    // width of the viewer displayed on screen
    var width: Double = js.native
  }
  object UncontrolledRequiredProps {
    
    @scala.inline
    def apply(height: Double, width: Double): UncontrolledRequiredProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[UncontrolledRequiredProps]
    }
    
    @scala.inline
    implicit class UncontrolledRequiredPropsMutableBuilder[Self <: UncontrolledRequiredProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var SVGHeight: Double = js.native
    
    var SVGWidth: Double = js.native
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var c: Double = js.native
    
    var d: Double = js.native
    
    var e: Double = js.native
    
    var endX: js.UndefOr[Double | Null] = js.native
    
    var endY: js.UndefOr[Double | Null] = js.native
    
    var f: Double = js.native
    
    var focus: Boolean = js.native
    
    var miniatureOpen: Boolean = js.native
    
    var mode: Mode = js.native
    
    var startX: js.UndefOr[Double | Null] = js.native
    
    var startY: js.UndefOr[Double | Null] = js.native
    
    var version: `2` = js.native
    
    var viewerHeight: Double = js.native
    
    var viewerWidth: Double = js.native
  }
  object Value {
    
    @scala.inline
    def apply(
      SVGHeight: Double,
      SVGWidth: Double,
      a: Double,
      b: Double,
      c: Double,
      d: Double,
      e: Double,
      f: Double,
      focus: Boolean,
      miniatureOpen: Boolean,
      mode: Mode,
      version: `2`,
      viewerHeight: Double,
      viewerWidth: Double
    ): Value = {
      val __obj = js.Dynamic.literal(SVGHeight = SVGHeight.asInstanceOf[js.Any], SVGWidth = SVGWidth.asInstanceOf[js.Any], a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], miniatureOpen = miniatureOpen.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], viewerHeight = viewerHeight.asInstanceOf[js.Any], viewerWidth = viewerWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndX(value: Double): Self = StObject.set(x, "endX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndXNull: Self = StObject.set(x, "endX", null)
      
      @scala.inline
      def setEndXUndefined: Self = StObject.set(x, "endX", js.undefined)
      
      @scala.inline
      def setEndY(value: Double): Self = StObject.set(x, "endY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndYNull: Self = StObject.set(x, "endY", null)
      
      @scala.inline
      def setEndYUndefined: Self = StObject.set(x, "endY", js.undefined)
      
      @scala.inline
      def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiniatureOpen(value: Boolean): Self = StObject.set(x, "miniatureOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSVGHeight(value: Double): Self = StObject.set(x, "SVGHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSVGWidth(value: Double): Self = StObject.set(x, "SVGWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartXNull: Self = StObject.set(x, "startX", null)
      
      @scala.inline
      def setStartXUndefined: Self = StObject.set(x, "startX", js.undefined)
      
      @scala.inline
      def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartYNull: Self = StObject.set(x, "startY", null)
      
      @scala.inline
      def setStartYUndefined: Self = StObject.set(x, "startY", js.undefined)
      
      @scala.inline
      def setVersion(value: `2`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewerHeight(value: Double): Self = StObject.set(x, "viewerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewerWidth(value: Double): Self = StObject.set(x, "viewerWidth", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ViewerMouseEvent[T] extends StObject {
    
    var SVGViewer: SVGSVGElement = js.native
    
    var originalEvent: MouseEvent[T, NativeMouseEvent] = js.native
    
    var point: Point = js.native
    
    def preventDefault(): Unit = js.native
    
    var scaleFactor: Double = js.native
    
    def stopPropagation(): Unit = js.native
    
    var translationX: Double = js.native
    
    var translationY: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object ViewerMouseEvent {
    
    @scala.inline
    def apply[T](
      SVGViewer: SVGSVGElement,
      originalEvent: MouseEvent[T, NativeMouseEvent],
      point: Point,
      preventDefault: () => Unit,
      scaleFactor: Double,
      stopPropagation: () => Unit,
      translationX: Double,
      translationY: Double,
      x: Double,
      y: Double
    ): ViewerMouseEvent[T] = {
      val __obj = js.Dynamic.literal(SVGViewer = SVGViewer.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), scaleFactor = scaleFactor.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), translationX = translationX.asInstanceOf[js.Any], translationY = translationY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewerMouseEvent[T]]
    }
    
    @scala.inline
    implicit class ViewerMouseEventMutableBuilder[Self <: ViewerMouseEvent[_], T] (val x: Self with ViewerMouseEvent[T]) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: MouseEvent[T, NativeMouseEvent]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSVGViewer(value: SVGSVGElement): Self = StObject.set(x, "SVGViewer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTranslationX(value: Double): Self = StObject.set(x, "translationX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationY(value: Double): Self = StObject.set(x, "translationY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ViewerTouchEvent[T] extends StObject {
    
    var SVGViewer: SVGSVGElement = js.native
    
    var changedPoints: js.Array[Point] = js.native
    
    var originalEvent: TouchEvent[T] = js.native
    
    var points: js.Array[Point] = js.native
    
    def preventDefault(): Unit = js.native
    
    var scaleFactor: Double = js.native
    
    def stopPropagation(): Unit = js.native
    
    var translationX: Double = js.native
    
    var translationY: Double = js.native
  }
  object ViewerTouchEvent {
    
    @scala.inline
    def apply[T](
      SVGViewer: SVGSVGElement,
      changedPoints: js.Array[Point],
      originalEvent: TouchEvent[T],
      points: js.Array[Point],
      preventDefault: () => Unit,
      scaleFactor: Double,
      stopPropagation: () => Unit,
      translationX: Double,
      translationY: Double
    ): ViewerTouchEvent[T] = {
      val __obj = js.Dynamic.literal(SVGViewer = SVGViewer.asInstanceOf[js.Any], changedPoints = changedPoints.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), scaleFactor = scaleFactor.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), translationX = translationX.asInstanceOf[js.Any], translationY = translationY.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewerTouchEvent[T]]
    }
    
    @scala.inline
    implicit class ViewerTouchEventMutableBuilder[Self <: ViewerTouchEvent[_], T] (val x: Self with ViewerTouchEvent[T]) extends AnyVal {
      
      @scala.inline
      def setChangedPoints(value: js.Array[Point]): Self = StObject.set(x, "changedPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangedPointsVarargs(value: Point*): Self = StObject.set(x, "changedPoints", js.Array(value :_*))
      
      @scala.inline
      def setOriginalEvent(value: TouchEvent[T]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSVGViewer(value: SVGSVGElement): Self = StObject.set(x, "SVGViewer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTranslationX(value: Double): Self = StObject.set(x, "translationX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationY(value: Double): Self = StObject.set(x, "translationY", value.asInstanceOf[js.Any])
    }
  }
}
