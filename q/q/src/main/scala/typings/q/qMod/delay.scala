package typings.q.qMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q", "delay")
@js.native
object delay extends js.Object {
  def apply(ms: Double): Promise[Unit] = js.native
  def apply[T](promiseOrValue: T, ms: Double): Promise[T] = js.native
  def apply[T](promiseOrValue: Promise[T], ms: Double): Promise[T] = js.native
}

