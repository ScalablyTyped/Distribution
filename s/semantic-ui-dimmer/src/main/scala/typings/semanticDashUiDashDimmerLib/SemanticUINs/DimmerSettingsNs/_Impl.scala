package typings
package semanticDashUiDashDimmerLib.SemanticUINs.DimmerSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * Class names used to attach style to state
    */
  var className: semanticDashUiDashDimmerLib.SemanticUINs.DimmerNs.ClassNameSettings
  /**
    * Whether clicking on the dimmer should hide the dimmer (Defaults to auto, closable only when settings.on is not hover
    *
    * @default 'auto'
    */
  var closable: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.auto | scala.Boolean
  /**
    * Debug output to console
    */
  var debug: scala.Boolean
  /**
    * If initializing a dimmer on a dimmable context, you can use dimmerName to distinguish between multiple dimmers in that context.
    *
    * @default false
    */
  var dimmerName: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibNumbers.`false` | java.lang.String
  /**
    * Animation duration of dimming. If an integer is used, that value will apply to both show and hide animations.
    */
  var duration: scala.Double | semanticDashUiDashDimmerLib.SemanticUINs.DimmerNs.DurationSettings
  // endregion
  // region Debug Settings
  /**
    * Error messages displayed to console
    */
  var error: semanticDashUiDashDimmerLib.SemanticUINs.DimmerNs.ErrorSettings
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
    * Can be set to hover or click to show/hide dimmer on dimmable event
    *
    * @default false
    */
  var on: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibNumbers.`false` | semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.hover | semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.click
  // region Behavior
  /**
    * Dimmers opacity from 0-1. Defaults to auto which uses the CSS specified opacity.
    *
    * @default 'auto'
    */
  var opacity: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.auto | scala.Double
  /**
    * Show console.table output with performance metrics
    */
  var performance: scala.Boolean
  // endregion
  // region DOM Settings
  /**
    * Object containing selectors used by module.
    */
  var selector: semanticDashUiDashDimmerLib.SemanticUINs.DimmerNs.SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: scala.Boolean
  /**
    * Templates used to generate dimmer content
    */
  var template: semanticDashUiDashDimmerLib.SemanticUINs.DimmerNs.TemplateSettings
  /**
    * Named transition to use when animating menu in and out. Fade and slide down are available without including ui transitions
    *
    * @default 'fade'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: java.lang.String
  /**
    * Whether to dim dimmers using CSS transitions.
    *
    * @default true
    */
  var useCSS: scala.Boolean
  /**
    * Specify a variation to add when generating dimmer, like inverted
    *
    * @default false
    */
  var variation: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibNumbers.`false` | java.lang.String
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: scala.Boolean
  /**
    * Callback on element show or hide
    */
  def onChange(`this`: semanticDashUiDashDimmerLib.JQuery): scala.Unit
  /**
    * Callback on element hide
    */
  def onHide(`this`: semanticDashUiDashDimmerLib.JQuery): scala.Unit
  // endregion
  // region Callbacks
  /**
    * Callback on element show
    */
  def onShow(`this`: semanticDashUiDashDimmerLib.JQuery): scala.Unit
}

object _Impl {
  @scala.inline
  def apply(
    className: semanticDashUiDashDimmerLib.SemanticUINs.DimmerNs.ClassNameSettings,
    closable: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.auto | scala.Boolean,
    debug: scala.Boolean,
    dimmerName: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibNumbers.`false` | java.lang.String,
    duration: scala.Double | semanticDashUiDashDimmerLib.SemanticUINs.DimmerNs.DurationSettings,
    error: semanticDashUiDashDimmerLib.SemanticUINs.DimmerNs.ErrorSettings,
    name: java.lang.String,
    namespace: java.lang.String,
    on: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibNumbers.`false` | semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.hover | semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.click,
    onChange: js.Function1[semanticDashUiDashDimmerLib.JQuery, scala.Unit],
    onHide: js.Function1[semanticDashUiDashDimmerLib.JQuery, scala.Unit],
    onShow: js.Function1[semanticDashUiDashDimmerLib.JQuery, scala.Unit],
    opacity: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.auto | scala.Double,
    performance: scala.Boolean,
    selector: semanticDashUiDashDimmerLib.SemanticUINs.DimmerNs.SelectorSettings,
    silent: scala.Boolean,
    template: semanticDashUiDashDimmerLib.SemanticUINs.DimmerNs.TemplateSettings,
    transition: java.lang.String,
    useCSS: scala.Boolean,
    variation: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibNumbers.`false` | java.lang.String,
    verbose: scala.Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("dimmerName")(dimmerName.asInstanceOf[js.Any])
    __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(onChange)
    __obj.updateDynamic("onHide")(onHide)
    __obj.updateDynamic("onShow")(onShow)
    __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.updateDynamic("performance")(performance)
    __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.updateDynamic("silent")(silent)
    __obj.updateDynamic("template")(template)
    __obj.updateDynamic("transition")(transition)
    __obj.updateDynamic("useCSS")(useCSS)
    __obj.updateDynamic("variation")(variation.asInstanceOf[js.Any])
    __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[_Impl]
  }
}

