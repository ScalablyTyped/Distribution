package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.SchedulerLike
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/fromIterable", JSImport.Namespace)
@js.native
object internalObservableFromIterableMod extends js.Object {
  def fromIterable[T](input: Iterable[T]): Observable[T] = js.native
  def fromIterable[T](input: Iterable[T], scheduler: SchedulerLike): Observable[T] = js.native
}

