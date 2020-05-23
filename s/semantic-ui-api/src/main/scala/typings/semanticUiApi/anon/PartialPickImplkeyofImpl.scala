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
trait PartialPickImplkeyofImpl extends js.Object {
  var action: js.UndefOr[String | `false`] = js.undefined
  var api: js.UndefOr[StringDictionary[String]] = js.undefined
  var beforeSend: js.UndefOr[js.Function1[/* settings */ ApiSettings, _]] = js.undefined
  var beforeXHR: js.UndefOr[js.Function1[/* xhrObject */ jqXHR[_], _]] = js.undefined
  var cache: js.UndefOr[local | Boolean] = js.undefined
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
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
  var mockResponse: js.UndefOr[js.Any | `false`] = js.undefined
  var mockResponseAsync: js.UndefOr[
    (js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | `false`
  ] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var on: js.UndefOr[String] = js.undefined
  var onAbort: js.UndefOr[
    js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ] = js.undefined
  var onComplete: js.UndefOr[
    js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ] = js.undefined
  var onError: js.UndefOr[
    js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ] = js.undefined
  var onFailure: js.UndefOr[js.Function2[/* response */ js.Any, /* element */ JQuery, Unit]] = js.undefined
  var onRequest: js.UndefOr[js.Function2[/* promise */ Deferred[_, _, _], /* xhr */ jqXHR[_], Unit]] = js.undefined
  var onResponse: js.UndefOr[js.Function1[/* response */ js.Any, Unit]] = js.undefined
  var onSuccess: js.UndefOr[
    js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit]
  ] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var regExp: js.UndefOr[RegExpSettings] = js.undefined
  var response: js.UndefOr[js.Any | `false`] = js.undefined
  var responseAsync: js.UndefOr[
    (js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | `false`
  ] = js.undefined
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  var serializeForm: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var stateContext: js.UndefOr[String | JQuery] = js.undefined
  var successTest: js.UndefOr[js.Function1[/* response */ js.Any, Boolean]] = js.undefined
  var throttle: js.UndefOr[Double] = js.undefined
  var throttleFirstRequest: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[String | `false`] = js.undefined
  var urlData: js.UndefOr[js.Any | `false`] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    action: String | `false` = null,
    api: StringDictionary[String] = null,
    beforeSend: /* settings */ ApiSettings => _ = null,
    beforeXHR: /* xhrObject */ jqXHR[_] => _ = null,
    cache: local | Boolean = null,
    className: ClassNameSettings = null,
    data: js.Any = null,
    dataType: xml | json | jsonp | script | html | text = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    defaultData: js.UndefOr[Boolean] = js.undefined,
    encodeParameters: js.UndefOr[Boolean] = js.undefined,
    error: ErrorSettings = null,
    errorDuration: `true` | Double = null,
    hideError: auto | Boolean = null,
    interruptRequests: js.UndefOr[Boolean] = js.undefined,
    loadingDuration: js.UndefOr[Double] = js.undefined,
    metadata: MetadataSettings = null,
    method: post | get | put | delete | head | options | patch = null,
    mockResponse: js.Any | `false` = null,
    mockResponseAsync: (js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | `false` = null,
    name: String = null,
    namespace: String = null,
    on: String = null,
    onAbort: (/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_]) => Unit = null,
    onComplete: (/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_]) => Unit = null,
    onError: (/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_]) => Unit = null,
    onFailure: (/* response */ js.Any, /* element */ JQuery) => Unit = null,
    onRequest: (/* promise */ Deferred[_, _, _], /* xhr */ jqXHR[_]) => Unit = null,
    onResponse: /* response */ js.Any => Unit = null,
    onSuccess: (/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_]) => Unit = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    regExp: RegExpSettings = null,
    response: js.Any | `false` = null,
    responseAsync: (js.Function2[
      /* settings */ ApiSettings, 
      /* callback */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | `false` = null,
    selector: SelectorSettings = null,
    serializeForm: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    stateContext: String | JQuery = null,
    successTest: /* response */ js.Any => Boolean = null,
    throttle: js.UndefOr[Double] = js.undefined,
    throttleFirstRequest: js.UndefOr[Boolean] = js.undefined,
    url: String | `false` = null,
    urlData: js.Any | `false` = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (beforeXHR != null) __obj.updateDynamic("beforeXHR")(js.Any.fromFunction1(beforeXHR))
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultData)) __obj.updateDynamic("defaultData")(defaultData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(encodeParameters)) __obj.updateDynamic("encodeParameters")(encodeParameters.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (errorDuration != null) __obj.updateDynamic("errorDuration")(errorDuration.asInstanceOf[js.Any])
    if (hideError != null) __obj.updateDynamic("hideError")(hideError.asInstanceOf[js.Any])
    if (!js.isUndefined(interruptRequests)) __obj.updateDynamic("interruptRequests")(interruptRequests.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loadingDuration)) __obj.updateDynamic("loadingDuration")(loadingDuration.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mockResponse != null) __obj.updateDynamic("mockResponse")(mockResponse.asInstanceOf[js.Any])
    if (mockResponseAsync != null) __obj.updateDynamic("mockResponseAsync")(mockResponseAsync.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction3(onAbort))
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction3(onComplete))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction3(onError))
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction2(onFailure))
    if (onRequest != null) __obj.updateDynamic("onRequest")(js.Any.fromFunction2(onRequest))
    if (onResponse != null) __obj.updateDynamic("onResponse")(js.Any.fromFunction1(onResponse))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction3(onSuccess))
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.get.asInstanceOf[js.Any])
    if (regExp != null) __obj.updateDynamic("regExp")(regExp.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (responseAsync != null) __obj.updateDynamic("responseAsync")(responseAsync.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeForm)) __obj.updateDynamic("serializeForm")(serializeForm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (stateContext != null) __obj.updateDynamic("stateContext")(stateContext.asInstanceOf[js.Any])
    if (successTest != null) __obj.updateDynamic("successTest")(js.Any.fromFunction1(successTest))
    if (!js.isUndefined(throttle)) __obj.updateDynamic("throttle")(throttle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(throttleFirstRequest)) __obj.updateDynamic("throttleFirstRequest")(throttleFirstRequest.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urlData != null) __obj.updateDynamic("urlData")(urlData.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

