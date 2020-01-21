package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/empty", JSImport.Namespace)
@js.native
object emptyMod extends js.Object {
  @JSName("EMPTY")
  val EMPTY_ : Observable[scala.Nothing] = js.native
  def empty(): Observable[scala.Nothing] = js.native
  def empty(scheduler: SchedulerLike): Observable[scala.Nothing] = js.native
}

