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

