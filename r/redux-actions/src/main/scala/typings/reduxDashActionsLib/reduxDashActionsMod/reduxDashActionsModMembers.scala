package typings
package reduxDashActionsLib.reduxDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-actions", JSImport.Namespace)
@js.native
object reduxDashActionsModMembers extends js.Object {
  def combineActions(actionTypes: (ActionFunctions[_] | java.lang.String | js.Symbol)*): CombinedActionType = js.native
  def createAction(actionType: java.lang.String): ActionFunctionAny[Action[_]] = js.native
  def createAction[Meta](
    actionType: java.lang.String,
    payloadCreator: js.UndefOr[scala.Nothing],
    metaCreator: ActionFunctionAny[Meta]
  ): ActionFunctionAny[ActionMeta[_, Meta]] = js.native
  def createAction[Payload](actionType: java.lang.String, payloadCreator: ActionFunction0[Payload]): ActionFunction0[Action[Payload]] = js.native
  def createAction[Meta](actionType: java.lang.String, payloadCreator: scala.Null, metaCreator: ActionFunctionAny[Meta]): ActionFunctionAny[ActionMeta[_, Meta]] = js.native
  def createAction[Payload, Arg1](actionType: java.lang.String, payloadCreator: ActionFunction1[Arg1, Payload]): ActionFunction1[Arg1, Action[Payload]] = js.native
  def createAction[Payload, Meta](
    actionType: java.lang.String,
    payloadCreator: ActionFunctionAny[Payload],
    metaCreator: ActionFunctionAny[Meta]
  ): ActionFunctionAny[ActionMeta[Payload, Meta]] = js.native
  def createAction[Payload, Arg1, Arg2](actionType: java.lang.String, payloadCreator: ActionFunction2[Arg1, Arg2, Payload]): ActionFunction2[Arg1, Arg2, Action[Payload]] = js.native
  def createAction[Payload, Meta, Arg1, Arg2](
    actionType: java.lang.String,
    payloadCreator: ActionFunction2[Arg1, Arg2, Payload],
    metaCreator: ActionFunction2[Arg1, Arg2, Meta]
  ): ActionFunction2[Arg1, Arg2, ActionMeta[Payload, Meta]] = js.native
  def createAction[Payload, Arg1, Arg2, Arg3](actionType: java.lang.String, payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload]): ActionFunction3[Arg1, Arg2, Arg3, Action[Payload]] = js.native
  def createAction[Payload, Meta, Arg1, Arg2, Arg3](
    actionType: java.lang.String,
    payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload],
    metaCreator: ActionFunction3[Arg1, Arg2, Arg3, Meta]
  ): ActionFunction3[Arg1, Arg2, Arg3, ActionMeta[Payload, Meta]] = js.native
  def createAction[Payload, Arg1, Arg2, Arg3, Arg4](actionType: java.lang.String, payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload]): ActionFunction4[Arg1, Arg2, Arg3, Arg4, Action[Payload]] = js.native
  def createAction[Payload, Meta, Arg1, Arg2, Arg3, Arg4](
    actionType: java.lang.String,
    payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload],
    metaCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Meta]
  ): ActionFunction4[Arg1, Arg2, Arg3, Arg4, ActionMeta[Payload, Meta]] = js.native
  @JSName("createAction")
  def createAction_PayloadActionFunction1[Payload](actionType: java.lang.String): ActionFunction1[Payload, Action[Payload]] = js.native
  @JSName("createAction")
  def createAction_PayloadMetaArg1ActionFunction1[Payload, Meta, Arg1](
    actionType: java.lang.String,
    payloadCreator: ActionFunction1[Arg1, Payload],
    metaCreator: ActionFunction1[Arg1, Meta]
  ): ActionFunction1[Arg1, ActionMeta[Payload, Meta]] = js.native
  def createActions(actionMapOrIdentityAction: java.lang.String, identityActions: (java.lang.String | Options)*): org.scalablytyped.runtime.StringDictionary[ActionFunctionAny[Action[_]]] = js.native
  def createActions(actionMapOrIdentityAction: ActionMap[_, _], identityActions: (java.lang.String | Options)*): org.scalablytyped.runtime.StringDictionary[ActionFunctionAny[Action[_]]] = js.native
  @JSName("createActions")
  def createActions_Payload[Payload](actionMapOrIdentityAction: java.lang.String, identityActions: (java.lang.String | Options)*): org.scalablytyped.runtime.StringDictionary[ActionFunctionAny[Action[Payload]]] = js.native
  @JSName("createActions")
  def createActions_Payload[Payload](actionMapOrIdentityAction: ActionMap[Payload, _], identityActions: (java.lang.String | Options)*): org.scalablytyped.runtime.StringDictionary[ActionFunctionAny[Action[Payload]]] = js.native
  def handleAction[State, Payload](actionType: java.lang.String, reducer: ReducerNextThrow[State, Payload], initialState: State): Reducer[State, Payload] = js.native
  def handleAction[State, Payload](actionType: java.lang.String, reducer: Reducer[State, Payload], initialState: State): Reducer[State, Payload] = js.native
  def handleAction[State, Payload](
    actionType: ActionFunctions[Payload],
    reducer: ReducerNextThrow[State, Payload],
    initialState: State
  ): Reducer[State, Payload] = js.native
  def handleAction[State, Payload](actionType: ActionFunctions[Payload], reducer: Reducer[State, Payload], initialState: State): Reducer[State, Payload] = js.native
  def handleAction[State, Payload](actionType: CombinedActionType, reducer: ReducerNextThrow[State, Payload], initialState: State): Reducer[State, Payload] = js.native
  def handleAction[State, Payload](actionType: CombinedActionType, reducer: Reducer[State, Payload], initialState: State): Reducer[State, Payload] = js.native
  def handleAction[State, Payload, Meta](
    actionType: java.lang.String,
    reducer: ReducerNextThrowMeta[State, Payload, Meta],
    initialState: State
  ): Reducer[State, Payload] = js.native
  def handleAction[State, Payload, Meta](
    actionType: ActionWithMetaFunctions[Payload, Meta],
    reducer: ReducerNextThrowMeta[State, Payload, Meta],
    initialState: State
  ): Reducer[State, Payload] = js.native
  def handleAction[State, Payload, Meta](
    actionType: CombinedActionType,
    reducer: ReducerNextThrowMeta[State, Payload, Meta],
    initialState: State
  ): Reducer[State, Payload] = js.native
  @JSName("handleAction")
  def handleAction_StatePayloadMeta[State, Payload, Meta](actionType: java.lang.String, reducer: ReducerMeta[State, Payload, Meta], initialState: State): Reducer[State, Payload] = js.native
  @JSName("handleAction")
  def handleAction_StatePayloadMeta[State, Payload, Meta](
    actionType: ActionWithMetaFunctions[Payload, Meta],
    reducer: ReducerMeta[State, Payload, Meta],
    initialState: State
  ): Reducer[State, Payload] = js.native
  @JSName("handleAction")
  def handleAction_StatePayloadMeta[State, Payload, Meta](actionType: CombinedActionType, reducer: ReducerMeta[State, Payload, Meta], initialState: State): Reducer[State, Payload] = js.native
  def handleActions[StateAndPayload](reducerMap: ReducerMap[StateAndPayload, StateAndPayload], initialState: StateAndPayload): Reducer[StateAndPayload, StateAndPayload] = js.native
  def handleActions[StateAndPayload](
    reducerMap: ReducerMap[StateAndPayload, StateAndPayload],
    initialState: StateAndPayload,
    options: Options
  ): Reducer[StateAndPayload, StateAndPayload] = js.native
  def handleActions[State, Payload, Meta](reducerMap: ReducerMapMeta[State, Payload, Meta], initialState: State): ReducerMeta[State, Payload, Meta] = js.native
  def handleActions[State, Payload, Meta](reducerMap: ReducerMapMeta[State, Payload, Meta], initialState: State, options: Options): ReducerMeta[State, Payload, Meta] = js.native
  @JSName("handleActions")
  def handleActions_StatePayload[State, Payload](reducerMap: ReducerMap[State, Payload], initialState: State): Reducer[State, Payload] = js.native
  @JSName("handleActions")
  def handleActions_StatePayload[State, Payload](reducerMap: ReducerMap[State, Payload], initialState: State, options: Options): Reducer[State, Payload] = js.native
}

