package typings.reduxActions

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-actions", JSImport.Namespace)
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
  
  inline def createActions(actionMapOrIdentityAction: String, identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createActions")(scala.List(actionMapOrIdentityAction.asInstanceOf[js.Any]).`++`(identityActions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[StringDictionary[ActionFunctionAny[Action[Any]]]]
  inline def createActions(actionMapOrIdentityAction: ActionMap[Any, Any], identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createActions")(scala.List(actionMapOrIdentityAction.asInstanceOf[js.Any]).`++`(identityActions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[StringDictionary[ActionFunctionAny[Action[Any]]]]
  
  inline def createActions_Payload[Payload](actionMapOrIdentityAction: String, identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[Payload]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createActions")(scala.List(actionMapOrIdentityAction.asInstanceOf[js.Any]).`++`(identityActions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[StringDictionary[ActionFunctionAny[Action[Payload]]]]
  inline def createActions_Payload[Payload](actionMapOrIdentityAction: ActionMap[Payload, Any], identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[Payload]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createActions")(scala.List(actionMapOrIdentityAction.asInstanceOf[js.Any]).`++`(identityActions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[StringDictionary[ActionFunctionAny[Action[Payload]]]]
  
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
  
  trait Action[Payload]
    extends StObject
       with BaseAction {
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var payload: Payload
  }
  object Action {
    
    inline def apply[Payload](payload: Payload, `type`: String): Action[Payload] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[Payload]]
    }
    
    extension [Self <: Action[?], Payload](x: Self & Action[Payload]) {
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  type ActionFunction0[R] = js.Function0[R]
  
  type ActionFunction1[T1, R] = js.Function1[/* t1 */ T1, R]
  
  type ActionFunction2[T1, T2, R] = js.Function2[/* t1 */ T1, /* t2 */ T2, R]
  
  type ActionFunction3[T1, T2, T3, R] = js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]
  
  type ActionFunction4[T1, T2, T3, T4, R] = js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]
  
  @js.native
  trait ActionFunctionAny[R] extends StObject {
    
    def apply(args: Any*): R = js.native
  }
  
  type ActionFunctions[Payload] = BaseActionFunctions[Action[Payload]]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ActionMap = {[actionType: string] : redux-actions.redux-actions.ActionMap<Payload, Meta> | redux-actions.redux-actions.ActionFunctionAny<Payload> | [redux-actions.redux-actions.ActionFunctionAny<Payload>, redux-actions.redux-actions.ActionFunctionAny<Meta>] | undefined}
  }}}
  to avoid circular code involving: 
  - redux-actions.redux-actions.ActionMap
  */
  trait ActionMap[Payload, Meta]
    extends StObject
       with /* actionType */ StringDictionary[
          js.UndefOr[
            (ActionMap[Payload, Meta]) | ActionFunctionAny[Payload] | (js.Tuple2[ActionFunctionAny[Payload], ActionFunctionAny[Meta]])
          ]
        ]
  object ActionMap {
    
    inline def apply[Payload, Meta](): ActionMap[Payload, Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionMap[Payload, Meta]]
    }
  }
  
  trait ActionMeta[Payload, Meta]
    extends StObject
       with Action[Payload] {
    
    var meta: Meta
  }
  object ActionMeta {
    
    inline def apply[Payload, Meta](meta: Meta, payload: Payload, `type`: String): ActionMeta[Payload, Meta] = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionMeta[Payload, Meta]]
    }
    
    extension [Self <: ActionMeta[?, ?], Payload, Meta](x: Self & (ActionMeta[Payload, Meta])) {
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  type ActionWithMetaFunctions[Payload, Meta] = BaseActionFunctions[ActionMeta[Payload, Meta]]
  
  trait BaseAction extends StObject {
    
    var `type`: String
  }
  object BaseAction {
    
    inline def apply(`type`: String): BaseAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseAction]
    }
    
    extension [Self <: BaseAction](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type BaseActionFunctions[TAction] = ActionFunction0[TAction] | (ActionFunction1[Any, TAction]) | (ActionFunction2[Any, Any, TAction]) | (ActionFunction3[Any, Any, Any, TAction]) | (ActionFunction4[Any, Any, Any, Any, TAction]) | ActionFunctionAny[TAction]
  
  trait CombinedActionType extends StObject {
    
    var _dummy: Unit
  }
  object CombinedActionType {
    
    inline def apply(_dummy: Unit): CombinedActionType = {
      val __obj = js.Dynamic.literal(_dummy = _dummy.asInstanceOf[js.Any])
      __obj.asInstanceOf[CombinedActionType]
    }
    
    extension [Self <: CombinedActionType](x: Self) {
      
      inline def set_dummy(value: Unit): Self = StObject.set(x, "_dummy", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  type Reducer[State, Payload] = js.Function2[/* state */ State, /* action */ Action[Payload], State]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ReducerMap = {[actionType: string] : redux-actions.redux-actions.ReducerMapValue<State, Payload>}
  }}}
  to avoid circular code involving: 
  - redux-actions.redux-actions.ReducerMap
  - redux-actions.redux-actions.ReducerMapValue
  */
  trait ReducerMap[State, Payload]
    extends StObject
       with /* actionType */ StringDictionary[ReducerMapValue[State, Payload]]
       with _ReducerMapValue[State, Payload]
  object ReducerMap {
    
    inline def apply[State, Payload](): ReducerMap[State, Payload] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReducerMap[State, Payload]]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ReducerMapMeta = {[actionType: string] : redux-actions.redux-actions.ReducerMeta<State, Payload, Meta> | redux-actions.redux-actions.ReducerNextThrowMeta<State, Payload, Meta> | redux-actions.redux-actions.ReducerMapMeta<State, Payload, Meta>}
  }}}
  to avoid circular code involving: 
  - redux-actions.redux-actions.ReducerMapMeta
  */
  trait ReducerMapMeta[State, Payload, Meta]
    extends StObject
       with /* actionType */ StringDictionary[
          (ReducerMeta[State, Payload, Meta]) | (ReducerNextThrowMeta[State, Payload, Meta]) | (ReducerMapMeta[State, Payload, Meta])
        ]
  object ReducerMapMeta {
    
    inline def apply[State, Payload, Meta](): ReducerMapMeta[State, Payload, Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReducerMapMeta[State, Payload, Meta]]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reduxActions.mod.Reducer[State, Payload]
    - typings.reduxActions.mod.ReducerNextThrow[State, Payload]
    - typings.reduxActions.mod.ReducerMap[State, Payload]
  */
  type ReducerMapValue[State, Payload] = (_ReducerMapValue[State, Payload]) | (Reducer[State, Payload])
  
  type ReducerMeta[State, Payload, Meta] = js.Function2[/* state */ State, /* action */ ActionMeta[Payload, Meta], State]
  
  trait ReducerNextThrow[State, Payload]
    extends StObject
       with _ReducerMapValue[State, Payload] {
    
    var next: js.UndefOr[js.Function2[/* state */ State, /* action */ Action[Payload], State]] = js.undefined
    
    var `throw`: js.UndefOr[js.Function2[/* state */ State, /* action */ Action[Payload], State]] = js.undefined
  }
  object ReducerNextThrow {
    
    inline def apply[State, Payload](): ReducerNextThrow[State, Payload] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReducerNextThrow[State, Payload]]
    }
    
    extension [Self <: ReducerNextThrow[?, ?], State, Payload](x: Self & (ReducerNextThrow[State, Payload])) {
      
      inline def setNext(value: (/* state */ State, /* action */ Action[Payload]) => State): Self = StObject.set(x, "next", js.Any.fromFunction2(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setThrow(value: (/* state */ State, /* action */ Action[Payload]) => State): Self = StObject.set(x, "throw", js.Any.fromFunction2(value))
      
      inline def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
    }
  }
  
  trait ReducerNextThrowMeta[State, Payload, Meta] extends StObject {
    
    var next: js.UndefOr[js.Function2[/* state */ State, /* action */ ActionMeta[Payload, Meta], State]] = js.undefined
    
    var `throw`: js.UndefOr[js.Function2[/* state */ State, /* action */ ActionMeta[Payload, Meta], State]] = js.undefined
  }
  object ReducerNextThrowMeta {
    
    inline def apply[State, Payload, Meta](): ReducerNextThrowMeta[State, Payload, Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReducerNextThrowMeta[State, Payload, Meta]]
    }
    
    extension [Self <: ReducerNextThrowMeta[?, ?, ?], State, Payload, Meta](x: Self & (ReducerNextThrowMeta[State, Payload, Meta])) {
      
      inline def setNext(value: (/* state */ State, /* action */ ActionMeta[Payload, Meta]) => State): Self = StObject.set(x, "next", js.Any.fromFunction2(value))
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setThrow(value: (/* state */ State, /* action */ ActionMeta[Payload, Meta]) => State): Self = StObject.set(x, "throw", js.Any.fromFunction2(value))
      
      inline def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
    }
  }
  
  type ReduxCompatibleReducer[State, Payload] = js.Function2[/* state */ js.UndefOr[State], /* action */ Action[Payload], State]
  
  type ReduxCompatibleReducerMeta[State, Payload, Meta] = js.Function2[/* state */ js.UndefOr[State], /* action */ ActionMeta[Payload, Meta], State]
  
  trait _ReducerMapValue[State, Payload] extends StObject
  object _ReducerMapValue {
    
    inline def ReducerMap[State, Payload](): typings.reduxActions.mod.ReducerMap[State, Payload] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reduxActions.mod.ReducerMap[State, Payload]]
    }
    
    inline def ReducerNextThrow[State, Payload](): typings.reduxActions.mod.ReducerNextThrow[State, Payload] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reduxActions.mod.ReducerNextThrow[State, Payload]]
    }
  }
}
