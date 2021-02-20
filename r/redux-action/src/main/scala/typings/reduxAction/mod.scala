package typings.reduxAction

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Reducer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-action", "createAction")
  @js.native
  def createAction[Payload](): ActionFunction1[_, ThunkAction[Payload]] = js.native
  @JSImport("redux-action", "createAction")
  @js.native
  def createAction[Payload](payloadCreator: ActionFunctionAny[js.Promise[Payload] | Payload]): ActionFunctionAny[ThunkAction[Payload]] = js.native
  @JSImport("redux-action", "createAction")
  @js.native
  def createAction[Payload](`type`: String): ActionFunction1[_, ThunkAction[Payload]] = js.native
  @JSImport("redux-action", "createAction")
  @js.native
  def createAction[Payload](`type`: String, payloadCreator: ActionFunctionAny[js.Promise[Payload] | Payload]): ActionFunctionAny[ThunkAction[Payload]] = js.native
  @JSImport("redux-action", "createAction")
  @js.native
  def createAction[Payload, Meta](
    payloadCreator: ActionFunctionAny[js.Promise[Payload] | Payload],
    metaCreator: ActionFunctionAny[Meta]
  ): ActionFunctionAny[ThunkMetaAction[Payload, Meta]] = js.native
  @JSImport("redux-action", "createAction")
  @js.native
  def createAction[Payload, Meta](
    `type`: String,
    payloadCreator: ActionFunctionAny[js.Promise[Payload] | Payload],
    metaCreator: ActionFunctionAny[Meta]
  ): ActionFunctionAny[ThunkMetaAction[Payload, Meta]] = js.native
  @JSImport("redux-action", "createAction")
  @js.native
  def createAction[Payload, Arg1, Arg2](payloadCreator: ActionFunction2[Arg1, Arg2, js.Promise[Payload] | Payload]): ActionFunction2[Arg1, Arg2, ThunkAction[Payload]] = js.native
  @JSImport("redux-action", "createAction")
  @js.native
  def createAction[Payload, Arg1, Arg2, Arg3](payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, js.Promise[Payload] | Payload]): ActionFunction3[Arg1, Arg2, Arg3, ThunkAction[Payload]] = js.native
  @JSImport("redux-action", "createAction")
  @js.native
  def createAction_PayloadArg[Payload, Arg](): ActionFunction1[Arg, ThunkAction[Payload]] = js.native
  @JSImport("redux-action", "createAction")
  @js.native
  def createAction_PayloadArg[Payload, Arg](`type`: String): ActionFunction1[Arg, ThunkAction[Payload]] = js.native
  @JSImport("redux-action", "createAction")
  @js.native
  def createAction_PayloadArg_ActionFunction1[Payload, Arg](payloadCreator: ActionFunction1[Arg, js.Promise[Payload] | Payload]): ActionFunction1[Arg, ThunkAction[Payload]] = js.native
  
  @JSImport("redux-action", "createReducer")
  @js.native
  def createReducer[State](defaultState: State, handlers: ReducerHandlers[State]): Reducer[State, AnyAction] = js.native
  
  @JSImport("redux-action", "createSyncAction")
  @js.native
  def createSyncAction[Payload](`type`: String): ActionFunctionAny[Action[Payload]] = js.native
  @JSImport("redux-action", "createSyncAction")
  @js.native
  def createSyncAction[Payload](`type`: String, payloadCreator: ActionFunctionAny[Payload]): ActionFunctionAny[Action[Payload]] = js.native
  @JSImport("redux-action", "createSyncAction")
  @js.native
  def createSyncAction[Payload, Meta](`type`: String, payloadCreator: ActionFunctionAny[Payload], metaCreator: ActionFunctionAny[Meta]): ActionFunctionAny[MetaAction[Payload, Meta]] = js.native
  
  @js.native
  trait Action[Payload] extends BaseAction {
    
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
      def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  type ActionFunction0[R] = js.Function0[R]
  
  type ActionFunction1[T1, R] = js.Function1[/* t1 */ T1, R]
  
  type ActionFunction2[T1, T2, R] = js.Function2[/* t1 */ T1, /* t2 */ T2, R]
  
  type ActionFunction3[T1, T2, T3, R] = js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]
  
  type ActionFunctionAny[R] = js.Function1[/* repeated */ js.Any, R]
  
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
  
  @js.native
  trait MetaAction[Payload, Meta] extends Action[Payload] {
    
    var meta: Meta = js.native
  }
  object MetaAction {
    
    @scala.inline
    def apply[Payload, Meta](meta: Meta, payload: Payload, `type`: String): MetaAction[Payload, Meta] = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaAction[Payload, Meta]]
    }
    
    @scala.inline
    implicit class MetaActionMutableBuilder[Self <: MetaAction[_, _], Payload, Meta] (val x: Self with (MetaAction[Payload, Meta])) extends AnyVal {
      
      @scala.inline
      def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  type ReducerHandler[State] = js.Function3[
    /* payload */ js.Any, 
    /* state */ js.UndefOr[State], 
    /* action */ js.UndefOr[BaseAction], 
    State
  ]
  
  type ReducerHandlers[State] = StringDictionary[ReducerHandler[State]]
  
  type ThunkAction[Payload] = js.Function2[
    /* dispatch */ Dispatch[js.Any], 
    /* getState */ js.Function0[js.Any], 
    js.Promise[Action[Payload]]
  ]
  
  type ThunkMetaAction[Payload, Meta] = js.Function2[
    /* dispatch */ Dispatch[js.Any], 
    /* getState */ js.Function0[js.Any], 
    js.Promise[MetaAction[Payload, Meta]]
  ]
}
