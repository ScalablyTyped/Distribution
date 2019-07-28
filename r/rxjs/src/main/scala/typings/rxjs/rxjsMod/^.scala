package typings.rxjs.rxjsMod

import typings.rxjs.internalObservableFromEventMod.EventListenerOptions
import typings.rxjs.internalObservableFromEventMod.FromEventTarget
import typings.rxjs.internalObservableFromEventMod.NodeEventHandler
import typings.rxjs.internalObservableGenerateMod.ConditionFunc
import typings.rxjs.internalObservableGenerateMod.GenerateBaseOptions
import typings.rxjs.internalObservableGenerateMod.GenerateOptions
import typings.rxjs.internalObservableGenerateMod.IterateFunc
import typings.rxjs.internalObservableGenerateMod.ResultFunc
import typings.rxjs.internalSchedulerAnimationFrameSchedulerMod.AnimationFrameScheduler
import typings.rxjs.internalSchedulerAsapSchedulerMod.AsapScheduler
import typings.rxjs.internalSchedulerAsyncSchedulerMod.AsyncScheduler
import typings.rxjs.internalSchedulerQueueSchedulerMod.QueueScheduler
import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.ObservedValueOf
import typings.rxjs.internalTypesMod.ObservedValuesFromArray
import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.internalTypesMod.SubscribableOrPromise
import typings.rxjs.internalTypesMod.UnaryFunction
import typings.rxjs.internalTypesMod.Unsubscribable
import typings.rxjs.internalUtilArgumentOutOfRangeErrorMod.ArgumentOutOfRangeErrorCtor
import typings.rxjs.internalUtilEmptyErrorMod.EmptyErrorCtor
import typings.rxjs.internalUtilObjectUnsubscribedErrorMod.ObjectUnsubscribedErrorCtor
import typings.rxjs.internalUtilTimeoutErrorMod.TimeoutErrorCtor
import typings.rxjs.internalUtilUnsubscriptionErrorMod.UnsubscriptionErrorCtor
import typings.rxjs.rxjsStrings.forkJoin
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ArgumentOutOfRangeError: ArgumentOutOfRangeErrorCtor = js.native
  val EMPTY: typings.rxjs.internalObservableMod.Observable[scala.Nothing] = js.native
  val EmptyError: EmptyErrorCtor = js.native
  val NEVER: typings.rxjs.internalObservableMod.Observable[scala.Nothing] = js.native
  val ObjectUnsubscribedError: ObjectUnsubscribedErrorCtor = js.native
  val TimeoutError: TimeoutErrorCtor = js.native
  val UnsubscriptionError: UnsubscriptionErrorCtor = js.native
  val animationFrameScheduler: AnimationFrameScheduler = js.native
  val asapScheduler: AsapScheduler = js.native
  val asyncScheduler: AsyncScheduler = js.native
  val observable: String | js.Symbol = js.native
  val queueScheduler: QueueScheduler = js.native
  def bindCallback(callbackFunc: js.Function): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[_]] = js.native
  def bindCallback(callbackFunc: js.Function1[/* callback */ js.Function0[_], _]): js.Function0[typings.rxjs.internalObservableMod.Observable[Unit]] = js.native
  def bindCallback(callbackFunc: js.Function1[/* callback */ js.Function0[_], _], scheduler: SchedulerLike): js.Function0[typings.rxjs.internalObservableMod.Observable[Unit]] = js.native
  def bindCallback(callbackFunc: js.Function, resultSelector: js.Function): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[_]] = js.native
  def bindCallback(callbackFunc: js.Function, resultSelector: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[_]] = js.native
  def bindCallback(callbackFunc: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[_]] = js.native
  def bindCallback[A1](callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function0[_], _]): js.Function1[/* arg1 */ A1, typings.rxjs.internalObservableMod.Observable[Unit]] = js.native
  def bindCallback[A1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function0[_], _],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, typings.rxjs.internalObservableMod.Observable[Unit]] = js.native
  def bindCallback[A1, A2](callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function0[_], _]): js.Function2[/* arg1 */ A1, /* arg2 */ A2, typings.rxjs.internalObservableMod.Observable[Unit]] = js.native
  def bindCallback[A1, A2](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function0[_], _],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, typings.rxjs.internalObservableMod.Observable[Unit]] = js.native
  def bindCallback[A1, A2, A3](
    callbackFunc: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* callback */ js.Function0[_], _]
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  def bindCallback[A1, A2, A3](
    callbackFunc: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* callback */ js.Function0[_], _],
    scheduler: SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  def bindCallback[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function0[_], 
      _
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  def bindCallback[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function0[_], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  def bindCallback[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function0[_], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  def bindCallback[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function0[_], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4A5R1[A1, A2, A3, A4, A5, R1](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[R1]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4A5R1[A1, A2, A3, A4, A5, R1](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[R1]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4A5R1R2[A1, A2, A3, A4, A5, R1, R2](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4A5R1R2[A1, A2, A3, A4, A5, R1, R2](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4A5R1R2R3[A1, A2, A3, A4, A5, R1, R2, R3](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4A5R1R2R3[A1, A2, A3, A4, A5, R1, R2, R3](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4A5R1R2R3R4[A1, A2, A3, A4, A5, R1, R2, R3, R4](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[js.Array[_]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4A5R1R2R3R4[A1, A2, A3, A4, A5, R1, R2, R3, R4](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[js.Array[_]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4R1[A1, A2, A3, A4, R1](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[R1]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4R1[A1, A2, A3, A4, R1](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[R1]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4R1R2R3R4[A1, A2, A3, A4, R1, R2, R3, R4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[js.Array[_]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3A4R1R2R3R4[A1, A2, A3, A4, R1, R2, R3, R4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[js.Array[_]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3R1[A1, A2, A3, R1](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ]
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[R1]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3R1[A1, A2, A3, R1](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* res1 */ R1, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[R1]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3R1R2[A1, A2, A3, R1, R2](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3R1R2[A1, A2, A3, R1, R2](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3R1R2R3R4[A1, A2, A3, R1, R2, R3, R4](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[js.Array[_]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2A3R1R2R3R4[A1, A2, A3, R1, R2, R3, R4](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[js.Array[_]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* res1 */ R1, _], _]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, typings.rxjs.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* res1 */ R1, _], _],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, typings.rxjs.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function2[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function2[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function2[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function2[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1R2R3R4[A1, A2, R1, R2, R3, R4](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function2[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    typings.rxjs.internalObservableMod.Observable[js.Array[_]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1R2R3R4[A1, A2, R1, R2, R3, R4](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function2[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    typings.rxjs.internalObservableMod.Observable[js.Array[_]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1[A1, R1](callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* res1 */ R1, _], _]): js.Function1[/* arg1 */ A1, typings.rxjs.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1[A1, R1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* res1 */ R1, _], _],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, typings.rxjs.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], _]
  ): js.Function1[/* arg1 */ A1, typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], _],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function1[
    /* arg1 */ A1, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[
    /* arg1 */ A1, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function1[/* arg1 */ A1, typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindCallback")
  def bindCallback_AR_Function1[A, R](callbackFunc: js.Function1[A | (js.Function1[/* repeated */ R, _]), _]): js.Function1[/* repeated */ A, typings.rxjs.internalObservableMod.Observable[js.Array[R]]] = js.native
  @JSName("bindCallback")
  def bindCallback_AR_Function1[A, R](callbackFunc: js.Function1[A | (js.Function1[/* repeated */ R, _]), _], scheduler: SchedulerLike): js.Function1[/* repeated */ A, typings.rxjs.internalObservableMod.Observable[js.Array[R]]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1[R1](callbackFunc: js.Function1[/* callback */ js.Function1[/* res1 */ R1, _], _]): js.Function0[typings.rxjs.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1[R1](
    callbackFunc: js.Function1[/* callback */ js.Function1[/* res1 */ R1, _], _],
    scheduler: SchedulerLike
  ): js.Function0[typings.rxjs.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2[R1, R2](callbackFunc: js.Function1[/* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], _]): js.Function0[typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2[R1, R2](
    callbackFunc: js.Function1[/* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], _],
    scheduler: SchedulerLike
  ): js.Function0[typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[/* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], _]
  ): js.Function0[typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[/* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], _],
    scheduler: SchedulerLike
  ): js.Function0[typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2R3R4[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function0[typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2R3R4[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function0[typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  def bindNodeCallback(callbackFunc: js.Function): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  def bindNodeCallback(callbackFunc: js.Function1[/* callback */ js.Function1[/* err */ js.Any, _], _]): js.Function0[typings.rxjs.internalObservableMod.Observable[Unit]] = js.native
  def bindNodeCallback(
    callbackFunc: js.Function1[/* callback */ js.Function1[/* err */ js.Any, _], _],
    scheduler: SchedulerLike
  ): js.Function0[typings.rxjs.internalObservableMod.Observable[Unit]] = js.native
  def bindNodeCallback(callbackFunc: js.Function, resultSelector: js.Function): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[_]] = js.native
  def bindNodeCallback(callbackFunc: js.Function, resultSelector: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[_]] = js.native
  def bindNodeCallback(callbackFunc: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  def bindNodeCallback[A1](callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* err */ js.Any, _], _]): js.Function1[/* arg1 */ A1, typings.rxjs.internalObservableMod.Observable[Unit]] = js.native
  def bindNodeCallback[A1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* err */ js.Any, _], _],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, typings.rxjs.internalObservableMod.Observable[Unit]] = js.native
  def bindNodeCallback[A1, A2](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* err */ js.Any, _], _]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, typings.rxjs.internalObservableMod.Observable[Unit]] = js.native
  def bindNodeCallback[A1, A2](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* err */ js.Any, _], _],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, typings.rxjs.internalObservableMod.Observable[Unit]] = js.native
  def bindNodeCallback[A1, A2, A3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ]
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  def bindNodeCallback[A1, A2, A3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  def bindNodeCallback[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  def bindNodeCallback[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  def bindNodeCallback[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  def bindNodeCallback[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[Unit]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4A5R1[A1, A2, A3, A4, A5, R1](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[R1]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4A5R1[A1, A2, A3, A4, A5, R1](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[R1]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4A5R1R2[A1, A2, A3, A4, A5, R1, R2](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4A5R1R2[A1, A2, A3, A4, A5, R1, R2](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4A5R1R2R3[A1, A2, A3, A4, A5, R1, R2, R3](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4A5R1R2R3[A1, A2, A3, A4, A5, R1, R2, R3](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4A5R1R2R3R4_Function1[A1, A2, A3, A4, A5, R1, R2, R3, R4](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ]
  ): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4A5R1R2R3R4_Function1[A1, A2, A3, A4, A5, R1, R2, R3, R4](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4R1[A1, A2, A3, A4, R1](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[R1]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4R1[A1, A2, A3, A4, R1](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[R1]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4R1R2R3R4_Function1[A1, A2, A3, A4, R1, R2, R3, R4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ]
  ): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4R1R2R3R4_Function1[A1, A2, A3, A4, R1, R2, R3, R4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3R1[A1, A2, A3, R1](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ]
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[R1]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3R1[A1, A2, A3, R1](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[R1]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3R1R2[A1, A2, A3, R1, R2](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3R1R2[A1, A2, A3, R1, R2](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3R1R2R3R4_Function1[A1, A2, A3, R1, R2, R3, R4](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ]
  ): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3R1R2R3R4_Function1[A1, A2, A3, R1, R2, R3, R4](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, typings.rxjs.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, typings.rxjs.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function2[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function2[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function2[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function2[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2R1R2R3R4_Function1[A1, A2, R1, R2, R3, R4](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ]
  ): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2R1R2R3R4_Function1[A1, A2, R1, R2, R3, R4](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1R1[A1, R1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], _]
  ): js.Function1[/* arg1 */ A1, typings.rxjs.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1R1[A1, R1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], _],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, typings.rxjs.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function1[/* arg1 */ A1, typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function1[
    /* arg1 */ A1, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[
    /* arg1 */ A1, 
    typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ]
  ): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_R1[R1](callbackFunc: js.Function1[/* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], _]): js.Function0[typings.rxjs.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_R1[R1](
    callbackFunc: js.Function1[/* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], _],
    scheduler: SchedulerLike
  ): js.Function0[typings.rxjs.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_R1R2[R1, R2](
    callbackFunc: js.Function1[/* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], _]
  ): js.Function0[typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_R1R2[R1, R2](
    callbackFunc: js.Function1[/* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], _],
    scheduler: SchedulerLike
  ): js.Function0[typings.rxjs.internalObservableMod.Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function0[typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function0[typings.rxjs.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_R1R2R3R4_Function1[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ]
  ): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_R1R2R3R4_Function1[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        _
      ], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, typings.rxjs.internalObservableMod.Observable[js.Array[_]]] = js.native
  def combineLatest[O /* <: ObservableInput[_] */](observables: (O | SchedulerLike)*): typings.rxjs.internalObservableMod.Observable[js.Array[_]] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */](sources: js.Array[O1]): typings.rxjs.internalObservableMod.Observable[js.Array[ObservedValueOf[O1]]] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */](sources: js.Array[O1], scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[js.Array[ObservedValueOf[O1]]] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */](v1: O1): typings.rxjs.internalObservableMod.Observable[js.Array[ObservedValueOf[O1]]] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */](v1: O1, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[js.Array[ObservedValueOf[O1]]] = js.native
  def combineLatest[O /* <: ObservableInput[_] */, R](sources: js.Array[O], resultSelector: js.Function1[/* repeated */ ObservedValueOf[O], R]): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O /* <: ObservableInput[_] */, R](
    sources: js.Array[O],
    resultSelector: js.Function1[/* repeated */ ObservedValueOf[O], R],
    scheduler: SchedulerLike
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](sources: js.Tuple2[O1, O2]): typings.rxjs.internalObservableMod.Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](sources: js.Tuple2[O1, O2], scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R]): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R], scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](v1: O1, v2: O2): typings.rxjs.internalObservableMod.Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](v1: O1, v2: O2, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, R](
    sources: js.Tuple2[O1, O2],
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R]
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, R](
    sources: js.Tuple2[O1, O2],
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R],
    scheduler: SchedulerLike
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](sources: js.Tuple3[O1, O2, O3]): typings.rxjs.internalObservableMod.Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](sources: js.Tuple3[O1, O2, O3], scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R]
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R],
    scheduler: SchedulerLike
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3): typings.rxjs.internalObservableMod.Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
    sources: js.Tuple3[O1, O2, O3],
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ]
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
    sources: js.Tuple3[O1, O2, O3],
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ],
    scheduler: SchedulerLike
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](sources: js.Tuple4[O1, O2, O3, O4]): typings.rxjs.internalObservableMod.Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](sources: js.Tuple4[O1, O2, O3, O4], scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ]
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
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
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4): typings.rxjs.internalObservableMod.Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
    sources: js.Tuple4[O1, O2, O3, O4],
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ]
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
    sources: js.Tuple4[O1, O2, O3, O4],
    resultSelector: js.Function4[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      R
    ],
    scheduler: SchedulerLike
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](sources: js.Tuple5[O1, O2, O3, O4, O5]): typings.rxjs.internalObservableMod.Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](sources: js.Tuple5[O1, O2, O3, O4, O5], scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
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
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
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
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): typings.rxjs.internalObservableMod.Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
    sources: js.Tuple5[O1, O2, O3, O4, O5],
    resultSelector: js.Function5[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      /* v4 */ ObservedValueOf[O4], 
      /* v5 */ ObservedValueOf[O5], 
      R
    ]
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
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
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](sources: js.Tuple6[O1, O2, O3, O4, O5, O6]): typings.rxjs.internalObservableMod.Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](sources: js.Tuple6[O1, O2, O3, O4, O5, O6], scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
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
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
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
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): typings.rxjs.internalObservableMod.Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
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
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
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
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
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
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def combineLatest[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
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
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  @JSName("combineLatest")
  def combineLatest_O1_ObservableInputWildcardR[O1 /* <: ObservableInput[_] */, R](sources: js.Array[O1], resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R]): typings.rxjs.internalObservableMod.Observable[R] = js.native
  @JSName("combineLatest")
  def combineLatest_O1_ObservableInputWildcardR[O1 /* <: ObservableInput[_] */, R](
    sources: js.Array[O1],
    resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R],
    scheduler: SchedulerLike
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  @JSName("combineLatest")
  def combineLatest_O_ObservableInputWildcard[O /* <: ObservableInput[_] */](sources: js.Array[O]): typings.rxjs.internalObservableMod.Observable[js.Array[ObservedValueOf[O]]] = js.native
  @JSName("combineLatest")
  def combineLatest_O_ObservableInputWildcard[O /* <: ObservableInput[_] */](sources: js.Array[O], scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[js.Array[ObservedValueOf[O]]] = js.native
  @JSName("combineLatest")
  def combineLatest_O_ObservableInputWildcardR[O /* <: ObservableInput[_] */, R](
    observables: ((js.Function1[(/* repeated */ js.Any) | (/* repeated */ ObservedValueOf[O]), R]) | O | ObservableInput[_] | SchedulerLike)*
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  @JSName("combineLatest")
  def combineLatest_R[R](observables: (ObservableInput[_] | (js.Function1[/* repeated */ js.Any, R]) | SchedulerLike)*): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def concat[O /* <: ObservableInput[_] */](observables: (O | SchedulerLike)*): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O]] = js.native
  def concat[O1 /* <: ObservableInput[_] */](v1: O1): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O1]] = js.native
  def concat[O1 /* <: ObservableInput[_] */](v1: O1, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O1]] = js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](v1: O1, v2: O2): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O1 | O2]] = js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](v1: O1, v2: O2, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O1 | O2]] = js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O1 | O2 | O3]] = js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O1 | O2 | O3]] = js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O1 | O2 | O3 | O4]] = js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O1 | O2 | O3 | O4]] = js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5]] = js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5]] = js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5 | O6]] = js.native
  def concat[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5 | O6]] = js.native
  @JSName("concat")
  def concat_R[R](observables: (ObservableInput[_] | SchedulerLike)*): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def defer[O /* <: ObservableInput[_] */](observableFactory: js.Function0[O | Unit]): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O]] = js.native
  def empty(): typings.rxjs.internalObservableMod.Observable[scala.Nothing] = js.native
  def empty(scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[scala.Nothing] = js.native
  def forkJoin(args: (ObservableInput[_] | js.Function)*): typings.rxjs.internalObservableMod.Observable[_] = js.native
  def forkJoin(sourcesObject: js.Object): typings.rxjs.internalObservableMod.Observable[scala.Nothing] = js.native
  def forkJoin[A /* <: js.Array[ObservableInput[_]] */](sources: A): typings.rxjs.internalObservableMod.Observable[js.Array[ObservedValuesFromArray[A]]] = js.native
  def forkJoin[A](sources: js.Array[ObservableInput[A]]): typings.rxjs.internalObservableMod.Observable[js.Array[A]] = js.native
  def forkJoin[T](v1: SubscribableOrPromise[T]): typings.rxjs.internalObservableMod.Observable[js.Array[T]] = js.native
  def forkJoin[A, B](sources: js.Tuple2[ObservableInput[A], ObservableInput[B]]): typings.rxjs.internalObservableMod.Observable[js.Tuple2[A, B]] = js.native
  def forkJoin[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2]): typings.rxjs.internalObservableMod.Observable[js.Tuple2[T, T2]] = js.native
  def forkJoin[A, B, C](sources: js.Tuple3[ObservableInput[A], ObservableInput[B], ObservableInput[C]]): typings.rxjs.internalObservableMod.Observable[js.Tuple3[A, B, C]] = js.native
  def forkJoin[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3]): typings.rxjs.internalObservableMod.Observable[js.Tuple3[T, T2, T3]] = js.native
  def forkJoin[A, B, C, D](sources: js.Tuple4[ObservableInput[A], ObservableInput[B], ObservableInput[C], ObservableInput[D]]): typings.rxjs.internalObservableMod.Observable[js.Tuple4[A, B, C, D]] = js.native
  def forkJoin[T, T2, T3, T4](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): typings.rxjs.internalObservableMod.Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def forkJoin[A, B, C, D, E](
    sources: js.Tuple5[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E]
    ]
  ): typings.rxjs.internalObservableMod.Observable[js.Tuple5[A, B, C, D, E]] = js.native
  def forkJoin[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5]
  ): typings.rxjs.internalObservableMod.Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def forkJoin[A, B, C, D, E, F](
    sources: js.Tuple6[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E], 
      ObservableInput[F]
    ]
  ): typings.rxjs.internalObservableMod.Observable[js.Tuple6[A, B, C, D, E, F]] = js.native
  def forkJoin[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): typings.rxjs.internalObservableMod.Observable[js.Tuple6[T, T2, T3, T4, T5, T6]] = js.native
  @JSName("forkJoin")
  def forkJoin_T[T](sources: ObservableInput[T]*): typings.rxjs.internalObservableMod.Observable[js.Array[T]] = js.native
  @JSName("forkJoin")
  def forkJoin_TK_String[T, K /* <: String */](sourcesObject: T): typings.rxjs.internalObservableMod.Observable[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: rxjs.rxjs/internal/types.ObservedValueOf<T[K]>}
    */ forkJoin with T
  ] = js.native
  def from[O /* <: ObservableInput[_] */](input: O): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O]] = js.native
  def from[O /* <: ObservableInput[_] */](input: O, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[ObservedValueOf[O]] = js.native
  def fromEvent[T](target: FromEventTarget[T], eventName: String): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def fromEvent[T](target: FromEventTarget[T], eventName: String, options: EventListenerOptions): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def fromEvent[T](
    target: FromEventTarget[T],
    eventName: String,
    options: EventListenerOptions,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def fromEvent[T](
    target: FromEventTarget[T],
    eventName: String,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def fromEventPattern[T](addHandler: js.Function1[/* handler */ NodeEventHandler, _]): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, _],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, js.UndefOr[js.Any], Unit]
  ): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, _],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, /* signal */ js.UndefOr[js.Any], Unit],
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def generate[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S]): typings.rxjs.internalObservableMod.Observable[S] = js.native
  def generate[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S], scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[S] = js.native
  def generate[S](options: GenerateBaseOptions[S]): typings.rxjs.internalObservableMod.Observable[S] = js.native
  def generate[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T]
  ): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def generate[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T],
    scheduler: SchedulerLike
  ): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def generate[T, S](options: GenerateOptions[T, S]): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def identity[T](x: T): T = js.native
  def iif[T, F](condition: js.Function0[Boolean]): typings.rxjs.internalObservableMod.Observable[T | F] = js.native
  def iif[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): typings.rxjs.internalObservableMod.Observable[T | F] = js.native
  def iif[T, F](
    condition: js.Function0[Boolean],
    trueResult: SubscribableOrPromise[T],
    falseResult: SubscribableOrPromise[F]
  ): typings.rxjs.internalObservableMod.Observable[T | F] = js.native
  def interval(): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def interval(period: Double): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def interval(period: Double, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def isObservable[T](obj: js.Any): /* is rxjs.rxjs/internal/Observable.Observable<T> */ Boolean = js.native
  def merge[T](observables: (Double | ObservableInput[T] | SchedulerLike)*): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def merge[T](v1: ObservableInput[T]): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def merge[T](v1: ObservableInput[T], concurrent: Double): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def merge[T](v1: ObservableInput[T], concurrent: Double, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def merge[T](v1: ObservableInput[T], scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def merge[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2]): typings.rxjs.internalObservableMod.Observable[T | T2] = js.native
  def merge[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2], concurrent: Double): typings.rxjs.internalObservableMod.Observable[T | T2] = js.native
  def merge[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2], concurrent: Double, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[T | T2] = js.native
  def merge[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2], scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[T | T2] = js.native
  def merge[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3]): typings.rxjs.internalObservableMod.Observable[T | T2 | T3] = js.native
  def merge[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], concurrent: Double): typings.rxjs.internalObservableMod.Observable[T | T2 | T3] = js.native
  def merge[T, T2, T3](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    concurrent: Double,
    scheduler: SchedulerLike
  ): typings.rxjs.internalObservableMod.Observable[T | T2 | T3] = js.native
  def merge[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[T | T2 | T3] = js.native
  def merge[T, T2, T3, T4](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def merge[T, T2, T3, T4](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Double
  ): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def merge[T, T2, T3, T4](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    concurrent: Double,
    scheduler: SchedulerLike
  ): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def merge[T, T2, T3, T4](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    scheduler: SchedulerLike
  ): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def merge[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5]
  ): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def merge[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double
  ): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def merge[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    concurrent: Double,
    scheduler: SchedulerLike
  ): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def merge[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    scheduler: SchedulerLike
  ): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def merge[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def merge[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double
  ): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def merge[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    concurrent: Double,
    scheduler: SchedulerLike
  ): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def merge[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6],
    scheduler: SchedulerLike
  ): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSName("merge")
  def merge_TR[T, R](observables: (Double | ObservableInput[_] | SchedulerLike)*): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def never(): typings.rxjs.internalObservableMod.Observable[scala.Nothing] = js.native
  def noop(): Unit = js.native
  def of[T](a: T): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def of[T](a: T, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def of[T](args: (SchedulerLike | T)*): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def of[T, T2](a: T, b: T2): typings.rxjs.internalObservableMod.Observable[T | T2] = js.native
  def of[T, T2](a: T, b: T2, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[T | T2] = js.native
  def of[T, T2, T3](a: T, b: T2, c: T3): typings.rxjs.internalObservableMod.Observable[T | T2 | T3] = js.native
  def of[T, T2, T3](a: T, b: T2, c: T3, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[T | T2 | T3] = js.native
  def of[T, T2, T3, T4](a: T, b: T2, c: T3, d: T4): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def of[T, T2, T3, T4](a: T, b: T2, c: T3, d: T4, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def of[T, T2, T3, T4, T5](a: T, b: T2, c: T3, d: T4, e: T5): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def of[T, T2, T3, T4, T5](a: T, b: T2, c: T3, d: T4, e: T5, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def of[T, T2, T3, T4, T5, T6](a: T, b: T2, c: T3, d: T4, e: T5, f: T6): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def of[T, T2, T3, T4, T5, T6](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def of[T, T2, T3, T4, T5, T6, T7](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  def of[T, T2, T3, T4, T5, T6, T7](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  def of[T, T2, T3, T4, T5, T6, T7, T8](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  def of[T, T2, T3, T4, T5, T6, T7, T8](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  def of[T, T2, T3, T4, T5, T6, T7, T8, T9](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8, i: T9): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  def of[T, T2, T3, T4, T5, T6, T7, T8, T9](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8, i: T9, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  def onErrorResumeNext[R](array: js.Array[ObservableInput[_]]): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[R](observables: (ObservableInput[_] | (js.Function1[/* repeated */ js.Any, R]))*): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[R](v: ObservableInput[R]): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[T2, T3, R](v2: ObservableInput[T2], v3: ObservableInput[T3]): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[T2, T3, T4, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[T2, T3, T4, T5, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[T2, T3, T4, T5, T6, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def pairs[T](obj: js.Object): typings.rxjs.internalObservableMod.Observable[js.Tuple2[String, T]] = js.native
  def pairs[T](obj: js.Object, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[js.Tuple2[String, T]] = js.native
  def partition[T](source: ObservableInput[T], predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Tuple2[
    typings.rxjs.internalObservableMod.Observable[T], 
    typings.rxjs.internalObservableMod.Observable[T]
  ] = js.native
  def partition[T](
    source: ObservableInput[T],
    predicate: js.Function2[/* value */ T, /* index */ Double, Boolean],
    thisArg: js.Any
  ): js.Tuple2[
    typings.rxjs.internalObservableMod.Observable[T], 
    typings.rxjs.internalObservableMod.Observable[T]
  ] = js.native
  def pipe[T](): UnaryFunction[T, T] = js.native
  def pipe[T, A](fn1: UnaryFunction[T, A]): UnaryFunction[T, A] = js.native
  def pipe[T, A, B](fn1: UnaryFunction[T, A], fn2: UnaryFunction[A, B]): UnaryFunction[T, B] = js.native
  def pipe[T, A, B, C](fn1: UnaryFunction[T, A], fn2: UnaryFunction[A, B], fn3: UnaryFunction[B, C]): UnaryFunction[T, C] = js.native
  def pipe[T, A, B, C, D](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D]
  ): UnaryFunction[T, D] = js.native
  def pipe[T, A, B, C, D, E](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E]
  ): UnaryFunction[T, E] = js.native
  def pipe[T, A, B, C, D, E, F](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F]
  ): UnaryFunction[T, F] = js.native
  def pipe[T, A, B, C, D, E, F, G](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G]
  ): UnaryFunction[T, G] = js.native
  def pipe[T, A, B, C, D, E, F, G, H](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G],
    fn8: UnaryFunction[G, H]
  ): UnaryFunction[T, H] = js.native
  def pipe[T, A, B, C, D, E, F, G, H, I](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G],
    fn8: UnaryFunction[G, H],
    fn9: UnaryFunction[H, I]
  ): UnaryFunction[T, I] = js.native
  def pipe[T, A, B, C, D, E, F, G, H, I](
    fn1: UnaryFunction[T, A],
    fn2: UnaryFunction[A, B],
    fn3: UnaryFunction[B, C],
    fn4: UnaryFunction[C, D],
    fn5: UnaryFunction[D, E],
    fn6: UnaryFunction[E, F],
    fn7: UnaryFunction[F, G],
    fn8: UnaryFunction[G, H],
    fn9: UnaryFunction[H, I],
    fns: (UnaryFunction[_, _])*
  ): UnaryFunction[T, js.Object] = js.native
  def race(arg: js.Array[ObservableInput[_]]): typings.rxjs.internalObservableMod.Observable[js.Object] = js.native
  def race(observables: ObservableInput[_]*): typings.rxjs.internalObservableMod.Observable[js.Object] = js.native
  def race[A](a: ObservableInput[A]): typings.rxjs.internalObservableMod.Observable[A] = js.native
  def race[A, B](arg: js.Tuple2[ObservableInput[A], ObservableInput[B]]): typings.rxjs.internalObservableMod.Observable[A | B] = js.native
  def race[A, B](a: ObservableInput[A], b: ObservableInput[B]): typings.rxjs.internalObservableMod.Observable[A | B] = js.native
  def race[A, B, C](arg: js.Tuple3[ObservableInput[A], ObservableInput[B], ObservableInput[C]]): typings.rxjs.internalObservableMod.Observable[A | B | C] = js.native
  def race[A, B, C](a: ObservableInput[A], b: ObservableInput[B], c: ObservableInput[C]): typings.rxjs.internalObservableMod.Observable[A | B | C] = js.native
  def race[A, B, C, D](arg: js.Tuple4[ObservableInput[A], ObservableInput[B], ObservableInput[C], ObservableInput[D]]): typings.rxjs.internalObservableMod.Observable[A | B | C | D] = js.native
  def race[A, B, C, D](a: ObservableInput[A], b: ObservableInput[B], c: ObservableInput[C], d: ObservableInput[D]): typings.rxjs.internalObservableMod.Observable[A | B | C | D] = js.native
  def race[A, B, C, D, E](
    arg: js.Tuple5[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E]
    ]
  ): typings.rxjs.internalObservableMod.Observable[A | B | C | D | E] = js.native
  def race[A, B, C, D, E](
    a: ObservableInput[A],
    b: ObservableInput[B],
    c: ObservableInput[C],
    d: ObservableInput[D],
    e: ObservableInput[E]
  ): typings.rxjs.internalObservableMod.Observable[A | B | C | D | E] = js.native
  @JSName("race")
  def race_A[A](arg: js.Array[ObservableInput[A]]): typings.rxjs.internalObservableMod.Observable[A] = js.native
  @JSName("race")
  def race_T[T](arg: js.Array[ObservableInput[T]]): typings.rxjs.internalObservableMod.Observable[T] = js.native
  @JSName("race")
  def race_T[T](observables: ObservableInput[T]*): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def range(): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def range(start: Double): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def range(start: Double, count: Double): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def range(start: Double, count: Double, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def scheduled[T](input: ObservableInput[T], scheduler: SchedulerLike): Observable[T] = js.native
  def throwError(error: js.Any): typings.rxjs.internalObservableMod.Observable[scala.Nothing] = js.native
  def throwError(error: js.Any, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[scala.Nothing] = js.native
  def timer(): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def timer(dueTime: Double): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: Double): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: Double, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def timer(dueTime: Date): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def timer(dueTime: Date, periodOrScheduler: Double): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def timer(dueTime: Date, periodOrScheduler: Double, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def timer(dueTime: Date, periodOrScheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def timer(dueTime: Date, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def using[T](
    resourceFactory: js.Function0[Unsubscribable | Unit],
    observableFactory: js.Function1[/* resource */ Unsubscribable | Unit, ObservableInput[T] | Unit]
  ): typings.rxjs.internalObservableMod.Observable[T] = js.native
  def zip[O /* <: ObservableInput[_] */](array: js.Array[O]): typings.rxjs.internalObservableMod.Observable[js.Array[ObservedValueOf[O]]] = js.native
  def zip[R](array: js.Array[ObservableInput[_]], resultSelector: js.Function1[/* repeated */ js.Any, R]): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def zip[O /* <: ObservableInput[_] */](observables: O*): typings.rxjs.internalObservableMod.Observable[js.Array[ObservedValueOf[O]]] = js.native
  def zip[O1 /* <: ObservableInput[_] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ ObservedValueOf[O1], R]): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](v1: O1, v2: O2): typings.rxjs.internalObservableMod.Observable[js.Tuple2[ObservedValueOf[O1], ObservedValueOf[O2]]] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[/* v1 */ ObservedValueOf[O1], /* v2 */ ObservedValueOf[O2], R]
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3): typings.rxjs.internalObservableMod.Observable[js.Tuple3[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3]]] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    v3: O3,
    resultSelector: js.Function3[
      /* v1 */ ObservedValueOf[O1], 
      /* v2 */ ObservedValueOf[O2], 
      /* v3 */ ObservedValueOf[O3], 
      R
    ]
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4): typings.rxjs.internalObservableMod.Observable[
    js.Tuple4[ObservedValueOf[O1], ObservedValueOf[O2], ObservedValueOf[O3], ObservedValueOf[O4]]
  ] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, R](
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
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): typings.rxjs.internalObservableMod.Observable[
    js.Tuple5[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5]
    ]
  ] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, R](
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
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): typings.rxjs.internalObservableMod.Observable[
    js.Tuple6[
      ObservedValueOf[O1], 
      ObservedValueOf[O2], 
      ObservedValueOf[O3], 
      ObservedValueOf[O4], 
      ObservedValueOf[O5], 
      ObservedValueOf[O6]
    ]
  ] = js.native
  def zip[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */, R](
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
  ): typings.rxjs.internalObservableMod.Observable[R] = js.native
  @JSName("zip")
  def zip_O_ObservableInputWildcardR[O /* <: ObservableInput[_] */, R](array: js.Array[O], resultSelector: js.Function1[/* repeated */ ObservedValueOf[O], R]): typings.rxjs.internalObservableMod.Observable[R] = js.native
  @JSName("zip")
  def zip_O_ObservableInputWildcardR[O /* <: ObservableInput[_] */, R](observables: (O | (js.Function1[/* repeated */ ObservedValueOf[O], R]))*): typings.rxjs.internalObservableMod.Observable[R] = js.native
  @JSName("zip")
  def zip_R[R](array: js.Array[ObservableInput[_]]): typings.rxjs.internalObservableMod.Observable[R] = js.native
  @JSName("zip")
  def zip_R[R](observables: (ObservableInput[_] | (js.Function1[/* repeated */ js.Any, R]))*): typings.rxjs.internalObservableMod.Observable[R] = js.native
}

