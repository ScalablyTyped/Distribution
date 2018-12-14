package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  def add(request: RequestInfo): js.Promise[scala.Unit] = js.native
  def addAll(requests: js.Array[RequestInfo]): js.Promise[scala.Unit] = js.native
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
  def put(request: RequestInfo, response: Response): js.Promise[scala.Unit] = js.native
}

@JSGlobal("Cache")
@js.native
object Cache
  extends org.scalablytyped.runtime.Instantiable0[Cache]

