package typings.qRetry.mod

import typings.q.mod.IWhenable
import typings.q.mod.PromiseState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "allSettled")
@js.native
object allSettled extends js.Object {
  def apply[T](promises: IWhenable[js.Array[IWhenable[T]]]): typings.q.mod.Promise[js.Array[PromiseState[T]]] = js.native
}

