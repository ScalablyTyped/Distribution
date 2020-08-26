package typings.semanticUiTab.SemanticUI.TabSettings

import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiTab.JQuery
import typings.semanticUiTab.SemanticUI.Tab.ClassNameSettings
import typings.semanticUiTab.SemanticUI.Tab.ErrorSettings
import typings.semanticUiTab.SemanticUI.Tab.MetadataSettings
import typings.semanticUiTab.SemanticUI.Tab.SelectorSettings
import typings.semanticUiTab.SemanticUI.Tab.TemplatesSettings
import typings.semanticUiTab.semanticUiTabBooleans.`false`
import typings.semanticUiTab.semanticUiTabStrings.DOM
import typings.semanticUiTab.semanticUiTabStrings.all
import typings.semanticUiTab.semanticUiTabStrings.hash
import typings.semanticUiTab.semanticUiTabStrings.html
import typings.semanticUiTab.semanticUiTabStrings.once
import typings.semanticUiTab.semanticUiTabStrings.response
import typings.semanticUiTab.semanticUiTabStrings.siblings
import typings.semanticUiTab.semanticUiTabStrings.state
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * Tab should reload content every time it is opened
    */
  var alwaysRefresh: Boolean = js.native
  /**
    * Settings object for $.api call
    *
    * @default false
    * @see {@link http://semantic-ui.com/behaviors/api.html}
    */
  var apiSettings: ApiSettings = js.native
  // region Tab Settings
  /**
    * Whether tab should load remote content as same url as history
    *
    * @default false
    */
  var auto: Boolean = js.native
  /**
    * Tab should cache content after loading locally to avoid server trip on second load
    *
    * @default true
    */
  var cache: Boolean = js.native
  /**
    * Can be set to either response, DOM or html.
    * Using DOM will cache the a clone of the DOM tree, preserving all events as they existed on render.
    * response will cache the original response on load, this way callbacks always receive the same content.
    * Using html will cache the resulting html after all callbacks, making sure any changes to content are preserved.
    *
    * @default 'response'
    */
  var cacheType: response | DOM | html = js.native
  /**
    * If enabled limits tabs to children of passed context
    *
    * @default false
    */
  var childrenOnly: Boolean = js.native
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings = js.native
  /**
    * Tabs are limited to those found inside this context
    *
    * @default false
    */
  var context: `false` | String | JQuery = js.native
  /**
    * When set to siblings will only deactivate elements that are DOM siblings with the activated element.
    * When set to all the component will deactivate all other elements initialized at the same time.
    *
    * @default 'siblings'
    * @since 2.2
    */
  var deactivate: siblings | all = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * Whether inline scripts in tab HTML should be parsed on tab load.
    * Defaults to once, parsing only on first load.
    * Can also be set to true or false to always parse or never parse inline scripts.
    *
    * @default 'once'
    */
  var evaluateScripts: once | Boolean = js.native
  /**
    * Whether to record history events for tab changes
    *
    * @default false
    */
  var history: Boolean = js.native
  /**
    * Can be set to hash or state.
    * Hash will use an in-page link to create history events.
    * State will use DOM History and load pages from server on refresh.
    *
    * @default 'hash'
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/Guide/API/DOM/Manipulating_the_browser_history}
    */
  var historyType: hash | state = js.native
  /**
    * Do not load content remotely on first tab load. Useful when open tab is rendered on server.
    *
    * @default false
    */
  var ignoreFirstLoad: Boolean = js.native
  /**
    * When enabled only calls remote endpoint for tab data on first load and leaves the DOM undisturbed afterwards.
    *
    * @default false
    * @since 2.2.8
    */
  var loadOnce: Boolean = js.native
  /**
    * Maximum amount of nested tabs allowed (avoids recursion)
    *
    * @default 25
    */
  var maxDepth: Double = js.native
  /**
    * DOM metadata used by module
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
    * When using historyType state you must specify the base URL for all internal links.
    *
    * @default false
    */
  var path: `false` | String = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  /**
    * Selectors used by module
    */
  var selector: SelectorSettings = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  // endregion
  // region DOM Settings
  /**
    * Functions used to return content
    */
  var templates: TemplatesSettings = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  // endregion
  // region Callbacks
  /**
    * Callback only the first time a tab is loaded
    */
  def onFirstLoad(tabPath: String, parameterArray: js.Array[_], historyEvent: js.Any): Unit = js.native
  /**
    * Callback every time a tab is loaded
    */
  def onLoad(tabPath: String, parameterArray: js.Array[_], historyEvent: js.Any): Unit = js.native
  /**
    * Called when a tab begins loading remote content
    */
  def onRequest(tabPath: String): Unit = js.native
  /**
    * Called after a tab becomes visible
    */
  def onVisible(tabPath: String): Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    alwaysRefresh: Boolean,
    apiSettings: ApiSettings,
    auto: Boolean,
    cache: Boolean,
    cacheType: response | DOM | html,
    childrenOnly: Boolean,
    className: ClassNameSettings,
    context: `false` | String | JQuery,
    deactivate: siblings | all,
    debug: Boolean,
    error: ErrorSettings,
    evaluateScripts: once | Boolean,
    history: Boolean,
    historyType: hash | state,
    ignoreFirstLoad: Boolean,
    loadOnce: Boolean,
    maxDepth: Double,
    metadata: MetadataSettings,
    name: String,
    namespace: String,
    onFirstLoad: (String, js.Array[_], js.Any) => Unit,
    onLoad: (String, js.Array[_], js.Any) => Unit,
    onRequest: String => Unit,
    onVisible: String => Unit,
    path: `false` | String,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    templates: TemplatesSettings,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(alwaysRefresh = alwaysRefresh.asInstanceOf[js.Any], apiSettings = apiSettings.asInstanceOf[js.Any], auto = auto.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheType = cacheType.asInstanceOf[js.Any], childrenOnly = childrenOnly.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], deactivate = deactivate.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], evaluateScripts = evaluateScripts.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], historyType = historyType.asInstanceOf[js.Any], ignoreFirstLoad = ignoreFirstLoad.asInstanceOf[js.Any], loadOnce = loadOnce.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onFirstLoad = js.Any.fromFunction3(onFirstLoad), onLoad = js.Any.fromFunction3(onLoad), onRequest = js.Any.fromFunction1(onRequest), onVisible = js.Any.fromFunction1(onVisible), path = path.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
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
    def setAlwaysRefresh(value: Boolean): Self = this.set("alwaysRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiSettings(value: ApiSettings): Self = this.set("apiSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheType(value: response | DOM | html): Self = this.set("cacheType", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenOnly(value: Boolean): Self = this.set("childrenOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: `false` | String | JQuery): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeactivate(value: siblings | all): Self = this.set("deactivate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvaluateScripts(value: once | Boolean): Self = this.set("evaluateScripts", value.asInstanceOf[js.Any])
    @scala.inline
    def setHistory(value: Boolean): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def setHistoryType(value: hash | state): Self = this.set("historyType", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreFirstLoad(value: Boolean): Self = this.set("ignoreFirstLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadOnce(value: Boolean): Self = this.set("loadOnce", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnFirstLoad(value: (String, js.Array[_], js.Any) => Unit): Self = this.set("onFirstLoad", js.Any.fromFunction3(value))
    @scala.inline
    def setOnLoad(value: (String, js.Array[_], js.Any) => Unit): Self = this.set("onLoad", js.Any.fromFunction3(value))
    @scala.inline
    def setOnRequest(value: String => Unit): Self = this.set("onRequest", js.Any.fromFunction1(value))
    @scala.inline
    def setOnVisible(value: String => Unit): Self = this.set("onVisible", js.Any.fromFunction1(value))
    @scala.inline
    def setPath(value: `false` | String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplates(value: TemplatesSettings): Self = this.set("templates", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
  
}

