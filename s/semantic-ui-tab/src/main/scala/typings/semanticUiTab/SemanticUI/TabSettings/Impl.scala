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

trait Impl extends js.Object {
  /**
    * Tab should reload content every time it is opened
    */
  var alwaysRefresh: Boolean
  /**
    * Settings object for $.api call
    *
    * @default false
    * @see {@link http://semantic-ui.com/behaviors/api.html}
    */
  var apiSettings: ApiSettings
  // region Tab Settings
  /**
    * Whether tab should load remote content as same url as history
    *
    * @default false
    */
  var auto: Boolean
  /**
    * Tab should cache content after loading locally to avoid server trip on second load
    *
    * @default true
    */
  var cache: Boolean
  /**
    * Can be set to either response, DOM or html.
    * Using DOM will cache the a clone of the DOM tree, preserving all events as they existed on render.
    * response will cache the original response on load, this way callbacks always receive the same content.
    * Using html will cache the resulting html after all callbacks, making sure any changes to content are preserved.
    *
    * @default 'response'
    */
  var cacheType: response | DOM | html
  /**
    * If enabled limits tabs to children of passed context
    *
    * @default false
    */
  var childrenOnly: Boolean
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings
  /**
    * Tabs are limited to those found inside this context
    *
    * @default false
    */
  var context: `false` | String | JQuery
  /**
    * When set to siblings will only deactivate elements that are DOM siblings with the activated element.
    * When set to all the component will deactivate all other elements initialized at the same time.
    *
    * @default 'siblings'
    * @since 2.2
    */
  var deactivate: siblings | all
  /**
    * Debug output to console
    */
  var debug: Boolean
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * Whether inline scripts in tab HTML should be parsed on tab load.
    * Defaults to once, parsing only on first load.
    * Can also be set to true or false to always parse or never parse inline scripts.
    *
    * @default 'once'
    */
  var evaluateScripts: once | Boolean
  /**
    * Whether to record history events for tab changes
    *
    * @default false
    */
  var history: Boolean
  /**
    * Can be set to hash or state.
    * Hash will use an in-page link to create history events.
    * State will use DOM History and load pages from server on refresh.
    *
    * @default 'hash'
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/Guide/API/DOM/Manipulating_the_browser_history}
    */
  var historyType: hash | state
  /**
    * Do not load content remotely on first tab load. Useful when open tab is rendered on server.
    *
    * @default false
    */
  var ignoreFirstLoad: Boolean
  /**
    * When enabled only calls remote endpoint for tab data on first load and leaves the DOM undisturbed afterwards.
    *
    * @default false
    * @since 2.2.8
    */
  var loadOnce: Boolean
  /**
    * Maximum amount of nested tabs allowed (avoids recursion)
    *
    * @default 25
    */
  var maxDepth: Double
  /**
    * DOM metadata used by module
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
    * When using historyType state you must specify the base URL for all internal links.
    *
    * @default false
    */
  var path: `false` | String
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  /**
    * Selectors used by module
    */
  var selector: SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  // endregion
  // region DOM Settings
  /**
    * Functions used to return content
    */
  var templates: TemplatesSettings
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  // endregion
  // region Callbacks
  /**
    * Callback only the first time a tab is loaded
    */
  def onFirstLoad(tabPath: String, parameterArray: js.Array[_], historyEvent: js.Any): Unit
  /**
    * Callback every time a tab is loaded
    */
  def onLoad(tabPath: String, parameterArray: js.Array[_], historyEvent: js.Any): Unit
  /**
    * Called when a tab begins loading remote content
    */
  def onRequest(tabPath: String): Unit
  /**
    * Called after a tab becomes visible
    */
  def onVisible(tabPath: String): Unit
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
}

