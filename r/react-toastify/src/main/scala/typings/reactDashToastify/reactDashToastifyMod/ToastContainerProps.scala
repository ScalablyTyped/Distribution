package typings.reactDashToastify.reactDashToastifyMod

import typings.react.reactMod.CSSProperties
import typings.reactDashToastify.reactDashToastifyNumbers.`false`
import typings.reactDashToastify.reactDashToastifyStrings.`bottom-center`
import typings.reactDashToastify.reactDashToastifyStrings.`bottom-left`
import typings.reactDashToastify.reactDashToastifyStrings.`bottom-right`
import typings.reactDashToastify.reactDashToastifyStrings.`top-center`
import typings.reactDashToastify.reactDashToastifyStrings.`top-left`
import typings.reactDashToastify.reactDashToastifyStrings.`top-right`
import typings.reactDashTransitionDashGroup.reactDashTransitionDashGroupMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastContainerProps extends ToastAndToastContainerOptions {
  /**
    * Add optional classes to the container.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Display newest toast on top.
    * @default false
    */
  var newestOnTop: js.UndefOr[Boolean] = js.undefined
  /**
    * Pause on document visibility change (resizing the window, for
    * instance).
    * @default true
    */
  var pauseOnVisibilityChange: js.UndefOr[Boolean] = js.undefined
  /**
    * Support right to left content.
    * @default false
    */
  var rtl: js.UndefOr[Boolean] = js.undefined
  /**
    * Add optional inline style to the container.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Add optional classes to the toast.
    */
  var toastClassName: js.UndefOr[String] = js.undefined
}

object ToastContainerProps {
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
    newestOnTop: js.UndefOr[Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    pauseOnVisibilityChange: js.UndefOr[Boolean] = js.undefined,
    position: `top-right` | `top-center` | `top-left` | `bottom-right` | `bottom-center` | `bottom-left` = null,
    progressClassName: String = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    toastClassName: String = null,
    transition: Transition = null
  ): ToastContainerProps = {
    val __obj = js.Dynamic.literal()
    if (autoClose != null) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName)
    if (className != null) __obj.updateDynamic("className")(className)
    if (closeButton != null) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (draggablePercent != null) __obj.updateDynamic("draggablePercent")(draggablePercent.asInstanceOf[js.Any])
    if (!js.isUndefined(hideProgressBar)) __obj.updateDynamic("hideProgressBar")(hideProgressBar)
    if (!js.isUndefined(newestOnTop)) __obj.updateDynamic("newestOnTop")(newestOnTop)
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (!js.isUndefined(pauseOnVisibilityChange)) __obj.updateDynamic("pauseOnVisibilityChange")(pauseOnVisibilityChange)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (progressClassName != null) __obj.updateDynamic("progressClassName")(progressClassName)
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (style != null) __obj.updateDynamic("style")(style)
    if (toastClassName != null) __obj.updateDynamic("toastClassName")(toastClassName)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[ToastContainerProps]
  }
}

