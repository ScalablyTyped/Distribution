package typings.promiseAllsettled

import typings.promiseAllsettled.implementationMod.PromiseResultTuple
import typings.promiseAllsettled.implementationMod.PromiseTuple
import typings.promiseAllsettled.typesMod.PromiseResult
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnIterable extends js.Object {
  def apply(): js.Promise[js.Array[js.Any]] = js.native
  def apply[T /* <: js.Array[_] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = js.native
  def apply[T](iterable: Iterable[js.Promise[T] | T]): js.Promise[js.Array[PromiseResult[T, _]]] = js.native
}

