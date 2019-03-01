package typings
package reactDashModalLib.reactDashModalMod.ReactModalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /* Set this to properly hide your application from assistive screenreaders and other assistive technologies while the modal is open. */
  var appElement: js.UndefOr[reactLib.HTMLElement | js.Object] = js.undefined
  /* Additional aria attributes. */
  var aria: js.UndefOr[Aria] = js.undefined
  /* Boolean indicating if the appElement should be hidden. Defaults to true. */
  var ariaHideApp: js.UndefOr[scala.Boolean] = js.undefined
  /* String className to be applied to the document.body. */
  var bodyOpenClassName: js.UndefOr[java.lang.String] = js.undefined
  /* String or object className to be applied to the modal content. */
  var className: js.UndefOr[java.lang.String | Classes] = js.undefined
  /* Number indicating the milliseconds to wait before closing the modal. Defaults to zero (no timeout). */
  var closeTimeoutMS: js.UndefOr[scala.Double] = js.undefined
  /* String indicating how the content container should be announced to screenreaders. */
  var contentLabel: js.UndefOr[java.lang.String] = js.undefined
  /* Function accepting the ref for the content */
  var contentRef: js.UndefOr[js.Function1[/* instance */ reactLib.HTMLDivElement, scala.Unit]] = js.undefined
  /* Additional data attributes to be applied to to the modal content in the form of "data-*" */
  var data: js.UndefOr[js.Any] = js.undefined
  /* String className to be applied to the document.html. */
  var htmlOpenClassName: js.UndefOr[java.lang.String] = js.undefined
  /* Boolean describing if the modal should be shown or not. Defaults to false. */
  var isOpen: scala.Boolean
  /* Function that will be run after the modal has closed. */
  var onAfterClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /* Function that will be run after the modal has opened. */
  var onAfterOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /* Function that will be run when the modal is requested to be closed, prior to actually closing. */
  var onRequestClose: js.UndefOr[
    js.Function1[/* event */ reactLib.MouseEvent | reactLib.KeyboardEvent, scala.Unit]
  ] = js.undefined
  /* String or object className to be applied to the overlay. */
  var overlayClassName: js.UndefOr[java.lang.String | Classes] = js.undefined
  /* Function accepting the ref for the overlay */
  var overlayRef: js.UndefOr[js.Function1[/* instance */ reactLib.HTMLDivElement, scala.Unit]] = js.undefined
  /* Function that will be called to get the parent element that the modal will be attached to. */
  var parentSelector: js.UndefOr[js.Function0[reactLib.HTMLElement]] = js.undefined
  /* String className to be applied to the portal. Defaults to "ReactModalPortal". */
  var portalClassName: js.UndefOr[java.lang.String] = js.undefined
  /* String indicating the role of the modal, allowing the 'dialog' role to be applied if desired. */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /* Boolean indicating if pressing the esc key should close the modal */
  var shouldCloseOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  /* Boolean indicating if the overlay should close the modal. Defaults to true. */
  var shouldCloseOnOverlayClick: js.UndefOr[scala.Boolean] = js.undefined
  /* Boolean indicating if the modal should be focused after render */
  var shouldFocusAfterRender: js.UndefOr[scala.Boolean] = js.undefined
  /* Boolean indicating if the modal should restore focus to the element that had focus prior to its display. */
  var shouldReturnFocusAfterClose: js.UndefOr[scala.Boolean] = js.undefined
  /* Object indicating styles to be used for the modal, divided into overlay and content styles. */
  var style: js.UndefOr[Styles] = js.undefined
  /* String value of data-test-id attibute to be applied to to the modal content. */
  var testId: js.UndefOr[java.lang.String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    isOpen: scala.Boolean,
    appElement: reactLib.HTMLElement | js.Object = null,
    aria: Aria = null,
    ariaHideApp: js.UndefOr[scala.Boolean] = js.undefined,
    bodyOpenClassName: java.lang.String = null,
    className: java.lang.String | Classes = null,
    closeTimeoutMS: scala.Int | scala.Double = null,
    contentLabel: java.lang.String = null,
    contentRef: js.Function1[/* instance */ reactLib.HTMLDivElement, scala.Unit] = null,
    data: js.Any = null,
    htmlOpenClassName: java.lang.String = null,
    onAfterClose: js.Function0[scala.Unit] = null,
    onAfterOpen: js.Function0[scala.Unit] = null,
    onRequestClose: js.Function1[/* event */ reactLib.MouseEvent | reactLib.KeyboardEvent, scala.Unit] = null,
    overlayClassName: java.lang.String | Classes = null,
    overlayRef: js.Function1[/* instance */ reactLib.HTMLDivElement, scala.Unit] = null,
    parentSelector: js.Function0[reactLib.HTMLElement] = null,
    portalClassName: java.lang.String = null,
    role: java.lang.String = null,
    shouldCloseOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    shouldCloseOnOverlayClick: js.UndefOr[scala.Boolean] = js.undefined,
    shouldFocusAfterRender: js.UndefOr[scala.Boolean] = js.undefined,
    shouldReturnFocusAfterClose: js.UndefOr[scala.Boolean] = js.undefined,
    style: Styles = null,
    testId: java.lang.String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isOpen")(isOpen)
    if (appElement != null) __obj.updateDynamic("appElement")(appElement.asInstanceOf[js.Any])
    if (aria != null) __obj.updateDynamic("aria")(aria)
    if (!js.isUndefined(ariaHideApp)) __obj.updateDynamic("ariaHideApp")(ariaHideApp)
    if (bodyOpenClassName != null) __obj.updateDynamic("bodyOpenClassName")(bodyOpenClassName)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeTimeoutMS != null) __obj.updateDynamic("closeTimeoutMS")(closeTimeoutMS.asInstanceOf[js.Any])
    if (contentLabel != null) __obj.updateDynamic("contentLabel")(contentLabel)
    if (contentRef != null) __obj.updateDynamic("contentRef")(contentRef)
    if (data != null) __obj.updateDynamic("data")(data)
    if (htmlOpenClassName != null) __obj.updateDynamic("htmlOpenClassName")(htmlOpenClassName)
    if (onAfterClose != null) __obj.updateDynamic("onAfterClose")(onAfterClose)
    if (onAfterOpen != null) __obj.updateDynamic("onAfterOpen")(onAfterOpen)
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(onRequestClose)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayRef != null) __obj.updateDynamic("overlayRef")(overlayRef)
    if (parentSelector != null) __obj.updateDynamic("parentSelector")(parentSelector)
    if (portalClassName != null) __obj.updateDynamic("portalClassName")(portalClassName)
    if (role != null) __obj.updateDynamic("role")(role)
    if (!js.isUndefined(shouldCloseOnEsc)) __obj.updateDynamic("shouldCloseOnEsc")(shouldCloseOnEsc)
    if (!js.isUndefined(shouldCloseOnOverlayClick)) __obj.updateDynamic("shouldCloseOnOverlayClick")(shouldCloseOnOverlayClick)
    if (!js.isUndefined(shouldFocusAfterRender)) __obj.updateDynamic("shouldFocusAfterRender")(shouldFocusAfterRender)
    if (!js.isUndefined(shouldReturnFocusAfterClose)) __obj.updateDynamic("shouldReturnFocusAfterClose")(shouldReturnFocusAfterClose)
    if (style != null) __obj.updateDynamic("style")(style)
    if (testId != null) __obj.updateDynamic("testId")(testId)
    __obj.asInstanceOf[Props]
  }
}

