package typings.rxjs.internalDashCompatibilityMod

import typings.rxjs.internalObservableDomAjaxObservableMod.AjaxCreationMethod
import typings.rxjs.internalObservableDomAjaxObservableMod.AjaxRequest
import typings.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "AjaxObservable")
@js.native
class AjaxObservable[T] protected ()
  extends typings.rxjs.internalObservableDomAjaxObservableMod.AjaxObservable[T] {
  def this(urlOrRequest: String) = this()
  def this(urlOrRequest: AjaxRequest) = this()
}

/* static members */
@JSImport("rxjs/internal-compatibility", "AjaxObservable")
@js.native
object AjaxObservable extends js.Object {
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
  @JSName("create")
  var create_Original: AjaxCreationMethod = js.native
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
  def create(urlOrRequest: String): Observable[typings.rxjs.internalObservableDomAjaxObservableMod.AjaxResponse] = js.native
  def create(urlOrRequest: AjaxRequest): Observable[typings.rxjs.internalObservableDomAjaxObservableMod.AjaxResponse] = js.native
}

