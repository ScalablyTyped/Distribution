package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a storage mechanism for Request / Response object pairs that are cached, for example as part of the ServiceWorker life cycle. Note that the Cache interface is exposed to windowed scopes as well as workers. You don't have to use it in conjunction with service workers, even though it is defined in the service worker spec.
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache)
  */
@js.native
trait Cache extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/add) */
  /* standard dom */
  def add(request: RequestInfo): js.Promise[Unit] = js.native
  def add(request: URL): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/addAll) */
  /* standard dom */
  def addAll(requests: js.Array[RequestInfo]): js.Promise[Unit] = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/addAll) */
  /* standard dom.iterable */
  def addAll(requests: js.Iterable[RequestInfo]): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/delete) */
  /* standard dom */
  def delete(request: RequestInfo): js.Promise[scala.Boolean] = js.native
  def delete(request: RequestInfo, options: CacheQueryOptions): js.Promise[scala.Boolean] = js.native
  def delete(request: URL): js.Promise[scala.Boolean] = js.native
  def delete(request: URL, options: CacheQueryOptions): js.Promise[scala.Boolean] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/keys) */
  /* standard dom */
  def keys(): js.Promise[js.Array[Request]] = js.native
  def keys(request: Unit, options: CacheQueryOptions): js.Promise[js.Array[Request]] = js.native
  def keys(request: RequestInfo): js.Promise[js.Array[Request]] = js.native
  def keys(request: RequestInfo, options: CacheQueryOptions): js.Promise[js.Array[Request]] = js.native
  def keys(request: URL): js.Promise[js.Array[Request]] = js.native
  def keys(request: URL, options: CacheQueryOptions): js.Promise[js.Array[Request]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/match) */
  /* standard dom */
  def `match`(request: RequestInfo): js.Promise[js.UndefOr[Response]] = js.native
  def `match`(request: RequestInfo, options: CacheQueryOptions): js.Promise[js.UndefOr[Response]] = js.native
  def `match`(request: URL): js.Promise[js.UndefOr[Response]] = js.native
  def `match`(request: URL, options: CacheQueryOptions): js.Promise[js.UndefOr[Response]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/matchAll) */
  /* standard dom */
  def matchAll(): js.Promise[js.Array[Response]] = js.native
  def matchAll(request: Unit, options: CacheQueryOptions): js.Promise[js.Array[Response]] = js.native
  def matchAll(request: RequestInfo): js.Promise[js.Array[Response]] = js.native
  def matchAll(request: RequestInfo, options: CacheQueryOptions): js.Promise[js.Array[Response]] = js.native
  def matchAll(request: URL): js.Promise[js.Array[Response]] = js.native
  def matchAll(request: URL, options: CacheQueryOptions): js.Promise[js.Array[Response]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/put) */
  /* standard dom */
  def put(request: RequestInfo, response: Response): js.Promise[Unit] = js.native
  def put(request: URL, response: Response): js.Promise[Unit] = js.native
}
