package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/delay", JSImport.Namespace)
@js.native
object operatorDelayMod extends js.Object {
  def delay[T](`this`: rxjsLib.rxjsMod.Observable[T], delay: scala.Double): rxjsLib.rxjsMod.Observable[T] = js.native
  def delay[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    delay: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def delay[T](`this`: rxjsLib.rxjsMod.Observable[T], delay: stdLib.Date): rxjsLib.rxjsMod.Observable[T] = js.native
  def delay[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    delay: stdLib.Date,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

