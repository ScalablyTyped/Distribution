package typings.rxjs.rxjsMod

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "scheduled")
@js.native
object scheduled extends js.Object {
  def apply[T](input: ObservableInput[T], scheduler: SchedulerLike): Observable[T] = js.native
}

