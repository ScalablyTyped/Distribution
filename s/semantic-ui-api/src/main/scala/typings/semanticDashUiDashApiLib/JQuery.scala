package typings
package semanticDashUiDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("api")
  var api_Original: semanticDashUiDashApiLib.SemanticUINs.Api = js.native
  def api(): JQuery = js.native
  def api(settings: semanticDashUiDashApiLib.SemanticUINs.ApiSettings): JQuery = js.native
  /**
           * Aborts current API request
           */
  @JSName("api")
  def api_abort(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.abort): JQuery = js.native
  /**
           * Adds data to existing templated url and returns full url string
           */
  @JSName("api")
  def `api_add url data`(
    behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`add url data`,
    url: java.lang.String,
    data: js.Any
  ): java.lang.String = js.native
  /**
           * Creates new cache, removing all locally cached URLs
           */
  @JSName("api")
  def `api_create cache`(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`create cache`): JQuery = js.native
  /**
           * Removes API settings from the page and all events
           */
  @JSName("api")
  def api_destroy(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.destroy): JQuery = js.native
  /**
           * Gets event that API request will occur on
           */
  @JSName("api")
  def `api_get event`(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`get event`): java.lang.String = js.native
  /**
           * Gets promise for current API request
           */
  @JSName("api")
  def `api_get request`(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`get request`): jqueryLib.JQueryDeferred[_] | semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`false` = js.native
  /**
           * Returns encodeURIComponent value only if value passed is not already encoded
           */
  @JSName("api")
  def `api_get url encoded value`(
    behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`get url encoded value`,
    value: js.Any
  ): java.lang.String = js.native
  /**
           * Returns whether element is disabled
           */
  @JSName("api")
  def `api_is disabled`(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`is disabled`): scala.Boolean = js.native
  /**
           * Returns whether element is loading
           */
  @JSName("api")
  def `api_is loading`(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`is loading`): scala.Boolean = js.native
  /**
           * Returns whether element response is mocked
           */
  @JSName("api")
  def `api_is mocked`(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`is mocked`): scala.Boolean = js.native
  /**
           * Execute query using existing API settings
           */
  @JSName("api")
  def api_query(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.query): JQuery = js.native
  /**
           * Reads a locally cached response for a URL
           */
  @JSName("api")
  def `api_read cached response`(
    behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`read cached response`,
    url: java.lang.String
  ): js.Any = js.native
  /**
           * Removes error state to element
           */
  @JSName("api")
  def `api_remove error`(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`remove error`): JQuery = js.native
  /**
           * Removes loading state to element
           */
  @JSName("api")
  def `api_remove loading`(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`remove loading`): JQuery = js.native
  /**
           * Removes loading and error state from element
           */
  @JSName("api")
  def api_reset(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.reset): JQuery = js.native
  /**
           * Sets error state to element
           */
  @JSName("api")
  def `api_set error`(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`set error`): JQuery = js.native
  /**
           * Sets loading state to element
           */
  @JSName("api")
  def `api_set loading`(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`set loading`): JQuery = js.native
  @JSName("api")
  def api_setting(
    behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.setting,
    value: semanticDashUiDashApiLib.SemanticUINs.ApiSettings
  ): JQuery = js.native
  @JSName("api")
  def api_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.setting, name: K): js.Any = js.native
  @JSName("api")
  def api_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.setting, name: K, value: js.Any): JQuery = js.native
  /**
           * Returns whether last request was cancelled
           */
  @JSName("api")
  def `api_was cancelled`(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`was cancelled`): scala.Boolean = js.native
  /**
           * Returns whether last request was completed
           */
  @JSName("api")
  def `api_was complete`(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`was complete`): scala.Boolean = js.native
  /**
           * Returns whether last request was failure
           */
  @JSName("api")
  def `api_was failure`(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`was failure`): scala.Boolean = js.native
  /**
           * Returns whether last request was successful
           */
  @JSName("api")
  def `api_was successful`(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`was successful`): scala.Boolean = js.native
  /**
           * Writes a cached response for a URL
           */
  @JSName("api")
  def `api_write cached response`(
    behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`write cached response`,
    url: java.lang.String,
    response: js.Any
  ): JQuery = js.native
}

