package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/concat", JSImport.Namespace)
@js.native
object operatorConcatMod extends js.Object {
  def concat[T](`this`: Observable[T]): Observable[T] = js.native
  def concat[T](`this`: Observable[T], observables: (ObservableInput[T] | SchedulerLike)*): Observable[T] = js.native
  def concat[T](`this`: Observable[T], scheduler: SchedulerLike): Observable[T] = js.native
  def concat[T, T2](`this`: Observable[T], v2: ObservableInput[T2]): Observable[T | T2] = js.native
  def concat[T, T2](`this`: Observable[T], v2: ObservableInput[T2], scheduler: SchedulerLike): Observable[T | T2] = js.native
  def concat[T, T2, T3](`this`: Observable[T], v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable[T | T2 | T3] = js.native
  def concat[T, T2, T3](`this`: Observable[T], v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): Observable[T | T2 | T3] = js.native
  def concat[T, T2, T3, T4](`this`: Observable[T], v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable[T | T2 | T3 | T4] = js.native
  def concat[T, T2, T3, T4](
    `this`: Observable[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    scheduler: SchedulerLike
  ): Observable[T | T2 | T3 | T4] = js.native
  def concat[T, T2, T3, T4, T5](
    `this`: Observable[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5]
  ): Observable[T | T2 | T3 | T4 | T5] = js.native
  def concat[T, T2, T3, T4, T5](
    `this`: Observable[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    scheduler: SchedulerLike
  ): Observable[T | T2 | T3 | T4 | T5] = js.native
  def concat[T, T2, T3, T4, T5, T6](
    `this`: Observable[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def concat[T, T2, T3, T4, T5, T6](
    `this`: Observable[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    scheduler: SchedulerLike
  ): Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSName("concat")
  def concat_TR[T, R](`this`: Observable[T], observables: (ObservableInput[_] | SchedulerLike)*): Observable[R] = js.native
}

