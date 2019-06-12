package typings
package semanticDashUiDashSearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("search")
  var search_Original: semanticDashUiDashSearchLib.SemanticUINs.Search = js.native
  def search(): JQuery = js.native
  def search(settings: semanticDashUiDashSearchLib.SemanticUINs.SearchSettings): JQuery = js.native
  /**
    * Adds HTML to results and displays
    */
  @JSName("search")
  def search_addresults(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`add results`,
    html: java.lang.String
  ): JQuery = js.native
  /**
    * Cancels current remote search query
    */
  @JSName("search")
  def search_cancelquery(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`cancel query`): JQuery = js.native
  /**
    * Clears value from cache, if no parameter passed clears all cache
    */
  @JSName("search")
  def search_clearcache(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`clear cache`): JQuery = js.native
  @JSName("search")
  def search_clearcache(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`clear cache`,
    query: java.lang.String
  ): JQuery = js.native
  /**
    * Removes all events
    */
  @JSName("search")
  def search_destroy(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.destroy): JQuery = js.native
  /**
    * Displays message in search results with text, using template matching type
    */
  @JSName("search")
  def search_displaymessage(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`display message`,
    text: java.lang.String,
    `type`: java.lang.String
  ): JQuery = js.native
  /**
    * Generates results using parser specified by settings.template
    */
  @JSName("search")
  def search_generateresults(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`generate results`,
    response: js.Any
  ): JQuery = js.native
  /**
    * Returns JSON object matching searched title or id (see above)
    */
  @JSName("search")
  def search_getresult(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`get result`,
    value: js.Any
  ): js.Any = js.native
  /**
    * Returns current search value
    */
  @JSName("search")
  def search_getvalue(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`get value`): js.Any = js.native
  /**
    * Whether has minimum characters
    */
  @JSName("search")
  def search_hasminimumcharacters(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`has minimum characters`): scala.Boolean = js.native
  /**
    * Hides results container
    */
  @JSName("search")
  def search_hideresults(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`hide results`): JQuery = js.native
  @JSName("search")
  def search_hideresults(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`hide results`,
    callback: js.Function0[scala.Unit]
  ): JQuery = js.native
  /**
    * Whether search results are empty
    */
  @JSName("search")
  def search_isempty(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`is empty`): scala.Boolean = js.native
  /**
    * Whether search is currently focused
    */
  @JSName("search")
  def search_isfocused(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`is focused`): scala.Boolean = js.native
  /**
    * Whether search results are visible
    */
  @JSName("search")
  def search_isvisible(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`is visible`): scala.Boolean = js.native
  /**
    * Search for value currently set in search input
    */
  @JSName("search")
  def search_query(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.query): JQuery = js.native
  @JSName("search")
  def search_query(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.query,
    callback: js.Function0[scala.Unit]
  ): JQuery = js.native
  /**
    * Reads cached results for query
    */
  @JSName("search")
  def search_readcache(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`read cache`,
    query: java.lang.String
  ): JQuery = js.native
  /**
    * Search local object for specified query and display results
    */
  @JSName("search")
  def search_searchlocal(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`search local`,
    query: java.lang.String
  ): JQuery = js.native
  /**
    * Search object for specified query and return results
    */
  @JSName("search")
  def search_searchobject(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`search object`,
    query: java.lang.String,
    `object`: js.Any,
    searchFields: js.Array[java.lang.String]
  ): js.Any = js.native
  /**
    * Search remote endpoint for specified query and display results
    */
  @JSName("search")
  def search_searchremote(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`search remote`,
    query: java.lang.String
  ): JQuery = js.native
  @JSName("search")
  def search_searchremote(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`search remote`,
    query: java.lang.String,
    callback: js.Function0[scala.Unit]
  ): JQuery = js.native
  @JSName("search")
  def search_setting(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.setting,
    value: semanticDashUiDashSearchLib.SemanticUINs.SearchSettings
  ): JQuery = js.native
  @JSName("search")
  def search_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-search.SemanticUI.SearchSettings._Impl[K] */ js.Any = js.native
  @JSName("search")
  def search_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-search.SemanticUI.SearchSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Sets search input to value
    */
  @JSName("search")
  def search_setvalue(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`set value`,
    value: js.Any
  ): JQuery = js.native
  /**
    * Shows results container
    */
  @JSName("search")
  def search_showresults(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`show results`): JQuery = js.native
  @JSName("search")
  def search_showresults(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`show results`,
    callback: js.Function0[scala.Unit]
  ): JQuery = js.native
  /**
    * Writes cached results for query
    */
  @JSName("search")
  def search_writecache(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`write cache`,
    query: java.lang.String
  ): JQuery = js.native
}

