package typings.promiseDashMapDashLimit.promiseDashMapDashLimitMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-map-limit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T, R](iterable: Iterable[T], concurrency: Double, iteratee: IIteratee[T, R]): js.Promise[js.Array[R]] = js.native
}

