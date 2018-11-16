package typings
package prexLib.prexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex", JSImport.Namespace)
@js.native
object prexModMembers extends js.Object {
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

