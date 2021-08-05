package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindNodeCallbackMod {
  
  @JSImport("rxjs/internal/observable/bindNodeCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bindNodeCallback(callbackFunc: js.Function): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  inline def bindNodeCallback(callbackFunc: js.Function1[/* callback */ js.Function1[/* err */ js.Any, js.Any], js.Any]): js.Function0[Observable[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Observable[Unit]]]
  inline def bindNodeCallback(
    callbackFunc: js.Function1[/* callback */ js.Function1[/* err */ js.Any, js.Any], js.Any],
    scheduler: SchedulerLike
  ): js.Function0[Observable[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Observable[Unit]]]
  inline def bindNodeCallback(callbackFunc: js.Function, resultSelector: js.Function): js.Function1[/* repeated */ js.Any, Observable[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Any]]]
  inline def bindNodeCallback(callbackFunc: js.Function, resultSelector: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, Observable[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Any]]]
  inline def bindNodeCallback(callbackFunc: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  inline def bindNodeCallback[A1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* err */ js.Any, js.Any], js.Any]
  ): js.Function1[/* arg1 */ A1, Observable[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[Unit]]]
  inline def bindNodeCallback[A1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* err */ js.Any, js.Any], js.Any],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[Unit]]]
  inline def bindNodeCallback[A1, A2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function1[/* err */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]]]
  inline def bindNodeCallback[A1, A2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function1[/* err */ js.Any, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]]]
  inline def bindNodeCallback[A1, A2, A3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* err */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]]]
  inline def bindNodeCallback[A1, A2, A3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* err */ js.Any, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]]]
  inline def bindNodeCallback[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* err */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]]]
  inline def bindNodeCallback[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* err */ js.Any, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]]]
  inline def bindNodeCallback[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* err */ js.Any, js.Any], 
      js.Any
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ]]
  inline def bindNodeCallback[A1, A2, A3, A4, A5](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function1[/* err */ js.Any, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[Unit]
  ]]
  
  inline def bindNodeCallback_A1A2A3A4A5R1[A1, A2, A3, A4, A5, R1](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ]
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]]]
  inline def bindNodeCallback_A1A2A3A4A5R1[A1, A2, A3, A4, A5, R1](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Observable[R1]]]
  
  inline def bindNodeCallback_A1A2A3A4A5R1R2[A1, A2, A3, A4, A5, R1, R2](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ]]
  inline def bindNodeCallback_A1A2A3A4A5R1R2[A1, A2, A3, A4, A5, R1, R2](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple2[R1, R2]]
  ]]
  
  inline def bindNodeCallback_A1A2A3A4A5R1R2R3[A1, A2, A3, A4, A5, R1, R2, R3](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ]]
  inline def bindNodeCallback_A1A2A3A4A5R1R2R3[A1, A2, A3, A4, A5, R1, R2, R3](
    callbackFunc: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function5[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    /* arg5 */ A5, 
    Observable[js.Tuple3[R1, R2, R3]]
  ]]
  
  inline def bindNodeCallback_A1A2A3A4A5R1R2R3R4_Function1[A1, A2, A3, A4, A5, R1, R2, R3, R4](
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
        js.Any
      ], 
      js.Any
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  inline def bindNodeCallback_A1A2A3A4A5R1R2R3R4_Function1[A1, A2, A3, A4, A5, R1, R2, R3, R4](
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
        js.Any
      ], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  
  inline def bindNodeCallback_A1A2A3A4R1[A1, A2, A3, A4, R1](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]]]
  inline def bindNodeCallback_A1A2A3A4R1[A1, A2, A3, A4, R1](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[R1]]]
  
  inline def bindNodeCallback_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ]]
  inline def bindNodeCallback_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple2[R1, R2]]
  ]]
  
  inline def bindNodeCallback_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ]]
  inline def bindNodeCallback_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function4[
    /* arg1 */ A1, 
    /* arg2 */ A2, 
    /* arg3 */ A3, 
    /* arg4 */ A4, 
    Observable[js.Tuple3[R1, R2, R3]]
  ]]
  
  inline def bindNodeCallback_A1A2A3A4R1R2R3R4_Function1[A1, A2, A3, A4, R1, R2, R3, R4](
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
        js.Any
      ], 
      js.Any
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  inline def bindNodeCallback_A1A2A3A4R1R2R3R4_Function1[A1, A2, A3, A4, R1, R2, R3, R4](
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
        js.Any
      ], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  
  inline def bindNodeCallback_A1A2A3R1[A1, A2, A3, R1](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]]]
  inline def bindNodeCallback_A1A2A3R1[A1, A2, A3, R1](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[R1]]]
  
  inline def bindNodeCallback_A1A2A3R1R2[A1, A2, A3, R1, R2](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]]]
  inline def bindNodeCallback_A1A2A3R1R2[A1, A2, A3, R1, R2](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple2[R1, R2]]]]
  
  inline def bindNodeCallback_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]]]
  inline def bindNodeCallback_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[js.Tuple3[R1, R2, R3]]]]
  
  inline def bindNodeCallback_A1A2A3R1R2R3R4_Function1[A1, A2, A3, R1, R2, R3, R4](
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
        js.Any
      ], 
      js.Any
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  inline def bindNodeCallback_A1A2A3R1R2R3R4_Function1[A1, A2, A3, R1, R2, R3, R4](
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
        js.Any
      ], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  
  inline def bindNodeCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]]]
  inline def bindNodeCallback_A1A2R1[A1, A2, R1](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[R1]]]
  
  inline def bindNodeCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]]]
  inline def bindNodeCallback_A1A2R1R2[A1, A2, R1, R2](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple2[R1, R2]]]]
  
  inline def bindNodeCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]]]
  inline def bindNodeCallback_A1A2R1R2R3[A1, A2, R1, R2, R3](
    callbackFunc: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[js.Tuple3[R1, R2, R3]]]]
  
  inline def bindNodeCallback_A1A2R1R2R3R4_Function1[A1, A2, R1, R2, R3, R4](
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
        js.Any
      ], 
      js.Any
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  inline def bindNodeCallback_A1A2R1R2R3R4_Function1[A1, A2, R1, R2, R3, R4](
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
        js.Any
      ], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  
  inline def bindNodeCallback_A1R1[A1, R1](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ]
  ): js.Function1[/* arg1 */ A1, Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[R1]]]
  inline def bindNodeCallback_A1R1[A1, R1](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[R1]]]
  
  inline def bindNodeCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ]
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]]]
  inline def bindNodeCallback_A1R1R2[A1, R1, R2](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[js.Tuple2[R1, R2]]]]
  
  inline def bindNodeCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]]]
  inline def bindNodeCallback_A1R1R2R3[A1, R1, R2, R3](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg1 */ A1, Observable[js.Tuple3[R1, R2, R3]]]]
  
  inline def bindNodeCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        js.Any
      ], 
      js.Any
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  inline def bindNodeCallback_A1R1R2R3R4[A1, R1, R2, R3, R4](
    callbackFunc: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        js.Any
      ], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  
  inline def bindNodeCallback_R1[R1](
    callbackFunc: js.Function1[/* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], js.Any]
  ): js.Function0[Observable[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Observable[R1]]]
  inline def bindNodeCallback_R1[R1](
    callbackFunc: js.Function1[/* callback */ js.Function2[/* err */ js.Any, /* res1 */ R1, js.Any], js.Any],
    scheduler: SchedulerLike
  ): js.Function0[Observable[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Observable[R1]]]
  
  inline def bindNodeCallback_R1R2[R1, R2](
    callbackFunc: js.Function1[
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ]
  ): js.Function0[Observable[js.Tuple2[R1, R2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Observable[js.Tuple2[R1, R2]]]]
  inline def bindNodeCallback_R1R2[R1, R2](
    callbackFunc: js.Function1[
      /* callback */ js.Function3[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function0[Observable[js.Tuple2[R1, R2]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Observable[js.Tuple2[R1, R2]]]]
  
  inline def bindNodeCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ]
  ): js.Function0[Observable[js.Tuple3[R1, R2, R3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Observable[js.Tuple3[R1, R2, R3]]]]
  inline def bindNodeCallback_R1R2R3[R1, R2, R3](
    callbackFunc: js.Function1[
      /* callback */ js.Function4[/* err */ js.Any, /* res1 */ R1, /* res2 */ R2, /* res3 */ R3, js.Any], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function0[Observable[js.Tuple3[R1, R2, R3]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Observable[js.Tuple3[R1, R2, R3]]]]
  
  inline def bindNodeCallback_R1R2R3R4_Function1[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        js.Any
      ], 
      js.Any
    ]
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
  inline def bindNodeCallback_R1R2R3R4_Function1[R1, R2, R3, R4](
    callbackFunc: js.Function1[
      /* callback */ js.Function6[
        /* err */ js.Any, 
        /* res1 */ R1, 
        /* res2 */ R2, 
        /* res3 */ R3, 
        /* res4 */ R4, 
        /* repeated */ js.Any, 
        js.Any
      ], 
      js.Any
    ],
    scheduler: SchedulerLike
  ): js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindNodeCallback")(callbackFunc.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, Observable[js.Array[js.Any]]]]
}
