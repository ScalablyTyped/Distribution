package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashSagaLib {
  type HelperFunc0[A] = js.Function1[/* action */ A, js.Any]
  type HelperFunc1[A, T1] = js.Function2[/* arg1 */ T1, /* action */ A, js.Any]
  type HelperFunc2[A, T1, T2] = js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* action */ A, js.Any]
  type HelperFunc3[A, T1, T2, T3] = js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* action */ A, js.Any]
  type HelperFunc4[A, T1, T2, T3, T4] = js.Function5[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, /* action */ A, js.Any]
  type HelperFunc5[A, T1, T2, T3, T4, T5] = js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* action */ A, 
    js.Any
  ]
  type HelperFunc6Rest[A, T1, T2, T3, T4, T5, T6] = js.Function8[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* arg7 */ js.Any, 
    /* repeated */js.Any, 
    js.Any
  ]
  type Saga0 = js.Function0[nodeLib.Iterator[js.Any]]
  type Saga1[T1] = js.Function1[/* arg1 */ T1, nodeLib.Iterator[js.Any]]
  type Saga2[T1, T2] = js.Function2[/* arg1 */ T1, /* arg2 */ T2, nodeLib.Iterator[js.Any]]
  type Saga3[T1, T2, T3] = js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, nodeLib.Iterator[js.Any]]
  type Saga4[T1, T2, T3, T4] = js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, nodeLib.Iterator[js.Any]]
  type Saga5[T1, T2, T3, T4, T5] = js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    nodeLib.Iterator[js.Any]
  ]
  type Saga6Rest[T1, T2, T3, T4, T5, T6] = js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* repeated */js.Any, 
    nodeLib.Iterator[js.Any]
  ]
  type Subscribe[T] = js.Function1[/* cb */ js.Function1[/* input */ T | js.Any, scala.Unit], Unsubscribe]
  type Unsubscribe = js.Function0[scala.Unit]
}
