package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.subscriberMod.Subscriber
import typings.std.Error
import typings.std.Event
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajaxObservableMod {
  
  @JSImport("rxjs/internal/observable/dom/AjaxObservable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AjaxError
    extends StObject
       with Error {
    
    /** @type {AjaxRequest} The AjaxRequest associated with the error */
    var request: AjaxRequest
    
    /** @type {string|ArrayBuffer|Document|object|any} The response data */
    var response: js.Any
    
    /** @type {string} The responseType (e.g. 'json', 'arraybuffer', or 'xml') */
    var responseType: String
    
    /** @type {number} The HTTP status code */
    var status: Double
    
    /** @type {XMLHttpRequest} The XHR instance associated with the error */
    var xhr: XMLHttpRequest
  }
  object AjaxError {
    
    @JSImport("rxjs/internal/observable/dom/AjaxObservable", "AjaxError")
    @js.native
    val ^ : AjaxErrorCtor = js.native
    
    extension [Self <: AjaxError](x: Self) {
      
      inline def setRequest(value: AjaxRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/observable/dom/AjaxObservable", "AjaxError")
  @js.native
  class AjaxErrorCls protected ()
    extends StObject
       with AjaxError {
    def this(message: String, xhr: XMLHttpRequest, request: AjaxRequest) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /** @type {AjaxRequest} The AjaxRequest associated with the error */
    /* CompleteClass */
    var request: AjaxRequest = js.native
    
    /** @type {string|ArrayBuffer|Document|object|any} The response data */
    /* CompleteClass */
    var response: js.Any = js.native
    
    /** @type {string} The responseType (e.g. 'json', 'arraybuffer', or 'xml') */
    /* CompleteClass */
    var responseType: String = js.native
    
    /** @type {number} The HTTP status code */
    /* CompleteClass */
    var status: Double = js.native
    
    /** @type {XMLHttpRequest} The XHR instance associated with the error */
    /* CompleteClass */
    var xhr: XMLHttpRequest = js.native
  }
  
  @JSImport("rxjs/internal/observable/dom/AjaxObservable", "AjaxObservable")
  @js.native
  class AjaxObservable[T] protected () extends Observable[T] {
    def this(urlOrRequest: String) = this()
    def this(urlOrRequest: AjaxRequest) = this()
    
    /* private */ var request: js.Any = js.native
  }
  /* static members */
  object AjaxObservable {
    
    @JSImport("rxjs/internal/observable/dom/AjaxObservable", "AjaxObservable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an observable for an Ajax request with either a request object with
      * url, headers, etc or a string for a URL.
      *
      * ## Example
      * ```ts
      * import { ajax } from 'rxjs/ajax';
      *
      * const source1 = ajax('/products');
      * const source2 = ajax({ url: 'products', method: 'GET' });
      * ```
      *
      * @param {string|Object} request Can be one of the following:
      *   A string of the URL to make the Ajax call.
      *   An object with the following properties
      *   - url: URL of the request
      *   - body: The body of the request
      *   - method: Method of the request, such as GET, POST, PUT, PATCH, DELETE
      *   - async: Whether the request is async
      *   - headers: Optional headers
      *   - crossDomain: true if a cross domain request, else false
      *   - createXHR: a function to override if you need to use an alternate
      *   XMLHttpRequest implementation.
      *   - resultSelector: a function to use to alter the output value type of
      *   the Observable. Gets {@link AjaxResponse} as an argument.
      * @return {Observable} An observable sequence containing the XMLHttpRequest.
      * @static true
      * @name ajax
      * @owner Observable
      * @nocollapse
      */
    @JSImport("rxjs/internal/observable/dom/AjaxObservable", "AjaxObservable.create")
    @js.native
    def create: AjaxCreationMethod = js.native
    /**
      * Creates an observable for an Ajax request with either a request object with
      * url, headers, etc or a string for a URL.
      *
      * ## Example
      * ```ts
      * import { ajax } from 'rxjs/ajax';
      *
      * const source1 = ajax('/products');
      * const source2 = ajax({ url: 'products', method: 'GET' });
      * ```
      *
      * @param {string|Object} request Can be one of the following:
      *   A string of the URL to make the Ajax call.
      *   An object with the following properties
      *   - url: URL of the request
      *   - body: The body of the request
      *   - method: Method of the request, such as GET, POST, PUT, PATCH, DELETE
      *   - async: Whether the request is async
      *   - headers: Optional headers
      *   - crossDomain: true if a cross domain request, else false
      *   - createXHR: a function to override if you need to use an alternate
      *   XMLHttpRequest implementation.
      *   - resultSelector: a function to use to alter the output value type of
      *   the Observable. Gets {@link AjaxResponse} as an argument.
      * @return {Observable} An observable sequence containing the XMLHttpRequest.
      * @static true
      * @name ajax
      * @owner Observable
      * @nocollapse
      */
    inline def create(urlOrRequest: String): Observable[AjaxResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(urlOrRequest.asInstanceOf[js.Any]).asInstanceOf[Observable[AjaxResponse]]
    inline def create(urlOrRequest: AjaxRequest): Observable[AjaxResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(urlOrRequest.asInstanceOf[js.Any]).asInstanceOf[Observable[AjaxResponse]]
    inline def create_=(x: AjaxCreationMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs/internal/observable/dom/AjaxObservable", "AjaxResponse")
  @js.native
  class AjaxResponse protected () extends StObject {
    def this(originalEvent: Event, xhr: XMLHttpRequest, request: AjaxRequest) = this()
    
    var originalEvent: Event = js.native
    
    var request: AjaxRequest = js.native
    
    /** @type {string|ArrayBuffer|Document|object|any} The response data */
    var response: js.Any = js.native
    
    /** @type {string} The raw responseText */
    var responseText: String = js.native
    
    /** @type {string} The responseType (e.g. 'json', 'arraybuffer', or 'xml') */
    var responseType: String = js.native
    
    /** @type {number} The HTTP status code */
    var status: Double = js.native
    
    var xhr: XMLHttpRequest = js.native
  }
  
  @JSImport("rxjs/internal/observable/dom/AjaxObservable", "AjaxSubscriber")
  @js.native
  class AjaxSubscriber[T] protected () extends Subscriber[Event] {
    def this(destination: Subscriber[T], request: AjaxRequest) = this()
    
    /* private */ var done: js.Any = js.native
    
    /* private */ var getHeader: js.Any = js.native
    
    var request: AjaxRequest = js.native
    
    /* private */ var send: js.Any = js.native
    
    /* private */ var serializeBody: js.Any = js.native
    
    /* private */ var setHeaders: js.Any = js.native
    
    /* private */ var setupEvents: js.Any = js.native
    
    /* private */ var xhr: js.Any = js.native
  }
  
  @JSImport("rxjs/internal/observable/dom/AjaxObservable", "AjaxTimeoutError")
  @js.native
  val AjaxTimeoutError: AjaxTimeoutErrorCtor = js.native
  type AjaxTimeoutError = AjaxError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/observable/dom/AjaxObservable", "AjaxTimeoutError")
  @js.native
  class AjaxTimeoutErrorCls protected ()
    extends StObject
       with AjaxError {
    def this(xhr: XMLHttpRequest, request: AjaxRequest) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /** @type {AjaxRequest} The AjaxRequest associated with the error */
    /* CompleteClass */
    var request: AjaxRequest = js.native
    
    /** @type {string|ArrayBuffer|Document|object|any} The response data */
    /* CompleteClass */
    var response: js.Any = js.native
    
    /** @type {string} The responseType (e.g. 'json', 'arraybuffer', or 'xml') */
    /* CompleteClass */
    var responseType: String = js.native
    
    /** @type {number} The HTTP status code */
    /* CompleteClass */
    var status: Double = js.native
    
    /** @type {XMLHttpRequest} The XHR instance associated with the error */
    /* CompleteClass */
    var xhr: XMLHttpRequest = js.native
  }
  
  inline def ajaxDelete(url: String): Observable[AjaxResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajaxDelete")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[AjaxResponse]]
  inline def ajaxDelete(url: String, headers: js.Object): Observable[AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxDelete")(url.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Observable[AjaxResponse]]
  
  inline def ajaxGet(url: String): AjaxObservable[AjaxResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajaxGet")(url.asInstanceOf[js.Any]).asInstanceOf[AjaxObservable[AjaxResponse]]
  inline def ajaxGet(url: String, headers: js.Object): AjaxObservable[AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxGet")(url.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[AjaxObservable[AjaxResponse]]
  
  inline def ajaxGetJSON[T](url: String): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajaxGetJSON")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  inline def ajaxGetJSON[T](url: String, headers: js.Object): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxGetJSON")(url.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  
  inline def ajaxPatch(url: String): Observable[AjaxResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPatch")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[AjaxResponse]]
  inline def ajaxPatch(url: String, body: js.Any): Observable[AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPatch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Observable[AjaxResponse]]
  inline def ajaxPatch(url: String, body: js.Any, headers: js.Object): Observable[AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPatch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Observable[AjaxResponse]]
  inline def ajaxPatch(url: String, body: Unit, headers: js.Object): Observable[AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPatch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Observable[AjaxResponse]]
  
  inline def ajaxPost(url: String): Observable[AjaxResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPost")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[AjaxResponse]]
  inline def ajaxPost(url: String, body: js.Any): Observable[AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPost")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Observable[AjaxResponse]]
  inline def ajaxPost(url: String, body: js.Any, headers: js.Object): Observable[AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPost")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Observable[AjaxResponse]]
  inline def ajaxPost(url: String, body: Unit, headers: js.Object): Observable[AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPost")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Observable[AjaxResponse]]
  
  inline def ajaxPut(url: String): Observable[AjaxResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPut")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[AjaxResponse]]
  inline def ajaxPut(url: String, body: js.Any): Observable[AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPut")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Observable[AjaxResponse]]
  inline def ajaxPut(url: String, body: js.Any, headers: js.Object): Observable[AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPut")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Observable[AjaxResponse]]
  inline def ajaxPut(url: String, body: Unit, headers: js.Object): Observable[AjaxResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("ajaxPut")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Observable[AjaxResponse]]
  
  @js.native
  trait AjaxCreationMethod extends StObject {
    
    def apply(urlOrRequest: String): Observable[AjaxResponse] = js.native
    def apply(urlOrRequest: AjaxRequest): Observable[AjaxResponse] = js.native
    
    def delete(url: String): Observable[AjaxResponse] = js.native
    def delete(url: String, headers: js.Object): Observable[AjaxResponse] = js.native
    
    def get(url: String): Observable[AjaxResponse] = js.native
    def get(url: String, headers: js.Object): Observable[AjaxResponse] = js.native
    
    def getJSON[T](url: String): Observable[T] = js.native
    def getJSON[T](url: String, headers: js.Object): Observable[T] = js.native
    
    def patch(url: String): Observable[AjaxResponse] = js.native
    def patch(url: String, body: js.Any): Observable[AjaxResponse] = js.native
    def patch(url: String, body: js.Any, headers: js.Object): Observable[AjaxResponse] = js.native
    def patch(url: String, body: Unit, headers: js.Object): Observable[AjaxResponse] = js.native
    
    def post(url: String): Observable[AjaxResponse] = js.native
    def post(url: String, body: js.Any): Observable[AjaxResponse] = js.native
    def post(url: String, body: js.Any, headers: js.Object): Observable[AjaxResponse] = js.native
    def post(url: String, body: Unit, headers: js.Object): Observable[AjaxResponse] = js.native
    
    def put(url: String): Observable[AjaxResponse] = js.native
    def put(url: String, body: js.Any): Observable[AjaxResponse] = js.native
    def put(url: String, body: js.Any, headers: js.Object): Observable[AjaxResponse] = js.native
    def put(url: String, body: Unit, headers: js.Object): Observable[AjaxResponse] = js.native
  }
  
  @js.native
  trait AjaxErrorCtor
    extends StObject
       with Instantiable3[/* message */ String, /* xhr */ XMLHttpRequest, /* request */ AjaxRequest, AjaxError]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rxjs.rxjsStrings.AjaxError
    - typings.rxjs.rxjsStrings.AjaxTimeoutError
  */
  trait AjaxErrorNames extends StObject
  object AjaxErrorNames {
    
    inline def AjaxError: typings.rxjs.rxjsStrings.AjaxError = "AjaxError".asInstanceOf[typings.rxjs.rxjsStrings.AjaxError]
    
    inline def AjaxTimeoutError: typings.rxjs.rxjsStrings.AjaxTimeoutError = "AjaxTimeoutError".asInstanceOf[typings.rxjs.rxjsStrings.AjaxTimeoutError]
  }
  
  trait AjaxRequest extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var body: js.UndefOr[js.Any] = js.undefined
    
    var createXHR: js.UndefOr[js.Function0[XMLHttpRequest]] = js.undefined
    
    var crossDomain: js.UndefOr[Boolean] = js.undefined
    
    var hasContent: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var progressSubscriber: js.UndefOr[Subscriber[js.Any]] = js.undefined
    
    var responseType: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object AjaxRequest {
    
    inline def apply(): AjaxRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxRequest]
    }
    
    extension [Self <: AjaxRequest](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCreateXHR(value: () => XMLHttpRequest): Self = StObject.set(x, "createXHR", js.Any.fromFunction0(value))
      
      inline def setCreateXHRUndefined: Self = StObject.set(x, "createXHR", js.undefined)
      
      inline def setCrossDomain(value: Boolean): Self = StObject.set(x, "crossDomain", value.asInstanceOf[js.Any])
      
      inline def setCrossDomainUndefined: Self = StObject.set(x, "crossDomain", js.undefined)
      
      inline def setHasContent(value: Boolean): Self = StObject.set(x, "hasContent", value.asInstanceOf[js.Any])
      
      inline def setHasContentUndefined: Self = StObject.set(x, "hasContent", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setProgressSubscriber(value: Subscriber[js.Any]): Self = StObject.set(x, "progressSubscriber", value.asInstanceOf[js.Any])
      
      inline def setProgressSubscriberUndefined: Self = StObject.set(x, "progressSubscriber", js.undefined)
      
      inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  @js.native
  trait AjaxTimeoutErrorCtor
    extends StObject
       with Instantiable2[
          /* xhr */ XMLHttpRequest, 
          /* request */ AjaxRequest, 
          typings.rxjs.ajaxObservableMod.AjaxTimeoutError
        ]
}
