package typings
package rxjsLib.internalObservableCombineLatestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/combineLatest", JSImport.Namespace)
@js.native
object internalObservableCombineLatestModMembers extends js.Object {
  def combineLatest[R](array: js.Array[rxjsLib.internalTypesMod.ObservableInput[_]]): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[R](
    array: js.Array[rxjsLib.internalTypesMod.ObservableInput[_]],
    resultSelector: js.Function1[/* repeated */js.Any, R]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[R](
    array: js.Array[rxjsLib.internalTypesMod.ObservableInput[_]],
    resultSelector: js.Function1[/* repeated */js.Any, R],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[R](
    array: js.Array[rxjsLib.internalTypesMod.ObservableInput[_]],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[R](
    observables: (rxjsLib.internalTypesMod.ObservableInput[_] | (js.Function1[/* repeated */js.Any, R]) | rxjsLib.internalTypesMod.SchedulerLike)*
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[T, R](v1: rxjsLib.internalTypesMod.ObservableInput[T], resultSelector: js.Function1[/* v1 */ T, R]): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[T, R](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    resultSelector: js.Function1[/* v1 */ T, R],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[T, T2](v1: rxjsLib.internalTypesMod.ObservableInput[T], v2: rxjsLib.internalTypesMod.ObservableInput[T2]): rxjsLib.internalObservableMod.Observable[js.Tuple2[T, T2]] = js.native
  def combineLatest[T, T2](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[js.Tuple2[T, T2]] = js.native
  def combineLatest[T, T2, R](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, R]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[T, T2, R](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    resultSelector: js.Function2[/* v1 */ T, /* v2 */ T2, R],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[T, T2, T3](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple3[T, T2, T3]] = js.native
  def combineLatest[T, T2, T3](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[js.Tuple3[T, T2, T3]] = js.native
  def combineLatest[T, T2, T3, R](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[T, T2, T3, R](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    resultSelector: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[T, T2, T3, T4](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, T4](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def combineLatest[T, T2, T3, T4, R](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[T, T2, T3, T4, R](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    resultSelector: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[T, T2, T3, T4, T5](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T, T2, T3, T4, T5](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def combineLatest[T, T2, T3, T4, T5, R](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[T, T2, T3, T4, T5, R](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    resultSelector: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[T, T2, T3, T4, T5, T6](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple6[T, T2, T3, T4, T5, T6]] = js.native
  def combineLatest[T, T2, T3, T4, T5, T6](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[js.Tuple6[T, T2, T3, T4, T5, T6]] = js.native
  def combineLatest[T, T2, T3, T4, T5, T6, R](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6],
    resultSelector: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[T, T2, T3, T4, T5, T6, R](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6],
    resultSelector: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  @JSName("combineLatest")
  def combineLatest_T[T](array: js.Array[rxjsLib.internalTypesMod.ObservableInput[T]]): rxjsLib.internalObservableMod.Observable[js.Array[T]] = js.native
  @JSName("combineLatest")
  def combineLatest_T[T](
    array: js.Array[rxjsLib.internalTypesMod.ObservableInput[T]],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[js.Array[T]] = js.native
  @JSName("combineLatest")
  def combineLatest_T[T](
    observables: (rxjsLib.internalTypesMod.ObservableInput[T] | rxjsLib.internalTypesMod.SchedulerLike)*
  ): rxjsLib.internalObservableMod.Observable[js.Array[T]] = js.native
  @JSName("combineLatest")
  def combineLatest_TR[T, R](
    array: js.Array[rxjsLib.internalTypesMod.ObservableInput[T]],
    resultSelector: js.Function1[/* repeated */T, R]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  @JSName("combineLatest")
  def combineLatest_TR[T, R](
    array: js.Array[rxjsLib.internalTypesMod.ObservableInput[T]],
    resultSelector: js.Function1[/* repeated */T, R],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  @JSName("combineLatest")
  def combineLatest_TR[T, R](
    observables: (rxjsLib.internalTypesMod.ObservableInput[T] | (js.Function1[/* repeated */T, R]) | rxjsLib.internalTypesMod.SchedulerLike)*
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
}

