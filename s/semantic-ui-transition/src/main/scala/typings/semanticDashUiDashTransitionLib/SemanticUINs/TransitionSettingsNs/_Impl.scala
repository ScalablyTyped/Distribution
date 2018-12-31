package typings
package semanticDashUiDashTransitionLib.SemanticUINs.TransitionSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * If enabled will allow same animation to be queued while it is already occurring
    */
  var allowRepeats: scala.Boolean
  // region Transition Settings
  /**
    * Named animation event to used. Must be defined in CSS.
    *
    * @default 'fade'
    */
  var animation: java.lang.String
  // endregion
  // region DOM Settings
  /**
    * Class names used to attach style to state
    */
  var className: semanticDashUiDashTransitionLib.SemanticUINs.TransitionNs.ClassNameSettings
  /**
    * Debug output to console
    */
  var debug: scala.Boolean
  /**
    * Specify the final display type (block, inline-block etc) so that it doesn't have to be calculated.
    *
    * @default false
    */
  var displayType: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibNumbers.`false` | java.lang.String
  /**
    * Duration of the CSS transition animation
    *
    * @default 500
    */
  var duration: scala.Double
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashTransitionLib.SemanticUINs.TransitionNs.ErrorSettings
  /**
    * Interval in MS between each elements transition
    *
    * @default 0
    */
  var interval: scala.Double
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: java.lang.String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: java.lang.String
  /**
    * Show console.table output with performance metrics
    */
  var performance: scala.Boolean
  /**
    * Whether to automatically queue animation if another is occurring
    */
  var queue: scala.Boolean
  /**
    * When an interval is specified, sets order of animations. auto reverses only animations that are hiding.
    *
    * @default 'auto'
    */
  var reverse: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.auto | scala.Boolean
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: scala.Boolean
  /**
    * If enabled a timeout will be added to ensure animationend callback occurs even if element is hidden
    */
  var useFailSafe: scala.Boolean
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: scala.Boolean
  /**
    * Callback on each transition complete
    */
  def onComplete(`this`: semanticDashUiDashTransitionLib.JQuery): scala.Unit
  /**
    * Callback on each transition that changes visibility to hidden
    */
  def onHide(`this`: semanticDashUiDashTransitionLib.JQuery): scala.Unit
  // endregion
  // region Callbacks
  /**
    * Callback on each transition that changes visibility to shown
    */
  def onShow(`this`: semanticDashUiDashTransitionLib.JQuery): scala.Unit
  /**
    * Callback on animation start, useful for queued animations
    */
  def onStart(`this`: semanticDashUiDashTransitionLib.JQuery): scala.Unit
}

