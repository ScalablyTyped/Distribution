package typings.rxjs.internalCompatibilityMod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "fromIterable")
@js.native
object fromIterable extends js.Object {
  def apply[T](input: Iterable[T]): Observable[T] = js.native
  def apply[T](input: Iterable[T], scheduler: SchedulerLike): Observable[T] = js.native
}

