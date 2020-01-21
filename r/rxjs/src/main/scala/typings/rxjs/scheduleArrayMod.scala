package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduled/scheduleArray", JSImport.Namespace)
@js.native
object scheduleArrayMod extends js.Object {
  def scheduleArray[T](input: ArrayLike[T], scheduler: SchedulerLike): Observable[T] = js.native
}

