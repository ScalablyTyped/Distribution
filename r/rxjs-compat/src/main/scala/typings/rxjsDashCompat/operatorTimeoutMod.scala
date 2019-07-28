package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/timeout", JSImport.Namespace)
@js.native
object operatorTimeoutMod extends js.Object {
  def timeout[T](`this`: Observable[T], due: Double): Observable[T] = js.native
  def timeout[T](`this`: Observable[T], due: Double, scheduler: SchedulerLike): Observable[T] = js.native
  def timeout[T](`this`: Observable[T], due: Date): Observable[T] = js.native
  def timeout[T](`this`: Observable[T], due: Date, scheduler: SchedulerLike): Observable[T] = js.native
}

