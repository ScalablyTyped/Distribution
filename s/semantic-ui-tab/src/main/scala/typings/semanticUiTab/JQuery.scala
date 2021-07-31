package typings.semanticUiTab

import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiTab.SemanticUI.Tab
import typings.semanticUiTab.SemanticUI.Tab.ClassNameSettings
import typings.semanticUiTab.SemanticUI.Tab.ErrorSettings
import typings.semanticUiTab.SemanticUI.Tab.MetadataSettings
import typings.semanticUiTab.SemanticUI.Tab.SelectorSettings
import typings.semanticUiTab.SemanticUI.Tab.TemplatesSettings
import typings.semanticUiTab.SemanticUI.TabSettings
import typings.semanticUiTab.semanticUiTabBooleans.`false`
import typings.semanticUiTab.semanticUiTabStrings.DOM
import typings.semanticUiTab.semanticUiTabStrings.`cache add`
import typings.semanticUiTab.semanticUiTabStrings.`cache read`
import typings.semanticUiTab.semanticUiTabStrings.`cache remove`
import typings.semanticUiTab.semanticUiTabStrings.`change tab`
import typings.semanticUiTab.semanticUiTabStrings.`get path`
import typings.semanticUiTab.semanticUiTabStrings.`is tab`
import typings.semanticUiTab.semanticUiTabStrings.`set state`
import typings.semanticUiTab.semanticUiTabStrings.all
import typings.semanticUiTab.semanticUiTabStrings.alwaysRefresh
import typings.semanticUiTab.semanticUiTabStrings.apiSettings
import typings.semanticUiTab.semanticUiTabStrings.auto
import typings.semanticUiTab.semanticUiTabStrings.cache
import typings.semanticUiTab.semanticUiTabStrings.cacheType
import typings.semanticUiTab.semanticUiTabStrings.childrenOnly
import typings.semanticUiTab.semanticUiTabStrings.className
import typings.semanticUiTab.semanticUiTabStrings.context
import typings.semanticUiTab.semanticUiTabStrings.deactivate
import typings.semanticUiTab.semanticUiTabStrings.debug
import typings.semanticUiTab.semanticUiTabStrings.destroy
import typings.semanticUiTab.semanticUiTabStrings.error
import typings.semanticUiTab.semanticUiTabStrings.evaluateScripts
import typings.semanticUiTab.semanticUiTabStrings.hash
import typings.semanticUiTab.semanticUiTabStrings.history
import typings.semanticUiTab.semanticUiTabStrings.historyType
import typings.semanticUiTab.semanticUiTabStrings.html
import typings.semanticUiTab.semanticUiTabStrings.ignoreFirstLoad
import typings.semanticUiTab.semanticUiTabStrings.loadOnce
import typings.semanticUiTab.semanticUiTabStrings.maxDepth
import typings.semanticUiTab.semanticUiTabStrings.metadata
import typings.semanticUiTab.semanticUiTabStrings.name
import typings.semanticUiTab.semanticUiTabStrings.namespace
import typings.semanticUiTab.semanticUiTabStrings.onFirstLoad
import typings.semanticUiTab.semanticUiTabStrings.onLoad
import typings.semanticUiTab.semanticUiTabStrings.onRequest
import typings.semanticUiTab.semanticUiTabStrings.onVisible
import typings.semanticUiTab.semanticUiTabStrings.once
import typings.semanticUiTab.semanticUiTabStrings.path
import typings.semanticUiTab.semanticUiTabStrings.performance
import typings.semanticUiTab.semanticUiTabStrings.response
import typings.semanticUiTab.semanticUiTabStrings.selector
import typings.semanticUiTab.semanticUiTabStrings.setting
import typings.semanticUiTab.semanticUiTabStrings.siblings
import typings.semanticUiTab.semanticUiTabStrings.silent
import typings.semanticUiTab.semanticUiTabStrings.state
import typings.semanticUiTab.semanticUiTabStrings.templates
import typings.semanticUiTab.semanticUiTabStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def tab(): JQuery
  def tab(behavior: setting, name: alwaysRefresh, value: Boolean): JQuery
  def tab(behavior: setting, name: alwaysRefresh, value: Unit): Boolean
  def tab(behavior: setting, name: apiSettings, value: Unit): ApiSettings
  def tab(behavior: setting, name: apiSettings, value: ApiSettings): JQuery
  def tab(behavior: setting, name: auto, value: Boolean): JQuery
  def tab(behavior: setting, name: auto, value: Unit): Boolean
  def tab(behavior: setting, name: cacheType, value: Unit): response | DOM | html
  def tab(behavior: setting, name: cacheType, value: DOM): JQuery
  def tab(behavior: setting, name: cacheType, value: html): JQuery
  def tab(behavior: setting, name: cacheType, value: response): JQuery
  def tab(behavior: setting, name: cache, value: Boolean): JQuery
  def tab(behavior: setting, name: cache, value: Unit): Boolean
  def tab(behavior: setting, name: childrenOnly, value: Boolean): JQuery
  def tab(behavior: setting, name: childrenOnly, value: Unit): Boolean
  def tab(behavior: setting, name: className, value: Unit): ClassNameSettings
  def tab(behavior: setting, name: className, value: ClassNameSettings): JQuery
  def tab(behavior: setting, name: context, value: String): JQuery
  def tab(behavior: setting, name: context, value: Unit): `false` | String | JQuery
  def tab(behavior: setting, name: context, value: JQuery): JQuery
  def tab(behavior: setting, name: context, value: `false`): JQuery
  def tab(behavior: setting, name: deactivate, value: Unit): siblings | all
  def tab(behavior: setting, name: deactivate, value: all): JQuery
  def tab(behavior: setting, name: deactivate, value: siblings): JQuery
  def tab(behavior: setting, name: debug, value: Boolean): JQuery
  def tab(behavior: setting, name: debug, value: Unit): Boolean
  def tab(behavior: setting, name: error, value: Unit): ErrorSettings
  def tab(behavior: setting, name: error, value: ErrorSettings): JQuery
  def tab(behavior: setting, name: evaluateScripts, value: Boolean): JQuery
  def tab(behavior: setting, name: evaluateScripts, value: Unit): once | Boolean
  def tab(behavior: setting, name: evaluateScripts, value: once): JQuery
  def tab(behavior: setting, name: historyType, value: Unit): hash | state
  def tab(behavior: setting, name: historyType, value: hash): JQuery
  def tab(behavior: setting, name: historyType, value: state): JQuery
  def tab(behavior: setting, name: history, value: Boolean): JQuery
  def tab(behavior: setting, name: history, value: Unit): Boolean
  def tab(behavior: setting, name: ignoreFirstLoad, value: Boolean): JQuery
  def tab(behavior: setting, name: ignoreFirstLoad, value: Unit): Boolean
  def tab(behavior: setting, name: loadOnce, value: Boolean): JQuery
  def tab(behavior: setting, name: loadOnce, value: Unit): Boolean
  def tab(behavior: setting, name: maxDepth, value: Double): JQuery
  def tab(behavior: setting, name: maxDepth, value: Unit): Double
  def tab(behavior: setting, name: metadata, value: Unit): MetadataSettings
  def tab(behavior: setting, name: metadata, value: MetadataSettings): JQuery
  def tab(behavior: setting, name: namespace, value: String): JQuery
  def tab(behavior: setting, name: namespace, value: Unit): String
  def tab(behavior: setting, name: name, value: String): JQuery
  def tab(behavior: setting, name: name, value: Unit): String
  def tab(
    behavior: setting,
    name: onFirstLoad,
    value: js.ThisFunction3[
      /* this */ JQuery, 
      /* tabPath */ String, 
      /* parameterArray */ js.Array[js.Any], 
      /* historyEvent */ js.Any, 
      Unit
    ]
  ): JQuery
  def tab(behavior: setting, name: onFirstLoad, value: Unit): js.ThisFunction3[
    /* this */ JQuery, 
    /* tabPath */ String, 
    /* parameterArray */ js.Array[js.Any], 
    /* historyEvent */ js.Any, 
    Unit
  ]
  def tab(
    behavior: setting,
    name: onLoad,
    value: js.ThisFunction3[
      /* this */ JQuery, 
      /* tabPath */ String, 
      /* parameterArray */ js.Array[js.Any], 
      /* historyEvent */ js.Any, 
      Unit
    ]
  ): JQuery
  def tab(behavior: setting, name: onLoad, value: Unit): js.ThisFunction3[
    /* this */ JQuery, 
    /* tabPath */ String, 
    /* parameterArray */ js.Array[js.Any], 
    /* historyEvent */ js.Any, 
    Unit
  ]
  def tab(
    behavior: setting,
    name: onRequest,
    value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
  ): JQuery
  def tab(behavior: setting, name: onRequest, value: Unit): js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
  def tab(
    behavior: setting,
    name: onVisible,
    value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
  ): JQuery
  def tab(behavior: setting, name: onVisible, value: Unit): js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
  def tab(behavior: setting, name: path, value: String): JQuery
  def tab(behavior: setting, name: path, value: Unit): `false` | String
  def tab(behavior: setting, name: path, value: `false`): JQuery
  def tab(behavior: setting, name: performance, value: Boolean): JQuery
  def tab(behavior: setting, name: performance, value: Unit): Boolean
  def tab(behavior: setting, name: selector, value: Unit): SelectorSettings
  def tab(behavior: setting, name: selector, value: SelectorSettings): JQuery
  def tab(behavior: setting, name: silent, value: Boolean): JQuery
  def tab(behavior: setting, name: silent, value: Unit): Boolean
  def tab(behavior: setting, name: templates, value: Unit): TemplatesSettings
  def tab(behavior: setting, name: templates, value: TemplatesSettings): JQuery
  def tab(behavior: setting, name: verbose, value: Boolean): JQuery
  def tab(behavior: setting, name: verbose, value: Unit): Boolean
  def tab(settings: TabSettings): JQuery
  @JSName("tab")
  var tab_Original: Tab
  /**
    * Sets cached HTML for path
    */
  @JSName("tab")
  def tab_cacheadd(behavior: `cache add`, path: String, html: String): JQuery
  /**
    * Returns cached HTML for path
    */
  @JSName("tab")
  def tab_cacheread(behavior: `cache read`, path: String): String | `false`
  /**
    * Removes cached HTML for path
    */
  @JSName("tab")
  def tab_cacheremove(behavior: `cache remove`, path: String): JQuery
  // Documentation says this exists but it does not.
  // /**
  //  * Attaches tab action to given selector. Default event if none specified is toggle
  //  */
  // (behavior: 'attach events', selector: Selector, event?: string): JQuery;
  /**
    * Changes tab to path
    */
  @JSName("tab")
  def tab_changetab(behavior: `change tab`, path: String): JQuery
  @JSName("tab")
  def tab_destroy(behavior: destroy): JQuery
  /**
    * Returns current path
    */
  @JSName("tab")
  def tab_getpath(behavior: `get path`): String
  /**
    * Returns whether tab exists
    */
  @JSName("tab")
  def tab_istab(behavior: `is tab`): Boolean
  /**
    * Sets current path to state
    */
  @JSName("tab")
  def tab_setstate(behavior: `set state`, path: String): JQuery
  @JSName("tab")
  def tab_setting(behavior: setting, value: TabSettings): JQuery
}
object JQuery {
  
  @scala.inline
  def apply(tab: Tab): JQuery = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTab(value: Tab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
