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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("search")
  var search_Original: Search = js.native
  def search(): JQuery = js.native
  def search(behavior: setting, name: `type`): String = js.native
  def search(behavior: setting, name: `type`, value: String): JQuery = js.native
  def search(behavior: setting, name: apiSettings): ApiSettings = js.native
  def search(behavior: setting, name: apiSettings, value: ApiSettings): JQuery = js.native
  def search(behavior: setting, name: cache): Boolean = js.native
  def search(behavior: setting, name: cache, value: Boolean): JQuery = js.native
  def search(behavior: setting, name: className): ClassNameSettings = js.native
  def search(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def search(behavior: setting, name: debug): Boolean = js.native
  def search(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def search(behavior: setting, name: duration): Double = js.native
  def search(behavior: setting, name: duration, value: Double): JQuery = js.native
  def search(behavior: setting, name: easing): String = js.native
  def search(behavior: setting, name: easing, value: String): JQuery = js.native
  def search(behavior: setting, name: error): ErrorSettings = js.native
  def search(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def search(behavior: setting, name: fields): FieldsSettings = js.native
  def search(behavior: setting, name: fields, value: FieldsSettings): JQuery = js.native
  def search(behavior: setting, name: hideDelay): Double = js.native
  def search(behavior: setting, name: hideDelay, value: Double): JQuery = js.native
  def search(behavior: setting, name: maxResults): Double = js.native
  def search(behavior: setting, name: maxResults, value: Double): JQuery = js.native
  def search(behavior: setting, name: metadata): MetadataSettings = js.native
  def search(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def search(behavior: setting, name: minCharacters): Double = js.native
  def search(behavior: setting, name: minCharacters, value: Double): JQuery = js.native
  def search(behavior: setting, name: name): String = js.native
  def search(behavior: setting, name: namespace): String = js.native
  def search(behavior: setting, name: namespace, value: String): JQuery = js.native
  def search(behavior: setting, name: name, value: String): JQuery = js.native
  def search(behavior: setting, name: onResults): js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit] = js.native
  def search(behavior: setting, name: onResultsAdd): js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit] = js.native
  def search(
    behavior: setting,
    name: onResultsAdd,
    value: js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]
  ): JQuery = js.native
  def search(behavior: setting, name: onResultsClose): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def search(behavior: setting, name: onResultsClose, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def search(behavior: setting, name: onResultsOpen): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def search(behavior: setting, name: onResultsOpen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def search(
    behavior: setting,
    name: onResults,
    value: js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit]
  ): JQuery = js.native
  def search(behavior: setting, name: onSearchQuery): js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit] = js.native
  def search(
    behavior: setting,
    name: onSearchQuery,
    value: js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]
  ): JQuery = js.native
  def search(behavior: setting, name: onSelect): js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit] = js.native
  def search(
    behavior: setting,
    name: onSelect,
    value: js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit]
  ): JQuery = js.native
  def search(behavior: setting, name: performance): Boolean = js.native
  def search(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def search(behavior: setting, name: regExp): RegExpSettings = js.native
  def search(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
  def search(behavior: setting, name: searchDelay): Double = js.native
  def search(behavior: setting, name: searchDelay, value: Double): JQuery = js.native
  def search(behavior: setting, name: searchFields): js.Array[String] = js.native
  def search(behavior: setting, name: searchFields, value: js.Array[String]): JQuery = js.native
  def search(behavior: setting, name: searchFullText): Boolean = js.native
  def search(behavior: setting, name: searchFullText, value: Boolean): JQuery = js.native
  def search(behavior: setting, name: selectFirstResult): Boolean = js.native
  def search(behavior: setting, name: selectFirstResult, value: Boolean): JQuery = js.native
  def search(behavior: setting, name: selector): SelectorSettings = js.native
  def search(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def search(behavior: setting, name: showNoResults): Boolean = js.native
  def search(behavior: setting, name: showNoResults, value: Boolean): JQuery = js.native
  def search(behavior: setting, name: silent): Boolean = js.native
  def search(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def search(behavior: setting, name: source): `false` | js.Any = js.native
  def search(behavior: setting, name: source, value: js.Any): JQuery = js.native
  def search(behavior: setting, name: source, value: `false`): JQuery = js.native
  def search(behavior: setting, name: templates): TemplatesSettings = js.native
  def search(behavior: setting, name: templates, value: TemplatesSettings): JQuery = js.native
  def search(behavior: setting, name: transition): String = js.native
  def search(behavior: setting, name: transition, value: String): JQuery = js.native
  def search(behavior: setting, name: verbose): Boolean = js.native
  def search(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def search(settings: SearchSettings): JQuery = js.native
  /**
    * Adds HTML to results and displays
    */
  @JSName("search")
  def search_addresults(behavior: `add results`, html: String): JQuery = js.native
  /**
    * Cancels current remote search query
    */
  @JSName("search")
  def search_cancelquery(behavior: `cancel query`): JQuery = js.native
  /**
    * Clears value from cache, if no parameter passed clears all cache
    */
  @JSName("search")
  def search_clearcache(behavior: `clear cache`): JQuery = js.native
  @JSName("search")
  def search_clearcache(behavior: `clear cache`, query: String): JQuery = js.native
  /**
    * Removes all events
    */
  @JSName("search")
  def search_destroy(behavior: destroy): JQuery = js.native
  /**
    * Displays message in search results with text, using template matching type
    */
  @JSName("search")
  def search_displaymessage(behavior: `display message`, text: String, `type`: String): JQuery = js.native
  /**
    * Generates results using parser specified by settings.template
    */
  @JSName("search")
  def search_generateresults(behavior: `generate results`, response: js.Any): JQuery = js.native
  /**
    * Returns JSON object matching searched title or id (see above)
    */
  @JSName("search")
  def search_getresult(behavior: `get result`, value: js.Any): js.Any = js.native
  /**
    * Returns current search value
    */
  @JSName("search")
  def search_getvalue(behavior: `get value`): js.Any = js.native
  /**
    * Whether has minimum characters
    */
  @JSName("search")
  def search_hasminimumcharacters(behavior: `has minimum characters`): Boolean = js.native
  /**
    * Hides results container
    */
  @JSName("search")
  def search_hideresults(behavior: `hide results`): JQuery = js.native
  @JSName("search")
  def search_hideresults(behavior: `hide results`, callback: js.Function0[Unit]): JQuery = js.native
  /**
    * Whether search results are empty
    */
  @JSName("search")
  def search_isempty(behavior: `is empty`): Boolean = js.native
  /**
    * Whether search is currently focused
    */
  @JSName("search")
  def search_isfocused(behavior: `is focused`): Boolean = js.native
  /**
    * Whether search results are visible
    */
  @JSName("search")
  def search_isvisible(behavior: `is visible`): Boolean = js.native
  /**
    * Search for value currently set in search input
    */
  @JSName("search")
  def search_query(behavior: query): JQuery = js.native
  @JSName("search")
  def search_query(behavior: query, callback: js.Function0[Unit]): JQuery = js.native
  /**
    * Reads cached results for query
    */
  @JSName("search")
  def search_readcache(behavior: `read cache`, query: String): JQuery = js.native
  /**
    * Search local object for specified query and display results
    */
  @JSName("search")
  def search_searchlocal(behavior: `search local`, query: String): JQuery = js.native
  /**
    * Search object for specified query and return results
    */
  @JSName("search")
  def search_searchobject(behavior: `search object`, query: String, `object`: js.Any, searchFields: js.Array[String]): js.Any = js.native
  /**
    * Search remote endpoint for specified query and display results
    */
  @JSName("search")
  def search_searchremote(behavior: `search remote`, query: String): JQuery = js.native
  @JSName("search")
  def search_searchremote(behavior: `search remote`, query: String, callback: js.Function0[Unit]): JQuery = js.native
  @JSName("search")
  def search_setting(behavior: setting, value: SearchSettings): JQuery = js.native
  /**
    * Sets search input to value
    */
  @JSName("search")
  def search_setvalue(behavior: `set value`, value: js.Any): JQuery = js.native
  /**
    * Shows results container
    */
  @JSName("search")
  def search_showresults(behavior: `show results`): JQuery = js.native
  @JSName("search")
  def search_showresults(behavior: `show results`, callback: js.Function0[Unit]): JQuery = js.native
  /**
    * Writes cached results for query
    */
  @JSName("search")
  def search_writecache(behavior: `write cache`, query: String): JQuery = js.native
}

