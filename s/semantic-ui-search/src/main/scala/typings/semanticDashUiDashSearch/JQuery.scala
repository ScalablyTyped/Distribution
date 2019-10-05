package typings.semanticDashUiDashSearch

import typings.semanticDashUiDashSearch.SemanticUI.Search
import typings.semanticDashUiDashSearch.SemanticUI.SearchSettings
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`add results`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`cancel query`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`clear cache`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`display message`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`generate results`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`get result`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`get value`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`has minimum characters`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`hide results`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`is empty`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`is focused`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`is visible`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`read cache`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`search local`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`search object`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`search remote`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`set value`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`show results`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`write cache`
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.destroy
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.query
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("search")
  var search_Original: Search = js.native
  def search(): JQuery = js.native
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
  @JSName("search")
  def search_setting[K /* <: String */](behavior: setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-search.SemanticUI.SearchSettings._Impl[K] */ js.Any = js.native
  @JSName("search")
  def search_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-search.SemanticUI.SearchSettings._Impl[K] */ js.Any
  ): JQuery = js.native
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

