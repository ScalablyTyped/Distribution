package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  def add(request: RequestInfo): Promise[scala.Unit] = js.native
  def addAll(requests: js.Array[RequestInfo]): Promise[scala.Unit] = js.native
  def delete(request: RequestInfo): Promise[scala.Boolean] = js.native
  def delete(request: RequestInfo, options: CacheQueryOptions): Promise[scala.Boolean] = js.native
  def keys(): Promise[js.Array[Request]] = js.native
  def keys(request: RequestInfo): Promise[js.Array[Request]] = js.native
  def keys(request: RequestInfo, options: CacheQueryOptions): Promise[js.Array[Request]] = js.native
  def `match`(request: RequestInfo): Promise[js.UndefOr[Response]] = js.native
  def `match`(request: RequestInfo, options: CacheQueryOptions): Promise[js.UndefOr[Response]] = js.native
  def matchAll(): Promise[js.Array[Response]] = js.native
  def matchAll(request: RequestInfo): Promise[js.Array[Response]] = js.native
  def matchAll(request: RequestInfo, options: CacheQueryOptions): Promise[js.Array[Response]] = js.native
  def put(request: RequestInfo, response: Response): Promise[scala.Unit] = js.native
}

@JSGlobal("Cache")
@js.native
object Cache
  extends ScalablyTyped.runtime.Instantiable0[Cache]

