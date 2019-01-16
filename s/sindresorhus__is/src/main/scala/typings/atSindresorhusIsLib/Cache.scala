package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  def add(request: RequestInfo): Promise[scala.Unit] = js.native
  def addAll(requests: Array[RequestInfo]): Promise[scala.Unit] = js.native
  def delete(request: RequestInfo): Promise[scala.Boolean] = js.native
  def delete(request: RequestInfo, options: CacheQueryOptions): Promise[scala.Boolean] = js.native
  def keys(): Promise[ReadonlyArray[Request]] = js.native
  def keys(request: RequestInfo): Promise[ReadonlyArray[Request]] = js.native
  def keys(request: RequestInfo, options: CacheQueryOptions): Promise[ReadonlyArray[Request]] = js.native
  def `match`(request: RequestInfo): Promise[js.UndefOr[Response]] = js.native
  def `match`(request: RequestInfo, options: CacheQueryOptions): Promise[js.UndefOr[Response]] = js.native
  def matchAll(): Promise[ReadonlyArray[Response]] = js.native
  def matchAll(request: RequestInfo): Promise[ReadonlyArray[Response]] = js.native
  def matchAll(request: RequestInfo, options: CacheQueryOptions): Promise[ReadonlyArray[Response]] = js.native
  def put(request: RequestInfo, response: Response): Promise[scala.Unit] = js.native
}

@JSGlobal("Cache")
@js.native
object Cache
  extends org.scalablytyped.runtime.Instantiable0[Cache]

