package typings.semanticUiSearch.SemanticUI

import typings.semanticUiSearch.JQuery
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
import typings.semanticUiSearch.semanticUiSearchStrings.`write cache`
import typings.semanticUiSearch.semanticUiSearchStrings.destroy
import typings.semanticUiSearch.semanticUiSearchStrings.query
import typings.semanticUiSearch.semanticUiSearchStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search_ extends js.Object {
  var settings: SearchSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Adds HTML to results and displays
    */
  def apply(behavior: `add results`, html: String): JQuery = js.native
  /**
    * Cancels current remote search query
    */
  def apply(behavior: `cancel query`): JQuery = js.native
  /**
    * Clears value from cache, if no parameter passed clears all cache
    */
  def apply(behavior: `clear cache`): JQuery = js.native
  def apply(behavior: `clear cache`, query: String): JQuery = js.native
  /**
    * Displays message in search results with text, using template matching type
    */
  def apply(behavior: `display message`, text: String, `type`: String): JQuery = js.native
  /**
    * Generates results using parser specified by settings.template
    */
  def apply(behavior: `generate results`, response: js.Any): JQuery = js.native
  /**
    * Returns JSON object matching searched title or id (see above)
    */
  def apply(behavior: `get result`, value: js.Any): js.Any = js.native
  /**
    * Returns current search value
    */
  def apply(behavior: `get value`): js.Any = js.native
  /**
    * Whether has minimum characters
    */
  def apply(behavior: `has minimum characters`): Boolean = js.native
  /**
    * Hides results container
    */
  def apply(behavior: `hide results`): JQuery = js.native
  def apply(behavior: `hide results`, callback: js.Function0[Unit]): JQuery = js.native
  /**
    * Whether search results are empty
    */
  def apply(behavior: `is empty`): Boolean = js.native
  /**
    * Whether search is currently focused
    */
  def apply(behavior: `is focused`): Boolean = js.native
  /**
    * Whether search results are visible
    */
  def apply(behavior: `is visible`): Boolean = js.native
  /**
    * Reads cached results for query
    */
  def apply(behavior: `read cache`, query: String): JQuery = js.native
  /**
    * Search local object for specified query and display results
    */
  def apply(behavior: `search local`, query: String): JQuery = js.native
  /**
    * Search object for specified query and return results
    */
  def apply(behavior: `search object`, query: String, `object`: js.Any, searchFields: js.Array[String]): js.Any = js.native
  /**
    * Search remote endpoint for specified query and display results
    */
  def apply(behavior: `search remote`, query: String): JQuery = js.native
  def apply(behavior: `search remote`, query: String, callback: js.Function0[Unit]): JQuery = js.native
  /**
    * Sets search input to value
    */
  def apply(behavior: `set value`, value: js.Any): JQuery = js.native
  /**
    * Shows results container
    */
  def apply(behavior: `show results`): JQuery = js.native
  def apply(behavior: `show results`, callback: js.Function0[Unit]): JQuery = js.native
  /**
    * Writes cached results for query
    */
  def apply(behavior: `write cache`, query: String): JQuery = js.native
  /**
    * Removes all events
    */
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Search for value currently set in search input
    */
  def apply(behavior: query): JQuery = js.native
  def apply(behavior: query, callback: js.Function0[Unit]): JQuery = js.native
  def apply(behavior: setting, value: SearchSettings): JQuery = js.native
  def apply(settings: SearchSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-search.SemanticUI.SearchSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-search.SemanticUI.SearchSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

