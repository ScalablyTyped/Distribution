package typings.rxjs

import org.scalablytyped.runtime.TopLevel
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.rxjsStrings.forkJoin
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.ObservedValuesFromArray
import typings.rxjs.typesMod.SubscribableOrPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forkJoinMod {
  
  @JSImport("rxjs/internal/observable/forkJoin", "forkJoin")
  @js.native
  def forkJoin(args: (ObservableInput[_] | js.Function)*): Observable[_] = js.native
  @JSImport("rxjs/internal/observable/forkJoin", "forkJoin")
  @js.native
  def forkJoin(sourcesObject: js.Object): Observable[scala.Nothing] = js.native
  @JSImport("rxjs/internal/observable/forkJoin", "forkJoin")
  @js.native
  def forkJoin[A /* <: js.Array[ObservableInput[_]] */](sources: A): Observable[js.Array[ObservedValuesFromArray[A]]] = js.native
  @JSImport("rxjs/internal/observable/forkJoin", "forkJoin")
  @js.native
  def forkJoin[A](sources: js.Array[ObservableInput[A]]): Observable[js.Array[A]] = js.native
  @JSImport("rxjs/internal/observable/forkJoin", "forkJoin")
  @js.native
  def forkJoin[T](v1: SubscribableOrPromise[T]): Observable[js.Array[T]] = js.native
  @JSImport("rxjs/internal/observable/forkJoin", "forkJoin")
  @js.native
  def forkJoin[A, B](sources: js.Tuple2[ObservableInput[A], ObservableInput[B]]): Observable[js.Tuple2[A, B]] = js.native
  @JSImport("rxjs/internal/observable/forkJoin", "forkJoin")
  @js.native
  def forkJoin[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2]): Observable[js.Tuple2[T, T2]] = js.native
  @JSImport("rxjs/internal/observable/forkJoin", "forkJoin")
  @js.native
  def forkJoin[A, B, C](sources: js.Tuple3[ObservableInput[A], ObservableInput[B], ObservableInput[C]]): Observable[js.Tuple3[A, B, C]] = js.native
  @JSImport("rxjs/internal/observable/forkJoin", "forkJoin")
  @js.native
  def forkJoin[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable[js.Tuple3[T, T2, T3]] = js.native
  @JSImport("rxjs/internal/observable/forkJoin", "forkJoin")
  @js.native
  def forkJoin[A, B, C, D](sources: js.Tuple4[ObservableInput[A], ObservableInput[B], ObservableInput[C], ObservableInput[D]]): Observable[js.Tuple4[A, B, C, D]] = js.native
  @JSImport("rxjs/internal/observable/forkJoin", "forkJoin")
  @js.native
  def forkJoin[T, T2, T3, T4](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  @JSImport("rxjs/internal/observable/forkJoin", "forkJoin")
  @js.native
  def forkJoin[A, B, C, D, E](
    sources: js.Tuple5[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E]
    ]
  ): Observable[js.Tuple5[A, B, C, D, E]] = js.native
  @JSImport("rxjs/internal/observable/forkJoin", "forkJoin")
  @js.native
  def forkJoin[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5]
  ): Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  @JSImport("rxjs/internal/observable/forkJoin", "forkJoin")
  @js.native
  def forkJoin[A, B, C, D, E, F](
    sources: js.Tuple6[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E], 
      ObservableInput[F]
    ]
  ): Observable[js.Tuple6[A, B, C, D, E, F]] = js.native
  @JSImport("rxjs/internal/observable/forkJoin", "forkJoin")
  @js.native
  def forkJoin[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable[js.Tuple6[T, T2, T3, T4, T5, T6]] = js.native
  @JSImport("rxjs/internal/observable/forkJoin", "forkJoin")
  @js.native
  def forkJoin_T[T](sources: ObservableInput[T]*): Observable[js.Array[T]] = js.native
  @JSImport("rxjs/internal/observable/forkJoin", "forkJoin")
  @js.native
  def forkJoin_TK_String[T, K /* <: /* keyof T */ String */](sourcesObject: T): Observable[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: rxjs.rxjs/internal/types.ObservedValueOf<T[K]>}
    */ forkJoin with TopLevel[T]
  ] = js.native
}
