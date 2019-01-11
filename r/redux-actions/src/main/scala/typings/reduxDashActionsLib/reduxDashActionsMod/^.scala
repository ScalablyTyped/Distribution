package typings
package reduxDashActionsLib.reduxDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-actions", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def combineActions(
    actionTypes: (reduxDashActionsLib.reduxDashActionsMod.ActionFunctions[_] | java.lang.String | js.Symbol)*
  ): reduxDashActionsLib.reduxDashActionsMod.CombinedActionType = js.native
  def createAction(actionType: java.lang.String): reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[reduxDashActionsLib.reduxDashActionsMod.Action[_]] = js.native
  def createAction[Meta](
    actionType: java.lang.String,
    payloadCreator: js.UndefOr[scala.Nothing],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[Meta]
  ): reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[reduxDashActionsLib.reduxDashActionsMod.ActionMeta[_, Meta]] = js.native
  def createAction[Payload](
    actionType: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction0[Payload]
  ): reduxDashActionsLib.reduxDashActionsMod.ActionFunction0[reduxDashActionsLib.reduxDashActionsMod.Action[Payload]] = js.native
  def createAction[Meta](
    actionType: java.lang.String,
    payloadCreator: scala.Null,
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[Meta]
  ): reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[reduxDashActionsLib.reduxDashActionsMod.ActionMeta[_, Meta]] = js.native
  def createAction[Payload, Arg1](
    actionType: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[Arg1, Payload]
  ): reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[Arg1, reduxDashActionsLib.reduxDashActionsMod.Action[Payload]] = js.native
  def createAction[Payload, Meta](
    actionType: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[Payload],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[Meta]
  ): reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[reduxDashActionsLib.reduxDashActionsMod.ActionMeta[Payload, Meta]] = js.native
  def createAction[Payload, Arg1, Arg2](
    actionType: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[Arg1, Arg2, Payload]
  ): reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[Arg1, Arg2, reduxDashActionsLib.reduxDashActionsMod.Action[Payload]] = js.native
  def createAction[Payload, Meta, Arg1, Arg2](
    actionType: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[Arg1, Arg2, Payload],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[Arg1, Arg2, Meta]
  ): reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[Arg1, Arg2, reduxDashActionsLib.reduxDashActionsMod.ActionMeta[Payload, Meta]] = js.native
  def createAction[Payload, Arg1, Arg2, Arg3](
    actionType: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[Arg1, Arg2, Arg3, Payload]
  ): reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[Arg1, Arg2, Arg3, reduxDashActionsLib.reduxDashActionsMod.Action[Payload]] = js.native
  def createAction[Payload, Meta, Arg1, Arg2, Arg3](
    actionType: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[Arg1, Arg2, Arg3, Payload],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[Arg1, Arg2, Arg3, Meta]
  ): reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[Arg1, Arg2, Arg3, reduxDashActionsLib.reduxDashActionsMod.ActionMeta[Payload, Meta]] = js.native
  def createAction[Payload, Arg1, Arg2, Arg3, Arg4](
    actionType: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload]
  ): reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[Arg1, Arg2, Arg3, Arg4, reduxDashActionsLib.reduxDashActionsMod.Action[Payload]] = js.native
  def createAction[Payload, Meta, Arg1, Arg2, Arg3, Arg4](
    actionType: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[Arg1, Arg2, Arg3, Arg4, Meta]
  ): reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[
    Arg1, 
    Arg2, 
    Arg3, 
    Arg4, 
    reduxDashActionsLib.reduxDashActionsMod.ActionMeta[Payload, Meta]
  ] = js.native
  @JSName("createAction")
  def createAction_PayloadActionFunction1[Payload](actionType: java.lang.String): reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[Payload, reduxDashActionsLib.reduxDashActionsMod.Action[Payload]] = js.native
  @JSName("createAction")
  def createAction_PayloadMetaArg1ActionFunction1[Payload, Meta, Arg1](
    actionType: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[Arg1, Payload],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[Arg1, Meta]
  ): reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[Arg1, reduxDashActionsLib.reduxDashActionsMod.ActionMeta[Payload, Meta]] = js.native
  def createActions(
    actionMapOrIdentityAction: java.lang.String,
    identityActions: (java.lang.String | reduxDashActionsLib.reduxDashActionsMod.Options)*
  ): org.scalablytyped.runtime.StringDictionary[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[reduxDashActionsLib.reduxDashActionsMod.Action[_]]
  ] = js.native
  def createActions(
    actionMapOrIdentityAction: reduxDashActionsLib.reduxDashActionsMod.ActionMap[_, _],
    identityActions: (java.lang.String | reduxDashActionsLib.reduxDashActionsMod.Options)*
  ): org.scalablytyped.runtime.StringDictionary[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[reduxDashActionsLib.reduxDashActionsMod.Action[_]]
  ] = js.native
  @JSName("createActions")
  def createActions_Payload[Payload](
    actionMapOrIdentityAction: java.lang.String,
    identityActions: (java.lang.String | reduxDashActionsLib.reduxDashActionsMod.Options)*
  ): org.scalablytyped.runtime.StringDictionary[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[reduxDashActionsLib.reduxDashActionsMod.Action[Payload]]
  ] = js.native
  @JSName("createActions")
  def createActions_Payload[Payload](
    actionMapOrIdentityAction: reduxDashActionsLib.reduxDashActionsMod.ActionMap[Payload, _],
    identityActions: (java.lang.String | reduxDashActionsLib.reduxDashActionsMod.Options)*
  ): org.scalablytyped.runtime.StringDictionary[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[reduxDashActionsLib.reduxDashActionsMod.Action[Payload]]
  ] = js.native
  def handleAction[State, Payload](
    actionType: java.lang.String,
    reducer: reduxDashActionsLib.reduxDashActionsMod.ReducerNextThrow[State, Payload],
    initialState: State
  ): reduxDashActionsLib.reduxDashActionsMod.Reducer[State, Payload] = js.native
  def handleAction[State, Payload](
    actionType: java.lang.String,
    reducer: reduxDashActionsLib.reduxDashActionsMod.Reducer[State, Payload],
    initialState: State
  ): reduxDashActionsLib.reduxDashActionsMod.Reducer[State, Payload] = js.native
  def handleAction[State, Payload](
    actionType: reduxDashActionsLib.reduxDashActionsMod.ActionFunctions[Payload],
    reducer: reduxDashActionsLib.reduxDashActionsMod.ReducerNextThrow[State, Payload],
    initialState: State
  ): reduxDashActionsLib.reduxDashActionsMod.Reducer[State, Payload] = js.native
  def handleAction[State, Payload](
    actionType: reduxDashActionsLib.reduxDashActionsMod.ActionFunctions[Payload],
    reducer: reduxDashActionsLib.reduxDashActionsMod.Reducer[State, Payload],
    initialState: State
  ): reduxDashActionsLib.reduxDashActionsMod.Reducer[State, Payload] = js.native
  def handleAction[State, Payload](
    actionType: reduxDashActionsLib.reduxDashActionsMod.CombinedActionType,
    reducer: reduxDashActionsLib.reduxDashActionsMod.ReducerNextThrow[State, Payload],
    initialState: State
  ): reduxDashActionsLib.reduxDashActionsMod.Reducer[State, Payload] = js.native
  def handleAction[State, Payload](
    actionType: reduxDashActionsLib.reduxDashActionsMod.CombinedActionType,
    reducer: reduxDashActionsLib.reduxDashActionsMod.Reducer[State, Payload],
    initialState: State
  ): reduxDashActionsLib.reduxDashActionsMod.Reducer[State, Payload] = js.native
  def handleAction[State, Payload, Meta](
    actionType: java.lang.String,
    reducer: reduxDashActionsLib.reduxDashActionsMod.ReducerNextThrowMeta[State, Payload, Meta],
    initialState: State
  ): reduxDashActionsLib.reduxDashActionsMod.Reducer[State, Payload] = js.native
  def handleAction[State, Payload, Meta](
    actionType: reduxDashActionsLib.reduxDashActionsMod.ActionWithMetaFunctions[Payload, Meta],
    reducer: reduxDashActionsLib.reduxDashActionsMod.ReducerNextThrowMeta[State, Payload, Meta],
    initialState: State
  ): reduxDashActionsLib.reduxDashActionsMod.Reducer[State, Payload] = js.native
  def handleAction[State, Payload, Meta](
    actionType: reduxDashActionsLib.reduxDashActionsMod.CombinedActionType,
    reducer: reduxDashActionsLib.reduxDashActionsMod.ReducerNextThrowMeta[State, Payload, Meta],
    initialState: State
  ): reduxDashActionsLib.reduxDashActionsMod.Reducer[State, Payload] = js.native
  @JSName("handleAction")
  def handleAction_StatePayloadMeta[State, Payload, Meta](
    actionType: java.lang.String,
    reducer: reduxDashActionsLib.reduxDashActionsMod.ReducerMeta[State, Payload, Meta],
    initialState: State
  ): reduxDashActionsLib.reduxDashActionsMod.Reducer[State, Payload] = js.native
  @JSName("handleAction")
  def handleAction_StatePayloadMeta[State, Payload, Meta](
    actionType: reduxDashActionsLib.reduxDashActionsMod.ActionWithMetaFunctions[Payload, Meta],
    reducer: reduxDashActionsLib.reduxDashActionsMod.ReducerMeta[State, Payload, Meta],
    initialState: State
  ): reduxDashActionsLib.reduxDashActionsMod.Reducer[State, Payload] = js.native
  @JSName("handleAction")
  def handleAction_StatePayloadMeta[State, Payload, Meta](
    actionType: reduxDashActionsLib.reduxDashActionsMod.CombinedActionType,
    reducer: reduxDashActionsLib.reduxDashActionsMod.ReducerMeta[State, Payload, Meta],
    initialState: State
  ): reduxDashActionsLib.reduxDashActionsMod.Reducer[State, Payload] = js.native
  def handleActions[StateAndPayload](
    reducerMap: reduxDashActionsLib.reduxDashActionsMod.ReducerMap[StateAndPayload, StateAndPayload],
    initialState: StateAndPayload
  ): reduxDashActionsLib.reduxDashActionsMod.Reducer[StateAndPayload, StateAndPayload] = js.native
  def handleActions[StateAndPayload](
    reducerMap: reduxDashActionsLib.reduxDashActionsMod.ReducerMap[StateAndPayload, StateAndPayload],
    initialState: StateAndPayload,
    options: reduxDashActionsLib.reduxDashActionsMod.Options
  ): reduxDashActionsLib.reduxDashActionsMod.Reducer[StateAndPayload, StateAndPayload] = js.native
  def handleActions[State, Payload, Meta](
    reducerMap: reduxDashActionsLib.reduxDashActionsMod.ReducerMapMeta[State, Payload, Meta],
    initialState: State
  ): reduxDashActionsLib.reduxDashActionsMod.ReducerMeta[State, Payload, Meta] = js.native
  def handleActions[State, Payload, Meta](
    reducerMap: reduxDashActionsLib.reduxDashActionsMod.ReducerMapMeta[State, Payload, Meta],
    initialState: State,
    options: reduxDashActionsLib.reduxDashActionsMod.Options
  ): reduxDashActionsLib.reduxDashActionsMod.ReducerMeta[State, Payload, Meta] = js.native
  @JSName("handleActions")
  def handleActions_StatePayload[State, Payload](
    reducerMap: reduxDashActionsLib.reduxDashActionsMod.ReducerMap[State, Payload],
    initialState: State
  ): reduxDashActionsLib.reduxDashActionsMod.Reducer[State, Payload] = js.native
  @JSName("handleActions")
  def handleActions_StatePayload[State, Payload](
    reducerMap: reduxDashActionsLib.reduxDashActionsMod.ReducerMap[State, Payload],
    initialState: State,
    options: reduxDashActionsLib.reduxDashActionsMod.Options
  ): reduxDashActionsLib.reduxDashActionsMod.Reducer[State, Payload] = js.native
}

