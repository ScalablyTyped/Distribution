package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/delay", JSImport.Namespace)
@js.native
object operatorDelayMod extends js.Object {
  def delay[T](`this`: Observable[T], delay: Double): Observable[T] = js.native
  def delay[T](`this`: Observable[T], delay: Double, scheduler: SchedulerLike): Observable[T] = js.native
  def delay[T](`this`: Observable[T], delay: Date): Observable[T] = js.native
  def delay[T](`this`: Observable[T], delay: Date, scheduler: SchedulerLike): Observable[T] = js.native
}

