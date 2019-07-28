package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/observeOn", JSImport.Namespace)
@js.native
object operatorObserveOnMod extends js.Object {
  def observeOn[T](`this`: Observable[T], scheduler: SchedulerLike): Observable[T] = js.native
  def observeOn[T](`this`: Observable[T], scheduler: SchedulerLike, delay: Double): Observable[T] = js.native
}

