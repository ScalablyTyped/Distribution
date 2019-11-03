package typings.reactDashToastify.reactDashToastifyMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import typings.reactDashToastify.reactDashToastifyNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOptions extends CommonOptions {
  /**
    * Add a delay in ms before the toast appear.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Called inside componentWillUnMount.
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called inside componentDidMount.
    */
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Set the percentage for the controlled progress bar. `Value must be between 0 and 1.`
    */
  var progress: js.UndefOr[Double] = js.undefined
  /**
    * Set a custom `toastId`
    */
  var toastId: js.UndefOr[ToastId] = js.undefined
  /**
    * Set the toast type.
    * `One of: 'info', 'success', 'warning', 'error', 'default'`
    */
  var `type`: js.UndefOr[TypeOptions] = js.undefined
}

object ToastOptions {
  @scala.inline
  def apply(
    autoClose: Double | `false` = null,
    bodyClassName: String | js.Object = null,
    className: String | js.Object = null,
    closeButton: ReactNode | Boolean = null,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    containerId: String | Double = null,
    delay: Int | Double = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    draggablePercent: Int | Double = null,
    hideProgressBar: js.UndefOr[Boolean] = js.undefined,
    onClick: js.Function = null,
    onClose: () => Unit = null,
    onOpen: () => Unit = null,
    pauseOnFocusLoss: js.UndefOr[Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    position: PositionOptions = null,
    progress: Int | Double = null,
    progressClassName: String | js.Object = null,
    progressStyle: js.Object = null,
    role: String = null,
    toastId: ToastId = null,
    transition: ComponentType[js.Object] = null,
    `type`: TypeOptions = null
  ): ToastOptions = {
    val __obj = js.Dynamic.literal()
    if (autoClose != null) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeButton != null) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (draggablePercent != null) __obj.updateDynamic("draggablePercent")(draggablePercent.asInstanceOf[js.Any])
    if (!js.isUndefined(hideProgressBar)) __obj.updateDynamic("hideProgressBar")(hideProgressBar)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (!js.isUndefined(pauseOnFocusLoss)) __obj.updateDynamic("pauseOnFocusLoss")(pauseOnFocusLoss)
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (position != null) __obj.updateDynamic("position")(position)
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (progressClassName != null) __obj.updateDynamic("progressClassName")(progressClassName.asInstanceOf[js.Any])
    if (progressStyle != null) __obj.updateDynamic("progressStyle")(progressStyle)
    if (role != null) __obj.updateDynamic("role")(role)
    if (toastId != null) __obj.updateDynamic("toastId")(toastId.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ToastOptions]
  }
}

