package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/interval", JSImport.Namespace)
@js.native
object internalObservableIntervalMod extends js.Object {
  def interval(): Observable[Double] = js.native
  def interval(period: Double): Observable[Double] = js.native
  def interval(period: Double, scheduler: SchedulerLike): Observable[Double] = js.native
}

