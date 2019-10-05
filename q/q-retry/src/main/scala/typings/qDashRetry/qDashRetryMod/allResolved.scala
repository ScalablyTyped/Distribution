package typings.qDashRetry.qDashRetryMod

import typings.q.qMod.IWhenable
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "allResolved")
@js.native
object allResolved extends js.Object {
  def apply[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[Promise[T]]] = js.native
}

