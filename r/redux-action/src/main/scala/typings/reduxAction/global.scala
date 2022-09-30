package typings.reduxAction

import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import typings.reduxAction.mod.Action
import typings.reduxAction.mod.ActionFunction1
import typings.reduxAction.mod.ActionFunction2
import typings.reduxAction.mod.ActionFunction3
import typings.reduxAction.mod.ActionFunctionAny
import typings.reduxAction.mod.MetaAction
import typings.reduxAction.mod.ReducerHandlers
import typings.reduxAction.mod.ThunkAction
import typings.reduxAction.mod.ThunkMetaAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ReduxAction {
    
    @JSGlobal("ReduxAction")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createAction[Payload](): ActionFunction1[Any, ThunkAction[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")().asInstanceOf[ActionFunction1[Any, ThunkAction[Payload]]]
    inline def createAction[Payload](payloadCreator: ActionFunctionAny[js.Promise[Payload] | Payload]): ActionFunctionAny[ThunkAction[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(payloadCreator.asInstanceOf[js.Any]).asInstanceOf[ActionFunctionAny[ThunkAction[Payload]]]
    inline def createAction[Payload](`type`: String): ActionFunction1[Any, ThunkAction[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(`type`.asInstanceOf[js.Any]).asInstanceOf[ActionFunction1[Any, ThunkAction[Payload]]]
    inline def createAction[Payload](`type`: String, payloadCreator: ActionFunctionAny[js.Promise[Payload] | Payload]): ActionFunctionAny[ThunkAction[Payload]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(`type`.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunctionAny[ThunkAction[Payload]]]
    inline def createAction[Payload, Arg](payloadCreator: ActionFunction1[Arg, js.Promise[Payload] | Payload]): ActionFunction1[Arg, ThunkAction[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(payloadCreator.asInstanceOf[js.Any]).asInstanceOf[ActionFunction1[Arg, ThunkAction[Payload]]]
    inline def createAction[Payload, Meta](
      payloadCreator: ActionFunctionAny[js.Promise[Payload] | Payload],
      metaCreator: ActionFunctionAny[Meta]
    ): ActionFunctionAny[ThunkMetaAction[Payload, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunctionAny[ThunkMetaAction[Payload, Meta]]]
    inline def createAction[Payload, Meta](
      `type`: String,
      payloadCreator: ActionFunctionAny[js.Promise[Payload] | Payload],
      metaCreator: ActionFunctionAny[Meta]
    ): ActionFunctionAny[ThunkMetaAction[Payload, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(`type`.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunctionAny[ThunkMetaAction[Payload, Meta]]]
    inline def createAction[Payload, Arg1, Arg2](payloadCreator: ActionFunction2[Arg1, Arg2, js.Promise[Payload] | Payload]): ActionFunction2[Arg1, Arg2, ThunkAction[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(payloadCreator.asInstanceOf[js.Any]).asInstanceOf[ActionFunction2[Arg1, Arg2, ThunkAction[Payload]]]
    inline def createAction[Payload, Arg1, Arg2, Arg3](payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, js.Promise[Payload] | Payload]): ActionFunction3[Arg1, Arg2, Arg3, ThunkAction[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(payloadCreator.asInstanceOf[js.Any]).asInstanceOf[ActionFunction3[Arg1, Arg2, Arg3, ThunkAction[Payload]]]
    
    inline def createAction_PayloadArg[Payload, Arg](): ActionFunction1[Arg, ThunkAction[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")().asInstanceOf[ActionFunction1[Arg, ThunkAction[Payload]]]
    inline def createAction_PayloadArg[Payload, Arg](`type`: String): ActionFunction1[Arg, ThunkAction[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(`type`.asInstanceOf[js.Any]).asInstanceOf[ActionFunction1[Arg, ThunkAction[Payload]]]
    
    inline def createReducer[State](defaultState: State, handlers: ReducerHandlers[State]): Reducer[State, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReducer")(defaultState.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[Reducer[State, AnyAction]]
    
    inline def createSyncAction[Payload](`type`: String): ActionFunctionAny[Action[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSyncAction")(`type`.asInstanceOf[js.Any]).asInstanceOf[ActionFunctionAny[Action[Payload]]]
    inline def createSyncAction[Payload](`type`: String, payloadCreator: ActionFunctionAny[Payload]): ActionFunctionAny[Action[Payload]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSyncAction")(`type`.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunctionAny[Action[Payload]]]
    inline def createSyncAction[Payload, Meta](`type`: String, payloadCreator: ActionFunctionAny[Payload], metaCreator: ActionFunctionAny[Meta]): ActionFunctionAny[MetaAction[Payload, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSyncAction")(`type`.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunctionAny[MetaAction[Payload, Meta]]]
  }
}
