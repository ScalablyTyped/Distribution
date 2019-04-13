package typings
package qLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Promise extends js.Object {
  def apply(): qLib.qMod.Promise[scala.Unit] = js.native
  def apply[T](promise: T): qLib.qMod.Promise[T] = js.native
  def apply[T](promise: js.Thenable[T]): qLib.qMod.Promise[T] = js.native
}

