package typings.rxjs.mod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "throwError")
@js.native
object throwError extends js.Object {
  def apply(error: js.Any): Observable[scala.Nothing] = js.native
  def apply(error: js.Any, scheduler: SchedulerLike): Observable[scala.Nothing] = js.native
}

