package typings
package prexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/delay", JSImport.Namespace)
@js.native
object outLibDelayMod extends js.Object {
  def delay(msec: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def delay(token: prexLib.outLibCancellationMod.CancellationToken, msec: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def delay[T](msec: scala.Double, value: T): stdLib.Promise[T] = js.native
  def delay[T](msec: scala.Double, value: stdLib.PromiseLike[T]): stdLib.Promise[T] = js.native
  def delay[T](token: prexLib.outLibCancellationMod.CancellationToken, msec: scala.Double, value: T): stdLib.Promise[T] = js.native
  def delay[T](
    token: prexLib.outLibCancellationMod.CancellationToken,
    msec: scala.Double,
    value: stdLib.PromiseLike[T]
  ): stdLib.Promise[T] = js.native
}

