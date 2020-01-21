package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/range", JSImport.Namespace)
@js.native
object rangeMod extends js.Object {
  def dispatch(state: js.Any): Unit = js.native
  def range(): Observable[Double] = js.native
  def range(start: Double): Observable[Double] = js.native
  def range(start: Double, count: Double): Observable[Double] = js.native
  def range(start: Double, count: Double, scheduler: SchedulerLike): Observable[Double] = js.native
}

