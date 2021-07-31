package typings.rxjsCompat

import typings.rxjsCompat.anon.Fn0
import typings.rxjsCompat.anon.Fn1
import typings.rxjsCompat.anon.Fn10
import typings.rxjsCompat.anon.Fn2
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
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalObservableMod {
  
  trait Observable[T] extends StObject {
    
    def _catch[T, R](
      selector: js.Function2[
          /* err */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* caught */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
        ]
    ): js.Any
    @JSName("_catch")
    var _catch_Original: FnCallThisSelector
    
    def _do[T](next: js.Function1[/* x */ T, Unit]): js.Any
    def _do[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ js.Any, Unit]): js.Any
    def _do[T](
      next: js.Function1[/* x */ T, Unit],
      error: js.Function1[/* e */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): js.Any
    def _do[T](next: js.Function1[/* x */ T, Unit], error: Unit, complete: js.Function0[Unit]): js.Any
    def _do[T](
      observer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialObserver<T> */ js.Any
    ): js.Any
    @JSName("_do")
    var _do_Original: FnCallThisNextErrorComplete
    
    def _finally[T](callback: js.Function0[Unit]): js.Any
    @JSName("_finally")
    var _finally_Original: FnCallThisCallback
    
    def _switch[T](): js.Any
    @JSName("_switch")
    var _switch_Original: FnCallThis
    @JSName("_switch")
    def _switch_TR[T, R](): js.Any
    
    def audit[T](
      durationSelector: js.Function1[
          /* value */ T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ js.Any
        ]
    ): js.Any
    
    def auditTime[T](duration: Double): js.Any
    def auditTime[T](
      duration: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    @JSName("auditTime")
    var auditTime_Original: FnCallThisDurationScheduler
    
    @JSName("audit")
    var audit_Original: FnCall
    
    def buffer[T](
      closingNotifier: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ): js.Any
    
    def bufferCount[T](bufferSize: Double): js.Any
    def bufferCount[T](bufferSize: Double, startBufferEvery: Double): js.Any
    @JSName("bufferCount")
    var bufferCount_Original: FnCallThisBufferSizeStartBufferEvery
    
    def bufferTime[T](bufferTimeSpan: Double): js.Any
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double): js.Any
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, maxBufferSize: Double): js.Any
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Double,
      maxBufferSize: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, maxBufferSize: Double): js.Any
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Null,
      maxBufferSize: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Null,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Unit, maxBufferSize: Double): js.Any
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Unit,
      maxBufferSize: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def bufferTime[T](
      bufferTimeSpan: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    @JSName("bufferTime")
    var bufferTime_Original: FnCallThisBufferTimeSpanBufferCreationIntervalMaxBufferSizeScheduler
    
    def bufferToggle[T, O](
      openings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<O> */ js.Any,
      closingSelector: js.Function1[
          /* openValue */ O, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
        ]
    ): js.Any
    @JSName("bufferToggle")
    var bufferToggle_Original: FnCallThisOpeningsClosingSelector
    
    def bufferWhen[T](
      closingSelector: js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
        ]
    ): js.Any
    @JSName("bufferWhen")
    var bufferWhen_Original: FnCallThisClosingSelector
    
    @JSName("buffer")
    var buffer_Original: FnCallThisClosingNotifier
    
    def `catch`[T, R](
      selector: js.Function2[
          /* err */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* caught */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
        ]
    ): js.Any
    @JSName("catch")
    var catch_Original: FnCallThisSelector
    
    def combineAll[T](): js.Any
    def combineAll[R](project: js.Function1[/* repeated */ js.Any, R]): js.Any
    @JSName("combineAll")
    var combineAll_Original: FnCallThisProject
    @JSName("combineAll")
    def combineAll_TR[T, R](): js.Any
    @JSName("combineAll")
    def combineAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): js.Any
    
    def combineLatest[T, R](
      array: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any
        ]
    ): js.Any
    def combineLatest[T, R](
      observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any) | (js.Function1[/* repeated */ T, R]))*
    ): js.Any
    def combineLatest[T, R](project: js.Function1[/* v1 */ T, R]): js.Any
    def combineLatest[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any
    ): js.Any
    def combineLatest[T, TOther, R](
      array: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<TOther> */ js.Any
        ],
      project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
    ): js.Any
    def combineLatest[T, T2, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      project: js.Function2[/* v1 */ T, /* v2 */ T2, R]
    ): js.Any
    def combineLatest[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any
    ): js.Any
    def combineLatest[T, T2, T3, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
    ): js.Any
    def combineLatest[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any
    ): js.Any
    def combineLatest[T, T2, T3, T4, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
    ): js.Any
    def combineLatest[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any
    ): js.Any
    def combineLatest[T, T2, T3, T4, T5, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
    ): js.Any
    def combineLatest[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any
    ): js.Any
    def combineLatest[T, T2, T3, T4, T5, T6, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any,
      project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
    ): js.Any
    @JSName("combineLatest")
    var combineLatest_Original: FnCallThisV2V3V4V5V6Project
    
    def concat[T](): js.Any
    def concat[T](
      observables: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any)*
    ): js.Any
    def concat[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def concat[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def concat[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def concat[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def concat[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def concat[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    
    def concatAll[T](): js.Any
    @JSName("concatAll")
    var concatAll_Original: FnCallThis
    @JSName("concatAll")
    def concatAll_TR[T, R](): js.Any
    
    def concatMap[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
        ]
    ): js.Any
    
    def concatMapTo[T, R](
      innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ js.Any
    ): js.Any
    @JSName("concatMapTo")
    var concatMapTo_Original: FnCallThisInnerObservable
    
    @JSName("concatMap")
    var concatMap_Original: Fn0
    
    @JSName("concat")
    var concat_Original: FnCallThisV2V3V4V5V6Scheduler
    @JSName("concat")
    def concat_TR[T, R](
      observables: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ js.Any)*
    ): js.Any
    @JSName("concat")
    def concat_TT2[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any
    ): js.Any
    @JSName("concat")
    def concat_TT2T3[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any
    ): js.Any
    @JSName("concat")
    def concat_TT2T3T4[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any
    ): js.Any
    @JSName("concat")
    def concat_TT2T3T4T5[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any
    ): js.Any
    @JSName("concat")
    def concat_TT2T3T4T5T6[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any
    ): js.Any
    
    def count[T](): js.Any
    def count[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ]
    ): js.Any
    @JSName("count")
    var count_Original: FnCallThisPredicate
    
    def debounce[T](
      durationSelector: js.Function1[
          /* value */ T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ js.Any
        ]
    ): js.Any
    
    def debounceTime[T](dueTime: Double): js.Any
    def debounceTime[T](
      dueTime: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    @JSName("debounceTime")
    var debounceTime_Original: FnCallThisDueTimeScheduler
    
    @JSName("debounce")
    var debounce_Original: FnCall
    
    def defaultIfEmpty[T](): js.Any
    def defaultIfEmpty[T](defaultValue: T): js.Any
    @JSName("defaultIfEmpty")
    var defaultIfEmpty_Original: FnCallThisDefaultValue
    @JSName("defaultIfEmpty")
    def defaultIfEmpty_TR[T, R](): js.Any
    @JSName("defaultIfEmpty")
    def defaultIfEmpty_TR[T, R](defaultValue: R): js.Any
    
    def delay[T](delay: Double): js.Any
    def delay[T](
      delay: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def delay[T](delay: Date): js.Any
    def delay[T](
      delay: Date,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    
    def delayWhen[T](
      delayDurationSelector: js.Function1[
          /* value */ T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
        ]
    ): js.Any
    def delayWhen[T](
      delayDurationSelector: js.Function1[
          /* value */ T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
        ],
      subscriptionDelay: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ): js.Any
    @JSName("delayWhen")
    var delayWhen_Original: FnCallThisDelayDurationSelectorSubscriptionDelay
    
    @JSName("delay")
    var delay_Original: FnCallThisDelayScheduler
    
    def dematerialize[T](): js.Any
    @JSName("dematerialize")
    var dematerialize_Original: Fn1
    
    def distinct[T, K](): js.Any
    def distinct[T, K](keySelector: js.Function1[/* value */ T, K]): js.Any
    def distinct[T, K](
      keySelector: js.Function1[/* value */ T, K],
      flushes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ): js.Any
    def distinct[T, K](
      keySelector: Unit,
      flushes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ): js.Any
    
    def distinctUntilChanged[T](): js.Any
    def distinctUntilChanged[T](compare: js.Function2[/* x */ T, /* y */ T, Boolean]): js.Any
    def distinctUntilChanged[T, K](compare: js.Function2[/* x */ K, /* y */ K, Boolean], keySelector: js.Function1[/* x */ T, K]): js.Any
    @JSName("distinctUntilChanged")
    var distinctUntilChanged_Original: FnCallThisCompareKeySelector
    
    def distinctUntilKeyChanged[T](key: /* keyof T */ String): js.Any
    def distinctUntilKeyChanged[T, K /* <: /* keyof T */ String */](
      key: K,
      compare: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* x */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* y */ js.Any, 
          Boolean
        ]
    ): js.Any
    @JSName("distinctUntilKeyChanged")
    var distinctUntilKeyChanged_Original: FnCallThisKeyCompare
    
    @JSName("distinct")
    var distinct_Original: FnCallThisKeySelectorFlushes
    
    def `do`[T](next: js.Function1[/* x */ T, Unit]): js.Any
    def `do`[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ js.Any, Unit]): js.Any
    def `do`[T](
      next: js.Function1[/* x */ T, Unit],
      error: js.Function1[/* e */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): js.Any
    def `do`[T](next: js.Function1[/* x */ T, Unit], error: Unit, complete: js.Function0[Unit]): js.Any
    def `do`[T](
      observer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialObserver<T> */ js.Any
    ): js.Any
    @JSName("do")
    var do_Original: FnCallThisNextErrorComplete
    
    def elementAt[T](index: Double): js.Any
    def elementAt[T](index: Double, defaultValue: T): js.Any
    @JSName("elementAt")
    var elementAt_Original: FnCallThisIndexDefaultValue
    
    def every[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ]
    ): js.Any
    def every[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ],
      thisArg: js.Any
    ): js.Any
    @JSName("every")
    var every_Original: FnCallThisPredicateThisArg
    
    def exhaust[T](): js.Any
    
    def exhaustMap[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
        ]
    ): js.Any
    @JSName("exhaustMap")
    var exhaustMap_Original: Fn0
    
    @JSName("exhaust")
    var exhaust_Original: FnCallThis
    @JSName("exhaust")
    def exhaust_TR[T, R](): js.Any
    
    def expand[T](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any
        ]
    ): js.Any
    def expand[T](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any
        ],
      concurrent: Double
    ): js.Any
    def expand[T](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any
        ],
      concurrent: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def expand[T](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any
        ],
      concurrent: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    @JSName("expand")
    var expand_Original: FnCallThisProjectConcurrentScheduler
    @JSName("expand")
    def expand_TR[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
        ]
    ): js.Any
    @JSName("expand")
    def expand_TR[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
        ],
      concurrent: Double
    ): js.Any
    @JSName("expand")
    def expand_TR[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
        ],
      concurrent: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    @JSName("expand")
    def expand_TR[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
        ],
      concurrent: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    
    def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Any
    def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): js.Any
    @JSName("filter")
    var filter_Original: Fn2
    @JSName("filter")
    def filter_TS_T[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): js.Any
    @JSName("filter")
    def filter_TS_T[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], thisArg: js.Any): js.Any
    
    def `finally`[T](callback: js.Function0[Unit]): js.Any
    @JSName("finally")
    var finally_Original: FnCallThisCallback
    
    def find[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Any
    def find[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): js.Any
    
    def findIndex[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ]
    ): js.Any
    def findIndex[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ],
      thisArg: js.Any
    ): js.Any
    @JSName("findIndex")
    var findIndex_Original: FnCallThisPredicateThisArg
    
    @JSName("find")
    var find_Original: Fn2
    @JSName("find")
    def find_TS_T[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): js.Any
    @JSName("find")
    def find_TS_T[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], thisArg: js.Any): js.Any
    
    def first[T, D](): js.Any
    def first[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          /* is S */ Boolean
        ]
    ): js.Any
    def first[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          /* is S */ Boolean
        ],
      defaultValue: S
    ): js.Any
    def first[T, D](predicate: Null, defaultValue: D): js.Any
    def first[T, D](predicate: Unit, defaultValue: D): js.Any
    @JSName("first")
    var first_Original: FnCallThisPredicateDefaultValue
    @JSName("first")
    def first_TD[T, D](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ]
    ): js.Any
    @JSName("first")
    def first_TD[T, D](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ],
      defaultValue: D
    ): js.Any
    
    def flatMap[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
        ]
    ): js.Any
    def flatMap[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
        ],
      concurrent: Double
    ): js.Any
    
    def flatMapTo[T, R](
      innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
    ): js.Any
    def flatMapTo[T, R](
      innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any,
      concurrent: Double
    ): js.Any
    @JSName("flatMapTo")
    var flatMapTo_Original: FnCallThisInnerObservableConcurrent
    
    @JSName("flatMap")
    var flatMap_Original: FnCallThisProjectConcurrent
    
    def groupBy[T, K](keySelector: js.Function1[/* value */ T, K]): js.Any
    def groupBy[T, K](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: Unit,
      durationSelector: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ /* grouped */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
        ]
    ): js.Any
    def groupBy[T, K, R](keySelector: js.Function1[/* value */ T, K], elementSelector: js.Function1[/* value */ T, R]): js.Any
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: js.Function1[/* value */ T, R],
      durationSelector: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
        ]
    ): js.Any
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: js.Function1[/* value */ T, R],
      durationSelector: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
        ],
      subjectSelector: js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ js.Any
        ]
    ): js.Any
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: js.Function1[/* value */ T, R],
      durationSelector: Unit,
      subjectSelector: js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ js.Any
        ]
    ): js.Any
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: Unit,
      durationSelector: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
        ],
      subjectSelector: js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ js.Any
        ]
    ): js.Any
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: Unit,
      durationSelector: Unit,
      subjectSelector: js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ js.Any
        ]
    ): js.Any
    @JSName("groupBy")
    var groupBy_Original: FnCallThisKeySelectorElementSelectorDurationSelectorSubjectSelector
    @JSName("groupBy")
    def groupBy_TKR[T, K, R](keySelector: js.Function1[/* value */ T, K]): js.Any
    @JSName("groupBy")
    def groupBy_TKR[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: Unit,
      durationSelector: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
        ]
    ): js.Any
    
    def ignoreElements(): js.Any
    @JSName("ignoreElements")
    var ignoreElements_Original: js.ThisFunction0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ /* this */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<never> */ js.Any
      ]
    
    def isEmpty[T](): js.Any
    @JSName("isEmpty")
    var isEmpty_Original: Fn1
    
    def last[T, D](): js.Any
    def last[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          /* is S */ Boolean
        ]
    ): js.Any
    def last[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          /* is S */ Boolean
        ],
      defaultValue: S
    ): js.Any
    def last[T, D](predicate: Null, defaultValue: D): js.Any
    def last[T, D](predicate: Unit, defaultValue: D): js.Any
    @JSName("last")
    var last_Original: FnCallThisPredicateDefaultValue
    @JSName("last")
    def last_TD[T, D](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ]
    ): js.Any
    @JSName("last")
    def last_TD[T, D](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ],
      defaultValue: D
    ): js.Any
    
    def let[T, R](
      func: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* selector */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ js.Any
        ]
    ): js.Any
    
    def letBind[T, R](
      func: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* selector */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ js.Any
        ]
    ): js.Any
    @JSName("letBind")
    var letBind_Original: FnCallThisFunc
    
    @JSName("let")
    var let_Original: FnCallThisFunc
    
    def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R]): js.Any
    def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R], thisArg: js.Any): js.Any
    
    def mapTo[T, R](value: R): js.Any
    @JSName("mapTo")
    var mapTo_Original: FnCallThisValue
    
    @JSName("map")
    var map_Original: FnCallThisProjectThisArg
    
    def materialize[T](): js.Any
    @JSName("materialize")
    var materialize_Original: Fn1
    
    def max[T](): js.Any
    def max[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): js.Any
    @JSName("max")
    var max_Original: FnCallThisComparer
    
    def merge[T](): js.Any
    def merge[T](concurrent: Double): js.Any
    def merge[T](
      concurrent: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def merge[T](
      concurrent: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def merge[T](
      observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any) | Double)*
    ): js.Any
    def merge[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def merge[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      concurrent: Double
    ): js.Any
    def merge[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      concurrent: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def merge[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      concurrent: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def merge[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def merge[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      concurrent: Double
    ): js.Any
    def merge[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      concurrent: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def merge[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      concurrent: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def merge[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def merge[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      concurrent: Double
    ): js.Any
    def merge[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      concurrent: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def merge[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      concurrent: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def merge[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def merge[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      concurrent: Double
    ): js.Any
    def merge[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      concurrent: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def merge[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      concurrent: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def merge[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def merge[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any,
      concurrent: Double
    ): js.Any
    def merge[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any,
      concurrent: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def merge[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any,
      concurrent: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def merge[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    
    def mergeAll[T](): js.Any
    def mergeAll[T](concurrent: Double): js.Any
    @JSName("mergeAll")
    var mergeAll_Original: FnCallThisConcurrent
    @JSName("mergeAll")
    def mergeAll_TR[T, R](): js.Any
    @JSName("mergeAll")
    def mergeAll_TR[T, R](concurrent: Double): js.Any
    
    def mergeMap[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
        ]
    ): js.Any
    def mergeMap[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
        ],
      concurrent: Double
    ): js.Any
    
    def mergeMapTo[T, R](
      innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
    ): js.Any
    def mergeMapTo[T, R](
      innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any,
      concurrent: Double
    ): js.Any
    @JSName("mergeMapTo")
    var mergeMapTo_Original: FnCallThisInnerObservableConcurrent
    
    @JSName("mergeMap")
    var mergeMap_Original: FnCallThisProjectConcurrent
    
    def mergeScan[T, R](
      accumulator: js.Function2[
          /* acc */ R, 
          /* value */ T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
        ],
      seed: R
    ): js.Any
    def mergeScan[T, R](
      accumulator: js.Function2[
          /* acc */ R, 
          /* value */ T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
        ],
      seed: R,
      concurrent: Double
    ): js.Any
    @JSName("mergeScan")
    var mergeScan_Original: FnCallThisAccumulatorSeedConcurrent
    
    @JSName("merge")
    var merge_Original: FnCallThisV2V3V4V5V6ConcurrentScheduler
    @JSName("merge")
    def merge_TR[T, R](
      observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ js.Any) | Double)*
    ): js.Any
    @JSName("merge")
    def merge_TT2[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any
    ): js.Any
    @JSName("merge")
    def merge_TT2T3[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any
    ): js.Any
    @JSName("merge")
    def merge_TT2T3T4[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any
    ): js.Any
    @JSName("merge")
    def merge_TT2T3T4T5[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any
    ): js.Any
    @JSName("merge")
    def merge_TT2T3T4T5T6[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any
    ): js.Any
    
    def min[T](): js.Any
    def min[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): js.Any
    @JSName("min")
    var min_Original: FnCallThisComparer
    
    def multicast[T](
      SubjectFactory: js.ThisFunction0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ js.Any
        ]
    ): js.Any
    def multicast[T](
      SubjectFactory: js.ThisFunction0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ js.Any
        ],
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any
    ): js.Any
    def multicast[T](
      subjectOrSubjectFactory: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FactoryOrValue<Subject<T>> */ js.Any
    ): js.Any
    @JSName("multicast")
    var multicast_Original: FnCallSubjectFactorySelector
    @JSName("multicast")
    def multicast_TR[T, R](
      SubjectFactory: js.ThisFunction0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ js.Any
        ]
    ): js.Any
    @JSName("multicast")
    def multicast_TR[T, R](
      SubjectFactory: js.ThisFunction0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ js.Any
        ],
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ js.Any
    ): js.Any
    
    def observeOn[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def observeOn[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any,
      delay: Double
    ): js.Any
    @JSName("observeOn")
    var observeOn_Original: FnCallThisSchedulerDelay
    
    def onErrorResumeNext[T](): js.Any
    def onErrorResumeNext[T, R](
      array: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ js.Any
        ]
    ): js.Any
    def onErrorResumeNext[T, R](
      observables: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ js.Any)*
    ): js.Any
    def onErrorResumeNext[T, R](
      v: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
    ): js.Any
    def onErrorResumeNext[T, T2, T3, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any
    ): js.Any
    def onErrorResumeNext[T, T2, T3, T4, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any
    ): js.Any
    def onErrorResumeNext[T, T2, T3, T4, T5, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any
    ): js.Any
    def onErrorResumeNext[T, T2, T3, T4, T5, T6, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any
    ): js.Any
    @JSName("onErrorResumeNext")
    var onErrorResumeNext_Original: FnCallThisV2V3V4V5V6
    @JSName("onErrorResumeNext")
    def onErrorResumeNext_TT2R[T, T2, R](
      v: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any
    ): js.Any
    
    def pairwise[T](): js.Any
    @JSName("pairwise")
    var pairwise_Original: Fn1
    
    def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Tuple2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any
      ]
    def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): js.Tuple2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any
      ]
    @JSName("partition")
    var partition_Original: Fn3
    
    def pluck[T, R](properties: String*): js.Any
    @JSName("pluck")
    var pluck_Original: FnCallThisProperties
    
    def publish[T](): js.Any
    def publish[T](
      selector: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any
        ]
    ): js.Any
    
    def publishBehavior[T](value: T): js.Any
    @JSName("publishBehavior")
    var publishBehavior_Original: Fn5
    
    def publishLast[T](): js.Any
    @JSName("publishLast")
    var publishLast_Original: Fn1
    
    def publishReplay[T](): js.Any
    def publishReplay[T](bufferSize: Double): js.Any
    def publishReplay[T](bufferSize: Double, windowTime: Double): js.Any
    def publishReplay[T](
      bufferSize: Double,
      windowTime: Double,
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def publishReplay[T](
      bufferSize: Double,
      windowTime: Double,
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def publishReplay[T](
      bufferSize: Double,
      windowTime: Double,
      selector: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def publishReplay[T](
      bufferSize: Double,
      windowTime: Unit,
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def publishReplay[T](
      bufferSize: Double,
      windowTime: Unit,
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def publishReplay[T](
      bufferSize: Double,
      windowTime: Unit,
      selector: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def publishReplay[T](bufferSize: Unit, windowTime: Double): js.Any
    def publishReplay[T](
      bufferSize: Unit,
      windowTime: Double,
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def publishReplay[T](
      bufferSize: Unit,
      windowTime: Double,
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def publishReplay[T](
      bufferSize: Unit,
      windowTime: Double,
      selector: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def publishReplay[T](
      bufferSize: Unit,
      windowTime: Unit,
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def publishReplay[T](
      bufferSize: Unit,
      windowTime: Unit,
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def publishReplay[T](
      bufferSize: Unit,
      windowTime: Unit,
      selector: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    @JSName("publishReplay")
    var publishReplay_Original: FnCallThisBufferSizeWindowTimeSelectorScheduler
    @JSName("publishReplay")
    def publishReplay_TR[T, R](): js.Any
    @JSName("publishReplay")
    def publishReplay_TR[T, R](bufferSize: Double): js.Any
    @JSName("publishReplay")
    def publishReplay_TR[T, R](bufferSize: Double, windowTime: Double): js.Any
    @JSName("publishReplay")
    def publishReplay_TR[T, R](
      bufferSize: Double,
      windowTime: Double,
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ js.Any
    ): js.Any
    @JSName("publishReplay")
    def publishReplay_TR[T, R](
      bufferSize: Double,
      windowTime: Unit,
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ js.Any
    ): js.Any
    @JSName("publishReplay")
    def publishReplay_TR[T, R](bufferSize: Unit, windowTime: Double): js.Any
    @JSName("publishReplay")
    def publishReplay_TR[T, R](
      bufferSize: Unit,
      windowTime: Double,
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ js.Any
    ): js.Any
    @JSName("publishReplay")
    def publishReplay_TR[T, R](
      bufferSize: Unit,
      windowTime: Unit,
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ js.Any
    ): js.Any
    
    @JSName("publish")
    var publish_Original: Fn4
    @JSName("publish")
    def publish_TR[T, R](
      selector: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ js.Any
        ]
    ): js.Any
    
    def race[T](
      observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any
        ]))*
    ): js.Any
    def race[T](
      observables: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any
        ]
    ): js.Any
    @JSName("race")
    var race_Original: FnCallThisObservables
    @JSName("race")
    def race_TR[T, R](
      observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
        ]))*
    ): js.Any
    @JSName("race")
    def race_TR[T, R](
      observables: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any
        ]
    ): js.Any
    
    def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): js.Any
    def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): js.Any
    @JSName("reduce")
    var reduce_Original: FnCallThisAccumulatorSeed
    @JSName("reduce")
    def reduce_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): js.Any
    @JSName("reduce")
    def reduce_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): js.Any
    
    def repeat[T](): js.Any
    def repeat[T](count: Double): js.Any
    
    def repeatWhen[T](
      notifier: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ /* errors */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
        ]
    ): js.Any
    @JSName("repeatWhen")
    var repeatWhen_Original: FnCallThisNotifier
    
    @JSName("repeat")
    var repeat_Original: FnCallThisCount
    
    def retry[T](): js.Any
    def retry[T](count: Double): js.Any
    
    def retryWhen[T](
      notifier: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ /* errors */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
        ]
    ): js.Any
    @JSName("retryWhen")
    var retryWhen_Original: FnCallThisNotifier
    
    @JSName("retry")
    var retry_Original: FnCallThisCount
    
    def sample[T](
      notifier: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ): js.Any
    
    def sampleTime[T](period: Double): js.Any
    def sampleTime[T](
      period: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    @JSName("sampleTime")
    var sampleTime_Original: FnCallThisPeriodScheduler
    
    @JSName("sample")
    var sample_Original: Fn6
    
    def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): js.Any
    def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): js.Any
    @JSName("scan")
    var scan_Original: FnCallThisAccumulatorSeed
    @JSName("scan")
    def scan_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): js.Any
    @JSName("scan")
    def scan_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): js.Any
    
    def sequenceEqual[T](
      compareTo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any
    ): js.Any
    def sequenceEqual[T](
      compareTo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
      comparor: js.Function2[/* a */ T, /* b */ T, Boolean]
    ): js.Any
    @JSName("sequenceEqual")
    var sequenceEqual_Original: FnCallThisCompareToComparor
    
    def share[T](): js.Any
    
    def shareReplay[T](): js.Any
    def shareReplay[T](bufferSize: Double): js.Any
    def shareReplay[T](bufferSize: Double, windowTime: Double): js.Any
    def shareReplay[T](
      bufferSize: Double,
      windowTime: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def shareReplay[T](
      bufferSize: Double,
      windowTime: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def shareReplay[T](bufferSize: Unit, windowTime: Double): js.Any
    def shareReplay[T](
      bufferSize: Unit,
      windowTime: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def shareReplay[T](
      bufferSize: Unit,
      windowTime: Unit,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def shareReplay[T](
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShareReplayConfig */ js.Any
    ): js.Any
    @JSName("shareReplay")
    var shareReplay_Original: FnCallThisBufferSizeWindowTimeScheduler
    
    @JSName("share")
    var share_Original: Fn1
    
    def single[T](): js.Any
    def single[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ]
    ): js.Any
    @JSName("single")
    var single_Original: FnCallThisPredicate
    
    def skip[T](count: Double): js.Any
    
    def skipLast[T](count: Double): js.Any
    @JSName("skipLast")
    var skipLast_Original: Fn7
    
    def skipUntil[T](
      notifier: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ): js.Any
    @JSName("skipUntil")
    var skipUntil_Original: Fn6
    
    def skipWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Any
    @JSName("skipWhile")
    var skipWhile_Original: Fn8
    
    @JSName("skip")
    var skip_Original: Fn7
    
    def startWith[T](): js.Any
    def startWith[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def startWith[T, D](
      array: (D | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any))*
    ): js.Any
    def startWith[T, D](v1: D): js.Any
    def startWith[T, D](
      v1: D,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def startWith[T, D, E](v1: D, v2: E): js.Any
    def startWith[T, D, E](
      v1: D,
      v2: E,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def startWith[T, D, E, F](v1: D, v2: E, v3: F): js.Any
    def startWith[T, D, E, F](
      v1: D,
      v2: E,
      v3: F,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G): js.Any
    def startWith[T, D, E, F, G](
      v1: D,
      v2: E,
      v3: F,
      v4: G,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H): js.Any
    def startWith[T, D, E, F, G, H](
      v1: D,
      v2: E,
      v3: F,
      v4: G,
      v5: H,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I): js.Any
    def startWith[T, D, E, F, G, H, I](
      v1: D,
      v2: E,
      v3: F,
      v4: G,
      v5: H,
      v6: I,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    @JSName("startWith")
    var startWith_Original: FnCallThisV1V2V3V4V5V6Scheduler
    
    def subscribeOn[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def subscribeOn[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any,
      delay: Double
    ): js.Any
    @JSName("subscribeOn")
    var subscribeOn_Original: FnCallThisSchedulerDelay
    
    def switch[T](): js.Any
    
    def switchMap[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
        ]
    ): js.Any
    
    def switchMapTo[T, R](
      observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
    ): js.Any
    def switchMapTo[T, I, R](
      observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<I> */ js.Any,
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ I, 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): js.Any
    @JSName("switchMapTo")
    var switchMapTo_Original: FnCallThisObservableResultSelector
    
    @JSName("switchMap")
    var switchMap_Original: Fn0
    
    @JSName("switch")
    var switch_Original: FnCallThis
    @JSName("switch")
    def switch_TR[T, R](): js.Any
    
    def take[T](count: Double): js.Any
    
    def takeLast[T](count: Double): js.Any
    @JSName("takeLast")
    var takeLast_Original: Fn7
    
    def takeUntil[T](
      notifier: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ): js.Any
    @JSName("takeUntil")
    var takeUntil_Original: Fn6
    
    def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Any
    @JSName("takeWhile")
    var takeWhile_Original: Fn8
    
    @JSName("take")
    var take_Original: Fn7
    
    def throttle[T](
      durationSelector: js.Function1[
          /* value */ T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ js.Any
        ]
    ): js.Any
    def throttle[T](
      durationSelector: js.Function1[
          /* value */ T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ js.Any
        ],
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ js.Any
    ): js.Any
    
    def throttleTime[T](duration: Double): js.Any
    def throttleTime[T](
      duration: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def throttleTime[T](
      duration: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any,
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ js.Any
    ): js.Any
    def throttleTime[T](
      duration: Double,
      scheduler: Unit,
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ js.Any
    ): js.Any
    @JSName("throttleTime")
    var throttleTime_Original: FnCallThisDurationSchedulerConfig
    
    @JSName("throttle")
    var throttle_Original: FnCallThisDurationSelectorConfig
    
    def timeInterval[T](): js.Any
    def timeInterval[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    @JSName("timeInterval")
    var timeInterval_Original: FnCallThisScheduler
    
    def timeout[T](due: Double): js.Any
    def timeout[T](
      due: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def timeout[T](due: Date): js.Any
    def timeout[T](
      due: Date,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    
    def timeoutWith[T](
      due: Double,
      withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any
    ): js.Any
    def timeoutWith[T](
      due: Double,
      withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def timeoutWith[T](
      due: Date,
      withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any
    ): js.Any
    def timeoutWith[T](
      due: Date,
      withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    @JSName("timeoutWith")
    var timeoutWith_Original: FnCallThisDueWithObservableScheduler
    @JSName("timeoutWith")
    def timeoutWith_TR[T, R](
      due: Double,
      withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
    ): js.Any
    @JSName("timeoutWith")
    def timeoutWith_TR[T, R](
      due: Double,
      withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    @JSName("timeoutWith")
    def timeoutWith_TR[T, R](
      due: Date,
      withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
    ): js.Any
    @JSName("timeoutWith")
    def timeoutWith_TR[T, R](
      due: Date,
      withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    
    @JSName("timeout")
    var timeout_Original: FnCallThisDueScheduler
    
    def timestamp[T](): js.Any
    def timestamp[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    @JSName("timestamp")
    var timestamp_Original: FnCallThisScheduler
    
    def toArray[T](): js.Any
    @JSName("toArray")
    var toArray_Original: Fn1
    
    def window[T](
      windowBoundaries: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ): js.Any
    
    def windowCount[T](windowSize: Double): js.Any
    def windowCount[T](windowSize: Double, startWindowEvery: Double): js.Any
    @JSName("windowCount")
    var windowCount_Original: FnCallThisWindowSizeStartWindowEvery
    
    def windowTime[T](windowTimeSpan: Double): js.Any
    def windowTime[T](
      windowTimeSpan: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double): js.Any
    def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, maxWindowSize: Double): js.Any
    def windowTime[T](
      windowTimeSpan: Double,
      windowCreationInterval: Double,
      maxWindowSize: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    def windowTime[T](
      windowTimeSpan: Double,
      windowCreationInterval: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any
    @JSName("windowTime")
    var windowTime_Original: FnCallThisWindowTimeSpanWindowCreationIntervalMaxWindowSizeScheduler
    
    def windowToggle[T, O](
      openings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<O> */ js.Any,
      closingSelector: js.Function1[
          /* openValue */ O, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
        ]
    ): js.Any
    @JSName("windowToggle")
    var windowToggle_Original: FnCallThisOpeningsClosingSelector
    
    def windowWhen[T](
      closingSelector: js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
        ]
    ): js.Any
    @JSName("windowWhen")
    var windowWhen_Original: FnCallThisClosingSelector
    
    @JSName("window")
    var window_Original: FnCallThisWindowBoundaries
    
    def withLatestFrom[T, R](
      array: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ js.Any
        ]
    ): js.Any
    def withLatestFrom[T, R](
      array: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ js.Any
        ],
      project: js.Function1[/* repeated */ js.Any, R]
    ): js.Any
    def withLatestFrom[T, R](
      observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ js.Any) | (js.Function1[/* repeated */ js.Any, R]))*
    ): js.Any
    def withLatestFrom[T, R](project: js.Function1[/* v1 */ T, R]): js.Any
    def withLatestFrom[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any
    ): js.Any
    def withLatestFrom[T, T2, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      project: js.Function2[/* v1 */ T, /* v2 */ T2, R]
    ): js.Any
    def withLatestFrom[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any
    ): js.Any
    def withLatestFrom[T, T2, T3, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
    ): js.Any
    def withLatestFrom[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any
    ): js.Any
    def withLatestFrom[T, T2, T3, T4, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
    ): js.Any
    def withLatestFrom[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any
    ): js.Any
    def withLatestFrom[T, T2, T3, T4, T5, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
    ): js.Any
    def withLatestFrom[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any
    ): js.Any
    def withLatestFrom[T, T2, T3, T4, T5, T6, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any,
      project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
    ): js.Any
    @JSName("withLatestFrom")
    var withLatestFrom_Original: Fn9
    
    def zip[T](
      observables: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any)*
    ): js.Any
    def zip[T, R](
      array: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any
        ]
    ): js.Any
    def zip[T, R](project: js.Function1[/* v1 */ T, R]): js.Any
    def zip[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any
    ): js.Any
    def zip[T, TOther, R](
      array: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<TOther> */ js.Any
        ],
      project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
    ): js.Any
    def zip[T, T2, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      project: js.Function2[/* v1 */ T, /* v2 */ T2, R]
    ): js.Any
    def zip[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any
    ): js.Any
    def zip[T, T2, T3, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
    ): js.Any
    def zip[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any
    ): js.Any
    def zip[T, T2, T3, T4, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
    ): js.Any
    def zip[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any
    ): js.Any
    def zip[T, T2, T3, T4, T5, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
    ): js.Any
    def zip[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any
    ): js.Any
    def zip[T, T2, T3, T4, T5, T6, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any,
      project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
    ): js.Any
    
    def zipAll[T](): js.Any
    def zipAll[R](project: js.Function1[/* repeated */ js.Any, R]): js.Any
    @JSName("zipAll")
    var zipAll_Original: FnCallThisProject
    @JSName("zipAll")
    def zipAll_TR[T, R](): js.Any
    @JSName("zipAll")
    def zipAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): js.Any
    
    @JSName("zip")
    var zip_Original: Fn10
    @JSName("zip")
    def zip_TR[T, R](
      observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any) | (js.Function1[/* repeated */ T, R]))*
    ): js.Any
  }
  object Observable {
    
    @scala.inline
    def apply[T](
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
      find: Fn2,
      findIndex: FnCallThisPredicateThisArg,
      first: FnCallThisPredicateDefaultValue,
      flatMap: FnCallThisProjectConcurrent,
      flatMapTo: FnCallThisInnerObservableConcurrent,
      groupBy: FnCallThisKeySelectorElementSelectorDurationSelectorSubjectSelector,
      ignoreElements: js.ThisFunction0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ /* this */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<never> */ js.Any
        ],
      isEmpty: Fn1,
      last: FnCallThisPredicateDefaultValue,
      let: FnCallThisFunc,
      letBind: FnCallThisFunc,
      map: FnCallThisProjectThisArg,
      mapTo: FnCallThisValue,
      materialize: Fn1,
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
      pairwise: Fn1,
      partition: Fn3,
      pluck: FnCallThisProperties,
      publish: Fn4,
      publishBehavior: Fn5,
      publishLast: Fn1,
      publishReplay: FnCallThisBufferSizeWindowTimeSelectorScheduler,
      race: FnCallThisObservables,
      reduce: FnCallThisAccumulatorSeed,
      repeat: FnCallThisCount,
      repeatWhen: FnCallThisNotifier,
      retry: FnCallThisCount,
      retryWhen: FnCallThisNotifier,
      sample: Fn6,
      sampleTime: FnCallThisPeriodScheduler,
      scan: FnCallThisAccumulatorSeed,
      sequenceEqual: FnCallThisCompareToComparor,
      share: Fn1,
      shareReplay: FnCallThisBufferSizeWindowTimeScheduler,
      single: FnCallThisPredicate,
      skip: Fn7,
      skipLast: Fn7,
      skipUntil: Fn6,
      skipWhile: Fn8,
      startWith: FnCallThisV1V2V3V4V5V6Scheduler,
      subscribeOn: FnCallThisSchedulerDelay,
      switch: FnCallThis,
      switchMap: Fn0,
      switchMapTo: FnCallThisObservableResultSelector,
      take: Fn7,
      takeLast: Fn7,
      takeUntil: Fn6,
      takeWhile: Fn8,
      throttle: FnCallThisDurationSelectorConfig,
      throttleTime: FnCallThisDurationSchedulerConfig,
      timeInterval: FnCallThisScheduler,
      timeout: FnCallThisDueScheduler,
      timeoutWith: FnCallThisDueWithObservableScheduler,
      timestamp: FnCallThisScheduler,
      toArray: Fn1,
      window: FnCallThisWindowBoundaries,
      windowCount: FnCallThisWindowSizeStartWindowEvery,
      windowTime: FnCallThisWindowTimeSpanWindowCreationIntervalMaxWindowSizeScheduler,
      windowToggle: FnCallThisOpeningsClosingSelector,
      windowWhen: FnCallThisClosingSelector,
      withLatestFrom: Fn9,
      zip: Fn10,
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
    def ajax: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AjaxCreationMethod */ js.Any = js.native
    @scala.inline
    def ajax_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AjaxCreationMethod */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ajax")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.bindCallback")
    @js.native
    def bindCallback: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticBindCallback */ js.Any = js.native
    @scala.inline
    def bindCallback_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticBindCallback */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bindCallback")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.bindNodeCallback")
    @js.native
    def bindNodeCallback: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticBindNodeCallback */ js.Any = js.native
    @scala.inline
    def bindNodeCallback_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticBindNodeCallback */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bindNodeCallback")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.combineLatest")
    @js.native
    def combineLatest: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof combineLatestStatic */ js.Any = js.native
    @scala.inline
    def combineLatest_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof combineLatestStatic */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("combineLatest")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.concat")
    @js.native
    def concat: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof concatStatic */ js.Any = js.native
    @scala.inline
    def concat_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof concatStatic */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("concat")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.defer")
    @js.native
    def defer: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticDefer */ js.Any = js.native
    @scala.inline
    def defer_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticDefer */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defer")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.empty")
    @js.native
    def empty: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticEmpty */ js.Any = js.native
    @scala.inline
    def empty_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticEmpty */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.forkJoin")
    @js.native
    def forkJoin: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticForkJoin */ js.Any = js.native
    @scala.inline
    def forkJoin_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticForkJoin */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forkJoin")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.from")
    @js.native
    def from: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFrom */ js.Any = js.native
    
    @JSImport("rxjs/internal/Observable", "Observable.fromEvent")
    @js.native
    def fromEvent: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFromEvent */ js.Any = js.native
    
    @JSImport("rxjs/internal/Observable", "Observable.fromEventPattern")
    @js.native
    def fromEventPattern: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFromEventPattern */ js.Any = js.native
    @scala.inline
    def fromEventPattern_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFromEventPattern */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromEventPattern")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def fromEvent_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFromEvent */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromEvent")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.fromPromise")
    @js.native
    def fromPromise: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFromPromise */ js.Any = js.native
    @scala.inline
    def fromPromise_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFromPromise */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromPromise")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def from_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFrom */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("from")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.generate")
    @js.native
    def generate: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticGenerate */ js.Any = js.native
    @scala.inline
    def generate_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticGenerate */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generate")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.interval")
    @js.native
    def interval: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticInterval */ js.Any = js.native
    @scala.inline
    def interval_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticInterval */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interval")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.merge")
    @js.native
    def merge: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof mergeStatic */ js.Any = js.native
    @scala.inline
    def merge_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof mergeStatic */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("merge")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.of")
    @js.native
    def of: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticOf */ js.Any = js.native
    @scala.inline
    def of_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticOf */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("of")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.onErrorResumeNext")
    @js.native
    def onErrorResumeNext: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticOnErrorResumeNext */ js.Any = js.native
    @scala.inline
    def onErrorResumeNext_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticOnErrorResumeNext */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onErrorResumeNext")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.pairs")
    @js.native
    def pairs: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticPairs */ js.Any = js.native
    @scala.inline
    def pairs_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticPairs */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pairs")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.race")
    @js.native
    def race: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticRace */ js.Any = js.native
    @scala.inline
    def race_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticRace */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("race")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.range")
    @js.native
    def range: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticRange */ js.Any = js.native
    @scala.inline
    def range_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticRange */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("range")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.throwError")
    @js.native
    def throwError: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticThrowError */ js.Any = js.native
    @scala.inline
    def throwError_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticThrowError */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("throwError")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.timer")
    @js.native
    def timer: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticTimer */ js.Any = js.native
    @scala.inline
    def timer_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticTimer */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timer")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.using")
    @js.native
    val `using`: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticUsing */ js.Any = js.native
    
    @JSImport("rxjs/internal/Observable", "Observable.webSocket")
    @js.native
    def webSocket: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticWebSocket */ js.Any = js.native
    @scala.inline
    def webSocket_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticWebSocket */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webSocket")(x.asInstanceOf[js.Any])
    
    @JSImport("rxjs/internal/Observable", "Observable.zip")
    @js.native
    def zip: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof zipStatic */ js.Any = js.native
    @scala.inline
    def zip_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof zipStatic */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zip")(x.asInstanceOf[js.Any])
    
    @scala.inline
    implicit class ObservableMutableBuilder[Self <: Observable[?], T] (val x: Self & Observable[T]) extends AnyVal {
      
      @scala.inline
      def setAudit(value: FnCall): Self = StObject.set(x, "audit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuditTime(value: FnCallThisDurationScheduler): Self = StObject.set(x, "auditTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuffer(value: FnCallThisClosingNotifier): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferCount(value: FnCallThisBufferSizeStartBufferEvery): Self = StObject.set(x, "bufferCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferTime(value: FnCallThisBufferTimeSpanBufferCreationIntervalMaxBufferSizeScheduler): Self = StObject.set(x, "bufferTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferToggle(value: FnCallThisOpeningsClosingSelector): Self = StObject.set(x, "bufferToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferWhen(value: FnCallThisClosingSelector): Self = StObject.set(x, "bufferWhen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatch(value: FnCallThisSelector): Self = StObject.set(x, "catch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCombineAll(value: FnCallThisProject): Self = StObject.set(x, "combineAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCombineLatest(value: FnCallThisV2V3V4V5V6Project): Self = StObject.set(x, "combineLatest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcat(value: FnCallThisV2V3V4V5V6Scheduler): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcatAll(value: FnCallThis): Self = StObject.set(x, "concatAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcatMap(value: Fn0): Self = StObject.set(x, "concatMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcatMapTo(value: FnCallThisInnerObservable): Self = StObject.set(x, "concatMapTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCount(value: FnCallThisPredicate): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounce(value: FnCall): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceTime(value: FnCallThisDueTimeScheduler): Self = StObject.set(x, "debounceTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultIfEmpty(value: FnCallThisDefaultValue): Self = StObject.set(x, "defaultIfEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelay(value: FnCallThisDelayScheduler): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayWhen(value: FnCallThisDelayDurationSelectorSubscriptionDelay): Self = StObject.set(x, "delayWhen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDematerialize(value: Fn1): Self = StObject.set(x, "dematerialize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistinct(value: FnCallThisKeySelectorFlushes): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistinctUntilChanged(value: FnCallThisCompareKeySelector): Self = StObject.set(x, "distinctUntilChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistinctUntilKeyChanged(value: FnCallThisKeyCompare): Self = StObject.set(x, "distinctUntilKeyChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDo(value: FnCallThisNextErrorComplete): Self = StObject.set(x, "do", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementAt(value: FnCallThisIndexDefaultValue): Self = StObject.set(x, "elementAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvery(value: FnCallThisPredicateThisArg): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExhaust(value: FnCallThis): Self = StObject.set(x, "exhaust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExhaustMap(value: Fn0): Self = StObject.set(x, "exhaustMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpand(value: FnCallThisProjectConcurrentScheduler): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: Fn2): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinally(value: FnCallThisCallback): Self = StObject.set(x, "finally", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFind(value: Fn2): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindIndex(value: FnCallThisPredicateThisArg): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirst(value: FnCallThisPredicateDefaultValue): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatMap(value: FnCallThisProjectConcurrent): Self = StObject.set(x, "flatMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatMapTo(value: FnCallThisInnerObservableConcurrent): Self = StObject.set(x, "flatMapTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupBy(value: FnCallThisKeySelectorElementSelectorDurationSelectorSubjectSelector): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreElements(
        value: js.ThisFunction0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ /* this */ js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<never> */ js.Any
            ]
      ): Self = StObject.set(x, "ignoreElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEmpty(value: Fn1): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast(value: FnCallThisPredicateDefaultValue): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLet(value: FnCallThisFunc): Self = StObject.set(x, "let", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetBind(value: FnCallThisFunc): Self = StObject.set(x, "letBind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: FnCallThisProjectThisArg): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapTo(value: FnCallThisValue): Self = StObject.set(x, "mapTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaterialize(value: Fn1): Self = StObject.set(x, "materialize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: FnCallThisComparer): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMerge(value: FnCallThisV2V3V4V5V6ConcurrentScheduler): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeAll(value: FnCallThisConcurrent): Self = StObject.set(x, "mergeAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeMap(value: FnCallThisProjectConcurrent): Self = StObject.set(x, "mergeMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeMapTo(value: FnCallThisInnerObservableConcurrent): Self = StObject.set(x, "mergeMapTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeScan(value: FnCallThisAccumulatorSeedConcurrent): Self = StObject.set(x, "mergeScan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: FnCallThisComparer): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMulticast(value: FnCallSubjectFactorySelector): Self = StObject.set(x, "multicast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObserveOn(value: FnCallThisSchedulerDelay): Self = StObject.set(x, "observeOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnErrorResumeNext(value: FnCallThisV2V3V4V5V6): Self = StObject.set(x, "onErrorResumeNext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPairwise(value: Fn1): Self = StObject.set(x, "pairwise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartition(value: Fn3): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluck(value: FnCallThisProperties): Self = StObject.set(x, "pluck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublish(value: Fn4): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishBehavior(value: Fn5): Self = StObject.set(x, "publishBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishLast(value: Fn1): Self = StObject.set(x, "publishLast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishReplay(value: FnCallThisBufferSizeWindowTimeSelectorScheduler): Self = StObject.set(x, "publishReplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRace(value: FnCallThisObservables): Self = StObject.set(x, "race", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReduce(value: FnCallThisAccumulatorSeed): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeat(value: FnCallThisCount): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatWhen(value: FnCallThisNotifier): Self = StObject.set(x, "repeatWhen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry(value: FnCallThisCount): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryWhen(value: FnCallThisNotifier): Self = StObject.set(x, "retryWhen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSample(value: Fn6): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleTime(value: FnCallThisPeriodScheduler): Self = StObject.set(x, "sampleTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScan(value: FnCallThisAccumulatorSeed): Self = StObject.set(x, "scan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceEqual(value: FnCallThisCompareToComparor): Self = StObject.set(x, "sequenceEqual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShare(value: Fn1): Self = StObject.set(x, "share", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShareReplay(value: FnCallThisBufferSizeWindowTimeScheduler): Self = StObject.set(x, "shareReplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingle(value: FnCallThisPredicate): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip(value: Fn7): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipLast(value: Fn7): Self = StObject.set(x, "skipLast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUntil(value: Fn6): Self = StObject.set(x, "skipUntil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipWhile(value: Fn8): Self = StObject.set(x, "skipWhile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartWith(value: FnCallThisV1V2V3V4V5V6Scheduler): Self = StObject.set(x, "startWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribeOn(value: FnCallThisSchedulerDelay): Self = StObject.set(x, "subscribeOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitch(value: FnCallThis): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchMap(value: Fn0): Self = StObject.set(x, "switchMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchMapTo(value: FnCallThisObservableResultSelector): Self = StObject.set(x, "switchMapTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTake(value: Fn7): Self = StObject.set(x, "take", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTakeLast(value: Fn7): Self = StObject.set(x, "takeLast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTakeUntil(value: Fn6): Self = StObject.set(x, "takeUntil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTakeWhile(value: Fn8): Self = StObject.set(x, "takeWhile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottle(value: FnCallThisDurationSelectorConfig): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleTime(value: FnCallThisDurationSchedulerConfig): Self = StObject.set(x, "throttleTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeInterval(value: FnCallThisScheduler): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: FnCallThisDueScheduler): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutWith(value: FnCallThisDueWithObservableScheduler): Self = StObject.set(x, "timeoutWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: FnCallThisScheduler): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToArray(value: Fn1): Self = StObject.set(x, "toArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindow(value: FnCallThisWindowBoundaries): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowCount(value: FnCallThisWindowSizeStartWindowEvery): Self = StObject.set(x, "windowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowTime(value: FnCallThisWindowTimeSpanWindowCreationIntervalMaxWindowSizeScheduler): Self = StObject.set(x, "windowTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowToggle(value: FnCallThisOpeningsClosingSelector): Self = StObject.set(x, "windowToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowWhen(value: FnCallThisClosingSelector): Self = StObject.set(x, "windowWhen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithLatestFrom(value: Fn9): Self = StObject.set(x, "withLatestFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZip(value: Fn10): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipAll(value: FnCallThisProject): Self = StObject.set(x, "zipAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_catch(value: FnCallThisSelector): Self = StObject.set(x, "_catch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_do(value: FnCallThisNextErrorComplete): Self = StObject.set(x, "_do", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_finally(value: FnCallThisCallback): Self = StObject.set(x, "_finally", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_switch(value: FnCallThis): Self = StObject.set(x, "_switch", value.asInstanceOf[js.Any])
    }
  }
}
