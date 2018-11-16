package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/concat", JSImport.Namespace)
@js.native
object internalObservableConcatMod extends js.Object {
  def concat[T](
    observables: (rxjsLib.internalTypesMod.ObservableInput[T] | rxjsLib.internalTypesMod.SchedulerLike)*
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
  def concat[T](v1: rxjsLib.internalTypesMod.ObservableInput[T]): rxjsLib.internalObservableMod.Observable[T] = js.native
  def concat[T](v1: rxjsLib.internalTypesMod.ObservableInput[T], scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[T] = js.native
  def concat[T, T2](v1: rxjsLib.internalTypesMod.ObservableInput[T], v2: rxjsLib.internalTypesMod.ObservableInput[T2]): rxjsLib.internalObservableMod.Observable[T | T2] = js.native
  def concat[T, T2](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T | T2] = js.native
  def concat[T, T2, T3](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3]
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3] = js.native
  def concat[T, T2, T3](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3] = js.native
  def concat[T, T2, T3, T4](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4]
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def concat[T, T2, T3, T4](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def concat[T, T2, T3, T4, T5](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5]
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def concat[T, T2, T3, T4, T5](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def concat[T, T2, T3, T4, T5, T6](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6]
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def concat[T, T2, T3, T4, T5, T6](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSName("concat")
  def concat_TR[T, R](
    observables: (rxjsLib.internalTypesMod.ObservableInput[_] | rxjsLib.internalTypesMod.SchedulerLike)*
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
}

