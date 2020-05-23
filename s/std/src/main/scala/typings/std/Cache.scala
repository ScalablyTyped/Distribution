package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a storage mechanism for Request / Response object pairs that are cached, for example as part of the ServiceWorker life cycle. Note that the Cache interface is exposed to windowed scopes as well as workers. You don't have to use it in conjunction with service workers, even though it is defined in the service worker spec. */
@js.native
trait Cache extends js.Object {
  def add(request: RequestInfo): js.Promise[Unit] = js.native
  def addAll(requests: js.Array[RequestInfo]): js.Promise[Unit] = js.native
  def addAll(requests: Iterable[RequestInfo]): js.Promise[Unit] = js.native
  def delete(request: RequestInfo): js.Promise[scala.Boolean] = js.native
  def delete(request: RequestInfo, options: CacheQueryOptions): js.Promise[scala.Boolean] = js.native
  def keys(): js.Promise[js.Array[Request]] = js.native
  def keys(request: RequestInfo): js.Promise[js.Array[Request]] = js.native
  def keys(request: RequestInfo, options: CacheQueryOptions): js.Promise[js.Array[Request]] = js.native
  def `match`(request: RequestInfo): js.Promise[js.UndefOr[Response]] = js.native
  def `match`(request: RequestInfo, options: CacheQueryOptions): js.Promise[js.UndefOr[Response]] = js.native
  def matchAll(): js.Promise[js.Array[Response]] = js.native
  def matchAll(request: RequestInfo): js.Promise[js.Array[Response]] = js.native
  def matchAll(request: RequestInfo, options: CacheQueryOptions): js.Promise[js.Array[Response]] = js.native
  def put(request: RequestInfo, response: Response): js.Promise[Unit] = js.native
}

