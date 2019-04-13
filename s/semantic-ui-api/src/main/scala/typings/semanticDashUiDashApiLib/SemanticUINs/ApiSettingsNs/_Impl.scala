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
  var api: org.scalablytyped.runtime.StringDictionary[java.lang.String]
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

object _Impl {
  @scala.inline
  def apply(
    action: java.lang.String | semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`false`,
    api: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    beforeSend: semanticDashUiDashApiLib.SemanticUINs.ApiSettings => js.Any,
    beforeXHR: jqueryLib.JQueryNs.jqXHR[_] => js.Any,
    cache: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.local | scala.Boolean,
    className: semanticDashUiDashApiLib.SemanticUINs.ApiNs.ClassNameSettings,
    data: js.Any,
    dataType: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.xml | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.json | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.jsonp | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.script | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.html | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.text,
    debug: scala.Boolean,
    defaultData: scala.Boolean,
    encodeParameters: scala.Boolean,
    error: semanticDashUiDashApiLib.SemanticUINs.ApiNs.ErrorSettings,
    errorDuration: semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`true` | scala.Double,
    hideError: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.auto | scala.Boolean,
    interruptRequests: scala.Boolean,
    loadingDuration: scala.Double,
    metadata: semanticDashUiDashApiLib.SemanticUINs.ApiNs.MetadataSettings,
    method: semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.post | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.get | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.put | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.delete | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.head | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.options | semanticDashUiDashApiLib.semanticDashUiDashApiLibStrings.patch,
    mockResponse: js.Any | semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`false`,
    mockResponseAsync: (js.Function2[
      /* settings */ semanticDashUiDashApiLib.SemanticUINs.ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, scala.Unit], 
      scala.Unit
    ]) | semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`false`,
    name: java.lang.String,
    namespace: java.lang.String,
    on: java.lang.String,
    onAbort: (java.lang.String, semanticDashUiDashApiLib.JQuery, jqueryLib.JQueryNs.jqXHR[_]) => scala.Unit,
    onComplete: (js.Any, semanticDashUiDashApiLib.JQuery, jqueryLib.JQueryNs.jqXHR[_]) => scala.Unit,
    onError: (java.lang.String, semanticDashUiDashApiLib.JQuery, jqueryLib.JQueryNs.jqXHR[_]) => scala.Unit,
    onFailure: (js.Any, semanticDashUiDashApiLib.JQuery) => scala.Unit,
    onRequest: (jqueryLib.JQueryNs.Deferred[_, _, _], jqueryLib.JQueryNs.jqXHR[_]) => scala.Unit,
    onResponse: js.Any => scala.Unit,
    onSuccess: (js.Any, semanticDashUiDashApiLib.JQuery, jqueryLib.JQueryNs.jqXHR[_]) => scala.Unit,
    performance: scala.Boolean,
    regExp: semanticDashUiDashApiLib.SemanticUINs.ApiNs.RegExpSettings,
    response: js.Any | semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`false`,
    responseAsync: (js.Function2[
      /* settings */ semanticDashUiDashApiLib.SemanticUINs.ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, scala.Unit], 
      scala.Unit
    ]) | semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`false`,
    selector: semanticDashUiDashApiLib.SemanticUINs.ApiNs.SelectorSettings,
    serializeForm: scala.Boolean,
    silent: scala.Boolean,
    stateContext: java.lang.String | semanticDashUiDashApiLib.JQuery,
    successTest: js.Any => scala.Boolean,
    throttle: scala.Double,
    throttleFirstRequest: scala.Boolean,
    url: java.lang.String | semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`false`,
    urlData: js.Any | semanticDashUiDashApiLib.semanticDashUiDashApiLibNumbers.`false`,
    verbose: scala.Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], api = api, beforeSend = js.Any.fromFunction1(beforeSend), beforeXHR = js.Any.fromFunction1(beforeXHR), cache = cache.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], data = data, dataType = dataType.asInstanceOf[js.Any], debug = debug, defaultData = defaultData, encodeParameters = encodeParameters, error = error.asInstanceOf[js.Any], errorDuration = errorDuration.asInstanceOf[js.Any], hideError = hideError.asInstanceOf[js.Any], interruptRequests = interruptRequests, loadingDuration = loadingDuration, metadata = metadata.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mockResponse = mockResponse.asInstanceOf[js.Any], mockResponseAsync = mockResponseAsync.asInstanceOf[js.Any], name = name, namespace = namespace, on = on, onAbort = js.Any.fromFunction3(onAbort), onComplete = js.Any.fromFunction3(onComplete), onError = js.Any.fromFunction3(onError), onFailure = js.Any.fromFunction2(onFailure), onRequest = js.Any.fromFunction2(onRequest), onResponse = js.Any.fromFunction1(onResponse), onSuccess = js.Any.fromFunction3(onSuccess), performance = performance, regExp = regExp.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseAsync = responseAsync.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], serializeForm = serializeForm, silent = silent, stateContext = stateContext.asInstanceOf[js.Any], successTest = js.Any.fromFunction1(successTest), throttle = throttle, throttleFirstRequest = throttleFirstRequest, url = url.asInstanceOf[js.Any], urlData = urlData.asInstanceOf[js.Any], verbose = verbose)
  
    __obj.asInstanceOf[_Impl]
  }
}

