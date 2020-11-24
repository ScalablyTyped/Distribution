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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, keyof semantic-ui-tab.SemanticUI.TabSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  
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
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    
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
    def deleteAlwaysRefresh: Self = this.set("alwaysRefresh", js.undefined)
    
    @scala.inline
    def setApiSettings(value: ApiSettings): Self = this.set("apiSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiSettings: Self = this.set("apiSettings", js.undefined)
    
    @scala.inline
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCacheType(value: response | DOM | html): Self = this.set("cacheType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheType: Self = this.set("cacheType", js.undefined)
    
    @scala.inline
    def setChildrenOnly(value: Boolean): Self = this.set("childrenOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildrenOnly: Self = this.set("childrenOnly", js.undefined)
    
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContext(value: `false` | String | JQuery): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDeactivate(value: siblings | all): Self = this.set("deactivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeactivate: Self = this.set("deactivate", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setEvaluateScripts(value: once | Boolean): Self = this.set("evaluateScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluateScripts: Self = this.set("evaluateScripts", js.undefined)
    
    @scala.inline
    def setHistory(value: Boolean): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    
    @scala.inline
    def setHistoryType(value: hash | state): Self = this.set("historyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryType: Self = this.set("historyType", js.undefined)
    
    @scala.inline
    def setIgnoreFirstLoad(value: Boolean): Self = this.set("ignoreFirstLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreFirstLoad: Self = this.set("ignoreFirstLoad", js.undefined)
    
    @scala.inline
    def setLoadOnce(value: Boolean): Self = this.set("loadOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadOnce: Self = this.set("loadOnce", js.undefined)
    
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDepth: Self = this.set("maxDepth", js.undefined)
    
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setOnFirstLoad(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* tabPath */ String, 
          /* parameterArray */ js.Array[_], 
          /* historyEvent */ js.Any, 
          Unit
        ]
    ): Self = this.set("onFirstLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFirstLoad: Self = this.set("onFirstLoad", js.undefined)
    
    @scala.inline
    def setOnLoad(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* tabPath */ String, 
          /* parameterArray */ js.Array[_], 
          /* historyEvent */ js.Any, 
          Unit
        ]
    ): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnRequest(value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]): Self = this.set("onRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRequest: Self = this.set("onRequest", js.undefined)
    
    @scala.inline
    def setOnVisible(value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]): Self = this.set("onVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnVisible: Self = this.set("onVisible", js.undefined)
    
    @scala.inline
    def setPath(value: `false` | String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setTemplates(value: TemplatesSettings): Self = this.set("templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
