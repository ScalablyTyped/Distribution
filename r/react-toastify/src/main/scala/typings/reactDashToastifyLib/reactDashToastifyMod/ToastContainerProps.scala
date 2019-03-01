package typings
package reactDashToastifyLib.reactDashToastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastContainerProps extends ToastAndToastContainerOptions {
  /**
    * Add optional classes to the container.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Display newest toast on top.
    * @default false
    */
  var newestOnTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Pause on document visibility change (resizing the window, for
    * instance).
    * @default true
    */
  var pauseOnVisibilityChange: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Support right to left content.
    * @default false
    */
  var rtl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Add optional inline style to the container.
    */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * Add optional classes to the toast.
    */
  var toastClassName: js.UndefOr[java.lang.String] = js.undefined
}

object ToastContainerProps {
  @scala.inline
  def apply(
    autoClose: reactDashToastifyLib.reactDashToastifyLibNumbers.`false` | scala.Double = null,
    bodyClassName: java.lang.String = null,
    className: java.lang.String = null,
    closeButton: reactDashToastifyLib.reactDashToastifyLibNumbers.`false` | ToastCloseButton = null,
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    draggablePercent: scala.Int | scala.Double = null,
    hideProgressBar: js.UndefOr[scala.Boolean] = js.undefined,
    newestOnTop: js.UndefOr[scala.Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    pauseOnVisibilityChange: js.UndefOr[scala.Boolean] = js.undefined,
    position: reactDashToastifyLib.reactDashToastifyLibStrings.`top-right` | reactDashToastifyLib.reactDashToastifyLibStrings.`top-center` | reactDashToastifyLib.reactDashToastifyLibStrings.`top-left` | reactDashToastifyLib.reactDashToastifyLibStrings.`bottom-right` | reactDashToastifyLib.reactDashToastifyLibStrings.`bottom-center` | reactDashToastifyLib.reactDashToastifyLibStrings.`bottom-left` = null,
    progressClassName: java.lang.String = null,
    rtl: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    toastClassName: java.lang.String = null,
    transition: reactDashTransitionDashGroupLib.reactDashTransitionDashGroupMod.Transition = null
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

