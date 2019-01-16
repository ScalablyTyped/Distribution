package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheStorage extends js.Object {
  def delete(cacheName: java.lang.String): Promise[scala.Boolean] = js.native
  def has(cacheName: java.lang.String): Promise[scala.Boolean] = js.native
  def keys(): Promise[Array[java.lang.String]] = js.native
  def `match`(request: RequestInfo): Promise[js.UndefOr[Response]] = js.native
  def `match`(request: RequestInfo, options: CacheQueryOptions): Promise[js.UndefOr[Response]] = js.native
  def open(cacheName: java.lang.String): Promise[Cache] = js.native
}

@JSGlobal("CacheStorage")
@js.native
object CacheStorage
  extends org.scalablytyped.runtime.Instantiable0[CacheStorage]

