package typings.qDashRetry.qDashRetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "delay")
@js.native
object delay extends js.Object {
  def apply(ms: Double): typings.q.qMod.Promise[Unit] = js.native
  def apply[T](promiseOrValue: T, ms: Double): typings.q.qMod.Promise[T] = js.native
  def apply[T](promiseOrValue: typings.q.qMod.Promise[T], ms: Double): typings.q.qMod.Promise[T] = js.native
}

