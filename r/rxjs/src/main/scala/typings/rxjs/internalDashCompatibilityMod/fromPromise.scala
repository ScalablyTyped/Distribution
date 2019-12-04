package typings.rxjs.internalDashCompatibilityMod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "fromPromise")
@js.native
object fromPromise extends js.Object {
  def apply[T](input: js.Thenable[T]): Observable[T] = js.native
  def apply[T](input: js.Thenable[T], scheduler: SchedulerLike): Observable[T] = js.native
}

