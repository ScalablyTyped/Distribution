package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery.Deferred
import typings.jquery.JQuery.jqXHR
import typings.semanticUiApi.JQuery
import typings.semanticUiApi.SemanticUI.Api.ClassNameSettings
import typings.semanticUiApi.SemanticUI.Api.ErrorSettings
import typings.semanticUiApi.SemanticUI.Api.MetadataSettings
import typings.semanticUiApi.SemanticUI.Api.RegExpSettings
import typings.semanticUiApi.SemanticUI.Api.SelectorSettings
import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiApi.SemanticUI.ApiSettings.Param
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'onComplete'> & std.Partial<std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, keyof semantic-ui-api.SemanticUI.ApiSettings._Impl>> */
trait PickImplonCompletePartial
  extends StObject
     with Param {
  
  var action: js.UndefOr[String | `false`] = js.undefined
  
  var api: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var beforeSend: js.UndefOr[js.Function1[/* settings */ ApiSettings, Any]] = js.undefined
  
  var beforeXHR: js.UndefOr[js.Function1[/* xhrObject */ jqXHR[Any], Any]] = js.undefined
  
  var cache: js.UndefOr[local | Boolean] = js.undefined
  
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var dataType: js.UndefOr[xml | json | jsonp | script | html | text] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var defaultData: js.UndefOr[Boolean] = js.undefined
  
  var encodeParameters: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[ErrorSettings] = js.undefined
  
  var errorDuration: js.UndefOr[`true` | Double] = js.undefined
  
  var hideError: js.UndefOr[auto | Boolean] = js.undefined
  
  var interruptRequests: js.UndefOr[Boolean] = js.undefined
  
  var loadingDuration: js.UndefOr[Double] = js.undefined
  
  var metadata: js.UndefOr[MetadataSettings] = js.undefined
  
  var method: js.UndefOr[post | get | put | delete | head | options | patch] = js.undefined
  
  var mockResponse: js.UndefOr[Any | `false`] = js.undefined
  
  var mockResponseAsync: js.UndefOr[
    (js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ Any, Unit], 
      Unit
    ]) | `false`
  ] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var on: js.UndefOr[String] = js.undefined
  
  var onAbort: js.UndefOr[
    js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[Any], Unit]
  ] = js.undefined
  
  def onComplete(response: Any, element: JQuery, xhr: jqXHR[Any]): Unit
  @JSName("onComplete")
  var onComplete_Original: (js.Function3[/* response */ Any, /* element */ JQuery, /* xhr */ jqXHR[Any], Unit]) & (js.UndefOr[
    js.Function3[/* response */ Any, /* element */ JQuery, /* xhr */ jqXHR[Any], Unit]
  ])
  
  var onError: js.UndefOr[
    js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[Any], Unit]
  ] = js.undefined
  
  var onFailure: js.UndefOr[js.Function2[/* response */ Any, /* element */ JQuery, Unit]] = js.undefined
  
  var onRequest: js.UndefOr[js.Function2[/* promise */ Deferred[Any, Any, Any], /* xhr */ jqXHR[Any], Unit]] = js.undefined
  
  var onResponse: js.UndefOr[js.Function1[/* response */ Any, Unit]] = js.undefined
  
  var onSuccess: js.UndefOr[
    js.Function3[/* response */ Any, /* element */ JQuery, /* xhr */ jqXHR[Any], Unit]
  ] = js.undefined
  
  var performance: js.UndefOr[Boolean] = js.undefined
  
  var regExp: js.UndefOr[RegExpSettings] = js.undefined
  
  var response: js.UndefOr[Any | `false`] = js.undefined
  
  var responseAsync: js.UndefOr[
    (js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ Any, Unit], 
      Unit
    ]) | `false`
  ] = js.undefined
  
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  
  var serializeForm: js.UndefOr[Boolean] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var stateContext: js.UndefOr[String | JQuery] = js.undefined
  
  var successTest: js.UndefOr[js.Function1[/* response */ Any, Boolean]] = js.undefined
  
  var throttle: js.UndefOr[Double] = js.undefined
  
  var throttleFirstRequest: js.UndefOr[Boolean] = js.undefined
  
  var url: js.UndefOr[String | `false`] = js.undefined
  
  var urlData: js.UndefOr[Any | `false`] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object PickImplonCompletePartial {
  
  inline def apply(
    onComplete: (js.Function3[/* response */ Any, /* element */ JQuery, /* xhr */ jqXHR[Any], Unit]) & (js.UndefOr[
      js.Function3[/* response */ Any, /* element */ JQuery, /* xhr */ jqXHR[Any], Unit]
    ])
  ): PickImplonCompletePartial = {
    val __obj = js.Dynamic.literal(onComplete = onComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonCompletePartial]
  }
  
  extension [Self <: PickImplonCompletePartial](x: Self) {
    
    inline def setAction(value: String | `false`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setApi(value: StringDictionary[String]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setBeforeSend(value: /* settings */ ApiSettings => Any): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
    
    inline def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    inline def setBeforeXHR(value: /* xhrObject */ jqXHR[Any] => Any): Self = StObject.set(x, "beforeXHR", js.Any.fromFunction1(value))
    
    inline def setBeforeXHRUndefined: Self = StObject.set(x, "beforeXHR", js.undefined)
    
    inline def setCache(value: local | Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: xml | json | jsonp | script | html | text): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDefaultData(value: Boolean): Self = StObject.set(x, "defaultData", value.asInstanceOf[js.Any])
    
    inline def setDefaultDataUndefined: Self = StObject.set(x, "defaultData", js.undefined)
    
    inline def setEncodeParameters(value: Boolean): Self = StObject.set(x, "encodeParameters", value.asInstanceOf[js.Any])
    
    inline def setEncodeParametersUndefined: Self = StObject.set(x, "encodeParameters", js.undefined)
    
    inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorDuration(value: `true` | Double): Self = StObject.set(x, "errorDuration", value.asInstanceOf[js.Any])
    
    inline def setErrorDurationUndefined: Self = StObject.set(x, "errorDuration", js.undefined)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setHideError(value: auto | Boolean): Self = StObject.set(x, "hideError", value.asInstanceOf[js.Any])
    
    inline def setHideErrorUndefined: Self = StObject.set(x, "hideError", js.undefined)
    
    inline def setInterruptRequests(value: Boolean): Self = StObject.set(x, "interruptRequests", value.asInstanceOf[js.Any])
    
    inline def setInterruptRequestsUndefined: Self = StObject.set(x, "interruptRequests", js.undefined)
    
    inline def setLoadingDuration(value: Double): Self = StObject.set(x, "loadingDuration", value.asInstanceOf[js.Any])
    
    inline def setLoadingDurationUndefined: Self = StObject.set(x, "loadingDuration", js.undefined)
    
    inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMethod(value: post | get | put | delete | head | options | patch): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMockResponse(value: Any | `false`): Self = StObject.set(x, "mockResponse", value.asInstanceOf[js.Any])
    
    inline def setMockResponseAsync(
      value: (js.Function2[
          /* settings */ ApiSettings, 
          /* callback */ js.Function1[/* response */ Any, Unit], 
          Unit
        ]) | `false`
    ): Self = StObject.set(x, "mockResponseAsync", value.asInstanceOf[js.Any])
    
    inline def setMockResponseAsyncFunction2(value: (/* settings */ ApiSettings, /* callback */ js.Function1[/* response */ Any, Unit]) => Unit): Self = StObject.set(x, "mockResponseAsync", js.Any.fromFunction2(value))
    
    inline def setMockResponseAsyncUndefined: Self = StObject.set(x, "mockResponseAsync", js.undefined)
    
    inline def setMockResponseUndefined: Self = StObject.set(x, "mockResponse", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnAbort(value: (/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[Any]) => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction3(value))
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnComplete(
      value: (js.Function3[/* response */ Any, /* element */ JQuery, /* xhr */ jqXHR[Any], Unit]) & (js.UndefOr[
          js.Function3[/* response */ Any, /* element */ JQuery, /* xhr */ jqXHR[Any], Unit]
        ])
    ): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
    
    inline def setOnError(value: (/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[Any]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFailure(value: (/* response */ Any, /* element */ JQuery) => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction2(value))
    
    inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    inline def setOnRequest(value: (/* promise */ Deferred[Any, Any, Any], /* xhr */ jqXHR[Any]) => Unit): Self = StObject.set(x, "onRequest", js.Any.fromFunction2(value))
    
    inline def setOnRequestUndefined: Self = StObject.set(x, "onRequest", js.undefined)
    
    inline def setOnResponse(value: /* response */ Any => Unit): Self = StObject.set(x, "onResponse", js.Any.fromFunction1(value))
    
    inline def setOnResponseUndefined: Self = StObject.set(x, "onResponse", js.undefined)
    
    inline def setOnSuccess(value: (/* response */ Any, /* element */ JQuery, /* xhr */ jqXHR[Any]) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    inline def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
    
    inline def setResponse(value: Any | `false`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseAsync(
      value: (js.Function2[
          /* settings */ ApiSettings, 
          /* callback */ js.Function1[/* response */ Any, Unit], 
          Unit
        ]) | `false`
    ): Self = StObject.set(x, "responseAsync", value.asInstanceOf[js.Any])
    
    inline def setResponseAsyncFunction2(value: (/* settings */ ApiSettings, /* callback */ js.Function1[/* response */ Any, Unit]) => Unit): Self = StObject.set(x, "responseAsync", js.Any.fromFunction2(value))
    
    inline def setResponseAsyncUndefined: Self = StObject.set(x, "responseAsync", js.undefined)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSerializeForm(value: Boolean): Self = StObject.set(x, "serializeForm", value.asInstanceOf[js.Any])
    
    inline def setSerializeFormUndefined: Self = StObject.set(x, "serializeForm", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setStateContext(value: String | JQuery): Self = StObject.set(x, "stateContext", value.asInstanceOf[js.Any])
    
    inline def setStateContextUndefined: Self = StObject.set(x, "stateContext", js.undefined)
    
    inline def setSuccessTest(value: /* response */ Any => Boolean): Self = StObject.set(x, "successTest", js.Any.fromFunction1(value))
    
    inline def setSuccessTestUndefined: Self = StObject.set(x, "successTest", js.undefined)
    
    inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThrottleFirstRequest(value: Boolean): Self = StObject.set(x, "throttleFirstRequest", value.asInstanceOf[js.Any])
    
    inline def setThrottleFirstRequestUndefined: Self = StObject.set(x, "throttleFirstRequest", js.undefined)
    
    inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    
    inline def setUrl(value: String | `false`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlData(value: Any | `false`): Self = StObject.set(x, "urlData", value.asInstanceOf[js.Any])
    
    inline def setUrlDataUndefined: Self = StObject.set(x, "urlData", js.undefined)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
