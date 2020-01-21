package typings.qRetry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "delay")
@js.native
object delay extends js.Object {
  def apply(ms: Double): typings.q.mod.Promise[Unit] = js.native
  def apply[T](promiseOrValue: T, ms: Double): typings.q.mod.Promise[T] = js.native
  def apply[T](promiseOrValue: typings.q.mod.Promise[T], ms: Double): typings.q.mod.Promise[T] = js.native
}

