package typings.rxjs.mod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs", "bindNodeCallback")
@js.native
object bindNodeCallback extends js.Object {
  def apply(callbackFunc: js.Function): js.Function1[/* repeated */ js.Any, Observable[js.Array[_]]] = js.native
  def apply(callbackFunc: js.Function1[/* callback */ js.Function1[/* err */ js.Any, _], _]): js.Function0[Observable[Unit]] = js.native
  def apply(
    callbackFunc: js.Function1[/* callback */ js.Function1[/* err */ js.Any, _], _],
    scheduler: SchedulerLike
  ): js.Function0[Observable[Unit]] = js.native
  def apply(callbackFunc: js.Function, resultSelector: js.Function): js.Function1[/* repeated */ js.Any, Observable[_]] = js.native
  def apply(callbackFunc: js.Function, resultSelector: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, Observable[_]] = js.native
  def apply(callbackFunc: js.Function, scheduler: SchedulerLike): js.Function1[/* repeated */ js.Any, Observable[js.Array[_]]] = js.native
  def apply[A1](callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* err */ js.Any, _], _]): js.Function1[/* arg1 */ A1, Observable[Unit]] = js.native
  def apply[A1](
    callbackFunc: js.Function2[/* arg1 */ A1, /* callback */ js.Function1[/* err */ js.Any, _], _],
    scheduler: SchedulerLike
  ): js.Function1[/* arg1 */ A1, Observable[Unit]] = js.native
  def apply[A1, A2](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* err */ js.Any, _], _]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]] = js.native
  def apply[A1, A2](
    callbackFunc: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* callback */ js.Function1[/* err */ js.Any, _], _],
    scheduler: SchedulerLike
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Observable[Unit]] = js.native
  def apply[A1, A2, A3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]] = js.native
  def apply[A1, A2, A3](
    callbackFunc: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Observable[Unit]] = js.native
  def apply[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]] = js.native
  def apply[A1, A2, A3, A4](
    callbackFunc: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function1[/* err */ js.Any, _], 
      _
    ],
    scheduler: SchedulerLike
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Observable[Unit]] = js.native
  def apply[A1, A2, A3, A4, A5](
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
    Observable[Unit]
  ] = js.native
  def apply[A1, A2, A3, A4, A5](
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
    Observable[Unit]
  ] = js.native
}

