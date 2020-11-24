package typings.reactModal.mod

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
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
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppElement(value: HTMLElement | js.Object): Self = this.set("appElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppElement: Self = this.set("appElement", js.undefined)
    
    @scala.inline
    def setAria(value: Aria): Self = this.set("aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAria: Self = this.set("aria", js.undefined)
    
    @scala.inline
    def setAriaHideApp(value: Boolean): Self = this.set("ariaHideApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaHideApp: Self = this.set("ariaHideApp", js.undefined)
    
    @scala.inline
    def setBodyOpenClassName(value: String): Self = this.set("bodyOpenClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyOpenClassName: Self = this.set("bodyOpenClassName", js.undefined)
    
    @scala.inline
    def setBodyOpenClassNameNull: Self = this.set("bodyOpenClassName", null)
    
    @scala.inline
    def setClassName(value: String | Classes): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCloseTimeoutMS(value: Double): Self = this.set("closeTimeoutMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseTimeoutMS: Self = this.set("closeTimeoutMS", js.undefined)
    
    @scala.inline
    def setContentLabel(value: String): Self = this.set("contentLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLabel: Self = this.set("contentLabel", js.undefined)
    
    @scala.inline
    def setContentRef(value: /* instance */ HTMLDivElement => Unit): Self = this.set("contentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContentRef: Self = this.set("contentRef", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setHtmlOpenClassName(value: String): Self = this.set("htmlOpenClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlOpenClassName: Self = this.set("htmlOpenClassName", js.undefined)
    
    @scala.inline
    def setHtmlOpenClassNameNull: Self = this.set("htmlOpenClassName", null)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setOnAfterClose(value: () => Unit): Self = this.set("onAfterClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAfterClose: Self = this.set("onAfterClose", js.undefined)
    
    @scala.inline
    def setOnAfterOpen(value: /* obj */ js.UndefOr[OnAfterOpenCallbackOptions] => Unit): Self = this.set("onAfterOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAfterOpen: Self = this.set("onAfterOpen", js.undefined)
    
    @scala.inline
    def setOnRequestClose(value: /* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] => Unit): Self = this.set("onRequestClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRequestClose: Self = this.set("onRequestClose", js.undefined)
    
    @scala.inline
    def setOverlayClassName(value: String | Classes): Self = this.set("overlayClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayClassName: Self = this.set("overlayClassName", js.undefined)
    
    @scala.inline
    def setOverlayRef(value: /* instance */ HTMLDivElement => Unit): Self = this.set("overlayRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOverlayRef: Self = this.set("overlayRef", js.undefined)
    
    @scala.inline
    def setParentSelector(value: () => HTMLElement): Self = this.set("parentSelector", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteParentSelector: Self = this.set("parentSelector", js.undefined)
    
    @scala.inline
    def setPortalClassName(value: String): Self = this.set("portalClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalClassName: Self = this.set("portalClassName", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setRoleNull: Self = this.set("role", null)
    
    @scala.inline
    def setShouldCloseOnEsc(value: Boolean): Self = this.set("shouldCloseOnEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldCloseOnEsc: Self = this.set("shouldCloseOnEsc", js.undefined)
    
    @scala.inline
    def setShouldCloseOnOverlayClick(value: Boolean): Self = this.set("shouldCloseOnOverlayClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldCloseOnOverlayClick: Self = this.set("shouldCloseOnOverlayClick", js.undefined)
    
    @scala.inline
    def setShouldFocusAfterRender(value: Boolean): Self = this.set("shouldFocusAfterRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldFocusAfterRender: Self = this.set("shouldFocusAfterRender", js.undefined)
    
    @scala.inline
    def setShouldReturnFocusAfterClose(value: Boolean): Self = this.set("shouldReturnFocusAfterClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldReturnFocusAfterClose: Self = this.set("shouldReturnFocusAfterClose", js.undefined)
    
    @scala.inline
    def setStyle(value: Styles): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTestId(value: String): Self = this.set("testId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestId: Self = this.set("testId", js.undefined)
  }
}
