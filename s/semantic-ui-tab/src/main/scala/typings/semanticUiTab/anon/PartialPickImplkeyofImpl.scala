package typings.semanticUiTab.anon

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, keyof semantic-ui-tab.SemanticUI.TabSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends StObject {
  
  var alwaysRefresh: js.UndefOr[Boolean] = js.native
  
  var apiSettings: js.UndefOr[ApiSettings] = js.native
  
  var auto: js.UndefOr[Boolean] = js.native
  
  var cache: js.UndefOr[Boolean] = js.native
  
  var cacheType: js.UndefOr[response | DOM | html] = js.native
  
  var childrenOnly: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[ClassNameSettings] = js.native
  
  var context: js.UndefOr[`false` | String | JQuery] = js.native
  
  var deactivate: js.UndefOr[siblings | all] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[ErrorSettings] = js.native
  
  var evaluateScripts: js.UndefOr[once | Boolean] = js.native
  
  var history: js.UndefOr[Boolean] = js.native
  
  var historyType: js.UndefOr[hash | state] = js.native
  
  var ignoreFirstLoad: js.UndefOr[Boolean] = js.native
  
  var loadOnce: js.UndefOr[Boolean] = js.native
  
  var maxDepth: js.UndefOr[Double] = js.native
  
  var metadata: js.UndefOr[MetadataSettings] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var namespace: js.UndefOr[String] = js.native
  
  var onFirstLoad: js.UndefOr[
    js.ThisFunction3[
      /* this */ JQuery, 
      /* tabPath */ String, 
      /* parameterArray */ js.Array[_], 
      /* historyEvent */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var onLoad: js.UndefOr[
    js.ThisFunction3[
      /* this */ JQuery, 
      /* tabPath */ String, 
      /* parameterArray */ js.Array[_], 
      /* historyEvent */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var onRequest: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]] = js.native
  
  var onVisible: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]] = js.native
  
  var path: js.UndefOr[`false` | String] = js.native
  
  var performance: js.UndefOr[Boolean] = js.native
  
  var selector: js.UndefOr[SelectorSettings] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
  
  var templates: js.UndefOr[TemplatesSettings] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object PartialPickImplkeyofImpl {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplMutableBuilder[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysRefresh(value: Boolean): Self = StObject.set(x, "alwaysRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysRefreshUndefined: Self = StObject.set(x, "alwaysRefresh", js.undefined)
    
    @scala.inline
    def setApiSettings(value: ApiSettings): Self = StObject.set(x, "apiSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiSettingsUndefined: Self = StObject.set(x, "apiSettings", js.undefined)
    
    @scala.inline
    def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheType(value: response | DOM | html): Self = StObject.set(x, "cacheType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheTypeUndefined: Self = StObject.set(x, "cacheType", js.undefined)
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setChildrenOnly(value: Boolean): Self = StObject.set(x, "childrenOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenOnlyUndefined: Self = StObject.set(x, "childrenOnly", js.undefined)
    
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContext(value: `false` | String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDeactivate(value: siblings | all): Self = StObject.set(x, "deactivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setEvaluateScripts(value: once | Boolean): Self = StObject.set(x, "evaluateScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluateScriptsUndefined: Self = StObject.set(x, "evaluateScripts", js.undefined)
    
    @scala.inline
    def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryType(value: hash | state): Self = StObject.set(x, "historyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryTypeUndefined: Self = StObject.set(x, "historyType", js.undefined)
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setIgnoreFirstLoad(value: Boolean): Self = StObject.set(x, "ignoreFirstLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreFirstLoadUndefined: Self = StObject.set(x, "ignoreFirstLoad", js.undefined)
    
    @scala.inline
    def setLoadOnce(value: Boolean): Self = StObject.set(x, "loadOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadOnceUndefined: Self = StObject.set(x, "loadOnce", js.undefined)
    
    @scala.inline
    def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
    
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setOnFirstLoad(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* tabPath */ String, 
          /* parameterArray */ js.Array[_], 
          /* historyEvent */ js.Any, 
          Unit
        ]
    ): Self = StObject.set(x, "onFirstLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFirstLoadUndefined: Self = StObject.set(x, "onFirstLoad", js.undefined)
    
    @scala.inline
    def setOnLoad(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* tabPath */ String, 
          /* parameterArray */ js.Array[_], 
          /* historyEvent */ js.Any, 
          Unit
        ]
    ): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnRequest(value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]): Self = StObject.set(x, "onRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRequestUndefined: Self = StObject.set(x, "onRequest", js.undefined)
    
    @scala.inline
    def setOnVisible(value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]): Self = StObject.set(x, "onVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnVisibleUndefined: Self = StObject.set(x, "onVisible", js.undefined)
    
    @scala.inline
    def setPath(value: `false` | String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setTemplates(value: TemplatesSettings): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
