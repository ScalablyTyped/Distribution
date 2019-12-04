package typings.rxjs

import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.OperatorFunction
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/merge", JSImport.Namespace)
@js.native
object internalOperatorsMergeMod extends js.Object {
  def merge[T](): MonoTypeOperatorFunction[T] = js.native
  def merge[T](concurrent: Double): MonoTypeOperatorFunction[T] = js.native
  def merge[T](concurrent: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def merge[T](observables: (ObservableInput[T] | SchedulerLike | Double)*): MonoTypeOperatorFunction[T] = js.native
  def merge[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def merge[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, T | T2] = js.native
  def merge[T, T2](v2: ObservableInput[T2], concurrent: Double): OperatorFunction[T, T | T2] = js.native
  def merge[T, T2](v2: ObservableInput[T2], concurrent: Double, scheduler: SchedulerLike): OperatorFunction[T, T | T2] = js.native
  def merge[T, T2](v2: ObservableInput[T2], scheduler: SchedulerLike): OperatorFunction[T, T | T2] = js.native
  def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, T | T2 | T3] = js.native
  def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double): OperatorFunction[T, T | T2 | T3] = js.native
  def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double, scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = js.native
  def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = js.native
  def merge[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, T | T2 | T3 | T4] = js.native
  def merge[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], concurrent: Double): OperatorFunction[T, T | T2 | T3 | T4] = js.native
  def merge[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4] = js.native
  def merge[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4] = js.native
  def merge[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
  def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
  def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
  def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
  def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
  def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
  def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
  def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSName("merge")
  def merge_TR_OperatorFunction[T, R](observables: (ObservableInput[_] | SchedulerLike | Double)*): OperatorFunction[T, R] = js.native
}

