package typings.rxjsCompat

import typings.rxjs.distTypesInternalAnyCatcherMod.AnyCatcher
import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableCombineLatestMod {
  
  @JSImport("rxjs-compat/observable/combineLatest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineLatest(
    sourcesObject: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any ]: never} */ js.Any
  ): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sourcesObject.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def combineLatest(sources: js.Array[Any]): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def combineLatest[T /* <: AnyCatcher */](arg: T): Observable[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(arg.asInstanceOf[js.Any]).asInstanceOf[Observable[Any]]
  inline def combineLatest[A /* <: js.Array[Any] */](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ],
    scheduler: SchedulerLike
  ): Observable[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[A]]
  inline def combineLatest[A /* <: js.Array[Any] */, R](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ],
    resultSelector: js.Function1[/* values */ A, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def combineLatest[A /* <: js.Array[Any] */, R](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ],
    resultSelector: js.Function1[/* values */ A, R],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
  inline def combineLatest_A[A /* <: js.Array[Any] */](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): Observable[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[A]]
  
  inline def combineLatest_AR[A /* <: js.Array[Any] */, R](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sourcesAndResultSelectorAndScheduler because its type [...ObservableInputTuple<A>, (values : A): R, SchedulerLike] is not an array type */ sourcesAndResultSelectorAndScheduler: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sourcesAndResultSelectorAndScheduler.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
}
