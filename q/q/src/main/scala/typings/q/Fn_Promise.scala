package typings.q

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Promise extends js.Object {
  def apply(): Promise[Unit] = js.native
  def apply[T](promise: T): Promise[T] = js.native
  def apply[T](promise: js.Thenable[T]): Promise[T] = js.native
}

