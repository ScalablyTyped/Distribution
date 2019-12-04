package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.SchedulerLike
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduled/scheduleIterable", JSImport.Namespace)
@js.native
object internalScheduledScheduleIterableMod extends js.Object {
  def scheduleIterable[T](input: Iterable[T], scheduler: SchedulerLike): Observable[T] = js.native
}

