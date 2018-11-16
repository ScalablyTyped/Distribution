package typings
package semanticDashUiDashSearchLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search extends js.Object {
  var settings: SearchSettings = js.native
  def apply(): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Adds HTML to results and displays
           */
  def apply(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`add results`,
    html: java.lang.String
  ): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Cancels current remote search query
           */
  def apply(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`cancel query`): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Clears value from cache, if no parameter passed clears all cache
           */
  def apply(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`clear cache`): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Clears value from cache, if no parameter passed clears all cache
           */
  def apply(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`clear cache`,
    query: java.lang.String
  ): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Displays message in search results with text, using template matching type
           */
  def apply(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`display message`,
    text: java.lang.String,
    `type`: java.lang.String
  ): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Generates results using parser specified by settings.template
           */
  def apply(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`generate results`,
    response: js.Any
  ): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Returns JSON object matching searched title or id (see above)
           */
  def apply(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`get result`,
    value: js.Any
  ): js.Any = js.native
  /**
           * Returns current search value
           */
  def apply(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`get value`): js.Any = js.native
  /**
           * Whether has minimum characters
           */
  def apply(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`has minimum characters`): scala.Boolean = js.native
  /**
           * Hides results container
           */
  def apply(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`hide results`): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Hides results container
           */
  def apply(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`hide results`,
    callback: js.Function0[scala.Unit]
  ): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Whether search results are empty
           */
  def apply(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`is empty`): scala.Boolean = js.native
  /**
           * Whether search is currently focused
           */
  def apply(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`is focused`): scala.Boolean = js.native
  /**
           * Whether search results are visible
           */
  def apply(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`is visible`): scala.Boolean = js.native
  /**
           * Reads cached results for query
           */
  def apply(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`read cache`,
    query: java.lang.String
  ): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Search local object for specified query and display results
           */
  def apply(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`search local`,
    query: java.lang.String
  ): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Search object for specified query and return results
           */
  def apply(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`search object`,
    query: java.lang.String,
    `object`: js.Any,
    searchFields: js.Array[java.lang.String]
  ): js.Any = js.native
  /**
           * Search remote endpoint for specified query and display results
           */
  def apply(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`search remote`,
    query: java.lang.String
  ): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Search remote endpoint for specified query and display results
           */
  def apply(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`search remote`,
    query: java.lang.String,
    callback: js.Function0[scala.Unit]
  ): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Sets search input to value
           */
  def apply(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`set value`,
    value: js.Any
  ): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Shows results container
           */
  def apply(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`show results`): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Shows results container
           */
  def apply(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`show results`,
    callback: js.Function0[scala.Unit]
  ): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Writes cached results for query
           */
  def apply(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.`write cache`,
    query: java.lang.String
  ): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Removes all events
           */
  def apply(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.destroy): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Search for value currently set in search input
           */
  def apply(behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.query): semanticDashUiDashSearchLib.JQuery = js.native
  /**
           * Search for value currently set in search input
           */
  def apply(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.query,
    callback: js.Function0[scala.Unit]
  ): semanticDashUiDashSearchLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.setting,
    value: SearchSettings
  ): semanticDashUiDashSearchLib.JQuery = js.native
  def apply(settings: SearchSettings): semanticDashUiDashSearchLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.setting, name: K): js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibStrings.setting,
    name: K,
    value: js.Any
  ): semanticDashUiDashSearchLib.JQuery = js.native
}

