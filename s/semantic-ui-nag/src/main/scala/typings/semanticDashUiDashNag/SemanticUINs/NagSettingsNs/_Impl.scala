package typings.semanticDashUiDashNag.SemanticUINs.NagSettingsNs

import typings.semanticDashUiDashNag.JQuery
import typings.semanticDashUiDashNag.SemanticUINs.NagNs.AnimationSettings
import typings.semanticDashUiDashNag.SemanticUINs.NagNs.ClassNameSettings
import typings.semanticDashUiDashNag.SemanticUINs.NagNs.ErrorSettings
import typings.semanticDashUiDashNag.SemanticUINs.NagNs.SelectorSettings
import typings.semanticDashUiDashNag.semanticDashUiDashNagNumbers.`false`
import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.cookie
import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.localstorage
import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.sessionstorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  var animation: AnimationSettings
  // endregion
  // region DOM Settings
  var className: ClassNameSettings
  /**
    * @default false
    */
  var context: `false` | String | JQuery
  /**
    * Debug output to console
    */
  var debug: Boolean
  /**
    * @default false
    */
  var detachable: Boolean
  /**
    * set to zero to require manually dismissal, otherwise hides on its own
    *
    * @default 0
    */
  var displayTime: Double
  /**
    * @default false
    */
  var domain: `false` | String
  /**
    * @default 'easeOutQuad'
    */
  var easing: String
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * @default 30
    */
  var expires: Double
  /**
    * @default 'nag'
    */
  var key: js.Any
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
    * @default '/'
    */
  var path: String
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  // region Behavior
  /**
    * allows cookie to be overridden
    *
    * @default false
    */
  var persist: Boolean
  var selector: SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  /**
    * @default 500
    */
  var speed: Double
  /**
    * type of storage to use
    *
    * @default 'cookie'
    */
  var storageMethod: cookie | localstorage | sessionstorage
  /**
    * @default 'dismiss'
    */
  var value: js.Any
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  // endregion
  // region Callbacks
  def onHide(`this`: JQuery): Unit
}

object _Impl {
  @scala.inline
  def apply(
    animation: AnimationSettings,
    className: ClassNameSettings,
    context: `false` | String | JQuery,
    debug: Boolean,
    detachable: Boolean,
    displayTime: Double,
    domain: `false` | String,
    easing: String,
    error: ErrorSettings,
    expires: Double,
    key: js.Any,
    name: String,
    namespace: String,
    onHide: JQuery => Unit,
    path: String,
    performance: Boolean,
    persist: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    speed: Double,
    storageMethod: cookie | localstorage | sessionstorage,
    value: js.Any,
    verbose: Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(animation = animation, className = className, context = context.asInstanceOf[js.Any], debug = debug, detachable = detachable, displayTime = displayTime, domain = domain.asInstanceOf[js.Any], easing = easing, error = error, expires = expires, key = key, name = name, namespace = namespace, onHide = js.Any.fromFunction1(onHide), path = path, performance = performance, persist = persist, selector = selector, silent = silent, speed = speed, storageMethod = storageMethod.asInstanceOf[js.Any], value = value, verbose = verbose)
  
    __obj.asInstanceOf[_Impl]
  }
}

