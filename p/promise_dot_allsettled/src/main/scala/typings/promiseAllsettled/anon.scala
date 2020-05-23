package typings.promiseAllsettled

import typings.promiseAllsettled.implementationMod.PromiseResultTuple
import typings.promiseAllsettled.implementationMod.PromiseTuple
import typings.promiseAllsettled.typesMod.PromiseResult
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait FnCall extends js.Object {
    def apply(): js.Promise[js.Array[js.Any]] = js.native
    def apply[T /* <: Array[js.Any] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = js.native
    def apply[T](iterable: Iterable[js.Promise[T] | T]): js.Promise[js.Array[PromiseResult[T, _]]] = js.native
  }
  
}

