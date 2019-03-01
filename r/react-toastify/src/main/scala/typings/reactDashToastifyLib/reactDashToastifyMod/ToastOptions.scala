package typings
package reactDashToastifyLib.reactDashToastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOptions extends ToastAndToastContainerOptions {
  /**
    * Add optional classes to the toast.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Called inside componentWillUnmount.
    */
  var onClose: js.UndefOr[js.Function1[/* childrenProps */ reactLib.reactMod.ReactNs.Props[_], scala.Unit]] = js.undefined
  /**
    * Called inside componentDidMount.
    */
  var onOpen: js.UndefOr[js.Function1[/* childrenProps */ reactLib.reactMod.ReactNs.Props[_], scala.Unit]] = js.undefined
  /**
    * String or React Element, only available when calling update.
    */
  var render: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * Kind of notification.
    * @default 'default'
    */
  var `type`: js.UndefOr[
    reactDashToastifyLib.reactDashToastifyLibStrings.default | reactDashToastifyLib.reactDashToastifyLibStrings.success | reactDashToastifyLib.reactDashToastifyLibStrings.info | reactDashToastifyLib.reactDashToastifyLibStrings.warning | reactDashToastifyLib.reactDashToastifyLibStrings.error
  ] = js.undefined
}

object ToastOptions {
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
    onClose: js.Function1[/* childrenProps */ reactLib.reactMod.ReactNs.Props[_], scala.Unit] = null,
    onOpen: js.Function1[/* childrenProps */ reactLib.reactMod.ReactNs.Props[_], scala.Unit] = null,
    pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    position: reactDashToastifyLib.reactDashToastifyLibStrings.`top-right` | reactDashToastifyLib.reactDashToastifyLibStrings.`top-center` | reactDashToastifyLib.reactDashToastifyLibStrings.`top-left` | reactDashToastifyLib.reactDashToastifyLibStrings.`bottom-right` | reactDashToastifyLib.reactDashToastifyLibStrings.`bottom-center` | reactDashToastifyLib.reactDashToastifyLibStrings.`bottom-left` = null,
    progressClassName: java.lang.String = null,
    render: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] = null,
    transition: reactDashTransitionDashGroupLib.reactDashTransitionDashGroupMod.Transition = null,
    `type`: reactDashToastifyLib.reactDashToastifyLibStrings.default | reactDashToastifyLib.reactDashToastifyLibStrings.success | reactDashToastifyLib.reactDashToastifyLibStrings.info | reactDashToastifyLib.reactDashToastifyLibStrings.warning | reactDashToastifyLib.reactDashToastifyLibStrings.error = null
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
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (progressClassName != null) __obj.updateDynamic("progressClassName")(progressClassName)
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptions]
  }
}

