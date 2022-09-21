package typings.rxjs

import typings.rxjs.internalTypesMod.PartialObserver
import typings.rxjs.rxjsStrings.DollarLeftcurlybracketAjaxDirectionRightcurlybracket_DollarLeftcurlybracketProgressEventTypeRightcurlybracket
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.std.Record
import typings.std.URLSearchParams
import typings.std.XMLHttpRequest
import typings.std.XMLHttpRequestResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait AjaxConfig extends StObject {
    
    /**
      * Whether or not to send the request asynchronously. Defaults to `true`.
      * If set to `false`, this will block the thread until the AJAX request responds.
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The body of the HTTP request to send.
      *
      * This is serialized, by default, based off of the value of the `"content-type"` header.
      * For example, if the `"content-type"` is `"application/json"`, the body will be serialized
      * as JSON. If the `"content-type"` is `"application/x-www-form-urlencoded"`, whatever object passed
      * to the body will be serialized as URL, using key-value pairs based off of the keys and values of the object.
      * In all other cases, the body will be passed directly.
      */
    var body: js.UndefOr[Any] = js.undefined
    
    /**
      * An optional factory used to create the XMLHttpRequest object used to make the AJAX request.
      * This is useful in environments that lack `XMLHttpRequest`, or in situations where you
      * wish to override the default `XMLHttpRequest` for some reason.
      *
      * If not provided, the `XMLHttpRequest` in global scope will be used.
      *
      * NOTE: This AJAX implementation relies on the built-in serialization and setting
      * of Content-Type headers that is provided by standards-compliant XMLHttpRequest implementations,
      * be sure any implementation you use meets that standard.
      */
    var createXHR: js.UndefOr[js.Function0[XMLHttpRequest]] = js.undefined
    
    /**
      * Whether or not to send the HTTP request as a CORS request.
      * Defaults to `false`.
      *
      * @deprecated Will be removed in version 8. Cross domain requests and what creates a cross
      * domain request, are dictated by the browser, and a boolean that forces it to be cross domain
      * does not make sense. If you need to force cross domain, make sure you're making a secure request,
      * then add a custom header to the request or use `withCredentials`. For more information on what
      * triggers a cross domain request, see the [MDN documentation](https://developer.mozilla.org/en-US/docs/Web/HTTP/Access_control_CORS#Requests_with_credentials).
      * In particular, the section on [Simple Requests](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS#Simple_requests) is useful
      * for understanding when CORS will not be used.
      */
    var crossDomain: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The HTTP headers to apply.
      *
      * Note that, by default, RxJS will add the following headers under certain conditions:
      *
      * 1. If the `"content-type"` header is **NOT** set, and the `body` is [`FormData`](https://developer.mozilla.org/en-US/docs/Web/API/FormData),
      *    a `"content-type"` of `"application/x-www-form-urlencoded; charset=UTF-8"` will be set automatically.
      * 2. If the `"x-requested-with"` header is **NOT** set, and the `crossDomain` configuration property is **NOT** explicitly set to `true`,
      *    (meaning it is not a CORS request), a `"x-requested-with"` header with a value of `"XMLHttpRequest"` will be set automatically.
      *    This header is generally meaningless, and is set by libraries and frameworks using `XMLHttpRequest` to make HTTP requests.
      */
    var headers: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * If `true`, will emit all download progress and load complete events as {@link AjaxResponse}
      * from the observable. The final download event will also be emitted as a {@link AjaxResponse}.
      *
      * If both this and {@link includeUploadProgress} are `false`, then only the {@link AjaxResponse} will
      * be emitted from the resulting observable.
      */
    var includeDownloadProgress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, will emit all upload progress and load complete events as {@link AjaxResponse}
      * from the observable. The final download event will also be emitted as a {@link AjaxResponse}.
      *
      * If both this and {@link includeDownloadProgress} are `false`, then only the {@link AjaxResponse} will
      * be emitted from the resulting observable.
      */
    var includeUploadProgress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The HTTP Method to use for the request. Defaults to "GET".
      */
    var method: js.UndefOr[String] = js.undefined
    
    /** The user credentials password to send with the HTTP request*/
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * An observer for watching the upload progress of an HTTP request. Will
      * emit progress events, and completes on the final upload load event, will error for
      * any XHR error or timeout.
      *
      * This will **not** error for errored status codes. Rather, it will always _complete_ when
      * the HTTP response comes back.
      *
      * @deprecated If you're looking for progress events, use {@link includeDownloadProgress} and
      * {@link includeUploadProgress} instead. Will be removed in v8.
      */
    var progressSubscriber: js.UndefOr[PartialObserver[ProgressEvent[EventTarget]]] = js.undefined
    
    /**
      * Query string parameters to add to the URL in the request.
      * <em>This will require a polyfill for `URL` and `URLSearchParams` in Internet Explorer!</em>
      *
      * Accepts either a query string, a `URLSearchParams` object, a dictionary of key/value pairs, or an
      * array of key/value entry tuples. (Essentially, it takes anything that `new URLSearchParams` would normally take).
      *
      * If, for some reason you have a query string in the `url` argument, this will append to the query string in the url,
      * but it will also overwrite the value of any keys that are an exact match. In other words, a url of `/test?a=1&b=2`,
      * with queryParams of `{ b: 5, c: 6 }` will result in a url of roughly `/test?a=1&b=5&c=6`.
      */
    var queryParams: js.UndefOr[
        String | URLSearchParams | (Record[String, String | Double | Boolean | (js.Array[Boolean | Double | String])]) | (js.Array[
          js.Tuple2[String, String | Double | Boolean | (js.Array[Boolean | Double | String])]
        ])
      ] = js.undefined
    
    /**
      * Can be set to change the response type.
      * Valid values are `"arraybuffer"`, `"blob"`, `"document"`, `"json"`, and `"text"`.
      * Note that the type of `"document"` (such as an XML document) is ignored if the global context is
      * not `Window`.
      *
      * Defaults to `"json"`.
      */
    var responseType: js.UndefOr[XMLHttpRequestResponseType] = js.undefined
    
    /**
      * The time to wait before causing the underlying XMLHttpRequest to timeout. This is only honored if the
      * `async` configuration setting is unset or set to `true`. Defaults to `0`, which is idiomatic for "never timeout".
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /** The address of the resource to request via HTTP. */
    var url: String
    
    /** The user credentials user name to send with the HTTP request */
    var user: js.UndefOr[String] = js.undefined
    
    /**
      * To send user credentials in a CORS request, set to `true`. To exclude user credentials from
      * a CORS request, _OR_ when cookies are to be ignored by the CORS response, set to `false`.
      *
      * Defaults to `false`.
      */
    var withCredentials: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of your site's XSRF cookie.
      */
    var xsrfCookieName: js.UndefOr[String] = js.undefined
    
    /**
      * The name of a custom header that you can use to send your XSRF cookie.
      */
    var xsrfHeaderName: js.UndefOr[String] = js.undefined
  }
  object AjaxConfig {
    
    inline def apply(url: String): AjaxConfig = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AjaxConfig]
    }
    
    extension [Self <: AjaxConfig](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCreateXHR(value: () => XMLHttpRequest): Self = StObject.set(x, "createXHR", js.Any.fromFunction0(value))
      
      inline def setCreateXHRUndefined: Self = StObject.set(x, "createXHR", js.undefined)
      
      inline def setCrossDomain(value: Boolean): Self = StObject.set(x, "crossDomain", value.asInstanceOf[js.Any])
      
      inline def setCrossDomainUndefined: Self = StObject.set(x, "crossDomain", js.undefined)
      
      inline def setHeaders(value: Record[String, Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIncludeDownloadProgress(value: Boolean): Self = StObject.set(x, "includeDownloadProgress", value.asInstanceOf[js.Any])
      
      inline def setIncludeDownloadProgressUndefined: Self = StObject.set(x, "includeDownloadProgress", js.undefined)
      
      inline def setIncludeUploadProgress(value: Boolean): Self = StObject.set(x, "includeUploadProgress", value.asInstanceOf[js.Any])
      
      inline def setIncludeUploadProgressUndefined: Self = StObject.set(x, "includeUploadProgress", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setProgressSubscriber(value: PartialObserver[ProgressEvent[EventTarget]]): Self = StObject.set(x, "progressSubscriber", value.asInstanceOf[js.Any])
      
      inline def setProgressSubscriberUndefined: Self = StObject.set(x, "progressSubscriber", js.undefined)
      
      inline def setQueryParams(
        value: String | URLSearchParams | (Record[String, String | Double | Boolean | (js.Array[Boolean | Double | String])]) | (js.Array[
              js.Tuple2[String, String | Double | Boolean | (js.Array[Boolean | Double | String])]
            ])
      ): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      inline def setQueryParamsVarargs(value: (js.Tuple2[String, String | Double | Boolean | (js.Array[Boolean | Double | String])])*): Self = StObject.set(x, "queryParams", js.Array(value*))
      
      inline def setResponseType(value: XMLHttpRequestResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
      
      inline def setXsrfCookieName(value: String): Self = StObject.set(x, "xsrfCookieName", value.asInstanceOf[js.Any])
      
      inline def setXsrfCookieNameUndefined: Self = StObject.set(x, "xsrfCookieName", js.undefined)
      
      inline def setXsrfHeaderName(value: String): Self = StObject.set(x, "xsrfHeaderName", value.asInstanceOf[js.Any])
      
      inline def setXsrfHeaderNameUndefined: Self = StObject.set(x, "xsrfHeaderName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rxjs.rxjsStrings.upload
    - typings.rxjs.rxjsStrings.download
  */
  trait AjaxDirection extends StObject
  object AjaxDirection {
    
    inline def download: typings.rxjs.rxjsStrings.download = "download".asInstanceOf[typings.rxjs.rxjsStrings.download]
    
    inline def upload: typings.rxjs.rxjsStrings.upload = "upload".asInstanceOf[typings.rxjs.rxjsStrings.upload]
  }
  
  trait AjaxRequest extends StObject {
    
    /**
      * Whether or not the request was made asynchronously.
      */
    var async: Boolean
    
    /**
      * The body to send over the HTTP request.
      */
    var body: js.UndefOr[Any] = js.undefined
    
    /**
      * Whether or not the request was a CORS request.
      */
    var crossDomain: Boolean
    
    /**
      * The headers sent over the HTTP request.
      */
    var headers: Record[String, Any]
    
    /**
      * The HTTP method used to make the HTTP request.
      */
    var method: String
    
    /**
      * The user credentials password sent with the HTTP request.
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * The [`responseType`](https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/responseType) set before sending the request.
      */
    var responseType: XMLHttpRequestResponseType
    
    /**
      * The timeout value used for the HTTP request.
      * Note: this is only honored if the request is asynchronous (`async` is `true`).
      */
    var timeout: Double
    
    /**
      * The URL requested.
      */
    var url: String
    
    /**
      * The user credentials user name sent with the HTTP request.
      */
    var user: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not a CORS request was sent with credentials.
      * If `false`, will also ignore cookies in the CORS response.
      */
    var withCredentials: Boolean
  }
  object AjaxRequest {
    
    inline def apply(
      async: Boolean,
      crossDomain: Boolean,
      headers: Record[String, Any],
      method: String,
      responseType: XMLHttpRequestResponseType,
      timeout: Double,
      url: String,
      withCredentials: Boolean
    ): AjaxRequest = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], crossDomain = crossDomain.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[AjaxRequest]
    }
    
    extension [Self <: AjaxRequest](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCrossDomain(value: Boolean): Self = StObject.set(x, "crossDomain", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Record[String, Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setResponseType(value: XMLHttpRequestResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    }
  }
  
  type AjaxResponseType = DollarLeftcurlybracketAjaxDirectionRightcurlybracket_DollarLeftcurlybracketProgressEventTypeRightcurlybracket
  
  /* Rewritten from type alias, can be one of: 
    - typings.rxjs.rxjsStrings.loadstart
    - typings.rxjs.rxjsStrings.progress
    - typings.rxjs.rxjsStrings.load
  */
  trait ProgressEventType extends StObject
  object ProgressEventType {
    
    inline def load: typings.rxjs.rxjsStrings.load = "load".asInstanceOf[typings.rxjs.rxjsStrings.load]
    
    inline def loadstart: typings.rxjs.rxjsStrings.loadstart = "loadstart".asInstanceOf[typings.rxjs.rxjsStrings.loadstart]
    
    inline def progress: typings.rxjs.rxjsStrings.progress = "progress".asInstanceOf[typings.rxjs.rxjsStrings.progress]
  }
}
