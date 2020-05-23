package typings.reactToastify.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactToastify.reactToastifyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  /**
    * Set the delay in ms to close the toast automatically.
    * Use `false` to prevent the toast from closing.
    * `Default: 5000`
    */
  var autoClose: js.UndefOr[Double | `false`] = js.undefined
  /**
    * An optional css class to set for the toast content.
    */
  var bodyClassName: js.UndefOr[String | js.Object] = js.undefined
  /**
    * An optional css class to set.
    */
  var className: js.UndefOr[String | js.Object] = js.undefined
  /**
    * Pass a custom close button.
    * To remove the close button pass `false`
    */
  var closeButton: js.UndefOr[ReactNode | Boolean] = js.undefined
  /**
    * Remove the toast when clicked.
    * `Default: true`
    */
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  /**
    * Set id to handle multiple container
    */
  var containerId: js.UndefOr[String | Double] = js.undefined
  /**
    * Allow toast to be draggable
    * `Default: true`
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * The percentage of the toast's width it takes for a drag to dismiss a toast
    * `Default: 80`
    */
  var draggablePercent: js.UndefOr[Double] = js.undefined
  /**
    * Hide or show the progress bar.
    * `Default: false`
    */
  var hideProgressBar: js.UndefOr[Boolean] = js.undefined
  /**
    * Fired when clicking inside toaster
    */
  var onClick: js.UndefOr[js.Function] = js.undefined
  /**
    * Pause the toast when the window loose focus.
    * `Default: true`
    */
  var pauseOnFocusLoss: js.UndefOr[Boolean] = js.undefined
  /**
    * Pause the timer when the mouse hover the toast.
    * `Default: true`
    */
  var pauseOnHover: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the default position to use.
    * `One of: 'top-right', 'top-center', 'top-left', 'bottom-right', 'bottom-center', 'bottom-left'`
    * `Default: 'top-right'`
    */
  var position: js.UndefOr[PositionOptions] = js.undefined
  /**
    * An optional css class to set for the progress bar.
    */
  var progressClassName: js.UndefOr[String | js.Object] = js.undefined
  /**
    * An optional style to set for the progress bar.
    */
  var progressStyle: js.UndefOr[js.Object] = js.undefined
  /**
    * Define the ARIA role for the toast
    * `Default: alert`
    *  https://www.w3.org/WAI/PF/aria/roles
    */
  var role: js.UndefOr[String] = js.undefined
  /**
    * Pass a custom transition built with react-transition-group.
    */
  var transition: js.UndefOr[ComponentType[js.Object]] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    autoClose: Double | `false` = null,
    bodyClassName: String | js.Object = null,
    className: String | js.Object = null,
    closeButton: ReactNode | Boolean = null,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    containerId: String | Double = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    draggablePercent: js.UndefOr[Double] = js.undefined,
    hideProgressBar: js.UndefOr[Boolean] = js.undefined,
    onClick: js.Function = null,
    pauseOnFocusLoss: js.UndefOr[Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    position: PositionOptions = null,
    progressClassName: String | js.Object = null,
    progressStyle: js.Object = null,
    role: String = null,
    transition: ComponentType[js.Object] = null
  ): CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (autoClose != null) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeButton != null) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.get.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(draggablePercent)) __obj.updateDynamic("draggablePercent")(draggablePercent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideProgressBar)) __obj.updateDynamic("hideProgressBar")(hideProgressBar.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnFocusLoss)) __obj.updateDynamic("pauseOnFocusLoss")(pauseOnFocusLoss.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (progressClassName != null) __obj.updateDynamic("progressClassName")(progressClassName.asInstanceOf[js.Any])
    if (progressStyle != null) __obj.updateDynamic("progressStyle")(progressStyle.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOptions]
  }
}

