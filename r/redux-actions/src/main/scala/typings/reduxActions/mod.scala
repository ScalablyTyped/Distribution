package typings.reduxActions

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def combineActions(actionTypes: (ActionFunctions[js.Any] | String | js.Symbol)*): CombinedActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("combineActions")(actionTypes.asInstanceOf[js.Any]).asInstanceOf[CombinedActionType]
  
  @scala.inline
  def createAction(actionType: String): ActionFunctionAny[Action[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any]).asInstanceOf[ActionFunctionAny[Action[js.Any]]]
  @scala.inline
  def createAction[Meta](actionType: String, payloadCreator: Null, metaCreator: ActionFunctionAny[Meta]): ActionFunctionAny[ActionMeta[js.Any, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunctionAny[ActionMeta[js.Any, Meta]]]
  @scala.inline
  def createAction[Meta](actionType: String, payloadCreator: Unit, metaCreator: ActionFunctionAny[Meta]): ActionFunctionAny[ActionMeta[js.Any, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunctionAny[ActionMeta[js.Any, Meta]]]
  @scala.inline
  def createAction[Payload](actionType: String, payloadCreator: ActionFunction0[Payload]): ActionFunction0[Action[Payload]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction0[Action[Payload]]]
  @scala.inline
  def createAction[Payload, Arg1](actionType: String, payloadCreator: ActionFunction1[Arg1, Payload]): ActionFunction1[Arg1, Action[Payload]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction1[Arg1, Action[Payload]]]
  @scala.inline
  def createAction[Payload, Meta](
    actionType: String,
    payloadCreator: ActionFunctionAny[Payload],
    metaCreator: ActionFunctionAny[Meta]
  ): ActionFunctionAny[ActionMeta[Payload, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunctionAny[ActionMeta[Payload, Meta]]]
  @scala.inline
  def createAction[Payload, Meta, Arg1](
    actionType: String,
    payloadCreator: ActionFunction1[Arg1, Payload],
    metaCreator: ActionFunction1[Arg1, Meta]
  ): ActionFunction1[Arg1, ActionMeta[Payload, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction1[Arg1, ActionMeta[Payload, Meta]]]
  @scala.inline
  def createAction[Payload, Arg1, Arg2](actionType: String, payloadCreator: ActionFunction2[Arg1, Arg2, Payload]): ActionFunction2[Arg1, Arg2, Action[Payload]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction2[Arg1, Arg2, Action[Payload]]]
  @scala.inline
  def createAction[Payload, Meta, Arg1, Arg2](
    actionType: String,
    payloadCreator: ActionFunction2[Arg1, Arg2, Payload],
    metaCreator: ActionFunction2[Arg1, Arg2, Meta]
  ): ActionFunction2[Arg1, Arg2, ActionMeta[Payload, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction2[Arg1, Arg2, ActionMeta[Payload, Meta]]]
  @scala.inline
  def createAction[Payload, Arg1, Arg2, Arg3](actionType: String, payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload]): ActionFunction3[Arg1, Arg2, Arg3, Action[Payload]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction3[Arg1, Arg2, Arg3, Action[Payload]]]
  @scala.inline
  def createAction[Payload, Meta, Arg1, Arg2, Arg3](
    actionType: String,
    payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload],
    metaCreator: ActionFunction3[Arg1, Arg2, Arg3, Meta]
  ): ActionFunction3[Arg1, Arg2, Arg3, ActionMeta[Payload, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction3[Arg1, Arg2, Arg3, ActionMeta[Payload, Meta]]]
  @scala.inline
  def createAction[Payload, Arg1, Arg2, Arg3, Arg4](actionType: String, payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload]): ActionFunction4[Arg1, Arg2, Arg3, Arg4, Action[Payload]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction4[Arg1, Arg2, Arg3, Arg4, Action[Payload]]]
  @scala.inline
  def createAction[Payload, Meta, Arg1, Arg2, Arg3, Arg4](
    actionType: String,
    payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload],
    metaCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Meta]
  ): ActionFunction4[Arg1, Arg2, Arg3, Arg4, ActionMeta[Payload, Meta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[ActionFunction4[Arg1, Arg2, Arg3, Arg4, ActionMeta[Payload, Meta]]]
  
  @scala.inline
  def createAction_Payload_ActionFunction1[Payload](actionType: String): ActionFunction1[Payload, Action[Payload]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionType.asInstanceOf[js.Any]).asInstanceOf[ActionFunction1[Payload, Action[Payload]]]
  
  @scala.inline
  def createActions(actionMapOrIdentityAction: String, identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createActions")(actionMapOrIdentityAction.asInstanceOf[js.Any], identityActions.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[ActionFunctionAny[Action[js.Any]]]]
  @scala.inline
  def createActions(actionMapOrIdentityAction: ActionMap[js.Any, js.Any], identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createActions")(actionMapOrIdentityAction.asInstanceOf[js.Any], identityActions.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[ActionFunctionAny[Action[js.Any]]]]
  
  @scala.inline
  def createActions_Payload[Payload](actionMapOrIdentityAction: String, identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[Payload]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createActions")(actionMapOrIdentityAction.asInstanceOf[js.Any], identityActions.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[ActionFunctionAny[Action[Payload]]]]
  @scala.inline
  def createActions_Payload[Payload](actionMapOrIdentityAction: ActionMap[Payload, js.Any], identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[Payload]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createActions")(actionMapOrIdentityAction.asInstanceOf[js.Any], identityActions.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[ActionFunctionAny[Action[Payload]]]]
  
  @scala.inline
  def handleAction[State, Payload](actionType: String, reducer: ReducerNextThrow[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[State, Payload]]
  @scala.inline
  def handleAction[State, Payload](actionType: String, reducer: Reducer[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[State, Payload]]
  @scala.inline
  def handleAction[State, Payload](
    actionType: ActionFunctions[Payload],
    reducer: ReducerNextThrow[State, Payload],
    initialState: State
  ): ReduxCompatibleReducer[State, Payload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[State, Payload]]
  @scala.inline
  def handleAction[State, Payload](actionType: ActionFunctions[Payload], reducer: Reducer[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[State, Payload]]
  @scala.inline
  def handleAction[State, Payload](actionType: CombinedActionType, reducer: ReducerNextThrow[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[State, Payload]]
  @scala.inline
  def handleAction[State, Payload](actionType: CombinedActionType, reducer: Reducer[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[State, Payload]]
  @scala.inline
  def handleAction[State, Payload, Meta](actionType: String, reducer: ReducerNextThrowMeta[State, Payload, Meta], initialState: State): ReduxCompatibleReducerMeta[State, Payload, Meta] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducerMeta[State, Payload, Meta]]
  @scala.inline
  def handleAction[State, Payload, Meta](
    actionType: ActionWithMetaFunctions[Payload, Meta],
    reducer: ReducerNextThrowMeta[State, Payload, Meta],
    initialState: State
  ): ReduxCompatibleReducerMeta[State, Payload, Meta] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducerMeta[State, Payload, Meta]]
  @scala.inline
  def handleAction[State, Payload, Meta](
    actionType: CombinedActionType,
    reducer: ReducerNextThrowMeta[State, Payload, Meta],
    initialState: State
  ): ReduxCompatibleReducerMeta[State, Payload, Meta] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducerMeta[State, Payload, Meta]]
  
  @scala.inline
  def handleAction_StatePayloadMeta_ReduxCompatibleReducerMeta[State, Payload, Meta](actionType: String, reducer: ReducerMeta[State, Payload, Meta], initialState: State): ReduxCompatibleReducerMeta[State, Payload, Meta] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducerMeta[State, Payload, Meta]]
  @scala.inline
  def handleAction_StatePayloadMeta_ReduxCompatibleReducerMeta[State, Payload, Meta](
    actionType: ActionWithMetaFunctions[Payload, Meta],
    reducer: ReducerMeta[State, Payload, Meta],
    initialState: State
  ): ReduxCompatibleReducerMeta[State, Payload, Meta] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducerMeta[State, Payload, Meta]]
  @scala.inline
  def handleAction_StatePayloadMeta_ReduxCompatibleReducerMeta[State, Payload, Meta](actionType: CombinedActionType, reducer: ReducerMeta[State, Payload, Meta], initialState: State): ReduxCompatibleReducerMeta[State, Payload, Meta] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAction")(actionType.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducerMeta[State, Payload, Meta]]
  
  @scala.inline
  def handleActions[StateAndPayload](reducerMap: ReducerMap[StateAndPayload, StateAndPayload], initialState: StateAndPayload): ReduxCompatibleReducer[StateAndPayload, StateAndPayload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleActions")(reducerMap.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[StateAndPayload, StateAndPayload]]
  @scala.inline
  def handleActions[StateAndPayload](
    reducerMap: ReducerMap[StateAndPayload, StateAndPayload],
    initialState: StateAndPayload,
    options: Options
  ): ReduxCompatibleReducer[StateAndPayload, StateAndPayload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleActions")(reducerMap.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[StateAndPayload, StateAndPayload]]
  @scala.inline
  def handleActions[State, Payload, Meta](reducerMap: ReducerMapMeta[State, Payload, Meta], initialState: State): ReduxCompatibleReducerMeta[State, Payload, Meta] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleActions")(reducerMap.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducerMeta[State, Payload, Meta]]
  @scala.inline
  def handleActions[State, Payload, Meta](reducerMap: ReducerMapMeta[State, Payload, Meta], initialState: State, options: Options): ReduxCompatibleReducerMeta[State, Payload, Meta] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleActions")(reducerMap.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducerMeta[State, Payload, Meta]]
  
  @scala.inline
  def handleActions_StatePayload[State, Payload](reducerMap: ReducerMap[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleActions")(reducerMap.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[State, Payload]]
  @scala.inline
  def handleActions_StatePayload[State, Payload](reducerMap: ReducerMap[State, Payload], initialState: State, options: Options): ReduxCompatibleReducer[State, Payload] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleActions")(reducerMap.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReduxCompatibleReducer[State, Payload]]
  
  trait Action[Payload]
    extends StObject
       with BaseAction {
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var payload: Payload
  }
  object Action {
    
    @scala.inline
    def apply[Payload](payload: Payload, `type`: String): Action[Payload] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[Payload]]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action[?], Payload] (val x: Self & Action[Payload]) extends AnyVal {
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  type ActionFunction0[R] = js.Function0[R]
  
  type ActionFunction1[T1, R] = js.Function1[/* t1 */ T1, R]
  
  type ActionFunction2[T1, T2, R] = js.Function2[/* t1 */ T1, /* t2 */ T2, R]
  
  type ActionFunction3[T1, T2, T3, R] = js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]
  
  type ActionFunction4[T1, T2, T3, T4, R] = js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]
  
  @js.native
  trait ActionFunctionAny[R] extends StObject {
    
    def apply(args: js.Any*): R = js.native
  }
  
  type ActionFunctions[Payload] = BaseActionFunctions[Action[Payload]]
  
  trait ActionMap[Payload, Meta]
    extends StObject
       with /* actionType */ StringDictionary[
          js.UndefOr[
            (ActionMap[Payload, Meta]) | ActionFunctionAny[Payload] | (js.Tuple2[ActionFunctionAny[Payload], ActionFunctionAny[Meta]])
          ]
        ]
  object ActionMap {
    
    @scala.inline
    def apply[Payload, Meta](): ActionMap[Payload, Meta] = {
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
    
    @scala.inline
    def apply[Payload, Meta](meta: Meta, payload: Payload, `type`: String): ActionMeta[Payload, Meta] = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionMeta[Payload, Meta]]
    }
    
    @scala.inline
    implicit class ActionMetaMutableBuilder[Self <: ActionMeta[?, ?], Payload, Meta] (val x: Self & (ActionMeta[Payload, Meta])) extends AnyVal {
      
      @scala.inline
      def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  type ActionWithMetaFunctions[Payload, Meta] = BaseActionFunctions[ActionMeta[Payload, Meta]]
  
  trait BaseAction extends StObject {
    
    var `type`: String
  }
  object BaseAction {
    
    @scala.inline
    def apply(`type`: String): BaseAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseAction]
    }
    
    @scala.inline
    implicit class BaseActionMutableBuilder[Self <: BaseAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type BaseActionFunctions[TAction] = ActionFunction0[TAction] | (ActionFunction1[js.Any, TAction]) | (ActionFunction2[js.Any, js.Any, TAction]) | (ActionFunction3[js.Any, js.Any, js.Any, TAction]) | (ActionFunction4[js.Any, js.Any, js.Any, js.Any, TAction]) | ActionFunctionAny[TAction]
  
  trait CombinedActionType extends StObject {
    
    var _dummy: Unit
  }
  object CombinedActionType {
    
    @scala.inline
    def apply(_dummy: Unit): CombinedActionType = {
      val __obj = js.Dynamic.literal(_dummy = _dummy.asInstanceOf[js.Any])
      __obj.asInstanceOf[CombinedActionType]
    }
    
    @scala.inline
    implicit class CombinedActionTypeMutableBuilder[Self <: CombinedActionType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_dummy(value: Unit): Self = StObject.set(x, "_dummy", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  type Reducer[State, Payload] = js.Function2[/* state */ State, /* action */ Action[Payload], State]
  
  trait ReducerMap[State, Payload]
    extends StObject
       with /* actionType */ StringDictionary[ReducerMapValue[State, Payload]]
       with _ReducerMapValue[State, Payload]
  object ReducerMap {
    
    @scala.inline
    def apply[State, Payload](): ReducerMap[State, Payload] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReducerMap[State, Payload]]
    }
  }
  
  trait ReducerMapMeta[State, Payload, Meta]
    extends StObject
       with /* actionType */ StringDictionary[
          (ReducerMeta[State, Payload, Meta]) | (ReducerNextThrowMeta[State, Payload, Meta]) | (ReducerMapMeta[State, Payload, Meta])
        ]
  object ReducerMapMeta {
    
    @scala.inline
    def apply[State, Payload, Meta](): ReducerMapMeta[State, Payload, Meta] = {
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
    
    @scala.inline
    def apply[State, Payload](): ReducerNextThrow[State, Payload] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReducerNextThrow[State, Payload]]
    }
    
    @scala.inline
    implicit class ReducerNextThrowMutableBuilder[Self <: ReducerNextThrow[?, ?], State, Payload] (val x: Self & (ReducerNextThrow[State, Payload])) extends AnyVal {
      
      @scala.inline
      def setNext(value: (/* state */ State, /* action */ Action[Payload]) => State): Self = StObject.set(x, "next", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setThrow(value: (/* state */ State, /* action */ Action[Payload]) => State): Self = StObject.set(x, "throw", js.Any.fromFunction2(value))
      
      @scala.inline
      def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
    }
  }
  
  trait ReducerNextThrowMeta[State, Payload, Meta] extends StObject {
    
    var next: js.UndefOr[js.Function2[/* state */ State, /* action */ ActionMeta[Payload, Meta], State]] = js.undefined
    
    var `throw`: js.UndefOr[js.Function2[/* state */ State, /* action */ ActionMeta[Payload, Meta], State]] = js.undefined
  }
  object ReducerNextThrowMeta {
    
    @scala.inline
    def apply[State, Payload, Meta](): ReducerNextThrowMeta[State, Payload, Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReducerNextThrowMeta[State, Payload, Meta]]
    }
    
    @scala.inline
    implicit class ReducerNextThrowMetaMutableBuilder[Self <: ReducerNextThrowMeta[?, ?, ?], State, Payload, Meta] (val x: Self & (ReducerNextThrowMeta[State, Payload, Meta])) extends AnyVal {
      
      @scala.inline
      def setNext(value: (/* state */ State, /* action */ ActionMeta[Payload, Meta]) => State): Self = StObject.set(x, "next", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setThrow(value: (/* state */ State, /* action */ ActionMeta[Payload, Meta]) => State): Self = StObject.set(x, "throw", js.Any.fromFunction2(value))
      
      @scala.inline
      def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
    }
  }
  
  type ReduxCompatibleReducer[State, Payload] = js.Function2[/* state */ js.UndefOr[State], /* action */ Action[Payload], State]
  
  type ReduxCompatibleReducerMeta[State, Payload, Meta] = js.Function2[/* state */ js.UndefOr[State], /* action */ ActionMeta[Payload, Meta], State]
  
  trait _ReducerMapValue[State, Payload] extends StObject
  object _ReducerMapValue {
    
    @scala.inline
    def ReducerMap[State, Payload](): typings.reduxActions.mod.ReducerMap[State, Payload] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reduxActions.mod.ReducerMap[State, Payload]]
    }
    
    @scala.inline
    def ReducerNextThrow[State, Payload](): typings.reduxActions.mod.ReducerNextThrow[State, Payload] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reduxActions.mod.ReducerNextThrow[State, Payload]]
    }
  }
}
