package typings.semanticUiTab.SemanticUI

import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiTab.JQuery
import typings.semanticUiTab.SemanticUI.Tab.ClassNameSettings
import typings.semanticUiTab.SemanticUI.Tab.ErrorSettings
import typings.semanticUiTab.SemanticUI.Tab.MetadataSettings
import typings.semanticUiTab.SemanticUI.Tab.SelectorSettings
import typings.semanticUiTab.SemanticUI.Tab.TemplatesSettings
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tab_ extends js.Object {
  
  def apply(): JQuery = js.native
  /**
    * Sets cached HTML for path
    */
  def apply(behavior: `cache add`, path: String, html: String): JQuery = js.native
  /**
    * Returns cached HTML for path
    */
  def apply(behavior: `cache read`, path: String): String | `false` = js.native
  /**
    * Removes cached HTML for path
    */
  def apply(behavior: `cache remove`, path: String): JQuery = js.native
  // Documentation says this exists but it does not.
  // /**
  //  * Attaches tab action to given selector. Default event if none specified is toggle
  //  */
  // (behavior: 'attach events', selector: Selector, event?: string): JQuery;
  /**
    * Changes tab to path
    */
  def apply(behavior: `change tab`, path: String): JQuery = js.native
  /**
    * Returns current path
    */
  def apply(behavior: `get path`): String = js.native
  /**
    * Returns whether tab exists
    */
  def apply(behavior: `is tab`): Boolean = js.native
  /**
    * Sets current path to state
    */
  def apply(behavior: `set state`, path: String): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: setting, name: alwaysRefresh, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: alwaysRefresh, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: apiSettings, value: js.UndefOr[scala.Nothing]): ApiSettings = js.native
  def apply(behavior: setting, name: auto, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: auto, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: cacheType, value: js.UndefOr[scala.Nothing]): response | DOM | html = js.native
  def apply(behavior: setting, name: cacheType, value: DOM): JQuery = js.native
  def apply(behavior: setting, name: cacheType, value: html): JQuery = js.native
  def apply(behavior: setting, name: cacheType, value: response): JQuery = js.native
  def apply(behavior: setting, name: cache, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: cache, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: childrenOnly, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: childrenOnly, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  def apply(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): `false` | String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: context, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: deactivate, value: js.UndefOr[scala.Nothing]): siblings | all = js.native
  def apply(behavior: setting, name: deactivate, value: all): JQuery = js.native
  def apply(behavior: setting, name: deactivate, value: siblings): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def apply(behavior: setting, name: evaluateScripts, value: js.UndefOr[scala.Nothing]): once | Boolean = js.native
  def apply(behavior: setting, name: evaluateScripts, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: evaluateScripts, value: once): JQuery = js.native
  def apply(behavior: setting, name: historyType, value: js.UndefOr[scala.Nothing]): hash | state = js.native
  def apply(behavior: setting, name: historyType, value: hash): JQuery = js.native
  def apply(behavior: setting, name: historyType, value: state): JQuery = js.native
  def apply(behavior: setting, name: history, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: history, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: ignoreFirstLoad, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: ignoreFirstLoad, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: loadOnce, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: loadOnce, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: maxDepth, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: maxDepth, value: Double): JQuery = js.native
  def apply(behavior: setting, name: metadata, value: js.UndefOr[scala.Nothing]): MetadataSettings = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onFirstLoad, value: js.UndefOr[scala.Nothing]): js.ThisFunction3[
    /* this */ JQuery, 
    /* tabPath */ String, 
    /* parameterArray */ js.Array[_], 
    /* historyEvent */ js.Any, 
    Unit
  ] = js.native
  def apply(
    behavior: setting,
    name: onFirstLoad,
    value: js.ThisFunction3[
      /* this */ JQuery, 
      /* tabPath */ String, 
      /* parameterArray */ js.Array[_], 
      /* historyEvent */ js.Any, 
      Unit
    ]
  ): JQuery = js.native
  def apply(behavior: setting, name: onLoad, value: js.UndefOr[scala.Nothing]): js.ThisFunction3[
    /* this */ JQuery, 
    /* tabPath */ String, 
    /* parameterArray */ js.Array[_], 
    /* historyEvent */ js.Any, 
    Unit
  ] = js.native
  def apply(
    behavior: setting,
    name: onLoad,
    value: js.ThisFunction3[
      /* this */ JQuery, 
      /* tabPath */ String, 
      /* parameterArray */ js.Array[_], 
      /* historyEvent */ js.Any, 
      Unit
    ]
  ): JQuery = js.native
  def apply(behavior: setting, name: onRequest, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit] = js.native
  def apply(
    behavior: setting,
    name: onRequest,
    value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onVisible, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit] = js.native
  def apply(
    behavior: setting,
    name: onVisible,
    value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: path, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def apply(behavior: setting, name: path, value: String): JQuery = js.native
  def apply(behavior: setting, name: path, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: templates, value: js.UndefOr[scala.Nothing]): TemplatesSettings = js.native
  def apply(behavior: setting, name: templates, value: TemplatesSettings): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: TabSettings): JQuery = js.native
  def apply(settings: TabSettings): JQuery = js.native
  
  var settings: TabSettings = js.native
}
