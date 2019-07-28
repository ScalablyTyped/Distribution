package typings.promiseDotAllsettled.implementationMod

import typings.promiseDotAllsettled.typesMod.PromiseResult
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise.allsettled/implementation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[js.Array[js.Any]] = js.native
  def apply[T /* <: js.Array[_] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = js.native
  def apply[T](iterable: Iterable[T]): js.Promise[js.Array[PromiseResult[T, _]]] = js.native
}

