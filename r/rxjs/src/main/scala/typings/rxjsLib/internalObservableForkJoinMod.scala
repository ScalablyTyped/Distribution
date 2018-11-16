package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/forkJoin", JSImport.Namespace)
@js.native
object internalObservableForkJoinMod extends js.Object {
  def forkJoin(args: (rxjsLib.internalTypesMod.ObservableInput[_] | js.Function)*): rxjsLib.internalObservableMod.Observable[_] = js.native
  def forkJoin[T](sources: js.Array[rxjsLib.internalTypesMod.ObservableInput[T]]): rxjsLib.internalObservableMod.Observable[js.Array[T]] = js.native
  def forkJoin[T](v1: rxjsLib.internalTypesMod.ObservableInput[T]): rxjsLib.internalObservableMod.Observable[js.Array[T]] = js.native
  def forkJoin[T, T2](
    sources: js.Tuple2[
      rxjsLib.internalTypesMod.ObservableInput[T], 
      rxjsLib.internalTypesMod.ObservableInput[T2]
    ]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple2[T, T2]] = js.native
  def forkJoin[T, T2](v1: rxjsLib.internalTypesMod.ObservableInput[T], v2: rxjsLib.internalTypesMod.ObservableInput[T2]): rxjsLib.internalObservableMod.Observable[js.Tuple2[T, T2]] = js.native
  def forkJoin[T, T2, T3](
    sources: js.Tuple3[
      rxjsLib.internalTypesMod.ObservableInput[T], 
      rxjsLib.internalTypesMod.ObservableInput[T2], 
      rxjsLib.internalTypesMod.ObservableInput[T3]
    ]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple3[T, T2, T3]] = js.native
  def forkJoin[T, T2, T3](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple3[T, T2, T3]] = js.native
  def forkJoin[T, T2, T3, T4](
    sources: js.Tuple4[
      rxjsLib.internalTypesMod.ObservableInput[T], 
      rxjsLib.internalTypesMod.ObservableInput[T2], 
      rxjsLib.internalTypesMod.ObservableInput[T3], 
      rxjsLib.internalTypesMod.ObservableInput[T4]
    ]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def forkJoin[T, T2, T3, T4](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def forkJoin[T, T2, T3, T4, T5](
    sources: js.Tuple5[
      rxjsLib.internalTypesMod.ObservableInput[T], 
      rxjsLib.internalTypesMod.ObservableInput[T2], 
      rxjsLib.internalTypesMod.ObservableInput[T3], 
      rxjsLib.internalTypesMod.ObservableInput[T4], 
      rxjsLib.internalTypesMod.ObservableInput[T5]
    ]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def forkJoin[T, T2, T3, T4, T5](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def forkJoin[T, T2, T3, T4, T5, T6](
    sources: js.Tuple6[
      rxjsLib.internalTypesMod.ObservableInput[T], 
      rxjsLib.internalTypesMod.ObservableInput[T2], 
      rxjsLib.internalTypesMod.ObservableInput[T3], 
      rxjsLib.internalTypesMod.ObservableInput[T4], 
      rxjsLib.internalTypesMod.ObservableInput[T5], 
      rxjsLib.internalTypesMod.ObservableInput[T6]
    ]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple6[T, T2, T3, T4, T5, T6]] = js.native
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
}

