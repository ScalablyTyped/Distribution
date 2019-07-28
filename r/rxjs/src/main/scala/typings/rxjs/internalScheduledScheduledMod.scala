package typings.rxjs

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduled/scheduled", JSImport.Namespace)
@js.native
object internalScheduledScheduledMod extends js.Object {
  def scheduled[T](input: ObservableInput[T], scheduler: SchedulerLike): Observable[T] = js.native
}

