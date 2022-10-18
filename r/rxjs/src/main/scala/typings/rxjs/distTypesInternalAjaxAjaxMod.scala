package typings.rxjs

import typings.rxjs.distTypesInternalAjaxAjaxResponseMod.AjaxResponse
import typings.rxjs.distTypesInternalAjaxTypesMod.AjaxConfig
import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalAjaxAjaxMod {
  
  @JSImport("rxjs/dist/types/internal/ajax/ajax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/dist/types/internal/ajax/ajax", "ajax")
  @js.native
  val ajax: AjaxCreationMethod = js.native
  
  inline def fromAjax[T](init: AjaxConfig): Observable[AjaxResponse[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAjax")(init.asInstanceOf[js.Any]).asInstanceOf[Observable[AjaxResponse[T]]]
  
  @js.native
  trait AjaxCreationMethod extends StObject {
    
    /**
      * Creates an observable that will perform an AJAX request using the
      * [XMLHttpRequest](https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest) in
      * global scope by default.
      *
      * This is the most configurable option, and the basis for all other AJAX calls in the library.
      *
      * ## Example
      *
      * ```ts
      * import { ajax } from 'rxjs/ajax';
      * import { map, catchError, of } from 'rxjs';
      *
      * const obs$ = ajax({
      *   method: 'GET',
      *   url: 'https://api.github.com/users?per_page=5',
      *   responseType: 'json'
      * }).pipe(
      *   map(userResponse => console.log('users: ', userResponse)),
      *   catchError(error => {
      *     console.log('error: ', error);
      *     return of(error);
      *   })
      * );
      * ```
      */
    def apply[T](config: AjaxConfig): Observable[AjaxResponse[T]] = js.native
    /**
      * Perform an HTTP GET using the
      * [XMLHttpRequest](https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest) in
      * global scope. Defaults to a `responseType` of `"json"`.
      *
      * ## Example
      *
      * ```ts
      * import { ajax } from 'rxjs/ajax';
      * import { map, catchError, of } from 'rxjs';
      *
      * const obs$ = ajax('https://api.github.com/users?per_page=5').pipe(
      *   map(userResponse => console.log('users: ', userResponse)),
      *   catchError(error => {
      *     console.log('error: ', error);
      *     return of(error);
      *   })
      * );
      * ```
      */
    def apply[T](url: String): Observable[AjaxResponse[T]] = js.native
    
    /**
      * Performs an HTTP DELETE using the
      * [XMLHttpRequest](https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest) in
      * global scope by default, and a `responseType` of `"json"`.
      *
      * @param url The URL to get the resource from
      * @param headers Optional headers. Case-Insensitive.
      */
    def delete[T](url: String): Observable[AjaxResponse[T]] = js.native
    def delete[T](url: String, headers: Record[String, String]): Observable[AjaxResponse[T]] = js.native
    
    /**
      * Performs an HTTP GET using the
      * [XMLHttpRequest](https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest) in
      * global scope by default, and a `responseType` of `"json"`.
      *
      * @param url The URL to get the resource from
      * @param headers Optional headers. Case-Insensitive.
      */
    def get[T](url: String): Observable[AjaxResponse[T]] = js.native
    def get[T](url: String, headers: Record[String, String]): Observable[AjaxResponse[T]] = js.native
    
    /**
      * Performs an HTTP GET using the
      * [XMLHttpRequest](https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest) in
      * global scope by default, and returns the hydrated JavaScript object from the
      * response.
      *
      * @param url The URL to get the resource from
      * @param headers Optional headers. Case-Insensitive.
      */
    def getJSON[T](url: String): Observable[T] = js.native
    def getJSON[T](url: String, headers: Record[String, String]): Observable[T] = js.native
    
    /**
      * Performs an HTTP PATCH using the
      * [XMLHttpRequest](https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest) in
      * global scope by default, and a `responseType` of `"json"`.
      *
      * Before sending the value passed to the `body` argument, it is automatically serialized
      * based on the specified `responseType`. By default, a JavaScript object will be serialized
      * to JSON. A `responseType` of `application/x-www-form-urlencoded` will flatten any provided
      * dictionary object to a url-encoded string.
      *
      * @param url The URL to get the resource from
      * @param body The content to send. The body is automatically serialized.
      * @param headers Optional headers. Case-Insensitive.
      */
    def patch[T](url: String): Observable[AjaxResponse[T]] = js.native
    def patch[T](url: String, body: Any): Observable[AjaxResponse[T]] = js.native
    def patch[T](url: String, body: Any, headers: Record[String, String]): Observable[AjaxResponse[T]] = js.native
    def patch[T](url: String, body: Unit, headers: Record[String, String]): Observable[AjaxResponse[T]] = js.native
    
    /**
      * Performs an HTTP POST using the
      * [XMLHttpRequest](https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest) in
      * global scope by default, and a `responseType` of `"json"`.
      *
      * Before sending the value passed to the `body` argument, it is automatically serialized
      * based on the specified `responseType`. By default, a JavaScript object will be serialized
      * to JSON. A `responseType` of `application/x-www-form-urlencoded` will flatten any provided
      * dictionary object to a url-encoded string.
      *
      * @param url The URL to get the resource from
      * @param body The content to send. The body is automatically serialized.
      * @param headers Optional headers. Case-Insensitive.
      */
    def post[T](url: String): Observable[AjaxResponse[T]] = js.native
    def post[T](url: String, body: Any): Observable[AjaxResponse[T]] = js.native
    def post[T](url: String, body: Any, headers: Record[String, String]): Observable[AjaxResponse[T]] = js.native
    def post[T](url: String, body: Unit, headers: Record[String, String]): Observable[AjaxResponse[T]] = js.native
    
    /**
      * Performs an HTTP PUT using the
      * [XMLHttpRequest](https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest) in
      * global scope by default, and a `responseType` of `"json"`.
      *
      * Before sending the value passed to the `body` argument, it is automatically serialized
      * based on the specified `responseType`. By default, a JavaScript object will be serialized
      * to JSON. A `responseType` of `application/x-www-form-urlencoded` will flatten any provided
      * dictionary object to a url-encoded string.
      *
      * @param url The URL to get the resource from
      * @param body The content to send. The body is automatically serialized.
      * @param headers Optional headers. Case-Insensitive.
      */
    def put[T](url: String): Observable[AjaxResponse[T]] = js.native
    def put[T](url: String, body: Any): Observable[AjaxResponse[T]] = js.native
    def put[T](url: String, body: Any, headers: Record[String, String]): Observable[AjaxResponse[T]] = js.native
    def put[T](url: String, body: Unit, headers: Record[String, String]): Observable[AjaxResponse[T]] = js.native
  }
}
