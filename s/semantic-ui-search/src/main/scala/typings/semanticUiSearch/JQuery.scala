package typings.semanticUiSearch

import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiSearch.SemanticUI.Search
import typings.semanticUiSearch.SemanticUI.Search.ClassNameSettings
import typings.semanticUiSearch.SemanticUI.Search.ErrorSettings
import typings.semanticUiSearch.SemanticUI.Search.FieldsSettings
import typings.semanticUiSearch.SemanticUI.Search.MetadataSettings
import typings.semanticUiSearch.SemanticUI.Search.RegExpSettings
import typings.semanticUiSearch.SemanticUI.Search.SelectorSettings
import typings.semanticUiSearch.SemanticUI.Search.TemplatesSettings
import typings.semanticUiSearch.SemanticUI.SearchSettings
import typings.semanticUiSearch.semanticUiSearchBooleans.`false`
import typings.semanticUiSearch.semanticUiSearchStrings.`add results`
import typings.semanticUiSearch.semanticUiSearchStrings.`cancel query`
import typings.semanticUiSearch.semanticUiSearchStrings.`clear cache`
import typings.semanticUiSearch.semanticUiSearchStrings.`display message`
import typings.semanticUiSearch.semanticUiSearchStrings.`generate results`
import typings.semanticUiSearch.semanticUiSearchStrings.`get result`
import typings.semanticUiSearch.semanticUiSearchStrings.`get value`
import typings.semanticUiSearch.semanticUiSearchStrings.`has minimum characters`
import typings.semanticUiSearch.semanticUiSearchStrings.`hide results`
import typings.semanticUiSearch.semanticUiSearchStrings.`is empty`
import typings.semanticUiSearch.semanticUiSearchStrings.`is focused`
import typings.semanticUiSearch.semanticUiSearchStrings.`is visible`
import typings.semanticUiSearch.semanticUiSearchStrings.`read cache`
import typings.semanticUiSearch.semanticUiSearchStrings.`search local`
import typings.semanticUiSearch.semanticUiSearchStrings.`search object`
import typings.semanticUiSearch.semanticUiSearchStrings.`search remote`
import typings.semanticUiSearch.semanticUiSearchStrings.`set value`
import typings.semanticUiSearch.semanticUiSearchStrings.`show results`
import typings.semanticUiSearch.semanticUiSearchStrings.`type`
import typings.semanticUiSearch.semanticUiSearchStrings.`write cache`
import typings.semanticUiSearch.semanticUiSearchStrings.apiSettings
import typings.semanticUiSearch.semanticUiSearchStrings.cache
import typings.semanticUiSearch.semanticUiSearchStrings.className
import typings.semanticUiSearch.semanticUiSearchStrings.debug
import typings.semanticUiSearch.semanticUiSearchStrings.destroy
import typings.semanticUiSearch.semanticUiSearchStrings.duration
import typings.semanticUiSearch.semanticUiSearchStrings.easing
import typings.semanticUiSearch.semanticUiSearchStrings.error
import typings.semanticUiSearch.semanticUiSearchStrings.fields
import typings.semanticUiSearch.semanticUiSearchStrings.hideDelay
import typings.semanticUiSearch.semanticUiSearchStrings.maxResults
import typings.semanticUiSearch.semanticUiSearchStrings.metadata
import typings.semanticUiSearch.semanticUiSearchStrings.minCharacters
import typings.semanticUiSearch.semanticUiSearchStrings.name
import typings.semanticUiSearch.semanticUiSearchStrings.namespace
import typings.semanticUiSearch.semanticUiSearchStrings.onResults
import typings.semanticUiSearch.semanticUiSearchStrings.onResultsAdd
import typings.semanticUiSearch.semanticUiSearchStrings.onResultsClose
import typings.semanticUiSearch.semanticUiSearchStrings.onResultsOpen
import typings.semanticUiSearch.semanticUiSearchStrings.onSearchQuery
import typings.semanticUiSearch.semanticUiSearchStrings.onSelect
import typings.semanticUiSearch.semanticUiSearchStrings.performance
import typings.semanticUiSearch.semanticUiSearchStrings.query
import typings.semanticUiSearch.semanticUiSearchStrings.regExp
import typings.semanticUiSearch.semanticUiSearchStrings.searchDelay
import typings.semanticUiSearch.semanticUiSearchStrings.searchFields
import typings.semanticUiSearch.semanticUiSearchStrings.searchFullText
import typings.semanticUiSearch.semanticUiSearchStrings.selectFirstResult
import typings.semanticUiSearch.semanticUiSearchStrings.selector
import typings.semanticUiSearch.semanticUiSearchStrings.setting
import typings.semanticUiSearch.semanticUiSearchStrings.showNoResults
import typings.semanticUiSearch.semanticUiSearchStrings.silent
import typings.semanticUiSearch.semanticUiSearchStrings.source
import typings.semanticUiSearch.semanticUiSearchStrings.templates
import typings.semanticUiSearch.semanticUiSearchStrings.transition
import typings.semanticUiSearch.semanticUiSearchStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def search(): JQuery
  def search(behavior: setting, name: `type`, value: String): JQuery
  def search(behavior: setting, name: `type`, value: Unit): String
  def search(behavior: setting, name: apiSettings, value: Unit): ApiSettings
  def search(behavior: setting, name: apiSettings, value: ApiSettings): JQuery
  def search(behavior: setting, name: cache, value: Boolean): JQuery
  def search(behavior: setting, name: cache, value: Unit): Boolean
  def search(behavior: setting, name: className, value: Unit): ClassNameSettings
  def search(behavior: setting, name: className, value: ClassNameSettings): JQuery
  def search(behavior: setting, name: debug, value: Boolean): JQuery
  def search(behavior: setting, name: debug, value: Unit): Boolean
  def search(behavior: setting, name: duration, value: Double): JQuery
  def search(behavior: setting, name: duration, value: Unit): Double
  def search(behavior: setting, name: easing, value: String): JQuery
  def search(behavior: setting, name: easing, value: Unit): String
  def search(behavior: setting, name: error, value: Unit): ErrorSettings
  def search(behavior: setting, name: error, value: ErrorSettings): JQuery
  def search(behavior: setting, name: fields, value: Unit): FieldsSettings
  def search(behavior: setting, name: fields, value: FieldsSettings): JQuery
  def search(behavior: setting, name: hideDelay, value: Double): JQuery
  def search(behavior: setting, name: hideDelay, value: Unit): Double
  def search(behavior: setting, name: maxResults, value: Double): JQuery
  def search(behavior: setting, name: maxResults, value: Unit): Double
  def search(behavior: setting, name: metadata, value: Unit): MetadataSettings
  def search(behavior: setting, name: metadata, value: MetadataSettings): JQuery
  def search(behavior: setting, name: minCharacters, value: Double): JQuery
  def search(behavior: setting, name: minCharacters, value: Unit): Double
  def search(behavior: setting, name: namespace, value: String): JQuery
  def search(behavior: setting, name: namespace, value: Unit): String
  def search(behavior: setting, name: name, value: String): JQuery
  def search(behavior: setting, name: name, value: Unit): String
  def search(
    behavior: setting,
    name: onResultsAdd,
    value: js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]
  ): JQuery
  def search(behavior: setting, name: onResultsAdd, value: Unit): js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]
  def search(behavior: setting, name: onResultsClose, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def search(behavior: setting, name: onResultsClose, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def search(behavior: setting, name: onResultsOpen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def search(behavior: setting, name: onResultsOpen, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def search(
    behavior: setting,
    name: onResults,
    value: js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit]
  ): JQuery
  def search(behavior: setting, name: onResults, value: Unit): js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit]
  def search(
    behavior: setting,
    name: onSearchQuery,
    value: js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]
  ): JQuery
  def search(behavior: setting, name: onSearchQuery, value: Unit): js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]
  def search(
    behavior: setting,
    name: onSelect,
    value: js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit]
  ): JQuery
  def search(behavior: setting, name: onSelect, value: Unit): js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit]
  def search(behavior: setting, name: performance, value: Boolean): JQuery
  def search(behavior: setting, name: performance, value: Unit): Boolean
  def search(behavior: setting, name: regExp, value: Unit): RegExpSettings
  def search(behavior: setting, name: regExp, value: RegExpSettings): JQuery
  def search(behavior: setting, name: searchDelay, value: Double): JQuery
  def search(behavior: setting, name: searchDelay, value: Unit): Double
  def search(behavior: setting, name: searchFields, value: js.Array[String]): JQuery
  def search(behavior: setting, name: searchFields, value: Unit): js.Array[String]
  def search(behavior: setting, name: searchFullText, value: Boolean): JQuery
  def search(behavior: setting, name: searchFullText, value: Unit): Boolean
  def search(behavior: setting, name: selectFirstResult, value: Boolean): JQuery
  def search(behavior: setting, name: selectFirstResult, value: Unit): Boolean
  def search(behavior: setting, name: selector, value: Unit): SelectorSettings
  def search(behavior: setting, name: selector, value: SelectorSettings): JQuery
  def search(behavior: setting, name: showNoResults, value: Boolean): JQuery
  def search(behavior: setting, name: showNoResults, value: Unit): Boolean
  def search(behavior: setting, name: silent, value: Boolean): JQuery
  def search(behavior: setting, name: silent, value: Unit): Boolean
  def search(behavior: setting, name: source, value: js.Any): JQuery
  def search(behavior: setting, name: source, value: Unit): `false` | js.Any
  def search(behavior: setting, name: source, value: `false`): JQuery
  def search(behavior: setting, name: templates, value: Unit): TemplatesSettings
  def search(behavior: setting, name: templates, value: TemplatesSettings): JQuery
  def search(behavior: setting, name: transition, value: String): JQuery
  def search(behavior: setting, name: transition, value: Unit): String
  def search(behavior: setting, name: verbose, value: Boolean): JQuery
  def search(behavior: setting, name: verbose, value: Unit): Boolean
  def search(settings: SearchSettings): JQuery
  @JSName("search")
  var search_Original: Search
  /**
    * Adds HTML to results and displays
    */
  @JSName("search")
  def search_addresults(behavior: `add results`, html: String): JQuery
  /**
    * Cancels current remote search query
    */
  @JSName("search")
  def search_cancelquery(behavior: `cancel query`): JQuery
  /**
    * Clears value from cache, if no parameter passed clears all cache
    */
  @JSName("search")
  def search_clearcache(behavior: `clear cache`): JQuery
  @JSName("search")
  def search_clearcache(behavior: `clear cache`, query: String): JQuery
  /**
    * Removes all events
    */
  @JSName("search")
  def search_destroy(behavior: destroy): JQuery
  /**
    * Displays message in search results with text, using template matching type
    */
  @JSName("search")
  def search_displaymessage(behavior: `display message`, text: String, `type`: String): JQuery
  /**
    * Generates results using parser specified by settings.template
    */
  @JSName("search")
  def search_generateresults(behavior: `generate results`, response: js.Any): JQuery
  /**
    * Returns JSON object matching searched title or id (see above)
    */
  @JSName("search")
  def search_getresult(behavior: `get result`, value: js.Any): js.Any
  /**
    * Returns current search value
    */
  @JSName("search")
  def search_getvalue(behavior: `get value`): js.Any
  /**
    * Whether has minimum characters
    */
  @JSName("search")
  def search_hasminimumcharacters(behavior: `has minimum characters`): Boolean
  /**
    * Hides results container
    */
  @JSName("search")
  def search_hideresults(behavior: `hide results`): JQuery
  @JSName("search")
  def search_hideresults(behavior: `hide results`, callback: js.Function0[Unit]): JQuery
  /**
    * Whether search results are empty
    */
  @JSName("search")
  def search_isempty(behavior: `is empty`): Boolean
  /**
    * Whether search is currently focused
    */
  @JSName("search")
  def search_isfocused(behavior: `is focused`): Boolean
  /**
    * Whether search results are visible
    */
  @JSName("search")
  def search_isvisible(behavior: `is visible`): Boolean
  /**
    * Search for value currently set in search input
    */
  @JSName("search")
  def search_query(behavior: query): JQuery
  @JSName("search")
  def search_query(behavior: query, callback: js.Function0[Unit]): JQuery
  /**
    * Reads cached results for query
    */
  @JSName("search")
  def search_readcache(behavior: `read cache`, query: String): JQuery
  /**
    * Search local object for specified query and display results
    */
  @JSName("search")
  def search_searchlocal(behavior: `search local`, query: String): JQuery
  /**
    * Search object for specified query and return results
    */
  @JSName("search")
  def search_searchobject(behavior: `search object`, query: String, `object`: js.Any, searchFields: js.Array[String]): js.Any
  /**
    * Search remote endpoint for specified query and display results
    */
  @JSName("search")
  def search_searchremote(behavior: `search remote`, query: String): JQuery
  @JSName("search")
  def search_searchremote(behavior: `search remote`, query: String, callback: js.Function0[Unit]): JQuery
  @JSName("search")
  def search_setting(behavior: setting, value: SearchSettings): JQuery
  /**
    * Sets search input to value
    */
  @JSName("search")
  def search_setvalue(behavior: `set value`, value: js.Any): JQuery
  /**
    * Shows results container
    */
  @JSName("search")
  def search_showresults(behavior: `show results`): JQuery
  @JSName("search")
  def search_showresults(behavior: `show results`, callback: js.Function0[Unit]): JQuery
  /**
    * Writes cached results for query
    */
  @JSName("search")
  def search_writecache(behavior: `write cache`, query: String): JQuery
}
object JQuery {
  
  inline def apply(search: Search): JQuery = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
