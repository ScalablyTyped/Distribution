package typings.primereact

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.primereactStrings.`bottom-left`
import typings.primereact.primereactStrings.`bottom-right`
import typings.primereact.primereactStrings.`top-left`
import typings.primereact.primereactStrings.`top-right`
import typings.primereact.primereactStrings.bottom
import typings.primereact.primereactStrings.center
import typings.primereact.primereactStrings.left
import typings.primereact.primereactStrings.right
import typings.primereact.primereactStrings.self
import typings.primereact.primereactStrings.top
import typings.primereact.utilsUtilsMod.IconOptions
import typings.primereact.utilsUtilsMod.IconType
import typings.react.mod.CSSProperties
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

object dialogDialogMod {
  
  @JSImport("primereact/dialog/dialog", "Dialog")
  @js.native
  open class Dialog protected () extends Component[DialogProps, Any, Any] {
    def this(props: DialogProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: DialogProps, context: Any) = this()
    
    /**
      * Used to get close button element.
      * @return {HTMLButtonElement} CloseButton element
      */
    def getCloseButton(): HTMLButtonElement = js.native
    
    /**
      * Used to get the content element of the dialog
      * @return {HTMLDivElement} Content element
      */
    def getContent(): HTMLDivElement = js.native
    
    /**
      * Used to get the container element of the dialog.
      * @return {HTMLDivElement} Container element
      */
    def getElement(): HTMLDivElement = js.native
    
    /**
      * Used to get the dialog's footer element.
      * @return {HTMLDivElement} Footer element
      */
    def getFooter(): HTMLDivElement = js.native
    
    /**
      * Used to get the header element of the dialog
      * @return {HTMLDivElement} Header element
      */
    def getHeader(): HTMLDivElement = js.native
    
    /**
      * Used to get mask element.
      * @return {HTMLDivElement} Mask element
      */
    def getMask(): HTMLDivElement = js.native
    
    /**
      * Reset the dialog's position.
      */
    def resetPosition(): Unit = js.native
  }
  
  /**
    * Dialog break options
    */
  type DialogBreakpoints = /**
    * Extra options.
    */
  StringDictionary[String]
  
  /**
    * Custom complete method event.
    * @see {@link DialogProps.onMaximize}
    * @event
    */
  trait DialogMaximizeEvent extends StObject {
    
    /**
      * When enabled, the dialog is initially displayed full screen.
      * @defaultValue false
      */
    var maximized: Boolean
    
    /**
      * Browser mouse event.
      */
    var originalEvent: SyntheticEvent[Element, Event]
  }
  object DialogMaximizeEvent {
    
    inline def apply(maximized: Boolean, originalEvent: SyntheticEvent[Element, Event]): DialogMaximizeEvent = {
      val __obj = js.Dynamic.literal(maximized = maximized.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogMaximizeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogMaximizeEvent] (val x: Self) extends AnyVal {
      
      inline def setMaximized(value: Boolean): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait DialogProps extends StObject {
    
    /**
      * DOM element instance where the overlay panel should be mounted. Valid values are any DOM Element and 'self'. The self value is used to render a component where it is located.
      * @defaultValue document.body
      */
    var appendTo: js.UndefOr[self | HTMLElement | Null] = js.undefined
    
    /**
      * Defines a string that labels the close icon.
      */
    var ariaCloseIconLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Base zIndex value to use in layering.
      * @defaultValue 0
      */
    var baseZIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether background scroll should be blocked when dialog is visible.
      * @defaultValue false
      */
    var blockScroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object literal to define widths per screen size.
      */
    var breakpoints: js.UndefOr[DialogBreakpoints] = js.undefined
    
    /**
      * Used to get the child elements of the component.
      * @readonly
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Style class of the component.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Adds a close icon to the header to hide the dialog.
      * @defaultValue true
      */
    var closable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Icon to display in the dialog close button.
      */
    var closeIcon: js.UndefOr[IconType[DialogProps]] = js.undefined
    
    /**
      * Specifies if pressing escape key should hide the dialog.
      * @defaultValue true
      */
    var closeOnEscape: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style class of the content section.
      */
    var contentClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Style of the content section.
      */
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Specifies if clicking the modal background should hide the dialog.
      * @defaultValue false
      */
    var dismissableMask: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables dragging to change the position using header.
      * @defaultValue true
      */
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled, first button receives focus on show.
      * @defaultValue true
      */
    var focusOnShow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Footer content of the dialog.
      */
    var footer: js.UndefOr[ReactNode | (js.Function1[/* props */ this.type, ReactNode])] = js.undefined
    
    /**
      * Title content of the dialog.
      */
    var header: js.UndefOr[ReactNode | (js.Function1[/* props */ this.type, ReactNode])] = js.undefined
    
    /**
      * Style class of the header section.
      */
    var headerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Style of the header section.
      */
    var headerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Custom icons template for the header.
      */
    var icons: js.UndefOr[ReactNode | (js.Function1[/* props */ this.type, ReactNode])] = js.undefined
    
    /**
      * Unique identifier of the element.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Keeps dialog in the viewport.
      * @defaultValue true
      */
    var keepInViewport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style class of the mask.
      */
    var maskClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Inline style of the mask.
      */
    var maskStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Whether the dialog can be displayed full screen.
      * @defaultValue false
      */
    var maximizable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Icon to display in the dialog maximize button when dialog is not maximized.
      */
    var maximizeIcon: js.UndefOr[IconType[DialogProps]] = js.undefined
    
    /**
      * When enabled, the dialog is initially displayed full screen.
      * @defaultValue false
      */
    var maximized: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Minimum value for the left coordinate of dialog in dragging.
      * @defaultValue 0
      */
    var minX: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum value for the top coordinate of dialog in dragging.
      * @defaultValue 0
      */
    var minY: js.UndefOr[Double] = js.undefined
    
    /**
      * Icon to display in the dialog maximize button when dialog is maximized.
      */
    var minimizeIcon: js.UndefOr[IconType[DialogProps]] = js.undefined
    
    /**
      * Defines if background should be blocked when dialog is displayed.
      * @defaultValue true
      */
    var modal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback to invoke when dialog is clicked.
      * @param {React.MouseEvent<HTMLElement>} event - Browser event.
      */
    var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
    
    /**
      * Callback to invoke when dragging dialog.
      * @param {React.DragEvent<HTMLElement>} event - Browser event.
      */
    var onDrag: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.undefined
    
    /**
      * Callback to invoke when dialog dragging is completed.
      * @param {React.DragEvent<HTMLElement>} event - Browser event.
      */
    var onDragEnd: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.undefined
    
    /**
      * Callback to invoke when dialog dragging is initiated.
      * @param {React.DragEvent<HTMLElement>} event - Browser event.
      */
    var onDragStart: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], Unit]] = js.undefined
    
    /**
      * Callback to invoke when dialog is hidden (Required).
      */
    def onHide(): Unit
    
    /**
      * Callback to invoke when the mask is clicked.
      * @param {React.MouseEvent<HTMLElement>} event - Browser event.
      */
    var onMaskClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
    
    /**
      * Callback to invoke when toggle maximize icon is clicked.
      * @param {DialogMaximizeEvent} event - Custom click event.
      */
    var onMaximize: js.UndefOr[js.Function1[/* event */ DialogMaximizeEvent, Unit]] = js.undefined
    
    /**
      * Callback to invoke while resizing dialog.
      * @param {React.MouseEvent<HTMLElement>} event - Browser event.
      */
    var onResize: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
    
    /**
      * Callback to invoke when dialog resizing is completed.
      * @param {React.MouseEvent<HTMLElement>} event - Browser event.
      */
    var onResizeEnd: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
    
    /**
      * Callback to invoke when dialog resizing is initiated.
      * @param {React.MouseEvent<HTMLElement>} event - Browser event.
      */
    var onResizeStart: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
    
    /**
      * Callback to invoke when dialog is showed.
      */
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Position of the dialog, options are "center", "top", "bottom", "left", "right", "top-left", "top-right", "bottom-left" or "bottom-right".
      * @defaultValue center
      */
    var position: js.UndefOr[
        center | top | bottom | left | right | `top-left` | `top-right` | `bottom-left` | `bottom-right`
      ] = js.undefined
    
    /**
      * Enables resizing of the content.
      * @defaultValue true
      */
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled dialog is displayed in RTL direction.
      * @defaultValue false
      */
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show the header or not.
      * @defaultValue true
      */
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Inline style of the component.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * The properties of CSSTransition can be customized, except for "nodeRef" and "in" properties.
      */
    var transitionOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ] = js.undefined
    
    /**
      * Specifies the visibility of the dialog.
      * @defaultValue false
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object DialogProps {
    
    inline def apply(onHide: () => Unit): DialogProps = {
      val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
      __obj.asInstanceOf[DialogProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogProps] (val x: Self) extends AnyVal {
      
      inline def setAppendTo(value: self | HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
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
      
      inline def setCloseIcon(value: IconType[DialogProps]): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconFunction1(value: /* options */ IconOptions[DialogProps] => ReactNode): Self = StObject.set(x, "closeIcon", js.Any.fromFunction1(value))
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
      
      inline def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setDismissableMask(value: Boolean): Self = StObject.set(x, "dismissableMask", value.asInstanceOf[js.Any])
      
      inline def setDismissableMaskUndefined: Self = StObject.set(x, "dismissableMask", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setFocusOnShow(value: Boolean): Self = StObject.set(x, "focusOnShow", value.asInstanceOf[js.Any])
      
      inline def setFocusOnShowUndefined: Self = StObject.set(x, "focusOnShow", js.undefined)
      
      inline def setFooter(value: ReactNode | (js.Function1[DialogProps, ReactNode])): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterFunction1(value: DialogProps => ReactNode): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: ReactNode | (js.Function1[DialogProps, ReactNode])): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
      
      inline def setHeaderFunction1(value: DialogProps => ReactNode): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      inline def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIcons(value: ReactNode | (js.Function1[DialogProps, ReactNode])): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsFunction1(value: DialogProps => ReactNode): Self = StObject.set(x, "icons", js.Any.fromFunction1(value))
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKeepInViewport(value: Boolean): Self = StObject.set(x, "keepInViewport", value.asInstanceOf[js.Any])
      
      inline def setKeepInViewportUndefined: Self = StObject.set(x, "keepInViewport", js.undefined)
      
      inline def setMaskClassName(value: String): Self = StObject.set(x, "maskClassName", value.asInstanceOf[js.Any])
      
      inline def setMaskClassNameUndefined: Self = StObject.set(x, "maskClassName", js.undefined)
      
      inline def setMaskStyle(value: CSSProperties): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      inline def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      inline def setMaximizable(value: Boolean): Self = StObject.set(x, "maximizable", value.asInstanceOf[js.Any])
      
      inline def setMaximizableUndefined: Self = StObject.set(x, "maximizable", js.undefined)
      
      inline def setMaximizeIcon(value: IconType[DialogProps]): Self = StObject.set(x, "maximizeIcon", value.asInstanceOf[js.Any])
      
      inline def setMaximizeIconFunction1(value: /* options */ IconOptions[DialogProps] => ReactNode): Self = StObject.set(x, "maximizeIcon", js.Any.fromFunction1(value))
      
      inline def setMaximizeIconUndefined: Self = StObject.set(x, "maximizeIcon", js.undefined)
      
      inline def setMaximized(value: Boolean): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
      
      inline def setMaximizedUndefined: Self = StObject.set(x, "maximized", js.undefined)
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinXUndefined: Self = StObject.set(x, "minX", js.undefined)
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setMinYUndefined: Self = StObject.set(x, "minY", js.undefined)
      
      inline def setMinimizeIcon(value: IconType[DialogProps]): Self = StObject.set(x, "minimizeIcon", value.asInstanceOf[js.Any])
      
      inline def setMinimizeIconFunction1(value: /* options */ IconOptions[DialogProps] => ReactNode): Self = StObject.set(x, "minimizeIcon", js.Any.fromFunction1(value))
      
      inline def setMinimizeIconUndefined: Self = StObject.set(x, "minimizeIcon", js.undefined)
      
      inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setOnClick(value: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDrag(value: /* event */ DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragEnd(value: /* event */ DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragStart(value: /* event */ DragEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnMaskClick(value: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMaskClick", js.Any.fromFunction1(value))
      
      inline def setOnMaskClickUndefined: Self = StObject.set(x, "onMaskClick", js.undefined)
      
      inline def setOnMaximize(value: /* event */ DialogMaximizeEvent => Unit): Self = StObject.set(x, "onMaximize", js.Any.fromFunction1(value))
      
      inline def setOnMaximizeUndefined: Self = StObject.set(x, "onMaximize", js.undefined)
      
      inline def setOnResize(value: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setOnResizeEnd(value: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onResizeEnd", js.Any.fromFunction1(value))
      
      inline def setOnResizeEndUndefined: Self = StObject.set(x, "onResizeEnd", js.undefined)
      
      inline def setOnResizeStart(value: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction1(value))
      
      inline def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPosition(
        value: center | top | bottom | left | right | `top-left` | `top-right` | `bottom-left` | `bottom-right`
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransitionOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ): Self = StObject.set(x, "transitionOptions", value.asInstanceOf[js.Any])
      
      inline def setTransitionOptionsUndefined: Self = StObject.set(x, "transitionOptions", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
