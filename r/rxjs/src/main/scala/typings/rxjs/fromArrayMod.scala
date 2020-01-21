package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/fromArray", JSImport.Namespace)
@js.native
object fromArrayMod extends js.Object {
  def fromArray[T](input: ArrayLike[T]): Observable[T] = js.native
  def fromArray[T](input: ArrayLike[T], scheduler: SchedulerLike): Observable[T] = js.native
}

