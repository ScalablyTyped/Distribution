package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.operatorMod.Operator
import typings.rxjs.outerSubscriberMod.OuterSubscriber
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.ObservedValueOf
import typings.rxjs.typesMod.SchedulerLike
import typings.rxjs.typesMod.TeardownLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object combineLatestMod {
  
  @JSImport("rxjs/internal/observable/combineLatest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/observable/combineLatest", "CombineLatestOperator")
  @js.native
  class CombineLatestOperator[T, R] ()
    extends StObject
       with Operator[T, R] {
    def this(resultSelector: js.Function1[/* repeated */ js.Any, R]) = this()
    
    /* CompleteClass */
    override def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic = js.native
    
    var resultSelector: js.Any = js.native
  }
  
  @JSImport("rxjs/internal/observable/combineLatest", "CombineLatestSubscriber")
  @js.native
  class CombineLatestSubscriber[T, R] protected () extends OuterSubscriber[T, R] {
    def this(destination: Subscriber[R]) = this()
    def this(destination: Subscriber[R], resultSelector: js.Function1[/* repeated */ js.Any, R]) = this()
    
    /* protected */ def _next(observable: js.Any): Unit = js.native
    
    var _tryResultSelector: js.Any = js.native
    
    var active: js.Any = js.native
    
    def notifyComplete(unused: Subscriber[R]): Unit = js.native
    
    def notifyNext(_outerValue: T, innerValue: R, outerIndex: Double): Unit = js.native
    
    var observables: js.Any = js.native
    
    var resultSelector: js.Any = js.native
    
    var toRespond: js.Any = js.native
    
    var values: js.Any = js.native
  }
  
  @scala.inline
  def combineLatest[R](observables: (ObservableInput[js.Any] | (js.Function1[/* repeated */ js.Any, R]) | SchedulerLike)*): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */](sources: js.Array[O1]): Observable[js.Array[ObservedValueOf[O1]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[ObservedValueOf[O1]]]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */](sources: js.Array[O1], scheduler: SchedulerLike): Observable[js.Array[ObservedValueOf[O1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Array[ObservedValueOf[O1]]]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */](v1: O1): Observable[js.Array[ObservedValueOf[O1]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[ObservedValueOf[O1]]]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */](v1: O1, scheduler: SchedulerLike): Observable[js.Array[ObservedValueOf[O1]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Array[ObservedValueOf[O1]]]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, R](sources: js.Array[O1], resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, R](
    sources: js.Array[O1],
    resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */](sources: js.Tuple2[O1, O2]): Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */](sources: js.Tuple2[O1, O2], scheduler: SchedulerLike): Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R], scheduler: SchedulerLike): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2): Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, scheduler: SchedulerLike): Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, R](
    sources: js.Tuple2[O1, O2],
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, R](
    sources: js.Tuple2[O1, O2],
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */](sources: js.Tuple3[O1, O2, O3]): Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */](sources: js.Tuple3[O1, O2, O3], scheduler: SchedulerLike): Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3): Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, scheduler: SchedulerLike): Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, R](
    sources: js.Tuple3[O1, O2, O3],
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, R](
    sources: js.Tuple3[O1, O2, O3],
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */](sources: js.Tuple4[O1, O2, O3, O4]): Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */](sources: js.Tuple4[O1, O2, O3, O4], scheduler: SchedulerLike): Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4): Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, scheduler: SchedulerLike): Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, R](
    sources: js.Tuple4[O1, O2, O3, O4],
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, R](
    sources: js.Tuple4[O1, O2, O3, O4],
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */](sources: js.Tuple5[O1, O2, O3, O4, O5]): Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */](sources: js.Tuple5[O1, O2, O3, O4, O5], scheduler: SchedulerLike): Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, scheduler: SchedulerLike): Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, R](
    sources: js.Tuple5[O1, O2, O3, O4, O5],
    resultSelector: js.Function5[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, R](
    sources: js.Tuple5[O1, O2, O3, O4, O5],
    resultSelector: js.Function5[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */](sources: js.Tuple6[O1, O2, O3, O4, O5, O6]): Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */](sources: js.Tuple6[O1, O2, O3, O4, O5, O6], scheduler: SchedulerLike): Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    resultSelector: js.Function5[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    resultSelector: js.Function5[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6, scheduler: SchedulerLike): Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */, R](
    sources: js.Tuple6[O1, O2, O3, O4, O5, O6],
    resultSelector: js.Function6[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      /* v6 */ ObservedValueOf[O6], 
      R
    ]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */, R](
    sources: js.Tuple6[O1, O2, O3, O4, O5, O6],
    resultSelector: js.Function6[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      /* v6 */ ObservedValueOf[O6], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    v6: O6,
    resultSelector: js.Function6[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      /* v6 */ ObservedValueOf[O6], 
      R
    ]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest[O1 /* <: ObservableInput[js.Any] */, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    v6: O6,
    resultSelector: js.Function6[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      /* v6 */ ObservedValueOf[O6], 
      R
    ],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
  @scala.inline
  def combineLatest_O_ObservableInputAny[O /* <: ObservableInput[js.Any] */](observables: (O | SchedulerLike)*): Observable[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[js.Any]]]
  @scala.inline
  def combineLatest_O_ObservableInputAny[O /* <: ObservableInput[js.Any] */](sources: js.Array[O]): Observable[js.Array[ObservedValueOf[O]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[js.Array[ObservedValueOf[O]]]]
  @scala.inline
  def combineLatest_O_ObservableInputAny[O /* <: ObservableInput[js.Any] */](sources: js.Array[O], scheduler: SchedulerLike): Observable[js.Array[ObservedValueOf[O]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[js.Array[ObservedValueOf[O]]]]
  
  @scala.inline
  def combineLatest_O_ObservableInputAnyR[O /* <: ObservableInput[js.Any] */, R](
    observables: ((js.Function1[(/* repeated */ js.Any) | (/* repeated */ ObservedValueOf[O]), R]) | O | ObservableInput[js.Any] | SchedulerLike)*
  ): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest_O_ObservableInputAnyR[O /* <: ObservableInput[js.Any] */, R](sources: js.Array[O], resultSelector: js.Function1[/* repeated */ ObservedValueOf[O], R]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def combineLatest_O_ObservableInputAnyR[O /* <: ObservableInput[js.Any] */, R](
    sources: js.Array[O],
    resultSelector: js.Function1[/* repeated */ ObservedValueOf[O], R],
    scheduler: SchedulerLike
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
}
