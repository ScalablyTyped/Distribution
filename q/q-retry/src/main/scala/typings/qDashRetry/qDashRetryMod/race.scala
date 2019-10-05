package typings.qDashRetry.qDashRetryMod

import typings.q.qMod.IWhenable
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "race")
@js.native
object race extends js.Object {
  def apply[T](promises: js.Array[IWhenable[T]]): Promise[T] = js.native
}

