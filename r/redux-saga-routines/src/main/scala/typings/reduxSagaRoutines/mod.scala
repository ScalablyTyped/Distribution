package typings.reduxSagaRoutines

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.reduxActions.mod.Action
import typings.reduxActions.mod.ActionFunction0
import typings.reduxActions.mod.ActionFunction1
import typings.reduxActions.mod.ActionFunction2
import typings.reduxActions.mod.ActionFunction3
import typings.reduxActions.mod.ActionFunction4
import typings.reduxActions.mod.ActionFunctionAny
import typings.reduxActions.mod.ActionMeta
import typings.reduxForm.reduxFormMod.FormSubmitHandler
import typings.reduxSagaRoutines.anon.FAILURE_
import typings.reduxSagaRoutines.anon.FULFILL
import typings.reduxSagaRoutines.anon.Failure
import typings.reduxSagaRoutines.anon.keyinRoutineStagesstring
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-saga-routines", "ROUTINE_PROMISE_ACTION")
  @js.native
  val ROUTINE_PROMISE_ACTION: String = js.native
  
  @JSImport("redux-saga-routines", "bindPromiseCreators")
  @js.native
  def bindPromiseCreators(promiseCreators: NumberDictionary[PromiseCreator[js.Object]], dispatch: Dispatch[AnyAction]): NumberDictionary[BoundPromiseCreator[js.Object]] = js.native
  @JSImport("redux-saga-routines", "bindPromiseCreators")
  @js.native
  def bindPromiseCreators(promiseCreators: StringDictionary[PromiseCreator[js.Object]], dispatch: Dispatch[AnyAction]): StringDictionary[BoundPromiseCreator[js.Object]] = js.native
  @JSImport("redux-saga-routines", "bindPromiseCreators")
  @js.native
  def bindPromiseCreators[TPayload](promiseCreator: PromiseCreator[TPayload], dispatch: Dispatch[AnyAction]): BoundPromiseCreator[TPayload] = js.native
  
  @JSImport("redux-saga-routines", "bindRoutineToReduxForm")
  @js.native
  def bindRoutineToReduxForm[TFormData, TProps](
    routine: Routine[
      ActionFunction1[
        ReduxFormPayload[TFormData, TProps], 
        (Action[ReduxFormPayload[TFormData, TProps]]) | (ActionMeta[ReduxFormPayload[TFormData, TProps], _])
      ], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _]
    ]
  ): FormSubmitHandler[TFormData, TProps, String] = js.native
  @JSImport("redux-saga-routines", "bindRoutineToReduxForm")
  @js.native
  def bindRoutineToReduxForm[TFormData, TProps](
    routine: Routine[
      ActionFunction1[
        ReduxFormPayload[TFormData, TProps], 
        (Action[ReduxFormPayload[TFormData, TProps]]) | (ActionMeta[ReduxFormPayload[TFormData, TProps], _])
      ], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _]
    ],
    noSuccessPayload: Boolean
  ): FormSubmitHandler[TFormData, TProps, String] = js.native
  
  @JSImport("redux-saga-routines", "createRoutine")
  @js.native
  def createRoutine[Payload](typePrefix: String): UnifiedRoutine[js.Function1[/* payload */ js.UndefOr[Payload], Action[js.UndefOr[Payload]]]] = js.native
  @JSImport("redux-saga-routines", "createRoutine")
  @js.native
  def createRoutine[Meta](
    typePrefix: String,
    payloadCreator: js.UndefOr[scala.Nothing],
    metaCreator: ActionFunctionAny[Meta]
  ): UnifiedRoutine[js.Function1[/* payload */ js.UndefOr[_], ActionMeta[_, Meta]]] = js.native
  @JSImport("redux-saga-routines", "createRoutine")
  @js.native
  def createRoutine[Meta](typePrefix: String, payloadCreator: Null, metaCreator: ActionFunctionAny[Meta]): UnifiedRoutine[js.Function1[/* payload */ js.UndefOr[_], ActionMeta[_, Meta]]] = js.native
  @JSImport("redux-saga-routines", "createRoutine")
  @js.native
  def createRoutine[Payload](typePrefix: String, payloadCreator: ActionFunction0[Payload]): UnifiedRoutine[ActionFunction0[Action[Payload]]] = js.native
  @JSImport("redux-saga-routines", "createRoutine")
  @js.native
  def createRoutine[Payload, Arg1](typePrefix: String, payloadCreator: ActionFunction1[Arg1, Payload]): UnifiedRoutine[ActionFunction1[Arg1, Action[Payload]]] = js.native
  @JSImport("redux-saga-routines", "createRoutine")
  @js.native
  def createRoutine[Payload, Meta](
    typePrefix: String,
    payloadCreator: ActionFunctionAny[Payload],
    metaCreator: ActionFunctionAny[Meta]
  ): UnifiedRoutine[ActionFunctionAny[ActionMeta[Payload, Meta]]] = js.native
  @JSImport("redux-saga-routines", "createRoutine")
  @js.native
  def createRoutine[Payload, Arg1, Arg2](typePrefix: String, payloadCreator: ActionFunction2[Arg1, Arg2, Payload]): UnifiedRoutine[ActionFunction2[Arg1, Arg2, Action[Payload]]] = js.native
  @JSImport("redux-saga-routines", "createRoutine")
  @js.native
  def createRoutine[Payload, Meta, Arg1, Arg2](
    typePrefix: String,
    payloadCreator: ActionFunction2[Arg1, Arg2, Payload],
    metaCreator: ActionFunction2[Arg1, Arg2, Meta]
  ): UnifiedRoutine[ActionFunction2[Arg1, Arg2, ActionMeta[Payload, Meta]]] = js.native
  @JSImport("redux-saga-routines", "createRoutine")
  @js.native
  def createRoutine[Payload, Arg1, Arg2, Arg3](typePrefix: String, payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload]): UnifiedRoutine[ActionFunction3[Arg1, Arg2, Arg3, Action[Payload]]] = js.native
  @JSImport("redux-saga-routines", "createRoutine")
  @js.native
  def createRoutine[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](
    typePrefix: String,
    payloadCreator: js.UndefOr[scala.Nothing],
    metaCreator: FULFILL[
      TTriggerMetaCreator, 
      TRequestMetaCreator, 
      TSuccessMetaCreator, 
      TFailureMetaCreator, 
      TFulfillMetaCreator
    ]
  ): Routine[
    ResolveActionCreatorByMeta[
      TTriggerMetaCreator, 
      ResolveFunctionReturnType[TTriggerMetaCreator], 
      ResolveFunctionArg1Type[TTriggerMetaCreator], 
      ResolveFunctionArg2Type[TTriggerMetaCreator], 
      ResolveFunctionArg3Type[TTriggerMetaCreator], 
      ResolveFunctionArg4Type[TTriggerMetaCreator]
    ], 
    ResolveActionCreatorByMeta[
      TRequestMetaCreator, 
      ResolveFunctionReturnType[TRequestMetaCreator], 
      ResolveFunctionArg1Type[TRequestMetaCreator], 
      ResolveFunctionArg2Type[TRequestMetaCreator], 
      ResolveFunctionArg3Type[TRequestMetaCreator], 
      ResolveFunctionArg4Type[TRequestMetaCreator]
    ], 
    ResolveActionCreatorByMeta[
      TSuccessMetaCreator, 
      ResolveFunctionReturnType[TSuccessMetaCreator], 
      ResolveFunctionArg1Type[TSuccessMetaCreator], 
      ResolveFunctionArg2Type[TSuccessMetaCreator], 
      ResolveFunctionArg3Type[TSuccessMetaCreator], 
      ResolveFunctionArg4Type[TSuccessMetaCreator]
    ], 
    ResolveActionCreatorByMeta[
      TFailureMetaCreator, 
      ResolveFunctionReturnType[TFailureMetaCreator], 
      ResolveFunctionArg1Type[TFailureMetaCreator], 
      ResolveFunctionArg2Type[TFailureMetaCreator], 
      ResolveFunctionArg3Type[TFailureMetaCreator], 
      ResolveFunctionArg4Type[TFailureMetaCreator]
    ], 
    ResolveActionCreatorByMeta[
      TFulfillMetaCreator, 
      ResolveFunctionReturnType[TFulfillMetaCreator], 
      ResolveFunctionArg1Type[TFulfillMetaCreator], 
      ResolveFunctionArg2Type[TFulfillMetaCreator], 
      ResolveFunctionArg3Type[TFulfillMetaCreator], 
      ResolveFunctionArg4Type[TFulfillMetaCreator]
    ]
  ] = js.native
  @JSImport("redux-saga-routines", "createRoutine")
  @js.native
  def createRoutine[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](
    typePrefix: String,
    payloadCreator: Null,
    metaCreator: FULFILL[
      TTriggerMetaCreator, 
      TRequestMetaCreator, 
      TSuccessMetaCreator, 
      TFailureMetaCreator, 
      TFulfillMetaCreator
    ]
  ): Routine[
    ResolveActionCreatorByMeta[
      TTriggerMetaCreator, 
      ResolveFunctionReturnType[TTriggerMetaCreator], 
      ResolveFunctionArg1Type[TTriggerMetaCreator], 
      ResolveFunctionArg2Type[TTriggerMetaCreator], 
      ResolveFunctionArg3Type[TTriggerMetaCreator], 
      ResolveFunctionArg4Type[TTriggerMetaCreator]
    ], 
    ResolveActionCreatorByMeta[
      TRequestMetaCreator, 
      ResolveFunctionReturnType[TRequestMetaCreator], 
      ResolveFunctionArg1Type[TRequestMetaCreator], 
      ResolveFunctionArg2Type[TRequestMetaCreator], 
      ResolveFunctionArg3Type[TRequestMetaCreator], 
      ResolveFunctionArg4Type[TRequestMetaCreator]
    ], 
    ResolveActionCreatorByMeta[
      TSuccessMetaCreator, 
      ResolveFunctionReturnType[TSuccessMetaCreator], 
      ResolveFunctionArg1Type[TSuccessMetaCreator], 
      ResolveFunctionArg2Type[TSuccessMetaCreator], 
      ResolveFunctionArg3Type[TSuccessMetaCreator], 
      ResolveFunctionArg4Type[TSuccessMetaCreator]
    ], 
    ResolveActionCreatorByMeta[
      TFailureMetaCreator, 
      ResolveFunctionReturnType[TFailureMetaCreator], 
      ResolveFunctionArg1Type[TFailureMetaCreator], 
      ResolveFunctionArg2Type[TFailureMetaCreator], 
      ResolveFunctionArg3Type[TFailureMetaCreator], 
      ResolveFunctionArg4Type[TFailureMetaCreator]
    ], 
    ResolveActionCreatorByMeta[
      TFulfillMetaCreator, 
      ResolveFunctionReturnType[TFulfillMetaCreator], 
      ResolveFunctionArg1Type[TFulfillMetaCreator], 
      ResolveFunctionArg2Type[TFulfillMetaCreator], 
      ResolveFunctionArg3Type[TFulfillMetaCreator], 
      ResolveFunctionArg4Type[TFulfillMetaCreator]
    ]
  ] = js.native
  @JSImport("redux-saga-routines", "createRoutine")
  @js.native
  def createRoutine[Payload, Meta, Arg1, Arg2, Arg3](
    typePrefix: String,
    payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload],
    metaCreator: ActionFunction3[Arg1, Arg2, Arg3, Meta]
  ): UnifiedRoutine[ActionFunction3[Arg1, Arg2, Arg3, ActionMeta[Payload, Meta]]] = js.native
  @JSImport("redux-saga-routines", "createRoutine")
  @js.native
  def createRoutine[Payload, Arg1, Arg2, Arg3, Arg4](typePrefix: String, payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload]): UnifiedRoutine[ActionFunction4[Arg1, Arg2, Arg3, Arg4, Action[Payload]]] = js.native
  @JSImport("redux-saga-routines", "createRoutine")
  @js.native
  def createRoutine[TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator](
    typePrefix: String,
    payloadCreator: FAILURE_[
      TTriggerPayloadCreator, 
      TRequestPayloadCreator, 
      TSuccessPayloadCreator, 
      TFailurePayloadCreator, 
      TFulfillPayloadCreator
    ]
  ): Routine[
    ResolveActionCreatorByPayload[
      TTriggerPayloadCreator, 
      ResolveFunctionReturnType[TTriggerPayloadCreator], 
      ResolveFunctionArg1Type[TTriggerPayloadCreator], 
      ResolveFunctionArg2Type[TTriggerPayloadCreator], 
      ResolveFunctionArg3Type[TTriggerPayloadCreator], 
      ResolveFunctionArg4Type[TTriggerPayloadCreator]
    ], 
    ResolveActionCreatorByPayload[
      TRequestPayloadCreator, 
      ResolveFunctionReturnType[TRequestPayloadCreator], 
      ResolveFunctionArg1Type[TRequestPayloadCreator], 
      ResolveFunctionArg2Type[TRequestPayloadCreator], 
      ResolveFunctionArg3Type[TRequestPayloadCreator], 
      ResolveFunctionArg4Type[TRequestPayloadCreator]
    ], 
    ResolveActionCreatorByPayload[
      TSuccessPayloadCreator, 
      ResolveFunctionReturnType[TSuccessPayloadCreator], 
      ResolveFunctionArg1Type[TSuccessPayloadCreator], 
      ResolveFunctionArg2Type[TSuccessPayloadCreator], 
      ResolveFunctionArg3Type[TSuccessPayloadCreator], 
      ResolveFunctionArg4Type[TSuccessPayloadCreator]
    ], 
    ResolveActionCreatorByPayload[
      TFailurePayloadCreator, 
      ResolveFunctionReturnType[TFailurePayloadCreator], 
      ResolveFunctionArg1Type[TFailurePayloadCreator], 
      ResolveFunctionArg2Type[TFailurePayloadCreator], 
      ResolveFunctionArg3Type[TFailurePayloadCreator], 
      ResolveFunctionArg4Type[TFailurePayloadCreator]
    ], 
    ResolveActionCreatorByPayload[
      TFulfillPayloadCreator, 
      ResolveFunctionReturnType[TFulfillPayloadCreator], 
      ResolveFunctionArg1Type[TFulfillPayloadCreator], 
      ResolveFunctionArg2Type[TFulfillPayloadCreator], 
      ResolveFunctionArg3Type[TFulfillPayloadCreator], 
      ResolveFunctionArg4Type[TFulfillPayloadCreator]
    ]
  ] = js.native
  @JSImport("redux-saga-routines", "createRoutine")
  @js.native
  def createRoutine[Payload, Meta, Arg1, Arg2, Arg3, Arg4](
    typePrefix: String,
    payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload],
    metaCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Meta]
  ): UnifiedRoutine[ActionFunction4[Arg1, Arg2, Arg3, Arg4, ActionMeta[Payload, Meta]]] = js.native
  @JSImport("redux-saga-routines", "createRoutine")
  @js.native
  def createRoutine[TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator, TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](
    typePrefix: String,
    payloadCreator: FAILURE_[
      TTriggerPayloadCreator, 
      TRequestPayloadCreator, 
      TSuccessPayloadCreator, 
      TFailurePayloadCreator, 
      TFulfillPayloadCreator
    ],
    metaCreator: FULFILL[
      TTriggerMetaCreator, 
      TRequestMetaCreator, 
      TSuccessMetaCreator, 
      TFailureMetaCreator, 
      TFulfillMetaCreator
    ]
  ): Routine[
    ResolveActionCreatorByPayloadMeta[
      TTriggerPayloadCreator, 
      TTriggerMetaCreator, 
      ResolveFunctionReturnType[TTriggerPayloadCreator], 
      ResolveFunctionReturnType[TTriggerMetaCreator], 
      ResolveFunctionArg1Type[TTriggerPayloadCreator], 
      ResolveFunctionArg2Type[TTriggerPayloadCreator], 
      ResolveFunctionArg3Type[TTriggerPayloadCreator], 
      ResolveFunctionArg4Type[TTriggerPayloadCreator]
    ], 
    ResolveActionCreatorByPayloadMeta[
      TRequestPayloadCreator, 
      TRequestMetaCreator, 
      ResolveFunctionReturnType[TRequestPayloadCreator], 
      ResolveFunctionReturnType[TRequestMetaCreator], 
      ResolveFunctionArg1Type[TRequestPayloadCreator], 
      ResolveFunctionArg2Type[TRequestPayloadCreator], 
      ResolveFunctionArg3Type[TRequestPayloadCreator], 
      ResolveFunctionArg4Type[TRequestPayloadCreator]
    ], 
    ResolveActionCreatorByPayloadMeta[
      TSuccessPayloadCreator, 
      TSuccessMetaCreator, 
      ResolveFunctionReturnType[TSuccessPayloadCreator], 
      ResolveFunctionReturnType[TSuccessMetaCreator], 
      ResolveFunctionArg1Type[TSuccessPayloadCreator], 
      ResolveFunctionArg2Type[TSuccessPayloadCreator], 
      ResolveFunctionArg3Type[TSuccessPayloadCreator], 
      ResolveFunctionArg4Type[TSuccessPayloadCreator]
    ], 
    ResolveActionCreatorByPayloadMeta[
      TFailurePayloadCreator, 
      TFailureMetaCreator, 
      ResolveFunctionReturnType[TFailurePayloadCreator], 
      ResolveFunctionReturnType[TFailureMetaCreator], 
      ResolveFunctionArg1Type[TFailurePayloadCreator], 
      ResolveFunctionArg2Type[TFailurePayloadCreator], 
      ResolveFunctionArg3Type[TFailurePayloadCreator], 
      ResolveFunctionArg4Type[TFailurePayloadCreator]
    ], 
    ResolveActionCreatorByPayloadMeta[
      TFulfillPayloadCreator, 
      TFulfillMetaCreator, 
      ResolveFunctionReturnType[TFulfillPayloadCreator], 
      ResolveFunctionReturnType[TFulfillMetaCreator], 
      ResolveFunctionArg1Type[TFulfillPayloadCreator], 
      ResolveFunctionArg2Type[TFulfillPayloadCreator], 
      ResolveFunctionArg3Type[TFulfillPayloadCreator], 
      ResolveFunctionArg4Type[TFulfillPayloadCreator]
    ]
  ] = js.native
  @JSImport("redux-saga-routines", "createRoutine")
  @js.native
  def createRoutine_PayloadMetaArg1[Payload, Meta, Arg1](
    typePrefix: String,
    payloadCreator: ActionFunction1[Arg1, Payload],
    metaCreator: ActionFunction1[Arg1, Meta]
  ): UnifiedRoutine[ActionFunction1[Arg1, ActionMeta[Payload, Meta]]] = js.native
  
  @JSImport("redux-saga-routines", "promisifyRoutine")
  @js.native
  def promisifyRoutine(
    routine: Routine[
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _]
    ]
  ): PromiseCreator[js.Object] = js.native
  
  @JSImport("redux-saga-routines", "routinePromiseWatcherSaga")
  @js.native
  def routinePromiseWatcherSaga(): IterableIterator[_] = js.native
  
  type ActionCreatorFunction[Payload, Meta] = ActionFunctionAny[Action[Payload] | (ActionMeta[Payload, Meta])]
  
  type BoundPromiseCreator[TPayload] = js.Function1[/* payload */ TPayload, js.Thenable[js.Any]]
  
  type PromiseCreator[TPayload] = js.Function2[/* payload */ TPayload, /* dispatch */ Dispatch[AnyAction], js.Thenable[js.Any]]
  
  @js.native
  trait ReduxFormPayload[TFormData, TProps] extends StObject {
    
    var props: TProps = js.native
    
    var values: TFormData = js.native
  }
  object ReduxFormPayload {
    
    @scala.inline
    def apply[TFormData, TProps](props: TProps, values: TFormData): ReduxFormPayload[TFormData, TProps] = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReduxFormPayload[TFormData, TProps]]
    }
    
    @scala.inline
    implicit class ReduxFormPayloadMutableBuilder[Self <: ReduxFormPayload[_, _], TFormData, TProps] (val x: Self with (ReduxFormPayload[TFormData, TProps])) extends AnyVal {
      
      @scala.inline
      def setProps(value: TProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: TFormData): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  type ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4] = (ActionFunctionAny[ActionMeta[js.Any, TMeta]]) | (ActionFunction4[TArg1, TArg2, TArg3, TArg4, ActionMeta[js.Any, TMeta]]) | (ActionFunction3[TArg1, TArg2, TArg3, ActionMeta[js.Any, TMeta]]) | (ActionFunction2[TArg1, TArg2, ActionMeta[js.Any, TMeta]]) | (ActionFunction1[TArg1, ActionMeta[js.Any, TMeta]]) | (ActionFunction0[ActionMeta[js.Any, TMeta]])
  
  type ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4] = ActionFunctionAny[Action[TPayload]] | (ActionFunction4[TArg1, TArg2, TArg3, TArg4, Action[TPayload]]) | (ActionFunction3[TArg1, TArg2, TArg3, Action[TPayload]]) | (ActionFunction2[TArg1, TArg2, Action[TPayload]]) | (ActionFunction1[TArg1, Action[TPayload]]) | ActionFunction0[Action[TPayload]]
  
  type ResolveActionCreatorByPayloadMeta[TPayloadCreator, TMetaCreator, TPayload, TMeta, TArg1, TArg2, TArg3, TArg4] = (ActionFunctionAny[ActionMeta[TPayload, TMeta]]) | (ActionFunction4[TArg1, TArg2, TArg3, TArg4, ActionMeta[TPayload, TMeta]]) | (ActionFunction3[TArg1, TArg2, TArg3, ActionMeta[TPayload, TMeta]]) | (ActionFunction2[TArg1, TArg2, ActionMeta[TPayload, TMeta]]) | (ActionFunction1[TArg1, ActionMeta[TPayload, TMeta]]) | (ActionFunction0[ActionMeta[TPayload, TMeta]])
  
  type ResolveFunctionArg1Type[TFunction] = js.UndefOr[scala.Nothing]
  
  type ResolveFunctionArg2Type[TFunction] = js.UndefOr[scala.Nothing]
  
  type ResolveFunctionArg3Type[TFunction] = js.UndefOr[scala.Nothing]
  
  type ResolveFunctionArg4Type[TFunction] = js.UndefOr[scala.Nothing]
  
  type ResolveFunctionReturnType[TFunction] = js.UndefOr[scala.Nothing]
  
  type Routine[TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator] = TTriggerActionCreator with keyinRoutineStagesstring with (Failure[
    TTriggerActionCreator, 
    TRequestActionCreator, 
    TSuccessActionCreator, 
    TFailureActionCreator, 
    TFulfillActionCreator
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typings.reduxSagaRoutines.reduxSagaRoutinesStrings.TRIGGER
    - typings.reduxSagaRoutines.reduxSagaRoutinesStrings.REQUEST
    - typings.reduxSagaRoutines.reduxSagaRoutinesStrings.SUCCESS
    - typings.reduxSagaRoutines.reduxSagaRoutinesStrings.FAILURE
    - typings.reduxSagaRoutines.reduxSagaRoutinesStrings.FULFILL
  */
  trait RoutineStages extends StObject
  object RoutineStages {
    
    @scala.inline
    def FAILURE: typings.reduxSagaRoutines.reduxSagaRoutinesStrings.FAILURE = "FAILURE".asInstanceOf[typings.reduxSagaRoutines.reduxSagaRoutinesStrings.FAILURE]
    
    @scala.inline
    def FULFILL: typings.reduxSagaRoutines.reduxSagaRoutinesStrings.FULFILL = "FULFILL".asInstanceOf[typings.reduxSagaRoutines.reduxSagaRoutinesStrings.FULFILL]
    
    @scala.inline
    def REQUEST: typings.reduxSagaRoutines.reduxSagaRoutinesStrings.REQUEST = "REQUEST".asInstanceOf[typings.reduxSagaRoutines.reduxSagaRoutinesStrings.REQUEST]
    
    @scala.inline
    def SUCCESS: typings.reduxSagaRoutines.reduxSagaRoutinesStrings.SUCCESS = "SUCCESS".asInstanceOf[typings.reduxSagaRoutines.reduxSagaRoutinesStrings.SUCCESS]
    
    @scala.inline
    def TRIGGER: typings.reduxSagaRoutines.reduxSagaRoutinesStrings.TRIGGER = "TRIGGER".asInstanceOf[typings.reduxSagaRoutines.reduxSagaRoutinesStrings.TRIGGER]
  }
  
  type UnifiedRoutine[TActionCreator] = Routine[TActionCreator, TActionCreator, TActionCreator, TActionCreator, TActionCreator]
}
