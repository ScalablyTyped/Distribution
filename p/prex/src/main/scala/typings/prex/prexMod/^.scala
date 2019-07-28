package typings.prex.prexMod

import typings.atEsfxCancelable.distMod.Cancelable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def delay(msec: Double): js.Promise[Unit] = js.native
  def delay(token: Cancelable, msec: Double): js.Promise[Unit] = js.native
  def delay(token: typings.prex.outLibCancellationMod.CancellationToken, msec: Double): js.Promise[Unit] = js.native
  def delay[T](msec: Double, value: T): js.Promise[T] = js.native
  def delay[T](msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
  def delay[T](token: Cancelable, msec: Double, value: T): js.Promise[T] = js.native
  def delay[T](token: Cancelable, msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
  def delay[T](token: typings.prex.outLibCancellationMod.CancellationToken, msec: Double, value: T): js.Promise[T] = js.native
  def delay[T](token: typings.prex.outLibCancellationMod.CancellationToken, msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
}

