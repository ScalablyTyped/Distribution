package typings.reactRnd

import org.scalablytyped.runtime.StringDictionary
import typings.reResizable.mod.Resizable
import typings.reResizable.mod.ResizeDirection
import typings.react.mod.CSSProperties
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactDraggable.mod.DraggableEvent
import typings.reactDraggable.mod.DraggableEventHandler
import typings.reactRnd.anon.Bottom
import typings.reactRnd.anon.BottomLeft
import typings.reactRnd.anon.Current
import typings.reactRnd.anon.Height
import typings.reactRnd.anon.HeightWidth
import typings.reactRnd.anon.Left
import typings.reactRnd.anon.Top
import typings.reactRnd.anon.Width
import typings.reactRnd.anon.X
import typings.reactRnd.anon.xnumberynumberSize
import typings.reactRnd.reactRndBooleans.`false`
import typings.reactRnd.reactRndStrings.both
import typings.reactRnd.reactRndStrings.none
import typings.reactRnd.reactRndStrings.x
import typings.reactRnd.reactRndStrings.y
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.SVGElement
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-rnd", "Rnd")
  @js.native
  open class Rnd protected () extends PureComponent[Props, State, Any] {
    def this(props: Props) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MRnd(): Unit = js.native
    
    var draggable: TODO = js.native
    
    def getDraggablePosition(): X = js.native
    
    def getMaxSizesFromProps(): MaxSize = js.native
    
    def getOffsetHeight(boundary: HTMLElement): Double = js.native
    
    def getOffsetWidth(boundary: HTMLElement): Double = js.native
    
    def getParent(): Any = js.native
    
    def getParentSize(): Height = js.native
    
    def getSelfElement(): HTMLElement | Null = js.native
    
    var offsetFromParent: Left = js.native
    
    def onDrag(e: RndDragEvent, data: DraggableData): `false` | Unit = js.native
    
    def onDragStart(e: RndDragEvent, data: DraggableData): Unit = js.native
    
    def onDragStop(e: RndDragEvent, data: DraggableData): `false` | Unit = js.native
    
    def onResize(e: MouseEvent, direction: ResizeDirection, elementRef: HTMLElement, delta: Width): Unit = js.native
    def onResize(e: TouchEvent, direction: ResizeDirection, elementRef: HTMLElement, delta: Width): Unit = js.native
    
    def onResizeStart(
      e: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent],
      dir: ResizeDirection,
      elementRef: HTMLElement
    ): Unit = js.native
    def onResizeStart(e: typings.react.mod.TouchEvent[HTMLElement], dir: ResizeDirection, elementRef: HTMLElement): Unit = js.native
    
    def onResizeStop(e: MouseEvent, direction: ResizeDirection, elementRef: HTMLElement, delta: Width): Unit = js.native
    def onResizeStop(e: TouchEvent, direction: ResizeDirection, elementRef: HTMLElement, delta: Width): Unit = js.native
    
    var originalPosition: X = js.native
    
    def refDraggable(c: TODO): Unit = js.native
    
    def refResizable(): Unit = js.native
    def refResizable(c: Resizable): Unit = js.native
    
    var resizable: Resizable = js.native
    
    var resizableElement: Current = js.native
    
    var resizingPosition: X = js.native
    
    def updateOffsetFromParent(): js.UndefOr[Top] = js.native
    
    def updatePosition(position: Position): Unit = js.native
    
    def updateSize(size: HeightWidth): Unit = js.native
  }
  /* static members */
  object Rnd {
    
    @JSImport("react-rnd", "Rnd")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-rnd", "Rnd.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    inline def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait DefaultProps extends StObject {
    
    var maxHeight: Double
    
    var maxWidth: Double
    
    var onDrag: RndDragCallback
    
    var onDragStart: RndDragCallback
    
    var onDragStop: RndDragCallback
    
    var onResize: RndResizeCallback
    
    var onResizeStart: RndResizeStartCallback
    
    var onResizeStop: RndResizeCallback
    
    var scale: Double
  }
  object DefaultProps {
    
    inline def apply(
      maxHeight: Double,
      maxWidth: Double,
      onDrag: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | typings.reactDraggable.reactDraggableBooleans.`false`,
      onDragStart: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | typings.reactDraggable.reactDraggableBooleans.`false`,
      onDragStop: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | typings.reactDraggable.reactDraggableBooleans.`false`,
      onResize: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Unit,
      onResizeStart: (/* e */ (typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent]) | typings.react.mod.TouchEvent[HTMLElement], /* dir */ ResizeDirection, /* elementRef */ HTMLElement) => Unit | Boolean,
      onResizeStop: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Unit,
      scale: Double
    ): DefaultProps = {
      val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], onDrag = js.Any.fromFunction2(onDrag), onDragStart = js.Any.fromFunction2(onDragStart), onDragStop = js.Any.fromFunction2(onDragStop), onResize = js.Any.fromFunction5(onResize), onResizeStart = js.Any.fromFunction3(onResizeStart), onResizeStop = js.Any.fromFunction5(onResizeStop), scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultProps]
    }
    
    extension [Self <: DefaultProps](x: Self) {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setOnDrag(
        value: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | typings.reactDraggable.reactDraggableBooleans.`false`
      ): Self = StObject.set(x, "onDrag", js.Any.fromFunction2(value))
      
      inline def setOnDragStart(
        value: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | typings.reactDraggable.reactDraggableBooleans.`false`
      ): Self = StObject.set(x, "onDragStart", js.Any.fromFunction2(value))
      
      inline def setOnDragStop(
        value: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | typings.reactDraggable.reactDraggableBooleans.`false`
      ): Self = StObject.set(x, "onDragStop", js.Any.fromFunction2(value))
      
      inline def setOnResize(
        value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Unit
      ): Self = StObject.set(x, "onResize", js.Any.fromFunction5(value))
      
      inline def setOnResizeStart(
        value: (/* e */ (typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent]) | typings.react.mod.TouchEvent[HTMLElement], /* dir */ ResizeDirection, /* elementRef */ HTMLElement) => Unit | Boolean
      ): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction3(value))
      
      inline def setOnResizeStop(
        value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Unit
      ): Self = StObject.set(x, "onResizeStop", js.Any.fromFunction5(value))
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  trait DraggableData
    extends StObject
       with Position {
    
    var deltaX: Double
    
    var deltaY: Double
    
    var lastX: Double
    
    var lastY: Double
    
    var node: HTMLElement
  }
  object DraggableData {
    
    inline def apply(
      deltaX: Double,
      deltaY: Double,
      lastX: Double,
      lastY: Double,
      node: HTMLElement,
      x: Double,
      y: Double
    ): DraggableData = {
      val __obj = js.Dynamic.literal(deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], lastX = lastX.asInstanceOf[js.Any], lastY = lastY.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraggableData]
    }
    
    extension [Self <: DraggableData](x: Self) {
      
      inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      inline def setLastX(value: Double): Self = StObject.set(x, "lastX", value.asInstanceOf[js.Any])
      
      inline def setLastY(value: Double): Self = StObject.set(x, "lastY", value.asInstanceOf[js.Any])
      
      inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  type Grid = js.Tuple2[Double, Double]
  
  trait HandleClasses extends StObject {
    
    var bottom: js.UndefOr[String] = js.undefined
    
    var bottomLeft: js.UndefOr[String] = js.undefined
    
    var bottomRight: js.UndefOr[String] = js.undefined
    
    var left: js.UndefOr[String] = js.undefined
    
    var right: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[String] = js.undefined
    
    var topLeft: js.UndefOr[String] = js.undefined
    
    var topRight: js.UndefOr[String] = js.undefined
  }
  object HandleClasses {
    
    inline def apply(): HandleClasses = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleClasses]
    }
    
    extension [Self <: HandleClasses](x: Self) {
      
      inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomLeft(value: String): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      inline def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
      
      inline def setBottomRight(value: String): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopLeft(value: String): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
      
      inline def setTopRight(value: String): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
      
      inline def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait HandleComponent extends StObject {
    
    var bottom: js.UndefOr[ReactElement] = js.undefined
    
    var bottomLeft: js.UndefOr[ReactElement] = js.undefined
    
    var bottomRight: js.UndefOr[ReactElement] = js.undefined
    
    var left: js.UndefOr[ReactElement] = js.undefined
    
    var right: js.UndefOr[ReactElement] = js.undefined
    
    var top: js.UndefOr[ReactElement] = js.undefined
    
    var topLeft: js.UndefOr[ReactElement] = js.undefined
    
    var topRight: js.UndefOr[ReactElement] = js.undefined
  }
  object HandleComponent {
    
    inline def apply(): HandleComponent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleComponent]
    }
    
    extension [Self <: HandleComponent](x: Self) {
      
      inline def setBottom(value: ReactElement): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomLeft(value: ReactElement): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      inline def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
      
      inline def setBottomRight(value: ReactElement): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: ReactElement): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: ReactElement): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: ReactElement): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopLeft(value: ReactElement): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
      
      inline def setTopRight(value: ReactElement): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
      
      inline def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait HandleStyles extends StObject {
    
    var bottom: js.UndefOr[CSSProperties] = js.undefined
    
    var bottomLeft: js.UndefOr[CSSProperties] = js.undefined
    
    var bottomRight: js.UndefOr[CSSProperties] = js.undefined
    
    var left: js.UndefOr[CSSProperties] = js.undefined
    
    var right: js.UndefOr[CSSProperties] = js.undefined
    
    var top: js.UndefOr[CSSProperties] = js.undefined
    
    var topLeft: js.UndefOr[CSSProperties] = js.undefined
    
    var topRight: js.UndefOr[CSSProperties] = js.undefined
  }
  object HandleStyles {
    
    inline def apply(): HandleStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleStyles]
    }
    
    extension [Self <: HandleStyles](x: Self) {
      
      inline def setBottom(value: CSSProperties): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomLeft(value: CSSProperties): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      inline def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
      
      inline def setBottomRight(value: CSSProperties): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: CSSProperties): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: CSSProperties): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: CSSProperties): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopLeft(value: CSSProperties): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
      
      inline def setTopRight(value: CSSProperties): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
      
      inline def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait MaxSize extends StObject {
    
    var maxHeight: Double | String
    
    var maxWidth: Double | String
  }
  object MaxSize {
    
    inline def apply(maxHeight: Double | String, maxWidth: Double | String): MaxSize = {
      val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxSize]
    }
    
    extension [Self <: MaxSize](x: Self) {
      
      inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait Position extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Position {
    
    inline def apply(x: Double, y: Double): Position = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var default: js.UndefOr[xnumberynumberSize] = js.undefined
    
    var allowAnyClick: js.UndefOr[Boolean] = js.undefined
    
    var bounds: js.UndefOr[String] = js.undefined
    
    var cancel: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disableDragging: js.UndefOr[Boolean] = js.undefined
    
    var dragAxis: js.UndefOr[x | y | both | none] = js.undefined
    
    var dragGrid: js.UndefOr[Grid] = js.undefined
    
    var dragHandleClassName: js.UndefOr[String] = js.undefined
    
    var enableResizing: js.UndefOr[ResizeEnable] = js.undefined
    
    var enableUserSelectHack: js.UndefOr[Boolean] = js.undefined
    
    var lockAspectRatio: js.UndefOr[Boolean | Double] = js.undefined
    
    var lockAspectRatioExtraHeight: js.UndefOr[Double] = js.undefined
    
    var lockAspectRatioExtraWidth: js.UndefOr[Double] = js.undefined
    
    var maxHeight: js.UndefOr[Double | String] = js.undefined
    
    var maxWidth: js.UndefOr[Double | String] = js.undefined
    
    var minHeight: js.UndefOr[Double | String] = js.undefined
    
    var minWidth: js.UndefOr[Double | String] = js.undefined
    
    var onDrag: js.UndefOr[RndDragCallback] = js.undefined
    
    var onDragStart: js.UndefOr[RndDragCallback] = js.undefined
    
    var onDragStop: js.UndefOr[RndDragCallback] = js.undefined
    
    var onMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
    
    var onMouseUp: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
    
    var onResize: js.UndefOr[RndResizeCallback] = js.undefined
    
    var onResizeStart: js.UndefOr[RndResizeStartCallback] = js.undefined
    
    var onResizeStop: js.UndefOr[RndResizeCallback] = js.undefined
    
    var position: js.UndefOr[X] = js.undefined
    
    var resizeGrid: js.UndefOr[Grid] = js.undefined
    
    var resizeHandleClasses: js.UndefOr[HandleClasses] = js.undefined
    
    var resizeHandleComponent: js.UndefOr[HandleComponent] = js.undefined
    
    var resizeHandleStyles: js.UndefOr[HandleStyles] = js.undefined
    
    var resizeHandleWrapperClass: js.UndefOr[String] = js.undefined
    
    var resizeHandleWrapperStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAllowAnyClick(value: Boolean): Self = StObject.set(x, "allowAnyClick", value.asInstanceOf[js.Any])
      
      inline def setAllowAnyClickUndefined: Self = StObject.set(x, "allowAnyClick", js.undefined)
      
      inline def setBounds(value: String): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefault(value: xnumberynumberSize): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDisableDragging(value: Boolean): Self = StObject.set(x, "disableDragging", value.asInstanceOf[js.Any])
      
      inline def setDisableDraggingUndefined: Self = StObject.set(x, "disableDragging", js.undefined)
      
      inline def setDragAxis(value: typings.reactRnd.reactRndStrings.x | y | both | none): Self = StObject.set(x, "dragAxis", value.asInstanceOf[js.Any])
      
      inline def setDragAxisUndefined: Self = StObject.set(x, "dragAxis", js.undefined)
      
      inline def setDragGrid(value: Grid): Self = StObject.set(x, "dragGrid", value.asInstanceOf[js.Any])
      
      inline def setDragGridUndefined: Self = StObject.set(x, "dragGrid", js.undefined)
      
      inline def setDragHandleClassName(value: String): Self = StObject.set(x, "dragHandleClassName", value.asInstanceOf[js.Any])
      
      inline def setDragHandleClassNameUndefined: Self = StObject.set(x, "dragHandleClassName", js.undefined)
      
      inline def setEnableResizing(value: ResizeEnable): Self = StObject.set(x, "enableResizing", value.asInstanceOf[js.Any])
      
      inline def setEnableResizingUndefined: Self = StObject.set(x, "enableResizing", js.undefined)
      
      inline def setEnableUserSelectHack(value: Boolean): Self = StObject.set(x, "enableUserSelectHack", value.asInstanceOf[js.Any])
      
      inline def setEnableUserSelectHackUndefined: Self = StObject.set(x, "enableUserSelectHack", js.undefined)
      
      inline def setLockAspectRatio(value: Boolean | Double): Self = StObject.set(x, "lockAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setLockAspectRatioExtraHeight(value: Double): Self = StObject.set(x, "lockAspectRatioExtraHeight", value.asInstanceOf[js.Any])
      
      inline def setLockAspectRatioExtraHeightUndefined: Self = StObject.set(x, "lockAspectRatioExtraHeight", js.undefined)
      
      inline def setLockAspectRatioExtraWidth(value: Double): Self = StObject.set(x, "lockAspectRatioExtraWidth", value.asInstanceOf[js.Any])
      
      inline def setLockAspectRatioExtraWidthUndefined: Self = StObject.set(x, "lockAspectRatioExtraWidth", js.undefined)
      
      inline def setLockAspectRatioUndefined: Self = StObject.set(x, "lockAspectRatio", js.undefined)
      
      inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setOnDrag(
        value: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | typings.reactDraggable.reactDraggableBooleans.`false`
      ): Self = StObject.set(x, "onDrag", js.Any.fromFunction2(value))
      
      inline def setOnDragStart(
        value: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | typings.reactDraggable.reactDraggableBooleans.`false`
      ): Self = StObject.set(x, "onDragStart", js.Any.fromFunction2(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragStop(
        value: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | typings.reactDraggable.reactDraggableBooleans.`false`
      ): Self = StObject.set(x, "onDragStop", js.Any.fromFunction2(value))
      
      inline def setOnDragStopUndefined: Self = StObject.set(x, "onDragStop", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnMouseDown(value: /* e */ MouseEvent => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseUp(value: /* e */ MouseEvent => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnResize(
        value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Unit
      ): Self = StObject.set(x, "onResize", js.Any.fromFunction5(value))
      
      inline def setOnResizeStart(
        value: (/* e */ (typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent]) | typings.react.mod.TouchEvent[HTMLElement], /* dir */ ResizeDirection, /* elementRef */ HTMLElement) => Unit | Boolean
      ): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction3(value))
      
      inline def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
      
      inline def setOnResizeStop(
        value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Unit
      ): Self = StObject.set(x, "onResizeStop", js.Any.fromFunction5(value))
      
      inline def setOnResizeStopUndefined: Self = StObject.set(x, "onResizeStop", js.undefined)
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setPosition(value: X): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setResizeGrid(value: Grid): Self = StObject.set(x, "resizeGrid", value.asInstanceOf[js.Any])
      
      inline def setResizeGridUndefined: Self = StObject.set(x, "resizeGrid", js.undefined)
      
      inline def setResizeHandleClasses(value: HandleClasses): Self = StObject.set(x, "resizeHandleClasses", value.asInstanceOf[js.Any])
      
      inline def setResizeHandleClassesUndefined: Self = StObject.set(x, "resizeHandleClasses", js.undefined)
      
      inline def setResizeHandleComponent(value: HandleComponent): Self = StObject.set(x, "resizeHandleComponent", value.asInstanceOf[js.Any])
      
      inline def setResizeHandleComponentUndefined: Self = StObject.set(x, "resizeHandleComponent", js.undefined)
      
      inline def setResizeHandleStyles(value: HandleStyles): Self = StObject.set(x, "resizeHandleStyles", value.asInstanceOf[js.Any])
      
      inline def setResizeHandleStylesUndefined: Self = StObject.set(x, "resizeHandleStyles", js.undefined)
      
      inline def setResizeHandleWrapperClass(value: String): Self = StObject.set(x, "resizeHandleWrapperClass", value.asInstanceOf[js.Any])
      
      inline def setResizeHandleWrapperClassUndefined: Self = StObject.set(x, "resizeHandleWrapperClass", js.undefined)
      
      inline def setResizeHandleWrapperStyle(value: CSSProperties): Self = StObject.set(x, "resizeHandleWrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setResizeHandleWrapperStyleUndefined: Self = StObject.set(x, "resizeHandleWrapperStyle", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait ResizableDelta extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object ResizableDelta {
    
    inline def apply(height: Double, width: Double): ResizableDelta = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizableDelta]
    }
    
    extension [Self <: ResizableDelta](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type ResizeEnable = BottomLeft | Boolean
  
  type RndDragCallback = DraggableEventHandler
  
  type RndDragEvent = (typings.react.mod.MouseEvent[HTMLElement | SVGElement, NativeMouseEvent]) | (typings.react.mod.TouchEvent[HTMLElement | SVGElement]) | MouseEvent | TouchEvent
  
  type RndResizeCallback = js.Function5[
    /* e */ MouseEvent | TouchEvent, 
    /* dir */ ResizeDirection, 
    /* elementRef */ HTMLElement, 
    /* delta */ ResizableDelta, 
    /* position */ Position, 
    Unit
  ]
  
  type RndResizeStartCallback = js.Function3[
    /* e */ (typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent]) | typings.react.mod.TouchEvent[HTMLElement], 
    /* dir */ ResizeDirection, 
    /* elementRef */ HTMLElement, 
    Unit | Boolean
  ]
  
  trait Size extends StObject {
    
    var height: String | Double
    
    var width: String | Double
  }
  object Size {
    
    inline def apply(height: String | Double, width: String | Double): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var bounds: Bottom
    
    var maxHeight: js.UndefOr[Double | String] = js.undefined
    
    var maxWidth: js.UndefOr[Double | String] = js.undefined
    
    var resizing: Boolean
  }
  object State {
    
    inline def apply(bounds: Bottom, resizing: Boolean): State = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], resizing = resizing.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setBounds(value: Bottom): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setResizing(value: Boolean): Self = StObject.set(x, "resizing", value.asInstanceOf[js.Any])
    }
  }
  
  type TODO = Any
}
