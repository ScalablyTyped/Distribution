package typings.reactModal.mod

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /* Set this to properly hide your application from assistive screenreaders and other assistive technologies while the modal is open. */
  var appElement: js.UndefOr[HTMLElement | js.Object] = js.undefined
  /* Additional aria attributes. */
  var aria: js.UndefOr[Aria] = js.undefined
  /* Boolean indicating if the appElement should be hidden. Defaults to true. */
  var ariaHideApp: js.UndefOr[Boolean] = js.undefined
  /* String className to be applied to the document.body (must be a constant string). When set to null it doesn't add any class to document.body. */
  var bodyOpenClassName: js.UndefOr[String | Null] = js.undefined
  /* String or object className to be applied to the modal content. */
  var className: js.UndefOr[String | Classes] = js.undefined
  /* Number indicating the milliseconds to wait before closing the modal. Defaults to zero (no timeout). */
  var closeTimeoutMS: js.UndefOr[Double] = js.undefined
  /* String indicating how the content container should be announced to screenreaders. */
  var contentLabel: js.UndefOr[String] = js.undefined
  /* Function accepting the ref for the content */
  var contentRef: js.UndefOr[js.Function1[/* instance */ HTMLDivElement, Unit]] = js.undefined
  /* Additional data attributes to be applied to to the modal content in the form of "data-*" */
  var data: js.UndefOr[js.Any] = js.undefined
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
  /* Function accepting the ref for the overlay */
  var overlayRef: js.UndefOr[js.Function1[/* instance */ HTMLDivElement, Unit]] = js.undefined
  /* Function that will be called to get the parent element that the modal will be attached to. */
  var parentSelector: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  /* String className to be applied to the portal. Defaults to "ReactModalPortal". */
  var portalClassName: js.UndefOr[String] = js.undefined
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
  @scala.inline
  def apply(
    isOpen: Boolean,
    appElement: HTMLElement | js.Object = null,
    aria: Aria = null,
    ariaHideApp: js.UndefOr[Boolean] = js.undefined,
    bodyOpenClassName: js.UndefOr[Null | String] = js.undefined,
    className: String | Classes = null,
    closeTimeoutMS: js.UndefOr[Double] = js.undefined,
    contentLabel: String = null,
    contentRef: /* instance */ HTMLDivElement => Unit = null,
    data: js.Any = null,
    htmlOpenClassName: js.UndefOr[Null | String] = js.undefined,
    id: String = null,
    onAfterClose: () => Unit = null,
    onAfterOpen: /* obj */ js.UndefOr[OnAfterOpenCallbackOptions] => Unit = null,
    onRequestClose: /* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] => Unit = null,
    overlayClassName: String | Classes = null,
    overlayRef: /* instance */ HTMLDivElement => Unit = null,
    parentSelector: () => HTMLElement = null,
    portalClassName: String = null,
    role: js.UndefOr[Null | String] = js.undefined,
    shouldCloseOnEsc: js.UndefOr[Boolean] = js.undefined,
    shouldCloseOnOverlayClick: js.UndefOr[Boolean] = js.undefined,
    shouldFocusAfterRender: js.UndefOr[Boolean] = js.undefined,
    shouldReturnFocusAfterClose: js.UndefOr[Boolean] = js.undefined,
    style: Styles = null,
    testId: String = null
  ): Props = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (appElement != null) __obj.updateDynamic("appElement")(appElement.asInstanceOf[js.Any])
    if (aria != null) __obj.updateDynamic("aria")(aria.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaHideApp)) __obj.updateDynamic("ariaHideApp")(ariaHideApp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bodyOpenClassName)) __obj.updateDynamic("bodyOpenClassName")(bodyOpenClassName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeTimeoutMS)) __obj.updateDynamic("closeTimeoutMS")(closeTimeoutMS.get.asInstanceOf[js.Any])
    if (contentLabel != null) __obj.updateDynamic("contentLabel")(contentLabel.asInstanceOf[js.Any])
    if (contentRef != null) __obj.updateDynamic("contentRef")(js.Any.fromFunction1(contentRef))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(htmlOpenClassName)) __obj.updateDynamic("htmlOpenClassName")(htmlOpenClassName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onAfterClose != null) __obj.updateDynamic("onAfterClose")(js.Any.fromFunction0(onAfterClose))
    if (onAfterOpen != null) __obj.updateDynamic("onAfterOpen")(js.Any.fromFunction1(onAfterOpen))
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1(onRequestClose))
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayRef != null) __obj.updateDynamic("overlayRef")(js.Any.fromFunction1(overlayRef))
    if (parentSelector != null) __obj.updateDynamic("parentSelector")(js.Any.fromFunction0(parentSelector))
    if (portalClassName != null) __obj.updateDynamic("portalClassName")(portalClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(role)) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCloseOnEsc)) __obj.updateDynamic("shouldCloseOnEsc")(shouldCloseOnEsc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCloseOnOverlayClick)) __obj.updateDynamic("shouldCloseOnOverlayClick")(shouldCloseOnOverlayClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocusAfterRender)) __obj.updateDynamic("shouldFocusAfterRender")(shouldFocusAfterRender.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldReturnFocusAfterClose)) __obj.updateDynamic("shouldReturnFocusAfterClose")(shouldReturnFocusAfterClose.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testId != null) __obj.updateDynamic("testId")(testId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

