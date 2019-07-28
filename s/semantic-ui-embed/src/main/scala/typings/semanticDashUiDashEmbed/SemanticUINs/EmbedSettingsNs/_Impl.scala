package typings.semanticDashUiDashEmbed.SemanticUINs.EmbedSettingsNs

import typings.semanticDashUiDashEmbed.JQuery
import typings.semanticDashUiDashEmbed.SemanticUINs.EmbedNs.ClassNameSettings
import typings.semanticDashUiDashEmbed.SemanticUINs.EmbedNs.ErrorSettings
import typings.semanticDashUiDashEmbed.SemanticUINs.EmbedNs.MetadataSettings
import typings.semanticDashUiDashEmbed.SemanticUINs.EmbedNs.ParametersSettings
import typings.semanticDashUiDashEmbed.SemanticUINs.EmbedNs.SelectorSettings
import typings.semanticDashUiDashEmbed.SemanticUINs.EmbedNs.TemplatesSettings
import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedNumbers.`false`
import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.auto
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
  var autoplay: auto | Boolean
  /**
    * Whether to show networks branded UI like title cards, or after video calls to action.
    *
    * @default false
    */
  var brandedUI: Boolean
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings
  /**
    * Specifies a default chrome color with Vimeo or YouTube.
    *
    * @default '#444444'
    */
  var color: String
  /**
    * Debug output to console
    */
  var debug: Boolean
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * Whether to prefer HD content
    *
    * @default true
    */
  var hd: Boolean
  // region Embed Settings
  /**
    * Specifies an icon to use with placeholder content
    *
    * @default false
    */
  var icon: `false` | String
  /**
    * Specifies an id value to replace with the {id} value found in templated urls
    *
    * @default false
    */
  var id: `false` | String
  /**
    * HTML Data attributes used to store data
    */
  var metadata: MetadataSettings
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
    * Specify an object containing key/value pairs to add to the iframes GET parameters
    *
    * @default false
    */
  var parameters: `false` | ParametersSettings
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  // endregion
  // region DOM Settings
  /**
    * DOM Selectors used internally
    */
  var selector: SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  /**
    * Specifies a source to use, if no source is provided it will be determined from the domain of a specified url.
    *
    * @default false
    */
  var source: `false` | String
  var templates: TemplatesSettings
  /**
    * Specifies a url to use for embed
    *
    * @default false
    */
  var url: `false` | String
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  // endregion
  // region Callbacks
  /**
    * Callback when iframe is generated
    */
  def onCreate(`this`: JQuery, url: String): Unit
  /**
    * Whenever an iframe contents is shown
    */
  def onDisplay(`this`: JQuery): Unit
  /**
    * Callback when module parameters are determined. Allows you to adjust parameters at run time by returning a new parameters object.
    */
  def onEmbed(`this`: JQuery, parameters: ParametersSettings): ParametersSettings
  /**
    * Callback immediately before Embed is removed from DOM
    */
  def onPlaceholderDisplay(`this`: JQuery): Unit
}

object _Impl {
  @scala.inline
  def apply(
    autoplay: auto | Boolean,
    brandedUI: Boolean,
    className: ClassNameSettings,
    color: String,
    debug: Boolean,
    error: ErrorSettings,
    hd: Boolean,
    icon: `false` | String,
    id: `false` | String,
    metadata: MetadataSettings,
    name: String,
    namespace: String,
    onCreate: (JQuery, String) => Unit,
    onDisplay: JQuery => Unit,
    onEmbed: (JQuery, ParametersSettings) => ParametersSettings,
    onPlaceholderDisplay: JQuery => Unit,
    parameters: `false` | ParametersSettings,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    source: `false` | String,
    templates: TemplatesSettings,
    url: `false` | String,
    verbose: Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any], brandedUI = brandedUI, className = className, color = color, debug = debug, error = error, hd = hd, icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata, name = name, namespace = namespace, onCreate = js.Any.fromFunction2(onCreate), onDisplay = js.Any.fromFunction1(onDisplay), onEmbed = js.Any.fromFunction2(onEmbed), onPlaceholderDisplay = js.Any.fromFunction1(onPlaceholderDisplay), parameters = parameters.asInstanceOf[js.Any], performance = performance, selector = selector, silent = silent, source = source.asInstanceOf[js.Any], templates = templates, url = url.asInstanceOf[js.Any], verbose = verbose)
  
    __obj.asInstanceOf[_Impl]
  }
}

