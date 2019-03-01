package typings
package semanticDashUiDashRatingLib.SemanticUINs.RatingSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  var className: semanticDashUiDashRatingLib.SemanticUINs.RatingNs.ClassNameSettings
  /**
    * By default a rating will be only clearable if there is 1 icon. Setting to true/false will allow or disallow a user to clear their rating
    *
    * @default 'auto'
    */
  var clearable: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.auto | scala.Boolean
  /**
    * Debug output to console
    */
  var debug: scala.Boolean
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashRatingLib.SemanticUINs.RatingNs.ErrorSettings
  /**
    * Whether callbacks like onRate should fire immediately after initializing with the current value.
    *
    * @default false
    */
  var fireOnInit: scala.Boolean
  // region Rating Settings
  /**
    * A number representing the default rating to apply
    *
    * @default 0
    */
  var initialRating: scala.Double
  /**
    * Whether to enable user's ability to rate
    *
    * @default true
    */
  var interactive: scala.Boolean
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
  // endregion
  // region DOM Settings
  var selector: semanticDashUiDashRatingLib.SemanticUINs.RatingNs.SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: scala.Boolean
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: scala.Boolean
  // endregion
  // region Callbacks
  /**
    * Is called after user selects a new rating
    */
  def onRate(`this`: semanticDashUiDashRatingLib.JQuery, value: scala.Double): scala.Unit
}

object _Impl {
  @scala.inline
  def apply(
    className: semanticDashUiDashRatingLib.SemanticUINs.RatingNs.ClassNameSettings,
    clearable: semanticDashUiDashRatingLib.semanticDashUiDashRatingLibStrings.auto | scala.Boolean,
    debug: scala.Boolean,
    error: semanticDashUiDashRatingLib.SemanticUINs.RatingNs.ErrorSettings,
    fireOnInit: scala.Boolean,
    initialRating: scala.Double,
    interactive: scala.Boolean,
    name: java.lang.String,
    namespace: java.lang.String,
    onRate: js.Function2[semanticDashUiDashRatingLib.JQuery, scala.Double, scala.Unit],
    performance: scala.Boolean,
    selector: semanticDashUiDashRatingLib.SemanticUINs.RatingNs.SelectorSettings,
    silent: scala.Boolean,
    verbose: scala.Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.updateDynamic("clearable")(clearable.asInstanceOf[js.Any])
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("fireOnInit")(fireOnInit)
    __obj.updateDynamic("initialRating")(initialRating)
    __obj.updateDynamic("interactive")(interactive)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("onRate")(onRate)
    __obj.updateDynamic("performance")(performance)
    __obj.updateDynamic("selector")(selector)
    __obj.updateDynamic("silent")(silent)
    __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[_Impl]
  }
}

