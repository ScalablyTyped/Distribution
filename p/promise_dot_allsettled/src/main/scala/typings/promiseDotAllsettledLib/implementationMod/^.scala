package typings
package promiseDotAllsettledLib.implementationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise.allsettled/implementation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[js.Array[js.Any]] = js.native
  def apply[T /* <: js.Array[_] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = js.native
  def apply[T](iterable: stdLib.Iterable[T]): js.Promise[js.Array[T]] = js.native
}

