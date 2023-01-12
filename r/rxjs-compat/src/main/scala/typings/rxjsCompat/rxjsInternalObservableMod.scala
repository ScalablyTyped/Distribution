package typings.rxjsCompat

import typings.rxjs.distTypesInternalAnyCatcherMod.AnyCatcher
import typings.rxjs.distTypesInternalObservableDomWebSocketSubjectMod.WebSocketSubject
import typings.rxjs.distTypesInternalObservableDomWebSocketSubjectMod.WebSocketSubjectConfig
import typings.rxjs.distTypesInternalObservableFromEventMod.EventListenerOptions
import typings.rxjs.distTypesInternalObservableFromEventMod.HasEventTargetAddRemove
import typings.rxjs.distTypesInternalObservableFromEventMod.JQueryStyleEventEmitter
import typings.rxjs.distTypesInternalObservableFromEventMod.NodeCompatibleEventEmitter
import typings.rxjs.distTypesInternalObservableFromEventMod.NodeEventHandler
import typings.rxjs.distTypesInternalObservableFromEventMod.NodeStyleEventEmitter
import typings.rxjs.distTypesInternalObservableGenerateMod.ConditionFunc
import typings.rxjs.distTypesInternalObservableGenerateMod.GenerateBaseOptions
import typings.rxjs.distTypesInternalObservableGenerateMod.GenerateOptions
import typings.rxjs.distTypesInternalObservableGenerateMod.IterateFunc
import typings.rxjs.distTypesInternalObservableGenerateMod.ResultFunc
import typings.rxjs.distTypesInternalTypesMod.FactoryOrValue
import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.PartialObserver
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.distTypesInternalTypesMod.SubscribableOrPromise
import typings.rxjs.distTypesInternalTypesMod.Unsubscribable
import typings.rxjs.distTypesInternalTypesMod.ValueFromArray
import typings.rxjs.mod.ConnectableObservable
import typings.rxjs.mod.Notification
import typings.rxjs.mod.Observable_
import typings.rxjs.mod.Subject
import typings.rxjsCompat.anon.Fn0
import typings.rxjsCompat.anon.Fn1
import typings.rxjsCompat.anon.Fn10
import typings.rxjsCompat.anon.Fn11
import typings.rxjsCompat.anon.Fn12
import typings.rxjsCompat.anon.Fn13
import typings.rxjsCompat.anon.Fn14
import typings.rxjsCompat.anon.Fn15
import typings.rxjsCompat.anon.Fn16
import typings.rxjsCompat.anon.Fn17
import typings.rxjsCompat.anon.Fn18
import typings.rxjsCompat.anon.Fn19
import typings.rxjsCompat.anon.Fn2
import typings.rxjsCompat.anon.Fn20
import typings.rxjsCompat.anon.Fn21
import typings.rxjsCompat.anon.Fn3
import typings.rxjsCompat.anon.Fn4
import typings.rxjsCompat.anon.Fn5
import typings.rxjsCompat.anon.Fn6
import typings.rxjsCompat.anon.Fn7
import typings.rxjsCompat.anon.Fn8
import typings.rxjsCompat.anon.Fn9
import typings.rxjsCompat.anon.FnCall
import typings.rxjsCompat.anon.FnCallSubjectFactorySelector
import typings.rxjsCompat.anon.FnCallThis
import typings.rxjsCompat.anon.FnCallThisAccumulatorSeed
import typings.rxjsCompat.anon.FnCallThisAccumulatorSeedConcurrent
import typings.rxjsCompat.anon.FnCallThisBufferSizeStartBufferEvery
import typings.rxjsCompat.anon.FnCallThisBufferSizeWindowTimeScheduler
import typings.rxjsCompat.anon.FnCallThisBufferSizeWindowTimeSelectorScheduler
import typings.rxjsCompat.anon.FnCallThisBufferTimeSpanBufferCreationIntervalMaxBufferSizeScheduler
import typings.rxjsCompat.anon.FnCallThisCallback
import typings.rxjsCompat.anon.FnCallThisClosingNotifier
import typings.rxjsCompat.anon.FnCallThisClosingSelector
import typings.rxjsCompat.anon.FnCallThisCompareKeySelector
import typings.rxjsCompat.anon.FnCallThisCompareToComparor
import typings.rxjsCompat.anon.FnCallThisComparer
import typings.rxjsCompat.anon.FnCallThisConcurrent
import typings.rxjsCompat.anon.FnCallThisCount
import typings.rxjsCompat.anon.FnCallThisDefaultValue
import typings.rxjsCompat.anon.FnCallThisDelayDurationSelectorSubscriptionDelay
import typings.rxjsCompat.anon.FnCallThisDelayScheduler
import typings.rxjsCompat.anon.FnCallThisDueScheduler
import typings.rxjsCompat.anon.FnCallThisDueTimeScheduler
import typings.rxjsCompat.anon.FnCallThisDueWithObservableScheduler
import typings.rxjsCompat.anon.FnCallThisDurationScheduler
import typings.rxjsCompat.anon.FnCallThisDurationSchedulerConfig
import typings.rxjsCompat.anon.FnCallThisDurationSelectorConfig
import typings.rxjsCompat.anon.FnCallThisFunc
import typings.rxjsCompat.anon.FnCallThisIndexDefaultValue
import typings.rxjsCompat.anon.FnCallThisInnerObservable
import typings.rxjsCompat.anon.FnCallThisInnerObservableConcurrent
import typings.rxjsCompat.anon.FnCallThisKeyCompare
import typings.rxjsCompat.anon.FnCallThisKeySelectorElementSelectorDurationSelectorSubjectSelector
import typings.rxjsCompat.anon.FnCallThisKeySelectorFlushes
import typings.rxjsCompat.anon.FnCallThisNextErrorComplete
import typings.rxjsCompat.anon.FnCallThisNotifier
import typings.rxjsCompat.anon.FnCallThisObservableResultSelector
import typings.rxjsCompat.anon.FnCallThisObservables
import typings.rxjsCompat.anon.FnCallThisOpeningsClosingSelector
import typings.rxjsCompat.anon.FnCallThisPeriodScheduler
import typings.rxjsCompat.anon.FnCallThisPredicate
import typings.rxjsCompat.anon.FnCallThisPredicateDefaultValue
import typings.rxjsCompat.anon.FnCallThisPredicateThisArg
import typings.rxjsCompat.anon.FnCallThisProject
import typings.rxjsCompat.anon.FnCallThisProjectConcurrent
import typings.rxjsCompat.anon.FnCallThisProjectConcurrentScheduler
import typings.rxjsCompat.anon.FnCallThisProjectThisArg
import typings.rxjsCompat.anon.FnCallThisProperties
import typings.rxjsCompat.anon.FnCallThisScheduler
import typings.rxjsCompat.anon.FnCallThisSchedulerDelay
import typings.rxjsCompat.anon.FnCallThisSelector
import typings.rxjsCompat.anon.FnCallThisV1V2V3V4V5V6Scheduler
import typings.rxjsCompat.anon.FnCallThisV2V3V4V5V6
import typings.rxjsCompat.anon.FnCallThisV2V3V4V5V6ConcurrentScheduler
import typings.rxjsCompat.anon.FnCallThisV2V3V4V5V6Project
import typings.rxjsCompat.anon.FnCallThisV2V3V4V5V6Scheduler
import typings.rxjsCompat.anon.FnCallThisValue
import typings.rxjsCompat.anon.FnCallThisWindowBoundaries
import typings.rxjsCompat.anon.FnCallThisWindowSizeStartWindowEvery
import typings.rxjsCompat.anon.FnCallThisWindowTimeSpanWindowCreationIntervalMaxWindowSizeScheduler
import typings.rxjsCompat.rxjsCompatInts.`0`
import typings.std.ArrayLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rxjsInternalObservableMod {
  
  trait Observable[T] extends StObject {
    
    def _catch[T, R](selector: js.Function2[/* err */ Any, /* caught */ Observable_[T], ObservableInput[R]]): Observable_[T | R]
    @JSName("_catch")
    var _catch_Original: FnCallThisSelector
    
    def _do[T](next: js.Function1[/* x */ T, Unit]): Observable_[T]
    def _do[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ Any, Unit]): Observable_[T]
    def _do[T](
      next: js.Function1[/* x */ T, Unit],
      error: js.Function1[/* e */ Any, Unit],
      complete: js.Function0[Unit]
    ): Observable_[T]
    def _do[T](next: js.Function1[/* x */ T, Unit], error: Unit, complete: js.Function0[Unit]): Observable_[T]
    def _do[T](observer: PartialObserver[T]): Observable_[T]
    @JSName("_do")
    var _do_Original: FnCallThisNextErrorComplete
    
    def _finally[T](callback: js.Function0[Unit]): Observable_[T]
    @JSName("_finally")
    var _finally_Original: FnCallThisCallback
    
    def _switch[T](): Observable_[T]
    @JSName("_switch")
    var _switch_Original: FnCallThis
    @JSName("_switch")
    def _switch_TR[T, R](): Observable_[R]
    
    def audit[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[Any]]): Observable_[T]
    
    def auditTime[T](duration: Double): Observable_[T]
    def auditTime[T](duration: Double, scheduler: SchedulerLike): Observable_[T]
    @JSName("auditTime")
    var auditTime_Original: FnCallThisDurationScheduler
    
    @JSName("audit")
    var audit_Original: FnCall
    
    def buffer[T](closingNotifier: Observable_[Any]): Observable_[js.Array[T]]
    
    def bufferCount[T](bufferSize: Double): Observable_[js.Array[T]]
    def bufferCount[T](bufferSize: Double, startBufferEvery: Double): Observable_[js.Array[T]]
    @JSName("bufferCount")
    var bufferCount_Original: FnCallThisBufferSizeStartBufferEvery
    
    def bufferTime[T](bufferTimeSpan: Double): Observable_[js.Array[T]]
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double): Observable_[js.Array[T]]
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, maxBufferSize: Double): Observable_[js.Array[T]]
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Double,
      maxBufferSize: Double,
      scheduler: SchedulerLike
    ): Observable_[js.Array[T]]
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, scheduler: SchedulerLike): Observable_[js.Array[T]]
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, maxBufferSize: Double): Observable_[js.Array[T]]
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Null,
      maxBufferSize: Double,
      scheduler: SchedulerLike
    ): Observable_[js.Array[T]]
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, scheduler: SchedulerLike): Observable_[js.Array[T]]
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Unit, maxBufferSize: Double): Observable_[js.Array[T]]
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Unit,
      maxBufferSize: Double,
      scheduler: SchedulerLike
    ): Observable_[js.Array[T]]
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Unit, scheduler: SchedulerLike): Observable_[js.Array[T]]
    def bufferTime[T](bufferTimeSpan: Double, scheduler: SchedulerLike): Observable_[js.Array[T]]
    @JSName("bufferTime")
    var bufferTime_Original: FnCallThisBufferTimeSpanBufferCreationIntervalMaxBufferSizeScheduler
    
    def bufferToggle[T, O](
      openings: SubscribableOrPromise[O],
      closingSelector: js.Function1[/* value */ O, SubscribableOrPromise[Any]]
    ): Observable_[js.Array[T]]
    @JSName("bufferToggle")
    var bufferToggle_Original: FnCallThisOpeningsClosingSelector
    
    def bufferWhen[T](closingSelector: js.Function0[Observable_[Any]]): Observable_[js.Array[T]]
    @JSName("bufferWhen")
    var bufferWhen_Original: FnCallThisClosingSelector
    
    @JSName("buffer")
    var buffer_Original: FnCallThisClosingNotifier
    
    def `catch`[T, R](selector: js.Function2[/* err */ Any, /* caught */ Observable_[T], ObservableInput[R]]): Observable_[T | R]
    @JSName("catch")
    var catch_Original: FnCallThisSelector
    
    def combineAll[T](): Observable_[js.Array[T]]
    def combineAll[R](project: js.Function1[/* repeated */ Any, R]): Observable_[R]
    @JSName("combineAll")
    var combineAll_Original: FnCallThisProject
    @JSName("combineAll")
    def combineAll_TR[T, R](): Observable_[js.Array[R]]
    @JSName("combineAll")
    def combineAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): Observable_[R]
    
    def combineLatest[T, R](array: js.Array[ObservableInput[T]]): Observable_[js.Array[T]]
    def combineLatest[T, R](observables: (ObservableInput[T] | (js.Function1[/* repeated */ T, R]))*): Observable_[R]
    def combineLatest[T, R](project: js.Function1[/* v1 */ T, R]): Observable_[R]
    def combineLatest[T, T2](v2: ObservableInput[T2]): Observable_[js.Tuple2[T, T2]]
    def combineLatest[T, TOther, R](
      array: js.Array[ObservableInput[TOther]],
      project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
    ): Observable_[R]
    def combineLatest[T, T2, R](v2: ObservableInput[T2], project: js.Function2[/* v1 */ T, /* v2 */ T2, R]): Observable_[R]
    def combineLatest[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable_[js.Tuple3[T, T2, T3]]
    def combineLatest[T, T2, T3, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
    ): Observable_[R]
    def combineLatest[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable_[js.Tuple4[T, T2, T3, T4]]
    def combineLatest[T, T2, T3, T4, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
    ): Observable_[R]
    def combineLatest[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable_[js.Tuple5[T, T2, T3, T4, T5]]
    def combineLatest[T, T2, T3, T4, T5, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
    ): Observable_[R]
    def combineLatest[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6]
    ): Observable_[js.Tuple6[T, T2, T3, T4, T5, T6]]
    def combineLatest[T, T2, T3, T4, T5, T6, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
    ): Observable_[R]
    @JSName("combineLatest")
    var combineLatest_Original: FnCallThisV2V3V4V5V6Project
    
    def concat[T](): Observable_[T]
    def concat[T](observables: (ObservableInput[T] | SchedulerLike)*): Observable_[T]
    def concat[T](scheduler: SchedulerLike): Observable_[T]
    def concat[T, T2](v2: ObservableInput[T2]): Observable_[T | T2]
    def concat[T, T2](v2: ObservableInput[T2], scheduler: SchedulerLike): Observable_[T | T2]
    def concat[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable_[T | T2 | T3]
    def concat[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): Observable_[T | T2 | T3]
    def concat[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable_[T | T2 | T3 | T4]
    def concat[T, T2, T3, T4](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      scheduler: SchedulerLike
    ): Observable_[T | T2 | T3 | T4]
    def concat[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable_[T | T2 | T3 | T4 | T5]
    def concat[T, T2, T3, T4, T5](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      scheduler: SchedulerLike
    ): Observable_[T | T2 | T3 | T4 | T5]
    def concat[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6]
    ): Observable_[T | T2 | T3 | T4 | T5 | T6]
    def concat[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      scheduler: SchedulerLike
    ): Observable_[T | T2 | T3 | T4 | T5 | T6]
    
    def concatAll[T](): Observable_[T]
    @JSName("concatAll")
    var concatAll_Original: FnCallThis
    @JSName("concatAll")
    def concatAll_TR[T, R](): Observable_[R]
    
    def concatMap[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]): Observable_[R]
    
    def concatMapTo[T, R](innerObservable: Observable_[R]): Observable_[R]
    @JSName("concatMapTo")
    var concatMapTo_Original: FnCallThisInnerObservable
    
    @JSName("concatMap")
    var concatMap_Original: Fn0
    
    @JSName("concat")
    var concat_Original: FnCallThisV2V3V4V5V6Scheduler
    @JSName("concat")
    def concat_TR[T, R](observables: (ObservableInput[Any] | SchedulerLike)*): Observable_[R]
    
    def count[T](): Observable_[Double]
    def count[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean]): Observable_[Double]
    @JSName("count")
    var count_Original: FnCallThisPredicate
    
    def debounce[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[Any]]): Observable_[T]
    
    def debounceTime[T](dueTime: Double): Observable_[T]
    def debounceTime[T](dueTime: Double, scheduler: SchedulerLike): Observable_[T]
    @JSName("debounceTime")
    var debounceTime_Original: FnCallThisDueTimeScheduler
    
    @JSName("debounce")
    var debounce_Original: FnCall
    
    def defaultIfEmpty[T](): Observable_[T]
    def defaultIfEmpty[T](defaultValue: T): Observable_[T]
    @JSName("defaultIfEmpty")
    var defaultIfEmpty_Original: FnCallThisDefaultValue
    @JSName("defaultIfEmpty")
    def defaultIfEmpty_TR[T, R](): Observable_[T | R]
    @JSName("defaultIfEmpty")
    def defaultIfEmpty_TR[T, R](defaultValue: R): Observable_[T | R]
    
    def delay[T](delay: js.Date): Observable_[T]
    def delay[T](delay: js.Date, scheduler: SchedulerLike): Observable_[T]
    def delay[T](delay: Double): Observable_[T]
    def delay[T](delay: Double, scheduler: SchedulerLike): Observable_[T]
    
    def delayWhen[T](delayDurationSelector: js.Function1[/* value */ T, Observable_[Any]]): Observable_[T]
    def delayWhen[T](
      delayDurationSelector: js.Function1[/* value */ T, Observable_[Any]],
      subscriptionDelay: Observable_[Any]
    ): Observable_[T]
    @JSName("delayWhen")
    var delayWhen_Original: FnCallThisDelayDurationSelectorSubscriptionDelay
    
    @JSName("delay")
    var delay_Original: FnCallThisDelayScheduler
    
    def dematerialize[T](): Observable_[T]
    @JSName("dematerialize")
    var dematerialize_Original: Fn1
    
    def distinct[T, K](): Observable_[T]
    def distinct[T, K](keySelector: js.Function1[/* value */ T, K]): Observable_[T]
    def distinct[T, K](keySelector: js.Function1[/* value */ T, K], flushes: Observable_[Any]): Observable_[T]
    def distinct[T, K](keySelector: Unit, flushes: Observable_[Any]): Observable_[T]
    
    def distinctUntilChanged[T](): Observable_[T]
    def distinctUntilChanged[T](compare: js.Function2[/* x */ T, /* y */ T, Boolean]): Observable_[T]
    def distinctUntilChanged[T, K](compare: js.Function2[/* x */ K, /* y */ K, Boolean], keySelector: js.Function1[/* x */ T, K]): Observable_[T]
    @JSName("distinctUntilChanged")
    var distinctUntilChanged_Original: FnCallThisCompareKeySelector
    
    def distinctUntilKeyChanged[T](key: /* keyof T */ String): Observable_[T]
    def distinctUntilKeyChanged[T, K /* <: /* keyof T */ String */](
      key: K,
      compare: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* x */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* y */ js.Any, 
          Boolean
        ]
    ): Observable_[T]
    @JSName("distinctUntilKeyChanged")
    var distinctUntilKeyChanged_Original: FnCallThisKeyCompare
    
    @JSName("distinct")
    var distinct_Original: FnCallThisKeySelectorFlushes
    
    def `do`[T](next: js.Function1[/* x */ T, Unit]): Observable_[T]
    def `do`[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ Any, Unit]): Observable_[T]
    def `do`[T](
      next: js.Function1[/* x */ T, Unit],
      error: js.Function1[/* e */ Any, Unit],
      complete: js.Function0[Unit]
    ): Observable_[T]
    def `do`[T](next: js.Function1[/* x */ T, Unit], error: Unit, complete: js.Function0[Unit]): Observable_[T]
    def `do`[T](observer: PartialObserver[T]): Observable_[T]
    @JSName("do")
    var do_Original: FnCallThisNextErrorComplete
    
    def elementAt[T](index: Double): Observable_[T]
    def elementAt[T](index: Double, defaultValue: T): Observable_[T]
    @JSName("elementAt")
    var elementAt_Original: FnCallThisIndexDefaultValue
    
    def every[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean]): Observable_[Boolean]
    def every[T](
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean],
      thisArg: Any
    ): Observable_[Boolean]
    @JSName("every")
    var every_Original: FnCallThisPredicateThisArg
    
    def exhaust[T](): Observable_[T]
    
    def exhaustMap[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]): Observable_[R]
    @JSName("exhaustMap")
    var exhaustMap_Original: Fn0
    
    @JSName("exhaust")
    var exhaust_Original: FnCallThis
    @JSName("exhaust")
    def exhaust_TR[T, R](): Observable_[R]
    
    def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]]): Observable_[T]
    def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]], concurrent: Double): Observable_[T]
    def expand[T](
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
      concurrent: Double,
      scheduler: SchedulerLike
    ): Observable_[T]
    def expand[T](
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
      concurrent: Unit,
      scheduler: SchedulerLike
    ): Observable_[T]
    @JSName("expand")
    var expand_Original: FnCallThisProjectConcurrentScheduler
    @JSName("expand")
    def expand_TR[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]): Observable_[R]
    @JSName("expand")
    def expand_TR[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]], concurrent: Double): Observable_[R]
    @JSName("expand")
    def expand_TR[T, R](
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
      concurrent: Double,
      scheduler: SchedulerLike
    ): Observable_[R]
    @JSName("expand")
    def expand_TR[T, R](
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
      concurrent: Unit,
      scheduler: SchedulerLike
    ): Observable_[R]
    
    def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): Observable_[T]
    def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: Any): Observable_[T]
    @JSName("filter")
    var filter_Original: Fn2
    @JSName("filter")
    def filter_TS[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): Observable_[S]
    @JSName("filter")
    def filter_TS[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], thisArg: Any): Observable_[S]
    
    def `finally`[T](callback: js.Function0[Unit]): Observable_[T]
    @JSName("finally")
    var finally_Original: FnCallThisCallback
    
    def find[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): Observable_[js.UndefOr[T]]
    def find[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: Any): Observable_[js.UndefOr[T]]
    
    def findIndex[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean]): Observable_[Double]
    def findIndex[T](
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean],
      thisArg: Any
    ): Observable_[Double]
    @JSName("findIndex")
    var findIndex_Original: Fn4
    
    @JSName("find")
    var find_Original: Fn3
    @JSName("find")
    def find_TS[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): Observable_[js.UndefOr[S]]
    @JSName("find")
    def find_TS[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], thisArg: Any): Observable_[js.UndefOr[S]]
    
    def first[T, D](): Observable_[T | D]
    def first[T, D](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean]): Observable_[T | D]
    def first[T, D](
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean],
      defaultValue: D
    ): Observable_[T | D]
    def first[T, D](predicate: Null, defaultValue: D): Observable_[T | D]
    def first[T, D](predicate: Unit, defaultValue: D): Observable_[T | D]
    @JSName("first")
    var first_Original: FnCallThisPredicateDefaultValue
    @JSName("first")
    def first_TS[T, S /* <: T */](
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], /* is S */ Boolean]
    ): Observable_[S]
    @JSName("first")
    def first_TS[T, S /* <: T */](
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], /* is S */ Boolean],
      defaultValue: S
    ): Observable_[S]
    
    def flatMap[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]): Observable_[R]
    def flatMap[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]], concurrent: Double): Observable_[R]
    
    def flatMapTo[T, R](innerObservable: ObservableInput[R]): Observable_[R]
    def flatMapTo[T, R](innerObservable: ObservableInput[R], concurrent: Double): Observable_[R]
    @JSName("flatMapTo")
    var flatMapTo_Original: FnCallThisInnerObservableConcurrent
    
    @JSName("flatMap")
    var flatMap_Original: FnCallThisProjectConcurrent
    
    def groupBy[T, K](keySelector: js.Function1[/* value */ T, K]): Observable_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ Any
      ]
    def groupBy[T, K](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: Unit,
      durationSelector: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ /* grouped */ Any, 
          Observable_[Any]
        ]
    ): Observable_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ Any
      ]
    def groupBy[T, K, R](keySelector: js.Function1[/* value */ T, K], elementSelector: js.Function1[/* value */ T, R]): Observable_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
      ]
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: js.Function1[/* value */ T, R],
      durationSelector: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ Any, 
          Observable_[Any]
        ]
    ): Observable_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
      ]
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: js.Function1[/* value */ T, R],
      durationSelector: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ Any, 
          Observable_[Any]
        ],
      subjectSelector: js.Function0[Subject[R]]
    ): Observable_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
      ]
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: js.Function1[/* value */ T, R],
      durationSelector: Unit,
      subjectSelector: js.Function0[Subject[R]]
    ): Observable_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
      ]
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: Unit,
      durationSelector: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ Any, 
          Observable_[Any]
        ],
      subjectSelector: js.Function0[Subject[R]]
    ): Observable_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
      ]
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: Unit,
      durationSelector: Unit,
      subjectSelector: js.Function0[Subject[R]]
    ): Observable_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
      ]
    @JSName("groupBy")
    var groupBy_Original: FnCallThisKeySelectorElementSelectorDurationSelectorSubjectSelector
    @JSName("groupBy")
    def groupBy_TKR[T, K, R](keySelector: js.Function1[/* value */ T, K]): Observable_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
      ]
    @JSName("groupBy")
    def groupBy_TKR[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: Unit,
      durationSelector: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ Any, 
          Observable_[Any]
        ]
    ): Observable_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ Any
      ]
    
    def ignoreElements(): Observable_[scala.Nothing]
    @JSName("ignoreElements")
    var ignoreElements_Original: js.ThisFunction0[/* this */ Observable_[Any], Observable_[scala.Nothing]]
    
    def isEmpty[T](): Observable_[Boolean]
    @JSName("isEmpty")
    var isEmpty_Original: Fn5
    
    def last[T, D](): Observable_[T | D]
    def last[T, D](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean]): Observable_[T | D]
    def last[T, D](
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean],
      defaultValue: D
    ): Observable_[T | D]
    def last[T, D](predicate: Null, defaultValue: D): Observable_[T | D]
    def last[T, D](predicate: Unit, defaultValue: D): Observable_[T | D]
    @JSName("last")
    var last_Original: FnCallThisPredicateDefaultValue
    @JSName("last")
    def last_TS[T, S /* <: T */](
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], /* is S */ Boolean]
    ): Observable_[S]
    @JSName("last")
    def last_TS[T, S /* <: T */](
      predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], /* is S */ Boolean],
      defaultValue: S
    ): Observable_[S]
    
    def let[T, R](func: js.Function1[/* selector */ Observable_[T], Observable_[R]]): Observable_[R]
    
    def letBind[T, R](func: js.Function1[/* selector */ Observable_[T], Observable_[R]]): Observable_[R]
    @JSName("letBind")
    var letBind_Original: FnCallThisFunc
    
    @JSName("let")
    var let_Original: FnCallThisFunc
    
    def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R]): Observable_[R]
    def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R], thisArg: Any): Observable_[R]
    
    def mapTo[T, R](value: R): Observable_[R]
    @JSName("mapTo")
    var mapTo_Original: FnCallThisValue
    
    @JSName("map")
    var map_Original: FnCallThisProjectThisArg
    
    def materialize[T](): Observable_[Notification[T]]
    @JSName("materialize")
    var materialize_Original: Fn6
    
    def max[T](): Observable_[T]
    def max[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): Observable_[T]
    @JSName("max")
    var max_Original: FnCallThisComparer
    
    def merge[T](): Observable_[T]
    def merge[T](concurrent: Double): Observable_[T]
    def merge[T](concurrent: Double, scheduler: SchedulerLike): Observable_[T]
    def merge[T](concurrent: Unit, scheduler: SchedulerLike): Observable_[T]
    def merge[T](observables: (ObservableInput[T] | SchedulerLike | Double)*): Observable_[T]
    def merge[T](scheduler: SchedulerLike): Observable_[T]
    def merge[T, T2](v2: ObservableInput[T2]): Observable_[T | T2]
    def merge[T, T2](v2: ObservableInput[T2], concurrent: Double): Observable_[T | T2]
    def merge[T, T2](v2: ObservableInput[T2], concurrent: Double, scheduler: SchedulerLike): Observable_[T | T2]
    def merge[T, T2](v2: ObservableInput[T2], concurrent: Unit, scheduler: SchedulerLike): Observable_[T | T2]
    def merge[T, T2](v2: ObservableInput[T2], scheduler: SchedulerLike): Observable_[T | T2]
    def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable_[T | T2 | T3]
    def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double): Observable_[T | T2 | T3]
    def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double, scheduler: SchedulerLike): Observable_[T | T2 | T3]
    def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Unit, scheduler: SchedulerLike): Observable_[T | T2 | T3]
    def merge[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): Observable_[T | T2 | T3]
    def merge[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable_[T | T2 | T3 | T4]
    def merge[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], concurrent: Double): Observable_[T | T2 | T3 | T4]
    def merge[T, T2, T3, T4](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      concurrent: Double,
      scheduler: SchedulerLike
    ): Observable_[T | T2 | T3 | T4]
    def merge[T, T2, T3, T4](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      concurrent: Unit,
      scheduler: SchedulerLike
    ): Observable_[T | T2 | T3 | T4]
    def merge[T, T2, T3, T4](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      scheduler: SchedulerLike
    ): Observable_[T | T2 | T3 | T4]
    def merge[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable_[T | T2 | T3 | T4 | T5]
    def merge[T, T2, T3, T4, T5](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      concurrent: Double
    ): Observable_[T | T2 | T3 | T4 | T5]
    def merge[T, T2, T3, T4, T5](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      concurrent: Double,
      scheduler: SchedulerLike
    ): Observable_[T | T2 | T3 | T4 | T5]
    def merge[T, T2, T3, T4, T5](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      concurrent: Unit,
      scheduler: SchedulerLike
    ): Observable_[T | T2 | T3 | T4 | T5]
    def merge[T, T2, T3, T4, T5](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      scheduler: SchedulerLike
    ): Observable_[T | T2 | T3 | T4 | T5]
    def merge[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6]
    ): Observable_[T | T2 | T3 | T4 | T5 | T6]
    def merge[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      concurrent: Double
    ): Observable_[T | T2 | T3 | T4 | T5 | T6]
    def merge[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      concurrent: Double,
      scheduler: SchedulerLike
    ): Observable_[T | T2 | T3 | T4 | T5 | T6]
    def merge[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      concurrent: Unit,
      scheduler: SchedulerLike
    ): Observable_[T | T2 | T3 | T4 | T5 | T6]
    def merge[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      scheduler: SchedulerLike
    ): Observable_[T | T2 | T3 | T4 | T5 | T6]
    
    def mergeAll[T](): Observable_[T]
    def mergeAll[T](concurrent: Double): Observable_[T]
    @JSName("mergeAll")
    var mergeAll_Original: FnCallThisConcurrent
    @JSName("mergeAll")
    def mergeAll_TR[T, R](): Observable_[R]
    @JSName("mergeAll")
    def mergeAll_TR[T, R](concurrent: Double): Observable_[R]
    
    def mergeMap[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]): Observable_[R]
    def mergeMap[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]], concurrent: Double): Observable_[R]
    
    def mergeMapTo[T, R](innerObservable: ObservableInput[R]): Observable_[R]
    def mergeMapTo[T, R](innerObservable: ObservableInput[R], concurrent: Double): Observable_[R]
    @JSName("mergeMapTo")
    var mergeMapTo_Original: FnCallThisInnerObservableConcurrent
    
    @JSName("mergeMap")
    var mergeMap_Original: FnCallThisProjectConcurrent
    
    def mergeScan[T, R](accumulator: js.Function2[/* acc */ R, /* value */ T, ObservableInput[R]], seed: R): Observable_[R]
    def mergeScan[T, R](
      accumulator: js.Function2[/* acc */ R, /* value */ T, ObservableInput[R]],
      seed: R,
      concurrent: Double
    ): Observable_[R]
    @JSName("mergeScan")
    var mergeScan_Original: FnCallThisAccumulatorSeedConcurrent
    
    @JSName("merge")
    var merge_Original: FnCallThisV2V3V4V5V6ConcurrentScheduler
    @JSName("merge")
    def merge_TR[T, R](observables: (ObservableInput[Any] | SchedulerLike | Double)*): Observable_[R]
    
    def min[T](): Observable_[T]
    def min[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): Observable_[T]
    @JSName("min")
    var min_Original: FnCallThisComparer
    
    def multicast[T](SubjectFactory: js.ThisFunction0[/* this */ Observable_[T], Subject[T]]): ConnectableObservable[T]
    def multicast[T](
      SubjectFactory: js.ThisFunction0[/* this */ Observable_[T], Subject[T]],
      selector: MonoTypeOperatorFunction[T]
    ): Observable_[T]
    def multicast[T](subjectOrSubjectFactory: FactoryOrValue[Subject[T]]): ConnectableObservable[T]
    @JSName("multicast")
    var multicast_Original: FnCallSubjectFactorySelector
    @JSName("multicast")
    def multicast_TR[T, R](SubjectFactory: js.ThisFunction0[/* this */ Observable_[T], Subject[T]]): ConnectableObservable[R]
    @JSName("multicast")
    def multicast_TR[T, R](
      SubjectFactory: js.ThisFunction0[/* this */ Observable_[T], Subject[T]],
      selector: OperatorFunction[T, R]
    ): Observable_[R]
    
    def observeOn[T](scheduler: SchedulerLike): Observable_[T]
    def observeOn[T](scheduler: SchedulerLike, delay: Double): Observable_[T]
    @JSName("observeOn")
    var observeOn_Original: FnCallThisSchedulerDelay
    
    def onErrorResumeNext[T](): Observable_[T]
    def onErrorResumeNext[T, R](array: js.Array[ObservableInput[Any]]): Observable_[T | R]
    def onErrorResumeNext[T, R](observables: ObservableInput[Any]*): Observable_[T | R]
    def onErrorResumeNext[T, R](v: ObservableInput[R]): Observable_[T | R]
    def onErrorResumeNext[T, T2, T3, R](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable_[T | T2 | T3 | R]
    def onErrorResumeNext[T, T2, T3, T4, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable_[T | T2 | T3 | T4 | R]
    def onErrorResumeNext[T, T2, T3, T4, T5, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable_[T | T2 | T3 | T4 | T5 | R]
    def onErrorResumeNext[T, T2, T3, T4, T5, T6, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6]
    ): Observable_[T | T2 | T3 | T4 | T5 | T6 | R]
    @JSName("onErrorResumeNext")
    var onErrorResumeNext_Original: FnCallThisV2V3V4V5V6
    @JSName("onErrorResumeNext")
    def onErrorResumeNext_TT2R[T, T2, R](v: ObservableInput[T2]): Observable_[T | T2 | R]
    
    def pairwise[T](): Observable_[js.Tuple2[T, T]]
    @JSName("pairwise")
    var pairwise_Original: Fn7
    
    def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Tuple2[Observable_[T], Observable_[T]]
    def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: Any): js.Tuple2[Observable_[T], Observable_[T]]
    @JSName("partition")
    var partition_Original: Fn8
    
    def pluck[T, R](properties: String*): Observable_[R]
    @JSName("pluck")
    var pluck_Original: FnCallThisProperties
    
    def publish[T](): ConnectableObservable[T]
    def publish[T](selector: js.Function1[/* source */ Observable_[T], Observable_[T]]): Observable_[T]
    
    def publishBehavior[T](value: T): ConnectableObservable[T]
    @JSName("publishBehavior")
    var publishBehavior_Original: Fn10
    
    def publishLast[T](): ConnectableObservable[T]
    @JSName("publishLast")
    var publishLast_Original: Fn11
    
    def publishReplay[T](): ConnectableObservable[T]
    def publishReplay[T](bufferSize: Double): ConnectableObservable[T]
    def publishReplay[T](bufferSize: Double, windowTime: Double): ConnectableObservable[T]
    def publishReplay[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): ConnectableObservable[T]
    def publishReplay[T](bufferSize: Double, windowTime: Double, selector: Unit, scheduler: SchedulerLike): Observable_[T]
    def publishReplay[T](bufferSize: Double, windowTime: Double, selector: MonoTypeOperatorFunction[T]): Observable_[T]
    def publishReplay[T](
      bufferSize: Double,
      windowTime: Double,
      selector: MonoTypeOperatorFunction[T],
      scheduler: SchedulerLike
    ): Observable_[T]
    def publishReplay[T](bufferSize: Double, windowTime: Unit, scheduler: SchedulerLike): ConnectableObservable[T]
    def publishReplay[T](bufferSize: Double, windowTime: Unit, selector: Unit, scheduler: SchedulerLike): Observable_[T]
    def publishReplay[T](bufferSize: Double, windowTime: Unit, selector: MonoTypeOperatorFunction[T]): Observable_[T]
    def publishReplay[T](
      bufferSize: Double,
      windowTime: Unit,
      selector: MonoTypeOperatorFunction[T],
      scheduler: SchedulerLike
    ): Observable_[T]
    def publishReplay[T](bufferSize: Unit, windowTime: Double): ConnectableObservable[T]
    def publishReplay[T](bufferSize: Unit, windowTime: Double, scheduler: SchedulerLike): ConnectableObservable[T]
    def publishReplay[T](bufferSize: Unit, windowTime: Double, selector: Unit, scheduler: SchedulerLike): Observable_[T]
    def publishReplay[T](bufferSize: Unit, windowTime: Double, selector: MonoTypeOperatorFunction[T]): Observable_[T]
    def publishReplay[T](
      bufferSize: Unit,
      windowTime: Double,
      selector: MonoTypeOperatorFunction[T],
      scheduler: SchedulerLike
    ): Observable_[T]
    def publishReplay[T](bufferSize: Unit, windowTime: Unit, scheduler: SchedulerLike): ConnectableObservable[T]
    def publishReplay[T](bufferSize: Unit, windowTime: Unit, selector: Unit, scheduler: SchedulerLike): Observable_[T]
    def publishReplay[T](bufferSize: Unit, windowTime: Unit, selector: MonoTypeOperatorFunction[T]): Observable_[T]
    def publishReplay[T](
      bufferSize: Unit,
      windowTime: Unit,
      selector: MonoTypeOperatorFunction[T],
      scheduler: SchedulerLike
    ): Observable_[T]
    @JSName("publishReplay")
    var publishReplay_Original: FnCallThisBufferSizeWindowTimeSelectorScheduler
    @JSName("publishReplay")
    def publishReplay_TR[T, R](bufferSize: Double, windowTime: Double, selector: OperatorFunction[T, R]): Observable_[R]
    @JSName("publishReplay")
    def publishReplay_TR[T, R](bufferSize: Double, windowTime: Unit, selector: OperatorFunction[T, R]): Observable_[R]
    @JSName("publishReplay")
    def publishReplay_TR[T, R](bufferSize: Unit, windowTime: Double, selector: OperatorFunction[T, R]): Observable_[R]
    @JSName("publishReplay")
    def publishReplay_TR[T, R](bufferSize: Unit, windowTime: Unit, selector: OperatorFunction[T, R]): Observable_[R]
    @JSName("publishReplay")
    def publishReplay_TR_Observable_[T, R](): Observable_[R]
    @JSName("publishReplay")
    def publishReplay_TR_Observable_[T, R](bufferSize: Double): Observable_[R]
    @JSName("publishReplay")
    def publishReplay_TR_Observable_[T, R](bufferSize: Double, windowTime: Double): Observable_[R]
    @JSName("publishReplay")
    def publishReplay_TR_Observable_[T, R](bufferSize: Unit, windowTime: Double): Observable_[R]
    @JSName("publishReplay")
    def publishReplay_T_Observable_[T](): Observable_[T]
    @JSName("publishReplay")
    def publishReplay_T_Observable_[T](bufferSize: Double): Observable_[T]
    @JSName("publishReplay")
    def publishReplay_T_Observable_[T](bufferSize: Double, windowTime: Double): Observable_[T]
    @JSName("publishReplay")
    def publishReplay_T_Observable_[T](bufferSize: Unit, windowTime: Double): Observable_[T]
    
    @JSName("publish")
    var publish_Original: Fn9
    @JSName("publish")
    def publish_TR[T, R](selector: js.Function1[/* source */ Observable_[T], Observable_[R]]): Observable_[R]
    
    def race[T](observables: (Observable_[T] | js.Array[Observable_[T]])*): Observable_[T]
    def race[T](observables: js.Array[Observable_[T]]): Observable_[T]
    @JSName("race")
    var race_Original: FnCallThisObservables
    @JSName("race")
    def race_TR[T, R](observables: (Observable_[Any] | js.Array[Observable_[Any]])*): Observable_[R]
    @JSName("race")
    def race_TR[T, R](observables: js.Array[Observable_[T]]): Observable_[R]
    
    def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): Observable_[T]
    def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): Observable_[T]
    @JSName("reduce")
    var reduce_Original: FnCallThisAccumulatorSeed
    @JSName("reduce")
    def reduce_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): Observable_[R]
    @JSName("reduce")
    def reduce_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): Observable_[R]
    
    def repeat[T](): Observable_[T]
    def repeat[T](count: Double): Observable_[T]
    
    def repeatWhen[T](notifier: js.Function1[/* errors */ Observable_[Any], Observable_[Any]]): Observable_[T]
    @JSName("repeatWhen")
    var repeatWhen_Original: FnCallThisNotifier
    
    @JSName("repeat")
    var repeat_Original: FnCallThisCount
    
    def retry[T](): Observable_[T]
    def retry[T](count: Double): Observable_[T]
    
    def retryWhen[T](notifier: js.Function1[/* errors */ Observable_[Any], Observable_[Any]]): Observable_[T]
    @JSName("retryWhen")
    var retryWhen_Original: FnCallThisNotifier
    
    @JSName("retry")
    var retry_Original: FnCallThisCount
    
    def sample[T](notifier: Observable_[Any]): Observable_[T]
    
    def sampleTime[T](period: Double): Observable_[T]
    def sampleTime[T](period: Double, scheduler: SchedulerLike): Observable_[T]
    @JSName("sampleTime")
    var sampleTime_Original: FnCallThisPeriodScheduler
    
    @JSName("sample")
    var sample_Original: Fn12
    
    def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): Observable_[T]
    def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): Observable_[T]
    @JSName("scan")
    var scan_Original: FnCallThisAccumulatorSeed
    @JSName("scan")
    def scan_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): Observable_[R]
    @JSName("scan")
    def scan_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): Observable_[R]
    
    def sequenceEqual[T](compareTo: Observable_[T]): Observable_[Boolean]
    def sequenceEqual[T](compareTo: Observable_[T], comparor: js.Function2[/* a */ T, /* b */ T, Boolean]): Observable_[Boolean]
    @JSName("sequenceEqual")
    var sequenceEqual_Original: FnCallThisCompareToComparor
    
    def share[T](): Observable_[T]
    
    def shareReplay[T](): Observable_[T]
    def shareReplay[T](bufferSize: Double): Observable_[T]
    def shareReplay[T](bufferSize: Double, windowTime: Double): Observable_[T]
    def shareReplay[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): Observable_[T]
    def shareReplay[T](bufferSize: Double, windowTime: Unit, scheduler: SchedulerLike): Observable_[T]
    def shareReplay[T](bufferSize: Unit, windowTime: Double): Observable_[T]
    def shareReplay[T](bufferSize: Unit, windowTime: Double, scheduler: SchedulerLike): Observable_[T]
    def shareReplay[T](bufferSize: Unit, windowTime: Unit, scheduler: SchedulerLike): Observable_[T]
    def shareReplay[T](
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShareReplayConfig */ Any
    ): Observable_[T]
    @JSName("shareReplay")
    var shareReplay_Original: FnCallThisBufferSizeWindowTimeScheduler
    
    @JSName("share")
    var share_Original: Fn13
    
    def single[T](): Observable_[T]
    def single[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean]): Observable_[T]
    @JSName("single")
    var single_Original: Fn14
    
    def skip[T](count: Double): Observable_[T]
    
    def skipLast[T](count: Double): Observable_[T]
    @JSName("skipLast")
    var skipLast_Original: Fn15
    
    def skipUntil[T](notifier: Observable_[Any]): Observable_[T]
    @JSName("skipUntil")
    var skipUntil_Original: Fn12
    
    def skipWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): Observable_[T]
    @JSName("skipWhile")
    var skipWhile_Original: Fn16
    
    @JSName("skip")
    var skip_Original: Fn15
    
    def startWith[T](): Observable_[T]
    def startWith[T](scheduler: SchedulerLike): Observable_[T]
    def startWith[T, D](array: (D | SchedulerLike)*): Observable_[T | D]
    def startWith[T, D](v1: D): Observable_[T | D]
    def startWith[T, D](v1: D, scheduler: SchedulerLike): Observable_[T | D]
    def startWith[T, D, E](v1: D, v2: E): Observable_[T | D | E]
    def startWith[T, D, E](v1: D, v2: E, scheduler: SchedulerLike): Observable_[T | D | E]
    def startWith[T, D, E, F](v1: D, v2: E, v3: F): Observable_[T | D | E | F]
    def startWith[T, D, E, F](v1: D, v2: E, v3: F, scheduler: SchedulerLike): Observable_[T | D | E | F]
    def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G): Observable_[T | D | E | F | G]
    def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G, scheduler: SchedulerLike): Observable_[T | D | E | F | G]
    def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H): Observable_[T | D | E | F | G | H]
    def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H, scheduler: SchedulerLike): Observable_[T | D | E | F | G | H]
    def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I): Observable_[T | D | E | F | G | H | I]
    def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I, scheduler: SchedulerLike): Observable_[T | D | E | F | G | H | I]
    @JSName("startWith")
    var startWith_Original: FnCallThisV1V2V3V4V5V6Scheduler
    
    def subscribeOn[T](scheduler: SchedulerLike): Observable_[T]
    def subscribeOn[T](scheduler: SchedulerLike, delay: Double): Observable_[T]
    @JSName("subscribeOn")
    var subscribeOn_Original: FnCallThisSchedulerDelay
    
    def switch[T](): Observable_[T]
    
    def switchMap[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]): Observable_[R]
    
    def switchMapTo[T, R](observable: ObservableInput[R]): Observable_[R]
    def switchMapTo[T, I, R](
      observable: ObservableInput[I],
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ I, 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): Observable_[R]
    @JSName("switchMapTo")
    var switchMapTo_Original: FnCallThisObservableResultSelector
    
    @JSName("switchMap")
    var switchMap_Original: Fn0
    
    @JSName("switch")
    var switch_Original: FnCallThis
    @JSName("switch")
    def switch_TR[T, R](): Observable_[R]
    
    def take[T](count: Double): Observable_[T]
    
    def takeLast[T](count: Double): Observable_[T]
    @JSName("takeLast")
    var takeLast_Original: Fn15
    
    def takeUntil[T](notifier: Observable_[Any]): Observable_[T]
    @JSName("takeUntil")
    var takeUntil_Original: Fn12
    
    def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): Observable_[T]
    @JSName("takeWhile")
    var takeWhile_Original: Fn16
    
    @JSName("take")
    var take_Original: Fn15
    
    def throttle[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[Any]]): Observable_[T]
    def throttle[T](
      durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[Any]],
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ Any
    ): Observable_[T]
    
    def throttleTime[T](duration: Double): Observable_[T]
    def throttleTime[T](
      duration: Double,
      scheduler: Unit,
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ Any
    ): Observable_[T]
    def throttleTime[T](duration: Double, scheduler: SchedulerLike): Observable_[T]
    def throttleTime[T](
      duration: Double,
      scheduler: SchedulerLike,
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ Any
    ): Observable_[T]
    @JSName("throttleTime")
    var throttleTime_Original: FnCallThisDurationSchedulerConfig
    
    @JSName("throttle")
    var throttle_Original: FnCallThisDurationSelectorConfig
    
    def timeInterval[T](): Observable_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp<T> */ Any
      ]
    def timeInterval[T](scheduler: SchedulerLike): Observable_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp<T> */ Any
      ]
    @JSName("timeInterval")
    var timeInterval_Original: FnCallThisScheduler
    
    def timeout[T](due: js.Date): Observable_[T]
    def timeout[T](due: js.Date, scheduler: SchedulerLike): Observable_[T]
    def timeout[T](due: Double): Observable_[T]
    def timeout[T](due: Double, scheduler: SchedulerLike): Observable_[T]
    
    def timeoutWith[T](due: js.Date, withObservable: ObservableInput[T]): Observable_[T]
    def timeoutWith[T](due: js.Date, withObservable: ObservableInput[T], scheduler: SchedulerLike): Observable_[T]
    def timeoutWith[T](due: Double, withObservable: ObservableInput[T]): Observable_[T]
    def timeoutWith[T](due: Double, withObservable: ObservableInput[T], scheduler: SchedulerLike): Observable_[T]
    @JSName("timeoutWith")
    var timeoutWith_Original: FnCallThisDueWithObservableScheduler
    @JSName("timeoutWith")
    def timeoutWith_TR[T, R](due: js.Date, withObservable: ObservableInput[R]): Observable_[T | R]
    @JSName("timeoutWith")
    def timeoutWith_TR[T, R](due: js.Date, withObservable: ObservableInput[R], scheduler: SchedulerLike): Observable_[T | R]
    @JSName("timeoutWith")
    def timeoutWith_TR[T, R](due: Double, withObservable: ObservableInput[R]): Observable_[T | R]
    @JSName("timeoutWith")
    def timeoutWith_TR[T, R](due: Double, withObservable: ObservableInput[R], scheduler: SchedulerLike): Observable_[T | R]
    
    @JSName("timeout")
    var timeout_Original: FnCallThisDueScheduler
    
    def timestamp[T](): Observable_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp<T> */ Any
      ]
    def timestamp[T](scheduler: SchedulerLike): Observable_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp<T> */ Any
      ]
    @JSName("timestamp")
    var timestamp_Original: FnCallThisScheduler
    
    def toArray[T](): Observable_[js.Array[T]]
    @JSName("toArray")
    var toArray_Original: Fn17
    
    def window[T](windowBoundaries: Observable_[Any]): Observable_[Observable_[T]]
    
    def windowCount[T](windowSize: Double): Observable_[Observable_[T]]
    def windowCount[T](windowSize: Double, startWindowEvery: Double): Observable_[Observable_[T]]
    @JSName("windowCount")
    var windowCount_Original: FnCallThisWindowSizeStartWindowEvery
    
    def windowTime[T](windowTimeSpan: Double): Observable_[Observable_[T]]
    def windowTime[T](windowTimeSpan: Double, scheduler: SchedulerLike): Observable_[Observable_[T]]
    def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double): Observable_[Observable_[T]]
    def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, maxWindowSize: Double): Observable_[Observable_[T]]
    def windowTime[T](
      windowTimeSpan: Double,
      windowCreationInterval: Double,
      maxWindowSize: Double,
      scheduler: SchedulerLike
    ): Observable_[Observable_[T]]
    def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, scheduler: SchedulerLike): Observable_[Observable_[T]]
    @JSName("windowTime")
    var windowTime_Original: FnCallThisWindowTimeSpanWindowCreationIntervalMaxWindowSizeScheduler
    
    def windowToggle[T, O](openings: Observable_[O], closingSelector: js.Function1[/* openValue */ O, Observable_[Any]]): Observable_[Observable_[T]]
    @JSName("windowToggle")
    var windowToggle_Original: Fn18
    
    def windowWhen[T](closingSelector: js.Function0[Observable_[Any]]): Observable_[Observable_[T]]
    @JSName("windowWhen")
    var windowWhen_Original: Fn19
    
    @JSName("window")
    var window_Original: FnCallThisWindowBoundaries
    
    def withLatestFrom[T, R](array: js.Array[ObservableInput[Any]]): Observable_[R]
    def withLatestFrom[T, R](array: js.Array[ObservableInput[Any]], project: js.Function1[/* repeated */ Any, R]): Observable_[R]
    def withLatestFrom[T, R](observables: (ObservableInput[Any] | (js.Function1[/* repeated */ Any, R]))*): Observable_[R]
    def withLatestFrom[T, R](project: js.Function1[/* v1 */ T, R]): Observable_[R]
    def withLatestFrom[T, T2](v2: ObservableInput[T2]): Observable_[js.Tuple2[T, T2]]
    def withLatestFrom[T, T2, R](v2: ObservableInput[T2], project: js.Function2[/* v1 */ T, /* v2 */ T2, R]): Observable_[R]
    def withLatestFrom[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable_[js.Tuple3[T, T2, T3]]
    def withLatestFrom[T, T2, T3, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
    ): Observable_[R]
    def withLatestFrom[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable_[js.Tuple4[T, T2, T3, T4]]
    def withLatestFrom[T, T2, T3, T4, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
    ): Observable_[R]
    def withLatestFrom[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable_[js.Tuple5[T, T2, T3, T4, T5]]
    def withLatestFrom[T, T2, T3, T4, T5, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
    ): Observable_[R]
    def withLatestFrom[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6]
    ): Observable_[js.Tuple6[T, T2, T3, T4, T5, T6]]
    def withLatestFrom[T, T2, T3, T4, T5, T6, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
    ): Observable_[R]
    @JSName("withLatestFrom")
    var withLatestFrom_Original: Fn20
    
    def zip[T](observables: ObservableInput[T]*): Observable_[js.Array[T]]
    def zip[T, R](array: js.Array[ObservableInput[T]]): Observable_[R]
    def zip[T, R](project: js.Function1[/* v1 */ T, R]): Observable_[R]
    def zip[T, T2](v2: ObservableInput[T2]): Observable_[js.Tuple2[T, T2]]
    def zip[T, TOther, R](
      array: js.Array[ObservableInput[TOther]],
      project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
    ): Observable_[R]
    def zip[T, T2, R](v2: ObservableInput[T2], project: js.Function2[/* v1 */ T, /* v2 */ T2, R]): Observable_[R]
    def zip[T, T2, T3](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable_[js.Tuple3[T, T2, T3]]
    def zip[T, T2, T3, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
    ): Observable_[R]
    def zip[T, T2, T3, T4](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable_[js.Tuple4[T, T2, T3, T4]]
    def zip[T, T2, T3, T4, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
    ): Observable_[R]
    def zip[T, T2, T3, T4, T5](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable_[js.Tuple5[T, T2, T3, T4, T5]]
    def zip[T, T2, T3, T4, T5, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
    ): Observable_[R]
    def zip[T, T2, T3, T4, T5, T6](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6]
    ): Observable_[js.Tuple6[T, T2, T3, T4, T5, T6]]
    def zip[T, T2, T3, T4, T5, T6, R](
      v2: ObservableInput[T2],
      v3: ObservableInput[T3],
      v4: ObservableInput[T4],
      v5: ObservableInput[T5],
      v6: ObservableInput[T6],
      project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
    ): Observable_[R]
    
    def zipAll[T](): Observable_[js.Array[T]]
    def zipAll[R](project: js.Function1[/* repeated */ Any, R]): Observable_[R]
    @JSName("zipAll")
    var zipAll_Original: FnCallThisProject
    @JSName("zipAll")
    def zipAll_TR[T, R](): Observable_[js.Array[R]]
    @JSName("zipAll")
    def zipAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): Observable_[R]
    
    @JSName("zip")
    var zip_Original: Fn21
    @JSName("zip")
    def zip_TR[T, R](observables: (ObservableInput[T] | (js.Function1[/* repeated */ T, R]))*): Observable_[R]
  }
  object Observable {
    
    inline def apply[T](
      _catch: FnCallThisSelector,
      _do: FnCallThisNextErrorComplete,
      _finally: FnCallThisCallback,
      _switch: FnCallThis,
      audit: FnCall,
      auditTime: FnCallThisDurationScheduler,
      buffer: FnCallThisClosingNotifier,
      bufferCount: FnCallThisBufferSizeStartBufferEvery,
      bufferTime: FnCallThisBufferTimeSpanBufferCreationIntervalMaxBufferSizeScheduler,
      bufferToggle: FnCallThisOpeningsClosingSelector,
      bufferWhen: FnCallThisClosingSelector,
      `catch`: FnCallThisSelector,
      combineAll: FnCallThisProject,
      combineLatest: FnCallThisV2V3V4V5V6Project,
      concat: FnCallThisV2V3V4V5V6Scheduler,
      concatAll: FnCallThis,
      concatMap: Fn0,
      concatMapTo: FnCallThisInnerObservable,
      count: FnCallThisPredicate,
      debounce: FnCall,
      debounceTime: FnCallThisDueTimeScheduler,
      defaultIfEmpty: FnCallThisDefaultValue,
      delay: FnCallThisDelayScheduler,
      delayWhen: FnCallThisDelayDurationSelectorSubscriptionDelay,
      dematerialize: Fn1,
      distinct: FnCallThisKeySelectorFlushes,
      distinctUntilChanged: FnCallThisCompareKeySelector,
      distinctUntilKeyChanged: FnCallThisKeyCompare,
      `do`: FnCallThisNextErrorComplete,
      elementAt: FnCallThisIndexDefaultValue,
      every: FnCallThisPredicateThisArg,
      exhaust: FnCallThis,
      exhaustMap: Fn0,
      expand: FnCallThisProjectConcurrentScheduler,
      filter: Fn2,
      `finally`: FnCallThisCallback,
      find: Fn3,
      findIndex: Fn4,
      first: FnCallThisPredicateDefaultValue,
      flatMap: FnCallThisProjectConcurrent,
      flatMapTo: FnCallThisInnerObservableConcurrent,
      groupBy: FnCallThisKeySelectorElementSelectorDurationSelectorSubjectSelector,
      ignoreElements: js.ThisFunction0[/* this */ Observable_[Any], Observable_[scala.Nothing]],
      isEmpty: Fn5,
      last: FnCallThisPredicateDefaultValue,
      let: FnCallThisFunc,
      letBind: FnCallThisFunc,
      map: FnCallThisProjectThisArg,
      mapTo: FnCallThisValue,
      materialize: Fn6,
      max: FnCallThisComparer,
      merge: FnCallThisV2V3V4V5V6ConcurrentScheduler,
      mergeAll: FnCallThisConcurrent,
      mergeMap: FnCallThisProjectConcurrent,
      mergeMapTo: FnCallThisInnerObservableConcurrent,
      mergeScan: FnCallThisAccumulatorSeedConcurrent,
      min: FnCallThisComparer,
      multicast: FnCallSubjectFactorySelector,
      observeOn: FnCallThisSchedulerDelay,
      onErrorResumeNext: FnCallThisV2V3V4V5V6,
      pairwise: Fn7,
      partition: Fn8,
      pluck: FnCallThisProperties,
      publish: Fn9,
      publishBehavior: Fn10,
      publishLast: Fn11,
      publishReplay: FnCallThisBufferSizeWindowTimeSelectorScheduler,
      race: FnCallThisObservables,
      reduce: FnCallThisAccumulatorSeed,
      repeat: FnCallThisCount,
      repeatWhen: FnCallThisNotifier,
      retry: FnCallThisCount,
      retryWhen: FnCallThisNotifier,
      sample: Fn12,
      sampleTime: FnCallThisPeriodScheduler,
      scan: FnCallThisAccumulatorSeed,
      sequenceEqual: FnCallThisCompareToComparor,
      share: Fn13,
      shareReplay: FnCallThisBufferSizeWindowTimeScheduler,
      single: Fn14,
      skip: Fn15,
      skipLast: Fn15,
      skipUntil: Fn12,
      skipWhile: Fn16,
      startWith: FnCallThisV1V2V3V4V5V6Scheduler,
      subscribeOn: FnCallThisSchedulerDelay,
      switch: FnCallThis,
      switchMap: Fn0,
      switchMapTo: FnCallThisObservableResultSelector,
      take: Fn15,
      takeLast: Fn15,
      takeUntil: Fn12,
      takeWhile: Fn16,
      throttle: FnCallThisDurationSelectorConfig,
      throttleTime: FnCallThisDurationSchedulerConfig,
      timeInterval: FnCallThisScheduler,
      timeout: FnCallThisDueScheduler,
      timeoutWith: FnCallThisDueWithObservableScheduler,
      timestamp: FnCallThisScheduler,
      toArray: Fn17,
      window: FnCallThisWindowBoundaries,
      windowCount: FnCallThisWindowSizeStartWindowEvery,
      windowTime: FnCallThisWindowTimeSpanWindowCreationIntervalMaxWindowSizeScheduler,
      windowToggle: Fn18,
      windowWhen: Fn19,
      withLatestFrom: Fn20,
      zip: Fn21,
      zipAll: FnCallThisProject
    ): Observable[T] = {
      val __obj = js.Dynamic.literal(_catch = _catch.asInstanceOf[js.Any], _do = _do.asInstanceOf[js.Any], _finally = _finally.asInstanceOf[js.Any], _switch = _switch.asInstanceOf[js.Any], audit = audit.asInstanceOf[js.Any], auditTime = auditTime.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], bufferCount = bufferCount.asInstanceOf[js.Any], bufferTime = bufferTime.asInstanceOf[js.Any], bufferToggle = bufferToggle.asInstanceOf[js.Any], bufferWhen = bufferWhen.asInstanceOf[js.Any], combineAll = combineAll.asInstanceOf[js.Any], combineLatest = combineLatest.asInstanceOf[js.Any], concat = concat.asInstanceOf[js.Any], concatAll = concatAll.asInstanceOf[js.Any], concatMap = concatMap.asInstanceOf[js.Any], concatMapTo = concatMapTo.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], debounce = debounce.asInstanceOf[js.Any], debounceTime = debounceTime.asInstanceOf[js.Any], defaultIfEmpty = defaultIfEmpty.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], delayWhen = delayWhen.asInstanceOf[js.Any], dematerialize = dematerialize.asInstanceOf[js.Any], distinct = distinct.asInstanceOf[js.Any], distinctUntilChanged = distinctUntilChanged.asInstanceOf[js.Any], distinctUntilKeyChanged = distinctUntilKeyChanged.asInstanceOf[js.Any], elementAt = elementAt.asInstanceOf[js.Any], every = every.asInstanceOf[js.Any], exhaust = exhaust.asInstanceOf[js.Any], exhaustMap = exhaustMap.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], findIndex = findIndex.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], flatMap = flatMap.asInstanceOf[js.Any], flatMapTo = flatMapTo.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any], ignoreElements = ignoreElements.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], let = let.asInstanceOf[js.Any], letBind = letBind.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mapTo = mapTo.asInstanceOf[js.Any], materialize = materialize.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], mergeAll = mergeAll.asInstanceOf[js.Any], mergeMap = mergeMap.asInstanceOf[js.Any], mergeMapTo = mergeMapTo.asInstanceOf[js.Any], mergeScan = mergeScan.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], multicast = multicast.asInstanceOf[js.Any], observeOn = observeOn.asInstanceOf[js.Any], onErrorResumeNext = onErrorResumeNext.asInstanceOf[js.Any], pairwise = pairwise.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], pluck = pluck.asInstanceOf[js.Any], publish = publish.asInstanceOf[js.Any], publishBehavior = publishBehavior.asInstanceOf[js.Any], publishLast = publishLast.asInstanceOf[js.Any], publishReplay = publishReplay.asInstanceOf[js.Any], race = race.asInstanceOf[js.Any], reduce = reduce.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], repeatWhen = repeatWhen.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], retryWhen = retryWhen.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any], sampleTime = sampleTime.asInstanceOf[js.Any], scan = scan.asInstanceOf[js.Any], sequenceEqual = sequenceEqual.asInstanceOf[js.Any], share = share.asInstanceOf[js.Any], shareReplay = shareReplay.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], skipLast = skipLast.asInstanceOf[js.Any], skipUntil = skipUntil.asInstanceOf[js.Any], skipWhile = skipWhile.asInstanceOf[js.Any], startWith = startWith.asInstanceOf[js.Any], subscribeOn = subscribeOn.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], switchMap = switchMap.asInstanceOf[js.Any], switchMapTo = switchMapTo.asInstanceOf[js.Any], take = take.asInstanceOf[js.Any], takeLast = takeLast.asInstanceOf[js.Any], takeUntil = takeUntil.asInstanceOf[js.Any], takeWhile = takeWhile.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any], throttleTime = throttleTime.asInstanceOf[js.Any], timeInterval = timeInterval.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], timeoutWith = timeoutWith.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], toArray = toArray.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any], windowCount = windowCount.asInstanceOf[js.Any], windowTime = windowTime.asInstanceOf[js.Any], windowToggle = windowToggle.asInstanceOf[js.Any], windowWhen = windowWhen.asInstanceOf[js.Any], withLatestFrom = withLatestFrom.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any], zipAll = zipAll.asInstanceOf[js.Any])
      __obj.updateDynamic("catch")(`catch`.asInstanceOf[js.Any])
      __obj.updateDynamic("do")(`do`.asInstanceOf[js.Any])
      __obj.updateDynamic("finally")(`finally`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Observable[T]]
    }
    
    @JSImport("rxjs/internal/Observable", "Observable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/internal/Observable", "Observable.ajax")
    @js.native
    def ajax: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AjaxCreationMethod */ Any = js.native
    inline def ajax_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AjaxCreationMethod */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ajax")(x.asInstanceOf[js.Any])
    
    /* was `typeof staticBindCallback` */
    inline def bindCallback(
      callbackFunc: js.Function1[/* repeated */ Any, Unit],
      resultSelector: js.Function1[/* repeated */ Any, Any]
    ): js.Function1[/* repeated */ Any, typings.rxjs.distTypesInternalObservableMod.Observable[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, typings.rxjs.distTypesInternalObservableMod.Observable[Any]]]
    /* was `typeof staticBindCallback` */
    inline def bindCallback(
      callbackFunc: js.Function1[/* repeated */ Any, Unit],
      resultSelector: js.Function1[/* repeated */ Any, Any],
      scheduler: SchedulerLike
    ): js.Function1[/* repeated */ Any, typings.rxjs.distTypesInternalObservableMod.Observable[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, typings.rxjs.distTypesInternalObservableMod.Observable[Any]]]
    /* was `typeof staticBindCallback` */
    inline def bindCallback[A /* <: js.Array[Any] */, R /* <: js.Array[Any] */](
      callbackFunc: js.Function1[
          /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
          Unit
        ]
    ): js.Function1[
        /* arg */ A, 
        typings.rxjs.distTypesInternalObservableMod.Observable[
          /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* arg */ A, 
        typings.rxjs.distTypesInternalObservableMod.Observable[
          /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
        ]
      ]]
    /* was `typeof staticBindCallback` */
    inline def bindCallback[A /* <: js.Array[Any] */, R /* <: js.Array[Any] */](
      callbackFunc: js.Function1[
          /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
          Unit
        ],
      schedulerLike: SchedulerLike
    ): js.Function1[
        /* arg */ A, 
        typings.rxjs.distTypesInternalObservableMod.Observable[
          /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callbackFunc.asInstanceOf[js.Any], schedulerLike.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
        /* arg */ A, 
        typings.rxjs.distTypesInternalObservableMod.Observable[
          /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
        ]
      ]]
    
    /* was `typeof staticBindNodeCallback` */
    inline def bindNodeCallback(
      callbackFunc: js.Function1[/* repeated */ Any, Unit],
      resultSelector: js.Function1[/* repeated */ Any, Any]
    ): js.Function1[/* repeated */ Any, typings.rxjs.distTypesInternalObservableMod.Observable[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, typings.rxjs.distTypesInternalObservableMod.Observable[Any]]]
    /* was `typeof staticBindNodeCallback` */
    inline def bindNodeCallback(
      callbackFunc: js.Function1[/* repeated */ Any, Unit],
      resultSelector: js.Function1[/* repeated */ Any, Any],
      scheduler: SchedulerLike
    ): js.Function1[/* repeated */ Any, typings.rxjs.distTypesInternalObservableMod.Observable[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, typings.rxjs.distTypesInternalObservableMod.Observable[Any]]]
    /* was `typeof staticBindNodeCallback` */
    inline def bindNodeCallback[A /* <: js.Array[Any] */, R /* <: js.Array[Any] */](
      callbackFunc: js.Function1[
          /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
          Unit
        ]
    ): js.Function1[
        /* arg */ A, 
        typings.rxjs.distTypesInternalObservableMod.Observable[
          /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* arg */ A, 
        typings.rxjs.distTypesInternalObservableMod.Observable[
          /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
        ]
      ]]
    /* was `typeof staticBindNodeCallback` */
    inline def bindNodeCallback[A /* <: js.Array[Any] */, R /* <: js.Array[Any] */](
      callbackFunc: js.Function1[
          /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
          Unit
        ],
      schedulerLike: SchedulerLike
    ): js.Function1[
        /* arg */ A, 
        typings.rxjs.distTypesInternalObservableMod.Observable[
          /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], schedulerLike.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
        /* arg */ A, 
        typings.rxjs.distTypesInternalObservableMod.Observable[
          /* import warning: importer.ImportType#apply Failed type conversion: R extends [] ? void : R extends [any] ? R[0] : R */ js.Any
        ]
      ]]
    
    /* was `typeof combineLatestStatic` */
    inline def combineLatest(
      sourcesObject: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any ]: never} */ js.Any
    ): typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sourcesObject.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing]]
    /* was `typeof combineLatestStatic` */
    inline def combineLatest(sources: js.Array[Any]): typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing]]
    /* was `typeof combineLatestStatic` */
    inline def combineLatest[T /* <: AnyCatcher */](arg: T): typings.rxjs.distTypesInternalObservableMod.Observable[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(arg.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Any]]
    /* was `typeof combineLatestStatic` */
    inline def combineLatest[A /* <: js.Array[Any] */](
      sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
        ],
      scheduler: SchedulerLike
    ): typings.rxjs.distTypesInternalObservableMod.Observable[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[A]]
    /* was `typeof combineLatestStatic` */
    inline def combineLatest[A /* <: js.Array[Any] */, R](
      sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
        ],
      resultSelector: js.Function1[/* values */ A, R]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[R]]
    /* was `typeof combineLatestStatic` */
    inline def combineLatest[A /* <: js.Array[Any] */, R](
      sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
        ],
      resultSelector: js.Function1[/* values */ A, R],
      scheduler: SchedulerLike
    ): typings.rxjs.distTypesInternalObservableMod.Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[R]]
    
    /* was `typeof combineLatestStatic` */
    inline def combineLatest_A[A /* <: js.Array[Any] */](
      sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
        ]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[A]]
    
    /* was `typeof combineLatestStatic` */
    inline def combineLatest_AR[A /* <: js.Array[Any] */, R](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sourcesAndResultSelectorAndScheduler because its type [...ObservableInputTuple<A>, (values : A): R, SchedulerLike] is not an array type */ sourcesAndResultSelectorAndScheduler: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
        ]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sourcesAndResultSelectorAndScheduler.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[R]]
    
    /* was `typeof concatStatic` */
    inline def concat[T /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param inputs because its type [...ObservableInputTuple<T>] is not an array type */ inputs: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<T[K]>} */ js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<T[K]>} */ js.Any
        ]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(inputs.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
      ]]
    
    /* was `typeof staticDefer` */
    inline def defer[R /* <: ObservableInput[Any] */](observableFactory: js.Function0[R]): typings.rxjs.distTypesInternalObservableMod.Observable[ObservedValueOf[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(observableFactory.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[ObservedValueOf[R]]]
    
    /* was `typeof staticEmpty` */
    inline def empty(): typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing]]
    /* was `typeof staticEmpty` */
    inline def empty(scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(scheduler.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing]]
    
    /* was `typeof staticForkJoin` */
    inline def forkJoin(): typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")().asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing]]
    /* was `typeof staticForkJoin` */
    inline def forkJoin(
      sourcesObject: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any ]: never} */ js.Any
    ): typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sourcesObject.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing]]
    /* was `typeof staticForkJoin` */
    inline def forkJoin(sources: js.Array[Any]): typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing]]
    /* was `typeof staticForkJoin` */
    inline def forkJoin[T /* <: AnyCatcher */](arg: T): typings.rxjs.distTypesInternalObservableMod.Observable[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(arg.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Any]]
    /* was `typeof staticForkJoin` */
    inline def forkJoin[A /* <: js.Array[Any] */, R](
      sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
        ],
      resultSelector: js.Function1[/* values */ A, R]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[R]]
    
    /* was `typeof staticForkJoin` */
    inline def forkJoin_A[A /* <: js.Array[Any] */](
      sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
        ]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sources.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[A]]
    
    /* was `typeof staticForkJoin` */
    inline def forkJoin_AR[A /* <: js.Array[Any] */, R](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sourcesAndResultSelector because its type [...ObservableInputTuple<A>, (values : A): R] is not an array type */ sourcesAndResultSelector: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
        ]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("forkJoin")(sourcesAndResultSelector.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[R]]
    
    /* was `typeof staticFrom` */
    inline def from[O /* <: ObservableInput[Any] */](input: O): typings.rxjs.distTypesInternalObservableMod.Observable[ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[ObservedValueOf[O]]]
    /* was `typeof staticFrom` */
    inline def from[O /* <: ObservableInput[Any] */](input: O, scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[ObservedValueOf[O]]]
    
    /* was `typeof staticFromEvent` */
    inline def fromEvent(target: NodeCompatibleEventEmitter, eventName: String): typings.rxjs.distTypesInternalObservableMod.Observable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Any]]
    /* was `typeof staticFromEvent` */
    inline def fromEvent(target: NodeStyleEventEmitter, eventName: String): typings.rxjs.distTypesInternalObservableMod.Observable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Any]]
    /* was `typeof staticFromEvent` */
    inline def fromEvent(target: ArrayLike[NodeCompatibleEventEmitter | NodeStyleEventEmitter], eventName: String): typings.rxjs.distTypesInternalObservableMod.Observable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Any]]
    /* was `typeof staticFromEvent` */
    inline def fromEvent[T](target: HasEventTargetAddRemove[T], eventName: String): typings.rxjs.distTypesInternalObservableMod.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[T]]
    /* was `typeof staticFromEvent` */
    inline def fromEvent[T](target: HasEventTargetAddRemove[T], eventName: String, options: EventListenerOptions): typings.rxjs.distTypesInternalObservableMod.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[T]]
    /* was `typeof staticFromEvent` */
    inline def fromEvent[T](target: JQueryStyleEventEmitter[Any, T], eventName: String): typings.rxjs.distTypesInternalObservableMod.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[T]]
    /* was `typeof staticFromEvent` */
    inline def fromEvent[R](
      target: NodeCompatibleEventEmitter,
      eventName: String,
      resultSelector: js.Function1[/* repeated */ Any, R]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[R]]
    /* was `typeof staticFromEvent` */
    inline def fromEvent[R](
      target: NodeStyleEventEmitter,
      eventName: String,
      resultSelector: js.Function1[/* repeated */ Any, R]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[R]]
    /* was `typeof staticFromEvent` */
    inline def fromEvent[T](target: ArrayLike[HasEventTargetAddRemove[T]], eventName: String, options: EventListenerOptions): typings.rxjs.distTypesInternalObservableMod.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[T]]
    /* was `typeof staticFromEvent` */
    inline def fromEvent[R](
      target: ArrayLike[NodeCompatibleEventEmitter | NodeStyleEventEmitter],
      eventName: String,
      resultSelector: js.Function1[/* repeated */ Any, R]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[R]]
    /* was `typeof staticFromEvent` */
    inline def fromEvent[T, R](
      target: HasEventTargetAddRemove[T],
      eventName: String,
      options: EventListenerOptions,
      resultSelector: js.Function1[/* event */ T, R]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[R]]
    /* was `typeof staticFromEvent` */
    inline def fromEvent[T, R](
      target: HasEventTargetAddRemove[T],
      eventName: String,
      resultSelector: js.Function1[/* event */ T, R]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[R]]
    /* was `typeof staticFromEvent` */
    inline def fromEvent[T, R](
      target: JQueryStyleEventEmitter[Any, T],
      eventName: String,
      resultSelector: js.Function2[/* value */ T, /* repeated */ Any, R]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[R]]
    /* was `typeof staticFromEvent` */
    inline def fromEvent[T, R](
      target: ArrayLike[HasEventTargetAddRemove[T]],
      eventName: String,
      options: EventListenerOptions,
      resultSelector: js.Function1[/* event */ T, R]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[R]]
    /* was `typeof staticFromEvent` */
    inline def fromEvent[T, R](
      target: ArrayLike[JQueryStyleEventEmitter[Any, T]],
      eventName: String,
      resultSelector: js.Function2[/* value */ T, /* repeated */ Any, R]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[R]]
    
    /* was `typeof staticFromEventPattern` */
    inline def fromEventPattern[T](addHandler: js.Function1[/* handler */ NodeEventHandler, Any]): typings.rxjs.distTypesInternalObservableMod.Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[T]]
    /* was `typeof staticFromEventPattern` */
    inline def fromEventPattern[T](
      addHandler: js.Function1[/* handler */ NodeEventHandler, Any],
      removeHandler: js.Function2[/* handler */ NodeEventHandler, /* signal */ js.UndefOr[Any], Unit]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[T]]
    /* was `typeof staticFromEventPattern` */
    inline def fromEventPattern[T](
      addHandler: js.Function1[/* handler */ NodeEventHandler, Any],
      removeHandler: js.Function2[/* handler */ NodeEventHandler, /* signal */ js.UndefOr[Any], Unit],
      resultSelector: js.Function1[/* repeated */ Any, T]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[T]]
    /* was `typeof staticFromEventPattern` */
    inline def fromEventPattern[T](
      addHandler: js.Function1[/* handler */ NodeEventHandler, Any],
      removeHandler: Unit,
      resultSelector: js.Function1[/* repeated */ Any, T]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventPattern")(addHandler.asInstanceOf[js.Any], removeHandler.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[T]]
    
    /* was `typeof staticFromEvent` */
    inline def fromEvent_T[T](target: NodeCompatibleEventEmitter, eventName: String): typings.rxjs.distTypesInternalObservableMod.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[T]]
    /* was `typeof staticFromEvent` */
    inline def fromEvent_T[T](target: NodeStyleEventEmitter, eventName: String): typings.rxjs.distTypesInternalObservableMod.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[T]]
    /* was `typeof staticFromEvent` */
    inline def fromEvent_T[T](
      target: ArrayLike[
          HasEventTargetAddRemove[T] | (JQueryStyleEventEmitter[Any, T]) | NodeCompatibleEventEmitter | NodeStyleEventEmitter
        ],
      eventName: String
    ): typings.rxjs.distTypesInternalObservableMod.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[T]]
    
    /* was `typeof staticFromEvent` */
    inline def fromEvent_TR[T, R](
      target: ArrayLike[HasEventTargetAddRemove[T]],
      eventName: String,
      resultSelector: js.Function1[/* event */ T, R]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[R]]
    
    @JSImport("rxjs/internal/Observable", "Observable.fromPromise")
    @js.native
    def fromPromise: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFromPromise */ Any = js.native
    inline def fromPromise_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFromPromise */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromPromise")(x.asInstanceOf[js.Any])
    
    /* was `typeof staticGenerate` */
    inline def generate[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S]): typings.rxjs.distTypesInternalObservableMod.Observable[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[S]]
    /* was `typeof staticGenerate` */
    inline def generate[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S], scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[S]]
    /* was `typeof staticGenerate` */
    inline def generate[S](options: GenerateBaseOptions[S]): typings.rxjs.distTypesInternalObservableMod.Observable[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[S]]
    /* was `typeof staticGenerate` */
    inline def generate[T, S](
      initialState: S,
      condition: ConditionFunc[S],
      iterate: IterateFunc[S],
      resultSelector: ResultFunc[S, T]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[T]]
    /* was `typeof staticGenerate` */
    inline def generate[T, S](
      initialState: S,
      condition: ConditionFunc[S],
      iterate: IterateFunc[S],
      resultSelector: ResultFunc[S, T],
      scheduler: SchedulerLike
    ): typings.rxjs.distTypesInternalObservableMod.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(initialState.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], iterate.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[T]]
    /* was `typeof staticGenerate` */
    inline def generate[T, S](options: GenerateOptions[T, S]): typings.rxjs.distTypesInternalObservableMod.Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[T]]
    
    /* was `typeof staticInterval` */
    inline def interval(): typings.rxjs.distTypesInternalObservableMod.Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")().asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Double]]
    /* was `typeof staticInterval` */
    inline def interval(period: Double): typings.rxjs.distTypesInternalObservableMod.Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")(period.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Double]]
    /* was `typeof staticInterval` */
    inline def interval(period: Double, scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Double]]
    /* was `typeof staticInterval` */
    inline def interval(period: Unit, scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Double]]
    
    /* was `typeof mergeStatic` */
    inline def merge[A /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sources because its type [...ObservableInputTuple<A>] is not an array type */ sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
        ]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[
        /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(sources.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[
        /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
      ]]
    
    @JSImport("rxjs/internal/Observable", "Observable.never")
    @js.native
    def never: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticNever */ Any = js.native
    inline def never_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticNever */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("never")(x.asInstanceOf[js.Any])
    
    /* was `typeof staticOf` */
    inline def of(): typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")().asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing]]
    /* was `typeof staticOf` */
    inline def of(scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(scheduler.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing]]
    /* was `typeof staticOf` */
    inline def of(value: Null): typings.rxjs.distTypesInternalObservableMod.Observable[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Null]]
    /* was `typeof staticOf` */
    inline def of(value: Unit): typings.rxjs.distTypesInternalObservableMod.Observable[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Unit]]
    /* was `typeof staticOf` */
    inline def of[A /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
    ): typings.rxjs.distTypesInternalObservableMod.Observable[ValueFromArray[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[ValueFromArray[A]]]
    /* was `typeof staticOf` */
    inline def of[A /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param valuesAndScheduler because its type [...A, SchedulerLike] is not an array type */ valuesAndScheduler: /* import warning: importer.ImportType#apply c repeated non-array type: A */ js.Array[A]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[ValueFromArray[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(valuesAndScheduler.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[ValueFromArray[A]]]
    
    /* was `typeof staticOf` */
    inline def of_T[T](): typings.rxjs.distTypesInternalObservableMod.Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")().asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[T]]
    /* was `typeof staticOf` */
    inline def of_T[T](value: T): typings.rxjs.distTypesInternalObservableMod.Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[T]]
    
    /* was `typeof staticOnErrorResumeNext` */
    inline def onErrorResumeNext[A /* <: js.Array[Any] */](
      sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
        ]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[
        /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(sources.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[
        /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
      ]]
    
    /* was `typeof staticPairs` */
    inline def pairs(n: js.BigInt): typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
    /* was `typeof staticPairs` */
    inline def pairs(n: js.BigInt, scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
    /* was `typeof staticPairs` */
    inline def pairs(n: js.Function1[/* repeated */ Any, Any]): typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
    /* was `typeof staticPairs` */
    inline def pairs(n: js.Function1[/* repeated */ Any, Any], scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
    /* was `typeof staticPairs` */
    inline def pairs(n: js.Symbol): typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
    /* was `typeof staticPairs` */
    inline def pairs(n: js.Symbol, scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
    /* was `typeof staticPairs` */
    inline def pairs(n: Boolean): typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
    /* was `typeof staticPairs` */
    inline def pairs(n: Boolean, scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
    /* was `typeof staticPairs` */
    inline def pairs(n: Double): typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
    /* was `typeof staticPairs` */
    inline def pairs(n: Double, scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(n.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[scala.Nothing, scala.Nothing]]]
    /* was `typeof staticPairs` */
    inline def pairs[T](arr: js.Array[T]): typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(arr.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[String, T]]]
    /* was `typeof staticPairs` */
    inline def pairs[T](arr: js.Array[T], scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[String, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(arr.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[String, T]]]
    /* was `typeof staticPairs` */
    inline def pairs[T](iterable: js.Iterable[T]): typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[String, T]]]
    /* was `typeof staticPairs` */
    inline def pairs[T](iterable: js.Iterable[T], scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[String, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(iterable.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[js.Tuple2[String, T]]]
    /* was `typeof staticPairs` */
    inline def pairs[O /* <: Record[String, Any] */](obj: O): typings.rxjs.distTypesInternalObservableMod.Observable[
        js.Tuple2[
          /* keyof O */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[
        js.Tuple2[
          /* keyof O */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
        ]
      ]]
    /* was `typeof staticPairs` */
    inline def pairs[O /* <: Record[String, Any] */](obj: O, scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[
        js.Tuple2[
          /* keyof O */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(obj.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[
        js.Tuple2[
          /* keyof O */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
        ]
      ]]
    
    /* was `typeof staticRace` */
    inline def race[T /* <: js.Array[Any] */](
      inputs: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<T[K]>} */ js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<T[K]>} */ js.Any
        ]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(inputs.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
      ]]
    
    /* was `typeof staticRange` */
    inline def range(start: Double): typings.rxjs.distTypesInternalObservableMod.Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Double]]
    /* was `typeof staticRange` */
    inline def range(start: Double, count: Double): typings.rxjs.distTypesInternalObservableMod.Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Double]]
    /* was `typeof staticRange` */
    inline def range(start: Double, count: Double, scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Double]]
    /* was `typeof staticRange` */
    inline def range(start: Double, count: Unit, scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Double]]
    
    /* was `typeof staticThrowError` */
    inline def throwError(errorFactory: js.Function0[Any]): typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(errorFactory.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing]]
    /* was `typeof staticThrowError` */
    inline def throwError(errorOrErrorFactory: Any, scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(errorOrErrorFactory.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing]]
    /* was `typeof staticThrowError` */
    inline def throwError(error: Any): typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("throwError")(error.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[scala.Nothing]]
    
    /* was `typeof staticTimer` */
    inline def timer(dueTime: js.Date, unused: Unit, scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], unused.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[`0`]]
    /* was `typeof staticTimer` */
    inline def timer(dueTime: Double, unused: Unit, scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], unused.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[`0`]]
    /* was `typeof staticTimer` */
    inline def timer(due: js.Date): typings.rxjs.distTypesInternalObservableMod.Observable[`0`] = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")(due.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[`0`]]
    /* was `typeof staticTimer` */
    inline def timer(due: js.Date, scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[`0`]]
    /* was `typeof staticTimer` */
    inline def timer(due: Double): typings.rxjs.distTypesInternalObservableMod.Observable[`0`] = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")(due.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[`0`]]
    /* was `typeof staticTimer` */
    inline def timer(due: Double, scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[`0`]]
    /* was `typeof staticTimer` */
    inline def timer(startDue: js.Date, intervalDuration: Double): typings.rxjs.distTypesInternalObservableMod.Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(startDue.asInstanceOf[js.Any], intervalDuration.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Double]]
    /* was `typeof staticTimer` */
    inline def timer(startDue: js.Date, intervalDuration: Double, scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(startDue.asInstanceOf[js.Any], intervalDuration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Double]]
    /* was `typeof staticTimer` */
    inline def timer(startDue: Double, intervalDuration: Double): typings.rxjs.distTypesInternalObservableMod.Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(startDue.asInstanceOf[js.Any], intervalDuration.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Double]]
    /* was `typeof staticTimer` */
    inline def timer(startDue: Double, intervalDuration: Double, scheduler: SchedulerLike): typings.rxjs.distTypesInternalObservableMod.Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(startDue.asInstanceOf[js.Any], intervalDuration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[Double]]
    
    /* was `typeof staticUsing` */
    inline def `using`[T /* <: ObservableInput[Any] */](
      resourceFactory: js.Function0[Unsubscribable | Unit],
      observableFactory: js.Function1[/* resource */ Unsubscribable | Unit, T | Unit]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[ObservedValueOf[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("using")(resourceFactory.asInstanceOf[js.Any], observableFactory.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[ObservedValueOf[T]]]
    
    /* was `typeof staticWebSocket` */
    inline def webSocket[T](urlConfigOrSource: String): WebSocketSubject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("webSocket")(urlConfigOrSource.asInstanceOf[js.Any]).asInstanceOf[WebSocketSubject[T]]
    /* was `typeof staticWebSocket` */
    inline def webSocket[T](urlConfigOrSource: WebSocketSubjectConfig[T]): WebSocketSubject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("webSocket")(urlConfigOrSource.asInstanceOf[js.Any]).asInstanceOf[WebSocketSubject[T]]
    
    /* was `typeof zipStatic` */
    inline def zip[A /* <: js.Array[Any] */](
      sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
        ]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(sources.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[A]]
    /* was `typeof zipStatic` */
    inline def zip[A /* <: js.Array[Any] */, R](
      sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
        ],
      resultSelector: js.Function1[/* values */ A, R]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[R]]
    
    /* was `typeof zipStatic` */
    inline def zip_AR[A /* <: js.Array[Any] */, R](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sourcesAndResultSelector because its type [...ObservableInputTuple<A>, (values : A): R] is not an array type */ sourcesAndResultSelector: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
        ]
    ): typings.rxjs.distTypesInternalObservableMod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(sourcesAndResultSelector.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalObservableMod.Observable[R]]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Observable[?], T] (val x: Self & Observable[T]) extends AnyVal {
      
      inline def setAudit(value: FnCall): Self = StObject.set(x, "audit", value.asInstanceOf[js.Any])
      
      inline def setAuditTime(value: FnCallThisDurationScheduler): Self = StObject.set(x, "auditTime", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: FnCallThisClosingNotifier): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferCount(value: FnCallThisBufferSizeStartBufferEvery): Self = StObject.set(x, "bufferCount", value.asInstanceOf[js.Any])
      
      inline def setBufferTime(value: FnCallThisBufferTimeSpanBufferCreationIntervalMaxBufferSizeScheduler): Self = StObject.set(x, "bufferTime", value.asInstanceOf[js.Any])
      
      inline def setBufferToggle(value: FnCallThisOpeningsClosingSelector): Self = StObject.set(x, "bufferToggle", value.asInstanceOf[js.Any])
      
      inline def setBufferWhen(value: FnCallThisClosingSelector): Self = StObject.set(x, "bufferWhen", value.asInstanceOf[js.Any])
      
      inline def setCatch(value: FnCallThisSelector): Self = StObject.set(x, "catch", value.asInstanceOf[js.Any])
      
      inline def setCombineAll(value: FnCallThisProject): Self = StObject.set(x, "combineAll", value.asInstanceOf[js.Any])
      
      inline def setCombineLatest(value: FnCallThisV2V3V4V5V6Project): Self = StObject.set(x, "combineLatest", value.asInstanceOf[js.Any])
      
      inline def setConcat(value: FnCallThisV2V3V4V5V6Scheduler): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
      
      inline def setConcatAll(value: FnCallThis): Self = StObject.set(x, "concatAll", value.asInstanceOf[js.Any])
      
      inline def setConcatMap(value: Fn0): Self = StObject.set(x, "concatMap", value.asInstanceOf[js.Any])
      
      inline def setConcatMapTo(value: FnCallThisInnerObservable): Self = StObject.set(x, "concatMapTo", value.asInstanceOf[js.Any])
      
      inline def setCount(value: FnCallThisPredicate): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setDebounce(value: FnCall): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      inline def setDebounceTime(value: FnCallThisDueTimeScheduler): Self = StObject.set(x, "debounceTime", value.asInstanceOf[js.Any])
      
      inline def setDefaultIfEmpty(value: FnCallThisDefaultValue): Self = StObject.set(x, "defaultIfEmpty", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: FnCallThisDelayScheduler): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayWhen(value: FnCallThisDelayDurationSelectorSubscriptionDelay): Self = StObject.set(x, "delayWhen", value.asInstanceOf[js.Any])
      
      inline def setDematerialize(value: Fn1): Self = StObject.set(x, "dematerialize", value.asInstanceOf[js.Any])
      
      inline def setDistinct(value: FnCallThisKeySelectorFlushes): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
      
      inline def setDistinctUntilChanged(value: FnCallThisCompareKeySelector): Self = StObject.set(x, "distinctUntilChanged", value.asInstanceOf[js.Any])
      
      inline def setDistinctUntilKeyChanged(value: FnCallThisKeyCompare): Self = StObject.set(x, "distinctUntilKeyChanged", value.asInstanceOf[js.Any])
      
      inline def setDo(value: FnCallThisNextErrorComplete): Self = StObject.set(x, "do", value.asInstanceOf[js.Any])
      
      inline def setElementAt(value: FnCallThisIndexDefaultValue): Self = StObject.set(x, "elementAt", value.asInstanceOf[js.Any])
      
      inline def setEvery(value: FnCallThisPredicateThisArg): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
      
      inline def setExhaust(value: FnCallThis): Self = StObject.set(x, "exhaust", value.asInstanceOf[js.Any])
      
      inline def setExhaustMap(value: Fn0): Self = StObject.set(x, "exhaustMap", value.asInstanceOf[js.Any])
      
      inline def setExpand(value: FnCallThisProjectConcurrentScheduler): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: Fn2): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFinally(value: FnCallThisCallback): Self = StObject.set(x, "finally", value.asInstanceOf[js.Any])
      
      inline def setFind(value: Fn3): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setFindIndex(value: Fn4): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
      
      inline def setFirst(value: FnCallThisPredicateDefaultValue): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFlatMap(value: FnCallThisProjectConcurrent): Self = StObject.set(x, "flatMap", value.asInstanceOf[js.Any])
      
      inline def setFlatMapTo(value: FnCallThisInnerObservableConcurrent): Self = StObject.set(x, "flatMapTo", value.asInstanceOf[js.Any])
      
      inline def setGroupBy(value: FnCallThisKeySelectorElementSelectorDurationSelectorSubjectSelector): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      inline def setIgnoreElements(value: js.ThisFunction0[/* this */ Observable_[Any], Observable_[scala.Nothing]]): Self = StObject.set(x, "ignoreElements", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: Fn5): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setLast(value: FnCallThisPredicateDefaultValue): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLet(value: FnCallThisFunc): Self = StObject.set(x, "let", value.asInstanceOf[js.Any])
      
      inline def setLetBind(value: FnCallThisFunc): Self = StObject.set(x, "letBind", value.asInstanceOf[js.Any])
      
      inline def setMap(value: FnCallThisProjectThisArg): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapTo(value: FnCallThisValue): Self = StObject.set(x, "mapTo", value.asInstanceOf[js.Any])
      
      inline def setMaterialize(value: Fn6): Self = StObject.set(x, "materialize", value.asInstanceOf[js.Any])
      
      inline def setMax(value: FnCallThisComparer): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMerge(value: FnCallThisV2V3V4V5V6ConcurrentScheduler): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setMergeAll(value: FnCallThisConcurrent): Self = StObject.set(x, "mergeAll", value.asInstanceOf[js.Any])
      
      inline def setMergeMap(value: FnCallThisProjectConcurrent): Self = StObject.set(x, "mergeMap", value.asInstanceOf[js.Any])
      
      inline def setMergeMapTo(value: FnCallThisInnerObservableConcurrent): Self = StObject.set(x, "mergeMapTo", value.asInstanceOf[js.Any])
      
      inline def setMergeScan(value: FnCallThisAccumulatorSeedConcurrent): Self = StObject.set(x, "mergeScan", value.asInstanceOf[js.Any])
      
      inline def setMin(value: FnCallThisComparer): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMulticast(value: FnCallSubjectFactorySelector): Self = StObject.set(x, "multicast", value.asInstanceOf[js.Any])
      
      inline def setObserveOn(value: FnCallThisSchedulerDelay): Self = StObject.set(x, "observeOn", value.asInstanceOf[js.Any])
      
      inline def setOnErrorResumeNext(value: FnCallThisV2V3V4V5V6): Self = StObject.set(x, "onErrorResumeNext", value.asInstanceOf[js.Any])
      
      inline def setPairwise(value: Fn7): Self = StObject.set(x, "pairwise", value.asInstanceOf[js.Any])
      
      inline def setPartition(value: Fn8): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      inline def setPluck(value: FnCallThisProperties): Self = StObject.set(x, "pluck", value.asInstanceOf[js.Any])
      
      inline def setPublish(value: Fn9): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
      
      inline def setPublishBehavior(value: Fn10): Self = StObject.set(x, "publishBehavior", value.asInstanceOf[js.Any])
      
      inline def setPublishLast(value: Fn11): Self = StObject.set(x, "publishLast", value.asInstanceOf[js.Any])
      
      inline def setPublishReplay(value: FnCallThisBufferSizeWindowTimeSelectorScheduler): Self = StObject.set(x, "publishReplay", value.asInstanceOf[js.Any])
      
      inline def setRace(value: FnCallThisObservables): Self = StObject.set(x, "race", value.asInstanceOf[js.Any])
      
      inline def setReduce(value: FnCallThisAccumulatorSeed): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
      
      inline def setRepeat(value: FnCallThisCount): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatWhen(value: FnCallThisNotifier): Self = StObject.set(x, "repeatWhen", value.asInstanceOf[js.Any])
      
      inline def setRetry(value: FnCallThisCount): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryWhen(value: FnCallThisNotifier): Self = StObject.set(x, "retryWhen", value.asInstanceOf[js.Any])
      
      inline def setSample(value: Fn12): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
      
      inline def setSampleTime(value: FnCallThisPeriodScheduler): Self = StObject.set(x, "sampleTime", value.asInstanceOf[js.Any])
      
      inline def setScan(value: FnCallThisAccumulatorSeed): Self = StObject.set(x, "scan", value.asInstanceOf[js.Any])
      
      inline def setSequenceEqual(value: FnCallThisCompareToComparor): Self = StObject.set(x, "sequenceEqual", value.asInstanceOf[js.Any])
      
      inline def setShare(value: Fn13): Self = StObject.set(x, "share", value.asInstanceOf[js.Any])
      
      inline def setShareReplay(value: FnCallThisBufferSizeWindowTimeScheduler): Self = StObject.set(x, "shareReplay", value.asInstanceOf[js.Any])
      
      inline def setSingle(value: Fn14): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: Fn15): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipLast(value: Fn15): Self = StObject.set(x, "skipLast", value.asInstanceOf[js.Any])
      
      inline def setSkipUntil(value: Fn12): Self = StObject.set(x, "skipUntil", value.asInstanceOf[js.Any])
      
      inline def setSkipWhile(value: Fn16): Self = StObject.set(x, "skipWhile", value.asInstanceOf[js.Any])
      
      inline def setStartWith(value: FnCallThisV1V2V3V4V5V6Scheduler): Self = StObject.set(x, "startWith", value.asInstanceOf[js.Any])
      
      inline def setSubscribeOn(value: FnCallThisSchedulerDelay): Self = StObject.set(x, "subscribeOn", value.asInstanceOf[js.Any])
      
      inline def setSwitch(value: FnCallThis): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
      
      inline def setSwitchMap(value: Fn0): Self = StObject.set(x, "switchMap", value.asInstanceOf[js.Any])
      
      inline def setSwitchMapTo(value: FnCallThisObservableResultSelector): Self = StObject.set(x, "switchMapTo", value.asInstanceOf[js.Any])
      
      inline def setTake(value: Fn15): Self = StObject.set(x, "take", value.asInstanceOf[js.Any])
      
      inline def setTakeLast(value: Fn15): Self = StObject.set(x, "takeLast", value.asInstanceOf[js.Any])
      
      inline def setTakeUntil(value: Fn12): Self = StObject.set(x, "takeUntil", value.asInstanceOf[js.Any])
      
      inline def setTakeWhile(value: Fn16): Self = StObject.set(x, "takeWhile", value.asInstanceOf[js.Any])
      
      inline def setThrottle(value: FnCallThisDurationSelectorConfig): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleTime(value: FnCallThisDurationSchedulerConfig): Self = StObject.set(x, "throttleTime", value.asInstanceOf[js.Any])
      
      inline def setTimeInterval(value: FnCallThisScheduler): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: FnCallThisDueScheduler): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutWith(value: FnCallThisDueWithObservableScheduler): Self = StObject.set(x, "timeoutWith", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: FnCallThisScheduler): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setToArray(value: Fn17): Self = StObject.set(x, "toArray", value.asInstanceOf[js.Any])
      
      inline def setWindow(value: FnCallThisWindowBoundaries): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowCount(value: FnCallThisWindowSizeStartWindowEvery): Self = StObject.set(x, "windowCount", value.asInstanceOf[js.Any])
      
      inline def setWindowTime(value: FnCallThisWindowTimeSpanWindowCreationIntervalMaxWindowSizeScheduler): Self = StObject.set(x, "windowTime", value.asInstanceOf[js.Any])
      
      inline def setWindowToggle(value: Fn18): Self = StObject.set(x, "windowToggle", value.asInstanceOf[js.Any])
      
      inline def setWindowWhen(value: Fn19): Self = StObject.set(x, "windowWhen", value.asInstanceOf[js.Any])
      
      inline def setWithLatestFrom(value: Fn20): Self = StObject.set(x, "withLatestFrom", value.asInstanceOf[js.Any])
      
      inline def setZip(value: Fn21): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      inline def setZipAll(value: FnCallThisProject): Self = StObject.set(x, "zipAll", value.asInstanceOf[js.Any])
      
      inline def set_catch(value: FnCallThisSelector): Self = StObject.set(x, "_catch", value.asInstanceOf[js.Any])
      
      inline def set_do(value: FnCallThisNextErrorComplete): Self = StObject.set(x, "_do", value.asInstanceOf[js.Any])
      
      inline def set_finally(value: FnCallThisCallback): Self = StObject.set(x, "_finally", value.asInstanceOf[js.Any])
      
      inline def set_switch(value: FnCallThis): Self = StObject.set(x, "_switch", value.asInstanceOf[js.Any])
    }
  }
}
