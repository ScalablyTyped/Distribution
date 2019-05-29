package typings
package rxjsLib.internalObservableCombineLatestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/combineLatest", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def combineLatest[R](
    observables: (rxjsLib.internalTypesMod.ObservableInput[_] | (js.Function1[/* repeated */ js.Any, R]) | rxjsLib.internalTypesMod.SchedulerLike)*
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](sources: js.Array[O1]): rxjsLib.internalObservableMod.Observable[js.Array[rxjsLib.internalTypesMod.ObservedValueOf[O1]]] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](sources: js.Array[O1], scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[js.Array[rxjsLib.internalTypesMod.ObservedValueOf[O1]]] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1): rxjsLib.internalObservableMod.Observable[js.Array[rxjsLib.internalTypesMod.ObservedValueOf[O1]]] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[js.Array[rxjsLib.internalTypesMod.ObservedValueOf[O1]]] = js.native
  def combineLatest[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    sources: js.Array[O],
    resultSelector: js.Function1[/* repeated */ rxjsLib.internalTypesMod.ObservedValueOf[O], R]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    sources: js.Array[O],
    resultSelector: js.Function1[/* repeated */ rxjsLib.internalTypesMod.ObservedValueOf[O], R],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](sources: js.Tuple2[O1, O2]): rxjsLib.internalObservableMod.Observable[
    js.Tuple2[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](sources: js.Tuple2[O1, O2], scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    js.Tuple2[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], R]): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    v1: O1,
    resultSelector: js.Function1[/* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], R],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2): rxjsLib.internalObservableMod.Observable[
    js.Tuple2[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    js.Tuple2[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    sources: js.Tuple2[O1, O2],
    resultSelector: js.Function2[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      R
    ]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    sources: js.Tuple2[O1, O2],
    resultSelector: js.Function2[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      R
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](sources: js.Tuple3[O1, O2, O3]): rxjsLib.internalObservableMod.Observable[
    js.Tuple3[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](sources: js.Tuple3[O1, O2, O3], scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    js.Tuple3[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      R
    ]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      R
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3): rxjsLib.internalObservableMod.Observable[
    js.Tuple3[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    js.Tuple3[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    sources: js.Tuple3[O1, O2, O3],
    resultSelector: js.Function3[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      R
    ]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    sources: js.Tuple3[O1, O2, O3],
    resultSelector: js.Function3[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      R
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](sources: js.Tuple4[O1, O2, O3, O4]): rxjsLib.internalObservableMod.Observable[
    js.Tuple4[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](sources: js.Tuple4[O1, O2, O3, O4], scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    js.Tuple4[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    resultSelector: js.Function3[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      R
    ]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    resultSelector: js.Function3[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      R
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4): rxjsLib.internalObservableMod.Observable[
    js.Tuple4[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    js.Tuple4[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    sources: js.Tuple4[O1, O2, O3, O4],
    resultSelector: js.Function4[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      /* v4 */ rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      R
    ]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    sources: js.Tuple4[O1, O2, O3, O4],
    resultSelector: js.Function4[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      /* v4 */ rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      R
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](sources: js.Tuple5[O1, O2, O3, O4, O5]): rxjsLib.internalObservableMod.Observable[
    js.Tuple5[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      rxjsLib.internalTypesMod.ObservedValueOf[O5]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](sources: js.Tuple5[O1, O2, O3, O4, O5], scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    js.Tuple5[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      rxjsLib.internalTypesMod.ObservedValueOf[O5]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    resultSelector: js.Function4[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      /* v4 */ rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      R
    ]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    resultSelector: js.Function4[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      /* v4 */ rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      R
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): rxjsLib.internalObservableMod.Observable[
    js.Tuple5[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      rxjsLib.internalTypesMod.ObservedValueOf[O5]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    js.Tuple5[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      rxjsLib.internalTypesMod.ObservedValueOf[O5]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    sources: js.Tuple5[O1, O2, O3, O4, O5],
    resultSelector: js.Function5[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      /* v4 */ rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      /* v5 */ rxjsLib.internalTypesMod.ObservedValueOf[O5], 
      R
    ]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    sources: js.Tuple5[O1, O2, O3, O4, O5],
    resultSelector: js.Function5[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      /* v4 */ rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      /* v5 */ rxjsLib.internalTypesMod.ObservedValueOf[O5], 
      R
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O6 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](sources: js.Tuple6[O1, O2, O3, O4, O5, O6]): rxjsLib.internalObservableMod.Observable[
    js.Tuple6[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      rxjsLib.internalTypesMod.ObservedValueOf[O5], 
      rxjsLib.internalTypesMod.ObservedValueOf[O6]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O6 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](sources: js.Tuple6[O1, O2, O3, O4, O5, O6], scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    js.Tuple6[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      rxjsLib.internalTypesMod.ObservedValueOf[O5], 
      rxjsLib.internalTypesMod.ObservedValueOf[O6]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    resultSelector: js.Function5[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      /* v4 */ rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      /* v5 */ rxjsLib.internalTypesMod.ObservedValueOf[O5], 
      R
    ]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    resultSelector: js.Function5[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      /* v4 */ rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      /* v5 */ rxjsLib.internalTypesMod.ObservedValueOf[O5], 
      R
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O6 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): rxjsLib.internalObservableMod.Observable[
    js.Tuple6[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      rxjsLib.internalTypesMod.ObservedValueOf[O5], 
      rxjsLib.internalTypesMod.ObservedValueOf[O6]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O6 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    js.Tuple6[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      rxjsLib.internalTypesMod.ObservedValueOf[O5], 
      rxjsLib.internalTypesMod.ObservedValueOf[O6]
    ]
  ] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O6 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    sources: js.Tuple6[O1, O2, O3, O4, O5, O6],
    resultSelector: js.Function6[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      /* v4 */ rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      /* v5 */ rxjsLib.internalTypesMod.ObservedValueOf[O5], 
      /* v6 */ rxjsLib.internalTypesMod.ObservedValueOf[O6], 
      R
    ]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O6 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    sources: js.Tuple6[O1, O2, O3, O4, O5, O6],
    resultSelector: js.Function6[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      /* v4 */ rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      /* v5 */ rxjsLib.internalTypesMod.ObservedValueOf[O5], 
      /* v6 */ rxjsLib.internalTypesMod.ObservedValueOf[O6], 
      R
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O6 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    v6: O6,
    resultSelector: js.Function6[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      /* v4 */ rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      /* v5 */ rxjsLib.internalTypesMod.ObservedValueOf[O5], 
      /* v6 */ rxjsLib.internalTypesMod.ObservedValueOf[O6], 
      R
    ]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O6 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    v6: O6,
    resultSelector: js.Function6[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      /* v3 */ rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      /* v4 */ rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      /* v5 */ rxjsLib.internalTypesMod.ObservedValueOf[O5], 
      /* v6 */ rxjsLib.internalTypesMod.ObservedValueOf[O6], 
      R
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  @JSName("combineLatest")
  def combineLatest_O1ObservableInputR[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    sources: js.Array[O1],
    resultSelector: js.Function1[/* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], R]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  @JSName("combineLatest")
  def combineLatest_O1ObservableInputR[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    sources: js.Array[O1],
    resultSelector: js.Function1[/* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], R],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  @JSName("combineLatest")
  def combineLatest_OObservableInput[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](observables: (O | rxjsLib.internalTypesMod.SchedulerLike)*): rxjsLib.internalObservableMod.Observable[js.Array[_]] = js.native
  @JSName("combineLatest")
  def combineLatest_OObservableInput[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](sources: js.Array[O]): rxjsLib.internalObservableMod.Observable[js.Array[rxjsLib.internalTypesMod.ObservedValueOf[O]]] = js.native
  @JSName("combineLatest")
  def combineLatest_OObservableInput[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](sources: js.Array[O], scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[js.Array[rxjsLib.internalTypesMod.ObservedValueOf[O]]] = js.native
  @JSName("combineLatest")
  def combineLatest_OObservableInputR[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    observables: ((js.Function1[
      (/* repeated */ js.Any) | (/* repeated */ rxjsLib.internalTypesMod.ObservedValueOf[O]), 
      R
    ]) | O | rxjsLib.internalTypesMod.ObservableInput[_] | rxjsLib.internalTypesMod.SchedulerLike)*
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
}

