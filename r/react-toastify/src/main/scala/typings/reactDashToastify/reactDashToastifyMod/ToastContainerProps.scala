package typings.reactDashToastify.reactDashToastifyMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import typings.reactDashToastify.reactDashToastifyNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastContainerProps extends CommonOptions {
  /**
    * Show the toast only if it includes containerId and it's the same as containerId
    * `Default: false`
    */
  var enableMultiContainer: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not to display the newest toast on top.
    * `Default: false`
    */
  var newestOnTop: js.UndefOr[Boolean] = js.undefined
  /**
    * Support right to left display.
    * `Default: false`
    */
  var rtl: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional inline style to apply.
    */
  var style: js.UndefOr[js.Object] = js.undefined
  /**
    * An optional css class for the toast.
    */
  var toastClassName: js.UndefOr[String | js.Object] = js.undefined
}

object ToastContainerProps {
  @scala.inline
  def apply(
    autoClose: Double | `false` = null,
    bodyClassName: String | js.Object = null,
    className: String | js.Object = null,
    closeButton: ReactNode | Boolean = null,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    containerId: String | Double = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    draggablePercent: Int | Double = null,
    enableMultiContainer: js.UndefOr[Boolean] = js.undefined,
    hideProgressBar: js.UndefOr[Boolean] = js.undefined,
    newestOnTop: js.UndefOr[Boolean] = js.undefined,
    onClick: js.Function = null,
    pauseOnFocusLoss: js.UndefOr[Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    position: PositionOptions = null,
    progressClassName: String | js.Object = null,
    progressStyle: js.Object = null,
    role: String = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    toastClassName: String | js.Object = null,
    transition: ComponentType[js.Object] = null
  ): ToastContainerProps = {
    val __obj = js.Dynamic.literal()
    if (autoClose != null) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeButton != null) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (draggablePercent != null) __obj.updateDynamic("draggablePercent")(draggablePercent.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMultiContainer)) __obj.updateDynamic("enableMultiContainer")(enableMultiContainer)
    if (!js.isUndefined(hideProgressBar)) __obj.updateDynamic("hideProgressBar")(hideProgressBar)
    if (!js.isUndefined(newestOnTop)) __obj.updateDynamic("newestOnTop")(newestOnTop)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (!js.isUndefined(pauseOnFocusLoss)) __obj.updateDynamic("pauseOnFocusLoss")(pauseOnFocusLoss)
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (position != null) __obj.updateDynamic("position")(position)
    if (progressClassName != null) __obj.updateDynamic("progressClassName")(progressClassName.asInstanceOf[js.Any])
    if (progressStyle != null) __obj.updateDynamic("progressStyle")(progressStyle)
    if (role != null) __obj.updateDynamic("role")(role)
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (style != null) __obj.updateDynamic("style")(style)
    if (toastClassName != null) __obj.updateDynamic("toastClassName")(toastClassName.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastContainerProps]
  }
}

