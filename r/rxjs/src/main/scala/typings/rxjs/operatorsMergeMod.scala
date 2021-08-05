package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsMergeMod {
  
  @JSImport("rxjs/internal/operators/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def merge[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def merge[T](concurrent: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(concurrent.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def merge[T](concurrent: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def merge[T](concurrent: Unit, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def merge[T](observables: (ObservableInput[T] | SchedulerLike | Double)*): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(observables.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def merge[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def merge[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, T | T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | T2]]
  inline def merge[T, T2](v2: ObservableInput[T2], concurrent: Double): OperatorFunction[T, T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2]]
  inline def merge[T, T2](v2: ObservableInput[T2], concurrent: Double, scheduler: SchedulerLike): OperatorFunction[T, T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2]]
  inline def merge[T, T2](v2: ObservableInput[T2], concurrent: Unit, scheduler: SchedulerLike): OperatorFunction[T, T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2]]
  inline def merge[T, T2](v2: ObservableInput[T2], scheduler: SchedulerLike): OperatorFunction[T, T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2]]
  inline def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
  inline def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
  inline def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double, scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
  inline def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Unit, scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
  inline def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
  inline def merge[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
  inline def merge[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], concurrent: Double): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
  inline def merge[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
  inline def merge[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
  inline def merge[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
  inline def merge[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
  inline def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
  inline def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
  inline def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
  inline def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
  inline def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
  inline def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
  inline def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
  inline def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
  inline def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
  
  inline def merge_TR_OperatorFunction[T, R](observables: (ObservableInput[js.Any] | SchedulerLike | Double)*): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
}
