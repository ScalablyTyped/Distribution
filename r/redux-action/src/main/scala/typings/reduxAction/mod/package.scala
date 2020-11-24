package typings.reduxAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ActionFunction0[R] = js.Function0[R]
  
  type ActionFunction1[T1, R] = js.Function1[/* t1 */ T1, R]
  
  type ActionFunction2[T1, T2, R] = js.Function2[/* t1 */ T1, /* t2 */ T2, R]
  
  type ActionFunction3[T1, T2, T3, R] = js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]
  
  type ActionFunctionAny[R] = js.Function1[/* repeated */ js.Any, R]
  
  type ReducerHandler[State] = js.Function3[
    /* payload */ js.Any, 
    /* state */ js.UndefOr[State], 
    /* action */ js.UndefOr[typings.reduxAction.mod.BaseAction], 
    State
  ]
  
  type ReducerHandlers[State] = org.scalablytyped.runtime.StringDictionary[typings.reduxAction.mod.ReducerHandler[State]]
  
  type ThunkAction[Payload] = js.Function2[
    /* dispatch */ typings.redux.mod.Dispatch[js.Any], 
    /* getState */ js.Function0[js.Any], 
    js.Promise[typings.reduxAction.mod.Action[Payload]]
  ]
  
  type ThunkMetaAction[Payload, Meta] = js.Function2[
    /* dispatch */ typings.redux.mod.Dispatch[js.Any], 
    /* getState */ js.Function0[js.Any], 
    js.Promise[typings.reduxAction.mod.MetaAction[Payload, Meta]]
  ]
}
