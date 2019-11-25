package typings.qDashRetry.qDashRetryMod

import typings.q.qMod.IWhenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "allResolved")
@js.native
object allResolved extends js.Object {
  def apply[T](promises: IWhenable[js.Array[IWhenable[T]]]): typings.q.qMod.Promise[js.Array[typings.q.qMod.Promise[T]]] = js.native
}

