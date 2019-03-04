package typings
package semanticDashUiDashEmbedLib.SemanticUINs.EmbedSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  // endregion
  // region Video Settings
  /**
    * Default setting auto will only autoplay content when a placeholder is specified. Setting to true or false will force autoplay.
    *
    * @default 'auto'
    */
  var autoplay: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.auto | scala.Boolean
  /**
    * Whether to show networks branded UI like title cards, or after video calls to action.
    *
    * @default false
    */
  var brandedUI: scala.Boolean
  /**
    * Class names used to attach style to state
    */
  var className: semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.ClassNameSettings
  /**
    * Specifies a default chrome color with Vimeo or YouTube.
    *
    * @default '#444444'
    */
  var color: java.lang.String
  /**
    * Debug output to console
    */
  var debug: scala.Boolean
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.ErrorSettings
  /**
    * Whether to prefer HD content
    *
    * @default true
    */
  var hd: scala.Boolean
  // region Embed Settings
  /**
    * Specifies an icon to use with placeholder content
    *
    * @default false
    */
  var icon: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibNumbers.`false` | java.lang.String
  /**
    * Specifies an id value to replace with the {id} value found in templated urls
    *
    * @default false
    */
  var id: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibNumbers.`false` | java.lang.String
  /**
    * HTML Data attributes used to store data
    */
  var metadata: semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.MetadataSettings
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
    * Specify an object containing key/value pairs to add to the iframes GET parameters
    *
    * @default false
    */
  var parameters: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibNumbers.`false` | semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.ParametersSettings
  /**
    * Show console.table output with performance metrics
    */
  var performance: scala.Boolean
  // endregion
  // region DOM Settings
  /**
    * DOM Selectors used internally
    */
  var selector: semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: scala.Boolean
  /**
    * Specifies a source to use, if no source is provided it will be determined from the domain of a specified url.
    *
    * @default false
    */
  var source: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibNumbers.`false` | java.lang.String
  var templates: semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.TemplatesSettings
  /**
    * Specifies a url to use for embed
    *
    * @default false
    */
  var url: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibNumbers.`false` | java.lang.String
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: scala.Boolean
  // endregion
  // region Callbacks
  /**
    * Callback when iframe is generated
    */
  def onCreate(`this`: semanticDashUiDashEmbedLib.JQuery, url: java.lang.String): scala.Unit
  /**
    * Whenever an iframe contents is shown
    */
  def onDisplay(`this`: semanticDashUiDashEmbedLib.JQuery): scala.Unit
  /**
    * Callback when module parameters are determined. Allows you to adjust parameters at run time by returning a new parameters object.
    */
  def onEmbed(
    `this`: semanticDashUiDashEmbedLib.JQuery,
    parameters: semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.ParametersSettings
  ): semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.ParametersSettings
  /**
    * Callback immediately before Embed is removed from DOM
    */
  def onPlaceholderDisplay(`this`: semanticDashUiDashEmbedLib.JQuery): scala.Unit
}

object _Impl {
  @scala.inline
  def apply(
    autoplay: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.auto | scala.Boolean,
    brandedUI: scala.Boolean,
    className: semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.ClassNameSettings,
    color: java.lang.String,
    debug: scala.Boolean,
    error: semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.ErrorSettings,
    hd: scala.Boolean,
    icon: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibNumbers.`false` | java.lang.String,
    id: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibNumbers.`false` | java.lang.String,
    metadata: semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.MetadataSettings,
    name: java.lang.String,
    namespace: java.lang.String,
    onCreate: js.Function2[semanticDashUiDashEmbedLib.JQuery, java.lang.String, scala.Unit],
    onDisplay: js.Function1[semanticDashUiDashEmbedLib.JQuery, scala.Unit],
    onEmbed: js.Function2[
      semanticDashUiDashEmbedLib.JQuery, 
      semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.ParametersSettings, 
      semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.ParametersSettings
    ],
    onPlaceholderDisplay: js.Function1[semanticDashUiDashEmbedLib.JQuery, scala.Unit],
    parameters: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibNumbers.`false` | semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.ParametersSettings,
    performance: scala.Boolean,
    selector: semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.SelectorSettings,
    silent: scala.Boolean,
    source: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibNumbers.`false` | java.lang.String,
    templates: semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.TemplatesSettings,
    url: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibNumbers.`false` | java.lang.String,
    verbose: scala.Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any], brandedUI = brandedUI, className = className.asInstanceOf[js.Any], color = color, debug = debug, error = error.asInstanceOf[js.Any], hd = hd, icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name, namespace = namespace, onCreate = onCreate, onDisplay = onDisplay, onEmbed = onEmbed, onPlaceholderDisplay = onPlaceholderDisplay, parameters = parameters.asInstanceOf[js.Any], performance = performance, selector = selector.asInstanceOf[js.Any], silent = silent, source = source.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verbose = verbose)
  
    __obj.asInstanceOf[_Impl]
  }
}

