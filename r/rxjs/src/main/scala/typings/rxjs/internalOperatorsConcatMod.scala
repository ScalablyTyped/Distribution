package typings.rxjs

import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.OperatorFunction
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/concat", JSImport.Namespace)
@js.native
object internalOperatorsConcatMod extends js.Object {
  def concat[T](): MonoTypeOperatorFunction[T] = js.native
  def concat[T](observables: (ObservableInput[T] | SchedulerLike)*): MonoTypeOperatorFunction[T] = js.native
  def concat[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def concat[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, T | T2] = js.native
  def concat[T, T2](v2: ObservableInput[T2], scheduler: SchedulerLike): OperatorFunction[T, T | T2] = js.native
  def concat[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, T | T2 | T3] = js.native
  def concat[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = js.native
  def concat[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, T | T2 | T3 | T4] = js.native
  def concat[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4] = js.native
  def concat[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
  def concat[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
  def concat[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
  def concat[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSName("concat")
  def concat_TR_OperatorFunction[T, R](observables: (ObservableInput[_] | SchedulerLike)*): OperatorFunction[T, R] = js.native
}

