package typings.reResizable

import typings.reResizable.anon.As
import typings.reResizable.anon.Height
import typings.reResizable.anon.HeightWidth
import typings.reResizable.anon.MaxHeight
import typings.reResizable.anon.NewHeight
import typings.reResizable.anon.Width
import typings.reResizable.anon.X
import typings.reResizable.anon.Y
import typings.reResizable.mod.global.Window
import typings.reResizable.reResizableStrings.column
import typings.reResizable.reResizableStrings.height
import typings.reResizable.reResizableStrings.parent
import typings.reResizable.reResizableStrings.row
import typings.reResizable.reResizableStrings.width
import typings.reResizable.reResizableStrings.window
import typings.reResizable.resizerMod.Direction
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("re-resizable", "Resizable")
  @js.native
  open class Resizable protected () extends PureComponent[ResizableProps, State, Any] {
    def this(props: ResizableProps) = this()
    
    def appendBase(): HTMLDivElement | Null = js.native
    
    def bindEvents(): Unit = js.native
    
    def calculateNewMaxFromBoundary(): MaxHeight = js.native
    def calculateNewMaxFromBoundary(maxWidth: Double): MaxHeight = js.native
    def calculateNewMaxFromBoundary(maxWidth: Double, maxHeight: Double): MaxHeight = js.native
    def calculateNewMaxFromBoundary(maxWidth: Unit, maxHeight: Double): MaxHeight = js.native
    
    def calculateNewSizeFromAspectRatio(newWidth: Double, newHeight: Double, max: HeightWidth, min: HeightWidth): NewHeight = js.native
    
    def calculateNewSizeFromDirection(clientX: Double, clientY: Double): NewHeight = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MResizable(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MResizable(): Unit = js.native
    
    def createSizeForCssProperty(newSize: String, kind: width | height): Double | String = js.native
    def createSizeForCssProperty(newSize: Double, kind: width | height): Double | String = js.native
    
    var flexDir: js.UndefOr[row | column] = js.native
    
    def getParentSize(): Width = js.native
    
    def onMouseMove(event: MouseEvent): Unit = js.native
    def onMouseMove(event: TouchEvent): Unit = js.native
    
    def onMouseUp(event: MouseEvent): Unit = js.native
    def onMouseUp(event: TouchEvent): Unit = js.native
    
    def onResizeStart(event: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent], direction: Direction): Unit = js.native
    def onResizeStart(event: typings.react.mod.TouchEvent[HTMLElement], direction: Direction): Unit = js.native
    
    var parentLeft: Double = js.native
    
    def parentNode: HTMLElement | Null = js.native
    
    var parentTop: Double = js.native
    
    def propsSize: Size = js.native
    
    var ratio: Double = js.native
    
    def ref(): Unit = js.native
    def ref(c: HTMLElement): Unit = js.native
    
    def removeBase(base: HTMLElement): Unit = js.native
    
    def renderResizer(): Element | Null = js.native
    
    var resizable: HTMLElement | Null = js.native
    
    var resizableBottom: Double = js.native
    
    var resizableLeft: Double = js.native
    
    var resizableRight: Double = js.native
    
    var resizableTop: Double = js.native
    
    def setBoundingClientRect(): Unit = js.native
    
    def size: NumberSize = js.native
    
    def sizeStyle: Height = js.native
    
    var targetLeft: Double = js.native
    
    var targetTop: Double = js.native
    
    def unbindEvents(): Unit = js.native
    
    def updateSize(size: Size): Unit = js.native
    
    def window: Window | Null = js.native
  }
  /* static members */
  object Resizable {
    
    @JSImport("re-resizable", "Resizable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("re-resizable", "Resizable.defaultProps")
    @js.native
    def defaultProps: As = js.native
    inline def defaultProps_=(x: As): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait Enable extends StObject {
    
    var bottom: js.UndefOr[Boolean] = js.undefined
    
    var bottomLeft: js.UndefOr[Boolean] = js.undefined
    
    var bottomRight: js.UndefOr[Boolean] = js.undefined
    
    var left: js.UndefOr[Boolean] = js.undefined
    
    var right: js.UndefOr[Boolean] = js.undefined
    
    var top: js.UndefOr[Boolean] = js.undefined
    
    var topLeft: js.UndefOr[Boolean] = js.undefined
    
    var topRight: js.UndefOr[Boolean] = js.undefined
  }
  object Enable {
    
    inline def apply(): Enable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enable]
    }
    
    extension [Self <: Enable](x: Self) {
      
      inline def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomLeft(value: Boolean): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      inline def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
      
      inline def setBottomRight(value: Boolean): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopLeft(value: Boolean): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
      
      inline def setTopRight(value: Boolean): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
      
      inline def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait HandleClassName extends StObject {
    
    var bottom: js.UndefOr[String] = js.undefined
    
    var bottomLeft: js.UndefOr[String] = js.undefined
    
    var bottomRight: js.UndefOr[String] = js.undefined
    
    var left: js.UndefOr[String] = js.undefined
    
    var right: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[String] = js.undefined
    
    var topLeft: js.UndefOr[String] = js.undefined
    
    var topRight: js.UndefOr[String] = js.undefined
  }
  object HandleClassName {
    
    inline def apply(): HandleClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleClassName]
    }
    
    extension [Self <: HandleClassName](x: Self) {
      
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
  
  trait NumberSize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object NumberSize {
    
    inline def apply(height: Double, width: Double): NumberSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberSize]
    }
    
    extension [Self <: NumberSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResizableProps extends StObject {
    
    var as: js.UndefOr[String | ComponentType[Any]] = js.undefined
    
    var bounds: js.UndefOr[parent | window | HTMLElement] = js.undefined
    
    var boundsByDirection: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultSize: js.UndefOr[Size] = js.undefined
    
    var enable: js.UndefOr[Enable] = js.undefined
    
    var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var handleClasses: js.UndefOr[HandleClassName] = js.undefined
    
    var handleComponent: js.UndefOr[HandleComponent] = js.undefined
    
    var handleStyles: js.UndefOr[HandleStyles] = js.undefined
    
    var handleWrapperClass: js.UndefOr[String] = js.undefined
    
    var handleWrapperStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var lockAspectRatio: js.UndefOr[Boolean | Double] = js.undefined
    
    var lockAspectRatioExtraHeight: js.UndefOr[Double] = js.undefined
    
    var lockAspectRatioExtraWidth: js.UndefOr[Double] = js.undefined
    
    var maxHeight: js.UndefOr[String | Double] = js.undefined
    
    var maxWidth: js.UndefOr[String | Double] = js.undefined
    
    var minHeight: js.UndefOr[String | Double] = js.undefined
    
    var minWidth: js.UndefOr[String | Double] = js.undefined
    
    var onResize: js.UndefOr[ResizeCallback] = js.undefined
    
    var onResizeStart: js.UndefOr[ResizeStartCallback] = js.undefined
    
    var onResizeStop: js.UndefOr[ResizeCallback] = js.undefined
    
    var resizeRatio: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var snap: js.UndefOr[X] = js.undefined
    
    var snapGap: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ResizableProps {
    
    inline def apply(): ResizableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizableProps]
    }
    
    extension [Self <: ResizableProps](x: Self) {
      
      inline def setAs(value: String | ComponentType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBounds(value: parent | window | HTMLElement): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsByDirection(value: Boolean): Self = StObject.set(x, "boundsByDirection", value.asInstanceOf[js.Any])
      
      inline def setBoundsByDirectionUndefined: Self = StObject.set(x, "boundsByDirection", js.undefined)
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultSize(value: Size): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      inline def setDefaultSizeUndefined: Self = StObject.set(x, "defaultSize", js.undefined)
      
      inline def setEnable(value: Enable): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setGrid(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHandleClasses(value: HandleClassName): Self = StObject.set(x, "handleClasses", value.asInstanceOf[js.Any])
      
      inline def setHandleClassesUndefined: Self = StObject.set(x, "handleClasses", js.undefined)
      
      inline def setHandleComponent(value: HandleComponent): Self = StObject.set(x, "handleComponent", value.asInstanceOf[js.Any])
      
      inline def setHandleComponentUndefined: Self = StObject.set(x, "handleComponent", js.undefined)
      
      inline def setHandleStyles(value: HandleStyles): Self = StObject.set(x, "handleStyles", value.asInstanceOf[js.Any])
      
      inline def setHandleStylesUndefined: Self = StObject.set(x, "handleStyles", js.undefined)
      
      inline def setHandleWrapperClass(value: String): Self = StObject.set(x, "handleWrapperClass", value.asInstanceOf[js.Any])
      
      inline def setHandleWrapperClassUndefined: Self = StObject.set(x, "handleWrapperClass", js.undefined)
      
      inline def setHandleWrapperStyle(value: CSSProperties): Self = StObject.set(x, "handleWrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setHandleWrapperStyleUndefined: Self = StObject.set(x, "handleWrapperStyle", js.undefined)
      
      inline def setLockAspectRatio(value: Boolean | Double): Self = StObject.set(x, "lockAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setLockAspectRatioExtraHeight(value: Double): Self = StObject.set(x, "lockAspectRatioExtraHeight", value.asInstanceOf[js.Any])
      
      inline def setLockAspectRatioExtraHeightUndefined: Self = StObject.set(x, "lockAspectRatioExtraHeight", js.undefined)
      
      inline def setLockAspectRatioExtraWidth(value: Double): Self = StObject.set(x, "lockAspectRatioExtraWidth", value.asInstanceOf[js.Any])
      
      inline def setLockAspectRatioExtraWidthUndefined: Self = StObject.set(x, "lockAspectRatioExtraWidth", js.undefined)
      
      inline def setLockAspectRatioUndefined: Self = StObject.set(x, "lockAspectRatio", js.undefined)
      
      inline def setMaxHeight(value: String | Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: String | Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: String | Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: String | Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setOnResize(
        value: (/* event */ MouseEvent | TouchEvent, /* direction */ Direction, /* elementRef */ HTMLElement, /* delta */ NumberSize) => Unit
      ): Self = StObject.set(x, "onResize", js.Any.fromFunction4(value))
      
      inline def setOnResizeStart(
        value: (/* e */ (typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent]) | typings.react.mod.TouchEvent[HTMLElement], /* dir */ Direction, /* elementRef */ HTMLElement) => Unit | Boolean
      ): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction3(value))
      
      inline def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
      
      inline def setOnResizeStop(
        value: (/* event */ MouseEvent | TouchEvent, /* direction */ Direction, /* elementRef */ HTMLElement, /* delta */ NumberSize) => Unit
      ): Self = StObject.set(x, "onResizeStop", js.Any.fromFunction4(value))
      
      inline def setOnResizeStopUndefined: Self = StObject.set(x, "onResizeStop", js.undefined)
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setResizeRatio(value: Double): Self = StObject.set(x, "resizeRatio", value.asInstanceOf[js.Any])
      
      inline def setResizeRatioUndefined: Self = StObject.set(x, "resizeRatio", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSnap(value: X): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      inline def setSnapGap(value: Double): Self = StObject.set(x, "snapGap", value.asInstanceOf[js.Any])
      
      inline def setSnapGapUndefined: Self = StObject.set(x, "snapGap", js.undefined)
      
      inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type ResizeCallback = js.Function4[
    /* event */ MouseEvent | TouchEvent, 
    /* direction */ Direction, 
    /* elementRef */ HTMLElement, 
    /* delta */ NumberSize, 
    Unit
  ]
  
  type ResizeDirection = Direction
  
  type ResizeStartCallback = js.Function3[
    /* e */ (typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent]) | typings.react.mod.TouchEvent[HTMLElement], 
    /* dir */ Direction, 
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
    
    var backgroundStyle: CSSProperties
    
    var direction: Direction
    
    var flexBasis: js.UndefOr[String | Double] = js.undefined
    
    var height: Double | String
    
    var isResizing: Boolean
    
    var original: Y
    
    var width: Double | String
  }
  object State {
    
    inline def apply(
      backgroundStyle: CSSProperties,
      direction: Direction,
      height: Double | String,
      isResizing: Boolean,
      original: Y,
      width: Double | String
    ): State = {
      val __obj = js.Dynamic.literal(backgroundStyle = backgroundStyle.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setBackgroundStyle(value: CSSProperties): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setFlexBasis(value: String | Double): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsResizing(value: Boolean): Self = StObject.set(x, "isResizing", value.asInstanceOf[js.Any])
      
      inline def setOriginal(value: Y): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var MouseEvent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MouseEvent */ Any
      
      var TouchEvent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TouchEvent */ Any
    }
    object Window {
      
      inline def apply(
        MouseEvent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MouseEvent */ Any,
        TouchEvent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TouchEvent */ Any
      ): Window = {
        val __obj = js.Dynamic.literal(MouseEvent = MouseEvent.asInstanceOf[js.Any], TouchEvent = TouchEvent.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setMouseEvent(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MouseEvent */ Any): Self = StObject.set(x, "MouseEvent", value.asInstanceOf[js.Any])
        
        inline def setTouchEvent(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TouchEvent */ Any): Self = StObject.set(x, "TouchEvent", value.asInstanceOf[js.Any])
      }
    }
  }
}
