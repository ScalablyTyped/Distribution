package typings.promiseDotAllsettled

import typings.promiseDotAllsettled.implementationMod.PromiseResultTuple
import typings.promiseDotAllsettled.implementationMod.PromiseTuple
import typings.promiseDotAllsettled.typesMod.PromiseResult
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Iterable extends js.Object {
  def apply(): js.Promise[js.Array[js.Any]] = js.native
  def apply[T /* <: js.Array[_] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = js.native
  def apply[T](iterable: Iterable[js.Promise[T] | T]): js.Promise[js.Array[PromiseResult[T, _]]] = js.native
}

