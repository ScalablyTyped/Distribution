package typings
package qLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Promise extends js.Object {
  def apply(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def apply[T](promise: T): qLib.qMod.QNs.Promise[T] = js.native
  def apply[T](promise: js.Thenable[T]): qLib.qMod.QNs.Promise[T] = js.native
}

