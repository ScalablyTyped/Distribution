package typings.qDashRetry.qDashRetryMod

import typings.q.qMod.IWhenable
import typings.q.qMod.PromiseState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "allSettled")
@js.native
object allSettled extends js.Object {
  def apply[T](promises: IWhenable[js.Array[IWhenable[T]]]): typings.q.qMod.Promise[js.Array[PromiseState[T]]] = js.native
}

