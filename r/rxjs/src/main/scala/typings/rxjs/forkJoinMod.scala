package typings.rxjs

import org.scalablytyped.runtime.TopLevel
import typings.rxjs.anyCatcherMod.AnyCatcher
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.rxjsStrings.forkJoin
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forkJoinMod {
  
  @JSImport("rxjs/dist/types/internal/observable/forkJoin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forkJoin(): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")().asInstanceOf[Observable[scala.Nothing]]
  inline def forkJoin(
    sourcesObject: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in any ]: never}
    */ typings.rxjs.rxjsStrings.forkJoin & TopLevel[Any]
  ): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sourcesObject.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def forkJoin(sources: js.Array[Any]): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def forkJoin[T /* <: AnyCatcher */](arg: T): Observable[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(arg.asInstanceOf[js.Any]).asInstanceOf[Observable[Any]]
  inline def forkJoin[A /* <: js.Array[Any] */, R](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>}
    */ typings.rxjs.rxjsStrings.forkJoin & TopLevel[A]
    ],
    resultSelector: js.Function1[/* values */ A, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
  inline def forkJoin_A_ArrayAny[A /* <: js.Array[Any] */](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>}
    */ forkJoin & TopLevel[A]
    ]
  ): Observable[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[A]]
  
  inline def forkJoin_A_ArrayAnyR[A /* <: js.Array[Any] */, R](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sourcesAndResultSelector because its type [...ObservableInputTuple<A>, (values : A): R] is not an array type */ sourcesAndResultSelector: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>}
    */ forkJoin & TopLevel[A]
    ]
  ): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sourcesAndResultSelector.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  
  inline def forkJoin_T_RecordStringObservableInputAny[T /* <: Record[String, ObservableInput[Any]] */](sourcesObject: T): Observable[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservedValueOf<T[K]>}
    */ forkJoin & TopLevel[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sourcesObject.asInstanceOf[js.Any]).asInstanceOf[Observable[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservedValueOf<T[K]>}
    */ forkJoin & TopLevel[T]
  ]]
}
