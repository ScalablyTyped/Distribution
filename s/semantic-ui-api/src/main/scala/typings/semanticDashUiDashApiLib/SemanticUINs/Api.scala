package typings
package semanticDashUiDashApiLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Api extends js.Object {
  var settings: ApiSettings = js.native
  def apply(): semanticDashUiDashApiLib.JQuery = js.native
  /**
    * Adds data to existing templated url and returns full url string
    */
  def apply(
    behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`add url data`,
    url: java.lang.String,
    data: js.Any
  ): java.lang.String = js.native
  /**
    * Creates new cache, removing all locally cached URLs
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`create cache`): semanticDashUiDashApiLib.JQuery = js.native
  /**
    * Gets event that API request will occur on
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`get event`): java.lang.String = js.native
  /**
    * Gets promise for current API request
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`get request`): jqueryLib.JQueryDeferred[_] | semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`false` = js.native
  /**
    * Returns encodeURIComponent value only if value passed is not already encoded
    */
  def apply(
    behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`get url encoded value`,
    value: js.Any
  ): java.lang.String = js.native
  /**
    * Returns whether element is disabled
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`is disabled`): scala.Boolean = js.native
  /**
    * Returns whether element is loading
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`is loading`): scala.Boolean = js.native
  /**
    * Returns whether element response is mocked
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`is mocked`): scala.Boolean = js.native
  /**
    * Reads a locally cached response for a URL
    */
  def apply(
    behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`read cached response`,
    url: java.lang.String
  ): js.Any = js.native
  /**
    * Removes error state to element
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`remove error`): semanticDashUiDashApiLib.JQuery = js.native
  /**
    * Removes loading state to element
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`remove loading`): semanticDashUiDashApiLib.JQuery = js.native
  /**
    * Sets error state to element
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`set error`): semanticDashUiDashApiLib.JQuery = js.native
  /**
    * Sets loading state to element
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`set loading`): semanticDashUiDashApiLib.JQuery = js.native
  /**
    * Returns whether last request was cancelled
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`was cancelled`): scala.Boolean = js.native
  /**
    * Returns whether last request was completed
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`was complete`): scala.Boolean = js.native
  /**
    * Returns whether last request was failure
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`was failure`): scala.Boolean = js.native
  /**
    * Returns whether last request was successful
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`was successful`): scala.Boolean = js.native
  /**
    * Writes a cached response for a URL
    */
  def apply(
    behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.`write cached response`,
    url: java.lang.String,
    response: js.Any
  ): semanticDashUiDashApiLib.JQuery = js.native
  /**
    * Aborts current API request
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.abort): semanticDashUiDashApiLib.JQuery = js.native
  /**
    * Removes API settings from the page and all events
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.destroy): semanticDashUiDashApiLib.JQuery = js.native
  /**
    * Execute query using existing API settings
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.query): semanticDashUiDashApiLib.JQuery = js.native
  /**
    * Removes loading and error state from element
    */
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.reset): semanticDashUiDashApiLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.setting, value: ApiSettings): semanticDashUiDashApiLib.JQuery = js.native
  def apply(settings: ApiSettings): semanticDashUiDashApiLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl[K] */ js.Any
  ): semanticDashUiDashApiLib.JQuery = js.native
}

