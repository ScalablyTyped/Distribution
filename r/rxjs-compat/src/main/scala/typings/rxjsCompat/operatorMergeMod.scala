package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMergeMod {
  
  @JSImport("rxjs-compat/operator/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def merge[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")().asInstanceOf[Observable_[T]]
  inline def merge[T](concurrent: Double): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(concurrent.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def merge[T](concurrent: Double, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def merge[T](concurrent: Unit, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def merge[T](observables: (ObservableInput[T] | SchedulerLike | Double)*): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Observable_[T]]
  inline def merge[T](scheduler: SchedulerLike): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def merge[T, T2](v2: ObservableInput[T2]): Observable_[T | T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any]).asInstanceOf[Observable_[T | T2]]
  inline def merge[T, T2](v2: ObservableInput[T2], concurrent: Double): Observable_[T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2]]
  inline def merge[T, T2](v2: ObservableInput[T2], concurrent: Double, scheduler: SchedulerLike): Observable_[T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2]]
  inline def merge[T, T2](v2: ObservableInput[T2], concurrent: Unit, scheduler: SchedulerLike): Observable_[T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2]]
  inline def merge[T, T2](v2: ObservableInput[T2], scheduler: SchedulerLike): Observable_[T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2]]
  inline def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable_[T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3]]
  inline def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double): Observable_[T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3]]
  inline def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double, scheduler: SchedulerLike): Observable_[T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3]]
  inline def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Unit, scheduler: SchedulerLike): Observable_[T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3]]
  inline def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): Observable_[T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3]]
  inline def merge[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable_[T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4]]
  inline def merge[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], concurrent: Double): Observable_[T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4]]
  inline def merge[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Double,
    scheduler: SchedulerLike
  ): Observable_[T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4]]
  inline def merge[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): Observable_[T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4]]
  inline def merge[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    scheduler: SchedulerLike
  ): Observable_[T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4]]
  inline def merge[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable_[T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4 | T5]]
  inline def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double
  ): Observable_[T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4 | T5]]
  inline def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double,
    scheduler: SchedulerLike
  ): Observable_[T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4 | T5]]
  inline def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): Observable_[T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4 | T5]]
  inline def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    scheduler: SchedulerLike
  ): Observable_[T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4 | T5]]
  inline def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable_[T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4 | T5 | T6]]
  inline def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double
  ): Observable_[T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4 | T5 | T6]]
  inline def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double,
    scheduler: SchedulerLike
  ): Observable_[T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4 | T5 | T6]]
  inline def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): Observable_[T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4 | T5 | T6]]
  inline def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    scheduler: SchedulerLike
  ): Observable_[T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4 | T5 | T6]]
  
  inline def merge_TR[T, R](observables: (ObservableInput[Any] | SchedulerLike | Double)*): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Observable_[R]]
}
