package typings.semanticUiTab

import typings.semanticUiApi.SemanticUI.ApiSettings
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

/* Inlined std.Partial<std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, keyof semantic-ui-tab.SemanticUI.TabSettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var alwaysRefresh: js.UndefOr[Boolean] = js.undefined
  var apiSettings: js.UndefOr[ApiSettings] = js.undefined
  var auto: js.UndefOr[Boolean] = js.undefined
  var cache: js.UndefOr[Boolean] = js.undefined
  var cacheType: js.UndefOr[response | DOM | html] = js.undefined
  var childrenOnly: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var context: js.UndefOr[`false` | String | JQuery] = js.undefined
  var deactivate: js.UndefOr[siblings | all] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var evaluateScripts: js.UndefOr[once | Boolean] = js.undefined
  var history: js.UndefOr[Boolean] = js.undefined
  var historyType: js.UndefOr[hash | state] = js.undefined
  var ignoreFirstLoad: js.UndefOr[Boolean] = js.undefined
  var loadOnce: js.UndefOr[Boolean] = js.undefined
  var maxDepth: js.UndefOr[Double] = js.undefined
  var metadata: js.UndefOr[MetadataSettings] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var onFirstLoad: js.UndefOr[
    js.ThisFunction3[
      /* this */ JQuery, 
      /* tabPath */ String, 
      /* parameterArray */ js.Array[_], 
      /* historyEvent */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var onLoad: js.UndefOr[
    js.ThisFunction3[
      /* this */ JQuery, 
      /* tabPath */ String, 
      /* parameterArray */ js.Array[_], 
      /* historyEvent */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var onRequest: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]] = js.undefined
  var onVisible: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]] = js.undefined
  var path: js.UndefOr[`false` | String] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var templates: js.UndefOr[TemplatesSettings] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    alwaysRefresh: js.UndefOr[Boolean] = js.undefined,
    apiSettings: ApiSettings = null,
    auto: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    cacheType: response | DOM | html = null,
    childrenOnly: js.UndefOr[Boolean] = js.undefined,
    className: ClassNameSettings = null,
    context: `false` | String | JQuery = null,
    deactivate: siblings | all = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    error: ErrorSettings = null,
    evaluateScripts: once | Boolean = null,
    history: js.UndefOr[Boolean] = js.undefined,
    historyType: hash | state = null,
    ignoreFirstLoad: js.UndefOr[Boolean] = js.undefined,
    loadOnce: js.UndefOr[Boolean] = js.undefined,
    maxDepth: Int | Double = null,
    metadata: MetadataSettings = null,
    name: String = null,
    namespace: String = null,
    onFirstLoad: js.ThisFunction3[
      /* this */ JQuery, 
      /* tabPath */ String, 
      /* parameterArray */ js.Array[_], 
      /* historyEvent */ js.Any, 
      Unit
    ] = null,
    onLoad: js.ThisFunction3[
      /* this */ JQuery, 
      /* tabPath */ String, 
      /* parameterArray */ js.Array[_], 
      /* historyEvent */ js.Any, 
      Unit
    ] = null,
    onRequest: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit] = null,
    onVisible: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit] = null,
    path: `false` | String = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    selector: SelectorSettings = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    templates: TemplatesSettings = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysRefresh)) __obj.updateDynamic("alwaysRefresh")(alwaysRefresh.asInstanceOf[js.Any])
    if (apiSettings != null) __obj.updateDynamic("apiSettings")(apiSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cacheType != null) __obj.updateDynamic("cacheType")(cacheType.asInstanceOf[js.Any])
    if (!js.isUndefined(childrenOnly)) __obj.updateDynamic("childrenOnly")(childrenOnly.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (deactivate != null) __obj.updateDynamic("deactivate")(deactivate.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (evaluateScripts != null) __obj.updateDynamic("evaluateScripts")(evaluateScripts.asInstanceOf[js.Any])
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (historyType != null) __obj.updateDynamic("historyType")(historyType.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreFirstLoad)) __obj.updateDynamic("ignoreFirstLoad")(ignoreFirstLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(loadOnce)) __obj.updateDynamic("loadOnce")(loadOnce.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (onFirstLoad != null) __obj.updateDynamic("onFirstLoad")(onFirstLoad.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad.asInstanceOf[js.Any])
    if (onRequest != null) __obj.updateDynamic("onRequest")(onRequest.asInstanceOf[js.Any])
    if (onVisible != null) __obj.updateDynamic("onVisible")(onVisible.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

