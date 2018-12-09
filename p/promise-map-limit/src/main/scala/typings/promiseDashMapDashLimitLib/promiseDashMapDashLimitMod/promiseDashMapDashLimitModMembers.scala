package typings
package promiseDashMapDashLimitLib.promiseDashMapDashLimitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-map-limit", JSImport.Namespace)
@js.native
object promiseDashMapDashLimitModMembers extends js.Object {
  def apply[T, R](
    iterable: stdLib.Iterable[T],
    concurrency: scala.Double,
    iteratee: promiseDashMapDashLimitLib.promiseDashMapDashLimitMod.promiseMapLimitNs.IIteratee[T, R]
  ): js.Promise[js.Array[R]] = js.native
}

