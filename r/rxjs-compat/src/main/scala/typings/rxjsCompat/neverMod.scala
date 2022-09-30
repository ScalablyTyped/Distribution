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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object neverMod {
  
  @JSImport("rxjs-compat/add/observable/never", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object internalObservableMod {
    
    trait Observable[T] extends StObject {
      
      def _catch[T, R](
        selector: js.Function2[
              /* err */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* caught */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
            ]
      ): Any
      @JSName("_catch")
      var _catch_Original: FnCallThisSelector
      
      def _do[T](next: js.Function1[/* x */ T, Unit]): Any
      def _do[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ Any, Unit]): Any
      def _do[T](
        next: js.Function1[/* x */ T, Unit],
        error: js.Function1[/* e */ Any, Unit],
        complete: js.Function0[Unit]
      ): Any
      def _do[T](next: js.Function1[/* x */ T, Unit], error: Unit, complete: js.Function0[Unit]): Any
      def _do[T](
        observer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialObserver<T> */ Any
      ): Any
      @JSName("_do")
      var _do_Original: FnCallThisNextErrorComplete
      
      def _finally[T](callback: js.Function0[Unit]): Any
      @JSName("_finally")
      var _finally_Original: FnCallThisCallback
      
      def _switch[T](): Any
      @JSName("_switch")
      var _switch_Original: FnCallThis
      @JSName("_switch")
      def _switch_TR[T, R](): Any
      
      def audit[T](
        durationSelector: js.Function1[
              /* value */ T, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ Any
            ]
      ): Any
      
      def auditTime[T](duration: Double): Any
      def auditTime[T](
        duration: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      @JSName("auditTime")
      var auditTime_Original: FnCallThisDurationScheduler
      
      @JSName("audit")
      var audit_Original: FnCall
      
      def buffer[T](
        closingNotifier: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
      ): Any
      
      def bufferCount[T](bufferSize: Double): Any
      def bufferCount[T](bufferSize: Double, startBufferEvery: Double): Any
      @JSName("bufferCount")
      var bufferCount_Original: FnCallThisBufferSizeStartBufferEvery
      
      def bufferTime[T](bufferTimeSpan: Double): Any
      def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double): Any
      def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, maxBufferSize: Double): Any
      def bufferTime[T](
        bufferTimeSpan: Double,
        bufferCreationInterval: Double,
        maxBufferSize: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def bufferTime[T](
        bufferTimeSpan: Double,
        bufferCreationInterval: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, maxBufferSize: Double): Any
      def bufferTime[T](
        bufferTimeSpan: Double,
        bufferCreationInterval: Null,
        maxBufferSize: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def bufferTime[T](
        bufferTimeSpan: Double,
        bufferCreationInterval: Null,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Unit, maxBufferSize: Double): Any
      def bufferTime[T](
        bufferTimeSpan: Double,
        bufferCreationInterval: Unit,
        maxBufferSize: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def bufferTime[T](
        bufferTimeSpan: Double,
        bufferCreationInterval: Unit,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def bufferTime[T](
        bufferTimeSpan: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      @JSName("bufferTime")
      var bufferTime_Original: FnCallThisBufferTimeSpanBufferCreationIntervalMaxBufferSizeScheduler
      
      def bufferToggle[T, O](
        openings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<O> */ Any,
        closingSelector: js.Function1[
              /* openValue */ O, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
            ]
      ): Any
      @JSName("bufferToggle")
      var bufferToggle_Original: FnCallThisOpeningsClosingSelector
      
      def bufferWhen[T](
        closingSelector: js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
            ]
      ): Any
      @JSName("bufferWhen")
      var bufferWhen_Original: FnCallThisClosingSelector
      
      @JSName("buffer")
      var buffer_Original: FnCallThisClosingNotifier
      
      def `catch`[T, R](
        selector: js.Function2[
              /* err */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* caught */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
            ]
      ): Any
      @JSName("catch")
      var catch_Original: FnCallThisSelector
      
      def combineAll[T](): Any
      def combineAll[R](project: js.Function1[/* repeated */ Any, R]): Any
      @JSName("combineAll")
      var combineAll_Original: FnCallThisProject
      @JSName("combineAll")
      def combineAll_TR[T, R](): Any
      @JSName("combineAll")
      def combineAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): Any
      
      def combineLatest[T, R](
        array: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any
            ]
      ): Any
      def combineLatest[T, R](
        observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any) | (js.Function1[/* repeated */ T, R]))*
      ): Any
      def combineLatest[T, R](project: js.Function1[/* v1 */ T, R]): Any
      def combineLatest[T, T2](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any
      ): Any
      def combineLatest[T, TOther, R](
        array: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<TOther> */ Any
            ],
        project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
      ): Any
      def combineLatest[T, T2, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        project: js.Function2[/* v1 */ T, /* v2 */ T2, R]
      ): Any
      def combineLatest[T, T2, T3](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any
      ): Any
      def combineLatest[T, T2, T3, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
      ): Any
      def combineLatest[T, T2, T3, T4](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any
      ): Any
      def combineLatest[T, T2, T3, T4, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
      ): Any
      def combineLatest[T, T2, T3, T4, T5](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any
      ): Any
      def combineLatest[T, T2, T3, T4, T5, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
      ): Any
      def combineLatest[T, T2, T3, T4, T5, T6](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ Any
      ): Any
      def combineLatest[T, T2, T3, T4, T5, T6, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ Any,
        project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
      ): Any
      @JSName("combineLatest")
      var combineLatest_Original: FnCallThisV2V3V4V5V6Project
      
      def concat[T](): Any
      def concat[T](
        observables: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any)*
      ): Any
      def concat[T](
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def concat[T, T2](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def concat[T, T2, T3](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def concat[T, T2, T3, T4](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def concat[T, T2, T3, T4, T5](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def concat[T, T2, T3, T4, T5, T6](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      
      def concatAll[T](): Any
      @JSName("concatAll")
      var concatAll_Original: FnCallThis
      @JSName("concatAll")
      def concatAll_TR[T, R](): Any
      
      def concatMap[T, R](
        project: js.Function2[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
            ]
      ): Any
      
      def concatMapTo[T, R](
        innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ Any
      ): Any
      @JSName("concatMapTo")
      var concatMapTo_Original: FnCallThisInnerObservable
      
      @JSName("concatMap")
      var concatMap_Original: Fn0
      
      @JSName("concat")
      var concat_Original: FnCallThisV2V3V4V5V6Scheduler
      @JSName("concat")
      def concat_TR[T, R](
        observables: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ Any)*
      ): Any
      @JSName("concat")
      def concat_TT2[T, T2](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any
      ): Any
      @JSName("concat")
      def concat_TT2T3[T, T2, T3](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any
      ): Any
      @JSName("concat")
      def concat_TT2T3T4[T, T2, T3, T4](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any
      ): Any
      @JSName("concat")
      def concat_TT2T3T4T5[T, T2, T3, T4, T5](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any
      ): Any
      @JSName("concat")
      def concat_TT2T3T4T5T6[T, T2, T3, T4, T5, T6](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ Any
      ): Any
      
      def count[T](): Any
      def count[T](
        predicate: js.Function3[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
              Boolean
            ]
      ): Any
      @JSName("count")
      var count_Original: FnCallThisPredicate
      
      def debounce[T](
        durationSelector: js.Function1[
              /* value */ T, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ Any
            ]
      ): Any
      
      def debounceTime[T](dueTime: Double): Any
      def debounceTime[T](
        dueTime: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      @JSName("debounceTime")
      var debounceTime_Original: FnCallThisDueTimeScheduler
      
      @JSName("debounce")
      var debounce_Original: FnCall
      
      def defaultIfEmpty[T](): Any
      def defaultIfEmpty[T](defaultValue: T): Any
      @JSName("defaultIfEmpty")
      var defaultIfEmpty_Original: FnCallThisDefaultValue
      @JSName("defaultIfEmpty")
      def defaultIfEmpty_TR[T, R](): Any
      @JSName("defaultIfEmpty")
      def defaultIfEmpty_TR[T, R](defaultValue: R): Any
      
      def delay[T](delay: js.Date): Any
      def delay[T](
        delay: js.Date,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def delay[T](delay: Double): Any
      def delay[T](
        delay: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      
      def delayWhen[T](
        delayDurationSelector: js.Function1[
              /* value */ T, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
            ]
      ): Any
      def delayWhen[T](
        delayDurationSelector: js.Function1[
              /* value */ T, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
            ],
        subscriptionDelay: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
      ): Any
      @JSName("delayWhen")
      var delayWhen_Original: FnCallThisDelayDurationSelectorSubscriptionDelay
      
      @JSName("delay")
      var delay_Original: FnCallThisDelayScheduler
      
      def dematerialize[T](): Any
      @JSName("dematerialize")
      var dematerialize_Original: Fn1
      
      def distinct[T, K](): Any
      def distinct[T, K](keySelector: js.Function1[/* value */ T, K]): Any
      def distinct[T, K](
        keySelector: js.Function1[/* value */ T, K],
        flushes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
      ): Any
      def distinct[T, K](
        keySelector: Unit,
        flushes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
      ): Any
      
      def distinctUntilChanged[T](): Any
      def distinctUntilChanged[T](compare: js.Function2[/* x */ T, /* y */ T, Boolean]): Any
      def distinctUntilChanged[T, K](compare: js.Function2[/* x */ K, /* y */ K, Boolean], keySelector: js.Function1[/* x */ T, K]): Any
      @JSName("distinctUntilChanged")
      var distinctUntilChanged_Original: FnCallThisCompareKeySelector
      
      def distinctUntilKeyChanged[T](key: /* keyof T */ String): Any
      def distinctUntilKeyChanged[T, K /* <: /* keyof T */ String */](
        key: K,
        compare: js.Function2[
              /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* x */ js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* y */ js.Any, 
              Boolean
            ]
      ): Any
      @JSName("distinctUntilKeyChanged")
      var distinctUntilKeyChanged_Original: FnCallThisKeyCompare
      
      @JSName("distinct")
      var distinct_Original: FnCallThisKeySelectorFlushes
      
      def `do`[T](next: js.Function1[/* x */ T, Unit]): Any
      def `do`[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ Any, Unit]): Any
      def `do`[T](
        next: js.Function1[/* x */ T, Unit],
        error: js.Function1[/* e */ Any, Unit],
        complete: js.Function0[Unit]
      ): Any
      def `do`[T](next: js.Function1[/* x */ T, Unit], error: Unit, complete: js.Function0[Unit]): Any
      def `do`[T](
        observer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialObserver<T> */ Any
      ): Any
      @JSName("do")
      var do_Original: FnCallThisNextErrorComplete
      
      def elementAt[T](index: Double): Any
      def elementAt[T](index: Double, defaultValue: T): Any
      @JSName("elementAt")
      var elementAt_Original: FnCallThisIndexDefaultValue
      
      def every[T](
        predicate: js.Function3[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
              Boolean
            ]
      ): Any
      def every[T](
        predicate: js.Function3[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
              Boolean
            ],
        thisArg: Any
      ): Any
      @JSName("every")
      var every_Original: FnCallThisPredicateThisArg
      
      def exhaust[T](): Any
      
      def exhaustMap[T, R](
        project: js.Function2[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
            ]
      ): Any
      @JSName("exhaustMap")
      var exhaustMap_Original: Fn0
      
      @JSName("exhaust")
      var exhaust_Original: FnCallThis
      @JSName("exhaust")
      def exhaust_TR[T, R](): Any
      
      def expand[T](
        project: js.Function2[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any
            ]
      ): Any
      def expand[T](
        project: js.Function2[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any
            ],
        concurrent: Double
      ): Any
      def expand[T](
        project: js.Function2[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any
            ],
        concurrent: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def expand[T](
        project: js.Function2[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any
            ],
        concurrent: Unit,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      @JSName("expand")
      var expand_Original: FnCallThisProjectConcurrentScheduler
      @JSName("expand")
      def expand_TR[T, R](
        project: js.Function2[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
            ]
      ): Any
      @JSName("expand")
      def expand_TR[T, R](
        project: js.Function2[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
            ],
        concurrent: Double
      ): Any
      @JSName("expand")
      def expand_TR[T, R](
        project: js.Function2[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
            ],
        concurrent: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      @JSName("expand")
      def expand_TR[T, R](
        project: js.Function2[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
            ],
        concurrent: Unit,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      
      def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): Any
      def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: Any): Any
      @JSName("filter")
      var filter_Original: Fn2
      @JSName("filter")
      def filter_TS[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): Any
      @JSName("filter")
      def filter_TS[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], thisArg: Any): Any
      
      def `finally`[T](callback: js.Function0[Unit]): Any
      @JSName("finally")
      var finally_Original: FnCallThisCallback
      
      def find[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): Any
      def find[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: Any): Any
      
      def findIndex[T](
        predicate: js.Function3[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
              Boolean
            ]
      ): Any
      def findIndex[T](
        predicate: js.Function3[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
              Boolean
            ],
        thisArg: Any
      ): Any
      @JSName("findIndex")
      var findIndex_Original: FnCallThisPredicateThisArg
      
      @JSName("find")
      var find_Original: Fn2
      @JSName("find")
      def find_TS[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): Any
      @JSName("find")
      def find_TS[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], thisArg: Any): Any
      
      def first[T, D](): Any
      def first[T, S /* <: T */](
        predicate: js.Function3[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
              /* is S */ Boolean
            ]
      ): Any
      def first[T, S /* <: T */](
        predicate: js.Function3[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
              /* is S */ Boolean
            ],
        defaultValue: S
      ): Any
      def first[T, D](predicate: Null, defaultValue: D): Any
      def first[T, D](predicate: Unit, defaultValue: D): Any
      @JSName("first")
      var first_Original: FnCallThisPredicateDefaultValue
      @JSName("first")
      def first_TD[T, D](
        predicate: js.Function3[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
              Boolean
            ]
      ): Any
      @JSName("first")
      def first_TD[T, D](
        predicate: js.Function3[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
              Boolean
            ],
        defaultValue: D
      ): Any
      
      def flatMap[T, R](
        project: js.Function2[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
            ]
      ): Any
      def flatMap[T, R](
        project: js.Function2[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
            ],
        concurrent: Double
      ): Any
      
      def flatMapTo[T, R](
        innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
      ): Any
      def flatMapTo[T, R](
        innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any,
        concurrent: Double
      ): Any
      @JSName("flatMapTo")
      var flatMapTo_Original: FnCallThisInnerObservableConcurrent
      
      @JSName("flatMap")
      var flatMap_Original: FnCallThisProjectConcurrent
      
      def groupBy[T, K](keySelector: js.Function1[/* value */ T, K]): Any
      def groupBy[T, K](
        keySelector: js.Function1[/* value */ T, K],
        elementSelector: Unit,
        durationSelector: js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ /* grouped */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
            ]
      ): Any
      def groupBy[T, K, R](keySelector: js.Function1[/* value */ T, K], elementSelector: js.Function1[/* value */ T, R]): Any
      def groupBy[T, K, R](
        keySelector: js.Function1[/* value */ T, K],
        elementSelector: js.Function1[/* value */ T, R],
        durationSelector: js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
            ]
      ): Any
      def groupBy[T, K, R](
        keySelector: js.Function1[/* value */ T, K],
        elementSelector: js.Function1[/* value */ T, R],
        durationSelector: js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
            ],
        subjectSelector: js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ Any
            ]
      ): Any
      def groupBy[T, K, R](
        keySelector: js.Function1[/* value */ T, K],
        elementSelector: js.Function1[/* value */ T, R],
        durationSelector: Unit,
        subjectSelector: js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ Any
            ]
      ): Any
      def groupBy[T, K, R](
        keySelector: js.Function1[/* value */ T, K],
        elementSelector: Unit,
        durationSelector: js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
            ],
        subjectSelector: js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ Any
            ]
      ): Any
      def groupBy[T, K, R](
        keySelector: js.Function1[/* value */ T, K],
        elementSelector: Unit,
        durationSelector: Unit,
        subjectSelector: js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ Any
            ]
      ): Any
      @JSName("groupBy")
      var groupBy_Original: FnCallThisKeySelectorElementSelectorDurationSelectorSubjectSelector
      @JSName("groupBy")
      def groupBy_TKR[T, K, R](keySelector: js.Function1[/* value */ T, K]): Any
      @JSName("groupBy")
      def groupBy_TKR[T, K, R](
        keySelector: js.Function1[/* value */ T, K],
        elementSelector: Unit,
        durationSelector: js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
            ]
      ): Any
      
      def ignoreElements(): Any
      @JSName("ignoreElements")
      var ignoreElements_Original: js.ThisFunction0[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ /* this */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<never> */ Any
          ]
      
      def isEmpty[T](): Any
      @JSName("isEmpty")
      var isEmpty_Original: Fn1
      
      def last[T, D](): Any
      def last[T, S /* <: T */](
        predicate: js.Function3[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
              /* is S */ Boolean
            ]
      ): Any
      def last[T, S /* <: T */](
        predicate: js.Function3[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
              /* is S */ Boolean
            ],
        defaultValue: S
      ): Any
      def last[T, D](predicate: Null, defaultValue: D): Any
      def last[T, D](predicate: Unit, defaultValue: D): Any
      @JSName("last")
      var last_Original: FnCallThisPredicateDefaultValue
      @JSName("last")
      def last_TD[T, D](
        predicate: js.Function3[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
              Boolean
            ]
      ): Any
      @JSName("last")
      def last_TD[T, D](
        predicate: js.Function3[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
              Boolean
            ],
        defaultValue: D
      ): Any
      
      def let[T, R](
        func: js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* selector */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ Any
            ]
      ): Any
      
      def letBind[T, R](
        func: js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* selector */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ Any
            ]
      ): Any
      @JSName("letBind")
      var letBind_Original: FnCallThisFunc
      
      @JSName("let")
      var let_Original: FnCallThisFunc
      
      def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R]): Any
      def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R], thisArg: Any): Any
      
      def mapTo[T, R](value: R): Any
      @JSName("mapTo")
      var mapTo_Original: FnCallThisValue
      
      @JSName("map")
      var map_Original: FnCallThisProjectThisArg
      
      def materialize[T](): Any
      @JSName("materialize")
      var materialize_Original: Fn1
      
      def max[T](): Any
      def max[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): Any
      @JSName("max")
      var max_Original: FnCallThisComparer
      
      def merge[T](): Any
      def merge[T](concurrent: Double): Any
      def merge[T](
        concurrent: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def merge[T](
        concurrent: Unit,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def merge[T](
        observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any) | Double)*
      ): Any
      def merge[T](
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def merge[T, T2](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        concurrent: Double
      ): Any
      def merge[T, T2](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        concurrent: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def merge[T, T2](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        concurrent: Unit,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def merge[T, T2](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def merge[T, T2, T3](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        concurrent: Double
      ): Any
      def merge[T, T2, T3](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        concurrent: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def merge[T, T2, T3](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        concurrent: Unit,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def merge[T, T2, T3](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def merge[T, T2, T3, T4](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        concurrent: Double
      ): Any
      def merge[T, T2, T3, T4](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        concurrent: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def merge[T, T2, T3, T4](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        concurrent: Unit,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def merge[T, T2, T3, T4](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def merge[T, T2, T3, T4, T5](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        concurrent: Double
      ): Any
      def merge[T, T2, T3, T4, T5](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        concurrent: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def merge[T, T2, T3, T4, T5](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        concurrent: Unit,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def merge[T, T2, T3, T4, T5](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def merge[T, T2, T3, T4, T5, T6](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ Any,
        concurrent: Double
      ): Any
      def merge[T, T2, T3, T4, T5, T6](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ Any,
        concurrent: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def merge[T, T2, T3, T4, T5, T6](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ Any,
        concurrent: Unit,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def merge[T, T2, T3, T4, T5, T6](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      
      def mergeAll[T](): Any
      def mergeAll[T](concurrent: Double): Any
      @JSName("mergeAll")
      var mergeAll_Original: FnCallThisConcurrent
      @JSName("mergeAll")
      def mergeAll_TR[T, R](): Any
      @JSName("mergeAll")
      def mergeAll_TR[T, R](concurrent: Double): Any
      
      def mergeMap[T, R](
        project: js.Function2[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
            ]
      ): Any
      def mergeMap[T, R](
        project: js.Function2[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
            ],
        concurrent: Double
      ): Any
      
      def mergeMapTo[T, R](
        innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
      ): Any
      def mergeMapTo[T, R](
        innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any,
        concurrent: Double
      ): Any
      @JSName("mergeMapTo")
      var mergeMapTo_Original: FnCallThisInnerObservableConcurrent
      
      @JSName("mergeMap")
      var mergeMap_Original: FnCallThisProjectConcurrent
      
      def mergeScan[T, R](
        accumulator: js.Function2[
              /* acc */ R, 
              /* value */ T, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
            ],
        seed: R
      ): Any
      def mergeScan[T, R](
        accumulator: js.Function2[
              /* acc */ R, 
              /* value */ T, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
            ],
        seed: R,
        concurrent: Double
      ): Any
      @JSName("mergeScan")
      var mergeScan_Original: FnCallThisAccumulatorSeedConcurrent
      
      @JSName("merge")
      var merge_Original: FnCallThisV2V3V4V5V6ConcurrentScheduler
      @JSName("merge")
      def merge_TR[T, R](
        observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ Any) | Double)*
      ): Any
      @JSName("merge")
      def merge_TT2[T, T2](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any
      ): Any
      @JSName("merge")
      def merge_TT2T3[T, T2, T3](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any
      ): Any
      @JSName("merge")
      def merge_TT2T3T4[T, T2, T3, T4](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any
      ): Any
      @JSName("merge")
      def merge_TT2T3T4T5[T, T2, T3, T4, T5](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any
      ): Any
      @JSName("merge")
      def merge_TT2T3T4T5T6[T, T2, T3, T4, T5, T6](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ Any
      ): Any
      
      def min[T](): Any
      def min[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): Any
      @JSName("min")
      var min_Original: FnCallThisComparer
      
      def multicast[T](
        SubjectFactory: js.ThisFunction0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ Any
            ]
      ): Any
      def multicast[T](
        SubjectFactory: js.ThisFunction0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ Any
            ],
        selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ Any
      ): Any
      def multicast[T](
        subjectOrSubjectFactory: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FactoryOrValue<Subject<T>> */ Any
      ): Any
      @JSName("multicast")
      var multicast_Original: FnCallSubjectFactorySelector
      @JSName("multicast")
      def multicast_TR[T, R](
        SubjectFactory: js.ThisFunction0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ Any
            ]
      ): Any
      @JSName("multicast")
      def multicast_TR[T, R](
        SubjectFactory: js.ThisFunction0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ Any
            ],
        selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ Any
      ): Any
      
      def observeOn[T](
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def observeOn[T](
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any,
        delay: Double
      ): Any
      @JSName("observeOn")
      var observeOn_Original: FnCallThisSchedulerDelay
      
      def onErrorResumeNext[T](): Any
      def onErrorResumeNext[T, R](
        array: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ Any
            ]
      ): Any
      def onErrorResumeNext[T, R](
        observables: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ Any)*
      ): Any
      def onErrorResumeNext[T, R](
        v: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
      ): Any
      def onErrorResumeNext[T, T2, T3, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any
      ): Any
      def onErrorResumeNext[T, T2, T3, T4, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any
      ): Any
      def onErrorResumeNext[T, T2, T3, T4, T5, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any
      ): Any
      def onErrorResumeNext[T, T2, T3, T4, T5, T6, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ Any
      ): Any
      @JSName("onErrorResumeNext")
      var onErrorResumeNext_Original: FnCallThisV2V3V4V5V6
      @JSName("onErrorResumeNext")
      def onErrorResumeNext_TT2R[T, T2, R](
        v: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any
      ): Any
      
      def pairwise[T](): Any
      @JSName("pairwise")
      var pairwise_Original: Fn1
      
      def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Tuple2[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any
          ]
      def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: Any): js.Tuple2[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any
          ]
      @JSName("partition")
      var partition_Original: Fn3
      
      def pluck[T, R](properties: String*): Any
      @JSName("pluck")
      var pluck_Original: FnCallThisProperties
      
      def publish[T](): Any
      def publish[T](
        selector: js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any
            ]
      ): Any
      
      def publishBehavior[T](value: T): Any
      @JSName("publishBehavior")
      var publishBehavior_Original: Fn5
      
      def publishLast[T](): Any
      @JSName("publishLast")
      var publishLast_Original: Fn1
      
      def publishReplay[T](): Any
      def publishReplay[T](bufferSize: Double): Any
      def publishReplay[T](bufferSize: Double, windowTime: Double): Any
      def publishReplay[T](
        bufferSize: Double,
        windowTime: Double,
        selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def publishReplay[T](
        bufferSize: Double,
        windowTime: Double,
        selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def publishReplay[T](
        bufferSize: Double,
        windowTime: Double,
        selector: Unit,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def publishReplay[T](
        bufferSize: Double,
        windowTime: Unit,
        selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def publishReplay[T](
        bufferSize: Double,
        windowTime: Unit,
        selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def publishReplay[T](
        bufferSize: Double,
        windowTime: Unit,
        selector: Unit,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def publishReplay[T](bufferSize: Unit, windowTime: Double): Any
      def publishReplay[T](
        bufferSize: Unit,
        windowTime: Double,
        selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def publishReplay[T](
        bufferSize: Unit,
        windowTime: Double,
        selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def publishReplay[T](
        bufferSize: Unit,
        windowTime: Double,
        selector: Unit,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def publishReplay[T](
        bufferSize: Unit,
        windowTime: Unit,
        selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def publishReplay[T](
        bufferSize: Unit,
        windowTime: Unit,
        selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def publishReplay[T](
        bufferSize: Unit,
        windowTime: Unit,
        selector: Unit,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      @JSName("publishReplay")
      var publishReplay_Original: FnCallThisBufferSizeWindowTimeSelectorScheduler
      @JSName("publishReplay")
      def publishReplay_TR[T, R](): Any
      @JSName("publishReplay")
      def publishReplay_TR[T, R](bufferSize: Double): Any
      @JSName("publishReplay")
      def publishReplay_TR[T, R](bufferSize: Double, windowTime: Double): Any
      @JSName("publishReplay")
      def publishReplay_TR[T, R](
        bufferSize: Double,
        windowTime: Double,
        selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ Any
      ): Any
      @JSName("publishReplay")
      def publishReplay_TR[T, R](
        bufferSize: Double,
        windowTime: Unit,
        selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ Any
      ): Any
      @JSName("publishReplay")
      def publishReplay_TR[T, R](bufferSize: Unit, windowTime: Double): Any
      @JSName("publishReplay")
      def publishReplay_TR[T, R](
        bufferSize: Unit,
        windowTime: Double,
        selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ Any
      ): Any
      @JSName("publishReplay")
      def publishReplay_TR[T, R](
        bufferSize: Unit,
        windowTime: Unit,
        selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ Any
      ): Any
      
      @JSName("publish")
      var publish_Original: Fn4
      @JSName("publish")
      def publish_TR[T, R](
        selector: js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ Any
            ]
      ): Any
      
      def race[T](
        observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any
            ]))*
      ): Any
      def race[T](
        observables: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any
            ]
      ): Any
      @JSName("race")
      var race_Original: FnCallThisObservables
      @JSName("race")
      def race_TR[T, R](
        observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
            ]))*
      ): Any
      @JSName("race")
      def race_TR[T, R](
        observables: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any
            ]
      ): Any
      
      def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): Any
      def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): Any
      @JSName("reduce")
      var reduce_Original: FnCallThisAccumulatorSeed
      @JSName("reduce")
      def reduce_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): Any
      @JSName("reduce")
      def reduce_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): Any
      
      def repeat[T](): Any
      def repeat[T](count: Double): Any
      
      def repeatWhen[T](
        notifier: js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ /* errors */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
            ]
      ): Any
      @JSName("repeatWhen")
      var repeatWhen_Original: FnCallThisNotifier
      
      @JSName("repeat")
      var repeat_Original: FnCallThisCount
      
      def retry[T](): Any
      def retry[T](count: Double): Any
      
      def retryWhen[T](
        notifier: js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ /* errors */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
            ]
      ): Any
      @JSName("retryWhen")
      var retryWhen_Original: FnCallThisNotifier
      
      @JSName("retry")
      var retry_Original: FnCallThisCount
      
      def sample[T](
        notifier: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
      ): Any
      
      def sampleTime[T](period: Double): Any
      def sampleTime[T](
        period: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      @JSName("sampleTime")
      var sampleTime_Original: FnCallThisPeriodScheduler
      
      @JSName("sample")
      var sample_Original: Fn6
      
      def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): Any
      def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): Any
      @JSName("scan")
      var scan_Original: FnCallThisAccumulatorSeed
      @JSName("scan")
      def scan_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): Any
      @JSName("scan")
      def scan_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): Any
      
      def sequenceEqual[T](
        compareTo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any
      ): Any
      def sequenceEqual[T](
        compareTo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ Any,
        comparor: js.Function2[/* a */ T, /* b */ T, Boolean]
      ): Any
      @JSName("sequenceEqual")
      var sequenceEqual_Original: FnCallThisCompareToComparor
      
      def share[T](): Any
      
      def shareReplay[T](): Any
      def shareReplay[T](bufferSize: Double): Any
      def shareReplay[T](bufferSize: Double, windowTime: Double): Any
      def shareReplay[T](
        bufferSize: Double,
        windowTime: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def shareReplay[T](
        bufferSize: Double,
        windowTime: Unit,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def shareReplay[T](bufferSize: Unit, windowTime: Double): Any
      def shareReplay[T](
        bufferSize: Unit,
        windowTime: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def shareReplay[T](
        bufferSize: Unit,
        windowTime: Unit,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def shareReplay[T](
        config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShareReplayConfig */ Any
      ): Any
      @JSName("shareReplay")
      var shareReplay_Original: FnCallThisBufferSizeWindowTimeScheduler
      
      @JSName("share")
      var share_Original: Fn1
      
      def single[T](): Any
      def single[T](
        predicate: js.Function3[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
              Boolean
            ]
      ): Any
      @JSName("single")
      var single_Original: FnCallThisPredicate
      
      def skip[T](count: Double): Any
      
      def skipLast[T](count: Double): Any
      @JSName("skipLast")
      var skipLast_Original: Fn7
      
      def skipUntil[T](
        notifier: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
      ): Any
      @JSName("skipUntil")
      var skipUntil_Original: Fn6
      
      def skipWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): Any
      @JSName("skipWhile")
      var skipWhile_Original: Fn8
      
      @JSName("skip")
      var skip_Original: Fn7
      
      def startWith[T](): Any
      def startWith[T](
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def startWith[T, D](
        array: (D | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any))*
      ): Any
      def startWith[T, D](
        v1: D,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def startWith[T, D, E](
        v1: D,
        v2: E,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def startWith[T, D, E, F](
        v1: D,
        v2: E,
        v3: F,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def startWith[T, D, E, F, G](
        v1: D,
        v2: E,
        v3: F,
        v4: G,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def startWith[T, D, E, F, G, H](
        v1: D,
        v2: E,
        v3: F,
        v4: G,
        v5: H,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def startWith[T, D, E, F, G, H, I](
        v1: D,
        v2: E,
        v3: F,
        v4: G,
        v5: H,
        v6: I,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      @JSName("startWith")
      var startWith_Original: FnCallThisV1V2V3V4V5V6Scheduler
      @JSName("startWith")
      def startWith_TD[T, D](v1: D): Any
      @JSName("startWith")
      def startWith_TDE[T, D, E](v1: D, v2: E): Any
      @JSName("startWith")
      def startWith_TDEF[T, D, E, F](v1: D, v2: E, v3: F): Any
      @JSName("startWith")
      def startWith_TDEFG[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G): Any
      @JSName("startWith")
      def startWith_TDEFGH[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H): Any
      @JSName("startWith")
      def startWith_TDEFGHI[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I): Any
      
      def subscribeOn[T](
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def subscribeOn[T](
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any,
        delay: Double
      ): Any
      @JSName("subscribeOn")
      var subscribeOn_Original: FnCallThisSchedulerDelay
      
      def switch[T](): Any
      
      def switchMap[T, R](
        project: js.Function2[
              /* value */ T, 
              /* index */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
            ]
      ): Any
      
      def switchMapTo[T, R](
        observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
      ): Any
      def switchMapTo[T, I, R](
        observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<I> */ Any,
        resultSelector: js.Function4[
              /* outerValue */ T, 
              /* innerValue */ I, 
              /* outerIndex */ Double, 
              /* innerIndex */ Double, 
              R
            ]
      ): Any
      @JSName("switchMapTo")
      var switchMapTo_Original: FnCallThisObservableResultSelector
      
      @JSName("switchMap")
      var switchMap_Original: Fn0
      
      @JSName("switch")
      var switch_Original: FnCallThis
      @JSName("switch")
      def switch_TR[T, R](): Any
      
      def take[T](count: Double): Any
      
      def takeLast[T](count: Double): Any
      @JSName("takeLast")
      var takeLast_Original: Fn7
      
      def takeUntil[T](
        notifier: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
      ): Any
      @JSName("takeUntil")
      var takeUntil_Original: Fn6
      
      def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): Any
      @JSName("takeWhile")
      var takeWhile_Original: Fn8
      
      @JSName("take")
      var take_Original: Fn7
      
      def throttle[T](
        durationSelector: js.Function1[
              /* value */ T, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ Any
            ]
      ): Any
      def throttle[T](
        durationSelector: js.Function1[
              /* value */ T, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ Any
            ],
        config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ Any
      ): Any
      
      def throttleTime[T](duration: Double): Any
      def throttleTime[T](
        duration: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def throttleTime[T](
        duration: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any,
        config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ Any
      ): Any
      def throttleTime[T](
        duration: Double,
        scheduler: Unit,
        config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ Any
      ): Any
      @JSName("throttleTime")
      var throttleTime_Original: FnCallThisDurationSchedulerConfig
      
      @JSName("throttle")
      var throttle_Original: FnCallThisDurationSelectorConfig
      
      def timeInterval[T](): Any
      def timeInterval[T](
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      @JSName("timeInterval")
      var timeInterval_Original: FnCallThisScheduler
      
      def timeout[T](due: js.Date): Any
      def timeout[T](
        due: js.Date,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def timeout[T](due: Double): Any
      def timeout[T](
        due: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      
      def timeoutWith[T](
        due: js.Date,
        withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any
      ): Any
      def timeoutWith[T](
        due: js.Date,
        withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def timeoutWith[T](
        due: Double,
        withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any
      ): Any
      def timeoutWith[T](
        due: Double,
        withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      @JSName("timeoutWith")
      var timeoutWith_Original: FnCallThisDueWithObservableScheduler
      @JSName("timeoutWith")
      def timeoutWith_TR[T, R](
        due: js.Date,
        withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
      ): Any
      @JSName("timeoutWith")
      def timeoutWith_TR[T, R](
        due: js.Date,
        withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      @JSName("timeoutWith")
      def timeoutWith_TR[T, R](
        due: Double,
        withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any
      ): Any
      @JSName("timeoutWith")
      def timeoutWith_TR[T, R](
        due: Double,
        withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ Any,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      
      @JSName("timeout")
      var timeout_Original: FnCallThisDueScheduler
      
      def timestamp[T](): Any
      def timestamp[T](
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      @JSName("timestamp")
      var timestamp_Original: FnCallThisScheduler
      
      def toArray[T](): Any
      @JSName("toArray")
      var toArray_Original: Fn1
      
      def window[T](
        windowBoundaries: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
      ): Any
      
      def windowCount[T](windowSize: Double): Any
      def windowCount[T](windowSize: Double, startWindowEvery: Double): Any
      @JSName("windowCount")
      var windowCount_Original: FnCallThisWindowSizeStartWindowEvery
      
      def windowTime[T](windowTimeSpan: Double): Any
      def windowTime[T](
        windowTimeSpan: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double): Any
      def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, maxWindowSize: Double): Any
      def windowTime[T](
        windowTimeSpan: Double,
        windowCreationInterval: Double,
        maxWindowSize: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      def windowTime[T](
        windowTimeSpan: Double,
        windowCreationInterval: Double,
        scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
      ): Any
      @JSName("windowTime")
      var windowTime_Original: FnCallThisWindowTimeSpanWindowCreationIntervalMaxWindowSizeScheduler
      
      def windowToggle[T, O](
        openings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<O> */ Any,
        closingSelector: js.Function1[
              /* openValue */ O, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
            ]
      ): Any
      @JSName("windowToggle")
      var windowToggle_Original: FnCallThisOpeningsClosingSelector
      
      def windowWhen[T](
        closingSelector: js.Function0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
            ]
      ): Any
      @JSName("windowWhen")
      var windowWhen_Original: FnCallThisClosingSelector
      
      @JSName("window")
      var window_Original: FnCallThisWindowBoundaries
      
      def withLatestFrom[T, R](
        array: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ Any
            ]
      ): Any
      def withLatestFrom[T, R](
        array: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ Any
            ],
        project: js.Function1[/* repeated */ Any, R]
      ): Any
      def withLatestFrom[T, R](
        observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ Any) | (js.Function1[/* repeated */ Any, R]))*
      ): Any
      def withLatestFrom[T, R](project: js.Function1[/* v1 */ T, R]): Any
      def withLatestFrom[T, T2](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any
      ): Any
      def withLatestFrom[T, T2, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        project: js.Function2[/* v1 */ T, /* v2 */ T2, R]
      ): Any
      def withLatestFrom[T, T2, T3](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any
      ): Any
      def withLatestFrom[T, T2, T3, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
      ): Any
      def withLatestFrom[T, T2, T3, T4](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any
      ): Any
      def withLatestFrom[T, T2, T3, T4, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
      ): Any
      def withLatestFrom[T, T2, T3, T4, T5](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any
      ): Any
      def withLatestFrom[T, T2, T3, T4, T5, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
      ): Any
      def withLatestFrom[T, T2, T3, T4, T5, T6](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ Any
      ): Any
      def withLatestFrom[T, T2, T3, T4, T5, T6, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ Any,
        project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
      ): Any
      @JSName("withLatestFrom")
      var withLatestFrom_Original: Fn9
      
      def zip[T](
        observables: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any)*
      ): Any
      def zip[T, R](
        array: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any
            ]
      ): Any
      def zip[T, R](project: js.Function1[/* v1 */ T, R]): Any
      def zip[T, T2](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any
      ): Any
      def zip[T, TOther, R](
        array: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<TOther> */ Any
            ],
        project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
      ): Any
      def zip[T, T2, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        project: js.Function2[/* v1 */ T, /* v2 */ T2, R]
      ): Any
      def zip[T, T2, T3](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any
      ): Any
      def zip[T, T2, T3, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
      ): Any
      def zip[T, T2, T3, T4](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any
      ): Any
      def zip[T, T2, T3, T4, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
      ): Any
      def zip[T, T2, T3, T4, T5](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any
      ): Any
      def zip[T, T2, T3, T4, T5, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
      ): Any
      def zip[T, T2, T3, T4, T5, T6](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ Any
      ): Any
      def zip[T, T2, T3, T4, T5, T6, R](
        v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ Any,
        v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ Any,
        v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ Any,
        v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ Any,
        v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ Any,
        project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
      ): Any
      
      def zipAll[T](): Any
      def zipAll[R](project: js.Function1[/* repeated */ Any, R]): Any
      @JSName("zipAll")
      var zipAll_Original: FnCallThisProject
      @JSName("zipAll")
      def zipAll_TR[T, R](): Any
      @JSName("zipAll")
      def zipAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): Any
      
      @JSName("zip")
      var zip_Original: Fn10
      @JSName("zip")
      def zip_TR[T, R](
        observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ Any) | (js.Function1[/* repeated */ T, R]))*
      ): Any
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
        find: Fn2,
        findIndex: FnCallThisPredicateThisArg,
        first: FnCallThisPredicateDefaultValue,
        flatMap: FnCallThisProjectConcurrent,
        flatMapTo: FnCallThisInnerObservableConcurrent,
        groupBy: FnCallThisKeySelectorElementSelectorDurationSelectorSubjectSelector,
        ignoreElements: js.ThisFunction0[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ /* this */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<never> */ Any
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
      def ajax: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AjaxCreationMethod */ Any = js.native
      inline def ajax_=(
        x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AjaxCreationMethod */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ajax")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.bindCallback")
      @js.native
      def bindCallback: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticBindCallback */ Any = js.native
      inline def bindCallback_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticBindCallback */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bindCallback")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.bindNodeCallback")
      @js.native
      def bindNodeCallback: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticBindNodeCallback */ Any = js.native
      inline def bindNodeCallback_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticBindNodeCallback */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bindNodeCallback")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.combineLatest")
      @js.native
      def combineLatest: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof combineLatestStatic */ Any = js.native
      inline def combineLatest_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof combineLatestStatic */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("combineLatest")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.concat")
      @js.native
      def concat: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof concatStatic */ Any = js.native
      inline def concat_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof concatStatic */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("concat")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.defer")
      @js.native
      def defer: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticDefer */ Any = js.native
      inline def defer_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticDefer */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defer")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.empty")
      @js.native
      def empty: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticEmpty */ Any = js.native
      inline def empty_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticEmpty */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.forkJoin")
      @js.native
      def forkJoin: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticForkJoin */ Any = js.native
      inline def forkJoin_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticForkJoin */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forkJoin")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.from")
      @js.native
      def from: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFrom */ Any = js.native
      
      @JSImport("rxjs/internal/Observable", "Observable.fromEvent")
      @js.native
      def fromEvent: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFromEvent */ Any = js.native
      
      @JSImport("rxjs/internal/Observable", "Observable.fromEventPattern")
      @js.native
      def fromEventPattern: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFromEventPattern */ Any = js.native
      inline def fromEventPattern_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFromEventPattern */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromEventPattern")(x.asInstanceOf[js.Any])
      
      inline def fromEvent_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFromEvent */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromEvent")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.fromPromise")
      @js.native
      def fromPromise: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFromPromise */ Any = js.native
      inline def fromPromise_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFromPromise */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromPromise")(x.asInstanceOf[js.Any])
      
      inline def from_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticFrom */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("from")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.generate")
      @js.native
      def generate: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticGenerate */ Any = js.native
      inline def generate_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticGenerate */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generate")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.interval")
      @js.native
      def interval: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticInterval */ Any = js.native
      inline def interval_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticInterval */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interval")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.merge")
      @js.native
      def merge: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof mergeStatic */ Any = js.native
      inline def merge_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof mergeStatic */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("merge")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.of")
      @js.native
      def of: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticOf */ Any = js.native
      inline def of_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticOf */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("of")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.onErrorResumeNext")
      @js.native
      def onErrorResumeNext: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticOnErrorResumeNext */ Any = js.native
      inline def onErrorResumeNext_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticOnErrorResumeNext */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onErrorResumeNext")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.pairs")
      @js.native
      def pairs: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticPairs */ Any = js.native
      inline def pairs_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticPairs */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pairs")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.race")
      @js.native
      def race: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticRace */ Any = js.native
      inline def race_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticRace */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("race")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.range")
      @js.native
      def range: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticRange */ Any = js.native
      inline def range_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticRange */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("range")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.throwError")
      @js.native
      def throwError: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticThrowError */ Any = js.native
      inline def throwError_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticThrowError */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("throwError")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.timer")
      @js.native
      def timer: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticTimer */ Any = js.native
      inline def timer_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticTimer */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timer")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.using")
      @js.native
      val `using`: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticUsing */ Any = js.native
      
      @JSImport("rxjs/internal/Observable", "Observable.webSocket")
      @js.native
      def webSocket: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticWebSocket */ Any = js.native
      inline def webSocket_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof staticWebSocket */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webSocket")(x.asInstanceOf[js.Any])
      
      @JSImport("rxjs/internal/Observable", "Observable.zip")
      @js.native
      def zip: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof zipStatic */ Any = js.native
      inline def zip_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof zipStatic */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zip")(x.asInstanceOf[js.Any])
      
      extension [Self <: Observable[?], T](x: Self & Observable[T]) {
        
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
        
        inline def setFind(value: Fn2): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
        
        inline def setFindIndex(value: FnCallThisPredicateThisArg): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
        
        inline def setFirst(value: FnCallThisPredicateDefaultValue): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
        
        inline def setFlatMap(value: FnCallThisProjectConcurrent): Self = StObject.set(x, "flatMap", value.asInstanceOf[js.Any])
        
        inline def setFlatMapTo(value: FnCallThisInnerObservableConcurrent): Self = StObject.set(x, "flatMapTo", value.asInstanceOf[js.Any])
        
        inline def setGroupBy(value: FnCallThisKeySelectorElementSelectorDurationSelectorSubjectSelector): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
        
        inline def setIgnoreElements(
          value: js.ThisFunction0[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ /* this */ Any, 
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<never> */ Any
                ]
        ): Self = StObject.set(x, "ignoreElements", value.asInstanceOf[js.Any])
        
        inline def setIsEmpty(value: Fn1): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
        
        inline def setLast(value: FnCallThisPredicateDefaultValue): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
        
        inline def setLet(value: FnCallThisFunc): Self = StObject.set(x, "let", value.asInstanceOf[js.Any])
        
        inline def setLetBind(value: FnCallThisFunc): Self = StObject.set(x, "letBind", value.asInstanceOf[js.Any])
        
        inline def setMap(value: FnCallThisProjectThisArg): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
        
        inline def setMapTo(value: FnCallThisValue): Self = StObject.set(x, "mapTo", value.asInstanceOf[js.Any])
        
        inline def setMaterialize(value: Fn1): Self = StObject.set(x, "materialize", value.asInstanceOf[js.Any])
        
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
        
        inline def setPairwise(value: Fn1): Self = StObject.set(x, "pairwise", value.asInstanceOf[js.Any])
        
        inline def setPartition(value: Fn3): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
        
        inline def setPluck(value: FnCallThisProperties): Self = StObject.set(x, "pluck", value.asInstanceOf[js.Any])
        
        inline def setPublish(value: Fn4): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
        
        inline def setPublishBehavior(value: Fn5): Self = StObject.set(x, "publishBehavior", value.asInstanceOf[js.Any])
        
        inline def setPublishLast(value: Fn1): Self = StObject.set(x, "publishLast", value.asInstanceOf[js.Any])
        
        inline def setPublishReplay(value: FnCallThisBufferSizeWindowTimeSelectorScheduler): Self = StObject.set(x, "publishReplay", value.asInstanceOf[js.Any])
        
        inline def setRace(value: FnCallThisObservables): Self = StObject.set(x, "race", value.asInstanceOf[js.Any])
        
        inline def setReduce(value: FnCallThisAccumulatorSeed): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
        
        inline def setRepeat(value: FnCallThisCount): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
        
        inline def setRepeatWhen(value: FnCallThisNotifier): Self = StObject.set(x, "repeatWhen", value.asInstanceOf[js.Any])
        
        inline def setRetry(value: FnCallThisCount): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
        
        inline def setRetryWhen(value: FnCallThisNotifier): Self = StObject.set(x, "retryWhen", value.asInstanceOf[js.Any])
        
        inline def setSample(value: Fn6): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
        
        inline def setSampleTime(value: FnCallThisPeriodScheduler): Self = StObject.set(x, "sampleTime", value.asInstanceOf[js.Any])
        
        inline def setScan(value: FnCallThisAccumulatorSeed): Self = StObject.set(x, "scan", value.asInstanceOf[js.Any])
        
        inline def setSequenceEqual(value: FnCallThisCompareToComparor): Self = StObject.set(x, "sequenceEqual", value.asInstanceOf[js.Any])
        
        inline def setShare(value: Fn1): Self = StObject.set(x, "share", value.asInstanceOf[js.Any])
        
        inline def setShareReplay(value: FnCallThisBufferSizeWindowTimeScheduler): Self = StObject.set(x, "shareReplay", value.asInstanceOf[js.Any])
        
        inline def setSingle(value: FnCallThisPredicate): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
        
        inline def setSkip(value: Fn7): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
        
        inline def setSkipLast(value: Fn7): Self = StObject.set(x, "skipLast", value.asInstanceOf[js.Any])
        
        inline def setSkipUntil(value: Fn6): Self = StObject.set(x, "skipUntil", value.asInstanceOf[js.Any])
        
        inline def setSkipWhile(value: Fn8): Self = StObject.set(x, "skipWhile", value.asInstanceOf[js.Any])
        
        inline def setStartWith(value: FnCallThisV1V2V3V4V5V6Scheduler): Self = StObject.set(x, "startWith", value.asInstanceOf[js.Any])
        
        inline def setSubscribeOn(value: FnCallThisSchedulerDelay): Self = StObject.set(x, "subscribeOn", value.asInstanceOf[js.Any])
        
        inline def setSwitch(value: FnCallThis): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
        
        inline def setSwitchMap(value: Fn0): Self = StObject.set(x, "switchMap", value.asInstanceOf[js.Any])
        
        inline def setSwitchMapTo(value: FnCallThisObservableResultSelector): Self = StObject.set(x, "switchMapTo", value.asInstanceOf[js.Any])
        
        inline def setTake(value: Fn7): Self = StObject.set(x, "take", value.asInstanceOf[js.Any])
        
        inline def setTakeLast(value: Fn7): Self = StObject.set(x, "takeLast", value.asInstanceOf[js.Any])
        
        inline def setTakeUntil(value: Fn6): Self = StObject.set(x, "takeUntil", value.asInstanceOf[js.Any])
        
        inline def setTakeWhile(value: Fn8): Self = StObject.set(x, "takeWhile", value.asInstanceOf[js.Any])
        
        inline def setThrottle(value: FnCallThisDurationSelectorConfig): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
        
        inline def setThrottleTime(value: FnCallThisDurationSchedulerConfig): Self = StObject.set(x, "throttleTime", value.asInstanceOf[js.Any])
        
        inline def setTimeInterval(value: FnCallThisScheduler): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
        
        inline def setTimeout(value: FnCallThisDueScheduler): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutWith(value: FnCallThisDueWithObservableScheduler): Self = StObject.set(x, "timeoutWith", value.asInstanceOf[js.Any])
        
        inline def setTimestamp(value: FnCallThisScheduler): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        
        inline def setToArray(value: Fn1): Self = StObject.set(x, "toArray", value.asInstanceOf[js.Any])
        
        inline def setWindow(value: FnCallThisWindowBoundaries): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
        
        inline def setWindowCount(value: FnCallThisWindowSizeStartWindowEvery): Self = StObject.set(x, "windowCount", value.asInstanceOf[js.Any])
        
        inline def setWindowTime(value: FnCallThisWindowTimeSpanWindowCreationIntervalMaxWindowSizeScheduler): Self = StObject.set(x, "windowTime", value.asInstanceOf[js.Any])
        
        inline def setWindowToggle(value: FnCallThisOpeningsClosingSelector): Self = StObject.set(x, "windowToggle", value.asInstanceOf[js.Any])
        
        inline def setWindowWhen(value: FnCallThisClosingSelector): Self = StObject.set(x, "windowWhen", value.asInstanceOf[js.Any])
        
        inline def setWithLatestFrom(value: Fn9): Self = StObject.set(x, "withLatestFrom", value.asInstanceOf[js.Any])
        
        inline def setZip(value: Fn10): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
        
        inline def setZipAll(value: FnCallThisProject): Self = StObject.set(x, "zipAll", value.asInstanceOf[js.Any])
        
        inline def set_catch(value: FnCallThisSelector): Self = StObject.set(x, "_catch", value.asInstanceOf[js.Any])
        
        inline def set_do(value: FnCallThisNextErrorComplete): Self = StObject.set(x, "_do", value.asInstanceOf[js.Any])
        
        inline def set_finally(value: FnCallThisCallback): Self = StObject.set(x, "_finally", value.asInstanceOf[js.Any])
        
        inline def set_switch(value: FnCallThis): Self = StObject.set(x, "_switch", value.asInstanceOf[js.Any])
      }
    }
  }
  
  inline def staticNever(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("staticNever")().asInstanceOf[Any]
}
