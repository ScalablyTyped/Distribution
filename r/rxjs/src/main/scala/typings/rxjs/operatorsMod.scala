package typings.rxjs

import typings.rxjs.connectableObservableMod.ConnectableObservable
import typings.rxjs.groupByMod.GroupedObservable
import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.notificationMod.Notification
import typings.rxjs.rxjsBooleans.`false`
import typings.rxjs.shareReplayMod.ShareReplayConfig
import typings.rxjs.subjectMod.Subject
import typings.rxjs.throttleMod.ThrottleConfig
import typings.rxjs.timeIntervalMod.TimeInterval_
import typings.rxjs.timestampMod.Timestamp_
import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.ObservedValueOf
import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.PartialObserver
import typings.rxjs.typesMod.SchedulerLike
import typings.rxjs.typesMod.SubscribableOrPromise
import typings.rxjs.typesMod.UnaryFunction
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsMod {
  
  @JSImport("rxjs/internal/operators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def audit[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[js.Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("audit")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def auditTime[T](duration: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("auditTime")(duration.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def auditTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("auditTime")(duration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def buffer[T](closingNotifier: Observable[js.Any]): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(closingNotifier.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  
  @scala.inline
  def bufferCount[T](bufferSize: Double): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferCount")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  @scala.inline
  def bufferCount[T](bufferSize: Double, startBufferEvery: Double): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferCount")(bufferSize.asInstanceOf[js.Any], startBufferEvery.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  
  @scala.inline
  def bufferTime[T](bufferTimeSpan: Double): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  @scala.inline
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  @scala.inline
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  @scala.inline
  def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Double,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  @scala.inline
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  @scala.inline
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  @scala.inline
  def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Null,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  @scala.inline
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  @scala.inline
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Unit, maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  @scala.inline
  def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Unit,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  @scala.inline
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Unit, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  @scala.inline
  def bufferTime[T](bufferTimeSpan: Double, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  
  @scala.inline
  def bufferToggle[T, O](
    openings: SubscribableOrPromise[O],
    closingSelector: js.Function1[/* value */ O, SubscribableOrPromise[js.Any]]
  ): OperatorFunction[T, js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferToggle")(openings.asInstanceOf[js.Any], closingSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  
  @scala.inline
  def bufferWhen[T](closingSelector: js.Function0[Observable[js.Any]]): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferWhen")(closingSelector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  
  @scala.inline
  def catchError[T, O /* <: ObservableInput[js.Any] */](selector: js.Function2[/* err */ js.Any, /* caught */ Observable[T], O]): OperatorFunction[T, T | ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("catchError")(selector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | ObservedValueOf[O]]]
  
  @scala.inline
  def combineAll[T](): OperatorFunction[js.Any, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")().asInstanceOf[OperatorFunction[js.Any, js.Array[T]]]
  @scala.inline
  def combineAll[R](project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[js.Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[js.Any, R]]
  
  @scala.inline
  def combineAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[ObservableInput[T], R]]
  
  @scala.inline
  def combineLatest[T, R](array: js.Array[ObservableInput[T]]): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(array.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Array[T]]]
  @scala.inline
  def combineLatest[T, R](observables: (ObservableInput[T] | (js.Function1[/* repeated */ T, R]))*): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def combineLatest[T, R](project: js.Function1[/* v1 */ T, R]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def combineLatest[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, js.Tuple2[T, T2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Tuple2[T, T2]]]
  @scala.inline
  def combineLatest[T, TOther, R](
    array: js.Array[ObservableInput[TOther]],
    project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(array.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def combineLatest[T, T2, R](v2: ObservableInput[T2], project: js.Function2[/* v1 */ T, /* v2 */ T2, R]): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def combineLatest[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, js.Tuple3[T, T2, T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple3[T, T2, T3]]]
  @scala.inline
  def combineLatest[T, T2, T3, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def combineLatest[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, js.Tuple4[T, T2, T3, T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple4[T, T2, T3, T4]]]
  @scala.inline
  def combineLatest[T, T2, T3, T4, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def combineLatest[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, js.Tuple5[T, T2, T3, T4, T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple5[T, T2, T3, T4, T5]]]
  @scala.inline
  def combineLatest[T, T2, T3, T4, T5, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def combineLatest[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): OperatorFunction[T, js.Tuple6[T, T2, T3, T4, T5, T6]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple6[T, T2, T3, T4, T5, T6]]]
  @scala.inline
  def combineLatest[T, T2, T3, T4, T5, T6, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def concat[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def concat[T](observables: (ObservableInput[T] | SchedulerLike)*): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(observables.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def concat[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def concat[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, T | T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | T2]]
  @scala.inline
  def concat[T, T2](v2: ObservableInput[T2], scheduler: SchedulerLike): OperatorFunction[T, T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2]]
  @scala.inline
  def concat[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
  @scala.inline
  def concat[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
  @scala.inline
  def concat[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
  @scala.inline
  def concat[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
  @scala.inline
  def concat[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
  @scala.inline
  def concat[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
  @scala.inline
  def concat[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
  @scala.inline
  def concat[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
  
  @scala.inline
  def concatAll[T](): OperatorFunction[ObservableInput[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")().asInstanceOf[OperatorFunction[ObservableInput[T], T]]
  
  @scala.inline
  def concatAll_R[R](): OperatorFunction[js.Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")().asInstanceOf[OperatorFunction[js.Any, R]]
  
  @scala.inline
  def concatMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def concatMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], resultSelector: Unit): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def concatMap[T, R, O /* <: ObservableInput[js.Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def concatMapTo[T, O /* <: ObservableInput[js.Any] */](observable: O): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def concatMapTo[T, O /* <: ObservableInput[js.Any] */](observable: O, resultSelector: Unit): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def concatMapTo[T, R, O /* <: ObservableInput[js.Any] */](
    observable: O,
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def concat_TR_OperatorFunction[T, R](observables: (ObservableInput[js.Any] | SchedulerLike)*): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def count[T](): OperatorFunction[T, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[OperatorFunction[T, Double]]
  @scala.inline
  def count[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Double]]
  
  @scala.inline
  def debounce[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[js.Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def debounceTime[T](dueTime: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounceTime")(dueTime.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def debounceTime[T](dueTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounceTime")(dueTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def defaultIfEmpty[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def defaultIfEmpty[T](defaultValue: T): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def defaultIfEmpty_TR_OperatorFunction[T, R](): OperatorFunction[T, T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")().asInstanceOf[OperatorFunction[T, T | R]]
  @scala.inline
  def defaultIfEmpty_TR_OperatorFunction[T, R](defaultValue: R): OperatorFunction[T, T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | R]]
  
  @scala.inline
  def delay[T](delay: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delay.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def delay[T](delay: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delay.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def delay[T](delay: Date): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delay.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def delay[T](delay: Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delay.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def delayWhen[T](
    delayDurationSelector: js.Function2[/* value */ T, /* index */ Double, Observable[js.Any | scala.Nothing]]
  ): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delayWhen")(delayDurationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def delayWhen[T](
    delayDurationSelector: js.Function2[/* value */ T, /* index */ Double, Observable[js.Any | scala.Nothing]],
    subscriptionDelay: Observable[js.Any]
  ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delayWhen")(delayDurationSelector.asInstanceOf[js.Any], subscriptionDelay.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def dematerialize[T](): OperatorFunction[Notification[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("dematerialize")().asInstanceOf[OperatorFunction[Notification[T], T]]
  
  @scala.inline
  def distinct[T, K](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def distinct[T, K](keySelector: js.Function1[/* value */ T, K]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def distinct[T, K](keySelector: js.Function1[/* value */ T, K], flushes: Observable[js.Any]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any], flushes.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def distinct[T, K](keySelector: Unit, flushes: Observable[js.Any]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(keySelector.asInstanceOf[js.Any], flushes.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def distinctUntilChanged[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def distinctUntilChanged[T](compare: js.Function2[/* x */ T, /* y */ T, Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")(compare.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def distinctUntilChanged[T, K](compare: js.Function2[/* x */ K, /* y */ K, Boolean], keySelector: js.Function1[/* x */ T, K]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")(compare.asInstanceOf[js.Any], keySelector.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def distinctUntilKeyChanged[T](key: /* keyof T */ String): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilKeyChanged")(key.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def distinctUntilKeyChanged[T, K /* <: /* keyof T */ String */](
    key: K,
    compare: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* x */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* y */ js.Any, 
      Boolean
    ]
  ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilKeyChanged")(key.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def elementAt[T](index: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("elementAt")(index.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def elementAt[T](index: Double, defaultValue: T): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("elementAt")(index.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def every[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Boolean]]
  @scala.inline
  def every[T](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: js.Any
  ): OperatorFunction[T, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Boolean]]
  
  @scala.inline
  def exhaust[T](): OperatorFunction[ObservableInput[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaust")().asInstanceOf[OperatorFunction[ObservableInput[T], T]]
  
  @scala.inline
  def exhaustMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaustMap")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def exhaustMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], resultSelector: Unit): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("exhaustMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def exhaustMap[T, I, R](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[I]],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ I, 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("exhaustMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def exhaust_R[R](): OperatorFunction[js.Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaust")().asInstanceOf[OperatorFunction[js.Any, R]]
  
  @scala.inline
  def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]], concurrent: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def expand[T](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
    concurrent: Double,
    scheduler: SchedulerLike
  ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def expand[T](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def expand_TR_OperatorFunction[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def expand_TR_OperatorFunction[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]], concurrent: Double): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def expand_TR_OperatorFunction[T, R](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def expand_TR_OperatorFunction[T, R](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def filter_TS_T_OperatorFunction[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): OperatorFunction[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, S]]
  @scala.inline
  def filter_TS_T_OperatorFunction[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], thisArg: js.Any): OperatorFunction[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, S]]
  
  @scala.inline
  def finalize_[T](callback: js.Function0[Unit]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("finalize")(callback.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def find[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.UndefOr[T]]]
  @scala.inline
  def find[T](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: js.Any
  ): OperatorFunction[T, js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.UndefOr[T]]]
  
  @scala.inline
  def findIndex[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Double]]
  @scala.inline
  def findIndex[T](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: js.Any
  ): OperatorFunction[T, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Double]]
  
  @scala.inline
  def find_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean]
  ): OperatorFunction[T, js.UndefOr[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.UndefOr[S]]]
  @scala.inline
  def find_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean],
    thisArg: js.Any
  ): OperatorFunction[T, js.UndefOr[S]] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.UndefOr[S]]]
  
  @scala.inline
  def first[T, D](): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def first[T, D](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def first[T, D](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    defaultValue: D
  ): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def first[T, D](predicate: Null, defaultValue: D): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def first[T, D](predicate: Unit, defaultValue: D): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  
  @scala.inline
  def first_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean]
  ): OperatorFunction[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, S]]
  @scala.inline
  def first_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean],
    defaultValue: S
  ): OperatorFunction[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("first")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, S]]
  
  @scala.inline
  def flatMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def flatMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], concurrent: Double): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def flatMap[T, O /* <: ObservableInput[js.Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: Unit,
    concurrent: Double
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def flatMap[T, R, O /* <: ObservableInput[js.Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def flatMap[T, R, O /* <: ObservableInput[js.Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def groupBy[T, K](keySelector: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, GroupedObservable[K, T]]]
  @scala.inline
  def groupBy[T, K](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, T], Observable[js.Any]]
  ): OperatorFunction[T, GroupedObservable[K, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, T]]]
  @scala.inline
  def groupBy[T, K, R](keySelector: js.Function1[/* value */ T, K], elementSelector: js.Function1[/* value */ T, R]): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  @scala.inline
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[js.Any]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  @scala.inline
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[js.Any]],
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  @scala.inline
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: Unit,
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  @scala.inline
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[js.Any]],
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  @scala.inline
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: Unit,
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any], subjectSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  
  @scala.inline
  def groupBy_TKR[T, K, R](keySelector: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  @scala.inline
  def groupBy_TKR[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[js.Any]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(keySelector.asInstanceOf[js.Any], elementSelector.asInstanceOf[js.Any], durationSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, GroupedObservable[K, R]]]
  
  @scala.inline
  def ignoreElements(): OperatorFunction[js.Any, scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("ignoreElements")().asInstanceOf[OperatorFunction[js.Any, scala.Nothing]]
  
  @scala.inline
  def isEmpty[T](): OperatorFunction[T, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")().asInstanceOf[OperatorFunction[T, Boolean]]
  
  @scala.inline
  def last[T, D](): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def last[T, D](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def last[T, D](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    defaultValue: D
  ): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def last[T, D](predicate: Null, defaultValue: D): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def last[T, D](predicate: Unit, defaultValue: D): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  
  @scala.inline
  def last_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean]
  ): OperatorFunction[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, S]]
  @scala.inline
  def last_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean],
    defaultValue: S
  ): OperatorFunction[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("last")(predicate.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, S]]
  
  @scala.inline
  def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R], thisArg: js.Any): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(project.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def mapTo[T, R](value: R): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapTo")(value.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def materialize[T](): OperatorFunction[T, Notification[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("materialize")().asInstanceOf[OperatorFunction[T, Notification[T]]]
  
  @scala.inline
  def max[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def max[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(comparer.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def merge[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def merge[T](concurrent: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(concurrent.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def merge[T](concurrent: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def merge[T](concurrent: Unit, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def merge[T](observables: (ObservableInput[T] | SchedulerLike | Double)*): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(observables.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def merge[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def merge[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, T | T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | T2]]
  @scala.inline
  def merge[T, T2](v2: ObservableInput[T2], concurrent: Double): OperatorFunction[T, T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2]]
  @scala.inline
  def merge[T, T2](v2: ObservableInput[T2], concurrent: Double, scheduler: SchedulerLike): OperatorFunction[T, T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2]]
  @scala.inline
  def merge[T, T2](v2: ObservableInput[T2], concurrent: Unit, scheduler: SchedulerLike): OperatorFunction[T, T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2]]
  @scala.inline
  def merge[T, T2](v2: ObservableInput[T2], scheduler: SchedulerLike): OperatorFunction[T, T | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2]]
  @scala.inline
  def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
  @scala.inline
  def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
  @scala.inline
  def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double, scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
  @scala.inline
  def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Unit, scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
  @scala.inline
  def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
  @scala.inline
  def merge[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
  @scala.inline
  def merge[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], concurrent: Double): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
  @scala.inline
  def merge[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
  @scala.inline
  def merge[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
  @scala.inline
  def merge[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
  @scala.inline
  def merge[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
  @scala.inline
  def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
  @scala.inline
  def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
  @scala.inline
  def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
  @scala.inline
  def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
  @scala.inline
  def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
  @scala.inline
  def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
  @scala.inline
  def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
  @scala.inline
  def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
  @scala.inline
  def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
  
  @scala.inline
  def mergeAll[T](): OperatorFunction[ObservableInput[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")().asInstanceOf[OperatorFunction[ObservableInput[T], T]]
  @scala.inline
  def mergeAll[T](concurrent: Double): OperatorFunction[ObservableInput[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")(concurrent.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[ObservableInput[T], T]]
  
  @scala.inline
  def mergeMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def mergeMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], concurrent: Double): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def mergeMap[T, O /* <: ObservableInput[js.Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: Unit,
    concurrent: Double
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def mergeMap[T, R, O /* <: ObservableInput[js.Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def mergeMap[T, R, O /* <: ObservableInput[js.Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def mergeMapTo[T, O /* <: ObservableInput[js.Any] */](innerObservable: O): OperatorFunction[js.Any, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[js.Any, ObservedValueOf[O]]]
  @scala.inline
  def mergeMapTo[T, O /* <: ObservableInput[js.Any] */](innerObservable: O, concurrent: Double): OperatorFunction[js.Any, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[js.Any, ObservedValueOf[O]]]
  @scala.inline
  def mergeMapTo[T, R, O /* <: ObservableInput[js.Any] */](
    innerObservable: O,
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def mergeMapTo[T, R, O /* <: ObservableInput[js.Any] */](
    innerObservable: O,
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def mergeScan[T, R](
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
    seed: R
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeScan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def mergeScan[T, R](
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
    seed: R,
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeScan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def merge_TR_OperatorFunction[T, R](observables: (ObservableInput[js.Any] | SchedulerLike | Double)*): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def min[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def min[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(comparer.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def multicast[T](subjectFactory: js.ThisFunction0[/* this */ Observable[T], Subject[T]]): UnaryFunction[Observable[T], ConnectableObservable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subjectFactory.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[Observable[T], ConnectableObservable[T]]]
  @scala.inline
  def multicast[T](subject: Subject[T]): UnaryFunction[Observable[T], ConnectableObservable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subject.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[Observable[T], ConnectableObservable[T]]]
  @scala.inline
  def multicast[T, O /* <: ObservableInput[js.Any] */](
    SubjectFactory: js.ThisFunction0[/* this */ Observable[T], Subject[T]],
    selector: js.Function1[/* shared */ Observable[T], O]
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(SubjectFactory.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def multicast[T, O /* <: ObservableInput[js.Any] */](subject: Subject[T], selector: js.Function1[/* shared */ Observable[T], O]): UnaryFunction[Observable[T], ConnectableObservable[ObservedValueOf[O]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subject.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[Observable[T], ConnectableObservable[ObservedValueOf[O]]]]
  
  @scala.inline
  def observeOn[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observeOn")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def observeOn[T](scheduler: SchedulerLike, delay: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("observeOn")(scheduler.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def onErrorResumeNext[T](): OperatorFunction[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")().asInstanceOf[OperatorFunction[T, T]]
  @scala.inline
  def onErrorResumeNext[T, R](array: js.Array[ObservableInput[js.Any]]): OperatorFunction[T, T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(array.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | R]]
  @scala.inline
  def onErrorResumeNext[T, R](observables: ObservableInput[js.Any]*): OperatorFunction[T, T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | R]]
  @scala.inline
  def onErrorResumeNext[T, T2](v: ObservableInput[T2]): OperatorFunction[T, T | T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | T2]]
  @scala.inline
  def onErrorResumeNext[T, T2, T3](v: ObservableInput[T2], v2: ObservableInput[T3]): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
  @scala.inline
  def onErrorResumeNext[T, T2, T3, T4](v: ObservableInput[T2], v2: ObservableInput[T3], v3: ObservableInput[T4]): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
  @scala.inline
  def onErrorResumeNext[T, T2, T3, T4, T5](v: ObservableInput[T2], v2: ObservableInput[T3], v3: ObservableInput[T4], v4: ObservableInput[T5]): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
  @scala.inline
  def onErrorResumeNext[T, T2, T3, T4, T5, T6](
    v: ObservableInput[T2],
    v2: ObservableInput[T3],
    v3: ObservableInput[T4],
    v4: ObservableInput[T5],
    v5: ObservableInput[T6]
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
  @scala.inline
  def onErrorResumeNext[T, T2, T3, T4, T5, T6, T7](
    v: ObservableInput[T2],
    v2: ObservableInput[T3],
    v3: ObservableInput[T4],
    v4: ObservableInput[T5],
    v5: ObservableInput[T6],
    v6: ObservableInput[T7]
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6 | T7] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6 | T7]]
  
  @scala.inline
  def pairwise[T](): OperatorFunction[T, js.Tuple2[T, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairwise")().asInstanceOf[OperatorFunction[T, js.Tuple2[T, T]]]
  
  @scala.inline
  def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): UnaryFunction[Observable[T], js.Tuple2[Observable[T], Observable[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[Observable[T], js.Tuple2[Observable[T], Observable[T]]]]
  @scala.inline
  def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): UnaryFunction[Observable[T], js.Tuple2[Observable[T], Observable[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[Observable[T], js.Tuple2[Observable[T], Observable[T]]]]
  
  @scala.inline
  def pluck[T, K1 /* <: /* keyof T */ String */](k1: K1): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1] */ js.Any
  ]]
  @scala.inline
  def pluck[T, R](properties: String*): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(properties.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */](k1: K1, k2: K2): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2] */ js.Any
  ]]
  @scala.inline
  def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */](k1: K1, k2: K2, k3: K3): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any], k3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3] */ js.Any
  ]]
  @scala.inline
  def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */](k1: K1, k2: K2, k3: K3, k4: K4): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any], k3.asInstanceOf[js.Any], k4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4] */ js.Any
  ]]
  @scala.inline
  def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */, K5 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3][K4] */ js.Any */](k1: K1, k2: K2, k3: K3, k4: K4, k5: K5): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4][K5] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any], k3.asInstanceOf[js.Any], k4.asInstanceOf[js.Any], k5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4][K5] */ js.Any
  ]]
  @scala.inline
  def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */, K5 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3][K4] */ js.Any */, K6 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3][K4][K5] */ js.Any */](k1: K1, k2: K2, k3: K3, k4: K4, k5: K5, k6: K6): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4][K5][K6] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any], k3.asInstanceOf[js.Any], k4.asInstanceOf[js.Any], k5.asInstanceOf[js.Any], k6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4][K5][K6] */ js.Any
  ]]
  
  @scala.inline
  def publish[T](): UnaryFunction[Observable[T], ConnectableObservable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")().asInstanceOf[UnaryFunction[Observable[T], ConnectableObservable[T]]]
  @scala.inline
  def publish[T](selector: MonoTypeOperatorFunction[T]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")(selector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def publishBehavior[T](value: T): UnaryFunction[Observable[T], ConnectableObservable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishBehavior")(value.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[Observable[T], ConnectableObservable[T]]]
  
  @scala.inline
  def publishLast[T](): UnaryFunction[Observable[T], ConnectableObservable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishLast")().asInstanceOf[UnaryFunction[Observable[T], ConnectableObservable[T]]]
  
  @scala.inline
  def publishReplay[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def publishReplay[T](bufferSize: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def publishReplay[T](bufferSize: Double, windowTime: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def publishReplay[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def publishReplay[T](bufferSize: Double, windowTime: Unit, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def publishReplay[T](bufferSize: Unit, windowTime: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def publishReplay[T](bufferSize: Unit, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def publishReplay[T](bufferSize: Unit, windowTime: Unit, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def publishReplay[T, O /* <: ObservableInput[js.Any] */](bufferSize: Double, windowTime: Double, selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def publishReplay[T, O /* <: ObservableInput[js.Any] */](
    bufferSize: Double,
    windowTime: Double,
    selector: js.Function1[/* shared */ Observable[T], O],
    scheduler: SchedulerLike
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def publishReplay[T, O /* <: ObservableInput[js.Any] */](bufferSize: Double, windowTime: Double, selector: Unit, scheduler: SchedulerLike): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def publishReplay[T, O /* <: ObservableInput[js.Any] */](bufferSize: Double, windowTime: Unit, selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def publishReplay[T, O /* <: ObservableInput[js.Any] */](
    bufferSize: Double,
    windowTime: Unit,
    selector: js.Function1[/* shared */ Observable[T], O],
    scheduler: SchedulerLike
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def publishReplay[T, O /* <: ObservableInput[js.Any] */](bufferSize: Double, windowTime: Unit, selector: Unit, scheduler: SchedulerLike): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def publishReplay[T, O /* <: ObservableInput[js.Any] */](bufferSize: Unit, windowTime: Double, selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def publishReplay[T, O /* <: ObservableInput[js.Any] */](
    bufferSize: Unit,
    windowTime: Double,
    selector: js.Function1[/* shared */ Observable[T], O],
    scheduler: SchedulerLike
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def publishReplay[T, O /* <: ObservableInput[js.Any] */](bufferSize: Unit, windowTime: Double, selector: Unit, scheduler: SchedulerLike): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def publishReplay[T, O /* <: ObservableInput[js.Any] */](bufferSize: Unit, windowTime: Unit, selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def publishReplay[T, O /* <: ObservableInput[js.Any] */](
    bufferSize: Unit,
    windowTime: Unit,
    selector: js.Function1[/* shared */ Observable[T], O],
    scheduler: SchedulerLike
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def publishReplay[T, O /* <: ObservableInput[js.Any] */](bufferSize: Unit, windowTime: Unit, selector: Unit, scheduler: SchedulerLike): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  
  @scala.inline
  def publishReplay_TO_ObservableInputAny_OperatorFunction[T, O /* <: ObservableInput[js.Any] */](): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")().asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def publishReplay_TO_ObservableInputAny_OperatorFunction[T, O /* <: ObservableInput[js.Any] */](bufferSize: Double): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def publishReplay_TO_ObservableInputAny_OperatorFunction[T, O /* <: ObservableInput[js.Any] */](bufferSize: Double, windowTime: Double): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def publishReplay_TO_ObservableInputAny_OperatorFunction[T, O /* <: ObservableInput[js.Any] */](bufferSize: Unit, windowTime: Double): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  
  @scala.inline
  def publish_TO_ObservableInputAny_OperatorFunction[T, O /* <: ObservableInput[js.Any] */](selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("publish")(selector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  
  @scala.inline
  def race[T](observables: (Observable[T] | js.Array[Observable[T]])*): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def race[T](observables: js.Array[Observable[T]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def race_TR_OperatorFunction[T, R](observables: (Observable[js.Any] | js.Array[Observable[js.Any]])*): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def race_TR_OperatorFunction[T, R](observables: js.Array[Observable[T]]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(accumulator.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def reduce_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(accumulator.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def reduce_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def refCount[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("refCount")().asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def repeat[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def repeat[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def repeatWhen[T](notifier: js.Function1[/* notifications */ Observable[js.Any], Observable[js.Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeatWhen")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def retry[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def retry[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def retryWhen[T](notifier: js.Function1[/* errors */ Observable[js.Any], Observable[js.Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryWhen")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def sample[T](notifier: Observable[js.Any]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sample")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def sampleTime[T](period: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sampleTime")(period.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def sampleTime[T](period: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sampleTime")(period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def scan_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def scan_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def sequenceEqual[T](compareTo: Observable[T]): OperatorFunction[T, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceEqual")(compareTo.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Boolean]]
  @scala.inline
  def sequenceEqual[T](compareTo: Observable[T], comparator: js.Function2[/* a */ T, /* b */ T, Boolean]): OperatorFunction[T, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("sequenceEqual")(compareTo.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Boolean]]
  
  @scala.inline
  def share[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("share")().asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def shareReplay[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def shareReplay[T](bufferSize: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def shareReplay[T](bufferSize: Double, windowTime: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def shareReplay[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def shareReplay[T](bufferSize: Double, windowTime: Unit, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def shareReplay[T](bufferSize: Unit, windowTime: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def shareReplay[T](bufferSize: Unit, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def shareReplay[T](bufferSize: Unit, windowTime: Unit, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def shareReplay[T](config: ShareReplayConfig): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(config.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def single[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("single")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def single[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("single")(predicate.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def skip[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def skipLast[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipLast")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def skipUntil[T](notifier: Observable[js.Any]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipUntil")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def skipWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def startWith[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def startWith[T, D](array: (D | SchedulerLike)*): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(array.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def startWith[T, D](v1: D): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def startWith[T, D](v1: D, scheduler: SchedulerLike): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
  @scala.inline
  def startWith[T, D, E](v1: D, v2: E): OperatorFunction[T, T | D | E] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E]]
  @scala.inline
  def startWith[T, D, E](v1: D, v2: E, scheduler: SchedulerLike): OperatorFunction[T, T | D | E] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E]]
  @scala.inline
  def startWith[T, D, E, F](v1: D, v2: E, v3: F): OperatorFunction[T, T | D | E | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F]]
  @scala.inline
  def startWith[T, D, E, F](v1: D, v2: E, v3: F, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F]]
  @scala.inline
  def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G): OperatorFunction[T, T | D | E | F | G] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G]]
  @scala.inline
  def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G]]
  @scala.inline
  def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H): OperatorFunction[T, T | D | E | F | G | H] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G | H]]
  @scala.inline
  def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G | H] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G | H]]
  @scala.inline
  def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I): OperatorFunction[T, T | D | E | F | G | H | I] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G | H | I]]
  @scala.inline
  def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G | H | I] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D | E | F | G | H | I]]
  
  @scala.inline
  def subscribeOn[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribeOn")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def subscribeOn[T](scheduler: SchedulerLike, delay: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeOn")(scheduler.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def switchAll[T](): OperatorFunction[ObservableInput[T], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchAll")().asInstanceOf[OperatorFunction[ObservableInput[T], T]]
  
  @scala.inline
  def switchAll_R[R](): OperatorFunction[js.Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchAll")().asInstanceOf[OperatorFunction[js.Any, R]]
  
  @scala.inline
  def switchMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMap")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def switchMap[T, O /* <: ObservableInput[js.Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], resultSelector: Unit): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  @scala.inline
  def switchMap[T, R, O /* <: ObservableInput[js.Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def switchMapTo[R](observable: ObservableInput[R]): OperatorFunction[js.Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[js.Any, R]]
  @scala.inline
  def switchMapTo[T, R](observable: ObservableInput[R], resultSelector: Unit): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def switchMapTo[T, I, R](
    observable: ObservableInput[I],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ I, 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def take[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def takeLast[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeLast")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def takeUntil[T](notifier: Observable[js.Any]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeUntil")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], inclusive: Boolean): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def takeWhile_TS_T_OperatorFunction[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): OperatorFunction[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, S]]
  
  @scala.inline
  def takeWhile_false[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], inclusive: `false`): OperatorFunction[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, S]]
  
  @scala.inline
  def tap[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def tap[T](next: js.Function1[/* x */ T, Unit]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def tap[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ js.Any, Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def tap[T](
    next: js.Function1[/* x */ T, Unit],
    error: js.Function1[/* e */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def tap[T](next: js.Function1[/* value */ T, Unit], error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def tap[T](next: js.Function1[/* x */ /* value */ T, Unit], error: Unit, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def tap[T](next: Null, error: js.Function1[/* error */ js.Any, Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def tap[T](next: Null, error: js.Function1[/* error */ js.Any, Unit], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def tap[T](next: Null, error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def tap[T](next: Null, error: Unit, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def tap[T](next: Unit, error: js.Function1[/* e */ /* error */ js.Any, Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def tap[T](next: Unit, error: js.Function1[/* e */ /* error */ js.Any, Unit], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def tap[T](next: Unit, error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def tap[T](next: Unit, error: Unit, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def tap[T](observer: PartialObserver[T]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(observer.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def throttle[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[js.Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def throttle[T](
    durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[js.Any]],
    config: ThrottleConfig
  ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(durationSelector.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def throttleTime[T](duration: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttleTime")(duration.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def throttleTime[T](duration: Double, scheduler: Unit, config: ThrottleConfig): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleTime")(duration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def throttleTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleTime")(duration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def throttleTime[T](duration: Double, scheduler: SchedulerLike, config: ThrottleConfig): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleTime")(duration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def timeInterval[T](): OperatorFunction[T, TimeInterval_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")().asInstanceOf[OperatorFunction[T, TimeInterval_[T]]]
  @scala.inline
  def timeInterval[T](scheduler: SchedulerLike): OperatorFunction[T, TimeInterval_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")(scheduler.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, TimeInterval_[T]]]
  
  @scala.inline
  def timeout[T](due: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(due.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def timeout[T](due: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def timeout[T](due: Date): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(due.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def timeout[T](due: Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def timeoutWith[T, R](due: Double, withObservable: ObservableInput[R]): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
  @scala.inline
  def timeoutWith[T, R](due: Double, withObservable: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
  @scala.inline
  def timeoutWith[T, R](due: Date, withObservable: ObservableInput[R]): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
  @scala.inline
  def timeoutWith[T, R](due: Date, withObservable: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
  
  @scala.inline
  def timestamp[T](): OperatorFunction[T, Timestamp_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")().asInstanceOf[OperatorFunction[T, Timestamp_[T]]]
  @scala.inline
  def timestamp[T](scheduler: SchedulerLike): OperatorFunction[T, Timestamp_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")(scheduler.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Timestamp_[T]]]
  
  @scala.inline
  def toArray[T](): OperatorFunction[T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[OperatorFunction[T, js.Array[T]]]
  
  @scala.inline
  def window[T](windowBoundaries: Observable[js.Any]): OperatorFunction[T, Observable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("window")(windowBoundaries.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Observable[T]]]
  
  @scala.inline
  def windowCount[T](windowSize: Double): OperatorFunction[T, Observable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("windowCount")(windowSize.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Observable[T]]]
  @scala.inline
  def windowCount[T](windowSize: Double, startWindowEvery: Double): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowCount")(windowSize.asInstanceOf[js.Any], startWindowEvery.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  
  @scala.inline
  def windowTime[T](windowTimeSpan: Double): OperatorFunction[T, Observable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Observable[T]]]
  @scala.inline
  def windowTime[T](windowTimeSpan: Double, scheduler: SchedulerLike): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  @scala.inline
  def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  @scala.inline
  def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, maxWindowSize: Double): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  @scala.inline
  def windowTime[T](
    windowTimeSpan: Double,
    windowCreationInterval: Double,
    maxWindowSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  @scala.inline
  def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, scheduler: SchedulerLike): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  
  @scala.inline
  def windowToggle[T, O](openings: Observable[O], closingSelector: js.Function1[/* openValue */ O, Observable[js.Any]]): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowToggle")(openings.asInstanceOf[js.Any], closingSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  
  @scala.inline
  def windowWhen[T](closingSelector: js.Function0[Observable[js.Any]]): OperatorFunction[T, Observable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("windowWhen")(closingSelector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Observable[T]]]
  
  @scala.inline
  def withLatestFrom[T, R](array: js.Array[ObservableInput[js.Any]]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(array.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def withLatestFrom[T, R](array: js.Array[ObservableInput[js.Any]], project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(array.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def withLatestFrom[T, R](observables: (ObservableInput[js.Any] | (js.Function1[/* repeated */ js.Any, R]))*): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def withLatestFrom[T, R](project: js.Function1[/* v1 */ T, R]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */](source2: O2): OperatorFunction[T, js.Tuple2[T, ObservedValueOf[O2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(source2.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Tuple2[T, ObservedValueOf[O2]]]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, R](source2: O2, project: js.Function2[/* v1 */ T, /* v2 */ ObservedValueOf[O2], R]): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(source2.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */](v2: O2, v3: O3): OperatorFunction[T, js.Tuple3[T, ObservedValueOf[O2], ObservedValueOf[O3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple3[T, ObservedValueOf[O2], ObservedValueOf[O3]]]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, R](
    v2: O2,
    v3: O3,
    project: js.Function3[/* v1 */ T, /* v2 */ ObservedValueOf[O2], /* v3 */ ObservedValueOf[O3], R]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */](v2: O2, v3: O3, v4: O4): OperatorFunction[T, js.Tuple4[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple4[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, R](
    v2: O2,
    v3: O3,
    v4: O4,
    project: js.Function4[
      /* v1 */ T, 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */](v2: O2, v3: O3, v4: O4, v5: O5): OperatorFunction[
    T, 
    js.Tuple5[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4], ObservedValueOf[O5]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    js.Tuple5[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4], ObservedValueOf[O5]]
  ]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, R](
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    project: js.Function5[
      /* v1 */ T, 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */](v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): OperatorFunction[
    T, 
    js.Tuple6[
      T, 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    js.Tuple6[
      T, 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ]]
  @scala.inline
  def withLatestFrom[T, O2 /* <: ObservableInput[js.Any] */, O3 /* <: ObservableInput[js.Any] */, O4 /* <: ObservableInput[js.Any] */, O5 /* <: ObservableInput[js.Any] */, O6 /* <: ObservableInput[js.Any] */, R](
    v2: O2,
    v3: O3,
    v4: O4,
    v5: O5,
    v6: O6,
    project: js.Function6[
      /* v1 */ T, 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      /* v6 */ ObservedValueOf[O6], 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def zip[T, R](array: js.Array[ObservableInput[T]]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(array.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def zip[T, R](observables: (ObservableInput[T] | (js.Function1[/* repeated */ T, R]))*): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def zip[T, R](project: js.Function1[/* v1 */ T, R]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def zip[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, js.Tuple2[T, T2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.Tuple2[T, T2]]]
  @scala.inline
  def zip[T, TOther, R](
    array: js.Array[ObservableInput[TOther]],
    project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(array.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def zip[T, T2, R](v2: ObservableInput[T2], project: js.Function2[/* v1 */ T, /* v2 */ T2, R]): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def zip[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, js.Tuple3[T, T2, T3]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple3[T, T2, T3]]]
  @scala.inline
  def zip[T, T2, T3, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def zip[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, js.Tuple4[T, T2, T3, T4]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple4[T, T2, T3, T4]]]
  @scala.inline
  def zip[T, T2, T3, T4, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def zip[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, js.Tuple5[T, T2, T3, T4, T5]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple5[T, T2, T3, T4, T5]]]
  @scala.inline
  def zip[T, T2, T3, T4, T5, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def zip[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): OperatorFunction[T, js.Tuple6[T, T2, T3, T4, T5, T6]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, js.Tuple6[T, T2, T3, T4, T5, T6]]]
  @scala.inline
  def zip[T, T2, T3, T4, T5, T6, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  @scala.inline
  def zipAll[T](): OperatorFunction[js.Any, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")().asInstanceOf[OperatorFunction[js.Any, js.Array[T]]]
  @scala.inline
  def zipAll[R](project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[js.Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[js.Any, R]]
  
  @scala.inline
  def zipAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[ObservableInput[T], R]]
}
