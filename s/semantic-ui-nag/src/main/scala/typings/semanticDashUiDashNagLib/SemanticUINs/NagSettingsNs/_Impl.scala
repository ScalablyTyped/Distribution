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

