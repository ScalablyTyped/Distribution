package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/timeout", JSImport.Namespace)
@js.native
object operatorTimeoutMod extends js.Object {
  def timeout[T](`this`: rxjsLib.rxjsMod.Observable[T], due: scala.Double): rxjsLib.rxjsMod.Observable[T] = js.native
  def timeout[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    due: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def timeout[T](`this`: rxjsLib.rxjsMod.Observable[T], due: stdLib.Date): rxjsLib.rxjsMod.Observable[T] = js.native
  def timeout[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    due: stdLib.Date,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

