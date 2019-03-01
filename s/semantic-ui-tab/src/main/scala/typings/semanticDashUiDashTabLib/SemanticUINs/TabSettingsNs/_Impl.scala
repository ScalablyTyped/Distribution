package typings
package semanticDashUiDashTabLib.SemanticUINs.TabSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * Tab should reload content every time it is opened
    */
  var alwaysRefresh: scala.Boolean
  /**
    * Settings object for $.api call
    *
    * @default false
    * @see {@link http://semantic-ui.com/behaviors/api.html}
    */
  var apiSettings: semanticDashUiDashApiLib.SemanticUINs.ApiSettings
  // region Tab Settings
  /**
    * Whether tab should load remote content as same url as history
    *
    * @default false
    */
  var auto: scala.Boolean
  /**
    * Tab should cache content after loading locally to avoid server trip on second load
    *
    * @default true
    */
  var cache: scala.Boolean
  /**
    * Can be set to either response, DOM or html.
    * Using DOM will cache the a clone of the DOM tree, preserving all events as they existed on render.
    * response will cache the original response on load, this way callbacks always receive the same content.
    * Using html will cache the resulting html after all callbacks, making sure any changes to content are preserved.
    *
    * @default 'response'
    */
  var cacheType: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.response | semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.DOM | semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.html
  /**
    * If enabled limits tabs to children of passed context
    *
    * @default false
    */
  var childrenOnly: scala.Boolean
  /**
    * Class names used to attach style to state
    */
  var className: semanticDashUiDashTabLib.SemanticUINs.TabNs.ClassNameSettings
  /**
    * Tabs are limited to those found inside this context
    *
    * @default false
    */
  var context: semanticDashUiDashTabLib.semanticDashUiDashTabLibNumbers.`false` | java.lang.String | semanticDashUiDashTabLib.JQuery
  /**
    * When set to siblings will only deactivate elements that are DOM siblings with the activated element.
    * When set to all the component will deactivate all other elements initialized at the same time.
    *
    * @default 'siblings'
    * @since 2.2
    */
  var deactivate: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.siblings | semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.all
  /**
    * Debug output to console
    */
  var debug: scala.Boolean
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashTabLib.SemanticUINs.TabNs.ErrorSettings
  /**
    * Whether inline scripts in tab HTML should be parsed on tab load.
    * Defaults to once, parsing only on first load.
    * Can also be set to true or false to always parse or never parse inline scripts.
    *
    * @default 'once'
    */
  var evaluateScripts: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.once | scala.Boolean
  /**
    * Whether to record history events for tab changes
    *
    * @default false
    */
  var history: scala.Boolean
  /**
    * Can be set to hash or state.
    * Hash will use an in-page link to create history events.
    * State will use DOM History and load pages from server on refresh.
    *
    * @default 'hash'
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/Guide/API/DOM/Manipulating_the_browser_history}
    */
  var historyType: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.hash | semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.state
  /**
    * Do not load content remotely on first tab load. Useful when open tab is rendered on server.
    *
    * @default false
    */
  var ignoreFirstLoad: scala.Boolean
  /**
    * When enabled only calls remote endpoint for tab data on first load and leaves the DOM undisturbed afterwards.
    *
    * @default false
    * @since 2.2.8
    */
  var loadOnce: scala.Boolean
  /**
    * Maximum amount of nested tabs allowed (avoids recursion)
    *
    * @default 25
    */
  var maxDepth: scala.Double
  /**
    * DOM metadata used by module
    */
  var metadata: semanticDashUiDashTabLib.SemanticUINs.TabNs.MetadataSettings
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
    * When using historyType state you must specify the base URL for all internal links.
    *
    * @default false
    */
  var path: semanticDashUiDashTabLib.semanticDashUiDashTabLibNumbers.`false` | java.lang.String
  /**
    * Show console.table output with performance metrics
    */
  var performance: scala.Boolean
  /**
    * Selectors used by module
    */
  var selector: semanticDashUiDashTabLib.SemanticUINs.TabNs.SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: scala.Boolean
  // endregion
  // region DOM Settings
  /**
    * Functions used to return content
    */
  var templates: semanticDashUiDashTabLib.SemanticUINs.TabNs.TemplatesSettings
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: scala.Boolean
  // endregion
  // region Callbacks
  /**
    * Callback only the first time a tab is loaded
    */
  def onFirstLoad(
    `this`: semanticDashUiDashTabLib.JQuery,
    tabPath: java.lang.String,
    parameterArray: js.Array[_],
    historyEvent: js.Any
  ): scala.Unit
  /**
    * Callback every time a tab is loaded
    */
  def onLoad(
    `this`: semanticDashUiDashTabLib.JQuery,
    tabPath: java.lang.String,
    parameterArray: js.Array[_],
    historyEvent: js.Any
  ): scala.Unit
  /**
    * Called when a tab begins loading remote content
    */
  def onRequest(`this`: semanticDashUiDashTabLib.JQuery, tabPath: java.lang.String): scala.Unit
  /**
    * Called after a tab becomes visible
    */
  def onVisible(`this`: semanticDashUiDashTabLib.JQuery, tabPath: java.lang.String): scala.Unit
}

object _Impl {
  @scala.inline
  def apply(
    alwaysRefresh: scala.Boolean,
    apiSettings: semanticDashUiDashApiLib.SemanticUINs.ApiSettings,
    auto: scala.Boolean,
    cache: scala.Boolean,
    cacheType: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.response | semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.DOM | semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.html,
    childrenOnly: scala.Boolean,
    className: semanticDashUiDashTabLib.SemanticUINs.TabNs.ClassNameSettings,
    context: semanticDashUiDashTabLib.semanticDashUiDashTabLibNumbers.`false` | java.lang.String | semanticDashUiDashTabLib.JQuery,
    deactivate: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.siblings | semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.all,
    debug: scala.Boolean,
    error: semanticDashUiDashTabLib.SemanticUINs.TabNs.ErrorSettings,
    evaluateScripts: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.once | scala.Boolean,
    history: scala.Boolean,
    historyType: semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.hash | semanticDashUiDashTabLib.semanticDashUiDashTabLibStrings.state,
    ignoreFirstLoad: scala.Boolean,
    loadOnce: scala.Boolean,
    maxDepth: scala.Double,
    metadata: semanticDashUiDashTabLib.SemanticUINs.TabNs.MetadataSettings,
    name: java.lang.String,
    namespace: java.lang.String,
    onFirstLoad: js.Function4[semanticDashUiDashTabLib.JQuery, java.lang.String, js.Array[_], js.Any, scala.Unit],
    onLoad: js.Function4[semanticDashUiDashTabLib.JQuery, java.lang.String, js.Array[_], js.Any, scala.Unit],
    onRequest: js.Function2[semanticDashUiDashTabLib.JQuery, java.lang.String, scala.Unit],
    onVisible: js.Function2[semanticDashUiDashTabLib.JQuery, java.lang.String, scala.Unit],
    path: semanticDashUiDashTabLib.semanticDashUiDashTabLibNumbers.`false` | java.lang.String,
    performance: scala.Boolean,
    selector: semanticDashUiDashTabLib.SemanticUINs.TabNs.SelectorSettings,
    silent: scala.Boolean,
    templates: semanticDashUiDashTabLib.SemanticUINs.TabNs.TemplatesSettings,
    verbose: scala.Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alwaysRefresh")(alwaysRefresh)
    __obj.updateDynamic("apiSettings")(apiSettings.asInstanceOf[js.Any])
    __obj.updateDynamic("auto")(auto)
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("cacheType")(cacheType.asInstanceOf[js.Any])
    __obj.updateDynamic("childrenOnly")(childrenOnly)
    __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.updateDynamic("deactivate")(deactivate.asInstanceOf[js.Any])
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.updateDynamic("evaluateScripts")(evaluateScripts.asInstanceOf[js.Any])
    __obj.updateDynamic("history")(history)
    __obj.updateDynamic("historyType")(historyType.asInstanceOf[js.Any])
    __obj.updateDynamic("ignoreFirstLoad")(ignoreFirstLoad)
    __obj.updateDynamic("loadOnce")(loadOnce)
    __obj.updateDynamic("maxDepth")(maxDepth)
    __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("onFirstLoad")(onFirstLoad)
    __obj.updateDynamic("onLoad")(onLoad)
    __obj.updateDynamic("onRequest")(onRequest)
    __obj.updateDynamic("onVisible")(onVisible)
    __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.updateDynamic("performance")(performance)
    __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.updateDynamic("silent")(silent)
    __obj.updateDynamic("templates")(templates)
    __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[_Impl]
  }
}

