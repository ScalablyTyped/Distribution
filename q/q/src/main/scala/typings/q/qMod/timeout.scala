package typings.q.qMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q", "timeout")
@js.native
object timeout extends js.Object {
  def apply[T](promise: Promise[T], ms: Double): Promise[T] = js.native
  def apply[T](promise: Promise[T], ms: Double, message: String): Promise[T] = js.native
}

