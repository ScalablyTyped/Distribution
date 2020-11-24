package typings.semanticUiApi.SemanticUI.ApiSettings

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery.Deferred
import typings.jquery.JQuery.jqXHR
import typings.semanticUiApi.JQuery
import typings.semanticUiApi.SemanticUI.Api.ClassNameSettings
import typings.semanticUiApi.SemanticUI.Api.ErrorSettings
import typings.semanticUiApi.SemanticUI.Api.MetadataSettings
import typings.semanticUiApi.SemanticUI.Api.RegExpSettings
import typings.semanticUiApi.SemanticUI.Api.SelectorSettings
import typings.semanticUiApi.semanticUiApiBooleans.`false`
import typings.semanticUiApi.semanticUiApiBooleans.`true`
import typings.semanticUiApi.semanticUiApiStrings.auto
import typings.semanticUiApi.semanticUiApiStrings.delete
import typings.semanticUiApi.semanticUiApiStrings.get
import typings.semanticUiApi.semanticUiApiStrings.head
import typings.semanticUiApi.semanticUiApiStrings.html
import typings.semanticUiApi.semanticUiApiStrings.json
import typings.semanticUiApi.semanticUiApiStrings.jsonp
import typings.semanticUiApi.semanticUiApiStrings.local
import typings.semanticUiApi.semanticUiApiStrings.options
import typings.semanticUiApi.semanticUiApiStrings.patch
import typings.semanticUiApi.semanticUiApiStrings.post
import typings.semanticUiApi.semanticUiApiStrings.put
import typings.semanticUiApi.semanticUiApiStrings.script
import typings.semanticUiApi.semanticUiApiStrings.text
import typings.semanticUiApi.semanticUiApiStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  // endregion
  // region Request Settings
  /**
    * Named API action for query, originally specified in $.fn.settings.api
    */
  var action: String | `false` = js.native
  
  var api: StringDictionary[String] = js.native
  
  // endregion
  // region Callbacks
  /**
    * Allows modifying settings before request, or cancelling request
    */
  def beforeSend(settings: typings.semanticUiApi.SemanticUI.ApiSettings): js.Any = js.native
  
  /**
    * Allows modifying XHR object for request
    */
  def beforeXHR(xhrObject: jqXHR[_]): js.Any = js.native
  
  /**
    * Can be set to 'local' to cache successful returned AJAX responses when using a JSON API.
    * This helps avoid server round trips when API endpoints will return the same results when accessed repeatedly.
    * Setting to false, will add cache busting parameters to the URL.
    *
    * @default true
    */
  var cache: local | Boolean = js.native
  
  /**
    * Class names used to determine element state
    */
  var className: ClassNameSettings = js.native
  
  /**
    * POST/GET Data to Send with Request
    */
  var data: js.Any = js.native
  
  /**
    * Expected data type of response
    */
  var dataType: xml | json | jsonp | script | html | text = js.native
  
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  
  /**
    * Whether to automatically include default data like {value} and {text}
    *
    * @default true
    */
  var defaultData: Boolean = js.native
  
  /**
    * Whether to encode parameters with encodeURIComponent before adding into url string
    *
    * @default true
    */
  var encodeParameters: Boolean = js.native
  
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  
  /**
    * Setting to true, will not remove error.
    * Setting to a duration in milliseconds to show error state after request error.
    *
    * @default 2000
    */
  var errorDuration: `true` | Double = js.native
  
  /**
    * The default auto will automatically remove error state after error duration, unless the element is a form
    *
    * @default 'auto'
    */
  var hideError: auto | Boolean = js.native
  
  /**
    * Whether an API request can occur while another request is still pending
    *
    * @default false
    */
  var interruptRequests: Boolean = js.native
  
  /**
    * Minimum duration to show loading indication
    *
    * @default 0
    */
  var loadingDuration: Double = js.native
  
  /**
    * Metadata used to store XHR and response promise
    */
  var metadata: MetadataSettings = js.native
  
  /**
    * Method for transmitting request to server
    */
  var method: post | get | put | delete | head | options | patch = js.native
  
  /**
    * @see response
    */
  var mockResponse: js.Any | `false` = js.native
  
  /**
    * @see responseAsync
    */
  var mockResponseAsync: (js.Function2[
    /* settings */ typings.semanticUiApi.SemanticUI.ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false` = js.native
  
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String = js.native
  
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String = js.native
  
  // region Behavior
  /**
    * When API event should occur
    *
    * @default 'auto'
    */
  var on: String = js.native
  
  /**
    * Callback on abort caused by user clicking a link or manually cancelling request.
    */
  def onAbort(errorMessage: String, element: JQuery, xhr: jqXHR[_]): Unit = js.native
  
  /**
    * Callback on request complete regardless of conditions
    */
  def onComplete(response: js.Any, element: JQuery, xhr: jqXHR[_]): Unit = js.native
  
  /**
    * Callback on server error from returned status code, or XHR failure.
    */
  def onError(errorMessage: String, element: JQuery, xhr: jqXHR[_]): Unit = js.native
  
  /**
    * Callback on failed response, or JSON response that fails successTest
    */
  def onFailure(response: js.Any, element: JQuery): Unit = js.native
  
  /**
    * Callback that occurs when request is made. Receives both the API success promise and the XHR request promise.
    */
  def onRequest(promise: Deferred[_, _, _], xhr: jqXHR[_]): Unit = js.native
  
  /**
    * Allows modifying the server's response before parsed by other callbacks to determine API event success
    */
  def onResponse(response: js.Any): Unit = js.native
  
  /**
    * Callback after successful response, JSON response must pass successTest
    */
  def onSuccess(response: js.Any, element: JQuery, xhr: jqXHR[_]): Unit = js.native
  
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  
  // endregion
  // region DOM Settings
  /**
    * Regular expressions used for template matching
    */
  var regExp: RegExpSettings = js.native
  
  /**
    * Can be set to a Javascript object which will be returned automatically instead of requesting JSON from server
    */
  var response: js.Any | `false` = js.native
  
  /**
    * When specified, this function can be used to retrieve content from a server and return it asynchronously instead of a standard AJAX call.
    * The callback function should return the server response.
    *
    * @default false
    */
  var responseAsync: (js.Function2[
    /* settings */ typings.semanticUiApi.SemanticUI.ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false` = js.native
  
  /**
    * Selectors used to find parts of a module
    */
  var selector: SelectorSettings = js.native
  
  /**
    * Whether to serialize closest form and include in request
    *
    * @default false
    */
  var serializeForm: Boolean = js.native
  
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  
  /**
    * UI state will be applied to this element, defaults to triggering element.
    */
  var stateContext: String | JQuery = js.native
  
  /**
    * Determines whether completed JSON response should be treated as successful
    *
    * @see {@link http://semantic-ui.com/behaviors/api.html#determining-json-success}
    */
  def successTest(response: js.Any): Boolean = js.native
  
  /**
    * How long to wait when a request is made before triggering request, useful for rate limiting oninput
    *
    * @default 0
    */
  var throttle: Double = js.native
  
  /**
    * When set to false will not delay the first request made, when no others are queued
    *
    * @default true
    */
  var throttleFirstRequest: Boolean = js.native
  
  /**
    * Templated URL for query, will override specified action
    */
  var url: String | `false` = js.native
  
  /**
    * Variables to use for replacement
    */
  var urlData: js.Any | `false` = js.native
  
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
}
object Impl {
  
  @scala.inline
  def apply(
    action: String | `false`,
    api: StringDictionary[String],
    beforeSend: typings.semanticUiApi.SemanticUI.ApiSettings => js.Any,
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
      /* settings */ typings.semanticUiApi.SemanticUI.ApiSettings, 
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
      /* settings */ typings.semanticUiApi.SemanticUI.ApiSettings, 
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
  ): Impl = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], beforeSend = js.Any.fromFunction1(beforeSend), beforeXHR = js.Any.fromFunction1(beforeXHR), cache = cache.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], defaultData = defaultData.asInstanceOf[js.Any], encodeParameters = encodeParameters.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], errorDuration = errorDuration.asInstanceOf[js.Any], hideError = hideError.asInstanceOf[js.Any], interruptRequests = interruptRequests.asInstanceOf[js.Any], loadingDuration = loadingDuration.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mockResponse = mockResponse.asInstanceOf[js.Any], mockResponseAsync = mockResponseAsync.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onAbort = js.Any.fromFunction3(onAbort), onComplete = js.Any.fromFunction3(onComplete), onError = js.Any.fromFunction3(onError), onFailure = js.Any.fromFunction2(onFailure), onRequest = js.Any.fromFunction2(onRequest), onResponse = js.Any.fromFunction1(onResponse), onSuccess = js.Any.fromFunction3(onSuccess), performance = performance.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseAsync = responseAsync.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], serializeForm = serializeForm.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], stateContext = stateContext.asInstanceOf[js.Any], successTest = js.Any.fromFunction1(successTest), throttle = throttle.asInstanceOf[js.Any], throttleFirstRequest = throttleFirstRequest.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlData = urlData.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: String | `false`): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi(value: StringDictionary[String]): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeSend(value: typings.semanticUiApi.SemanticUI.ApiSettings => js.Any): Self = this.set("beforeSend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeXHR(value: jqXHR[_] => js.Any): Self = this.set("beforeXHR", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCache(value: local | Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: xml | json | jsonp | script | html | text): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultData(value: Boolean): Self = this.set("defaultData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodeParameters(value: Boolean): Self = this.set("encodeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDuration(value: `true` | Double): Self = this.set("errorDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideError(value: auto | Boolean): Self = this.set("hideError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterruptRequests(value: Boolean): Self = this.set("interruptRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingDuration(value: Double): Self = this.set("loadingDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: post | get | put | delete | head | options | patch): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMockResponse(value: js.Any | `false`): Self = this.set("mockResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMockResponseAsyncFunction2(
      value: (/* settings */ typings.semanticUiApi.SemanticUI.ApiSettings, /* callback */ js.Function1[/* response */ js.Any, Unit]) => Unit
    ): Self = this.set("mockResponseAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMockResponseAsync(
      value: (js.Function2[
          /* settings */ typings.semanticUiApi.SemanticUI.ApiSettings, 
          /* callback */ js.Function1[/* response */ js.Any, Unit], 
          Unit
        ]) | `false`
    ): Self = this.set("mockResponseAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn(value: String): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAbort(value: (String, JQuery, jqXHR[_]) => Unit): Self = this.set("onAbort", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnComplete(value: (js.Any, JQuery, jqXHR[_]) => Unit): Self = this.set("onComplete", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnError(value: (String, JQuery, jqXHR[_]) => Unit): Self = this.set("onError", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnFailure(value: (js.Any, JQuery) => Unit): Self = this.set("onFailure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRequest(value: (Deferred[_, _, _], jqXHR[_]) => Unit): Self = this.set("onRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnResponse(value: js.Any => Unit): Self = this.set("onResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSuccess(value: (js.Any, JQuery, jqXHR[_]) => Unit): Self = this.set("onSuccess", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExp(value: RegExpSettings): Self = this.set("regExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: js.Any | `false`): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseAsyncFunction2(
      value: (/* settings */ typings.semanticUiApi.SemanticUI.ApiSettings, /* callback */ js.Function1[/* response */ js.Any, Unit]) => Unit
    ): Self = this.set("responseAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResponseAsync(
      value: (js.Function2[
          /* settings */ typings.semanticUiApi.SemanticUI.ApiSettings, 
          /* callback */ js.Function1[/* response */ js.Any, Unit], 
          Unit
        ]) | `false`
    ): Self = this.set("responseAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializeForm(value: Boolean): Self = this.set("serializeForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateContext(value: String | JQuery): Self = this.set("stateContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessTest(value: js.Any => Boolean): Self = this.set("successTest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottleFirstRequest(value: Boolean): Self = this.set("throttleFirstRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String | `false`): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlData(value: js.Any | `false`): Self = this.set("urlData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
}
