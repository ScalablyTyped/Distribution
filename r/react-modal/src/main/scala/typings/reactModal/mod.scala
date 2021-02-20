package typings.reactModal

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactModal.anon.Content
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-modal", JSImport.Namespace)
  @js.native
  class ^ () extends ReactModal
  @JSImport("react-modal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Override base styles for all instances of this component. */
  /* static member */
  @JSImport("react-modal", "defaultStyles")
  @js.native
  def defaultStyles: Styles = js.native
  @scala.inline
  def defaultStyles_=(x: Styles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultStyles")(x.asInstanceOf[js.Any])
  
  /**
    * Call this to properly hide your application from assistive screenreaders
    * and other assistive technologies while the modal is open.
    */
  /* static member */
  @JSImport("react-modal", "setAppElement")
  @js.native
  def setAppElement(appElement: String): Unit = js.native
  @JSImport("react-modal", "setAppElement")
  @js.native
  def setAppElement(appElement: HTMLElement): Unit = js.native
  
  @js.native
  trait Aria extends StObject {
    
    /** Identifies the element (or elements) that describes the object. */
    var describedby: js.UndefOr[String] = js.native
    
    /** Defines a string value that labels the current element. */
    var labelledby: js.UndefOr[String] = js.native
    
    /** Indicates whether an element is modal when displayed. */
    var modal: js.UndefOr[Boolean] = js.native
  }
  object Aria {
    
    @scala.inline
    def apply(): Aria = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Aria]
    }
    
    @scala.inline
    implicit class AriaMutableBuilder[Self <: Aria] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescribedby(value: String): Self = StObject.set(x, "describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescribedbyUndefined: Self = StObject.set(x, "describedby", js.undefined)
      
      @scala.inline
      def setLabelledby(value: String): Self = StObject.set(x, "labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelledbyUndefined: Self = StObject.set(x, "labelledby", js.undefined)
      
      @scala.inline
      def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    }
  }
  
  @js.native
  trait Classes extends StObject {
    
    var afterOpen: String = js.native
    
    var base: String = js.native
    
    var beforeClose: String = js.native
  }
  object Classes {
    
    @scala.inline
    def apply(afterOpen: String, base: String, beforeClose: String): Classes = {
      val __obj = js.Dynamic.literal(afterOpen = afterOpen.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], beforeClose = beforeClose.asInstanceOf[js.Any])
      __obj.asInstanceOf[Classes]
    }
    
    @scala.inline
    implicit class ClassesMutableBuilder[Self <: Classes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterOpen(value: String): Self = StObject.set(x, "afterOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeClose(value: String): Self = StObject.set(x, "beforeClose", value.asInstanceOf[js.Any])
    }
  }
  
  /** Describes unction that will be run after the modal has opened */
  type OnAfterOpenCallback = js.Function1[/* obj */ js.UndefOr[OnAfterOpenCallbackOptions], Unit]
  
  /** Describes overlay and content element references passed to onAfterOpen function */
  @js.native
  trait OnAfterOpenCallbackOptions extends StObject {
    
    /** content element reference */
    var contentEl: HTMLDivElement = js.native
    
    /** overlay element reference */
    var overlayEl: Element = js.native
  }
  object OnAfterOpenCallbackOptions {
    
    @scala.inline
    def apply(contentEl: HTMLDivElement, overlayEl: Element): OnAfterOpenCallbackOptions = {
      val __obj = js.Dynamic.literal(contentEl = contentEl.asInstanceOf[js.Any], overlayEl = overlayEl.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnAfterOpenCallbackOptions]
    }
    
    @scala.inline
    implicit class OnAfterOpenCallbackOptionsMutableBuilder[Self <: OnAfterOpenCallbackOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentEl(value: HTMLDivElement): Self = StObject.set(x, "contentEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayEl(value: Element): Self = StObject.set(x, "overlayEl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Props extends StObject {
    
    /* Set this to properly hide your application from assistive screenreaders and other assistive technologies while the modal is open. */
    var appElement: js.UndefOr[HTMLElement | js.Object] = js.native
    
    /* Additional aria attributes. */
    var aria: js.UndefOr[Aria] = js.native
    
    /* Boolean indicating if the appElement should be hidden. Defaults to true. */
    var ariaHideApp: js.UndefOr[Boolean] = js.native
    
    /* String className to be applied to the document.body (must be a constant string). When set to null it doesn't add any class to document.body. */
    var bodyOpenClassName: js.UndefOr[String | Null] = js.native
    
    /* String or object className to be applied to the modal content. */
    var className: js.UndefOr[String | Classes] = js.native
    
    /* Number indicating the milliseconds to wait before closing the modal. Defaults to zero (no timeout). */
    var closeTimeoutMS: js.UndefOr[Double] = js.native
    
    /* String indicating how the content container should be announced to screenreaders. */
    var contentLabel: js.UndefOr[String] = js.native
    
    /* Function accepting the ref for the content */
    var contentRef: js.UndefOr[js.Function1[/* instance */ HTMLDivElement, Unit]] = js.native
    
    /* Additional data attributes to be applied to to the modal content in the form of "data-*" */
    var data: js.UndefOr[js.Any] = js.native
    
    /* String className to be applied to the document.html (must be a constant string). Defaults to null. */
    var htmlOpenClassName: js.UndefOr[String | Null] = js.native
    
    /* String value of an id attribute to be applied to the modal content */
    var id: js.UndefOr[String] = js.native
    
    /* Boolean describing if the modal should be shown or not. Defaults to false. */
    var isOpen: Boolean = js.native
    
    /* Function that will be run after the modal has closed. */
    var onAfterClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    /* Function that will be run after the modal has opened. */
    var onAfterOpen: js.UndefOr[OnAfterOpenCallback] = js.native
    
    /* Function that will be run when the modal is requested to be closed, prior to actually closing. */
    var onRequestClose: js.UndefOr[
        js.Function1[/* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], Unit]
      ] = js.native
    
    /* String or object className to be applied to the overlay. */
    var overlayClassName: js.UndefOr[String | Classes] = js.native
    
    /* Function accepting the ref for the overlay */
    var overlayRef: js.UndefOr[js.Function1[/* instance */ HTMLDivElement, Unit]] = js.native
    
    /* Function that will be called to get the parent element that the modal will be attached to. */
    var parentSelector: js.UndefOr[js.Function0[HTMLElement]] = js.native
    
    /* String className to be applied to the portal. Defaults to "ReactModalPortal". */
    var portalClassName: js.UndefOr[String] = js.native
    
    /* String indicating the role of the modal, allowing the 'dialog' role to be applied if desired. Defaults to "dialog". */
    var role: js.UndefOr[String | Null] = js.native
    
    /* Boolean indicating if pressing the esc key should close the modal */
    var shouldCloseOnEsc: js.UndefOr[Boolean] = js.native
    
    /* Boolean indicating if the overlay should close the modal. Defaults to true. */
    var shouldCloseOnOverlayClick: js.UndefOr[Boolean] = js.native
    
    /* Boolean indicating if the modal should be focused after render */
    var shouldFocusAfterRender: js.UndefOr[Boolean] = js.native
    
    /* Boolean indicating if the modal should restore focus to the element that had focus prior to its display. */
    var shouldReturnFocusAfterClose: js.UndefOr[Boolean] = js.native
    
    /* Object indicating styles to be used for the modal, divided into overlay and content styles. */
    var style: js.UndefOr[Styles] = js.native
    
    /* String value of data-test-id attibute to be applied to to the modal content. */
    var testId: js.UndefOr[String] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(isOpen: Boolean): Props = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppElement(value: HTMLElement | js.Object): Self = StObject.set(x, "appElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppElementUndefined: Self = StObject.set(x, "appElement", js.undefined)
      
      @scala.inline
      def setAria(value: Aria): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaHideApp(value: Boolean): Self = StObject.set(x, "ariaHideApp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaHideAppUndefined: Self = StObject.set(x, "ariaHideApp", js.undefined)
      
      @scala.inline
      def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      @scala.inline
      def setBodyOpenClassName(value: String): Self = StObject.set(x, "bodyOpenClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyOpenClassNameNull: Self = StObject.set(x, "bodyOpenClassName", null)
      
      @scala.inline
      def setBodyOpenClassNameUndefined: Self = StObject.set(x, "bodyOpenClassName", js.undefined)
      
      @scala.inline
      def setClassName(value: String | Classes): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseTimeoutMS(value: Double): Self = StObject.set(x, "closeTimeoutMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseTimeoutMSUndefined: Self = StObject.set(x, "closeTimeoutMS", js.undefined)
      
      @scala.inline
      def setContentLabel(value: String): Self = StObject.set(x, "contentLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentLabelUndefined: Self = StObject.set(x, "contentLabel", js.undefined)
      
      @scala.inline
      def setContentRef(value: /* instance */ HTMLDivElement => Unit): Self = StObject.set(x, "contentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContentRefUndefined: Self = StObject.set(x, "contentRef", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHtmlOpenClassName(value: String): Self = StObject.set(x, "htmlOpenClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlOpenClassNameNull: Self = StObject.set(x, "htmlOpenClassName", null)
      
      @scala.inline
      def setHtmlOpenClassNameUndefined: Self = StObject.set(x, "htmlOpenClassName", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAfterClose(value: () => Unit): Self = StObject.set(x, "onAfterClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAfterCloseUndefined: Self = StObject.set(x, "onAfterClose", js.undefined)
      
      @scala.inline
      def setOnAfterOpen(value: /* obj */ js.UndefOr[OnAfterOpenCallbackOptions] => Unit): Self = StObject.set(x, "onAfterOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAfterOpenUndefined: Self = StObject.set(x, "onAfterOpen", js.undefined)
      
      @scala.inline
      def setOnRequestClose(value: /* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
      
      @scala.inline
      def setOverlayClassName(value: String | Classes): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      @scala.inline
      def setOverlayRef(value: /* instance */ HTMLDivElement => Unit): Self = StObject.set(x, "overlayRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOverlayRefUndefined: Self = StObject.set(x, "overlayRef", js.undefined)
      
      @scala.inline
      def setParentSelector(value: () => HTMLElement): Self = StObject.set(x, "parentSelector", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParentSelectorUndefined: Self = StObject.set(x, "parentSelector", js.undefined)
      
      @scala.inline
      def setPortalClassName(value: String): Self = StObject.set(x, "portalClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalClassNameUndefined: Self = StObject.set(x, "portalClassName", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleNull: Self = StObject.set(x, "role", null)
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setShouldCloseOnEsc(value: Boolean): Self = StObject.set(x, "shouldCloseOnEsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldCloseOnEscUndefined: Self = StObject.set(x, "shouldCloseOnEsc", js.undefined)
      
      @scala.inline
      def setShouldCloseOnOverlayClick(value: Boolean): Self = StObject.set(x, "shouldCloseOnOverlayClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldCloseOnOverlayClickUndefined: Self = StObject.set(x, "shouldCloseOnOverlayClick", js.undefined)
      
      @scala.inline
      def setShouldFocusAfterRender(value: Boolean): Self = StObject.set(x, "shouldFocusAfterRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldFocusAfterRenderUndefined: Self = StObject.set(x, "shouldFocusAfterRender", js.undefined)
      
      @scala.inline
      def setShouldReturnFocusAfterClose(value: Boolean): Self = StObject.set(x, "shouldReturnFocusAfterClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldReturnFocusAfterCloseUndefined: Self = StObject.set(x, "shouldReturnFocusAfterClose", js.undefined)
      
      @scala.inline
      def setStyle(value: Styles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
    }
  }
  
  @js.native
  trait ReactModal
    extends Component[Props, js.Object, js.Any] {
    
    var portal: Null | Content = js.native
  }
  
  @js.native
  trait Styles extends StObject {
    
    var content: js.UndefOr[CSSProperties] = js.native
    
    var overlay: js.UndefOr[CSSProperties] = js.native
  }
  object Styles {
    
    @scala.inline
    def apply(): Styles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styles]
    }
    
    @scala.inline
    implicit class StylesMutableBuilder[Self <: Styles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: CSSProperties): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setOverlay(value: CSSProperties): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    }
  }
}
