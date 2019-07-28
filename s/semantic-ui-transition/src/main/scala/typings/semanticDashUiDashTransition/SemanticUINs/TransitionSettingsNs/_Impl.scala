package typings.semanticDashUiDashTransition.SemanticUINs.TransitionSettingsNs

import typings.semanticDashUiDashTransition.JQuery
import typings.semanticDashUiDashTransition.SemanticUINs.TransitionNs.ClassNameSettings
import typings.semanticDashUiDashTransition.SemanticUINs.TransitionNs.ErrorSettings
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionNumbers.`false`
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * If enabled will allow same animation to be queued while it is already occurring
    */
  var allowRepeats: Boolean
  // region Transition Settings
  /**
    * Named animation event to used. Must be defined in CSS.
    *
    * @default 'fade'
    */
  var animation: String
  // endregion
  // region DOM Settings
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings
  /**
    * Debug output to console
    */
  var debug: Boolean
  /**
    * Specify the final display type (block, inline-block etc) so that it doesn't have to be calculated.
    *
    * @default false
    */
  var displayType: `false` | String
  /**
    * Duration of the CSS transition animation
    *
    * @default 500
    */
  var duration: Double
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * Interval in MS between each elements transition
    *
    * @default 0
    */
  var interval: Double
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  /**
    * Whether to automatically queue animation if another is occurring
    */
  var queue: Boolean
  /**
    * When an interval is specified, sets order of animations. auto reverses only animations that are hiding.
    *
    * @default 'auto'
    */
  var reverse: auto | Boolean
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  /**
    * If enabled a timeout will be added to ensure animationend callback occurs even if element is hidden
    */
  var useFailSafe: Boolean
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  /**
    * Callback on each transition complete
    */
  def onComplete(`this`: JQuery): Unit
  /**
    * Callback on each transition that changes visibility to hidden
    */
  def onHide(`this`: JQuery): Unit
  // endregion
  // region Callbacks
  /**
    * Callback on each transition that changes visibility to shown
    */
  def onShow(`this`: JQuery): Unit
  /**
    * Callback on animation start, useful for queued animations
    */
  def onStart(`this`: JQuery): Unit
}

object _Impl {
  @scala.inline
  def apply(
    allowRepeats: Boolean,
    animation: String,
    className: ClassNameSettings,
    debug: Boolean,
    displayType: `false` | String,
    duration: Double,
    error: ErrorSettings,
    interval: Double,
    name: String,
    namespace: String,
    onComplete: JQuery => Unit,
    onHide: JQuery => Unit,
    onShow: JQuery => Unit,
    onStart: JQuery => Unit,
    performance: Boolean,
    queue: Boolean,
    reverse: auto | Boolean,
    silent: Boolean,
    useFailSafe: Boolean,
    verbose: Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(allowRepeats = allowRepeats, animation = animation, className = className, debug = debug, displayType = displayType.asInstanceOf[js.Any], duration = duration, error = error, interval = interval, name = name, namespace = namespace, onComplete = js.Any.fromFunction1(onComplete), onHide = js.Any.fromFunction1(onHide), onShow = js.Any.fromFunction1(onShow), onStart = js.Any.fromFunction1(onStart), performance = performance, queue = queue, reverse = reverse.asInstanceOf[js.Any], silent = silent, useFailSafe = useFailSafe, verbose = verbose)
  
    __obj.asInstanceOf[_Impl]
  }
}

