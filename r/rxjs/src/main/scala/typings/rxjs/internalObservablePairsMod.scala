package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.SchedulerAction
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/pairs", JSImport.Namespace)
@js.native
object internalObservablePairsMod extends js.Object {
  def dispatch[T](`this`: SchedulerAction[_], state: Anon_Index[T]): Unit = js.native
  def pairs[T](obj: js.Object): Observable[js.Tuple2[String, T]] = js.native
  def pairs[T](obj: js.Object, scheduler: SchedulerLike): Observable[js.Tuple2[String, T]] = js.native
}

