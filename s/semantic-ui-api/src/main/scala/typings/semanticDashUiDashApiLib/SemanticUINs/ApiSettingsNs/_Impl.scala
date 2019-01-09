package typings
package semanticDashUiDashApiLib.SemanticUINs.ApiSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  // endregion
  // region Request Settings
  /**
    * Named API action for query, originally specified in $.fn.settings.api
    */
  var action: java.lang.String | semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`false`
  var api: /* import warning: ImportType.apply Failed type conversion: {[action: string] : string, [action: string] : string} */ js.Any
  /**
    * Can be set to 'local' to cache successful returned AJAX responses when using a JSON API.
    * This helps avoid server round trips when API endpoints will return the same results when accessed repeatedly.
    * Setting to false, will add cache busting parameters to the URL.
    *
    * @default true
    */
  var cache: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.local | scala.Boolean
  /**
    * Class names used to determine element state
    */
  var className: semanticDashUiDashApiLib.SemanticUINs.ApiNs.ClassNameSettings
  /**
    * POST/GET Data to Send with Request
    */
  var data: js.Any
  /**
    * Expected data type of response
    */
  var dataType: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.xml | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.json | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.jsonp | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.script | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.html | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.text
  /**
    * Debug output to console
    */
  var debug: scala.Boolean
  /**
    * Whether to automatically include default data like {value} and {text}
    *
    * @default true
    */
  var defaultData: scala.Boolean
  /**
    * Whether to encode parameters with encodeURIComponent before adding into url string
    *
    * @default true
    */
  var encodeParameters: scala.Boolean
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashApiLib.SemanticUINs.ApiNs.ErrorSettings
  /**
    * Setting to true, will not remove error.
    * Setting to a duration in milliseconds to show error state after request error.
    *
    * @default 2000
    */
  var errorDuration: semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`true` | scala.Double
  /**
    * The default auto will automatically remove error state after error duration, unless the element is a form
    *
    * @default 'auto'
    */
  var hideError: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.auto | scala.Boolean
  /**
    * Whether an API request can occur while another request is still pending
    *
    * @default false
    */
  var interruptRequests: scala.Boolean
  /**
    * Minimum duration to show loading indication
    *
    * @default 0
    */
  var loadingDuration: scala.Double
  /**
    * Metadata used to store XHR and response promise
    */
  var metadata: semanticDashUiDashApiLib.SemanticUINs.ApiNs.MetadataSettings
  /**
    * Method for transmitting request to server
    */
  var method: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.post | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.get | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.put | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.delete | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.head | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.options | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.patch
  /**
    * @see response
    */
  var mockResponse: js.Any | semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`false`
  /**
    * @see responseAsync
    */
  var mockResponseAsync: (js.Function2[
    /* settings */ semanticDashUiDashApiLib.SemanticUINs.ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, scala.Unit], 
    scala.Unit
  ]) | semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`false`
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: java.lang.String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: java.lang.String
  // region Behavior
  /**
    * When API event should occur
    *
    * @default 'auto'
    */
  var on: java.lang.String
  /**
    * Show console.table output with performance metrics
    */
  var performance: scala.Boolean
  // endregion
  // region DOM Settings
  /**
    * Regular expressions used for template matching
    */
  var regExp: semanticDashUiDashApiLib.SemanticUINs.ApiNs.RegExpSettings
  /**
    * Can be set to a Javascript object which will be returned automatically instead of requesting JSON from server
    */
  var response: js.Any | semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`false`
  /**
    * When specified, this function can be used to retrieve content from a server and return it asynchronously instead of a standard AJAX call.
    * The callback function should return the server response.
    *
    * @default false
    */
  var responseAsync: (js.Function2[
    /* settings */ semanticDashUiDashApiLib.SemanticUINs.ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, scala.Unit], 
    scala.Unit
  ]) | semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`false`
  /**
    * Selectors used to find parts of a module
    */
  var selector: semanticDashUiDashApiLib.SemanticUINs.ApiNs.SelectorSettings
  /**
    * Whether to serialize closest form and include in request
    *
    * @default false
    */
  var serializeForm: scala.Boolean
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: scala.Boolean
  /**
    * UI state will be applied to this element, defaults to triggering element.
    */
  var stateContext: java.lang.String | semanticDashUiDashApiLib.JQuery
  /**
    * How long to wait when a request is made before triggering request, useful for rate limiting oninput
    *
    * @default 0
    */
  var throttle: scala.Double
  /**
    * When set to false will not delay the first request made, when no others are queued
    *
    * @default true
    */
  var throttleFirstRequest: scala.Boolean
  /**
    * Templated URL for query, will override specified action
    */
  var url: java.lang.String | semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`false`
  /**
    * Variables to use for replacement
    */
  var urlData: js.Any | semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`false`
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: scala.Boolean
  // endregion
  // region Callbacks
  /**
    * Allows modifying settings before request, or cancelling request
    */
  def beforeSend(settings: semanticDashUiDashApiLib.SemanticUINs.ApiSettings): js.Any
  /**
    * Allows modifying XHR object for request
    */
  def beforeXHR(xhrObject: jqueryLib.JQueryNs.jqXHR[_]): js.Any
  /**
    * Callback on abort caused by user clicking a link or manually cancelling request.
    */
  def onAbort(
    errorMessage: java.lang.String,
    element: semanticDashUiDashApiLib.JQuery,
    xhr: jqueryLib.JQueryNs.jqXHR[_]
  ): scala.Unit
  /**
    * Callback on request complete regardless of conditions
    */
  def onComplete(response: js.Any, element: semanticDashUiDashApiLib.JQuery, xhr: jqueryLib.JQueryNs.jqXHR[_]): scala.Unit
  /**
    * Callback on server error from returned status code, or XHR failure.
    */
  def onError(
    errorMessage: java.lang.String,
    element: semanticDashUiDashApiLib.JQuery,
    xhr: jqueryLib.JQueryNs.jqXHR[_]
  ): scala.Unit
  /**
    * Callback on failed response, or JSON response that fails successTest
    */
  def onFailure(response: js.Any, element: semanticDashUiDashApiLib.JQuery): scala.Unit
  /**
    * Callback that occurs when request is made. Receives both the API success promise and the XHR request promise.
    */
  def onRequest(promise: jqueryLib.JQueryNs.Deferred[_, _, _], xhr: jqueryLib.JQueryNs.jqXHR[_]): scala.Unit
  /**
    * Allows modifying the server's response before parsed by other callbacks to determine API event success
    */
  def onResponse(response: js.Any): scala.Unit
  /**
    * Callback after successful response, JSON response must pass successTest
    */
  def onSuccess(response: js.Any, element: semanticDashUiDashApiLib.JQuery, xhr: jqueryLib.JQueryNs.jqXHR[_]): scala.Unit
  /**
    * Determines whether completed JSON response should be treated as successful
    *
    * @see {@link http://semantic-ui.com/behaviors/api.html#determining-json-success}
    */
  def successTest(response: js.Any): scala.Boolean
}

