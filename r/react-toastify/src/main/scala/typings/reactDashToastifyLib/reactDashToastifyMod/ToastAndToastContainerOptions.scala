package typings
package reactDashToastifyLib.reactDashToastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastAndToastContainerOptions extends js.Object {
  /**
    * Delay in ms to close the toast. If set to false, the notification needs
    * to be closed manually.
    * @default 5000
    */
  var autoClose: js.UndefOr[reactDashToastifyLib.reactDashToastifyLibNumbers.`false` | scala.Double] = js.undefined
  /**
    * Add optional classes to the toast body.
    */
  var bodyClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A React Component to replace the default close button or false to
    * hide the button.
    */
  var closeButton: js.UndefOr[reactDashToastifyLib.reactDashToastifyLibNumbers.`false` | ToastCloseButton] = js.undefined
  /**
    * Dismiss toast on click.
    * @default true
    */
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allow toast to be draggable.
    * @default true
    */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The percentage of the toast's width it takes for a drag to dismiss a
    * toast (value between 0 and 100).
    * @default 80
    */
  var draggablePercent: js.UndefOr[scala.Double] = js.undefined
  /**
    * Display or not the progress bar below the toast (remaining time).
    * @default false
    */
  var hideProgressBar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Keep the timer running or not on hover.
    * @default true
    */
  var pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default 'top-right'
    */
  var position: js.UndefOr[
    reactDashToastifyLib.reactDashToastifyLibStrings.`top-right` | reactDashToastifyLib.reactDashToastifyLibStrings.`top-center` | reactDashToastifyLib.reactDashToastifyLibStrings.`top-left` | reactDashToastifyLib.reactDashToastifyLibStrings.`bottom-right` | reactDashToastifyLib.reactDashToastifyLibStrings.`bottom-center` | reactDashToastifyLib.reactDashToastifyLibStrings.`bottom-left`
  ] = js.undefined
  /**
    * Add optional classes to the progress bar.
    */
  var progressClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A reference to a valid react-transition-group/Transition component.
    */
  var transition: js.UndefOr[reactDashTransitionDashGroupLib.reactDashTransitionDashGroupMod.Transition] = js.undefined
}

