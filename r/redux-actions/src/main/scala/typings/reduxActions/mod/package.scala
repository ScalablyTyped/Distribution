package typings.reduxActions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionFunction0[R] = js.Function0[R]
  type ActionFunction1[T1, R] = js.Function1[/* t1 */ T1, R]
  type ActionFunction2[T1, T2, R] = js.Function2[/* t1 */ T1, /* t2 */ T2, R]
  type ActionFunction3[T1, T2, T3, R] = js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]
  type ActionFunction4[T1, T2, T3, T4, R] = js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]
  type ActionFunctionAny[R] = js.Function1[/* repeated */ js.Any, R]
  type ActionFunctions[Payload] = typings.reduxActions.mod.BaseActionFunctions[typings.reduxActions.mod.Action[Payload]]
  type ActionWithMetaFunctions[Payload, Meta] = typings.reduxActions.mod.BaseActionFunctions[typings.reduxActions.mod.ActionMeta[Payload, Meta]]
  type BaseActionFunctions[TAction] = typings.reduxActions.mod.ActionFunction0[TAction] | (typings.reduxActions.mod.ActionFunction1[js.Any, TAction]) | (typings.reduxActions.mod.ActionFunction2[js.Any, js.Any, TAction]) | (typings.reduxActions.mod.ActionFunction3[js.Any, js.Any, js.Any, TAction]) | (typings.reduxActions.mod.ActionFunction4[js.Any, js.Any, js.Any, js.Any, TAction]) | typings.reduxActions.mod.ActionFunctionAny[TAction]
  type Reducer[State, Payload] = js.Function2[/* state */ State, /* action */ typings.reduxActions.mod.Action[Payload], State]
  /* Rewritten from type alias, can be one of: 
    - typings.reduxActions.mod.Reducer[State, Payload]
    - typings.reduxActions.mod.ReducerNextThrow[State, Payload]
    - typings.reduxActions.mod.ReducerMap[State, Payload]
  */
  type ReducerMapValue[State, Payload] = (typings.reduxActions.mod._ReducerMapValue[State, Payload]) | (typings.reduxActions.mod.Reducer[State, Payload])
  type ReducerMeta[State, Payload, Meta] = js.Function2[
    /* state */ State, 
    /* action */ typings.reduxActions.mod.ActionMeta[Payload, Meta], 
    State
  ]
  type ReduxCompatibleReducer[State, Payload] = js.Function2[
    /* state */ js.UndefOr[State], 
    /* action */ typings.reduxActions.mod.Action[Payload], 
    State
  ]
  type ReduxCompatibleReducerMeta[State, Payload, Meta] = js.Function2[
    /* state */ js.UndefOr[State], 
    /* action */ typings.reduxActions.mod.ActionMeta[Payload, Meta], 
    State
  ]
}
