package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/empty", JSImport.Namespace)
@js.native
object internalObservableEmptyMod extends js.Object {
  val EMPTY: Observable[scala.Nothing] = js.native
  def empty(): Observable[scala.Nothing] = js.native
  def empty(scheduler: SchedulerLike): Observable[scala.Nothing] = js.native
}

