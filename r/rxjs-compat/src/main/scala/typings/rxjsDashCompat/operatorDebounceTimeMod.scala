package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/debounceTime", JSImport.Namespace)
@js.native
object operatorDebounceTimeMod extends js.Object {
  def debounceTime[T](`this`: Observable[T], dueTime: Double): Observable[T] = js.native
  def debounceTime[T](`this`: Observable[T], dueTime: Double, scheduler: SchedulerLike): Observable[T] = js.native
}

