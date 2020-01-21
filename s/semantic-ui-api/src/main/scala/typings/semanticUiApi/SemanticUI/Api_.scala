package typings.semanticUiApi.SemanticUI

import typings.jquery.JQueryDeferred
import typings.semanticUiApi.JQuery
import typings.semanticUiApi.semanticUiApiBooleans.`false`
import typings.semanticUiApi.semanticUiApiStrings.`add url data`
import typings.semanticUiApi.semanticUiApiStrings.`create cache`
import typings.semanticUiApi.semanticUiApiStrings.`get event`
import typings.semanticUiApi.semanticUiApiStrings.`get request`
import typings.semanticUiApi.semanticUiApiStrings.`get url encoded value`
import typings.semanticUiApi.semanticUiApiStrings.`is disabled`
import typings.semanticUiApi.semanticUiApiStrings.`is loading`
import typings.semanticUiApi.semanticUiApiStrings.`is mocked`
import typings.semanticUiApi.semanticUiApiStrings.`read cached response`
import typings.semanticUiApi.semanticUiApiStrings.`remove error`
import typings.semanticUiApi.semanticUiApiStrings.`remove loading`
import typings.semanticUiApi.semanticUiApiStrings.`set error`
import typings.semanticUiApi.semanticUiApiStrings.`set loading`
import typings.semanticUiApi.semanticUiApiStrings.`was cancelled`
import typings.semanticUiApi.semanticUiApiStrings.`was complete`
import typings.semanticUiApi.semanticUiApiStrings.`was failure`
import typings.semanticUiApi.semanticUiApiStrings.`was successful`
import typings.semanticUiApi.semanticUiApiStrings.`write cached response`
import typings.semanticUiApi.semanticUiApiStrings.abort
import typings.semanticUiApi.semanticUiApiStrings.destroy
import typings.semanticUiApi.semanticUiApiStrings.query
import typings.semanticUiApi.semanticUiApiStrings.reset
import typings.semanticUiApi.semanticUiApiStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Api_ extends js.Object {
  var settings: ApiSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Adds data to existing templated url and returns full url string
    */
  def apply(behavior: `add url data`, url: String, data: js.Any): String = js.native
  /**
    * Creates new cache, removing all locally cached URLs
    */
  def apply(behavior: `create cache`): JQuery = js.native
  /**
    * Gets event that API request will occur on
    */
  def apply(behavior: `get event`): String = js.native
  /**
    * Gets promise for current API request
    */
  def apply(behavior: `get request`): JQueryDeferred[_] | `false` = js.native
  /**
    * Returns encodeURIComponent value only if value passed is not already encoded
    */
  def apply(behavior: `get url encoded value`, value: js.Any): String = js.native
  /**
    * Returns whether element is disabled
    */
  def apply(behavior: `is disabled`): Boolean = js.native
  /**
    * Returns whether element is loading
    */
  def apply(behavior: `is loading`): Boolean = js.native
  /**
    * Returns whether element response is mocked
    */
  def apply(behavior: `is mocked`): Boolean = js.native
  /**
    * Reads a locally cached response for a URL
    */
  def apply(behavior: `read cached response`, url: String): js.Any = js.native
  /**
    * Removes error state to element
    */
  def apply(behavior: `remove error`): JQuery = js.native
  /**
    * Removes loading state to element
    */
  def apply(behavior: `remove loading`): JQuery = js.native
  /**
    * Sets error state to element
    */
  def apply(behavior: `set error`): JQuery = js.native
  /**
    * Sets loading state to element
    */
  def apply(behavior: `set loading`): JQuery = js.native
  /**
    * Returns whether last request was cancelled
    */
  def apply(behavior: `was cancelled`): Boolean = js.native
  /**
    * Returns whether last request was completed
    */
  def apply(behavior: `was complete`): Boolean = js.native
  /**
    * Returns whether last request was failure
    */
  def apply(behavior: `was failure`): Boolean = js.native
  /**
    * Returns whether last request was successful
    */
  def apply(behavior: `was successful`): Boolean = js.native
  /**
    * Writes a cached response for a URL
    */
  def apply(behavior: `write cached response`, url: String, response: js.Any): JQuery = js.native
  /**
    * Aborts current API request
    */
  def apply(behavior: abort): JQuery = js.native
  /**
    * Removes API settings from the page and all events
    */
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Execute query using existing API settings
    */
  def apply(behavior: query): JQuery = js.native
  /**
    * Removes loading and error state from element
    */
  def apply(behavior: reset): JQuery = js.native
  def apply(behavior: setting, value: ApiSettings): JQuery = js.native
  def apply(settings: ApiSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

