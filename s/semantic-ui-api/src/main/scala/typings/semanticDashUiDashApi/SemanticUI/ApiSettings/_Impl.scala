package typings.semanticDashUiDashApi.SemanticUI.ApiSettings

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery.Deferred
import typings.jquery.JQuery.jqXHR
import typings.semanticDashUiDashApi.JQuery
import typings.semanticDashUiDashApi.SemanticUI.Api.ClassNameSettings
import typings.semanticDashUiDashApi.SemanticUI.Api.ErrorSettings
import typings.semanticDashUiDashApi.SemanticUI.Api.MetadataSettings
import typings.semanticDashUiDashApi.SemanticUI.Api.RegExpSettings
import typings.semanticDashUiDashApi.SemanticUI.Api.SelectorSettings
import typings.semanticDashUiDashApi.semanticDashUiDashApiBooleans.`false`
import typings.semanticDashUiDashApi.semanticDashUiDashApiBooleans.`true`
import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.auto
import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.delete
import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.get
import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.head
import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.html
import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.json
import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.jsonp
import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.local
import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.options
import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.patch
import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.post
import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.put
import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.script
import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.text
import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  // endregion
  // region Request Settings
  /**
    * Named API action for query, originally specified in $.fn.settings.api
    */
  var action: String | `false`
  var api: StringDictionary[String]
  /**
    * Can be set to 'local' to cache successful returned AJAX responses when using a JSON API.
    * This helps avoid server round trips when API endpoints will return the same results when accessed repeatedly.
    * Setting to false, will add cache busting parameters to the URL.
    *
    * @default true
    */
  var cache: local | Boolean
  /**
    * Class names used to determine element state
    */
  var className: ClassNameSettings
  /**
    * POST/GET Data to Send with Request
    */
  var data: js.Any
  /**
    * Expected data type of response
    */
  var dataType: xml | json | jsonp | script | html | text
  /**
    * Debug output to console
    */
  var debug: Boolean
  /**
    * Whether to automatically include default data like {value} and {text}
    *
    * @default true
    */
  var defaultData: Boolean
  /**
    * Whether to encode parameters with encodeURIComponent before adding into url string
    *
    * @default true
    */
  var encodeParameters: Boolean
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * Setting to true, will not remove error.
    * Setting to a duration in milliseconds to show error state after request error.
    *
    * @default 2000
    */
  var errorDuration: `true` | Double
  /**
    * The default auto will automatically remove error state after error duration, unless the element is a form
    *
    * @default 'auto'
    */
  var hideError: auto | Boolean
  /**
    * Whether an API request can occur while another request is still pending
    *
    * @default false
    */
  var interruptRequests: Boolean
  /**
    * Minimum duration to show loading indication
    *
    * @default 0
    */
  var loadingDuration: Double
  /**
    * Metadata used to store XHR and response promise
    */
  var metadata: MetadataSettings
  /**
    * Method for transmitting request to server
    */
  var method: post | get | put | delete | head | options | patch
  /**
    * @see response
    */
  var mockResponse: js.Any | `false`
  /**
    * @see responseAsync
    */
  var mockResponseAsync: (js.Function2[
    /* settings */ typings.semanticDashUiDashApi.SemanticUI.ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false`
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String
  // region Behavior
  /**
    * When API event should occur
    *
    * @default 'auto'
    */
  var on: String
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  // endregion
  // region DOM Settings
  /**
    * Regular expressions used for template matching
    */
  var regExp: RegExpSettings
  /**
    * Can be set to a Javascript object which will be returned automatically instead of requesting JSON from server
    */
  var response: js.Any | `false`
  /**
    * When specified, this function can be used to retrieve content from a server and return it asynchronously instead of a standard AJAX call.
    * The callback function should return the server response.
    *
    * @default false
    */
  var responseAsync: (js.Function2[
    /* settings */ typings.semanticDashUiDashApi.SemanticUI.ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false`
  /**
    * Selectors used to find parts of a module
    */
  var selector: SelectorSettings
  /**
    * Whether to serialize closest form and include in request
    *
    * @default false
    */
  var serializeForm: Boolean
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  /**
    * UI state will be applied to this element, defaults to triggering element.
    */
  var stateContext: String | JQuery
  /**
    * How long to wait when a request is made before triggering request, useful for rate limiting oninput
    *
    * @default 0
    */
  var throttle: Double
  /**
    * When set to false will not delay the first request made, when no others are queued
    *
    * @default true
    */
  var throttleFirstRequest: Boolean
  /**
    * Templated URL for query, will override specified action
    */
  var url: String | `false`
  /**
    * Variables to use for replacement
    */
  var urlData: js.Any | `false`
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  // endregion
  // region Callbacks
  /**
    * Allows modifying settings before request, or cancelling request
    */
  def beforeSend(settings: typings.semanticDashUiDashApi.SemanticUI.ApiSettings): js.Any
  /**
    * Allows modifying XHR object for request
    */
  def beforeXHR(xhrObject: jqXHR[_]): js.Any
  /**
    * Callback on abort caused by user clicking a link or manually cancelling request.
    */
  def onAbort(errorMessage: String, element: JQuery, xhr: jqXHR[_]): Unit
  /**
    * Callback on request complete regardless of conditions
    */
  def onComplete(response: js.Any, element: JQuery, xhr: jqXHR[_]): Unit
  /**
    * Callback on server error from returned status code, or XHR failure.
    */
  def onError(errorMessage: String, element: JQuery, xhr: jqXHR[_]): Unit
  /**
    * Callback on failed response, or JSON response that fails successTest
    */
  def onFailure(response: js.Any, element: JQuery): Unit
  /**
    * Callback that occurs when request is made. Receives both the API success promise and the XHR request promise.
    */
  def onRequest(promise: Deferred[_, _, _], xhr: jqXHR[_]): Unit
  /**
    * Allows modifying the server's response before parsed by other callbacks to determine API event success
    */
  def onResponse(response: js.Any): Unit
  /**
    * Callback after successful response, JSON response must pass successTest
    */
  def onSuccess(response: js.Any, element: JQuery, xhr: jqXHR[_]): Unit
  /**
    * Determines whether completed JSON response should be treated as successful
    *
    * @see {@link http://semantic-ui.com/behaviors/api.html#determining-json-success}
    */
  def successTest(response: js.Any): Boolean
}

object _Impl {
  @scala.inline
  def apply(
    action: String | `false`,
    api: StringDictionary[String],
    beforeSend: typings.semanticDashUiDashApi.SemanticUI.ApiSettings => js.Any,
    beforeXHR: jqXHR[_] => js.Any,
    cache: local | Boolean,
    className: ClassNameSettings,
    data: js.Any,
    dataType: xml | json | jsonp | script | html | text,
    debug: Boolean,
    defaultData: Boolean,
    encodeParameters: Boolean,
    error: ErrorSettings,
    errorDuration: `true` | Double,
    hideError: auto | Boolean,
    interruptRequests: Boolean,
    loadingDuration: Double,
    metadata: MetadataSettings,
    method: post | get | put | delete | head | options | patch,
    mockResponse: js.Any | `false`,
    mockResponseAsync: (js.Function2[
      /* settings */ typings.semanticDashUiDashApi.SemanticUI.ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | `false`,
    name: String,
    namespace: String,
    on: String,
    onAbort: (String, JQuery, jqXHR[_]) => Unit,
    onComplete: (js.Any, JQuery, jqXHR[_]) => Unit,
    onError: (String, JQuery, jqXHR[_]) => Unit,
    onFailure: (js.Any, JQuery) => Unit,
    onRequest: (Deferred[_, _, _], jqXHR[_]) => Unit,
    onResponse: js.Any => Unit,
    onSuccess: (js.Any, JQuery, jqXHR[_]) => Unit,
    performance: Boolean,
    regExp: RegExpSettings,
    response: js.Any | `false`,
    responseAsync: (js.Function2[
      /* settings */ typings.semanticDashUiDashApi.SemanticUI.ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | `false`,
    selector: SelectorSettings,
    serializeForm: Boolean,
    silent: Boolean,
    stateContext: String | JQuery,
    successTest: js.Any => Boolean,
    throttle: Double,
    throttleFirstRequest: Boolean,
    url: String | `false`,
    urlData: js.Any | `false`,
    verbose: Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], beforeSend = js.Any.fromFunction1(beforeSend), beforeXHR = js.Any.fromFunction1(beforeXHR), cache = cache.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], defaultData = defaultData.asInstanceOf[js.Any], encodeParameters = encodeParameters.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], errorDuration = errorDuration.asInstanceOf[js.Any], hideError = hideError.asInstanceOf[js.Any], interruptRequests = interruptRequests.asInstanceOf[js.Any], loadingDuration = loadingDuration.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mockResponse = mockResponse.asInstanceOf[js.Any], mockResponseAsync = mockResponseAsync.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onAbort = js.Any.fromFunction3(onAbort), onComplete = js.Any.fromFunction3(onComplete), onError = js.Any.fromFunction3(onError), onFailure = js.Any.fromFunction2(onFailure), onRequest = js.Any.fromFunction2(onRequest), onResponse = js.Any.fromFunction1(onResponse), onSuccess = js.Any.fromFunction3(onSuccess), performance = performance.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseAsync = responseAsync.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], serializeForm = serializeForm.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], stateContext = stateContext.asInstanceOf[js.Any], successTest = js.Any.fromFunction1(successTest), throttle = throttle.asInstanceOf[js.Any], throttleFirstRequest = throttleFirstRequest.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlData = urlData.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

