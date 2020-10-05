package typings.rxjs.mod

import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs", "scheduled")
@js.native
object scheduled extends js.Object {
  def apply[T](input: ObservableInput[T], scheduler: SchedulerLike): Observable_[T] = js.native
}

