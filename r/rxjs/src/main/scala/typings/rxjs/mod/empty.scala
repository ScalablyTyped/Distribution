package typings.rxjs.mod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "empty")
@js.native
object empty extends js.Object {
  def apply(): Observable[scala.Nothing] = js.native
  def apply(scheduler: SchedulerLike): Observable[scala.Nothing] = js.native
}

