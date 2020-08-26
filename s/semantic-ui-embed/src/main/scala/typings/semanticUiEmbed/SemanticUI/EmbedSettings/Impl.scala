package typings.semanticUiEmbed.SemanticUI.EmbedSettings

import typings.semanticUiEmbed.SemanticUI.Embed.ClassNameSettings
import typings.semanticUiEmbed.SemanticUI.Embed.ErrorSettings
import typings.semanticUiEmbed.SemanticUI.Embed.MetadataSettings
import typings.semanticUiEmbed.SemanticUI.Embed.ParametersSettings
import typings.semanticUiEmbed.SemanticUI.Embed.SelectorSettings
import typings.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings
import typings.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import typings.semanticUiEmbed.semanticUiEmbedStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  // endregion
  // region Video Settings
  /**
    * Default setting auto will only autoplay content when a placeholder is specified. Setting to true or false will force autoplay.
    *
    * @default 'auto'
    */
  var autoplay: auto | Boolean = js.native
  /**
    * Whether to show networks branded UI like title cards, or after video calls to action.
    *
    * @default false
    */
  var brandedUI: Boolean = js.native
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings = js.native
  /**
    * Specifies a default chrome color with Vimeo or YouTube.
    *
    * @default '#444444'
    */
  var color: String = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * Whether to prefer HD content
    *
    * @default true
    */
  var hd: Boolean = js.native
  // region Embed Settings
  /**
    * Specifies an icon to use with placeholder content
    *
    * @default false
    */
  var icon: `false` | String = js.native
  /**
    * Specifies an id value to replace with the {id} value found in templated urls
    *
    * @default false
    */
  var id: `false` | String = js.native
  /**
    * HTML Data attributes used to store data
    */
  var metadata: MetadataSettings = js.native
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String = js.native
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String = js.native
  /**
    * Specify an object containing key/value pairs to add to the iframes GET parameters
    *
    * @default false
    */
  var parameters: `false` | ParametersSettings = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  // endregion
  // region DOM Settings
  /**
    * DOM Selectors used internally
    */
  var selector: SelectorSettings = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * Specifies a source to use, if no source is provided it will be determined from the domain of a specified url.
    *
    * @default false
    */
  var source: `false` | String = js.native
  var templates: TemplatesSettings = js.native
  /**
    * Specifies a url to use for embed
    *
    * @default false
    */
  var url: `false` | String = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  // endregion
  // region Callbacks
  /**
    * Callback when iframe is generated
    */
  def onCreate(url: String): Unit = js.native
  /**
    * Whenever an iframe contents is shown
    */
  def onDisplay(): Unit = js.native
  /**
    * Callback when module parameters are determined. Allows you to adjust parameters at run time by returning a new parameters object.
    */
  def onEmbed(parameters: ParametersSettings): ParametersSettings = js.native
  /**
    * Callback immediately before Embed is removed from DOM
    */
  def onPlaceholderDisplay(): Unit = js.native
}

object Impl {
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
    onCreate: String => Unit,
    onDisplay: () => Unit,
    onEmbed: ParametersSettings => ParametersSettings,
    onPlaceholderDisplay: () => Unit,
    parameters: `false` | ParametersSettings,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    source: `false` | String,
    templates: TemplatesSettings,
    url: `false` | String,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any], brandedUI = brandedUI.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], hd = hd.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onCreate = js.Any.fromFunction1(onCreate), onDisplay = js.Any.fromFunction0(onDisplay), onEmbed = js.Any.fromFunction1(onEmbed), onPlaceholderDisplay = js.Any.fromFunction0(onPlaceholderDisplay), parameters = parameters.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoplay(value: auto | Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrandedUI(value: Boolean): Self = this.set("brandedUI", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setHd(value: Boolean): Self = this.set("hd", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: `false` | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: `false` | String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCreate(value: String => Unit): Self = this.set("onCreate", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDisplay(value: () => Unit): Self = this.set("onDisplay", js.Any.fromFunction0(value))
    @scala.inline
    def setOnEmbed(value: ParametersSettings => ParametersSettings): Self = this.set("onEmbed", js.Any.fromFunction1(value))
    @scala.inline
    def setOnPlaceholderDisplay(value: () => Unit): Self = this.set("onPlaceholderDisplay", js.Any.fromFunction0(value))
    @scala.inline
    def setParameters(value: `false` | ParametersSettings): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: `false` | String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplates(value: TemplatesSettings): Self = this.set("templates", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: `false` | String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
  
}

