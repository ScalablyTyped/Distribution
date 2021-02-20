package typings.reduxActions

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-actions", "combineActions")
  @js.native
  def combineActions(actionTypes: (ActionFunctions[_] | String | js.Symbol)*): CombinedActionType = js.native
  
  @JSImport("redux-actions", "createAction")
  @js.native
  def createAction(actionType: String): ActionFunctionAny[Action[_]] = js.native
  @JSImport("redux-actions", "createAction")
  @js.native
  def createAction[Meta](
    actionType: String,
    payloadCreator: js.UndefOr[scala.Nothing],
    metaCreator: ActionFunctionAny[Meta]
  ): ActionFunctionAny[ActionMeta[_, Meta]] = js.native
  @JSImport("redux-actions", "createAction")
  @js.native
  def createAction[Meta](actionType: String, payloadCreator: Null, metaCreator: ActionFunctionAny[Meta]): ActionFunctionAny[ActionMeta[_, Meta]] = js.native
  @JSImport("redux-actions", "createAction")
  @js.native
  def createAction[Payload](actionType: String, payloadCreator: ActionFunction0[Payload]): ActionFunction0[Action[Payload]] = js.native
  @JSImport("redux-actions", "createAction")
  @js.native
  def createAction[Payload, Arg1](actionType: String, payloadCreator: ActionFunction1[Arg1, Payload]): ActionFunction1[Arg1, Action[Payload]] = js.native
  @JSImport("redux-actions", "createAction")
  @js.native
  def createAction[Payload, Meta](
    actionType: String,
    payloadCreator: ActionFunctionAny[Payload],
    metaCreator: ActionFunctionAny[Meta]
  ): ActionFunctionAny[ActionMeta[Payload, Meta]] = js.native
  @JSImport("redux-actions", "createAction")
  @js.native
  def createAction[Payload, Arg1, Arg2](actionType: String, payloadCreator: ActionFunction2[Arg1, Arg2, Payload]): ActionFunction2[Arg1, Arg2, Action[Payload]] = js.native
  @JSImport("redux-actions", "createAction")
  @js.native
  def createAction[Payload, Meta, Arg1, Arg2](
    actionType: String,
    payloadCreator: ActionFunction2[Arg1, Arg2, Payload],
    metaCreator: ActionFunction2[Arg1, Arg2, Meta]
  ): ActionFunction2[Arg1, Arg2, ActionMeta[Payload, Meta]] = js.native
  @JSImport("redux-actions", "createAction")
  @js.native
  def createAction[Payload, Arg1, Arg2, Arg3](actionType: String, payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload]): ActionFunction3[Arg1, Arg2, Arg3, Action[Payload]] = js.native
  @JSImport("redux-actions", "createAction")
  @js.native
  def createAction[Payload, Meta, Arg1, Arg2, Arg3](
    actionType: String,
    payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload],
    metaCreator: ActionFunction3[Arg1, Arg2, Arg3, Meta]
  ): ActionFunction3[Arg1, Arg2, Arg3, ActionMeta[Payload, Meta]] = js.native
  @JSImport("redux-actions", "createAction")
  @js.native
  def createAction[Payload, Arg1, Arg2, Arg3, Arg4](actionType: String, payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload]): ActionFunction4[Arg1, Arg2, Arg3, Arg4, Action[Payload]] = js.native
  @JSImport("redux-actions", "createAction")
  @js.native
  def createAction[Payload, Meta, Arg1, Arg2, Arg3, Arg4](
    actionType: String,
    payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload],
    metaCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Meta]
  ): ActionFunction4[Arg1, Arg2, Arg3, Arg4, ActionMeta[Payload, Meta]] = js.native
  @JSImport("redux-actions", "createAction")
  @js.native
  def createAction_PayloadMetaArg1_ActionFunction1[Payload, Meta, Arg1](
    actionType: String,
    payloadCreator: ActionFunction1[Arg1, Payload],
    metaCreator: ActionFunction1[Arg1, Meta]
  ): ActionFunction1[Arg1, ActionMeta[Payload, Meta]] = js.native
  @JSImport("redux-actions", "createAction")
  @js.native
  def createAction_Payload_ActionFunction1[Payload](actionType: String): ActionFunction1[Payload, Action[Payload]] = js.native
  
  @JSImport("redux-actions", "createActions")
  @js.native
  def createActions(actionMapOrIdentityAction: String, identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[_]]] = js.native
  @JSImport("redux-actions", "createActions")
  @js.native
  def createActions(actionMapOrIdentityAction: ActionMap[_, _], identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[_]]] = js.native
  @JSImport("redux-actions", "createActions")
  @js.native
  def createActions_Payload[Payload](actionMapOrIdentityAction: String, identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[Payload]]] = js.native
  @JSImport("redux-actions", "createActions")
  @js.native
  def createActions_Payload[Payload](actionMapOrIdentityAction: ActionMap[Payload, _], identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[Payload]]] = js.native
  
  @JSImport("redux-actions", "handleAction")
  @js.native
  def handleAction[State, Payload](actionType: String, reducer: ReducerNextThrow[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = js.native
  @JSImport("redux-actions", "handleAction")
  @js.native
  def handleAction[State, Payload](actionType: String, reducer: Reducer[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = js.native
  @JSImport("redux-actions", "handleAction")
  @js.native
  def handleAction[State, Payload](
    actionType: ActionFunctions[Payload],
    reducer: ReducerNextThrow[State, Payload],
    initialState: State
  ): ReduxCompatibleReducer[State, Payload] = js.native
  @JSImport("redux-actions", "handleAction")
  @js.native
  def handleAction[State, Payload](actionType: ActionFunctions[Payload], reducer: Reducer[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = js.native
  @JSImport("redux-actions", "handleAction")
  @js.native
  def handleAction[State, Payload](actionType: CombinedActionType, reducer: ReducerNextThrow[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = js.native
  @JSImport("redux-actions", "handleAction")
  @js.native
  def handleAction[State, Payload](actionType: CombinedActionType, reducer: Reducer[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = js.native
  @JSImport("redux-actions", "handleAction")
  @js.native
  def handleAction[State, Payload, Meta](actionType: String, reducer: ReducerNextThrowMeta[State, Payload, Meta], initialState: State): ReduxCompatibleReducerMeta[State, Payload, Meta] = js.native
  @JSImport("redux-actions", "handleAction")
  @js.native
  def handleAction[State, Payload, Meta](
    actionType: ActionWithMetaFunctions[Payload, Meta],
    reducer: ReducerNextThrowMeta[State, Payload, Meta],
    initialState: State
  ): ReduxCompatibleReducerMeta[State, Payload, Meta] = js.native
  @JSImport("redux-actions", "handleAction")
  @js.native
  def handleAction[State, Payload, Meta](
    actionType: CombinedActionType,
    reducer: ReducerNextThrowMeta[State, Payload, Meta],
    initialState: State
  ): ReduxCompatibleReducerMeta[State, Payload, Meta] = js.native
  @JSImport("redux-actions", "handleAction")
  @js.native
  def handleAction_StatePayloadMeta_ReduxCompatibleReducerMeta[State, Payload, Meta](actionType: String, reducer: ReducerMeta[State, Payload, Meta], initialState: State): ReduxCompatibleReducerMeta[State, Payload, Meta] = js.native
  @JSImport("redux-actions", "handleAction")
  @js.native
  def handleAction_StatePayloadMeta_ReduxCompatibleReducerMeta[State, Payload, Meta](
    actionType: ActionWithMetaFunctions[Payload, Meta],
    reducer: ReducerMeta[State, Payload, Meta],
    initialState: State
  ): ReduxCompatibleReducerMeta[State, Payload, Meta] = js.native
  @JSImport("redux-actions", "handleAction")
  @js.native
  def handleAction_StatePayloadMeta_ReduxCompatibleReducerMeta[State, Payload, Meta](actionType: CombinedActionType, reducer: ReducerMeta[State, Payload, Meta], initialState: State): ReduxCompatibleReducerMeta[State, Payload, Meta] = js.native
  
  @JSImport("redux-actions", "handleActions")
  @js.native
  def handleActions[StateAndPayload](reducerMap: ReducerMap[StateAndPayload, StateAndPayload], initialState: StateAndPayload): ReduxCompatibleReducer[StateAndPayload, StateAndPayload] = js.native
  @JSImport("redux-actions", "handleActions")
  @js.native
  def handleActions[StateAndPayload](
    reducerMap: ReducerMap[StateAndPayload, StateAndPayload],
    initialState: StateAndPayload,
    options: Options
  ): ReduxCompatibleReducer[StateAndPayload, StateAndPayload] = js.native
  @JSImport("redux-actions", "handleActions")
  @js.native
  def handleActions[State, Payload, Meta](reducerMap: ReducerMapMeta[State, Payload, Meta], initialState: State): ReduxCompatibleReducerMeta[State, Payload, Meta] = js.native
  @JSImport("redux-actions", "handleActions")
  @js.native
  def handleActions[State, Payload, Meta](reducerMap: ReducerMapMeta[State, Payload, Meta], initialState: State, options: Options): ReduxCompatibleReducerMeta[State, Payload, Meta] = js.native
  @JSImport("redux-actions", "handleActions")
  @js.native
  def handleActions_StatePayload[State, Payload](reducerMap: ReducerMap[State, Payload], initialState: State): ReduxCompatibleReducer[State, Payload] = js.native
  @JSImport("redux-actions", "handleActions")
  @js.native
  def handleActions_StatePayload[State, Payload](reducerMap: ReducerMap[State, Payload], initialState: State, options: Options): ReduxCompatibleReducer[State, Payload] = js.native
  
  @js.native
  trait Action[Payload] extends BaseAction {
    
    var error: js.UndefOr[Boolean] = js.native
    
    var payload: Payload = js.native
  }
  object Action {
    
    @scala.inline
    def apply[Payload](payload: Payload, `type`: String): Action[Payload] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[Payload]]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action[_], Payload] (val x: Self with Action[Payload]) extends AnyVal {
      
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
  
  type ActionFunctionAny[R] = js.Function1[/* repeated */ js.Any, R]
  
  type ActionFunctions[Payload] = BaseActionFunctions[Action[Payload]]
  
  @js.native
  trait ActionMap[Payload, Meta]
    extends /* actionType */ StringDictionary[
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
  
  @js.native
  trait ActionMeta[Payload, Meta] extends Action[Payload] {
    
    var meta: Meta = js.native
  }
  object ActionMeta {
    
    @scala.inline
    def apply[Payload, Meta](meta: Meta, payload: Payload, `type`: String): ActionMeta[Payload, Meta] = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionMeta[Payload, Meta]]
    }
    
    @scala.inline
    implicit class ActionMetaMutableBuilder[Self <: ActionMeta[_, _], Payload, Meta] (val x: Self with (ActionMeta[Payload, Meta])) extends AnyVal {
      
      @scala.inline
      def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  type ActionWithMetaFunctions[Payload, Meta] = BaseActionFunctions[ActionMeta[Payload, Meta]]
  
  @js.native
  trait BaseAction extends StObject {
    
    var `type`: String = js.native
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
  
  @js.native
  trait CombinedActionType extends StObject {
    
    var _dummy: js.UndefOr[scala.Nothing] = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var namespace: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
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
  
  @js.native
  trait ReducerMap[State, Payload]
    extends /* actionType */ StringDictionary[ReducerMapValue[State, Payload]]
       with _ReducerMapValue[State, Payload]
  object ReducerMap {
    
    @scala.inline
    def apply[State, Payload](): ReducerMap[State, Payload] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReducerMap[State, Payload]]
    }
  }
  
  @js.native
  trait ReducerMapMeta[State, Payload, Meta] extends /* actionType */ StringDictionary[
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
  
  @js.native
  trait ReducerNextThrow[State, Payload] extends _ReducerMapValue[State, Payload] {
    
    var next: js.UndefOr[js.Function2[/* state */ State, /* action */ Action[Payload], State]] = js.native
    
    var `throw`: js.UndefOr[js.Function2[/* state */ State, /* action */ Action[Payload], State]] = js.native
  }
  object ReducerNextThrow {
    
    @scala.inline
    def apply[State, Payload](): ReducerNextThrow[State, Payload] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReducerNextThrow[State, Payload]]
    }
    
    @scala.inline
    implicit class ReducerNextThrowMutableBuilder[Self <: ReducerNextThrow[_, _], State, Payload] (val x: Self with (ReducerNextThrow[State, Payload])) extends AnyVal {
      
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
  
  @js.native
  trait ReducerNextThrowMeta[State, Payload, Meta] extends StObject {
    
    var next: js.UndefOr[js.Function2[/* state */ State, /* action */ ActionMeta[Payload, Meta], State]] = js.native
    
    var `throw`: js.UndefOr[js.Function2[/* state */ State, /* action */ ActionMeta[Payload, Meta], State]] = js.native
  }
  object ReducerNextThrowMeta {
    
    @scala.inline
    def apply[State, Payload, Meta](): ReducerNextThrowMeta[State, Payload, Meta] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReducerNextThrowMeta[State, Payload, Meta]]
    }
    
    @scala.inline
    implicit class ReducerNextThrowMetaMutableBuilder[Self <: ReducerNextThrowMeta[_, _, _], State, Payload, Meta] (val x: Self with (ReducerNextThrowMeta[State, Payload, Meta])) extends AnyVal {
      
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
