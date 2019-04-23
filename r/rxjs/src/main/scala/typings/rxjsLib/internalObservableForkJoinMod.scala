package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/forkJoin", JSImport.Namespace)
@js.native
object internalObservableForkJoinMod extends js.Object {
  def forkJoin(args: (rxjsLib.internalTypesMod.ObservableInput[_] | js.Function)*): rxjsLib.internalObservableMod.Observable[_] = js.native
  def forkJoin(sourcesObject: js.Object): rxjsLib.internalObservableMod.Observable[scala.Nothing] = js.native
  def forkJoin[A /* <: js.Array[rxjsLib.internalTypesMod.ObservableInput[_]] */](sources: A): rxjsLib.internalObservableMod.Observable[js.Array[rxjsLib.internalTypesMod.ObservedValuesFromArray[A]]] = js.native
  def forkJoin[A](sources: js.Array[rxjsLib.internalTypesMod.ObservableInput[A]]): rxjsLib.internalObservableMod.Observable[js.Array[A]] = js.native
  def forkJoin[T](v1: rxjsLib.internalTypesMod.SubscribableOrPromise[T]): rxjsLib.internalObservableMod.Observable[js.Array[T]] = js.native
  def forkJoin[A, B](
    sources: js.Tuple2[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B]
    ]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple2[A, B]] = js.native
  def forkJoin[T, T2](v1: rxjsLib.internalTypesMod.ObservableInput[T], v2: rxjsLib.internalTypesMod.ObservableInput[T2]): rxjsLib.internalObservableMod.Observable[js.Tuple2[T, T2]] = js.native
  def forkJoin[A, B, C](
    sources: js.Tuple3[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B], 
      rxjsLib.internalTypesMod.ObservableInput[C]
    ]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple3[A, B, C]] = js.native
  def forkJoin[T, T2, T3](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple3[T, T2, T3]] = js.native
  def forkJoin[A, B, C, D](
    sources: js.Tuple4[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B], 
      rxjsLib.internalTypesMod.ObservableInput[C], 
      rxjsLib.internalTypesMod.ObservableInput[D]
    ]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple4[A, B, C, D]] = js.native
  def forkJoin[T, T2, T3, T4](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def forkJoin[A, B, C, D, E](
    sources: js.Tuple5[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B], 
      rxjsLib.internalTypesMod.ObservableInput[C], 
      rxjsLib.internalTypesMod.ObservableInput[D], 
      rxjsLib.internalTypesMod.ObservableInput[E]
    ]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple5[A, B, C, D, E]] = js.native
  def forkJoin[T, T2, T3, T4, T5](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def forkJoin[A, B, C, D, E, F](
    sources: js.Tuple6[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B], 
      rxjsLib.internalTypesMod.ObservableInput[C], 
      rxjsLib.internalTypesMod.ObservableInput[D], 
      rxjsLib.internalTypesMod.ObservableInput[E], 
      rxjsLib.internalTypesMod.ObservableInput[F]
    ]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple6[A, B, C, D, E, F]] = js.native
  def forkJoin[T, T2, T3, T4, T5, T6](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple6[T, T2, T3, T4, T5, T6]] = js.native
  @JSName("forkJoin")
  def forkJoin_T[T](sources: rxjsLib.internalTypesMod.ObservableInput[T]*): rxjsLib.internalObservableMod.Observable[js.Array[T]] = js.native
  @JSName("forkJoin")
  def forkJoin_TKString[T, K /* <: java.lang.String */](sourcesObject: T): rxjsLib.internalObservableMod.Observable[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: rxjs.rxjs/internal/types.ObservedValueOf<T[K]>}
    */ rxjsLib.rxjsLibStrings.forkJoin with T
  ] = js.native
}

