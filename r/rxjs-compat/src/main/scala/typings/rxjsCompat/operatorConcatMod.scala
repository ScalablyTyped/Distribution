package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorConcatMod {
  
  @JSImport("rxjs-compat/operator/concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concat[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")().asInstanceOf[Observable_[T]]
  inline def concat[T](observables: (ObservableInput[T] | SchedulerLike)*): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Observable_[T]]
  inline def concat[T](scheduler: SchedulerLike): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def concat[T, T2](v2: ObservableInput[T2]): Observable_[T | T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any]).asInstanceOf[Observable_[T | T2]]
  inline def concat[T, T2](v2: ObservableInput[T2], scheduler: SchedulerLike): Observable_[T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2]]
  inline def concat[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable_[T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3]]
  inline def concat[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): Observable_[T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3]]
  inline def concat[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable_[T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4]]
  inline def concat[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    scheduler: SchedulerLike
  ): Observable_[T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4]]
  inline def concat[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable_[T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4 | T5]]
  inline def concat[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    scheduler: SchedulerLike
  ): Observable_[T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4 | T5]]
  inline def concat[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable_[T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4 | T5 | T6]]
  inline def concat[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    scheduler: SchedulerLike
  ): Observable_[T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4 | T5 | T6]]
  
  inline def concat_TR[T, R](observables: (ObservableInput[Any] | SchedulerLike)*): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Observable_[R]]
}
