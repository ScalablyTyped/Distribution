package typings
package semanticDashUiDashNagLib.SemanticUINs.NagSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  var animation: semanticDashUiDashNagLib.SemanticUINs.NagNs.AnimationSettings
  // endregion
  // region DOM Settings
  var className: semanticDashUiDashNagLib.SemanticUINs.NagNs.ClassNameSettings
  /**
    * @default false
    */
  var context: semanticDashUiDashNagLib.semanticDashUiDashNagLibNumbers.`false` | java.lang.String | semanticDashUiDashNagLib.JQuery
  /**
    * Debug output to console
    */
  var debug: scala.Boolean
  /**
    * @default false
    */
  var detachable: scala.Boolean
  /**
    * set to zero to require manually dismissal, otherwise hides on its own
    *
    * @default 0
    */
  var displayTime: scala.Double
  /**
    * @default false
    */
  var domain: semanticDashUiDashNagLib.semanticDashUiDashNagLibNumbers.`false` | java.lang.String
  /**
    * @default 'easeOutQuad'
    */
  var easing: java.lang.String
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashNagLib.SemanticUINs.NagNs.ErrorSettings
  /**
    * @default 30
    */
  var expires: scala.Double
  /**
    * @default 'nag'
    */
  var key: js.Any
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
    * @default '/'
    */
  var path: java.lang.String
  /**
    * Show console.table output with performance metrics
    */
  var performance: scala.Boolean
  // region Behavior
  /**
    * allows cookie to be overridden
    *
    * @default false
    */
  var persist: scala.Boolean
  var selector: semanticDashUiDashNagLib.SemanticUINs.NagNs.SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: scala.Boolean
  /**
    * @default 500
    */
  var speed: scala.Double
  /**
    * type of storage to use
    *
    * @default 'cookie'
    */
  var storageMethod: semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.cookie | semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.localstorage | semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.sessionstorage
  /**
    * @default 'dismiss'
    */
  var value: js.Any
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: scala.Boolean
  // endregion
  // region Callbacks
  def onHide(`this`: semanticDashUiDashNagLib.JQuery): scala.Unit
}

object _Impl {
  @scala.inline
  def apply(
    animation: semanticDashUiDashNagLib.SemanticUINs.NagNs.AnimationSettings,
    className: semanticDashUiDashNagLib.SemanticUINs.NagNs.ClassNameSettings,
    context: semanticDashUiDashNagLib.semanticDashUiDashNagLibNumbers.`false` | java.lang.String | semanticDashUiDashNagLib.JQuery,
    debug: scala.Boolean,
    detachable: scala.Boolean,
    displayTime: scala.Double,
    domain: semanticDashUiDashNagLib.semanticDashUiDashNagLibNumbers.`false` | java.lang.String,
    easing: java.lang.String,
    error: semanticDashUiDashNagLib.SemanticUINs.NagNs.ErrorSettings,
    expires: scala.Double,
    key: js.Any,
    name: java.lang.String,
    namespace: java.lang.String,
    onHide: semanticDashUiDashNagLib.JQuery => scala.Unit,
    path: java.lang.String,
    performance: scala.Boolean,
    persist: scala.Boolean,
    selector: semanticDashUiDashNagLib.SemanticUINs.NagNs.SelectorSettings,
    silent: scala.Boolean,
    speed: scala.Double,
    storageMethod: semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.cookie | semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.localstorage | semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.sessionstorage,
    value: js.Any,
    verbose: scala.Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(animation = animation, className = className, context = context.asInstanceOf[js.Any], debug = debug, detachable = detachable, displayTime = displayTime, domain = domain.asInstanceOf[js.Any], easing = easing, error = error, expires = expires, key = key, name = name, namespace = namespace, onHide = js.Any.fromFunction1(onHide), path = path, performance = performance, persist = persist, selector = selector, silent = silent, speed = speed, storageMethod = storageMethod.asInstanceOf[js.Any], value = value, verbose = verbose)
  
    __obj.asInstanceOf[_Impl]
  }
}

