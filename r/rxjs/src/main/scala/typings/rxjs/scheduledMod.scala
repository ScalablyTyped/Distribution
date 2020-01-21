package typings.rxjs

import typings.rxjs.mod.Observable_
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduled/scheduled", JSImport.Namespace)
@js.native
object scheduledMod extends js.Object {
  def scheduled[T](input: ObservableInput[T], scheduler: SchedulerLike): Observable_[T] = js.native
}

