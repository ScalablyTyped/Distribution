package typings.primereact

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.primereactStrings.self
import typings.react.mod.Component
import typings.react.mod.DragEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod {
  
  @JSImport("primereact/dialog/dialog", "Dialog")
  @js.native
  open class Dialog protected () extends Component[DialogProps, Any, Any] {
    def this(props: DialogProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DialogProps, context: Any) = this()
    
    def getCloseButton(): HTMLButtonElement = js.native
    
    def getContent(): HTMLDivElement = js.native
    
    def getElement(): HTMLDivElement = js.native
    
    def getFooter(): HTMLDivElement = js.native
    
    def getHeader(): HTMLDivElement = js.native
    
    def getMask(): HTMLDivElement = js.native
    
    def resetPosition(): Unit = js.native
  }
  
  type DialogAppendToType = js.UndefOr[self | HTMLElement | Null]
  
  type DialogBreakpoints = StringDictionary[String]
  
  trait DialogMaximizeParams extends StObject {
    
    var maximized: Boolean
    
    var originalEvent: SyntheticEvent[Element, Event]
  }
  object DialogMaximizeParams {
    
    inline def apply(maximized: Boolean, originalEvent: SyntheticEvent[Element, Event]): DialogMaximizeParams = {
      val __obj = js.Dynamic.literal(maximized = maximized.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogMaximizeParams]
    }
    
    extension [Self <: DialogMaximizeParams](x: Self) {
      
      inline def setMaximized(value: Boolean): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.primereact.primereactStrings.center
    - typings.primereact.primereactStrings.top
    - typings.primereact.primereactStrings.bottom
    - typings.primereact.primereactStrings.left
    - typings.primereact.primereactStrings.right
    - typings.primereact.primereactStrings.`top-left`
    - typings.primereact.primereactStrings.`top-right`
    - typings.primereact.primereactStrings.`bottom-left`
    - typings.primereact.primereactStrings.`bottom-right`
  */
  trait DialogPositionType extends StObject
  object DialogPositionType {
    
    inline def bottom: typings.primereact.primereactStrings.bottom = "bottom".asInstanceOf[typings.primereact.primereactStrings.bottom]
    
    inline def `bottom-left`: typings.primereact.primereactStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.primereact.primereactStrings.`bottom-left`]
    
    inline def `bottom-right`: typings.primereact.primereactStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.primereact.primereactStrings.`bottom-right`]
    
    inline def center: typings.primereact.primereactStrings.center = "center".asInstanceOf[typings.primereact.primereactStrings.center]
    
    inline def left: typings.primereact.primereactStrings.left = "left".asInstanceOf[typings.primereact.primereactStrings.left]
    
    inline def right: typings.primereact.primereactStrings.right = "right".asInstanceOf[typings.primereact.primereactStrings.right]
    
    inline def top: typings.primereact.primereactStrings.top = "top".asInstanceOf[typings.primereact.primereactStrings.top]
    
    inline def `top-left`: typings.primereact.primereactStrings.`top-left` = "top-left".asInstanceOf[typings.primereact.primereactStrings.`top-left`]
    
    inline def `top-right`: typings.primereact.primereactStrings.`top-right` = "top-right".asInstanceOf[typings.primereact.primereactStrings.`top-right`]
  }
  
  trait DialogProps extends StObject {
    
    var appendTo: js.UndefOr[DialogAppendToType] = js.undefined
    
    var ariaCloseIconLabel: js.UndefOr[String] = js.undefined
    
    var baseZIndex: js.UndefOr[Double] = js.undefined
    
    var blockScroll: js.UndefOr[Boolean] = js.undefined
    
    var breakpoints: js.UndefOr[DialogBreakpoints] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var closeOnEscape: js.UndefOr[Boolean] = js.undefined
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var contentStyle: js.UndefOr[js.Object] = js.undefined
    
    var dismissableMask: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var focusOnShow: js.UndefOr[Boolean] = js.undefined
    
    var footer: js.UndefOr[DialogTemplateType] = js.undefined
    
    var header: js.UndefOr[DialogTemplateType] = js.undefined
    
    var headerClassName: js.UndefOr[String] = js.undefined
    
    var headerStyle: js.UndefOr[js.Object] = js.undefined
    
    var icons: js.UndefOr[DialogTemplateType] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var keepInViewport: js.UndefOr[Boolean] = js.undefined
    
    var maskClassName: js.UndefOr[String] = js.undefined
    
    var maskStyle: js.UndefOr[js.Object] = js.undefined
    
    var maximizable: js.UndefOr[Boolean] = js.undefined
    
    var maximized: js.UndefOr[Boolean] = js.undefined
    
    var minX: js.UndefOr[Double] = js.undefined
    
    var minY: js.UndefOr[Double] = js.undefined
    
    var modal: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
    
    var onDrag: js.UndefOr[js.Function1[/* e */ DragEvent[HTMLElement], Unit]] = js.undefined
    
    var onDragEnd: js.UndefOr[js.Function1[/* e */ DragEvent[HTMLElement], Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function1[/* e */ DragEvent[HTMLElement], Unit]] = js.undefined
    
    def onHide(): Unit
    
    var onMaskClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
    
    var onMaximize: js.UndefOr[js.Function1[/* e */ DialogMaximizeParams, Unit]] = js.undefined
    
    var onResize: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
    
    var onResizeEnd: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
    
    var onResizeStart: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var position: js.UndefOr[DialogPositionType] = js.undefined
    
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var transitionOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object DialogProps {
    
    inline def apply(onHide: () => Unit): DialogProps = {
      val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
      __obj.asInstanceOf[DialogProps]
    }
    
    extension [Self <: DialogProps](x: Self) {
      
      inline def setAppendTo(value: DialogAppendToType): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToNull: Self = StObject.set(x, "appendTo", null)
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAriaCloseIconLabel(value: String): Self = StObject.set(x, "ariaCloseIconLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaCloseIconLabelUndefined: Self = StObject.set(x, "ariaCloseIconLabel", js.undefined)
      
      inline def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
      
      inline def setBaseZIndexUndefined: Self = StObject.set(x, "baseZIndex", js.undefined)
      
      inline def setBlockScroll(value: Boolean): Self = StObject.set(x, "blockScroll", value.asInstanceOf[js.Any])
      
      inline def setBlockScrollUndefined: Self = StObject.set(x, "blockScroll", js.undefined)
      
      inline def setBreakpoints(value: DialogBreakpoints): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
      
      inline def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setContentStyle(value: js.Object): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setDismissableMask(value: Boolean): Self = StObject.set(x, "dismissableMask", value.asInstanceOf[js.Any])
      
      inline def setDismissableMaskUndefined: Self = StObject.set(x, "dismissableMask", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setFocusOnShow(value: Boolean): Self = StObject.set(x, "focusOnShow", value.asInstanceOf[js.Any])
      
      inline def setFocusOnShowUndefined: Self = StObject.set(x, "focusOnShow", js.undefined)
      
      inline def setFooter(value: DialogTemplateType): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterFunction1(value: /* props */ DialogProps => ReactNode): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: DialogTemplateType): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
      
      inline def setHeaderFunction1(value: /* props */ DialogProps => ReactNode): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      inline def setHeaderStyle(value: js.Object): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIcons(value: DialogTemplateType): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsFunction1(value: /* props */ DialogProps => ReactNode): Self = StObject.set(x, "icons", js.Any.fromFunction1(value))
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKeepInViewport(value: Boolean): Self = StObject.set(x, "keepInViewport", value.asInstanceOf[js.Any])
      
      inline def setKeepInViewportUndefined: Self = StObject.set(x, "keepInViewport", js.undefined)
      
      inline def setMaskClassName(value: String): Self = StObject.set(x, "maskClassName", value.asInstanceOf[js.Any])
      
      inline def setMaskClassNameUndefined: Self = StObject.set(x, "maskClassName", js.undefined)
      
      inline def setMaskStyle(value: js.Object): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      inline def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      inline def setMaximizable(value: Boolean): Self = StObject.set(x, "maximizable", value.asInstanceOf[js.Any])
      
      inline def setMaximizableUndefined: Self = StObject.set(x, "maximizable", js.undefined)
      
      inline def setMaximized(value: Boolean): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
      
      inline def setMaximizedUndefined: Self = StObject.set(x, "maximized", js.undefined)
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinXUndefined: Self = StObject.set(x, "minX", js.undefined)
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setMinYUndefined: Self = StObject.set(x, "minY", js.undefined)
      
      inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setOnClick(value: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDrag(value: /* e */ DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: /* e */ DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragStart(value: /* e */ DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnMaskClick(value: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMaskClick", js.Any.fromFunction1(value))
      
      inline def setOnMaskClickUndefined: Self = StObject.set(x, "onMaskClick", js.undefined)
      
      inline def setOnMaximize(value: /* e */ DialogMaximizeParams => Unit): Self = StObject.set(x, "onMaximize", js.Any.fromFunction1(value))
      
      inline def setOnMaximizeUndefined: Self = StObject.set(x, "onMaximize", js.undefined)
      
      inline def setOnResize(value: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setOnResizeEnd(value: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onResizeEnd", js.Any.fromFunction1(value))
      
      inline def setOnResizeEndUndefined: Self = StObject.set(x, "onResizeEnd", js.undefined)
      
      inline def setOnResizeStart(value: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction1(value))
      
      inline def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPosition(value: DialogPositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransitionOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ): Self = StObject.set(x, "transitionOptions", value.asInstanceOf[js.Any])
      
      inline def setTransitionOptionsUndefined: Self = StObject.set(x, "transitionOptions", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type DialogTemplateType = ReactNode | (js.Function1[/* props */ DialogProps, ReactNode])
}
