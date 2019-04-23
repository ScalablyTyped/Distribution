package typings
package rxjsLib.rxjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ArgumentOutOfRangeError: rxjsLib.internalUtilArgumentOutOfRangeErrorMod.ArgumentOutOfRangeErrorCtor = js.native
  val EMPTY: rxjsLib.internalObservableMod.Observable[scala.Nothing] = js.native
  val EmptyError: rxjsLib.internalUtilEmptyErrorMod.EmptyErrorCtor = js.native
  val NEVER: rxjsLib.internalObservableMod.Observable[scala.Nothing] = js.native
  val ObjectUnsubscribedError: rxjsLib.internalUtilObjectUnsubscribedErrorMod.ObjectUnsubscribedErrorCtor = js.native
  val TimeoutError: rxjsLib.internalUtilTimeoutErrorMod.TimeoutErrorCtor = js.native
  val UnsubscriptionError: rxjsLib.internalUtilUnsubscriptionErrorMod.UnsubscriptionErrorCtor = js.native
  val animationFrameScheduler: rxjsLib.internalSchedulerAnimationFrameSchedulerMod.AnimationFrameScheduler = js.native
  val asapScheduler: rxjsLib.internalSchedulerAsapSchedulerMod.AsapScheduler = js.native
  val asyncScheduler: rxjsLib.internalSchedulerAsyncSchedulerMod.AsyncScheduler = js.native
  val observable: java.lang.String | js.Symbol = js.native
  val queueScheduler: rxjsLib.internalSchedulerQueueSchedulerMod.QueueScheduler = js.native
  def bindCallback(callbackFunc: js.Function): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[_]] = js.native
  def bindCallback(callbackFunc: js.Function1[/* callback */ js.Function0[_], _]): js.Function0[rxjsLib.internalObservableMod.Observable[scala.Unit]] = js.native
  def bindCallback(
    callbackFunc: js.Function1[/* callback */ js.Function0[_], _],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function0[rxjsLib.internalObservableMod.Observable[scala.Unit]] = js.native
  def bindCallback(callbackFunc: js.Function, resultSelector: js.Function): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[_]] = js.native
  def bindCallback(
    callbackFunc: js.Function,
    resultSelector: js.Function,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[_]] = js.native
  def bindCallback(callbackFunc: js.Function, scheduler: rxjsLib.internalTypesMod.SchedulerLike): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[_]] = js.native
  def bindCallback[A1](callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function0[_], _]): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[scala.Unit]] = js.native
  def bindCallback[A1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function0[_], _],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[scala.Unit]] = js.native
  def bindCallback[A1, A2](callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function0[_], _]): js.Function2[/* arg1 */ A1, /* arg2 */ A2, rxjsLib.internalObservableMod.Observable[scala.Unit]] = js.native
  def bindCallback[A1, A2](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function0[_], _],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, rxjsLib.internalObservableMod.Observable[scala.Unit]] = js.native
  def bindCallback[A1, A2, A3](
    callbackFunc: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* callback */ js.Function0[_], _]
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    rxjsLib.internalObservableMod.Observable[scala.Unit]
  ] = js.native
  def bindCallback[A1, A2, A3](
    callbackFunc: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* callback */ js.Function0[_], _],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    rxjsLib.internalObservableMod.Observable[scala.Unit]
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
    rxjsLib.internalObservableMod.Observable[scala.Unit]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    rxjsLib.internalObservableMod.Observable[scala.Unit]
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
    rxjsLib.internalObservableMod.Observable[scala.Unit]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    rxjsLib.internalObservableMod.Observable[scala.Unit]
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
    rxjsLib.internalObservableMod.Observable[R1]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    rxjsLib.internalObservableMod.Observable[R1]
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
    rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]
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
    rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
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
    rxjsLib.internalObservableMod.Observable[js.Array[_]]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    rxjsLib.internalObservableMod.Observable[js.Array[_]]
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
    rxjsLib.internalObservableMod.Observable[R1]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    rxjsLib.internalObservableMod.Observable[R1]
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
    rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]
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
    rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
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
    rxjsLib.internalObservableMod.Observable[js.Array[_]]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    rxjsLib.internalObservableMod.Observable[js.Array[_]]
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
    rxjsLib.internalObservableMod.Observable[R1]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    rxjsLib.internalObservableMod.Observable[R1]
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
    rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]
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
    rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
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
    rxjsLib.internalObservableMod.Observable[js.Array[_]]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    rxjsLib.internalObservableMod.Observable[js.Array[_]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* res1 */ R1, _], _]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, rxjsLib.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* res1 */ R1, _], _],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, rxjsLib.internalObservableMod.Observable[R1]] = js.native
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
    rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function2[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]
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
    rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function2[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1R2R3R4[A1, A2, R1, R2, R3, R4](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1A2R1R2R3R4[A1, A2, R1, R2, R3, R4](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1[A1, R1](callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* res1 */ R1, _], _]): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1[A1, R1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* res1 */ R1, _], _],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], _]
  ): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], _],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindCallback")
  def bindCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindCallback")
  def bindCallback_ARFunction1[A, R](callbackFunc: js.Function1[A | (js.Function1[/* repeated */ R, _]), _]): js.Function1[/* repeated */ A, rxjsLib.internalObservableMod.Observable[js.Array[R]]] = js.native
  @JSName("bindCallback")
  def bindCallback_ARFunction1[A, R](
    callbackFunc: js.Function1[A | (js.Function1[/* repeated */ R, _]), _],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* repeated */ A, rxjsLib.internalObservableMod.Observable[js.Array[R]]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1[R1](callbackFunc: js.Function1[/* callback */ js.Function1[/* res1 */ R1, _], _]): js.Function0[rxjsLib.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1[R1](
    callbackFunc: js.Function1[/* callback */ js.Function1[/* res1 */ R1, _], _],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function0[rxjsLib.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2[R1, R2](callbackFunc: js.Function1[/* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], _]): js.Function0[rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2[R1, R2](
    callbackFunc: js.Function1[/* callback */ js.Function2[/* res1 */ R1, /* res2 */ R2, _], _],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function0[rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[/* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], _]
  ): js.Function0[rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[/* callback */ js.Function3[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], _],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function0[rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2R3R4[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ]
  ): js.Function0[rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindCallback")
  def bindCallback_R1R2R3R4[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function5[/* res1 */ R1, /* res2 */ R2, /* res3 */ R3, /* res4 */ R4, /* repeated */ js.Any, _], 
      _
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function0[rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
  def bindNodeCallback(callbackFunc: js.Function): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
  def bindNodeCallback(callbackFunc: js.Function1[/* callback */ js.Function1[/* err */ js.Any, _], _]): js.Function0[rxjsLib.internalObservableMod.Observable[scala.Unit]] = js.native
  def bindNodeCallback(
    callbackFunc: js.Function1[/* callback */ js.Function1[/* err */ js.Any, _], _],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function0[rxjsLib.internalObservableMod.Observable[scala.Unit]] = js.native
  def bindNodeCallback(callbackFunc: js.Function, resultSelector: js.Function): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[_]] = js.native
  def bindNodeCallback(
    callbackFunc: js.Function,
    resultSelector: js.Function,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[_]] = js.native
  def bindNodeCallback(callbackFunc: js.Function, scheduler: rxjsLib.internalTypesMod.SchedulerLike): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
  def bindNodeCallback[A1](callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* err */ js.Any, _], _]): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[scala.Unit]] = js.native
  def bindNodeCallback[A1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* err */ js.Any, _], _],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[scala.Unit]] = js.native
  def bindNodeCallback[A1, A2](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* err */ js.Any, _], _]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, rxjsLib.internalObservableMod.Observable[scala.Unit]] = js.native
  def bindNodeCallback[A1, A2](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* err */ js.Any, _], _],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, rxjsLib.internalObservableMod.Observable[scala.Unit]] = js.native
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
    rxjsLib.internalObservableMod.Observable[scala.Unit]
  ] = js.native
  def bindNodeCallback[A1, A2, A3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    rxjsLib.internalObservableMod.Observable[scala.Unit]
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
    rxjsLib.internalObservableMod.Observable[scala.Unit]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    rxjsLib.internalObservableMod.Observable[scala.Unit]
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
    rxjsLib.internalObservableMod.Observable[scala.Unit]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    rxjsLib.internalObservableMod.Observable[scala.Unit]
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
    rxjsLib.internalObservableMod.Observable[R1]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    rxjsLib.internalObservableMod.Observable[R1]
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
    rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]
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
    rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4A5R1R2R3R4Function1[A1, A2, A3, A4, A5, R1, R2, R3, R4](
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
  ): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4A5R1R2R3R4Function1[A1, A2, A3, A4, A5, R1, R2, R3, R4](
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
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
    rxjsLib.internalObservableMod.Observable[R1]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    rxjsLib.internalObservableMod.Observable[R1]
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
    rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]
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
    rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4R1R2R3R4Function1[A1, A2, A3, A4, R1, R2, R3, R4](
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
  ): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3A4R1R2R3R4Function1[A1, A2, A3, A4, R1, R2, R3, R4](
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
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
    rxjsLib.internalObservableMod.Observable[R1]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    rxjsLib.internalObservableMod.Observable[R1]
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
    rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]
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
    rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function3[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3R1R2R3R4Function1[A1, A2, A3, R1, R2, R3, R4](
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
  ): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2A3R1R2R3R4Function1[A1, A2, A3, R1, R2, R3, R4](
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, rxjsLib.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], 
      _
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, rxjsLib.internalObservableMod.Observable[R1]] = js.native
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
    rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function2[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]
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
    rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function2[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]
  ] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2R1R2R3R4Function1[A1, A2, R1, R2, R3, R4](
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
  ): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1A2R1R2R3R4Function1[A1, A2, R1, R2, R3, R4](
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1R1[A1, R1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], _]
  ): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1R1[A1, R1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], _],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ]
  ): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], 
      _
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* arg1 */ A1, rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]] = js.native
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
  ): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_R1[R1](callbackFunc: js.Function1[/* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], _]): js.Function0[rxjsLib.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_R1[R1](
    callbackFunc: js.Function1[/* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, _], _],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function0[rxjsLib.internalObservableMod.Observable[R1]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_R1R2[R1, R2](
    callbackFunc: js.Function1[/* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], _]
  ): js.Function0[rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_R1R2[R1, R2](
    callbackFunc: js.Function1[/* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, _], _],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function0[rxjsLib.internalObservableMod.Observable[js.Tuple2[R1, R2]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ]
  ): js.Function0[rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, _], 
      _
    ],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function0[rxjsLib.internalObservableMod.Observable[js.Tuple3[R1, R2, R3]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_R1R2R3R4Function1[R1, R2, R3, R4](
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
  ): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
  @JSName("bindNodeCallback")
  def bindNodeCallback_R1R2R3R4Function1[R1, R2, R3, R4](
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
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): js.Function1[/* repeated */ js.Any, rxjsLib.internalObservableMod.Observable[js.Array[_]]] = js.native
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
    observables: ((js.Function1[/* repeated */ rxjsLib.internalTypesMod.ObservedValueOf[O], R]) | (js.Function1[/* repeated */ js.Any, R]) | O | rxjsLib.internalTypesMod.ObservableInput[_] | rxjsLib.internalTypesMod.SchedulerLike)*
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def concat[R](
    observables: (rxjsLib.internalTypesMod.ObservableInput[_] | rxjsLib.internalTypesMod.SchedulerLike)*
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1): rxjsLib.internalObservableMod.Observable[rxjsLib.internalTypesMod.ObservedValueOf[O1]] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[rxjsLib.internalTypesMod.ObservedValueOf[O1]] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2] | rxjsLib.internalTypesMod.ObservedValueOf[O3]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2] | rxjsLib.internalTypesMod.ObservedValueOf[O3]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2] | rxjsLib.internalTypesMod.ObservedValueOf[O3] | rxjsLib.internalTypesMod.ObservedValueOf[O4]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2] | rxjsLib.internalTypesMod.ObservedValueOf[O3] | rxjsLib.internalTypesMod.ObservedValueOf[O4]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2] | rxjsLib.internalTypesMod.ObservedValueOf[O3] | rxjsLib.internalTypesMod.ObservedValueOf[O4] | rxjsLib.internalTypesMod.ObservedValueOf[O5]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2] | rxjsLib.internalTypesMod.ObservedValueOf[O3] | rxjsLib.internalTypesMod.ObservedValueOf[O4] | rxjsLib.internalTypesMod.ObservedValueOf[O5]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O6 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2] | rxjsLib.internalTypesMod.ObservedValueOf[O3] | rxjsLib.internalTypesMod.ObservedValueOf[O4] | rxjsLib.internalTypesMod.ObservedValueOf[O5] | rxjsLib.internalTypesMod.ObservedValueOf[O6]
  ] = js.native
  def concat[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O6 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[
    rxjsLib.internalTypesMod.ObservedValueOf[O1] | rxjsLib.internalTypesMod.ObservedValueOf[O2] | rxjsLib.internalTypesMod.ObservedValueOf[O3] | rxjsLib.internalTypesMod.ObservedValueOf[O4] | rxjsLib.internalTypesMod.ObservedValueOf[O5] | rxjsLib.internalTypesMod.ObservedValueOf[O6]
  ] = js.native
  @JSName("concat")
  def concat_OObservableInput[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](observables: (O | rxjsLib.internalTypesMod.SchedulerLike)*): rxjsLib.internalObservableMod.Observable[rxjsLib.internalTypesMod.ObservedValueOf[O]] = js.native
  def defer[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](observableFactory: js.Function0[O | scala.Unit]): rxjsLib.internalObservableMod.Observable[rxjsLib.internalTypesMod.ObservedValueOf[O]] = js.native
  def empty(): rxjsLib.internalObservableMod.Observable[scala.Nothing] = js.native
  def empty(scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[scala.Nothing] = js.native
  def forkJoin(args: (rxjsLib.internalTypesMod.ObservableInput[_] | js.Function)*): rxjsLib.internalObservableMod.Observable[_] = js.native
  def forkJoin(sourcesObject: js.Object): rxjsLib.internalObservableMod.Observable[scala.Nothing] = js.native
  def forkJoin[A /* <: js.Array[rxjsLib.internalTypesMod.ObservableInput[_]] */](sources: A): rxjsLib.internalObservableMod.Observable[js.Array[rxjsLib.internalTypesMod.ObservedValuesFromArray[A]]] = js.native
  def forkJoin[A](sources: js.Array[rxjsLib.internalTypesMod.ObservableInput[A]]): rxjsLib.internalObservableMod.Observable[js.Array[A]] = js.native
  def forkJoin[T](v1: rxjsLib.internalTypesMod.SubscribableOrPromise[T]): rxjsLib.internalObservableMod.Observable[js.Array[T]] = js.native
  def forkJoin[A, B](
    sources: js.Tuple2[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B]
    ]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple2[A, B]] = js.native
  def forkJoin[T, T2](v1: rxjsLib.internalTypesMod.ObservableInput[T], v2: rxjsLib.internalTypesMod.ObservableInput[T2]): rxjsLib.internalObservableMod.Observable[js.Tuple2[T, T2]] = js.native
  def forkJoin[A, B, C](
    sources: js.Tuple3[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B], 
      rxjsLib.internalTypesMod.ObservableInput[C]
    ]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple3[A, B, C]] = js.native
  def forkJoin[T, T2, T3](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple3[T, T2, T3]] = js.native
  def forkJoin[A, B, C, D](
    sources: js.Tuple4[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B], 
      rxjsLib.internalTypesMod.ObservableInput[C], 
      rxjsLib.internalTypesMod.ObservableInput[D]
    ]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple4[A, B, C, D]] = js.native
  def forkJoin[T, T2, T3, T4](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def forkJoin[A, B, C, D, E](
    sources: js.Tuple5[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B], 
      rxjsLib.internalTypesMod.ObservableInput[C], 
      rxjsLib.internalTypesMod.ObservableInput[D], 
      rxjsLib.internalTypesMod.ObservableInput[E]
    ]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple5[A, B, C, D, E]] = js.native
  def forkJoin[T, T2, T3, T4, T5](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def forkJoin[A, B, C, D, E, F](
    sources: js.Tuple6[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B], 
      rxjsLib.internalTypesMod.ObservableInput[C], 
      rxjsLib.internalTypesMod.ObservableInput[D], 
      rxjsLib.internalTypesMod.ObservableInput[E], 
      rxjsLib.internalTypesMod.ObservableInput[F]
    ]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple6[A, B, C, D, E, F]] = js.native
  def forkJoin[T, T2, T3, T4, T5, T6](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6]
  ): rxjsLib.internalObservableMod.Observable[js.Tuple6[T, T2, T3, T4, T5, T6]] = js.native
  @JSName("forkJoin")
  def forkJoin_T[T](sources: rxjsLib.internalTypesMod.ObservableInput[T]*): rxjsLib.internalObservableMod.Observable[js.Array[T]] = js.native
  @JSName("forkJoin")
  def forkJoin_TKString[T, K /* <: java.lang.String */](sourcesObject: T): rxjsLib.internalObservableMod.Observable[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: rxjs.rxjs/internal/types.ObservedValueOf<T[K]>}
    */ rxjsLib.rxjsLibStrings.forkJoin with T
  ] = js.native
  def from[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](input: O): rxjsLib.internalObservableMod.Observable[rxjsLib.internalTypesMod.ObservedValueOf[O]] = js.native
  def from[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](input: O, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[rxjsLib.internalTypesMod.ObservedValueOf[O]] = js.native
  def fromEvent[T](target: rxjsLib.internalObservableFromEventMod.FromEventTarget[T], eventName: java.lang.String): rxjsLib.internalObservableMod.Observable[T] = js.native
  def fromEvent[T](
    target: rxjsLib.internalObservableFromEventMod.FromEventTarget[T],
    eventName: java.lang.String,
    options: rxjsLib.internalObservableFromEventMod.EventListenerOptions
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
  def fromEvent[T](
    target: rxjsLib.internalObservableFromEventMod.FromEventTarget[T],
    eventName: java.lang.String,
    options: rxjsLib.internalObservableFromEventMod.EventListenerOptions,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
  def fromEvent[T](
    target: rxjsLib.internalObservableFromEventMod.FromEventTarget[T],
    eventName: java.lang.String,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
  def fromEventPattern[T](addHandler: js.Function1[/* handler */ rxjsLib.internalObservableFromEventMod.NodeEventHandler, _]): rxjsLib.internalObservableMod.Observable[T] = js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ rxjsLib.internalObservableFromEventMod.NodeEventHandler, _],
    removeHandler: js.Function2[
      /* handler */ rxjsLib.internalObservableFromEventMod.NodeEventHandler, 
      /* signal */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
  def fromEventPattern[T](
    addHandler: js.Function1[/* handler */ rxjsLib.internalObservableFromEventMod.NodeEventHandler, _],
    removeHandler: js.Function2[
      /* handler */ rxjsLib.internalObservableFromEventMod.NodeEventHandler, 
      /* signal */ js.UndefOr[js.Any], 
      scala.Unit
    ],
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
  def generate[S](
    initialState: S,
    condition: rxjsLib.internalObservableGenerateMod.ConditionFunc[S],
    iterate: rxjsLib.internalObservableGenerateMod.IterateFunc[S]
  ): rxjsLib.internalObservableMod.Observable[S] = js.native
  def generate[S](
    initialState: S,
    condition: rxjsLib.internalObservableGenerateMod.ConditionFunc[S],
    iterate: rxjsLib.internalObservableGenerateMod.IterateFunc[S],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[S] = js.native
  def generate[S](options: rxjsLib.internalObservableGenerateMod.GenerateBaseOptions[S]): rxjsLib.internalObservableMod.Observable[S] = js.native
  def generate[T, S](
    initialState: S,
    condition: rxjsLib.internalObservableGenerateMod.ConditionFunc[S],
    iterate: rxjsLib.internalObservableGenerateMod.IterateFunc[S],
    resultSelector: rxjsLib.internalObservableGenerateMod.ResultFunc[S, T]
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
  def generate[T, S](
    initialState: S,
    condition: rxjsLib.internalObservableGenerateMod.ConditionFunc[S],
    iterate: rxjsLib.internalObservableGenerateMod.IterateFunc[S],
    resultSelector: rxjsLib.internalObservableGenerateMod.ResultFunc[S, T],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
  def generate[T, S](options: rxjsLib.internalObservableGenerateMod.GenerateOptions[T, S]): rxjsLib.internalObservableMod.Observable[T] = js.native
  def identity[T](x: T): T = js.native
  def iif[T, F](condition: js.Function0[scala.Boolean]): rxjsLib.internalObservableMod.Observable[T | F] = js.native
  def iif[T, F](
    condition: js.Function0[scala.Boolean],
    trueResult: rxjsLib.internalTypesMod.SubscribableOrPromise[T]
  ): rxjsLib.internalObservableMod.Observable[T | F] = js.native
  def iif[T, F](
    condition: js.Function0[scala.Boolean],
    trueResult: rxjsLib.internalTypesMod.SubscribableOrPromise[T],
    falseResult: rxjsLib.internalTypesMod.SubscribableOrPromise[F]
  ): rxjsLib.internalObservableMod.Observable[T | F] = js.native
  def interval(): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def interval(period: scala.Double): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def interval(period: scala.Double, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def isObservable[T](obj: js.Any): /* is rxjs.rxjs/internal/Observable.Observable<T> */ scala.Boolean = js.native
  def merge[T](
    observables: (scala.Double | rxjsLib.internalTypesMod.ObservableInput[T] | rxjsLib.internalTypesMod.SchedulerLike)*
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
  def merge[T](v1: rxjsLib.internalTypesMod.ObservableInput[T]): rxjsLib.internalObservableMod.Observable[T] = js.native
  def merge[T](v1: rxjsLib.internalTypesMod.ObservableInput[T], concurrent: scala.Double): rxjsLib.internalObservableMod.Observable[T] = js.native
  def merge[T](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    concurrent: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
  def merge[T](v1: rxjsLib.internalTypesMod.ObservableInput[T], scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[T] = js.native
  def merge[T, T2](v1: rxjsLib.internalTypesMod.ObservableInput[T], v2: rxjsLib.internalTypesMod.ObservableInput[T2]): rxjsLib.internalObservableMod.Observable[T | T2] = js.native
  def merge[T, T2](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    concurrent: scala.Double
  ): rxjsLib.internalObservableMod.Observable[T | T2] = js.native
  def merge[T, T2](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    concurrent: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T | T2] = js.native
  def merge[T, T2](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T | T2] = js.native
  def merge[T, T2, T3](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3]
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3] = js.native
  def merge[T, T2, T3](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    concurrent: scala.Double
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3] = js.native
  def merge[T, T2, T3](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    concurrent: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3] = js.native
  def merge[T, T2, T3](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3] = js.native
  def merge[T, T2, T3, T4](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4]
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def merge[T, T2, T3, T4](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    concurrent: scala.Double
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def merge[T, T2, T3, T4](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    concurrent: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def merge[T, T2, T3, T4](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def merge[T, T2, T3, T4, T5](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5]
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def merge[T, T2, T3, T4, T5](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    concurrent: scala.Double
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def merge[T, T2, T3, T4, T5](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    concurrent: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def merge[T, T2, T3, T4, T5](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def merge[T, T2, T3, T4, T5, T6](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6]
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def merge[T, T2, T3, T4, T5, T6](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6],
    concurrent: scala.Double
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def merge[T, T2, T3, T4, T5, T6](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6],
    concurrent: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def merge[T, T2, T3, T4, T5, T6](
    v1: rxjsLib.internalTypesMod.ObservableInput[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSName("merge")
  def merge_TR[T, R](
    observables: (scala.Double | rxjsLib.internalTypesMod.ObservableInput[_] | rxjsLib.internalTypesMod.SchedulerLike)*
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def never(): rxjsLib.internalObservableMod.Observable[scala.Nothing] = js.native
  def noop(): scala.Unit = js.native
  def of[T](a: T): rxjsLib.internalObservableMod.Observable[T] = js.native
  def of[T](a: T, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[T] = js.native
  def of[T](args: (rxjsLib.internalTypesMod.SchedulerLike | T)*): rxjsLib.internalObservableMod.Observable[T] = js.native
  def of[T, T2](a: T, b: T2): rxjsLib.internalObservableMod.Observable[T | T2] = js.native
  def of[T, T2](a: T, b: T2, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[T | T2] = js.native
  def of[T, T2, T3](a: T, b: T2, c: T3): rxjsLib.internalObservableMod.Observable[T | T2 | T3] = js.native
  def of[T, T2, T3](a: T, b: T2, c: T3, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[T | T2 | T3] = js.native
  def of[T, T2, T3, T4](a: T, b: T2, c: T3, d: T4): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def of[T, T2, T3, T4](a: T, b: T2, c: T3, d: T4, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4] = js.native
  def of[T, T2, T3, T4, T5](a: T, b: T2, c: T3, d: T4, e: T5): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def of[T, T2, T3, T4, T5](a: T, b: T2, c: T3, d: T4, e: T5, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5] = js.native
  def of[T, T2, T3, T4, T5, T6](a: T, b: T2, c: T3, d: T4, e: T5, f: T6): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def of[T, T2, T3, T4, T5, T6](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6] = js.native
  def of[T, T2, T3, T4, T5, T6, T7](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  def of[T, T2, T3, T4, T5, T6, T7](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  def of[T, T2, T3, T4, T5, T6, T7, T8](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  def of[T, T2, T3, T4, T5, T6, T7, T8](
    a: T,
    b: T2,
    c: T3,
    d: T4,
    e: T5,
    f: T6,
    g: T7,
    h: T8,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
  def of[T, T2, T3, T4, T5, T6, T7, T8, T9](a: T, b: T2, c: T3, d: T4, e: T5, f: T6, g: T7, h: T8, i: T9): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  def of[T, T2, T3, T4, T5, T6, T7, T8, T9](
    a: T,
    b: T2,
    c: T3,
    d: T4,
    e: T5,
    f: T6,
    g: T7,
    h: T8,
    i: T9,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[T | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
  def onErrorResumeNext[R](array: js.Array[rxjsLib.internalTypesMod.ObservableInput[_]]): rxjsLib.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[R](
    observables: (rxjsLib.internalTypesMod.ObservableInput[_] | (js.Function1[/* repeated */ js.Any, R]))*
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[R](v: rxjsLib.internalTypesMod.ObservableInput[R]): rxjsLib.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[T2, T3, R](v2: rxjsLib.internalTypesMod.ObservableInput[T2], v3: rxjsLib.internalTypesMod.ObservableInput[T3]): rxjsLib.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[T2, T3, T4, R](
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[T2, T3, T4, T5, R](
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[T2, T3, T4, T5, T6, R](
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def pairs[T](obj: js.Object): rxjsLib.internalObservableMod.Observable[js.Tuple2[java.lang.String, T]] = js.native
  def pairs[T](obj: js.Object, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[js.Tuple2[java.lang.String, T]] = js.native
  def partition[T](
    source: rxjsLib.internalTypesMod.ObservableInput[T],
    predicate: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): js.Tuple2[
    rxjsLib.internalObservableMod.Observable[T], 
    rxjsLib.internalObservableMod.Observable[T]
  ] = js.native
  def partition[T](
    source: rxjsLib.internalTypesMod.ObservableInput[T],
    predicate: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    thisArg: js.Any
  ): js.Tuple2[
    rxjsLib.internalObservableMod.Observable[T], 
    rxjsLib.internalObservableMod.Observable[T]
  ] = js.native
  def pipe[T](): rxjsLib.internalTypesMod.UnaryFunction[T, T] = js.native
  def pipe[T, A](fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A]): rxjsLib.internalTypesMod.UnaryFunction[T, A] = js.native
  def pipe[T, A, B](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, B] = js.native
  def pipe[T, A, B, C](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, C] = js.native
  def pipe[T, A, B, C, D](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, D] = js.native
  def pipe[T, A, B, C, D, E](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, E] = js.native
  def pipe[T, A, B, C, D, E, F](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E],
    fn6: rxjsLib.internalTypesMod.UnaryFunction[E, F]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, F] = js.native
  def pipe[T, A, B, C, D, E, F, G](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E],
    fn6: rxjsLib.internalTypesMod.UnaryFunction[E, F],
    fn7: rxjsLib.internalTypesMod.UnaryFunction[F, G]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, G] = js.native
  def pipe[T, A, B, C, D, E, F, G, H](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E],
    fn6: rxjsLib.internalTypesMod.UnaryFunction[E, F],
    fn7: rxjsLib.internalTypesMod.UnaryFunction[F, G],
    fn8: rxjsLib.internalTypesMod.UnaryFunction[G, H]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, H] = js.native
  def pipe[T, A, B, C, D, E, F, G, H, I](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E],
    fn6: rxjsLib.internalTypesMod.UnaryFunction[E, F],
    fn7: rxjsLib.internalTypesMod.UnaryFunction[F, G],
    fn8: rxjsLib.internalTypesMod.UnaryFunction[G, H],
    fn9: rxjsLib.internalTypesMod.UnaryFunction[H, I]
  ): rxjsLib.internalTypesMod.UnaryFunction[T, I] = js.native
  def pipe[T, A, B, C, D, E, F, G, H, I](
    fn1: rxjsLib.internalTypesMod.UnaryFunction[T, A],
    fn2: rxjsLib.internalTypesMod.UnaryFunction[A, B],
    fn3: rxjsLib.internalTypesMod.UnaryFunction[B, C],
    fn4: rxjsLib.internalTypesMod.UnaryFunction[C, D],
    fn5: rxjsLib.internalTypesMod.UnaryFunction[D, E],
    fn6: rxjsLib.internalTypesMod.UnaryFunction[E, F],
    fn7: rxjsLib.internalTypesMod.UnaryFunction[F, G],
    fn8: rxjsLib.internalTypesMod.UnaryFunction[G, H],
    fn9: rxjsLib.internalTypesMod.UnaryFunction[H, I],
    fns: (rxjsLib.internalTypesMod.UnaryFunction[_, _])*
  ): rxjsLib.internalTypesMod.UnaryFunction[T, js.Object] = js.native
  def race(arg: js.Array[rxjsLib.internalTypesMod.ObservableInput[_]]): rxjsLib.internalObservableMod.Observable[js.Object] = js.native
  def race(observables: rxjsLib.internalTypesMod.ObservableInput[_]*): rxjsLib.internalObservableMod.Observable[js.Object] = js.native
  def race[A](a: rxjsLib.internalTypesMod.ObservableInput[A]): rxjsLib.internalObservableMod.Observable[A] = js.native
  def race[A, B](
    arg: js.Tuple2[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B]
    ]
  ): rxjsLib.internalObservableMod.Observable[A | B] = js.native
  def race[A, B](a: rxjsLib.internalTypesMod.ObservableInput[A], b: rxjsLib.internalTypesMod.ObservableInput[B]): rxjsLib.internalObservableMod.Observable[A | B] = js.native
  def race[A, B, C](
    arg: js.Tuple3[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B], 
      rxjsLib.internalTypesMod.ObservableInput[C]
    ]
  ): rxjsLib.internalObservableMod.Observable[A | B | C] = js.native
  def race[A, B, C](
    a: rxjsLib.internalTypesMod.ObservableInput[A],
    b: rxjsLib.internalTypesMod.ObservableInput[B],
    c: rxjsLib.internalTypesMod.ObservableInput[C]
  ): rxjsLib.internalObservableMod.Observable[A | B | C] = js.native
  def race[A, B, C, D](
    arg: js.Tuple4[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B], 
      rxjsLib.internalTypesMod.ObservableInput[C], 
      rxjsLib.internalTypesMod.ObservableInput[D]
    ]
  ): rxjsLib.internalObservableMod.Observable[A | B | C | D] = js.native
  def race[A, B, C, D](
    a: rxjsLib.internalTypesMod.ObservableInput[A],
    b: rxjsLib.internalTypesMod.ObservableInput[B],
    c: rxjsLib.internalTypesMod.ObservableInput[C],
    d: rxjsLib.internalTypesMod.ObservableInput[D]
  ): rxjsLib.internalObservableMod.Observable[A | B | C | D] = js.native
  def race[A, B, C, D, E](
    arg: js.Tuple5[
      rxjsLib.internalTypesMod.ObservableInput[A], 
      rxjsLib.internalTypesMod.ObservableInput[B], 
      rxjsLib.internalTypesMod.ObservableInput[C], 
      rxjsLib.internalTypesMod.ObservableInput[D], 
      rxjsLib.internalTypesMod.ObservableInput[E]
    ]
  ): rxjsLib.internalObservableMod.Observable[A | B | C | D | E] = js.native
  def race[A, B, C, D, E](
    a: rxjsLib.internalTypesMod.ObservableInput[A],
    b: rxjsLib.internalTypesMod.ObservableInput[B],
    c: rxjsLib.internalTypesMod.ObservableInput[C],
    d: rxjsLib.internalTypesMod.ObservableInput[D],
    e: rxjsLib.internalTypesMod.ObservableInput[E]
  ): rxjsLib.internalObservableMod.Observable[A | B | C | D | E] = js.native
  @JSName("race")
  def race_A[A](arg: js.Array[rxjsLib.internalTypesMod.ObservableInput[A]]): rxjsLib.internalObservableMod.Observable[A] = js.native
  @JSName("race")
  def race_T[T](arg: js.Array[rxjsLib.internalTypesMod.ObservableInput[T]]): rxjsLib.internalObservableMod.Observable[T] = js.native
  @JSName("race")
  def race_T[T](observables: rxjsLib.internalTypesMod.ObservableInput[T]*): rxjsLib.internalObservableMod.Observable[T] = js.native
  def range(): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def range(start: scala.Double): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def range(start: scala.Double, count: scala.Double): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def range(start: scala.Double, count: scala.Double, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def scheduled[T](
    input: rxjsLib.internalTypesMod.ObservableInput[T],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): Observable[T] = js.native
  def throwError(error: js.Any): rxjsLib.internalObservableMod.Observable[scala.Nothing] = js.native
  def throwError(error: js.Any, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[scala.Nothing] = js.native
  def timer(): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def timer(dueTime: scala.Double): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def timer(dueTime: scala.Double, periodOrScheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def timer(
    dueTime: scala.Double,
    periodOrScheduler: rxjsLib.internalTypesMod.SchedulerLike,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def timer(dueTime: scala.Double, periodOrScheduler: scala.Double): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def timer(
    dueTime: scala.Double,
    periodOrScheduler: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def timer(dueTime: stdLib.Date): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def timer(dueTime: stdLib.Date, periodOrScheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def timer(
    dueTime: stdLib.Date,
    periodOrScheduler: rxjsLib.internalTypesMod.SchedulerLike,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def timer(dueTime: stdLib.Date, periodOrScheduler: scala.Double): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def timer(
    dueTime: stdLib.Date,
    periodOrScheduler: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.internalObservableMod.Observable[scala.Double] = js.native
  def using[T](
    resourceFactory: js.Function0[rxjsLib.internalTypesMod.Unsubscribable | scala.Unit],
    observableFactory: js.Function1[
      /* resource */ rxjsLib.internalTypesMod.Unsubscribable | scala.Unit, 
      rxjsLib.internalTypesMod.ObservableInput[T] | scala.Unit
    ]
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
  def zip[R](array: js.Array[rxjsLib.internalTypesMod.ObservableInput[_]]): rxjsLib.internalObservableMod.Observable[R] = js.native
  def zip[R](
    array: js.Array[rxjsLib.internalTypesMod.ObservableInput[_]],
    resultSelector: js.Function1[/* repeated */ js.Any, R]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def zip[R](
    observables: (rxjsLib.internalTypesMod.ObservableInput[_] | (js.Function1[/* repeated */ js.Any, R]))*
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](v1: O1, resultSelector: js.Function1[/* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], R]): rxjsLib.internalObservableMod.Observable[R] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2): rxjsLib.internalObservableMod.Observable[
    js.Tuple2[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2]
    ]
  ] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    v1: O1,
    v2: O2,
    resultSelector: js.Function2[
      /* v1 */ rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      /* v2 */ rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      R
    ]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3): rxjsLib.internalObservableMod.Observable[
    js.Tuple3[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3]
    ]
  ] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
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
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4): rxjsLib.internalObservableMod.Observable[
    js.Tuple4[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4]
    ]
  ] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
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
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): rxjsLib.internalObservableMod.Observable[
    js.Tuple5[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      rxjsLib.internalTypesMod.ObservedValueOf[O5]
    ]
  ] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
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
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O6 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): rxjsLib.internalObservableMod.Observable[
    js.Tuple6[
      rxjsLib.internalTypesMod.ObservedValueOf[O1], 
      rxjsLib.internalTypesMod.ObservedValueOf[O2], 
      rxjsLib.internalTypesMod.ObservedValueOf[O3], 
      rxjsLib.internalTypesMod.ObservedValueOf[O4], 
      rxjsLib.internalTypesMod.ObservedValueOf[O5], 
      rxjsLib.internalTypesMod.ObservedValueOf[O6]
    ]
  ] = js.native
  def zip[O1 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O2 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O3 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O4 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O5 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, O6 /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
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
  @JSName("zip")
  def zip_OObservableInput[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](array: js.Array[O]): rxjsLib.internalObservableMod.Observable[js.Array[rxjsLib.internalTypesMod.ObservedValueOf[O]]] = js.native
  @JSName("zip")
  def zip_OObservableInput[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */](observables: O*): rxjsLib.internalObservableMod.Observable[js.Array[rxjsLib.internalTypesMod.ObservedValueOf[O]]] = js.native
  @JSName("zip")
  def zip_OObservableInputR[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](
    array: js.Array[O],
    resultSelector: js.Function1[/* repeated */ rxjsLib.internalTypesMod.ObservedValueOf[O], R]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  @JSName("zip")
  def zip_OObservableInputR[O /* <: rxjsLib.internalTypesMod.ObservableInput[_] */, R](observables: (O | (js.Function1[/* repeated */ rxjsLib.internalTypesMod.ObservedValueOf[O], R]))*): rxjsLib.internalObservableMod.Observable[R] = js.native
}

