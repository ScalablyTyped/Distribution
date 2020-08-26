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
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, keyof semantic-ui-api.SemanticUI.ApiSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  var action: js.UndefOr[String | `false`] = js.native
  var api: js.UndefOr[StringDictionary[String]] = js.native
  var beforeSend: js.UndefOr[js.Function1[/* settings */ ApiSettings, _]] = js.native
  var beforeXHR: js.UndefOr[js.Function1[/* xhrObject */ jqXHR[_], _]] = js.native
  var cache: js.UndefOr[local | Boolean] = js.native
  var className: js.UndefOr[ClassNameSettings] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var dataType: js.UndefOr[xml | json | jsonp | script | html | text] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var defaultData: js.UndefOr[Boolean] = js.native
  var encodeParameters: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[ErrorSettings] = js.native
  var errorDuration: js.UndefOr[`true` | Double] = js.native
  var hideError: js.UndefOr[auto | Boolean] = js.native
  var interruptRequests: js.UndefOr[Boolean] = js.native
  var loadingDuration: js.UndefOr[Double] = js.native
  var metadata: js.UndefOr[MetadataSettings] = js.native
  var method: js.UndefOr[post | get | put | delete | head | options | patch] = js.native
  var mockResponse: js.UndefOr[js.Any | `false`] = js.native
  var mockResponseAsync: js.UndefOr[
    (js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | `false`
  ] = js.native
  var name: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var on: js.UndefOr[String] = js.native
  var onAbort: js.UndefOr[
    js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ] = js.native
  var onComplete: js.UndefOr[
    js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ] = js.native
  var onError: js.UndefOr[
    js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ] = js.native
  var onFailure: js.UndefOr[js.Function2[/* response */ js.Any, /* element */ JQuery, Unit]] = js.native
  var onRequest: js.UndefOr[js.Function2[/* promise */ Deferred[_, _, _], /* xhr */ jqXHR[_], Unit]] = js.native
  var onResponse: js.UndefOr[js.Function1[/* response */ js.Any, Unit]] = js.native
  var onSuccess: js.UndefOr[
    js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ] = js.native
  var performance: js.UndefOr[Boolean] = js.native
  var regExp: js.UndefOr[RegExpSettings] = js.native
  var response: js.UndefOr[js.Any | `false`] = js.native
  var responseAsync: js.UndefOr[
    (js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | `false`
  ] = js.native
  var selector: js.UndefOr[SelectorSettings] = js.native
  var serializeForm: js.UndefOr[Boolean] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var stateContext: js.UndefOr[String | JQuery] = js.native
  var successTest: js.UndefOr[js.Function1[/* response */ js.Any, Boolean]] = js.native
  var throttle: js.UndefOr[Double] = js.native
  var throttleFirstRequest: js.UndefOr[Boolean] = js.native
  var url: js.UndefOr[String | `false`] = js.native
  var urlData: js.UndefOr[js.Any | `false`] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
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
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setApi(value: StringDictionary[String]): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    @scala.inline
    def setBeforeSend(value: /* settings */ ApiSettings => _): Self = this.set("beforeSend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeSend: Self = this.set("beforeSend", js.undefined)
    @scala.inline
    def setBeforeXHR(value: /* xhrObject */ jqXHR[_] => _): Self = this.set("beforeXHR", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeXHR: Self = this.set("beforeXHR", js.undefined)
    @scala.inline
    def setCache(value: local | Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataType(value: xml | json | jsonp | script | html | text): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDefaultData(value: Boolean): Self = this.set("defaultData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultData: Self = this.set("defaultData", js.undefined)
    @scala.inline
    def setEncodeParameters(value: Boolean): Self = this.set("encodeParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodeParameters: Self = this.set("encodeParameters", js.undefined)
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setErrorDuration(value: `true` | Double): Self = this.set("errorDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorDuration: Self = this.set("errorDuration", js.undefined)
    @scala.inline
    def setHideError(value: auto | Boolean): Self = this.set("hideError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideError: Self = this.set("hideError", js.undefined)
    @scala.inline
    def setInterruptRequests(value: Boolean): Self = this.set("interruptRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterruptRequests: Self = this.set("interruptRequests", js.undefined)
    @scala.inline
    def setLoadingDuration(value: Double): Self = this.set("loadingDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingDuration: Self = this.set("loadingDuration", js.undefined)
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setMethod(value: post | get | put | delete | head | options | patch): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMockResponse(value: js.Any | `false`): Self = this.set("mockResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMockResponse: Self = this.set("mockResponse", js.undefined)
    @scala.inline
    def setMockResponseAsyncFunction2(
      value: (/* settings */ ApiSettings, /* callback */ js.Function1[/* response */ js.Any, Unit]) => Unit
    ): Self = this.set("mockResponseAsync", js.Any.fromFunction2(value))
    @scala.inline
    def setMockResponseAsync(
      value: (js.Function2[
          /* settings */ ApiSettings, 
          /* callback */ js.Function1[/* response */ js.Any, Unit], 
          Unit
        ]) | `false`
    ): Self = this.set("mockResponseAsync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMockResponseAsync: Self = this.set("mockResponseAsync", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setOn(value: String): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setOnAbort(value: (/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_]) => Unit): Self = this.set("onAbort", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    @scala.inline
    def setOnComplete(value: (/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_]) => Unit): Self = this.set("onComplete", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOnError(value: (/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_]) => Unit): Self = this.set("onError", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnFailure(value: (/* response */ js.Any, /* element */ JQuery) => Unit): Self = this.set("onFailure", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    @scala.inline
    def setOnRequest(value: (/* promise */ Deferred[_, _, _], /* xhr */ jqXHR[_]) => Unit): Self = this.set("onRequest", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRequest: Self = this.set("onRequest", js.undefined)
    @scala.inline
    def setOnResponse(value: /* response */ js.Any => Unit): Self = this.set("onResponse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResponse: Self = this.set("onResponse", js.undefined)
    @scala.inline
    def setOnSuccess(value: (/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_]) => Unit): Self = this.set("onSuccess", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    @scala.inline
    def setRegExp(value: RegExpSettings): Self = this.set("regExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegExp: Self = this.set("regExp", js.undefined)
    @scala.inline
    def setResponse(value: js.Any | `false`): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setResponseAsyncFunction2(
      value: (/* settings */ ApiSettings, /* callback */ js.Function1[/* response */ js.Any, Unit]) => Unit
    ): Self = this.set("responseAsync", js.Any.fromFunction2(value))
    @scala.inline
    def setResponseAsync(
      value: (js.Function2[
          /* settings */ ApiSettings, 
          /* callback */ js.Function1[/* response */ js.Any, Unit], 
          Unit
        ]) | `false`
    ): Self = this.set("responseAsync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseAsync: Self = this.set("responseAsync", js.undefined)
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setSerializeForm(value: Boolean): Self = this.set("serializeForm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerializeForm: Self = this.set("serializeForm", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setStateContext(value: String | JQuery): Self = this.set("stateContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateContext: Self = this.set("stateContext", js.undefined)
    @scala.inline
    def setSuccessTest(value: /* response */ js.Any => Boolean): Self = this.set("successTest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccessTest: Self = this.set("successTest", js.undefined)
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
    @scala.inline
    def setThrottleFirstRequest(value: Boolean): Self = this.set("throttleFirstRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottleFirstRequest: Self = this.set("throttleFirstRequest", js.undefined)
    @scala.inline
    def setUrl(value: String | `false`): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUrlData(value: js.Any | `false`): Self = this.set("urlData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlData: Self = this.set("urlData", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

