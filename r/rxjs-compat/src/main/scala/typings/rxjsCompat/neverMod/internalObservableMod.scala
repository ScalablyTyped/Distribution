package typings.rxjsCompat.neverMod

import typings.rxjsCompat.FnA
import typings.rxjsCompat.FnAcc
import typings.rxjsCompat.FnAccAccumulator
import typings.rxjsCompat.FnArray
import typings.rxjsCompat.FnArrayObservables
import typings.rxjsCompat.FnArrayObservablesProject
import typings.rxjsCompat.FnArrayObservablesProjectThis
import typings.rxjsCompat.FnArrayScheduler
import typings.rxjsCompat.FnBufferCreationInterval
import typings.rxjsCompat.FnBufferSize
import typings.rxjsCompat.FnBufferSizeConfig
import typings.rxjsCompat.FnBufferSizeScheduler
import typings.rxjsCompat.FnCallback
import typings.rxjsCompat.FnCaught
import typings.rxjsCompat.FnClosingNotifier
import typings.rxjsCompat.FnClosingSelector
import typings.rxjsCompat.FnClosingSelectorThis
import typings.rxjsCompat.FnCompare
import typings.rxjsCompat.FnCompareKey
import typings.rxjsCompat.FnComparer
import typings.rxjsCompat.FnComplete
import typings.rxjsCompat.FnConcurrent
import typings.rxjsCompat.FnConcurrentIndex
import typings.rxjsCompat.FnConcurrentInnerObservable
import typings.rxjsCompat.FnConcurrentObservables
import typings.rxjsCompat.FnConcurrentThis
import typings.rxjsCompat.FnConfig
import typings.rxjsCompat.FnConfigDuration
import typings.rxjsCompat.FnCount
import typings.rxjsCompat.FnCountThis
import typings.rxjsCompat.FnDefaultValue
import typings.rxjsCompat.FnDefaultValueIndex
import typings.rxjsCompat.FnDefaultValueIndexPredicate
import typings.rxjsCompat.FnDelay
import typings.rxjsCompat.FnDelayDurationSelector
import typings.rxjsCompat.FnDelayScheduler
import typings.rxjsCompat.FnDue
import typings.rxjsCompat.FnDueScheduler
import typings.rxjsCompat.FnDueTime
import typings.rxjsCompat.FnDuration
import typings.rxjsCompat.FnDurationSelector
import typings.rxjsCompat.FnDurationSelectorElementSelector
import typings.rxjsCompat.FnErrors
import typings.rxjsCompat.FnFlushes
import typings.rxjsCompat.FnFunc
import typings.rxjsCompat.FnIndex
import typings.rxjsCompat.FnIndexPredicate
import typings.rxjsCompat.FnIndexPredicateSource
import typings.rxjsCompat.FnIndexPredicateThis
import typings.rxjsCompat.FnIndexPredicateThisThisArg
import typings.rxjsCompat.FnIndexPredicateThisValue
import typings.rxjsCompat.FnIndexProject
import typings.rxjsCompat.FnInnerIndex
import typings.rxjsCompat.FnInnerObservable
import typings.rxjsCompat.FnMaxWindowSize
import typings.rxjsCompat.FnNotifications
import typings.rxjsCompat.FnNotifier
import typings.rxjsCompat.FnObservables
import typings.rxjsCompat.FnObservablesThis
import typings.rxjsCompat.FnPeriod
import typings.rxjsCompat.FnProject
import typings.rxjsCompat.FnProperties
import typings.rxjsCompat.FnScheduler
import typings.rxjsCompat.FnSelector
import typings.rxjsCompat.FnSelectorSource
import typings.rxjsCompat.FnStartWindowEvery
import typings.rxjsCompat.FnThis
import typings.rxjsCompat.FnThisAny
import typings.rxjsCompat.FnThisValue
import typings.rxjsCompat.FnThisValueAny
import typings.rxjsCompat.FnThisWindowBoundaries
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Observable", JSImport.Namespace)
@js.native
object internalObservableMod extends js.Object {
  @js.native
  trait Observable[T] extends js.Object {
    @JSName("_catch")
    var _catch_Original: FnCaught = js.native
    @JSName("_do")
    var _do_Original: FnComplete = js.native
    @JSName("_finally")
    var _finally_Original: FnCallback = js.native
    @JSName("_switch")
    var _switch_Original: FnThis = js.native
    @JSName("auditTime")
    var auditTime_Original: FnDuration = js.native
    @JSName("audit")
    var audit_Original: FnDurationSelector = js.native
    @JSName("bufferCount")
    var bufferCount_Original: FnBufferSize = js.native
    @JSName("bufferTime")
    var bufferTime_Original: FnBufferCreationInterval = js.native
    @JSName("bufferToggle")
    var bufferToggle_Original: FnClosingSelector = js.native
    @JSName("bufferWhen")
    var bufferWhen_Original: FnClosingSelectorThis = js.native
    @JSName("buffer")
    var buffer_Original: FnClosingNotifier = js.native
    @JSName("catch")
    var catch_Original: FnCaught = js.native
    @JSName("combineAll")
    var combineAll_Original: FnProject = js.native
    @JSName("combineLatest")
    var combineLatest_Original: FnArray = js.native
    @JSName("concatAll")
    var concatAll_Original: FnThis = js.native
    @JSName("concatMapTo")
    var concatMapTo_Original: FnInnerObservable = js.native
    @JSName("concatMap")
    var concatMap_Original: FnIndex = js.native
    @JSName("concat")
    var concat_Original: FnObservables = js.native
    @JSName("count")
    var count_Original: FnIndexPredicate = js.native
    @JSName("debounceTime")
    var debounceTime_Original: FnDueTime = js.native
    @JSName("debounce")
    var debounce_Original: FnDurationSelector = js.native
    @JSName("defaultIfEmpty")
    var defaultIfEmpty_Original: FnDefaultValue = js.native
    @JSName("delayWhen")
    var delayWhen_Original: FnDelayDurationSelector = js.native
    @JSName("delay")
    var delay_Original: FnDelay = js.native
    @JSName("dematerialize")
    var dematerialize_Original: FnThisAny = js.native
    @JSName("distinctUntilChanged")
    var distinctUntilChanged_Original: FnCompare = js.native
    @JSName("distinctUntilKeyChanged")
    var distinctUntilKeyChanged_Original: FnCompareKey = js.native
    @JSName("distinct")
    var distinct_Original: FnFlushes = js.native
    @JSName("do")
    var do_Original: FnComplete = js.native
    @JSName("elementAt")
    var elementAt_Original: FnDefaultValueIndex = js.native
    @JSName("every")
    var every_Original: FnIndexPredicateSource = js.native
    @JSName("exhaustMap")
    var exhaustMap_Original: FnIndex = js.native
    @JSName("exhaust")
    var exhaust_Original: FnThis = js.native
    @JSName("expand")
    var expand_Original: FnConcurrent = js.native
    @JSName("filter")
    var filter_Original: FnIndexPredicateThis = js.native
    @JSName("finally")
    var finally_Original: FnCallback = js.native
    @JSName("findIndex")
    var findIndex_Original: FnIndexPredicateSource = js.native
    @JSName("find")
    var find_Original: FnIndexPredicateThis = js.native
    @JSName("first")
    var first_Original: FnDefaultValueIndexPredicate = js.native
    @JSName("flatMapTo")
    var flatMapTo_Original: FnConcurrentInnerObservable = js.native
    @JSName("flatMap")
    var flatMap_Original: FnConcurrentIndex = js.native
    @JSName("groupBy")
    var groupBy_Original: FnDurationSelectorElementSelector = js.native
    @JSName("ignoreElements")
    var ignoreElements_Original: js.ThisFunction0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ /* this */ js.Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<never> */ _
      ] = js.native
    @JSName("isEmpty")
    var isEmpty_Original: FnThisAny = js.native
    @JSName("last")
    var last_Original: FnDefaultValueIndexPredicate = js.native
    @JSName("letBind")
    var letBind_Original: FnFunc = js.native
    @JSName("let")
    var let_Original: FnFunc = js.native
    @JSName("mapTo")
    var mapTo_Original: FnThisValue = js.native
    @JSName("map")
    var map_Original: FnIndexProject = js.native
    @JSName("materialize")
    var materialize_Original: FnThisAny = js.native
    @JSName("max")
    var max_Original: FnComparer = js.native
    @JSName("mergeAll")
    var mergeAll_Original: FnConcurrentThis = js.native
    @JSName("mergeMapTo")
    var mergeMapTo_Original: FnConcurrentInnerObservable = js.native
    @JSName("mergeMap")
    var mergeMap_Original: FnConcurrentIndex = js.native
    @JSName("mergeScan")
    var mergeScan_Original: FnAcc = js.native
    @JSName("merge")
    var merge_Original: FnConcurrentObservables = js.native
    @JSName("min")
    var min_Original: FnComparer = js.native
    @JSName("multicast")
    var multicast_Original: FnSelector = js.native
    @JSName("observeOn")
    var observeOn_Original: FnDelayScheduler = js.native
    @JSName("onErrorResumeNext")
    var onErrorResumeNext_Original: FnArrayObservables = js.native
    @JSName("pairwise")
    var pairwise_Original: FnThisAny = js.native
    @JSName("partition")
    var partition_Original: FnIndexPredicateThisThisArg = js.native
    @JSName("pluck")
    var pluck_Original: FnProperties = js.native
    @JSName("publishBehavior")
    var publishBehavior_Original: FnThisValueAny = js.native
    @JSName("publishLast")
    var publishLast_Original: FnThisAny = js.native
    @JSName("publishReplay")
    var publishReplay_Original: FnBufferSizeScheduler = js.native
    @JSName("publish")
    var publish_Original: FnSelectorSource = js.native
    @JSName("race")
    var race_Original: FnObservablesThis = js.native
    @JSName("reduce")
    var reduce_Original: FnAccAccumulator = js.native
    @JSName("repeatWhen")
    var repeatWhen_Original: FnNotifications = js.native
    @JSName("repeat")
    var repeat_Original: FnCount = js.native
    @JSName("retryWhen")
    var retryWhen_Original: FnErrors = js.native
    @JSName("retry")
    var retry_Original: FnCount = js.native
    @JSName("sampleTime")
    var sampleTime_Original: FnPeriod = js.native
    @JSName("sample")
    var sample_Original: FnNotifier = js.native
    @JSName("scan")
    var scan_Original: FnAccAccumulator = js.native
    @JSName("sequenceEqual")
    var sequenceEqual_Original: FnA = js.native
    @JSName("shareReplay")
    var shareReplay_Original: FnBufferSizeConfig = js.native
    @JSName("share")
    var share_Original: FnThisAny = js.native
    @JSName("single")
    var single_Original: FnIndexPredicate = js.native
    @JSName("skipLast")
    var skipLast_Original: FnCountThis = js.native
    @JSName("skipUntil")
    var skipUntil_Original: FnNotifier = js.native
    @JSName("skipWhile")
    var skipWhile_Original: FnIndexPredicateThisValue = js.native
    @JSName("skip")
    var skip_Original: FnCountThis = js.native
    @JSName("startWith")
    var startWith_Original: FnArrayScheduler = js.native
    @JSName("subscribeOn")
    var subscribeOn_Original: FnDelayScheduler = js.native
    @JSName("switchMapTo")
    var switchMapTo_Original: FnInnerIndex = js.native
    @JSName("switchMap")
    var switchMap_Original: FnIndex = js.native
    @JSName("switch")
    var switch_Original: FnThis = js.native
    @JSName("takeLast")
    var takeLast_Original: FnCountThis = js.native
    @JSName("takeUntil")
    var takeUntil_Original: FnNotifier = js.native
    @JSName("takeWhile")
    var takeWhile_Original: FnIndexPredicateThisValue = js.native
    @JSName("take")
    var take_Original: FnCountThis = js.native
    @JSName("throttleTime")
    var throttleTime_Original: FnConfigDuration = js.native
    @JSName("throttle")
    var throttle_Original: FnConfig = js.native
    @JSName("timeInterval")
    var timeInterval_Original: FnScheduler = js.native
    @JSName("timeoutWith")
    var timeoutWith_Original: FnDueScheduler = js.native
    @JSName("timeout")
    var timeout_Original: FnDue = js.native
    @JSName("timestamp")
    var timestamp_Original: FnScheduler = js.native
    @JSName("toArray")
    var toArray_Original: FnThisAny = js.native
    @JSName("windowCount")
    var windowCount_Original: FnStartWindowEvery = js.native
    @JSName("windowTime")
    var windowTime_Original: FnMaxWindowSize = js.native
    @JSName("windowToggle")
    var windowToggle_Original: FnClosingSelector = js.native
    @JSName("windowWhen")
    var windowWhen_Original: FnClosingSelectorThis = js.native
    @JSName("window")
    var window_Original: FnThisWindowBoundaries = js.native
    @JSName("withLatestFrom")
    var withLatestFrom_Original: FnArrayObservablesProject = js.native
    @JSName("zipAll")
    var zipAll_Original: FnProject = js.native
    @JSName("zip")
    var zip_Original: FnArrayObservablesProjectThis = js.native
    def _catch[T, R](
      selector: js.Function2[
          /* err */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* caught */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
        ]
    ): js.Any = js.native
    def _do[T](next: js.Function1[/* x */ T, Unit]): js.Any = js.native
    def _do[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ js.Any, Unit]): js.Any = js.native
    def _do[T](
      next: js.Function1[/* x */ T, Unit],
      error: js.Function1[/* e */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): js.Any = js.native
    def _do[T](
      observer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialObserver<T> */ js.Any
    ): js.Any = js.native
    def _finally[T](callback: js.Function0[Unit]): js.Any = js.native
    def _switch[T](): js.Any = js.native
    @JSName("_switch")
    def _switch_TR[T, R](): js.Any = js.native
    def audit[T](
      durationSelector: js.Function1[
          /* value */ T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ _
        ]
    ): js.Any = js.native
    def auditTime[T](duration: Double): js.Any = js.native
    def auditTime[T](
      duration: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def buffer[T](
      closingNotifier: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ): js.Any = js.native
    def bufferCount[T](bufferSize: Double): js.Any = js.native
    def bufferCount[T](bufferSize: Double, startBufferEvery: Double): js.Any = js.native
    def bufferTime[T](bufferTimeSpan: Double): js.Any = js.native
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: js.UndefOr[scala.Nothing], maxBufferSize: Double): js.Any = js.native
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: js.UndefOr[scala.Nothing],
      maxBufferSize: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: js.UndefOr[scala.Nothing],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double): js.Any = js.native
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, maxBufferSize: Double): js.Any = js.native
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Double,
      maxBufferSize: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, maxBufferSize: Double): js.Any = js.native
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Null,
      maxBufferSize: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def bufferTime[T](
      bufferTimeSpan: Double,
      bufferCreationInterval: Null,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def bufferTime[T](
      bufferTimeSpan: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def bufferToggle[T, O](
      openings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<O> */ js.Any,
      closingSelector: js.Function1[
          /* openValue */ O, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
        ]
    ): js.Any = js.native
    def bufferWhen[T](
      closingSelector: js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
        ]
    ): js.Any = js.native
    def `catch`[T, R](
      selector: js.Function2[
          /* err */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* caught */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
        ]
    ): js.Any = js.native
    def combineAll[T](): js.Any = js.native
    def combineAll[R](project: js.Function1[/* repeated */ js.Any, R]): js.Any = js.native
    @JSName("combineAll")
    def combineAll_TR[T, R](): js.Any = js.native
    @JSName("combineAll")
    def combineAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): js.Any = js.native
    def combineLatest[T, R](
      array: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ _
        ]
    ): js.Any = js.native
    def combineLatest[T, R](
      observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any) | (js.Function1[/* repeated */ T, R]))*
    ): js.Any = js.native
    def combineLatest[T, R](project: js.Function1[/* v1 */ T, R]): js.Any = js.native
    def combineLatest[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any
    ): js.Any = js.native
    def combineLatest[T, TOther, R](
      array: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<TOther> */ _
        ],
      project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
    ): js.Any = js.native
    def combineLatest[T, T2, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      project: js.Function2[/* v1 */ T, /* v2 */ T2, R]
    ): js.Any = js.native
    def combineLatest[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any
    ): js.Any = js.native
    def combineLatest[T, T2, T3, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
    ): js.Any = js.native
    def combineLatest[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any
    ): js.Any = js.native
    def combineLatest[T, T2, T3, T4, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
    ): js.Any = js.native
    def combineLatest[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any
    ): js.Any = js.native
    def combineLatest[T, T2, T3, T4, T5, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
    ): js.Any = js.native
    def combineLatest[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any
    ): js.Any = js.native
    def combineLatest[T, T2, T3, T4, T5, T6, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any,
      project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
    ): js.Any = js.native
    def concat[T](): js.Any = js.native
    def concat[T](
      observables: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any)*
    ): js.Any = js.native
    def concat[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def concat[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def concat[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def concat[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def concat[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def concat[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def concatAll[T](): js.Any = js.native
    @JSName("concatAll")
    def concatAll_TR[T, R](): js.Any = js.native
    def concatMap[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
        ]
    ): js.Any = js.native
    def concatMapTo[T, R](
      innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ js.Any
    ): js.Any = js.native
    @JSName("concat")
    def concat_TR[T, R](
      observables: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ js.Any)*
    ): js.Any = js.native
    @JSName("concat")
    def concat_TT2[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any
    ): js.Any = js.native
    @JSName("concat")
    def concat_TT2T3[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any
    ): js.Any = js.native
    @JSName("concat")
    def concat_TT2T3T4[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any
    ): js.Any = js.native
    @JSName("concat")
    def concat_TT2T3T4T5[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any
    ): js.Any = js.native
    @JSName("concat")
    def concat_TT2T3T4T5T6[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any
    ): js.Any = js.native
    def count[T](): js.Any = js.native
    def count[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ]
    ): js.Any = js.native
    def debounce[T](
      durationSelector: js.Function1[
          /* value */ T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ _
        ]
    ): js.Any = js.native
    def debounceTime[T](dueTime: Double): js.Any = js.native
    def debounceTime[T](
      dueTime: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def defaultIfEmpty[T](): js.Any = js.native
    def defaultIfEmpty[T](defaultValue: T): js.Any = js.native
    @JSName("defaultIfEmpty")
    def defaultIfEmpty_TR[T, R](): js.Any = js.native
    @JSName("defaultIfEmpty")
    def defaultIfEmpty_TR[T, R](defaultValue: R): js.Any = js.native
    def delay[T](delay: Double): js.Any = js.native
    def delay[T](
      delay: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def delay[T](delay: Date): js.Any = js.native
    def delay[T](
      delay: Date,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def delayWhen[T](
      delayDurationSelector: js.Function1[
          /* value */ T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
        ]
    ): js.Any = js.native
    def delayWhen[T](
      delayDurationSelector: js.Function1[
          /* value */ T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
        ],
      subscriptionDelay: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ): js.Any = js.native
    def dematerialize[T](): js.Any = js.native
    def distinct[T, K](): js.Any = js.native
    def distinct[T, K](keySelector: js.Function1[/* value */ T, K]): js.Any = js.native
    def distinct[T, K](
      keySelector: js.Function1[/* value */ T, K],
      flushes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ): js.Any = js.native
    def distinctUntilChanged[T](): js.Any = js.native
    def distinctUntilChanged[T](compare: js.Function2[/* x */ T, /* y */ T, Boolean]): js.Any = js.native
    def distinctUntilChanged[T, K](compare: js.Function2[/* x */ K, /* y */ K, Boolean], keySelector: js.Function1[/* x */ T, K]): js.Any = js.native
    def distinctUntilKeyChanged[T](key: String): js.Any = js.native
    def distinctUntilKeyChanged[T, K /* <: String */](
      key: K,
      compare: js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* x */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* y */ js.Any, 
          Boolean
        ]
    ): js.Any = js.native
    def `do`[T](next: js.Function1[/* x */ T, Unit]): js.Any = js.native
    def `do`[T](next: js.Function1[/* x */ T, Unit], error: js.Function1[/* e */ js.Any, Unit]): js.Any = js.native
    def `do`[T](
      next: js.Function1[/* x */ T, Unit],
      error: js.Function1[/* e */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): js.Any = js.native
    def `do`[T](
      observer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialObserver<T> */ js.Any
    ): js.Any = js.native
    def elementAt[T](index: Double): js.Any = js.native
    def elementAt[T](index: Double, defaultValue: T): js.Any = js.native
    def every[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ]
    ): js.Any = js.native
    def every[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ],
      thisArg: js.Any
    ): js.Any = js.native
    def exhaust[T](): js.Any = js.native
    def exhaustMap[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
        ]
    ): js.Any = js.native
    @JSName("exhaust")
    def exhaust_TR[T, R](): js.Any = js.native
    def expand[T](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ _
        ]
    ): js.Any = js.native
    def expand[T](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ _
        ],
      concurrent: Double
    ): js.Any = js.native
    def expand[T](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ _
        ],
      concurrent: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    @JSName("expand")
    def expand_TR[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
        ]
    ): js.Any = js.native
    @JSName("expand")
    def expand_TR[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
        ],
      concurrent: Double
    ): js.Any = js.native
    @JSName("expand")
    def expand_TR[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
        ],
      concurrent: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Any = js.native
    def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): js.Any = js.native
    @JSName("filter")
    def filter_TS_T[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): js.Any = js.native
    @JSName("filter")
    def filter_TS_T[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], thisArg: js.Any): js.Any = js.native
    def `finally`[T](callback: js.Function0[Unit]): js.Any = js.native
    def find[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Any = js.native
    def find[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): js.Any = js.native
    def findIndex[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ]
    ): js.Any = js.native
    def findIndex[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ],
      thisArg: js.Any
    ): js.Any = js.native
    @JSName("find")
    def find_TS_T[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): js.Any = js.native
    @JSName("find")
    def find_TS_T[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], thisArg: js.Any): js.Any = js.native
    def first[T, D](): js.Any = js.native
    def first[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          /* is S */ Boolean
        ]
    ): js.Any = js.native
    def first[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          /* is S */ Boolean
        ],
      defaultValue: S
    ): js.Any = js.native
    def first[T, D](predicate: Null, defaultValue: D): js.Any = js.native
    @JSName("first")
    def first_TD[T, D](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ]
    ): js.Any = js.native
    @JSName("first")
    def first_TD[T, D](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ],
      defaultValue: D
    ): js.Any = js.native
    def flatMap[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
        ]
    ): js.Any = js.native
    def flatMap[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
        ],
      concurrent: Double
    ): js.Any = js.native
    def flatMapTo[T, R](
      innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
    ): js.Any = js.native
    def flatMapTo[T, R](
      innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any,
      concurrent: Double
    ): js.Any = js.native
    def groupBy[T, K](keySelector: js.Function1[/* value */ T, K]): js.Any = js.native
    def groupBy[T, K](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: Unit,
      durationSelector: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, T> */ /* grouped */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
        ]
    ): js.Any = js.native
    def groupBy[T, K, R](keySelector: js.Function1[/* value */ T, K], elementSelector: js.Function1[/* value */ T, R]): js.Any = js.native
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: js.Function1[/* value */ T, R],
      durationSelector: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
        ]
    ): js.Any = js.native
    def groupBy[T, K, R](
      keySelector: js.Function1[/* value */ T, K],
      elementSelector: js.Function1[/* value */ T, R],
      durationSelector: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GroupedObservable<K, R> */ /* grouped */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
        ],
      subjectSelector: js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<R> */ _
        ]
    ): js.Any = js.native
    @JSName("groupBy")
    def groupBy_TKR[T, K, R](keySelector: js.Function1[/* value */ T, K]): js.Any = js.native
    def ignoreElements(): js.Any = js.native
    def isEmpty[T](): js.Any = js.native
    def last[T, D](): js.Any = js.native
    def last[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          /* is S */ Boolean
        ]
    ): js.Any = js.native
    def last[T, S /* <: T */](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          /* is S */ Boolean
        ],
      defaultValue: S
    ): js.Any = js.native
    def last[T, D](predicate: Null, defaultValue: D): js.Any = js.native
    @JSName("last")
    def last_TD[T, D](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ]
    ): js.Any = js.native
    @JSName("last")
    def last_TD[T, D](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ],
      defaultValue: D
    ): js.Any = js.native
    def let[T, R](
      func: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* selector */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
        ]
    ): js.Any = js.native
    def letBind[T, R](
      func: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* selector */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
        ]
    ): js.Any = js.native
    def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R]): js.Any = js.native
    def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R], thisArg: js.Any): js.Any = js.native
    def mapTo[T, R](value: R): js.Any = js.native
    def materialize[T](): js.Any = js.native
    def max[T](): js.Any = js.native
    def max[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): js.Any = js.native
    def merge[T](): js.Any = js.native
    def merge[T](concurrent: Double): js.Any = js.native
    def merge[T](
      concurrent: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def merge[T](
      observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any) | Double)*
    ): js.Any = js.native
    def merge[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def merge[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      concurrent: Double
    ): js.Any = js.native
    def merge[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      concurrent: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def merge[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def merge[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      concurrent: Double
    ): js.Any = js.native
    def merge[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      concurrent: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def merge[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def merge[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      concurrent: Double
    ): js.Any = js.native
    def merge[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      concurrent: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def merge[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def merge[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      concurrent: Double
    ): js.Any = js.native
    def merge[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      concurrent: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def merge[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def merge[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any,
      concurrent: Double
    ): js.Any = js.native
    def merge[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any,
      concurrent: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def merge[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def mergeAll[T](): js.Any = js.native
    def mergeAll[T](concurrent: Double): js.Any = js.native
    @JSName("mergeAll")
    def mergeAll_TR[T, R](): js.Any = js.native
    @JSName("mergeAll")
    def mergeAll_TR[T, R](concurrent: Double): js.Any = js.native
    def mergeMap[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
        ]
    ): js.Any = js.native
    def mergeMap[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
        ],
      concurrent: Double
    ): js.Any = js.native
    def mergeMapTo[T, R](
      innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
    ): js.Any = js.native
    def mergeMapTo[T, R](
      innerObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any,
      concurrent: Double
    ): js.Any = js.native
    def mergeScan[T, R](
      accumulator: js.Function2[
          /* acc */ R, 
          /* value */ T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
        ],
      seed: R
    ): js.Any = js.native
    def mergeScan[T, R](
      accumulator: js.Function2[
          /* acc */ R, 
          /* value */ T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
        ],
      seed: R,
      concurrent: Double
    ): js.Any = js.native
    @JSName("merge")
    def merge_TR[T, R](
      observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ js.Any) | Double)*
    ): js.Any = js.native
    @JSName("merge")
    def merge_TT2[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any
    ): js.Any = js.native
    @JSName("merge")
    def merge_TT2T3[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any
    ): js.Any = js.native
    @JSName("merge")
    def merge_TT2T3T4[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any
    ): js.Any = js.native
    @JSName("merge")
    def merge_TT2T3T4T5[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any
    ): js.Any = js.native
    @JSName("merge")
    def merge_TT2T3T4T5T6[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any
    ): js.Any = js.native
    def min[T](): js.Any = js.native
    def min[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): js.Any = js.native
    def multicast[T](
      SubjectFactory: js.ThisFunction0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ _
        ]
    ): js.Any = js.native
    def multicast[T](
      SubjectFactory: js.ThisFunction0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ _
        ],
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any
    ): js.Any = js.native
    def multicast[T](
      subjectOrSubjectFactory: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FactoryOrValue<Subject<T>> */ js.Any
    ): js.Any = js.native
    @JSName("multicast")
    def multicast_TR[T, R](
      SubjectFactory: js.ThisFunction0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ _
        ]
    ): js.Any = js.native
    @JSName("multicast")
    def multicast_TR[T, R](
      SubjectFactory: js.ThisFunction0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ _
        ],
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ js.Any
    ): js.Any = js.native
    def observeOn[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def observeOn[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any,
      delay: Double
    ): js.Any = js.native
    def onErrorResumeNext[T](): js.Any = js.native
    def onErrorResumeNext[T, R](
      array: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ _
        ]
    ): js.Any = js.native
    def onErrorResumeNext[T, R](
      observables: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ js.Any)*
    ): js.Any = js.native
    def onErrorResumeNext[T, R](
      v: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
    ): js.Any = js.native
    def onErrorResumeNext[T, T2, T3, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any
    ): js.Any = js.native
    def onErrorResumeNext[T, T2, T3, T4, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any
    ): js.Any = js.native
    def onErrorResumeNext[T, T2, T3, T4, T5, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any
    ): js.Any = js.native
    def onErrorResumeNext[T, T2, T3, T4, T5, T6, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any
    ): js.Any = js.native
    @JSName("onErrorResumeNext")
    def onErrorResumeNext_TT2R[T, T2, R](
      v: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any
    ): js.Any = js.native
    def pairwise[T](): js.Any = js.native
    def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Tuple2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
      ] = js.native
    def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): js.Tuple2[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
      ] = js.native
    def pluck[T, R](properties: String*): js.Any = js.native
    def publish[T](): js.Any = js.native
    def publish[T](
      selector: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
        ]
    ): js.Any = js.native
    def publishBehavior[T](value: T): js.Any = js.native
    def publishLast[T](): js.Any = js.native
    def publishReplay[T](): js.Any = js.native
    def publishReplay[T](bufferSize: Double): js.Any = js.native
    def publishReplay[T](bufferSize: Double, windowTime: Double): js.Any = js.native
    def publishReplay[T](
      bufferSize: Double,
      windowTime: Double,
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def publishReplay[T](
      bufferSize: Double,
      windowTime: Double,
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    @JSName("publishReplay")
    def publishReplay_TR[T, R](): js.Any = js.native
    @JSName("publishReplay")
    def publishReplay_TR[T, R](bufferSize: Double): js.Any = js.native
    @JSName("publishReplay")
    def publishReplay_TR[T, R](bufferSize: Double, windowTime: Double): js.Any = js.native
    @JSName("publishReplay")
    def publishReplay_TR[T, R](
      bufferSize: Double,
      windowTime: Double,
      selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ js.Any
    ): js.Any = js.native
    @JSName("publish")
    def publish_TR[T, R](
      selector: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<R> */ _
        ]
    ): js.Any = js.native
    def race[T](
      observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
        ]))*
    ): js.Any = js.native
    def race[T](
      observables: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
        ]
    ): js.Any = js.native
    @JSName("race")
    def race_TR[T, R](
      observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
        ]))*
    ): js.Any = js.native
    @JSName("race")
    def race_TR[T, R](
      observables: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ _
        ]
    ): js.Any = js.native
    def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): js.Any = js.native
    def reduce[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): js.Any = js.native
    @JSName("reduce")
    def reduce_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): js.Any = js.native
    @JSName("reduce")
    def reduce_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): js.Any = js.native
    def repeat[T](): js.Any = js.native
    def repeat[T](count: Double): js.Any = js.native
    def repeatWhen[T](
      notifier: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ /* notifications */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
        ]
    ): js.Any = js.native
    def retry[T](): js.Any = js.native
    def retry[T](count: Double): js.Any = js.native
    def retryWhen[T](
      notifier: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ /* errors */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
        ]
    ): js.Any = js.native
    def sample[T](
      notifier: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ): js.Any = js.native
    def sampleTime[T](period: Double): js.Any = js.native
    def sampleTime[T](
      period: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]): js.Any = js.native
    def scan[T](accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T], seed: T): js.Any = js.native
    @JSName("scan")
    def scan_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]): js.Any = js.native
    @JSName("scan")
    def scan_TR[T, R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R], seed: R): js.Any = js.native
    def sequenceEqual[T](
      compareTo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any
    ): js.Any = js.native
    def sequenceEqual[T](
      compareTo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ js.Any,
      comparor: js.Function2[/* a */ T, /* b */ T, Boolean]
    ): js.Any = js.native
    def share[T](): js.Any = js.native
    def shareReplay[T](): js.Any = js.native
    def shareReplay[T](bufferSize: Double): js.Any = js.native
    def shareReplay[T](bufferSize: Double, windowTime: Double): js.Any = js.native
    def shareReplay[T](
      bufferSize: Double,
      windowTime: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def shareReplay[T](
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShareReplayConfig */ js.Any
    ): js.Any = js.native
    def single[T](): js.Any = js.native
    def single[T](
      predicate: js.Function3[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
          Boolean
        ]
    ): js.Any = js.native
    def skip[T](count: Double): js.Any = js.native
    def skipLast[T](count: Double): js.Any = js.native
    def skipUntil[T](
      notifier: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ): js.Any = js.native
    def skipWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Any = js.native
    def startWith[T](): js.Any = js.native
    def startWith[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def startWith[T, D](
      array: (D | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any))*
    ): js.Any = js.native
    def startWith[T, D](v1: D): js.Any = js.native
    def startWith[T, D](
      v1: D,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def startWith[T, D, E](v1: D, v2: E): js.Any = js.native
    def startWith[T, D, E](
      v1: D,
      v2: E,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def startWith[T, D, E, F](v1: D, v2: E, v3: F): js.Any = js.native
    def startWith[T, D, E, F](
      v1: D,
      v2: E,
      v3: F,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def startWith[T, D, E, F, G](v1: D, v2: E, v3: F, v4: G): js.Any = js.native
    def startWith[T, D, E, F, G](
      v1: D,
      v2: E,
      v3: F,
      v4: G,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def startWith[T, D, E, F, G, H](v1: D, v2: E, v3: F, v4: G, v5: H): js.Any = js.native
    def startWith[T, D, E, F, G, H](
      v1: D,
      v2: E,
      v3: F,
      v4: G,
      v5: H,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def startWith[T, D, E, F, G, H, I](v1: D, v2: E, v3: F, v4: G, v5: H, v6: I): js.Any = js.native
    def startWith[T, D, E, F, G, H, I](
      v1: D,
      v2: E,
      v3: F,
      v4: G,
      v5: H,
      v6: I,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def subscribeOn[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def subscribeOn[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any,
      delay: Double
    ): js.Any = js.native
    def switch[T](): js.Any = js.native
    def switchMap[T, R](
      project: js.Function2[
          /* value */ T, 
          /* index */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ _
        ]
    ): js.Any = js.native
    def switchMapTo[T, R](
      observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
    ): js.Any = js.native
    def switchMapTo[T, I, R](
      observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<I> */ js.Any,
      resultSelector: js.Function4[
          /* outerValue */ T, 
          /* innerValue */ I, 
          /* outerIndex */ Double, 
          /* innerIndex */ Double, 
          R
        ]
    ): js.Any = js.native
    @JSName("switch")
    def switch_TR[T, R](): js.Any = js.native
    def take[T](count: Double): js.Any = js.native
    def takeLast[T](count: Double): js.Any = js.native
    def takeUntil[T](
      notifier: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ): js.Any = js.native
    def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Any = js.native
    def throttle[T](
      durationSelector: js.Function1[
          /* value */ T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ _
        ]
    ): js.Any = js.native
    def throttle[T](
      durationSelector: js.Function1[
          /* value */ T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SubscribableOrPromise<any> */ _
        ],
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ js.Any
    ): js.Any = js.native
    def throttleTime[T](duration: Double): js.Any = js.native
    def throttleTime[T](
      duration: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def throttleTime[T](
      duration: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any,
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ js.Any
    ): js.Any = js.native
    def timeInterval[T](): js.Any = js.native
    def timeInterval[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def timeout[T](due: Double): js.Any = js.native
    def timeout[T](
      due: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def timeout[T](due: Date): js.Any = js.native
    def timeout[T](
      due: Date,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def timeoutWith[T](
      due: Double,
      withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any
    ): js.Any = js.native
    def timeoutWith[T](
      due: Double,
      withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def timeoutWith[T](
      due: Date,
      withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any
    ): js.Any = js.native
    def timeoutWith[T](
      due: Date,
      withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    @JSName("timeoutWith")
    def timeoutWith_TR[T, R](
      due: Double,
      withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
    ): js.Any = js.native
    @JSName("timeoutWith")
    def timeoutWith_TR[T, R](
      due: Double,
      withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    @JSName("timeoutWith")
    def timeoutWith_TR[T, R](
      due: Date,
      withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
    ): js.Any = js.native
    @JSName("timeoutWith")
    def timeoutWith_TR[T, R](
      due: Date,
      withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def timestamp[T](): js.Any = js.native
    def timestamp[T](
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def toArray[T](): js.Any = js.native
    def window[T](
      windowBoundaries: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ js.Any
    ): js.Any = js.native
    def windowCount[T](windowSize: Double): js.Any = js.native
    def windowCount[T](windowSize: Double, startWindowEvery: Double): js.Any = js.native
    def windowTime[T](windowTimeSpan: Double): js.Any = js.native
    def windowTime[T](
      windowTimeSpan: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double): js.Any = js.native
    def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, maxWindowSize: Double): js.Any = js.native
    def windowTime[T](
      windowTimeSpan: Double,
      windowCreationInterval: Double,
      maxWindowSize: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def windowTime[T](
      windowTimeSpan: Double,
      windowCreationInterval: Double,
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
    def windowToggle[T, O](
      openings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<O> */ js.Any,
      closingSelector: js.Function1[
          /* openValue */ O, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
        ]
    ): js.Any = js.native
    def windowWhen[T](
      closingSelector: js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ _
        ]
    ): js.Any = js.native
    def withLatestFrom[T, R](
      array: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ _
        ]
    ): js.Any = js.native
    def withLatestFrom[T, R](
      array: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ _
        ],
      project: js.Function1[/* repeated */ js.Any, R]
    ): js.Any = js.native
    def withLatestFrom[T, R](
      observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<any> */ js.Any) | (js.Function1[/* repeated */ js.Any, R]))*
    ): js.Any = js.native
    def withLatestFrom[T, R](project: js.Function1[/* v1 */ T, R]): js.Any = js.native
    def withLatestFrom[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any
    ): js.Any = js.native
    def withLatestFrom[T, T2, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      project: js.Function2[/* v1 */ T, /* v2 */ T2, R]
    ): js.Any = js.native
    def withLatestFrom[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any
    ): js.Any = js.native
    def withLatestFrom[T, T2, T3, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
    ): js.Any = js.native
    def withLatestFrom[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any
    ): js.Any = js.native
    def withLatestFrom[T, T2, T3, T4, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
    ): js.Any = js.native
    def withLatestFrom[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any
    ): js.Any = js.native
    def withLatestFrom[T, T2, T3, T4, T5, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
    ): js.Any = js.native
    def withLatestFrom[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any
    ): js.Any = js.native
    def withLatestFrom[T, T2, T3, T4, T5, T6, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any,
      project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
    ): js.Any = js.native
    def zip[T](
      observables: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any)*
    ): js.Any = js.native
    def zip[T, R](
      array: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ _
        ]
    ): js.Any = js.native
    def zip[T, R](project: js.Function1[/* v1 */ T, R]): js.Any = js.native
    def zip[T, T2](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any
    ): js.Any = js.native
    def zip[T, TOther, R](
      array: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<TOther> */ _
        ],
      project: js.Function2[/* v1 */ T, /* repeated */ TOther, R]
    ): js.Any = js.native
    def zip[T, T2, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      project: js.Function2[/* v1 */ T, /* v2 */ T2, R]
    ): js.Any = js.native
    def zip[T, T2, T3](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any
    ): js.Any = js.native
    def zip[T, T2, T3, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      project: js.Function3[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, R]
    ): js.Any = js.native
    def zip[T, T2, T3, T4](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any
    ): js.Any = js.native
    def zip[T, T2, T3, T4, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      project: js.Function4[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, R]
    ): js.Any = js.native
    def zip[T, T2, T3, T4, T5](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any
    ): js.Any = js.native
    def zip[T, T2, T3, T4, T5, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      project: js.Function5[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, R]
    ): js.Any = js.native
    def zip[T, T2, T3, T4, T5, T6](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any
    ): js.Any = js.native
    def zip[T, T2, T3, T4, T5, T6, R](
      v2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T2> */ js.Any,
      v3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T3> */ js.Any,
      v4: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T4> */ js.Any,
      v5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T5> */ js.Any,
      v6: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T6> */ js.Any,
      project: js.Function6[/* v1 */ T, /* v2 */ T2, /* v3 */ T3, /* v4 */ T4, /* v5 */ T5, /* v6 */ T6, R]
    ): js.Any = js.native
    def zipAll[T](): js.Any = js.native
    def zipAll[R](project: js.Function1[/* repeated */ js.Any, R]): js.Any = js.native
    @JSName("zipAll")
    def zipAll_TR[T, R](): js.Any = js.native
    @JSName("zipAll")
    def zipAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): js.Any = js.native
    @JSName("zip")
    def zip_TR[T, R](
      observables: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any) | (js.Function1[/* repeated */ T, R]))*
    ): js.Any = js.native
  }
  
  @js.native
  object Observable extends js.Object {
    var ajax: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AjaxCreationMethod */ js.Any = js.native
    var bindCallback: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticBindCallback */ js.Any = js.native
    var bindNodeCallback: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticBindNodeCallback */ js.Any = js.native
    var combineLatest: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof combineLatestStatic */ js.Any = js.native
    var concat: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof concatStatic */ js.Any = js.native
    var defer: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticDefer */ js.Any = js.native
    var empty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticEmpty */ js.Any = js.native
    var forkJoin: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticForkJoin */ js.Any = js.native
    var from: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticFrom */ js.Any = js.native
    var fromEvent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticFromEvent */ js.Any = js.native
    var fromEventPattern: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticFromEventPattern */ js.Any = js.native
    var fromPromise: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticFromPromise */ js.Any = js.native
    var generate: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticGenerate */ js.Any = js.native
    var interval: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticInterval */ js.Any = js.native
    var merge: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof mergeStatic */ js.Any = js.native
    var of: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticOf */ js.Any = js.native
    var onErrorResumeNext: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticOnErrorResumeNext */ js.Any = js.native
    var pairs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticPairs */ js.Any = js.native
    var race: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticRace */ js.Any = js.native
    var range: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticRange */ js.Any = js.native
    var throwError: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticThrowError */ js.Any = js.native
    var timer: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticTimer */ js.Any = js.native
    var using: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticUsing */ js.Any = js.native
    var webSocket: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof staticWebSocket */ js.Any = js.native
    var zip: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof zipStatic */ js.Any = js.native
  }
  
}

