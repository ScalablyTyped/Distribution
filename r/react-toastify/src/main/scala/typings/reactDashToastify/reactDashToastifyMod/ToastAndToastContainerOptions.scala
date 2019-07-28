package typings.reactDashToastify.reactDashToastifyMod

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

trait ToastAndToastContainerOptions extends js.Object {
  /**
    * Delay in ms to close the toast. If set to false, the notification needs
    * to be closed manually.
    * @default 5000
    */
  var autoClose: js.UndefOr[`false` | Double] = js.undefined
  /**
    * Add optional classes to the toast body.
    */
  var bodyClassName: js.UndefOr[String] = js.undefined
  /**
    * A React Component to replace the default close button or false to
    * hide the button.
    */
  var closeButton: js.UndefOr[`false` | ToastCloseButton] = js.undefined
  /**
    * Dismiss toast on click.
    * @default true
    */
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow toast to be draggable.
    * @default true
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * The percentage of the toast's width it takes for a drag to dismiss a
    * toast (value between 0 and 100).
    * @default 80
    */
  var draggablePercent: js.UndefOr[Double] = js.undefined
  /**
    * Display or not the progress bar below the toast (remaining time).
    * @default false
    */
  var hideProgressBar: js.UndefOr[Boolean] = js.undefined
  /**
    * Keep the timer running or not on hover.
    * @default true
    */
  var pauseOnHover: js.UndefOr[Boolean] = js.undefined
  /**
    * @default 'top-right'
    */
  var position: js.UndefOr[
    `top-right` | `top-center` | `top-left` | `bottom-right` | `bottom-center` | `bottom-left`
  ] = js.undefined
  /**
    * Add optional classes to the progress bar.
    */
  var progressClassName: js.UndefOr[String] = js.undefined
  /**
    * A reference to a valid react-transition-group/Transition component.
    */
  var transition: js.UndefOr[Transition] = js.undefined
}

object ToastAndToastContainerOptions {
  @scala.inline
  def apply(
    autoClose: `false` | Double = null,
    bodyClassName: String = null,
    closeButton: `false` | ToastCloseButton = null,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    draggablePercent: Int | Double = null,
    hideProgressBar: js.UndefOr[Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    position: `top-right` | `top-center` | `top-left` | `bottom-right` | `bottom-center` | `bottom-left` = null,
    progressClassName: String = null,
    transition: Transition = null
  ): ToastAndToastContainerOptions = {
    val __obj = js.Dynamic.literal()
    if (autoClose != null) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName)
    if (closeButton != null) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (draggablePercent != null) __obj.updateDynamic("draggablePercent")(draggablePercent.asInstanceOf[js.Any])
    if (!js.isUndefined(hideProgressBar)) __obj.updateDynamic("hideProgressBar")(hideProgressBar)
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (progressClassName != null) __obj.updateDynamic("progressClassName")(progressClassName)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[ToastAndToastContainerOptions]
  }
}

