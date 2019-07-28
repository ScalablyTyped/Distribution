package typings.reactDashToastify.reactDashToastifyMod

import typings.react.reactMod.Props
import typings.react.reactMod.ReactElement
import typings.reactDashToastify.reactDashToastifyNumbers.`false`
import typings.reactDashToastify.reactDashToastifyStrings.`bottom-center`
import typings.reactDashToastify.reactDashToastifyStrings.`bottom-left`
import typings.reactDashToastify.reactDashToastifyStrings.`bottom-right`
import typings.reactDashToastify.reactDashToastifyStrings.`top-center`
import typings.reactDashToastify.reactDashToastifyStrings.`top-left`
import typings.reactDashToastify.reactDashToastifyStrings.`top-right`
import typings.reactDashToastify.reactDashToastifyStrings.default
import typings.reactDashToastify.reactDashToastifyStrings.error
import typings.reactDashToastify.reactDashToastifyStrings.info
import typings.reactDashToastify.reactDashToastifyStrings.success
import typings.reactDashToastify.reactDashToastifyStrings.warning
import typings.reactDashTransitionDashGroup.reactDashTransitionDashGroupMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOptions extends ToastAndToastContainerOptions {
  /**
    * Add optional classes to the toast.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Called inside componentWillUnmount.
    */
  var onClose: js.UndefOr[js.Function1[/* childrenProps */ Props[_], Unit]] = js.undefined
  /**
    * Called inside componentDidMount.
    */
  var onOpen: js.UndefOr[js.Function1[/* childrenProps */ Props[_], Unit]] = js.undefined
  /**
    * String or React Element, only available when calling update.
    */
  var render: js.UndefOr[String | ReactElement] = js.undefined
  /**
    * Kind of notification.
    * @default 'default'
    */
  var `type`: js.UndefOr[default | success | info | warning | error] = js.undefined
}

object ToastOptions {
  @scala.inline
  def apply(
    autoClose: `false` | Double = null,
    bodyClassName: String = null,
    className: String = null,
    closeButton: `false` | ToastCloseButton = null,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    draggablePercent: Int | Double = null,
    hideProgressBar: js.UndefOr[Boolean] = js.undefined,
    onClose: /* childrenProps */ Props[_] => Unit = null,
    onOpen: /* childrenProps */ Props[_] => Unit = null,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    position: `top-right` | `top-center` | `top-left` | `bottom-right` | `bottom-center` | `bottom-left` = null,
    progressClassName: String = null,
    render: String | ReactElement = null,
    transition: Transition = null,
    `type`: default | success | info | warning | error = null
  ): ToastOptions = {
    val __obj = js.Dynamic.literal()
    if (autoClose != null) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName)
    if (className != null) __obj.updateDynamic("className")(className)
    if (closeButton != null) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (draggablePercent != null) __obj.updateDynamic("draggablePercent")(draggablePercent.asInstanceOf[js.Any])
    if (!js.isUndefined(hideProgressBar)) __obj.updateDynamic("hideProgressBar")(hideProgressBar)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (progressClassName != null) __obj.updateDynamic("progressClassName")(progressClassName)
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptions]
  }
}

