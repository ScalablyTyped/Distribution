package typings.semanticUiApi

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryDeferred
import typings.jquery.JQuery_.Deferred
import typings.jquery.JQuery_.jqXHR
import typings.semanticUiApi.SemanticUI.Api
import typings.semanticUiApi.SemanticUI.Api.ClassNameSettings
import typings.semanticUiApi.SemanticUI.Api.ErrorSettings
import typings.semanticUiApi.SemanticUI.Api.MetadataSettings
import typings.semanticUiApi.SemanticUI.Api.RegExpSettings
import typings.semanticUiApi.SemanticUI.Api.SelectorSettings
import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiApi.semanticUiApiBooleans.`false`
import typings.semanticUiApi.semanticUiApiBooleans.`true`
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
import typings.semanticUiApi.semanticUiApiStrings.action
import typings.semanticUiApi.semanticUiApiStrings.auto
import typings.semanticUiApi.semanticUiApiStrings.beforeSend
import typings.semanticUiApi.semanticUiApiStrings.beforeXHR
import typings.semanticUiApi.semanticUiApiStrings.cache
import typings.semanticUiApi.semanticUiApiStrings.className
import typings.semanticUiApi.semanticUiApiStrings.data
import typings.semanticUiApi.semanticUiApiStrings.dataType
import typings.semanticUiApi.semanticUiApiStrings.debug
import typings.semanticUiApi.semanticUiApiStrings.defaultData
import typings.semanticUiApi.semanticUiApiStrings.delete
import typings.semanticUiApi.semanticUiApiStrings.destroy
import typings.semanticUiApi.semanticUiApiStrings.encodeParameters
import typings.semanticUiApi.semanticUiApiStrings.error
import typings.semanticUiApi.semanticUiApiStrings.errorDuration
import typings.semanticUiApi.semanticUiApiStrings.get
import typings.semanticUiApi.semanticUiApiStrings.head
import typings.semanticUiApi.semanticUiApiStrings.hideError
import typings.semanticUiApi.semanticUiApiStrings.html
import typings.semanticUiApi.semanticUiApiStrings.interruptRequests
import typings.semanticUiApi.semanticUiApiStrings.json
import typings.semanticUiApi.semanticUiApiStrings.jsonp
import typings.semanticUiApi.semanticUiApiStrings.loadingDuration
import typings.semanticUiApi.semanticUiApiStrings.local
import typings.semanticUiApi.semanticUiApiStrings.metadata
import typings.semanticUiApi.semanticUiApiStrings.method
import typings.semanticUiApi.semanticUiApiStrings.mockResponse
import typings.semanticUiApi.semanticUiApiStrings.mockResponseAsync
import typings.semanticUiApi.semanticUiApiStrings.name
import typings.semanticUiApi.semanticUiApiStrings.namespace
import typings.semanticUiApi.semanticUiApiStrings.on
import typings.semanticUiApi.semanticUiApiStrings.onAbort
import typings.semanticUiApi.semanticUiApiStrings.onComplete
import typings.semanticUiApi.semanticUiApiStrings.onError
import typings.semanticUiApi.semanticUiApiStrings.onFailure
import typings.semanticUiApi.semanticUiApiStrings.onRequest
import typings.semanticUiApi.semanticUiApiStrings.onResponse
import typings.semanticUiApi.semanticUiApiStrings.onSuccess
import typings.semanticUiApi.semanticUiApiStrings.options
import typings.semanticUiApi.semanticUiApiStrings.patch
import typings.semanticUiApi.semanticUiApiStrings.performance
import typings.semanticUiApi.semanticUiApiStrings.post
import typings.semanticUiApi.semanticUiApiStrings.put
import typings.semanticUiApi.semanticUiApiStrings.query
import typings.semanticUiApi.semanticUiApiStrings.regExp
import typings.semanticUiApi.semanticUiApiStrings.reset
import typings.semanticUiApi.semanticUiApiStrings.response
import typings.semanticUiApi.semanticUiApiStrings.responseAsync
import typings.semanticUiApi.semanticUiApiStrings.script
import typings.semanticUiApi.semanticUiApiStrings.selector
import typings.semanticUiApi.semanticUiApiStrings.serializeForm
import typings.semanticUiApi.semanticUiApiStrings.setting
import typings.semanticUiApi.semanticUiApiStrings.silent
import typings.semanticUiApi.semanticUiApiStrings.stateContext
import typings.semanticUiApi.semanticUiApiStrings.successTest
import typings.semanticUiApi.semanticUiApiStrings.text
import typings.semanticUiApi.semanticUiApiStrings.throttle
import typings.semanticUiApi.semanticUiApiStrings.throttleFirstRequest
import typings.semanticUiApi.semanticUiApiStrings.url
import typings.semanticUiApi.semanticUiApiStrings.urlData
import typings.semanticUiApi.semanticUiApiStrings.verbose
import typings.semanticUiApi.semanticUiApiStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("api")
  var api_Original: Api = js.native
  def api(): JQuery = js.native
  def api(behavior: setting, name: action): String | `false` = js.native
  def api(behavior: setting, name: action, value: String): JQuery = js.native
  def api(behavior: setting, name: action, value: `false`): JQuery = js.native
  def api(behavior: setting, name: typings.semanticUiApi.semanticUiApiStrings.api): StringDictionary[String] = js.native
  def api(
    behavior: setting,
    name: typings.semanticUiApi.semanticUiApiStrings.api,
    value: StringDictionary[String]
  ): JQuery = js.native
  def api(behavior: setting, name: beforeSend): js.Function1[/* settings */ ApiSettings, _] = js.native
  def api(behavior: setting, name: beforeSend, value: js.Function1[/* settings */ ApiSettings, _]): JQuery = js.native
  def api(behavior: setting, name: beforeXHR): js.Function1[/* xhrObject */ jqXHR[_], _] = js.native
  def api(behavior: setting, name: beforeXHR, value: js.Function1[/* xhrObject */ jqXHR[_], _]): JQuery = js.native
  def api(behavior: setting, name: cache): local | Boolean = js.native
  def api(behavior: setting, name: cache, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: cache, value: local): JQuery = js.native
  def api(behavior: setting, name: className): ClassNameSettings = js.native
  def api(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def api(behavior: setting, name: data): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl['data'] */ js.Any = js.native
  def api(behavior: setting, name: dataType): xml | json | jsonp | script | html | text = js.native
  def api(behavior: setting, name: dataType, value: html): JQuery = js.native
  def api(behavior: setting, name: dataType, value: json): JQuery = js.native
  def api(behavior: setting, name: dataType, value: jsonp): JQuery = js.native
  def api(behavior: setting, name: dataType, value: script): JQuery = js.native
  def api(behavior: setting, name: dataType, value: text): JQuery = js.native
  def api(behavior: setting, name: dataType, value: xml): JQuery = js.native
  def api(
    behavior: setting,
    name: data,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl['data'] */ js.Any
  ): JQuery = js.native
  def api(behavior: setting, name: debug): Boolean = js.native
  def api(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: defaultData): Boolean = js.native
  def api(behavior: setting, name: defaultData, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: encodeParameters): Boolean = js.native
  def api(behavior: setting, name: encodeParameters, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: error): ErrorSettings = js.native
  def api(behavior: setting, name: errorDuration): `true` | Double = js.native
  def api(behavior: setting, name: errorDuration, value: Double): JQuery = js.native
  def api(behavior: setting, name: errorDuration, value: `true`): JQuery = js.native
  def api(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def api(behavior: setting, name: hideError): auto | Boolean = js.native
  def api(behavior: setting, name: hideError, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: hideError, value: auto): JQuery = js.native
  def api(behavior: setting, name: interruptRequests): Boolean = js.native
  def api(behavior: setting, name: interruptRequests, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: loadingDuration): Double = js.native
  def api(behavior: setting, name: loadingDuration, value: Double): JQuery = js.native
  def api(behavior: setting, name: metadata): MetadataSettings = js.native
  def api(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def api(behavior: setting, name: method): post | get | put | delete | head | options | patch = js.native
  def api(behavior: setting, name: method, value: delete): JQuery = js.native
  def api(behavior: setting, name: method, value: get): JQuery = js.native
  def api(behavior: setting, name: method, value: head): JQuery = js.native
  def api(behavior: setting, name: method, value: options): JQuery = js.native
  def api(behavior: setting, name: method, value: patch): JQuery = js.native
  def api(behavior: setting, name: method, value: post): JQuery = js.native
  def api(behavior: setting, name: method, value: put): JQuery = js.native
  def api(behavior: setting, name: mockResponse): js.Any | `false` = js.native
  def api(behavior: setting, name: mockResponseAsync): (js.Function2[
    /* settings */ ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false` = js.native
  def api(
    behavior: setting,
    name: mockResponseAsync,
    value: js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]
  ): JQuery = js.native
  def api(behavior: setting, name: mockResponseAsync, value: `false`): JQuery = js.native
  def api(behavior: setting, name: mockResponse, value: js.Any): JQuery = js.native
  def api(behavior: setting, name: mockResponse, value: `false`): JQuery = js.native
  def api(behavior: setting, name: name): String = js.native
  def api(behavior: setting, name: namespace): String = js.native
  def api(behavior: setting, name: namespace, value: String): JQuery = js.native
  def api(behavior: setting, name: name, value: String): JQuery = js.native
  def api(behavior: setting, name: on): String = js.native
  def api(behavior: setting, name: onAbort): js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
  def api(
    behavior: setting,
    name: onAbort,
    value: js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ): JQuery = js.native
  def api(behavior: setting, name: onComplete): js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
  def api(
    behavior: setting,
    name: onComplete,
    value: js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ): JQuery = js.native
  def api(behavior: setting, name: onError): js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
  def api(
    behavior: setting,
    name: onError,
    value: js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ): JQuery = js.native
  def api(behavior: setting, name: onFailure): js.Function2[/* response */ js.Any, /* element */ JQuery, Unit] = js.native
  def api(
    behavior: setting,
    name: onFailure,
    value: js.Function2[/* response */ js.Any, /* element */ JQuery, Unit]
  ): JQuery = js.native
  def api(behavior: setting, name: onRequest): js.Function2[/* promise */ Deferred[_, _, _], /* xhr */ jqXHR[_], Unit] = js.native
  def api(
    behavior: setting,
    name: onRequest,
    value: js.Function2[/* promise */ Deferred[_, _, _], /* xhr */ jqXHR[_], Unit]
  ): JQuery = js.native
  def api(behavior: setting, name: onResponse): js.Function1[/* response */ js.Any, Unit] = js.native
  def api(behavior: setting, name: onResponse, value: js.Function1[/* response */ js.Any, Unit]): JQuery = js.native
  def api(behavior: setting, name: onSuccess): js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
  def api(
    behavior: setting,
    name: onSuccess,
    value: js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ): JQuery = js.native
  def api(behavior: setting, name: on, value: String): JQuery = js.native
  def api(behavior: setting, name: performance): Boolean = js.native
  def api(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: regExp): RegExpSettings = js.native
  def api(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
  def api(behavior: setting, name: response): js.Any | `false` = js.native
  def api(behavior: setting, name: responseAsync): (js.Function2[
    /* settings */ ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false` = js.native
  def api(
    behavior: setting,
    name: responseAsync,
    value: js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]
  ): JQuery = js.native
  def api(behavior: setting, name: responseAsync, value: `false`): JQuery = js.native
  def api(behavior: setting, name: response, value: js.Any): JQuery = js.native
  def api(behavior: setting, name: response, value: `false`): JQuery = js.native
  def api(behavior: setting, name: selector): SelectorSettings = js.native
  def api(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def api(behavior: setting, name: serializeForm): Boolean = js.native
  def api(behavior: setting, name: serializeForm, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: silent): Boolean = js.native
  def api(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: stateContext): String | JQuery = js.native
  def api(behavior: setting, name: stateContext, value: String): JQuery = js.native
  def api(behavior: setting, name: stateContext, value: JQuery): JQuery = js.native
  def api(behavior: setting, name: successTest): js.Function1[/* response */ js.Any, Boolean] = js.native
  def api(behavior: setting, name: successTest, value: js.Function1[/* response */ js.Any, Boolean]): JQuery = js.native
  def api(behavior: setting, name: throttle): Double = js.native
  def api(behavior: setting, name: throttleFirstRequest): Boolean = js.native
  def api(behavior: setting, name: throttleFirstRequest, value: Boolean): JQuery = js.native
  def api(behavior: setting, name: throttle, value: Double): JQuery = js.native
  def api(behavior: setting, name: url): String | `false` = js.native
  def api(behavior: setting, name: urlData): js.Any | `false` = js.native
  def api(behavior: setting, name: urlData, value: js.Any): JQuery = js.native
  def api(behavior: setting, name: urlData, value: `false`): JQuery = js.native
  def api(behavior: setting, name: url, value: String): JQuery = js.native
  def api(behavior: setting, name: url, value: `false`): JQuery = js.native
  def api(behavior: setting, name: verbose): Boolean = js.native
  def api(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def api(settings: ApiSettings): JQuery = js.native
  /**
    * Aborts current API request
    */
  @JSName("api")
  def api_abort(behavior: abort): JQuery = js.native
  /**
    * Adds data to existing templated url and returns full url string
    */
  @JSName("api")
  def api_addurldata(behavior: `add url data`, url: String, data: js.Any): String = js.native
  /**
    * Creates new cache, removing all locally cached URLs
    */
  @JSName("api")
  def api_createcache(behavior: `create cache`): JQuery = js.native
  /**
    * Removes API settings from the page and all events
    */
  @JSName("api")
  def api_destroy(behavior: destroy): JQuery = js.native
  /**
    * Gets event that API request will occur on
    */
  @JSName("api")
  def api_getevent(behavior: `get event`): String = js.native
  /**
    * Gets promise for current API request
    */
  @JSName("api")
  def api_getrequest(behavior: `get request`): JQueryDeferred[_] | `false` = js.native
  /**
    * Returns encodeURIComponent value only if value passed is not already encoded
    */
  @JSName("api")
  def api_geturlencodedvalue(behavior: `get url encoded value`, value: js.Any): String = js.native
  /**
    * Returns whether element is disabled
    */
  @JSName("api")
  def api_isdisabled(behavior: `is disabled`): Boolean = js.native
  /**
    * Returns whether element is loading
    */
  @JSName("api")
  def api_isloading(behavior: `is loading`): Boolean = js.native
  /**
    * Returns whether element response is mocked
    */
  @JSName("api")
  def api_ismocked(behavior: `is mocked`): Boolean = js.native
  /**
    * Execute query using existing API settings
    */
  @JSName("api")
  def api_query(behavior: query): JQuery = js.native
  /**
    * Reads a locally cached response for a URL
    */
  @JSName("api")
  def api_readcachedresponse(behavior: `read cached response`, url: String): js.Any = js.native
  /**
    * Removes error state to element
    */
  @JSName("api")
  def api_removeerror(behavior: `remove error`): JQuery = js.native
  /**
    * Removes loading state to element
    */
  @JSName("api")
  def api_removeloading(behavior: `remove loading`): JQuery = js.native
  /**
    * Removes loading and error state from element
    */
  @JSName("api")
  def api_reset(behavior: reset): JQuery = js.native
  /**
    * Sets error state to element
    */
  @JSName("api")
  def api_seterror(behavior: `set error`): JQuery = js.native
  /**
    * Sets loading state to element
    */
  @JSName("api")
  def api_setloading(behavior: `set loading`): JQuery = js.native
  @JSName("api")
  def api_setting(behavior: setting, value: ApiSettings): JQuery = js.native
  /**
    * Returns whether last request was cancelled
    */
  @JSName("api")
  def api_wascancelled(behavior: `was cancelled`): Boolean = js.native
  /**
    * Returns whether last request was completed
    */
  @JSName("api")
  def api_wascomplete(behavior: `was complete`): Boolean = js.native
  /**
    * Returns whether last request was failure
    */
  @JSName("api")
  def api_wasfailure(behavior: `was failure`): Boolean = js.native
  /**
    * Returns whether last request was successful
    */
  @JSName("api")
  def api_wassuccessful(behavior: `was successful`): Boolean = js.native
  /**
    * Writes a cached response for a URL
    */
  @JSName("api")
  def api_writecachedresponse(behavior: `write cached response`, url: String, response: js.Any): JQuery = js.native
}

