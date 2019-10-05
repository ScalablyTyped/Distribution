package typings.qDashRetry.qDashRetryMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "timeout")
@js.native
object timeout extends js.Object {
  def apply[T](promise: Promise[T], ms: Double): Promise[T] = js.native
  def apply[T](promise: Promise[T], ms: Double, message: String): Promise[T] = js.native
}

