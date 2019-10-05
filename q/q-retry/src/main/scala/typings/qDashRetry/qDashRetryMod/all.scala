package typings.qDashRetry.qDashRetryMod

import typings.q.qMod.IWhenable
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "all")
@js.native
object all extends js.Object {
  def apply[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[T]] = js.native
}

