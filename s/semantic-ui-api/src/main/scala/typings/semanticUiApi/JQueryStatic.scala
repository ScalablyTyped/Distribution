package typings.semanticUiApi

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery.Deferred
import typings.jquery.JQuery.jqXHR
import typings.jquery.JQueryDeferred
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def api(): JQuery
  def api(behavior: setting, name: action, value: String): JQuery
  def api(behavior: setting, name: action, value: Unit): String | `false`
  def api(behavior: setting, name: action, value: `false`): JQuery
  def api(
    behavior: setting,
    name: typings.semanticUiApi.semanticUiApiStrings.api,
    value: StringDictionary[String]
  ): JQuery
  def api(behavior: setting, name: typings.semanticUiApi.semanticUiApiStrings.api, value: Unit): StringDictionary[String]
  def api(behavior: setting, name: beforeSend, value: js.Function1[/* settings */ ApiSettings, js.Any]): JQuery
  def api(behavior: setting, name: beforeSend, value: Unit): js.Function1[/* settings */ ApiSettings, js.Any]
  def api(behavior: setting, name: beforeXHR, value: js.Function1[/* xhrObject */ jqXHR[js.Any], js.Any]): JQuery
  def api(behavior: setting, name: beforeXHR, value: Unit): js.Function1[/* xhrObject */ jqXHR[js.Any], js.Any]
  def api(behavior: setting, name: cache, value: Boolean): JQuery
  def api(behavior: setting, name: cache, value: Unit): local | Boolean
  def api(behavior: setting, name: cache, value: local): JQuery
  def api(behavior: setting, name: className, value: Unit): ClassNameSettings
  def api(behavior: setting, name: className, value: ClassNameSettings): JQuery
  def api(behavior: setting, name: dataType, value: Unit): xml | json | jsonp | script | html | text
  def api(behavior: setting, name: dataType, value: html): JQuery
  def api(behavior: setting, name: dataType, value: json): JQuery
  def api(behavior: setting, name: dataType, value: jsonp): JQuery
  def api(behavior: setting, name: dataType, value: script): JQuery
  def api(behavior: setting, name: dataType, value: text): JQuery
  def api(behavior: setting, name: dataType, value: xml): JQuery
  def api(
    behavior: setting,
    name: data,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl['data'] */ js.Any
  ): JQuery
  def api(behavior: setting, name: data, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl['data'] */ js.Any
  def api(behavior: setting, name: debug, value: Boolean): JQuery
  def api(behavior: setting, name: debug, value: Unit): Boolean
  def api(behavior: setting, name: defaultData, value: Boolean): JQuery
  def api(behavior: setting, name: defaultData, value: Unit): Boolean
  def api(behavior: setting, name: encodeParameters, value: Boolean): JQuery
  def api(behavior: setting, name: encodeParameters, value: Unit): Boolean
  def api(behavior: setting, name: errorDuration, value: Double): JQuery
  def api(behavior: setting, name: errorDuration, value: Unit): `true` | Double
  def api(behavior: setting, name: errorDuration, value: `true`): JQuery
  def api(behavior: setting, name: error, value: Unit): ErrorSettings
  def api(behavior: setting, name: error, value: ErrorSettings): JQuery
  def api(behavior: setting, name: hideError, value: Boolean): JQuery
  def api(behavior: setting, name: hideError, value: Unit): auto | Boolean
  def api(behavior: setting, name: hideError, value: auto): JQuery
  def api(behavior: setting, name: interruptRequests, value: Boolean): JQuery
  def api(behavior: setting, name: interruptRequests, value: Unit): Boolean
  def api(behavior: setting, name: loadingDuration, value: Double): JQuery
  def api(behavior: setting, name: loadingDuration, value: Unit): Double
  def api(behavior: setting, name: metadata, value: Unit): MetadataSettings
  def api(behavior: setting, name: metadata, value: MetadataSettings): JQuery
  def api(behavior: setting, name: method, value: Unit): post | get | put | delete | head | options | patch
  def api(behavior: setting, name: method, value: delete): JQuery
  def api(behavior: setting, name: method, value: get): JQuery
  def api(behavior: setting, name: method, value: head): JQuery
  def api(behavior: setting, name: method, value: options): JQuery
  def api(behavior: setting, name: method, value: patch): JQuery
  def api(behavior: setting, name: method, value: post): JQuery
  def api(behavior: setting, name: method, value: put): JQuery
  def api(
    behavior: setting,
    name: mockResponseAsync,
    value: js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]
  ): JQuery
  def api(behavior: setting, name: mockResponseAsync, value: Unit): (js.Function2[
    /* settings */ ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false`
  def api(behavior: setting, name: mockResponseAsync, value: `false`): JQuery
  def api(behavior: setting, name: mockResponse, value: js.Any): JQuery
  def api(behavior: setting, name: mockResponse, value: Unit): js.Any | `false`
  def api(behavior: setting, name: mockResponse, value: `false`): JQuery
  def api(behavior: setting, name: namespace, value: String): JQuery
  def api(behavior: setting, name: namespace, value: Unit): String
  def api(behavior: setting, name: name, value: String): JQuery
  def api(behavior: setting, name: name, value: Unit): String
  def api(
    behavior: setting,
    name: onAbort,
    value: js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[js.Any], Unit]
  ): JQuery
  def api(behavior: setting, name: onAbort, value: Unit): js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[js.Any], Unit]
  def api(
    behavior: setting,
    name: onComplete,
    value: js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[js.Any], Unit]
  ): JQuery
  def api(behavior: setting, name: onComplete, value: Unit): js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[js.Any], Unit]
  def api(
    behavior: setting,
    name: onError,
    value: js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[js.Any], Unit]
  ): JQuery
  def api(behavior: setting, name: onError, value: Unit): js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[js.Any], Unit]
  def api(
    behavior: setting,
    name: onFailure,
    value: js.Function2[/* response */ js.Any, /* element */ JQuery, Unit]
  ): JQuery
  def api(behavior: setting, name: onFailure, value: Unit): js.Function2[/* response */ js.Any, /* element */ JQuery, Unit]
  def api(
    behavior: setting,
    name: onRequest,
    value: js.Function2[/* promise */ Deferred[js.Any, js.Any, js.Any], /* xhr */ jqXHR[js.Any], Unit]
  ): JQuery
  def api(behavior: setting, name: onRequest, value: Unit): js.Function2[/* promise */ Deferred[js.Any, js.Any, js.Any], /* xhr */ jqXHR[js.Any], Unit]
  def api(behavior: setting, name: onResponse, value: js.Function1[/* response */ js.Any, Unit]): JQuery
  def api(behavior: setting, name: onResponse, value: Unit): js.Function1[/* response */ js.Any, Unit]
  def api(
    behavior: setting,
    name: onSuccess,
    value: js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[js.Any], Unit]
  ): JQuery
  def api(behavior: setting, name: onSuccess, value: Unit): js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[js.Any], Unit]
  def api(behavior: setting, name: on, value: String): JQuery
  def api(behavior: setting, name: on, value: Unit): String
  def api(behavior: setting, name: performance, value: Boolean): JQuery
  def api(behavior: setting, name: performance, value: Unit): Boolean
  def api(behavior: setting, name: regExp, value: Unit): RegExpSettings
  def api(behavior: setting, name: regExp, value: RegExpSettings): JQuery
  def api(
    behavior: setting,
    name: responseAsync,
    value: js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]
  ): JQuery
  def api(behavior: setting, name: responseAsync, value: Unit): (js.Function2[
    /* settings */ ApiSettings, 
    /* callback */ js.Function1[/* response */ js.Any, Unit], 
    Unit
  ]) | `false`
  def api(behavior: setting, name: responseAsync, value: `false`): JQuery
  def api(behavior: setting, name: response, value: js.Any): JQuery
  def api(behavior: setting, name: response, value: Unit): js.Any | `false`
  def api(behavior: setting, name: response, value: `false`): JQuery
  def api(behavior: setting, name: selector, value: Unit): SelectorSettings
  def api(behavior: setting, name: selector, value: SelectorSettings): JQuery
  def api(behavior: setting, name: serializeForm, value: Boolean): JQuery
  def api(behavior: setting, name: serializeForm, value: Unit): Boolean
  def api(behavior: setting, name: silent, value: Boolean): JQuery
  def api(behavior: setting, name: silent, value: Unit): Boolean
  def api(behavior: setting, name: stateContext, value: String): JQuery
  def api(behavior: setting, name: stateContext, value: Unit): String | JQuery
  def api(behavior: setting, name: stateContext, value: JQuery): JQuery
  def api(behavior: setting, name: successTest, value: js.Function1[/* response */ js.Any, Boolean]): JQuery
  def api(behavior: setting, name: successTest, value: Unit): js.Function1[/* response */ js.Any, Boolean]
  def api(behavior: setting, name: throttleFirstRequest, value: Boolean): JQuery
  def api(behavior: setting, name: throttleFirstRequest, value: Unit): Boolean
  def api(behavior: setting, name: throttle, value: Double): JQuery
  def api(behavior: setting, name: throttle, value: Unit): Double
  def api(behavior: setting, name: urlData, value: js.Any): JQuery
  def api(behavior: setting, name: urlData, value: Unit): js.Any | `false`
  def api(behavior: setting, name: urlData, value: `false`): JQuery
  def api(behavior: setting, name: url, value: String): JQuery
  def api(behavior: setting, name: url, value: Unit): String | `false`
  def api(behavior: setting, name: url, value: `false`): JQuery
  def api(behavior: setting, name: verbose, value: Boolean): JQuery
  def api(behavior: setting, name: verbose, value: Unit): Boolean
  def api(settings: ApiSettings): JQuery
  @JSName("api")
  var api_Original: Api
  /**
    * Aborts current API request
    */
  @JSName("api")
  def api_abort(behavior: abort): JQuery
  /**
    * Adds data to existing templated url and returns full url string
    */
  @JSName("api")
  def api_addurldata(behavior: `add url data`, url: String, data: js.Any): String
  /**
    * Creates new cache, removing all locally cached URLs
    */
  @JSName("api")
  def api_createcache(behavior: `create cache`): JQuery
  /**
    * Removes API settings from the page and all events
    */
  @JSName("api")
  def api_destroy(behavior: destroy): JQuery
  /**
    * Gets event that API request will occur on
    */
  @JSName("api")
  def api_getevent(behavior: `get event`): String
  /**
    * Gets promise for current API request
    */
  @JSName("api")
  def api_getrequest(behavior: `get request`): JQueryDeferred[js.Any] | `false`
  /**
    * Returns encodeURIComponent value only if value passed is not already encoded
    */
  @JSName("api")
  def api_geturlencodedvalue(behavior: `get url encoded value`, value: js.Any): String
  /**
    * Returns whether element is disabled
    */
  @JSName("api")
  def api_isdisabled(behavior: `is disabled`): Boolean
  /**
    * Returns whether element is loading
    */
  @JSName("api")
  def api_isloading(behavior: `is loading`): Boolean
  /**
    * Returns whether element response is mocked
    */
  @JSName("api")
  def api_ismocked(behavior: `is mocked`): Boolean
  /**
    * Execute query using existing API settings
    */
  @JSName("api")
  def api_query(behavior: query): JQuery
  /**
    * Reads a locally cached response for a URL
    */
  @JSName("api")
  def api_readcachedresponse(behavior: `read cached response`, url: String): js.Any
  /**
    * Removes error state to element
    */
  @JSName("api")
  def api_removeerror(behavior: `remove error`): JQuery
  /**
    * Removes loading state to element
    */
  @JSName("api")
  def api_removeloading(behavior: `remove loading`): JQuery
  /**
    * Removes loading and error state from element
    */
  @JSName("api")
  def api_reset(behavior: reset): JQuery
  /**
    * Sets error state to element
    */
  @JSName("api")
  def api_seterror(behavior: `set error`): JQuery
  /**
    * Sets loading state to element
    */
  @JSName("api")
  def api_setloading(behavior: `set loading`): JQuery
  @JSName("api")
  def api_setting(behavior: setting, value: ApiSettings): JQuery
  /**
    * Returns whether last request was cancelled
    */
  @JSName("api")
  def api_wascancelled(behavior: `was cancelled`): Boolean
  /**
    * Returns whether last request was completed
    */
  @JSName("api")
  def api_wascomplete(behavior: `was complete`): Boolean
  /**
    * Returns whether last request was failure
    */
  @JSName("api")
  def api_wasfailure(behavior: `was failure`): Boolean
  /**
    * Returns whether last request was successful
    */
  @JSName("api")
  def api_wassuccessful(behavior: `was successful`): Boolean
  /**
    * Writes a cached response for a URL
    */
  @JSName("api")
  def api_writecachedresponse(behavior: `write cached response`, url: String, response: js.Any): JQuery
}
object JQueryStatic {
  
  inline def apply(api: Api): JQueryStatic = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setApi(value: Api): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
  }
}
