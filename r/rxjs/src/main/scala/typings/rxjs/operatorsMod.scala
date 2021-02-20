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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsMod {
  
  @JSImport("rxjs/internal/operators", "audit")
  @js.native
  def audit[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]]): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "auditTime")
  @js.native
  def auditTime[T](duration: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "auditTime")
  @js.native
  def auditTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "buffer")
  @js.native
  def buffer[T](closingNotifier: Observable[_]): OperatorFunction[T, js.Array[T]] = js.native
  
  @JSImport("rxjs/internal/operators", "bufferCount")
  @js.native
  def bufferCount[T](bufferSize: Double): OperatorFunction[T, js.Array[T]] = js.native
  @JSImport("rxjs/internal/operators", "bufferCount")
  @js.native
  def bufferCount[T](bufferSize: Double, startBufferEvery: Double): OperatorFunction[T, js.Array[T]] = js.native
  
  @JSImport("rxjs/internal/operators", "bufferTime")
  @js.native
  def bufferTime[T](bufferTimeSpan: Double): OperatorFunction[T, js.Array[T]] = js.native
  @JSImport("rxjs/internal/operators", "bufferTime")
  @js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: js.UndefOr[scala.Nothing], maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = js.native
  @JSImport("rxjs/internal/operators", "bufferTime")
  @js.native
  def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: js.UndefOr[scala.Nothing],
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, js.Array[T]] = js.native
  @JSImport("rxjs/internal/operators", "bufferTime")
  @js.native
  def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): OperatorFunction[T, js.Array[T]] = js.native
  @JSImport("rxjs/internal/operators", "bufferTime")
  @js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double): OperatorFunction[T, js.Array[T]] = js.native
  @JSImport("rxjs/internal/operators", "bufferTime")
  @js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = js.native
  @JSImport("rxjs/internal/operators", "bufferTime")
  @js.native
  def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Double,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, js.Array[T]] = js.native
  @JSImport("rxjs/internal/operators", "bufferTime")
  @js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = js.native
  @JSImport("rxjs/internal/operators", "bufferTime")
  @js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = js.native
  @JSImport("rxjs/internal/operators", "bufferTime")
  @js.native
  def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Null,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, js.Array[T]] = js.native
  @JSImport("rxjs/internal/operators", "bufferTime")
  @js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = js.native
  @JSImport("rxjs/internal/operators", "bufferTime")
  @js.native
  def bufferTime[T](bufferTimeSpan: Double, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = js.native
  
  @JSImport("rxjs/internal/operators", "bufferToggle")
  @js.native
  def bufferToggle[T, O](
    openings: SubscribableOrPromise[O],
    closingSelector: js.Function1[/* value */ O, SubscribableOrPromise[_]]
  ): OperatorFunction[T, js.Array[T]] = js.native
  
  @JSImport("rxjs/internal/operators", "bufferWhen")
  @js.native
  def bufferWhen[T](closingSelector: js.Function0[Observable[_]]): OperatorFunction[T, js.Array[T]] = js.native
  
  @JSImport("rxjs/internal/operators", "catchError")
  @js.native
  def catchError[T, O /* <: ObservableInput[_] */](selector: js.Function2[/* err */ js.Any, /* caught */ Observable[T], O]): OperatorFunction[T, T | ObservedValueOf[O]] = js.native
  
  @JSImport("rxjs/internal/operators", "combineAll")
  @js.native
  def combineAll[T](): OperatorFunction[_, js.Array[T]] = js.native
  @JSImport("rxjs/internal/operators", "combineAll")
  @js.native
  def combineAll[R](project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[_, R] = js.native
  @JSImport("rxjs/internal/operators", "combineAll")
  @js.native
  def combineAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = js.native
  
  @JSImport("rxjs/internal/operators", "combineLatest")
  @js.native
  def combineLatest[T, R](array: js.Array[ObservableInput[T]]): OperatorFunction[T, js.Array[T]] = js.native
  @JSImport("rxjs/internal/operators", "combineLatest")
  @js.native
  def combineLatest[T, R](observables: (ObservableInput[T] | (js.Function1[/* repeated */ T, R]))*): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "combineLatest")
  @js.native
  def combineLatest[T, R](project: js.Function1[/* v1 */ T, R]): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "combineLatest")
  @js.native
  def combineLatest[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, js.Tuple2[T, T2]] = js.native
  @JSImport("rxjs/internal/operators", "combineLatest")
  @js.native
  def combineLatest[T, TOther, R](
    array: js.Array[ObservableInput[TOther]],
    project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "combineLatest")
  @js.native
  def combineLatest[T, T2, R](v2: ObservableInput[T2], project: js.Function2[/* v1 */ T, /* v2 */ T2, R]): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "combineLatest")
  @js.native
  def combineLatest[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, js.Tuple3[T, T2, T3]] = js.native
  @JSImport("rxjs/internal/operators", "combineLatest")
  @js.native
  def combineLatest[T, T2, T3, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "combineLatest")
  @js.native
  def combineLatest[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, js.Tuple4[T, T2, T3, T4]] = js.native
  @JSImport("rxjs/internal/operators", "combineLatest")
  @js.native
  def combineLatest[T, T2, T3, T4, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "combineLatest")
  @js.native
  def combineLatest[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, js.Tuple5[T, T2, T3, T4, T5]] = js.native
  @JSImport("rxjs/internal/operators", "combineLatest")
  @js.native
  def combineLatest[T, T2, T3, T4, T5, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "combineLatest")
  @js.native
  def combineLatest[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): OperatorFunction[T, js.Tuple6[T, T2, T3, T4, T5, T6]] = js.native
  @JSImport("rxjs/internal/operators", "combineLatest")
  @js.native
  def combineLatest[T, T2, T3, T4, T5, T6, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
  ): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "concat")
  @js.native
  def concat[T](): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "concat")
  @js.native
  def concat[T](observables: (ObservableInput[T] | SchedulerLike)*): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "concat")
  @js.native
  def concat[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "concat")
  @js.native
  def concat[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, T | T2] = js.native
  @JSImport("rxjs/internal/operators", "concat")
  @js.native
  def concat[T, T2](v2: ObservableInput[T2], scheduler: SchedulerLike): OperatorFunction[T, T | T2] = js.native
  @JSImport("rxjs/internal/operators", "concat")
  @js.native
  def concat[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, T | T2 | T3] = js.native
  @JSImport("rxjs/internal/operators", "concat")
  @js.native
  def concat[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = js.native
  @JSImport("rxjs/internal/operators", "concat")
  @js.native
  def concat[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, T | T2 | T3 | T4] = js.native
  @JSImport("rxjs/internal/operators", "concat")
  @js.native
  def concat[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4] = js.native
  @JSImport("rxjs/internal/operators", "concat")
  @js.native
  def concat[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
  @JSImport("rxjs/internal/operators", "concat")
  @js.native
  def concat[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
  @JSImport("rxjs/internal/operators", "concat")
  @js.native
  def concat[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSImport("rxjs/internal/operators", "concat")
  @js.native
  def concat[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
  
  @JSImport("rxjs/internal/operators", "concatAll")
  @js.native
  def concatAll[T](): OperatorFunction[ObservableInput[T], T] = js.native
  @JSImport("rxjs/internal/operators", "concatAll")
  @js.native
  def concatAll_R[R](): OperatorFunction[_, R] = js.native
  
  @JSImport("rxjs/internal/operators", "concatMap")
  @js.native
  def concatMap[T, O /* <: ObservableInput[_] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "concatMap")
  @js.native
  def concatMap[T, O /* <: ObservableInput[_] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.UndefOr[scala.Nothing]
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "concatMap")
  @js.native
  def concatMap[T, R, O /* <: ObservableInput[_] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "concatMapTo")
  @js.native
  def concatMapTo[T, O /* <: ObservableInput[_] */](observable: O): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "concatMapTo")
  @js.native
  def concatMapTo[T, O /* <: ObservableInput[_] */](observable: O, resultSelector: js.UndefOr[scala.Nothing]): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "concatMapTo")
  @js.native
  def concatMapTo[T, R, O /* <: ObservableInput[_] */](
    observable: O,
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "concat")
  @js.native
  def concat_TR_OperatorFunction[T, R](observables: (ObservableInput[_] | SchedulerLike)*): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "count")
  @js.native
  def count[T](): OperatorFunction[T, Double] = js.native
  @JSImport("rxjs/internal/operators", "count")
  @js.native
  def count[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, Double] = js.native
  
  @JSImport("rxjs/internal/operators", "debounce")
  @js.native
  def debounce[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]]): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "debounceTime")
  @js.native
  def debounceTime[T](dueTime: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "debounceTime")
  @js.native
  def debounceTime[T](dueTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "defaultIfEmpty")
  @js.native
  def defaultIfEmpty[T](): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "defaultIfEmpty")
  @js.native
  def defaultIfEmpty[T](defaultValue: T): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "defaultIfEmpty")
  @js.native
  def defaultIfEmpty_TR_OperatorFunction[T, R](): OperatorFunction[T, T | R] = js.native
  @JSImport("rxjs/internal/operators", "defaultIfEmpty")
  @js.native
  def defaultIfEmpty_TR_OperatorFunction[T, R](defaultValue: R): OperatorFunction[T, T | R] = js.native
  
  @JSImport("rxjs/internal/operators", "delay")
  @js.native
  def delay[T](delay: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "delay")
  @js.native
  def delay[T](delay: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "delay")
  @js.native
  def delay[T](delay: Date): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "delay")
  @js.native
  def delay[T](delay: Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "delayWhen")
  @js.native
  def delayWhen[T](
    delayDurationSelector: js.Function2[/* value */ T, /* index */ Double, Observable[_ | scala.Nothing]]
  ): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "delayWhen")
  @js.native
  def delayWhen[T](
    delayDurationSelector: js.Function2[/* value */ T, /* index */ Double, Observable[_ | scala.Nothing]],
    subscriptionDelay: Observable[_]
  ): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "dematerialize")
  @js.native
  def dematerialize[T](): OperatorFunction[Notification[T], T] = js.native
  
  @JSImport("rxjs/internal/operators", "distinct")
  @js.native
  def distinct[T, K](): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "distinct")
  @js.native
  def distinct[T, K](keySelector: js.UndefOr[scala.Nothing], flushes: Observable[_]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "distinct")
  @js.native
  def distinct[T, K](keySelector: js.Function1[/* value */ T, K]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "distinct")
  @js.native
  def distinct[T, K](keySelector: js.Function1[/* value */ T, K], flushes: Observable[_]): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "distinctUntilChanged")
  @js.native
  def distinctUntilChanged[T](): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "distinctUntilChanged")
  @js.native
  def distinctUntilChanged[T](compare: js.Function2[/* x */ T, /* y */ T, Boolean]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "distinctUntilChanged")
  @js.native
  def distinctUntilChanged[T, K](compare: js.Function2[/* x */ K, /* y */ K, Boolean], keySelector: js.Function1[/* x */ T, K]): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "distinctUntilKeyChanged")
  @js.native
  def distinctUntilKeyChanged[T](key: /* keyof T */ String): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "distinctUntilKeyChanged")
  @js.native
  def distinctUntilKeyChanged[T, K /* <: /* keyof T */ String */](
    key: K,
    compare: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* x */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* y */ js.Any, 
      Boolean
    ]
  ): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "elementAt")
  @js.native
  def elementAt[T](index: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "elementAt")
  @js.native
  def elementAt[T](index: Double, defaultValue: T): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "every")
  @js.native
  def every[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, Boolean] = js.native
  @JSImport("rxjs/internal/operators", "every")
  @js.native
  def every[T](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: js.Any
  ): OperatorFunction[T, Boolean] = js.native
  
  @JSImport("rxjs/internal/operators", "exhaust")
  @js.native
  def exhaust[T](): OperatorFunction[ObservableInput[T], T] = js.native
  
  @JSImport("rxjs/internal/operators", "exhaustMap")
  @js.native
  def exhaustMap[T, O /* <: ObservableInput[_] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "exhaustMap")
  @js.native
  def exhaustMap[T, O /* <: ObservableInput[_] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.UndefOr[scala.Nothing]
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "exhaustMap")
  @js.native
  def exhaustMap[T, I, R](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[I]],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ I, 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "exhaust")
  @js.native
  def exhaust_R[R](): OperatorFunction[_, R] = js.native
  
  @JSImport("rxjs/internal/operators", "expand")
  @js.native
  def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "expand")
  @js.native
  def expand[T](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
    concurrent: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "expand")
  @js.native
  def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]], concurrent: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "expand")
  @js.native
  def expand[T](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
    concurrent: Double,
    scheduler: SchedulerLike
  ): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "expand")
  @js.native
  def expand_TR_OperatorFunction[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "expand")
  @js.native
  def expand_TR_OperatorFunction[T, R](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "expand")
  @js.native
  def expand_TR_OperatorFunction[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]], concurrent: Double): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "expand")
  @js.native
  def expand_TR_OperatorFunction[T, R](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "filter")
  @js.native
  def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "filter")
  @js.native
  def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "filter")
  @js.native
  def filter_TS_T_OperatorFunction[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): OperatorFunction[T, S] = js.native
  @JSImport("rxjs/internal/operators", "filter")
  @js.native
  def filter_TS_T_OperatorFunction[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], thisArg: js.Any): OperatorFunction[T, S] = js.native
  
  @JSImport("rxjs/internal/operators", "finalize")
  @js.native
  def finalize_[T](callback: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "find")
  @js.native
  def find[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, js.UndefOr[T]] = js.native
  @JSImport("rxjs/internal/operators", "find")
  @js.native
  def find[T](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: js.Any
  ): OperatorFunction[T, js.UndefOr[T]] = js.native
  
  @JSImport("rxjs/internal/operators", "findIndex")
  @js.native
  def findIndex[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, Double] = js.native
  @JSImport("rxjs/internal/operators", "findIndex")
  @js.native
  def findIndex[T](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: js.Any
  ): OperatorFunction[T, Double] = js.native
  
  @JSImport("rxjs/internal/operators", "find")
  @js.native
  def find_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean]
  ): OperatorFunction[T, js.UndefOr[S]] = js.native
  @JSImport("rxjs/internal/operators", "find")
  @js.native
  def find_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean],
    thisArg: js.Any
  ): OperatorFunction[T, js.UndefOr[S]] = js.native
  
  @JSImport("rxjs/internal/operators", "first")
  @js.native
  def first[T, D](): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators", "first")
  @js.native
  def first[T, D](predicate: js.UndefOr[scala.Nothing], defaultValue: D): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators", "first")
  @js.native
  def first[T, D](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators", "first")
  @js.native
  def first[T, D](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    defaultValue: D
  ): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators", "first")
  @js.native
  def first[T, D](predicate: Null, defaultValue: D): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators", "first")
  @js.native
  def first_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean]
  ): OperatorFunction[T, S] = js.native
  @JSImport("rxjs/internal/operators", "first")
  @js.native
  def first_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean],
    defaultValue: S
  ): OperatorFunction[T, S] = js.native
  
  @JSImport("rxjs/internal/operators", "flatMap")
  @js.native
  def flatMap[T, O /* <: ObservableInput[_] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "flatMap")
  @js.native
  def flatMap[T, O /* <: ObservableInput[_] */](project: js.Function2[/* value */ T, /* index */ Double, O], concurrent: Double): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "flatMap")
  @js.native
  def flatMap[T, O /* <: ObservableInput[_] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.UndefOr[scala.Nothing],
    concurrent: Double
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "flatMap")
  @js.native
  def flatMap[T, R, O /* <: ObservableInput[_] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "flatMap")
  @js.native
  def flatMap[T, R, O /* <: ObservableInput[_] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "groupBy")
  @js.native
  def groupBy[T, K](keySelector: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, T]] = js.native
  @JSImport("rxjs/internal/operators", "groupBy")
  @js.native
  def groupBy[T, K](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: Unit,
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, T], Observable[_]]
  ): OperatorFunction[T, GroupedObservable[K, T]] = js.native
  @JSImport("rxjs/internal/operators", "groupBy")
  @js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.UndefOr[scala.Nothing],
    durationSelector: js.UndefOr[scala.Nothing],
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  @JSImport("rxjs/internal/operators", "groupBy")
  @js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.UndefOr[scala.Nothing],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[_]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  @JSImport("rxjs/internal/operators", "groupBy")
  @js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.UndefOr[scala.Nothing],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[_]],
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  @JSImport("rxjs/internal/operators", "groupBy")
  @js.native
  def groupBy[T, K, R](keySelector: js.Function1[/* value */ T, K], elementSelector: js.Function1[/* value */ T, R]): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  @JSImport("rxjs/internal/operators", "groupBy")
  @js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.UndefOr[scala.Nothing],
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  @JSImport("rxjs/internal/operators", "groupBy")
  @js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[_]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  @JSImport("rxjs/internal/operators", "groupBy")
  @js.native
  def groupBy[T, K, R](
    keySelector: js.Function1[/* value */ T, K],
    elementSelector: js.Function1[/* value */ T, R],
    durationSelector: js.Function1[/* grouped */ GroupedObservable[K, R], Observable[_]],
    subjectSelector: js.Function0[Subject[R]]
  ): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  @JSImport("rxjs/internal/operators", "groupBy")
  @js.native
  def groupBy_TKR[T, K, R](keySelector: js.Function1[/* value */ T, K]): OperatorFunction[T, GroupedObservable[K, R]] = js.native
  
  @JSImport("rxjs/internal/operators", "ignoreElements")
  @js.native
  def ignoreElements(): OperatorFunction[_, scala.Nothing] = js.native
  
  @JSImport("rxjs/internal/operators", "isEmpty")
  @js.native
  def isEmpty[T](): OperatorFunction[T, Boolean] = js.native
  
  @JSImport("rxjs/internal/operators", "last")
  @js.native
  def last[T, D](): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators", "last")
  @js.native
  def last[T, D](predicate: js.UndefOr[scala.Nothing], defaultValue: D): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators", "last")
  @js.native
  def last[T, D](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators", "last")
  @js.native
  def last[T, D](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    defaultValue: D
  ): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators", "last")
  @js.native
  def last[T, D](predicate: Null, defaultValue: D): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators", "last")
  @js.native
  def last_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean]
  ): OperatorFunction[T, S] = js.native
  @JSImport("rxjs/internal/operators", "last")
  @js.native
  def last_TS_T[T, S /* <: T */](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], /* is S */ Boolean],
    defaultValue: S
  ): OperatorFunction[T, S] = js.native
  
  @JSImport("rxjs/internal/operators", "map")
  @js.native
  def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R]): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "map")
  @js.native
  def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R], thisArg: js.Any): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "mapTo")
  @js.native
  def mapTo[T, R](value: R): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "materialize")
  @js.native
  def materialize[T](): OperatorFunction[T, Notification[T]] = js.native
  
  @JSImport("rxjs/internal/operators", "max")
  @js.native
  def max[T](): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "max")
  @js.native
  def max[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T](): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T](concurrent: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T](concurrent: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T](concurrent: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T](observables: (ObservableInput[T] | SchedulerLike | Double)*): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, T | T2] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2](v2: ObservableInput[T2], concurrent: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): OperatorFunction[T, T | T2] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2](v2: ObservableInput[T2], concurrent: Double): OperatorFunction[T, T | T2] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2](v2: ObservableInput[T2], concurrent: Double, scheduler: SchedulerLike): OperatorFunction[T, T | T2] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, T | T2 | T3] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2, T3](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    concurrent: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double): OperatorFunction[T, T | T2 | T3] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double, scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, T | T2 | T3 | T4] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], concurrent: Double): OperatorFunction[T, T | T2 | T3 | T4] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
  
  @JSImport("rxjs/internal/operators", "mergeAll")
  @js.native
  def mergeAll[T](): OperatorFunction[ObservableInput[T], T] = js.native
  @JSImport("rxjs/internal/operators", "mergeAll")
  @js.native
  def mergeAll[T](concurrent: Double): OperatorFunction[ObservableInput[T], T] = js.native
  
  @JSImport("rxjs/internal/operators", "mergeMap")
  @js.native
  def mergeMap[T, O /* <: ObservableInput[_] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "mergeMap")
  @js.native
  def mergeMap[T, O /* <: ObservableInput[_] */](project: js.Function2[/* value */ T, /* index */ Double, O], concurrent: Double): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "mergeMap")
  @js.native
  def mergeMap[T, O /* <: ObservableInput[_] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.UndefOr[scala.Nothing],
    concurrent: Double
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "mergeMap")
  @js.native
  def mergeMap[T, R, O /* <: ObservableInput[_] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "mergeMap")
  @js.native
  def mergeMap[T, R, O /* <: ObservableInput[_] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "mergeMapTo")
  @js.native
  def mergeMapTo[T, O /* <: ObservableInput[_] */](innerObservable: O): OperatorFunction[_, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "mergeMapTo")
  @js.native
  def mergeMapTo[T, O /* <: ObservableInput[_] */](innerObservable: O, concurrent: Double): OperatorFunction[_, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "mergeMapTo")
  @js.native
  def mergeMapTo[T, R, O /* <: ObservableInput[_] */](
    innerObservable: O,
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "mergeMapTo")
  @js.native
  def mergeMapTo[T, R, O /* <: ObservableInput[_] */](
    innerObservable: O,
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "mergeScan")
  @js.native
  def mergeScan[T, R](
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
    seed: R
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "mergeScan")
  @js.native
  def mergeScan[T, R](
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
    seed: R,
    concurrent: Double
  ): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge_TR_OperatorFunction[T, R](observables: (ObservableInput[_] | SchedulerLike | Double)*): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge_TT2T3[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): OperatorFunction[T, T | T2 | T3] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge_TT2T3T4[T, T2, T3, T4](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge_TT2T3T4T5[T, T2, T3, T4, T5](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge_TT2T3T4T5T6[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    scheduler: SchedulerLike
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSImport("rxjs/internal/operators", "merge")
  @js.native
  def merge_TT2_OperatorFunction[T, T2](v2: ObservableInput[T2], scheduler: SchedulerLike): OperatorFunction[T, T | T2] = js.native
  
  @JSImport("rxjs/internal/operators", "min")
  @js.native
  def min[T](): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "min")
  @js.native
  def min[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "multicast")
  @js.native
  def multicast[T](subjectFactory: js.ThisFunction0[/* this */ Observable[T], Subject[T]]): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
  @JSImport("rxjs/internal/operators", "multicast")
  @js.native
  def multicast[T](subject: Subject[T]): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
  @JSImport("rxjs/internal/operators", "multicast")
  @js.native
  def multicast[T, O /* <: ObservableInput[_] */](
    SubjectFactory: js.ThisFunction0[/* this */ Observable[T], Subject[T]],
    selector: js.Function1[/* shared */ Observable[T], O]
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "multicast")
  @js.native
  def multicast[T, O /* <: ObservableInput[_] */](subject: Subject[T], selector: js.Function1[/* shared */ Observable[T], O]): UnaryFunction[Observable[T], ConnectableObservable[ObservedValueOf[O]]] = js.native
  
  @JSImport("rxjs/internal/operators", "observeOn")
  @js.native
  def observeOn[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "observeOn")
  @js.native
  def observeOn[T](scheduler: SchedulerLike, delay: Double): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T](): OperatorFunction[T, T] = js.native
  @JSImport("rxjs/internal/operators", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T, R](array: js.Array[ObservableInput[_]]): OperatorFunction[T, T | R] = js.native
  @JSImport("rxjs/internal/operators", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T, R](observables: ObservableInput[_]*): OperatorFunction[T, T | R] = js.native
  @JSImport("rxjs/internal/operators", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T, T2](v: ObservableInput[T2]): OperatorFunction[T, T | T2] = js.native
  @JSImport("rxjs/internal/operators", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T, T2, T3](v: ObservableInput[T2], v2: ObservableInput[T3]): OperatorFunction[T, T | T2 | T3] = js.native
  @JSImport("rxjs/internal/operators", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T, T2, T3, T4](v: ObservableInput[T2], v2: ObservableInput[T3], v3: ObservableInput[T4]): OperatorFunction[T, T | T2 | T3 | T4] = js.native
  @JSImport("rxjs/internal/operators", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T, T2, T3, T4, T5](v: ObservableInput[T2], v2: ObservableInput[T3], v3: ObservableInput[T4], v4: ObservableInput[T5]): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
  @JSImport("rxjs/internal/operators", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T, T2, T3, T4, T5, T6](
    v: ObservableInput[T2],
    v2: ObservableInput[T3],
    v3: ObservableInput[T4],
    v4: ObservableInput[T5],
    v5: ObservableInput[T6]
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSImport("rxjs/internal/operators", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T, T2, T3, T4, T5, T6, T7](
    v: ObservableInput[T2],
    v2: ObservableInput[T3],
    v3: ObservableInput[T4],
    v4: ObservableInput[T5],
    v5: ObservableInput[T6],
    v6: ObservableInput[T7]
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  
  @JSImport("rxjs/internal/operators", "pairwise")
  @js.native
  def pairwise[T](): OperatorFunction[T, js.Tuple2[T, T]] = js.native
  
  @JSImport("rxjs/internal/operators", "partition")
  @js.native
  def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): UnaryFunction[Observable[T], js.Tuple2[Observable[T], Observable[T]]] = js.native
  @JSImport("rxjs/internal/operators", "partition")
  @js.native
  def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): UnaryFunction[Observable[T], js.Tuple2[Observable[T], Observable[T]]] = js.native
  
  @JSImport("rxjs/internal/operators", "pluck")
  @js.native
  def pluck[T, K1 /* <: /* keyof T */ String */](k1: K1): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1] */ js.Any
  ] = js.native
  @JSImport("rxjs/internal/operators", "pluck")
  @js.native
  def pluck[T, R](properties: String*): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "pluck")
  @js.native
  def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */](k1: K1, k2: K2): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2] */ js.Any
  ] = js.native
  @JSImport("rxjs/internal/operators", "pluck")
  @js.native
  def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */](k1: K1, k2: K2, k3: K3): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3] */ js.Any
  ] = js.native
  @JSImport("rxjs/internal/operators", "pluck")
  @js.native
  def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */](k1: K1, k2: K2, k3: K3, k4: K4): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4] */ js.Any
  ] = js.native
  @JSImport("rxjs/internal/operators", "pluck")
  @js.native
  def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */, K5 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3][K4] */ js.Any */](k1: K1, k2: K2, k3: K3, k4: K4, k5: K5): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4][K5] */ js.Any
  ] = js.native
  @JSImport("rxjs/internal/operators", "pluck")
  @js.native
  def pluck[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */, K5 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3][K4] */ js.Any */, K6 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3][K4][K5] */ js.Any */](k1: K1, k2: K2, k3: K3, k4: K4, k5: K5, k6: K6): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T[K1][K2][K3][K4][K5][K6] */ js.Any
  ] = js.native
  
  @JSImport("rxjs/internal/operators", "publish")
  @js.native
  def publish[T](): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
  @JSImport("rxjs/internal/operators", "publish")
  @js.native
  def publish[T](selector: MonoTypeOperatorFunction[T]): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "publishBehavior")
  @js.native
  def publishBehavior[T](value: T): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
  
  @JSImport("rxjs/internal/operators", "publishLast")
  @js.native
  def publishLast[T](): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
  
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T](): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T](
    bufferSize: js.UndefOr[scala.Nothing],
    windowTime: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T](bufferSize: js.UndefOr[scala.Nothing], windowTime: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T](bufferSize: js.UndefOr[scala.Nothing], windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T](bufferSize: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T](bufferSize: Double, windowTime: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T](bufferSize: Double, windowTime: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T, O /* <: ObservableInput[_] */](
    bufferSize: js.UndefOr[scala.Nothing],
    windowTime: js.UndefOr[scala.Nothing],
    selector: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T, O /* <: ObservableInput[_] */](
    bufferSize: js.UndefOr[scala.Nothing],
    windowTime: js.UndefOr[scala.Nothing],
    selector: js.Function1[/* shared */ Observable[T], O]
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T, O /* <: ObservableInput[_] */](
    bufferSize: js.UndefOr[scala.Nothing],
    windowTime: js.UndefOr[scala.Nothing],
    selector: js.Function1[/* shared */ Observable[T], O],
    scheduler: SchedulerLike
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T, O /* <: ObservableInput[_] */](
    bufferSize: js.UndefOr[scala.Nothing],
    windowTime: Double,
    selector: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T, O /* <: ObservableInput[_] */](
    bufferSize: js.UndefOr[scala.Nothing],
    windowTime: Double,
    selector: js.Function1[/* shared */ Observable[T], O]
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T, O /* <: ObservableInput[_] */](
    bufferSize: js.UndefOr[scala.Nothing],
    windowTime: Double,
    selector: js.Function1[/* shared */ Observable[T], O],
    scheduler: SchedulerLike
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T, O /* <: ObservableInput[_] */](
    bufferSize: Double,
    windowTime: js.UndefOr[scala.Nothing],
    selector: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T, O /* <: ObservableInput[_] */](
    bufferSize: Double,
    windowTime: js.UndefOr[scala.Nothing],
    selector: js.Function1[/* shared */ Observable[T], O]
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T, O /* <: ObservableInput[_] */](
    bufferSize: Double,
    windowTime: js.UndefOr[scala.Nothing],
    selector: js.Function1[/* shared */ Observable[T], O],
    scheduler: SchedulerLike
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T, O /* <: ObservableInput[_] */](
    bufferSize: Double,
    windowTime: Double,
    selector: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T, O /* <: ObservableInput[_] */](bufferSize: Double, windowTime: Double, selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay[T, O /* <: ObservableInput[_] */](
    bufferSize: Double,
    windowTime: Double,
    selector: js.Function1[/* shared */ Observable[T], O],
    scheduler: SchedulerLike
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay_TO_ObservableInputWildcard_OperatorFunction[T, O /* <: ObservableInput[_] */](): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay_TO_ObservableInputWildcard_OperatorFunction[T, O /* <: ObservableInput[_] */](bufferSize: js.UndefOr[scala.Nothing], windowTime: Double): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay_TO_ObservableInputWildcard_OperatorFunction[T, O /* <: ObservableInput[_] */](bufferSize: Double): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "publishReplay")
  @js.native
  def publishReplay_TO_ObservableInputWildcard_OperatorFunction[T, O /* <: ObservableInput[_] */](bufferSize: Double, windowTime: Double): OperatorFunction[T, ObservedValueOf[O]] = js.native
  
  @JSImport("rxjs/internal/operators", "publish")
  @js.native
  def publish_TO_ObservableInputWildcard_OperatorFunction[T, O /* <: ObservableInput[_] */](selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
  
  @JSImport("rxjs/internal/operators", "race")
  @js.native
  def race[T](observables: (Observable[T] | js.Array[Observable[T]])*): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "race")
  @js.native
  def race[T](observables: js.Array[Observable[T]]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "race")
  @js.native
  def race_TR_OperatorFunction[T, R](observables: (Observable[_] | js.Array[Observable[_]])*): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "race")
  @js.native
  def race_TR_OperatorFunction[T, R](observables: js.Array[Observable[T]]): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "reduce")
  @js.native
  def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "reduce")
  @js.native
  def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "reduce")
  @js.native
  def reduce_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "reduce")
  @js.native
  def reduce_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "refCount")
  @js.native
  def refCount[T](): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "repeat")
  @js.native
  def repeat[T](): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "repeat")
  @js.native
  def repeat[T](count: Double): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "repeatWhen")
  @js.native
  def repeatWhen[T](notifier: js.Function1[/* notifications */ Observable[_], Observable[_]]): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "retry")
  @js.native
  def retry[T](): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "retry")
  @js.native
  def retry[T](count: Double): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "retryWhen")
  @js.native
  def retryWhen[T](notifier: js.Function1[/* errors */ Observable[_], Observable[_]]): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "sample")
  @js.native
  def sample[T](notifier: Observable[_]): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "sampleTime")
  @js.native
  def sampleTime[T](period: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "sampleTime")
  @js.native
  def sampleTime[T](period: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "scan")
  @js.native
  def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "scan")
  @js.native
  def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "scan")
  @js.native
  def scan_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "scan")
  @js.native
  def scan_TR_OperatorFunction[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "sequenceEqual")
  @js.native
  def sequenceEqual[T](compareTo: Observable[T]): OperatorFunction[T, Boolean] = js.native
  @JSImport("rxjs/internal/operators", "sequenceEqual")
  @js.native
  def sequenceEqual[T](compareTo: Observable[T], comparator: js.Function2[/* a */ T, /* b */ T, Boolean]): OperatorFunction[T, Boolean] = js.native
  
  @JSImport("rxjs/internal/operators", "share")
  @js.native
  def share[T](): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "shareReplay")
  @js.native
  def shareReplay[T](): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "shareReplay")
  @js.native
  def shareReplay[T](
    bufferSize: js.UndefOr[scala.Nothing],
    windowTime: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "shareReplay")
  @js.native
  def shareReplay[T](bufferSize: js.UndefOr[scala.Nothing], windowTime: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "shareReplay")
  @js.native
  def shareReplay[T](bufferSize: js.UndefOr[scala.Nothing], windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "shareReplay")
  @js.native
  def shareReplay[T](bufferSize: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "shareReplay")
  @js.native
  def shareReplay[T](bufferSize: Double, windowTime: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "shareReplay")
  @js.native
  def shareReplay[T](bufferSize: Double, windowTime: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "shareReplay")
  @js.native
  def shareReplay[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "shareReplay")
  @js.native
  def shareReplay[T](config: ShareReplayConfig): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "single")
  @js.native
  def single[T](): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "single")
  @js.native
  def single[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "skip")
  @js.native
  def skip[T](count: Double): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "skipLast")
  @js.native
  def skipLast[T](count: Double): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "skipUntil")
  @js.native
  def skipUntil[T](notifier: Observable[_]): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "skipWhile")
  @js.native
  def skipWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "startWith")
  @js.native
  def startWith[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "startWith")
  @js.native
  def startWith[T, D](array: (D | SchedulerLike)*): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators", "startWith")
  @js.native
  def startWith[T, D](v1: D): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators", "startWith")
  @js.native
  def startWith[T, D](v1: D, scheduler: SchedulerLike): OperatorFunction[T, T | D] = js.native
  @JSImport("rxjs/internal/operators", "startWith")
  @js.native
  def startWith[T, D, E](v1: D, v2: E): OperatorFunction[T, T | D | E] = js.native
  @JSImport("rxjs/internal/operators", "startWith")
  @js.native
  def startWith[T, D, E](v1: D, v2: E, scheduler: SchedulerLike): OperatorFunction[T, T | D | E] = js.native
  @JSImport("rxjs/internal/operators", "startWith")
  @js.native
  def startWith[T, D, E, F](v1: D, v2: E, v3: F): OperatorFunction[T, T | D | E | F] = js.native
  @JSImport("rxjs/internal/operators", "startWith")
  @js.native
  def startWith[T, D, E, F](v1: D, v2: E, v3: F, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F] = js.native
  @JSImport("rxjs/internal/operators", "startWith")
  @js.native
  def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G): OperatorFunction[T, T | D | E | F | G] = js.native
  @JSImport("rxjs/internal/operators", "startWith")
  @js.native
  def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G] = js.native
  @JSImport("rxjs/internal/operators", "startWith")
  @js.native
  def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H): OperatorFunction[T, T | D | E | F | G | H] = js.native
  @JSImport("rxjs/internal/operators", "startWith")
  @js.native
  def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G | H] = js.native
  @JSImport("rxjs/internal/operators", "startWith")
  @js.native
  def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I): OperatorFunction[T, T | D | E | F | G | H | I] = js.native
  @JSImport("rxjs/internal/operators", "startWith")
  @js.native
  def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I, scheduler: SchedulerLike): OperatorFunction[T, T | D | E | F | G | H | I] = js.native
  
  @JSImport("rxjs/internal/operators", "subscribeOn")
  @js.native
  def subscribeOn[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "subscribeOn")
  @js.native
  def subscribeOn[T](scheduler: SchedulerLike, delay: Double): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "switchAll")
  @js.native
  def switchAll[T](): OperatorFunction[ObservableInput[T], T] = js.native
  @JSImport("rxjs/internal/operators", "switchAll")
  @js.native
  def switchAll_R[R](): OperatorFunction[_, R] = js.native
  
  @JSImport("rxjs/internal/operators", "switchMap")
  @js.native
  def switchMap[T, O /* <: ObservableInput[_] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "switchMap")
  @js.native
  def switchMap[T, O /* <: ObservableInput[_] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.UndefOr[scala.Nothing]
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSImport("rxjs/internal/operators", "switchMap")
  @js.native
  def switchMap[T, R, O /* <: ObservableInput[_] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "switchMapTo")
  @js.native
  def switchMapTo[R](observable: ObservableInput[R]): OperatorFunction[_, R] = js.native
  @JSImport("rxjs/internal/operators", "switchMapTo")
  @js.native
  def switchMapTo[T, R](observable: ObservableInput[R], resultSelector: js.UndefOr[scala.Nothing]): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "switchMapTo")
  @js.native
  def switchMapTo[T, I, R](
    observable: ObservableInput[I],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ I, 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "take")
  @js.native
  def take[T](count: Double): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "takeLast")
  @js.native
  def takeLast[T](count: Double): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "takeUntil")
  @js.native
  def takeUntil[T](notifier: Observable[_]): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "takeWhile")
  @js.native
  def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "takeWhile")
  @js.native
  def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], inclusive: Boolean): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "takeWhile")
  @js.native
  def takeWhile_TS_T_OperatorFunction[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): OperatorFunction[T, S] = js.native
  @JSImport("rxjs/internal/operators", "takeWhile")
  @js.native
  def takeWhile_false[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], inclusive: `false`): OperatorFunction[T, S] = js.native
  
  @JSImport("rxjs/internal/operators", "tap")
  @js.native
  def tap[T](): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "tap")
  @js.native
  def tap[T](next: js.UndefOr[scala.Nothing], error: js.UndefOr[scala.Nothing], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "tap")
  @js.native
  def tap[T](next: js.UndefOr[scala.Nothing], error: js.Function1[/* e */ /* error */ js.Any, Unit]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "tap")
  @js.native
  def tap[T](
    next: js.UndefOr[scala.Nothing],
    error: js.Function1[/* e */ /* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "tap")
  @js.native
  def tap[T](next: js.UndefOr[scala.Nothing], error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "tap")
  @js.native
  def tap[T](next: js.Function1[/* x */ T, Unit]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "tap")
  @js.native
  def tap[T](
    next: js.Function1[/* x */ /* value */ T, Unit],
    error: js.UndefOr[scala.Nothing],
    complete: js.Function0[Unit]
  ): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "tap")
  @js.native
  def tap[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ js.Any, Unit]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "tap")
  @js.native
  def tap[T](
    next: js.Function1[/* x */ T, Unit],
    error: js.Function1[/* e */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "tap")
  @js.native
  def tap[T](next: js.Function1[/* value */ T, Unit], error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "tap")
  @js.native
  def tap[T](next: Null, error: js.UndefOr[scala.Nothing], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "tap")
  @js.native
  def tap[T](next: Null, error: js.Function1[/* error */ js.Any, Unit]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "tap")
  @js.native
  def tap[T](next: Null, error: js.Function1[/* error */ js.Any, Unit], complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "tap")
  @js.native
  def tap[T](next: Null, error: Null, complete: js.Function0[Unit]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "tap")
  @js.native
  def tap[T](observer: PartialObserver[T]): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "throttle")
  @js.native
  def throttle[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "throttle")
  @js.native
  def throttle[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]], config: ThrottleConfig): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "throttleTime")
  @js.native
  def throttleTime[T](duration: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "throttleTime")
  @js.native
  def throttleTime[T](duration: Double, scheduler: js.UndefOr[scala.Nothing], config: ThrottleConfig): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "throttleTime")
  @js.native
  def throttleTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "throttleTime")
  @js.native
  def throttleTime[T](duration: Double, scheduler: SchedulerLike, config: ThrottleConfig): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "timeInterval")
  @js.native
  def timeInterval[T](): OperatorFunction[T, TimeInterval_[T]] = js.native
  @JSImport("rxjs/internal/operators", "timeInterval")
  @js.native
  def timeInterval[T](scheduler: SchedulerLike): OperatorFunction[T, TimeInterval_[T]] = js.native
  
  @JSImport("rxjs/internal/operators", "timeout")
  @js.native
  def timeout[T](due: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "timeout")
  @js.native
  def timeout[T](due: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "timeout")
  @js.native
  def timeout[T](due: Date): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators", "timeout")
  @js.native
  def timeout[T](due: Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  
  @JSImport("rxjs/internal/operators", "timeoutWith")
  @js.native
  def timeoutWith[T, R](due: Double, withObservable: ObservableInput[R]): OperatorFunction[T, T | R] = js.native
  @JSImport("rxjs/internal/operators", "timeoutWith")
  @js.native
  def timeoutWith[T, R](due: Double, withObservable: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = js.native
  @JSImport("rxjs/internal/operators", "timeoutWith")
  @js.native
  def timeoutWith[T, R](due: Date, withObservable: ObservableInput[R]): OperatorFunction[T, T | R] = js.native
  @JSImport("rxjs/internal/operators", "timeoutWith")
  @js.native
  def timeoutWith[T, R](due: Date, withObservable: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = js.native
  
  @JSImport("rxjs/internal/operators", "timestamp")
  @js.native
  def timestamp[T](): OperatorFunction[T, Timestamp_[T]] = js.native
  @JSImport("rxjs/internal/operators", "timestamp")
  @js.native
  def timestamp[T](scheduler: SchedulerLike): OperatorFunction[T, Timestamp_[T]] = js.native
  
  @JSImport("rxjs/internal/operators", "toArray")
  @js.native
  def toArray[T](): OperatorFunction[T, js.Array[T]] = js.native
  
  @JSImport("rxjs/internal/operators", "window")
  @js.native
  def window[T](windowBoundaries: Observable[_]): OperatorFunction[T, Observable[T]] = js.native
  
  @JSImport("rxjs/internal/operators", "windowCount")
  @js.native
  def windowCount[T](windowSize: Double): OperatorFunction[T, Observable[T]] = js.native
  @JSImport("rxjs/internal/operators", "windowCount")
  @js.native
  def windowCount[T](windowSize: Double, startWindowEvery: Double): OperatorFunction[T, Observable[T]] = js.native
  
  @JSImport("rxjs/internal/operators", "windowTime")
  @js.native
  def windowTime[T](windowTimeSpan: Double): OperatorFunction[T, Observable[T]] = js.native
  @JSImport("rxjs/internal/operators", "windowTime")
  @js.native
  def windowTime[T](windowTimeSpan: Double, scheduler: SchedulerLike): OperatorFunction[T, Observable[T]] = js.native
  @JSImport("rxjs/internal/operators", "windowTime")
  @js.native
  def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double): OperatorFunction[T, Observable[T]] = js.native
  @JSImport("rxjs/internal/operators", "windowTime")
  @js.native
  def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, maxWindowSize: Double): OperatorFunction[T, Observable[T]] = js.native
  @JSImport("rxjs/internal/operators", "windowTime")
  @js.native
  def windowTime[T](
    windowTimeSpan: Double,
    windowCreationInterval: Double,
    maxWindowSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, Observable[T]] = js.native
  @JSImport("rxjs/internal/operators", "windowTime")
  @js.native
  def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, scheduler: SchedulerLike): OperatorFunction[T, Observable[T]] = js.native
  
  @JSImport("rxjs/internal/operators", "windowToggle")
  @js.native
  def windowToggle[T, O](openings: Observable[O], closingSelector: js.Function1[/* openValue */ O, Observable[_]]): OperatorFunction[T, Observable[T]] = js.native
  
  @JSImport("rxjs/internal/operators", "windowWhen")
  @js.native
  def windowWhen[T](closingSelector: js.Function0[Observable[_]]): OperatorFunction[T, Observable[T]] = js.native
  
  @JSImport("rxjs/internal/operators", "withLatestFrom")
  @js.native
  def withLatestFrom[T, R](array: js.Array[ObservableInput[_]]): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "withLatestFrom")
  @js.native
  def withLatestFrom[T, R](array: js.Array[ObservableInput[_]], project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "withLatestFrom")
  @js.native
  def withLatestFrom[T, R](observables: (ObservableInput[_] | (js.Function1[/* repeated */ js.Any, R]))*): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "withLatestFrom")
  @js.native
  def withLatestFrom[T, R](project: js.Function1[/* v1 */ T, R]): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "withLatestFrom")
  @js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */](source2: O2): OperatorFunction[T, js.Tuple2[T, ObservedValueOf[O2]]] = js.native
  @JSImport("rxjs/internal/operators", "withLatestFrom")
  @js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, R](source2: O2, project: js.Function2[/* v1 */ T, /* v2 */ ObservedValueOf[O2], R]): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "withLatestFrom")
  @js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v2: O2, v3: O3): OperatorFunction[T, js.Tuple3[T, ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  @JSImport("rxjs/internal/operators", "withLatestFrom")
  @js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
    v2: O2,
    v3: O3,
    project: js.Function3[/* v1 */ T, /* v2 */ ObservedValueOf[O2], /* v3 */ ObservedValueOf[O3], R]
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "withLatestFrom")
  @js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v2: O2, v3: O3, v4: O4): OperatorFunction[T, js.Tuple4[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]] = js.native
  @JSImport("rxjs/internal/operators", "withLatestFrom")
  @js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
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
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "withLatestFrom")
  @js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v2: O2, v3: O3, v4: O4, v5: O5): OperatorFunction[
    T, 
    js.Tuple5[T, ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4], ObservedValueOf[O5]]
  ] = js.native
  @JSImport("rxjs/internal/operators", "withLatestFrom")
  @js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
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
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "withLatestFrom")
  @js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): OperatorFunction[
    T, 
    js.Tuple6[
      T, 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  @JSImport("rxjs/internal/operators", "withLatestFrom")
  @js.native
  def withLatestFrom[T, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
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
  ): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "zip")
  @js.native
  def zip[T, R](array: js.Array[ObservableInput[T]]): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "zip")
  @js.native
  def zip[T, R](observables: (ObservableInput[T] | (js.Function1[/* repeated */ T, R]))*): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "zip")
  @js.native
  def zip[T, R](project: js.Function1[/* v1 */ T, R]): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "zip")
  @js.native
  def zip[T, T2](v2: ObservableInput[T2]): OperatorFunction[T, js.Tuple2[T, T2]] = js.native
  @JSImport("rxjs/internal/operators", "zip")
  @js.native
  def zip[T, TOther, R](
    array: js.Array[ObservableInput[TOther]],
    project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "zip")
  @js.native
  def zip[T, T2, R](v2: ObservableInput[T2], project: js.Function2[/* v1 */ T, /* v2 */ T2, R]): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "zip")
  @js.native
  def zip[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): OperatorFunction[T, js.Tuple3[T, T2, T3]] = js.native
  @JSImport("rxjs/internal/operators", "zip")
  @js.native
  def zip[T, T2, T3, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "zip")
  @js.native
  def zip[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): OperatorFunction[T, js.Tuple4[T, T2, T3, T4]] = js.native
  @JSImport("rxjs/internal/operators", "zip")
  @js.native
  def zip[T, T2, T3, T4, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "zip")
  @js.native
  def zip[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): OperatorFunction[T, js.Tuple5[T, T2, T3, T4, T5]] = js.native
  @JSImport("rxjs/internal/operators", "zip")
  @js.native
  def zip[T, T2, T3, T4, T5, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
  ): OperatorFunction[T, R] = js.native
  @JSImport("rxjs/internal/operators", "zip")
  @js.native
  def zip[T, T2, T3, T4, T5, T6](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): OperatorFunction[T, js.Tuple6[T, T2, T3, T4, T5, T6]] = js.native
  @JSImport("rxjs/internal/operators", "zip")
  @js.native
  def zip[T, T2, T3, T4, T5, T6, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
  ): OperatorFunction[T, R] = js.native
  
  @JSImport("rxjs/internal/operators", "zipAll")
  @js.native
  def zipAll[T](): OperatorFunction[_, js.Array[T]] = js.native
  @JSImport("rxjs/internal/operators", "zipAll")
  @js.native
  def zipAll[R](project: js.Function1[/* repeated */ js.Any, R]): OperatorFunction[_, R] = js.native
  @JSImport("rxjs/internal/operators", "zipAll")
  @js.native
  def zipAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): OperatorFunction[ObservableInput[T], R] = js.native
}
