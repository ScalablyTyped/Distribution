package typings
package prexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/delay", JSImport.Namespace)
@js.native
object outLibDelayMod extends js.Object {
  def delay(msec: scala.Double): js.Promise[scala.Unit] = js.native
  def delay(token: atEsfxCancelableLib.distMod.Cancelable, msec: scala.Double): js.Promise[scala.Unit] = js.native
  def delay(token: prexLib.outLibCancellationMod.CancellationToken, msec: scala.Double): js.Promise[scala.Unit] = js.native
  def delay[T](msec: scala.Double, value: T): js.Promise[T] = js.native
  def delay[T](msec: scala.Double, value: js.Thenable[T]): js.Promise[T] = js.native
  def delay[T](token: atEsfxCancelableLib.distMod.Cancelable, msec: scala.Double, value: T): js.Promise[T] = js.native
  def delay[T](token: atEsfxCancelableLib.distMod.Cancelable, msec: scala.Double, value: js.Thenable[T]): js.Promise[T] = js.native
  def delay[T](token: prexLib.outLibCancellationMod.CancellationToken, msec: scala.Double, value: T): js.Promise[T] = js.native
  def delay[T](token: prexLib.outLibCancellationMod.CancellationToken, msec: scala.Double, value: js.Thenable[T]): js.Promise[T] = js.native
}

