package typings.reduxActions

import org.scalablytyped.runtime.StringDictionary
import typings.reduxActions.mod.Action
import typings.reduxActions.mod.ActionFunction0
import typings.reduxActions.mod.ActionFunction1
import typings.reduxActions.mod.ActionFunction2
import typings.reduxActions.mod.ActionFunction3
import typings.reduxActions.mod.ActionFunction4
import typings.reduxActions.mod.ActionFunctionAny
import typings.reduxActions.mod.ActionFunctions
import typings.reduxActions.mod.ActionMap
import typings.reduxActions.mod.ActionMeta
import typings.reduxActions.mod.ActionWithMetaFunctions
import typings.reduxActions.mod.CombinedActionType
import typings.reduxActions.mod.Options
import typings.reduxActions.mod.Reducer
import typings.reduxActions.mod.ReducerMap
import typings.reduxActions.mod.ReducerMapMeta
import typings.reduxActions.mod.ReducerMeta
import typings.reduxActions.mod.ReducerNextThrow
import typings.reduxActions.mod.ReducerNextThrowMeta
import typings.reduxActions.mod.ReduxCompatibleReducer
import typings.reduxActions.mod.ReduxCompatibleReducerMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ReduxActions {
    
    @JSGlobal("ReduxActions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def combineActions(actionTypes: (ActionFunctions[Any] | String | js.Symbol)*): CombinedActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("combineActions")(actionTypes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[CombinedActionType]
    
    inline def createAction(actionType: String): ActionFunctionAny[Action[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any]).asInstanceOf[ActionFunctionAny[Action[Any]]]
    inline def createAction[Meta](actionType: String, payloadCreator: Null, metaCreator: ActionFunctionAny[Meta]): ActionFunctionAny[ActionMeta[Any, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunctionAny[ActionMeta[Any, Meta]]]
    inline def createAction[Meta](actionType: String, payloadCreator: Unit, metaCreator: ActionFunctionAny[Meta]): ActionFunctionAny[ActionMeta[Any, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunctionAny[ActionMeta[Any, Meta]]]
    inline def createAction[Payload](actionType: String, payloadCreator: ActionFunction0[Payload]): ActionFunction0[Action[Payload]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction0[Action[Payload]]]
    inline def createAction[Payload, Arg1](actionType: String, payloadCreator: ActionFunction1[Arg1, Payload]): ActionFunction1[Arg1, Action[Payload]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction1[Arg1, Action[Payload]]]
    inline def createAction[Payload, Meta](
      actionType: String,
      payloadCreator: ActionFunctionAny[Payload],
      metaCreator: ActionFunctionAny[Meta]
    ): ActionFunctionAny[ActionMeta[Payload, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunctionAny[ActionMeta[Payload, Meta]]]
    inline def createAction[Payload, Meta, Arg1](
      actionType: String,
      payloadCreator: ActionFunction1[Arg1, Payload],
      metaCreator: ActionFunction1[Arg1, Meta]
    ): ActionFunction1[Arg1, ActionMeta[Payload, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction1[Arg1, ActionMeta[Payload, Meta]]]
    inline def createAction[Payload, Arg1, Arg2](actionType: String, payloadCreator: ActionFunction2[Arg1, Arg2, Payload]): ActionFunction2[Arg1, Arg2, Action[Payload]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction2[Arg1, Arg2, Action[Payload]]]
    inline def createAction[Payload, Meta, Arg1, Arg2](
      actionType: String,
      payloadCreator: ActionFunction2[Arg1, Arg2, Payload],
      metaCreator: ActionFunction2[Arg1, Arg2, Meta]
    ): ActionFunction2[Arg1, Arg2, ActionMeta[Payload, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction2[Arg1, Arg2, ActionMeta[Payload, Meta]]]
    inline def createAction[Payload, Arg1, Arg2, Arg3](actionType: String, payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload]): ActionFunction3[Arg1, Arg2, Arg3, Action[Payload]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction3[Arg1, Arg2, Arg3, Action[Payload]]]
    inline def createAction[Payload, Meta, Arg1, Arg2, Arg3](
      actionType: String,
      payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload],
      metaCreator: ActionFunction3[Arg1, Arg2, Arg3, Meta]
    ): ActionFunction3[Arg1, Arg2, Arg3, ActionMeta[Payload, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction3[Arg1, Arg2, Arg3, ActionMeta[Payload, Meta]]]
    inline def createAction[Payload, Arg1, Arg2, Arg3, Arg4](actionType: String, payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload]): ActionFunction4[Arg1, Arg2, Arg3, Arg4, Action[Payload]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction4[Arg1, Arg2, Arg3, Arg4, Action[Payload]]]
    inline def createAction[Payload, Meta, Arg1, Arg2, Arg3, Arg4](
      actionType: String,
      payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload],
      metaCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Meta]
    ): ActionFunction4[Arg1, Arg2, Arg3, Arg4, ActionMeta[Payload, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction4[Arg1, Arg2, Arg3, Arg4, ActionMeta[Payload, Meta]]]
    
    inline def createAction_Payload_ActionFunction1[Payload](actionType: String): ActionFunction1[Payload, Action[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any]).asInstanceOf[ActionFunction1[Payload, Action[Payload]]]
    
    inline def createActions(actionMapOrIdentityAction: String, identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createActions")(List(actionMapOrIdentityAction.asInstanceOf[js.Any]).`++`(identityActions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[StringDictionary[ActionFunctionAny[Action[Any]]]]
    inline def createActions(actionMapOrIdentityAction: ActionMap[Any, Any], identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createActions")(List(actionMapOrIdentityAction.asInstanceOf[js.Any]).`++`(identityActions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[StringDictionary[ActionFunctionAny[Action[Any]]]]
    
    inline def createActions_Payload[Payload](actionMapOrIdentityAction: String, identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[Payload]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createActions")(List(actionMapOrIdentityAction.asInstanceOf[js.Any]).`++`(identityActions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[StringDictionary[ActionFunctionAny[Action[Payload]]]]
    inline def createActions_Payload[Payload](actionMapOrIdentityAction: ActionMap[Payload, Any], identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[Payload]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createActions")(List(actionMapOrIdentityAction.asInstanceOf[js.Any]).`++`(identityActions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[StringDictionary[ActionFunctionAny[Action[Payload]]]]
    
    inline def handleAction[State, Payload](actionType: String, reducer: ReducerNextThrow[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[State, Payload]]
    inline def handleAction[State, Payload](actionType: String, reducer: Reducer[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[State, Payload]]
    inline def handleAction[State, Payload](
      actionType: ActionFunctions[Payload],
      reducer: ReducerNextThrow[State, Payload],
      initialState: State
    ): ReduxCompatibleReducer[State, Payload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[State, Payload]]
    inline def handleAction[State, Payload](actionType: ActionFunctions[Payload], reducer: Reducer[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[State, Payload]]
    inline def handleAction[State, Payload](actionType: CombinedActionType, reducer: ReducerNextThrow[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[State, Payload]]
    inline def handleAction[State, Payload](actionType: CombinedActionType, reducer: Reducer[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[State, Payload]]
    inline def handleAction[State, Payload, Meta](actionType: String, reducer: ReducerNextThrowMeta[State, Payload, Meta], initialState: State): ReduxCompatibleReducerMeta[State, Payload, Meta] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducerMeta[State, Payload, Meta]]
    inline def handleAction[State, Payload, Meta](
      actionType: ActionWithMetaFunctions[Payload, Meta],
      reducer: ReducerNextThrowMeta[State, Payload, Meta],
      initialState: State
    ): ReduxCompatibleReducerMeta[State, Payload, Meta] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducerMeta[State, Payload, Meta]]
    inline def handleAction[State, Payload, Meta](
      actionType: CombinedActionType,
      reducer: ReducerNextThrowMeta[State, Payload, Meta],
      initialState: State
    ): ReduxCompatibleReducerMeta[State, Payload, Meta] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducerMeta[State, Payload, Meta]]
    
    inline def handleAction_StatePayloadMeta_ReduxCompatibleReducerMeta[State, Payload, Meta](actionType: String, reducer: ReducerMeta[State, Payload, Meta], initialState: State): ReduxCompatibleReducerMeta[State, Payload, Meta] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducerMeta[State, Payload, Meta]]
    inline def handleAction_StatePayloadMeta_ReduxCompatibleReducerMeta[State, Payload, Meta](
      actionType: ActionWithMetaFunctions[Payload, Meta],
      reducer: ReducerMeta[State, Payload, Meta],
      initialState: State
    ): ReduxCompatibleReducerMeta[State, Payload, Meta] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducerMeta[State, Payload, Meta]]
    inline def handleAction_StatePayloadMeta_ReduxCompatibleReducerMeta[State, Payload, Meta](actionType: CombinedActionType, reducer: ReducerMeta[State, Payload, Meta], initialState: State): ReduxCompatibleReducerMeta[State, Payload, Meta] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducerMeta[State, Payload, Meta]]
    
    inline def handleActions[StateAndPayload](reducerMap: ReducerMap[StateAndPayload, StateAndPayload], initialState: StateAndPayload): ReduxCompatibleReducer[StateAndPayload, StateAndPayload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleActions")(reducerMap.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[StateAndPayload, StateAndPayload]]
    inline def handleActions[StateAndPayload](
      reducerMap: ReducerMap[StateAndPayload, StateAndPayload],
      initialState: StateAndPayload,
      options: Options
    ): ReduxCompatibleReducer[StateAndPayload, StateAndPayload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleActions")(reducerMap.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[StateAndPayload, StateAndPayload]]
    inline def handleActions[State, Payload, Meta](reducerMap: ReducerMapMeta[State, Payload, Meta], initialState: State): ReduxCompatibleReducerMeta[State, Payload, Meta] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleActions")(reducerMap.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducerMeta[State, Payload, Meta]]
    inline def handleActions[State, Payload, Meta](reducerMap: ReducerMapMeta[State, Payload, Meta], initialState: State, options: Options): ReduxCompatibleReducerMeta[State, Payload, Meta] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleActions")(reducerMap.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducerMeta[State, Payload, Meta]]
    
    inline def handleActions_StatePayload[State, Payload](reducerMap: ReducerMap[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleActions")(reducerMap.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[State, Payload]]
    inline def handleActions_StatePayload[State, Payload](reducerMap: ReducerMap[State, Payload], initialState: State, options: Options): ReduxCompatibleReducer[State, Payload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleActions")(reducerMap.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[State, Payload]]
  }
}
