package typings.reactModal

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactModal.anon.Content
import typings.reactModal.reactModalStrings.div
import typings.std.Element
import typings.std.HTMLCollection
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-modal", JSImport.Namespace)
  @js.native
  open class ^ () extends ReactModal
  @JSImport("react-modal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Override base styles for all instances of this component. */
  /* static member */
  @JSImport("react-modal", "defaultStyles")
  @js.native
  def defaultStyles: Styles = js.native
  inline def defaultStyles_=(x: Styles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultStyles")(x.asInstanceOf[js.Any])
  
  /**
    * Call this to properly hide your application from assistive screenreaders
    * and other assistive technologies while the modal is open.
    */
  /* static member */
  inline def setAppElement(appElement: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAppElement")(appElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setAppElement(appElement: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAppElement")(appElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Aria extends StObject {
    
    /** Identifies the element (or elements) that describes the object. */
    var describedby: js.UndefOr[String] = js.undefined
    
    /** Defines a string value that labels the current element. */
    var labelledby: js.UndefOr[String] = js.undefined
    
    /** Indicates whether an element is modal when displayed. */
    var modal: js.UndefOr[Boolean] = js.undefined
  }
  object Aria {
    
    inline def apply(): Aria = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Aria]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Aria] (val x: Self) extends AnyVal {
      
      inline def setDescribedby(value: String): Self = StObject.set(x, "describedby", value.asInstanceOf[js.Any])
      
      inline def setDescribedbyUndefined: Self = StObject.set(x, "describedby", js.undefined)
      
      inline def setLabelledby(value: String): Self = StObject.set(x, "labelledby", value.asInstanceOf[js.Any])
      
      inline def setLabelledbyUndefined: Self = StObject.set(x, "labelledby", js.undefined)
      
      inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    }
  }
  
  trait Classes extends StObject {
    
    var afterOpen: String
    
    var base: String
    
    var beforeClose: String
  }
  object Classes {
    
    inline def apply(afterOpen: String, base: String, beforeClose: String): Classes = {
      val __obj = js.Dynamic.literal(afterOpen = afterOpen.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], beforeClose = beforeClose.asInstanceOf[js.Any])
      __obj.asInstanceOf[Classes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Classes] (val x: Self) extends AnyVal {
      
      inline def setAfterOpen(value: String): Self = StObject.set(x, "afterOpen", value.asInstanceOf[js.Any])
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBeforeClose(value: String): Self = StObject.set(x, "beforeClose", value.asInstanceOf[js.Any])
    }
  }
  
  /** Describes unction that will be run after the modal has opened */
  type OnAfterOpenCallback = js.Function1[/* obj */ js.UndefOr[OnAfterOpenCallbackOptions], Unit]
  
  /** Describes overlay and content element references passed to onAfterOpen function */
  trait OnAfterOpenCallbackOptions extends StObject {
    
    /** content element reference */
    var contentEl: HTMLDivElement
    
    /** overlay element reference */
    var overlayEl: Element
  }
  object OnAfterOpenCallbackOptions {
    
    inline def apply(contentEl: HTMLDivElement, overlayEl: Element): OnAfterOpenCallbackOptions = {
      val __obj = js.Dynamic.literal(contentEl = contentEl.asInstanceOf[js.Any], overlayEl = overlayEl.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnAfterOpenCallbackOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnAfterOpenCallbackOptions] (val x: Self) extends AnyVal {
      
      inline def setContentEl(value: HTMLDivElement): Self = StObject.set(x, "contentEl", value.asInstanceOf[js.Any])
      
      inline def setOverlayEl(value: Element): Self = StObject.set(x, "overlayEl", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    /* Set this to properly hide your application from assistive screenreaders and other assistive technologies while the modal is open. */
    var appElement: js.UndefOr[HTMLElement | js.Array[HTMLElement] | HTMLCollection | NodeList] = js.undefined
    
    /* Additional aria attributes. */
    var aria: js.UndefOr[Aria] = js.undefined
    
    /* Boolean indicating if the appElement should be hidden. Defaults to true. */
    var ariaHideApp: js.UndefOr[Boolean] = js.undefined
    
    /* String className to be applied to the document.body (must be a constant string). When set to null it doesn't add any class to document.body. */
    var bodyOpenClassName: js.UndefOr[String | Null] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /* String or object className to be applied to the modal content. */
    var className: js.UndefOr[String | Classes] = js.undefined
    
    /* Number indicating the milliseconds to wait before closing the modal. Defaults to zero (no timeout). */
    var closeTimeoutMS: js.UndefOr[Double] = js.undefined
    
    /* Custom Content element. */
    var contentElement: js.UndefOr[
        js.Function2[/* props */ ComponentPropsWithRef[div], /* children */ ReactNode, ReactElement]
      ] = js.undefined
    
    /* String indicating how the content container should be announced to screenreaders. */
    var contentLabel: js.UndefOr[String] = js.undefined
    
    /* Function accepting the ref for the content */
    var contentRef: js.UndefOr[js.Function1[/* instance */ HTMLDivElement, Unit]] = js.undefined
    
    /* Additional data attributes to be applied to to the modal content in the form of "data-*" */
    var data: js.UndefOr[Any] = js.undefined
    
    /* String className to be applied to the document.html (must be a constant string). Defaults to null. */
    var htmlOpenClassName: js.UndefOr[String | Null] = js.undefined
    
    /* String value of an id attribute to be applied to the modal content */
    var id: js.UndefOr[String] = js.undefined
    
    /* Boolean describing if the modal should be shown or not. Defaults to false. */
    var isOpen: Boolean
    
    /* Function that will be run after the modal has closed. */
    var onAfterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /* Function that will be run after the modal has opened. */
    var onAfterOpen: js.UndefOr[OnAfterOpenCallback] = js.undefined
    
    /* Function that will be run when the modal is requested to be closed, prior to actually closing. */
    var onRequestClose: js.UndefOr[
        js.Function1[/* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], Unit]
      ] = js.undefined
    
    /* String or object className to be applied to the overlay. */
    var overlayClassName: js.UndefOr[String | Classes] = js.undefined
    
    /* Custom Overlay element. */
    var overlayElement: js.UndefOr[
        js.Function2[/* props */ ComponentPropsWithRef[div], /* contentEl */ ReactElement, ReactElement]
      ] = js.undefined
    
    /* Function accepting the ref for the overlay */
    var overlayRef: js.UndefOr[js.Function1[/* instance */ HTMLDivElement, Unit]] = js.undefined
    
    /* Function that will be called to get the parent element that the modal will be attached to. */
    var parentSelector: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
    
    /* String className to be applied to the portal. Defaults to "ReactModalPortal". */
    var portalClassName: js.UndefOr[String] = js.undefined
    
    /* Boolean indicating if the modal should use the preventScroll flag when restoring focus to the element that had focus prior to its display. */
    var preventScroll: js.UndefOr[Boolean] = js.undefined
    
    /* String indicating the role of the modal, allowing the 'dialog' role to be applied if desired. Defaults to "dialog". */
    var role: js.UndefOr[String | Null] = js.undefined
    
    /* Boolean indicating if pressing the esc key should close the modal */
    var shouldCloseOnEsc: js.UndefOr[Boolean] = js.undefined
    
    /* Boolean indicating if the overlay should close the modal. Defaults to true. */
    var shouldCloseOnOverlayClick: js.UndefOr[Boolean] = js.undefined
    
    /* Boolean indicating if the modal should be focused after render */
    var shouldFocusAfterRender: js.UndefOr[Boolean] = js.undefined
    
    /* Boolean indicating if the modal should restore focus to the element that had focus prior to its display. */
    var shouldReturnFocusAfterClose: js.UndefOr[Boolean] = js.undefined
    
    /* Object indicating styles to be used for the modal, divided into overlay and content styles. */
    var style: js.UndefOr[Styles] = js.undefined
    
    /* String value of data-test-id attibute to be applied to to the modal content. */
    var testId: js.UndefOr[String] = js.undefined
  }
  object Props {
    
    inline def apply(isOpen: Boolean): Props = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setAppElement(value: HTMLElement | js.Array[HTMLElement] | HTMLCollection | NodeList): Self = StObject.set(x, "appElement", value.asInstanceOf[js.Any])
      
      inline def setAppElementUndefined: Self = StObject.set(x, "appElement", js.undefined)
      
      inline def setAppElementVarargs(value: HTMLElement*): Self = StObject.set(x, "appElement", js.Array(value*))
      
      inline def setAria(value: Aria): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      inline def setAriaHideApp(value: Boolean): Self = StObject.set(x, "ariaHideApp", value.asInstanceOf[js.Any])
      
      inline def setAriaHideAppUndefined: Self = StObject.set(x, "ariaHideApp", js.undefined)
      
      inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      inline def setBodyOpenClassName(value: String): Self = StObject.set(x, "bodyOpenClassName", value.asInstanceOf[js.Any])
      
      inline def setBodyOpenClassNameNull: Self = StObject.set(x, "bodyOpenClassName", null)
      
      inline def setBodyOpenClassNameUndefined: Self = StObject.set(x, "bodyOpenClassName", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String | Classes): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseTimeoutMS(value: Double): Self = StObject.set(x, "closeTimeoutMS", value.asInstanceOf[js.Any])
      
      inline def setCloseTimeoutMSUndefined: Self = StObject.set(x, "closeTimeoutMS", js.undefined)
      
      inline def setContentElement(value: (/* props */ ComponentPropsWithRef[div], /* children */ ReactNode) => ReactElement): Self = StObject.set(x, "contentElement", js.Any.fromFunction2(value))
      
      inline def setContentElementUndefined: Self = StObject.set(x, "contentElement", js.undefined)
      
      inline def setContentLabel(value: String): Self = StObject.set(x, "contentLabel", value.asInstanceOf[js.Any])
      
      inline def setContentLabelUndefined: Self = StObject.set(x, "contentLabel", js.undefined)
      
      inline def setContentRef(value: /* instance */ HTMLDivElement => Unit): Self = StObject.set(x, "contentRef", js.Any.fromFunction1(value))
      
      inline def setContentRefUndefined: Self = StObject.set(x, "contentRef", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHtmlOpenClassName(value: String): Self = StObject.set(x, "htmlOpenClassName", value.asInstanceOf[js.Any])
      
      inline def setHtmlOpenClassNameNull: Self = StObject.set(x, "htmlOpenClassName", null)
      
      inline def setHtmlOpenClassNameUndefined: Self = StObject.set(x, "htmlOpenClassName", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setOnAfterClose(value: () => Unit): Self = StObject.set(x, "onAfterClose", js.Any.fromFunction0(value))
      
      inline def setOnAfterCloseUndefined: Self = StObject.set(x, "onAfterClose", js.undefined)
      
      inline def setOnAfterOpen(value: /* obj */ js.UndefOr[OnAfterOpenCallbackOptions] => Unit): Self = StObject.set(x, "onAfterOpen", js.Any.fromFunction1(value))
      
      inline def setOnAfterOpenUndefined: Self = StObject.set(x, "onAfterOpen", js.undefined)
      
      inline def setOnRequestClose(value: /* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1(value))
      
      inline def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
      
      inline def setOverlayClassName(value: String | Classes): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      inline def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      inline def setOverlayElement(value: (/* props */ ComponentPropsWithRef[div], /* contentEl */ ReactElement) => ReactElement): Self = StObject.set(x, "overlayElement", js.Any.fromFunction2(value))
      
      inline def setOverlayElementUndefined: Self = StObject.set(x, "overlayElement", js.undefined)
      
      inline def setOverlayRef(value: /* instance */ HTMLDivElement => Unit): Self = StObject.set(x, "overlayRef", js.Any.fromFunction1(value))
      
      inline def setOverlayRefUndefined: Self = StObject.set(x, "overlayRef", js.undefined)
      
      inline def setParentSelector(value: () => HTMLElement): Self = StObject.set(x, "parentSelector", js.Any.fromFunction0(value))
      
      inline def setParentSelectorUndefined: Self = StObject.set(x, "parentSelector", js.undefined)
      
      inline def setPortalClassName(value: String): Self = StObject.set(x, "portalClassName", value.asInstanceOf[js.Any])
      
      inline def setPortalClassNameUndefined: Self = StObject.set(x, "portalClassName", js.undefined)
      
      inline def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
      
      inline def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleNull: Self = StObject.set(x, "role", null)
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setShouldCloseOnEsc(value: Boolean): Self = StObject.set(x, "shouldCloseOnEsc", value.asInstanceOf[js.Any])
      
      inline def setShouldCloseOnEscUndefined: Self = StObject.set(x, "shouldCloseOnEsc", js.undefined)
      
      inline def setShouldCloseOnOverlayClick(value: Boolean): Self = StObject.set(x, "shouldCloseOnOverlayClick", value.asInstanceOf[js.Any])
      
      inline def setShouldCloseOnOverlayClickUndefined: Self = StObject.set(x, "shouldCloseOnOverlayClick", js.undefined)
      
      inline def setShouldFocusAfterRender(value: Boolean): Self = StObject.set(x, "shouldFocusAfterRender", value.asInstanceOf[js.Any])
      
      inline def setShouldFocusAfterRenderUndefined: Self = StObject.set(x, "shouldFocusAfterRender", js.undefined)
      
      inline def setShouldReturnFocusAfterClose(value: Boolean): Self = StObject.set(x, "shouldReturnFocusAfterClose", value.asInstanceOf[js.Any])
      
      inline def setShouldReturnFocusAfterCloseUndefined: Self = StObject.set(x, "shouldReturnFocusAfterClose", js.undefined)
      
      inline def setStyle(value: Styles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
      
      inline def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
    }
  }
  
  @js.native
  trait ReactModal
    extends Component[Props, js.Object, Any] {
    
    var portal: Null | Content = js.native
  }
  
  trait Styles extends StObject {
    
    var content: js.UndefOr[CSSProperties] = js.undefined
    
    var overlay: js.UndefOr[CSSProperties] = js.undefined
  }
  object Styles {
    
    inline def apply(): Styles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Styles] (val x: Self) extends AnyVal {
      
      inline def setContent(value: CSSProperties): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setOverlay(value: CSSProperties): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    }
  }
}
