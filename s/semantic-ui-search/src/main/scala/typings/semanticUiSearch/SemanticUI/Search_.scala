package typings.semanticUiSearch.SemanticUI

import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiSearch.JQuery
import typings.semanticUiSearch.SemanticUI.Search.ClassNameSettings
import typings.semanticUiSearch.SemanticUI.Search.ErrorSettings
import typings.semanticUiSearch.SemanticUI.Search.FieldsSettings
import typings.semanticUiSearch.SemanticUI.Search.MetadataSettings
import typings.semanticUiSearch.SemanticUI.Search.RegExpSettings
import typings.semanticUiSearch.SemanticUI.Search.SelectorSettings
import typings.semanticUiSearch.SemanticUI.Search.TemplatesSettings
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
  def apply(behavior: setting, name: `type`, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: `type`, value: String): JQuery = js.native
  def apply(behavior: setting, name: apiSettings, value: ApiSettings): JQuery = js.native
  def apply(behavior: setting, name: cache, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: cache, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: easing, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: easing, value: String): JQuery = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: fields, value: js.UndefOr[scala.Nothing]): FieldsSettings = js.native
  def apply(behavior: setting, name: hideDelay, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: hideDelay, value: Double): JQuery = js.native
  def apply(behavior: setting, name: maxResults, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: maxResults, value: Double): JQuery = js.native
  def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def apply(behavior: setting, name: minCharacters, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: minCharacters, value: Double): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onResultsAdd, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit] = js.native
  def apply(
    behavior: setting,
    name: onResultsAdd,
    value: js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onResultsClose, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onResultsClose, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onResultsOpen, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onResultsOpen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onResults, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit] = js.native
  def apply(
    behavior: setting,
    name: onResults,
    value: js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onSearchQuery, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit] = js.native
  def apply(
    behavior: setting,
    name: onSearchQuery,
    value: js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onSelect, value: js.UndefOr[scala.Nothing]): js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit] = js.native
  def apply(
    behavior: setting,
    name: onSelect,
    value: js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: regExp, value: js.UndefOr[scala.Nothing]): RegExpSettings = js.native
  def apply(behavior: setting, name: searchDelay, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: searchDelay, value: Double): JQuery = js.native
  def apply(behavior: setting, name: searchFields, value: js.UndefOr[scala.Nothing]): js.Array[String] = js.native
  def apply(behavior: setting, name: searchFields, value: js.Array[String]): JQuery = js.native
  def apply(behavior: setting, name: searchFullText, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: searchFullText, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selectFirstResult, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: selectFirstResult, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  def apply(behavior: setting, name: showNoResults, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: showNoResults, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: source, value: js.UndefOr[scala.Nothing]): `false` | js.Any = js.native
  def apply(behavior: setting, name: source, value: js.Any): JQuery = js.native
  def apply(behavior: setting, name: source, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: templates, value: js.UndefOr[scala.Nothing]): TemplatesSettings = js.native
  def apply(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: transition, value: String): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: SearchSettings): JQuery = js.native
  def apply(settings: SearchSettings): JQuery = js.native
}

