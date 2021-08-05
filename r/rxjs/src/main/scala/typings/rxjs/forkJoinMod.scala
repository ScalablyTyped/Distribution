package typings.rxjs

import org.scalablytyped.runtime.TopLevel
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.rxjsStrings.forkJoin
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.ObservedValuesFromArray
import typings.rxjs.typesMod.SubscribableOrPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forkJoinMod {
  
  @JSImport("rxjs/internal/observable/forkJoin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forkJoin(args: (ObservableInput[js.Any] | js.Function)*): Observable[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(args.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Any]]
  inline def forkJoin(sourcesObject: js.Object): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sourcesObject.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def forkJoin[A /* <: js.Array[ObservableInput[js.Any]] */](sources: A): Observable[js.Array[ObservedValuesFromArray[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[ObservedValuesFromArray[A]]]]
  inline def forkJoin[A](sources: js.Array[ObservableInput[A]]): Observable[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[A]]]
  inline def forkJoin[A, B](sources: js.Tuple2[ObservableInput[A], ObservableInput[B]]): Observable[js.Tuple2[A, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[A, B]]]
  inline def forkJoin[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2]): Observable[js.Tuple2[T, T2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[T, T2]]]
  inline def forkJoin[A, B, C](sources: js.Tuple3[ObservableInput[A], ObservableInput[B], ObservableInput[C]]): Observable[js.Tuple3[A, B, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple3[A, B, C]]]
  inline def forkJoin[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable[js.Tuple3[T, T2, T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple3[T, T2, T3]]]
  inline def forkJoin[A, B, C, D](sources: js.Tuple4[ObservableInput[A], ObservableInput[B], ObservableInput[C], ObservableInput[D]]): Observable[js.Tuple4[A, B, C, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple4[A, B, C, D]]]
  inline def forkJoin[T, T2, T3, T4](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple4[T, T2, T3, T4]]]
  inline def forkJoin[A, B, C, D, E](
    sources: js.Tuple5[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E]
    ]
  ): Observable[js.Tuple5[A, B, C, D, E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple5[A, B, C, D, E]]]
  inline def forkJoin[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple5[T, T2, T3, T4, T5]]]
  inline def forkJoin[A, B, C, D, E, F](
    sources: js.Tuple6[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E], 
      ObservableInput[F]
    ]
  ): Observable[js.Tuple6[A, B, C, D, E, F]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple6[A, B, C, D, E, F]]]
  inline def forkJoin[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable[js.Tuple6[T, T2, T3, T4, T5, T6]] = (^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple6[T, T2, T3, T4, T5, T6]]]
  
  inline def forkJoin_T[T](sources: ObservableInput[T]*): Observable[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[T]]]
  inline def forkJoin_T[T](v1: SubscribableOrPromise[T]): Observable[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(v1.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[T]]]
  
  inline def forkJoin_TK_String[T, K /* <: /* keyof T */ String */](sourcesObject: T): Observable[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: rxjs.rxjs/internal/types.ObservedValueOf<T[K]>}
    */ forkJoin & TopLevel[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sourcesObject.asInstanceOf[js.Any]).asInstanceOf[Observable[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: rxjs.rxjs/internal/types.ObservedValueOf<T[K]>}
    */ forkJoin & TopLevel[T]
  ]]
}
