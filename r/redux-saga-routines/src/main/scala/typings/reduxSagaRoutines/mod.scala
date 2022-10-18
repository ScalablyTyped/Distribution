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
import typings.reduxForm.libReduxFormMod.FormSubmitHandler
import typings.reduxSagaRoutines.anon.FAILURE_
import typings.reduxSagaRoutines.anon.FULFILL
import typings.reduxSagaRoutines.anon.Failure
import typings.reduxSagaRoutines.anon.keyinRoutineStagesstring
import typings.std.IterableIterator
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-saga-routines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-saga-routines", "ROUTINE_PROMISE_ACTION")
  @js.native
  val ROUTINE_PROMISE_ACTION: String = js.native
  
  inline def bindPromiseCreators(promiseCreators: NumberDictionary[PromiseCreator[js.Object]], dispatch: Dispatch[AnyAction]): NumberDictionary[BoundPromiseCreator[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindPromiseCreators")(promiseCreators.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[NumberDictionary[BoundPromiseCreator[js.Object]]]
  inline def bindPromiseCreators(promiseCreators: StringDictionary[PromiseCreator[js.Object]], dispatch: Dispatch[AnyAction]): StringDictionary[BoundPromiseCreator[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindPromiseCreators")(promiseCreators.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[BoundPromiseCreator[js.Object]]]
  inline def bindPromiseCreators[TPayload](promiseCreator: PromiseCreator[TPayload], dispatch: Dispatch[AnyAction]): BoundPromiseCreator[TPayload] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindPromiseCreators")(promiseCreator.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[BoundPromiseCreator[TPayload]]
  
  inline def bindRoutineToReduxForm[TFormData, TProps](
    routine: Routine[
      ActionFunction1[
        ReduxFormPayload[TFormData, TProps], 
        (Action[ReduxFormPayload[TFormData, TProps]]) | (ActionMeta[ReduxFormPayload[TFormData, TProps], Any])
      ], 
      ActionCreatorFunction[Any, Any], 
      ActionCreatorFunction[Any, Any], 
      ActionCreatorFunction[Any, Any], 
      ActionCreatorFunction[Any, Any]
    ]
  ): FormSubmitHandler[TFormData, TProps, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindRoutineToReduxForm")(routine.asInstanceOf[js.Any]).asInstanceOf[FormSubmitHandler[TFormData, TProps, String]]
  inline def bindRoutineToReduxForm[TFormData, TProps](
    routine: Routine[
      ActionFunction1[
        ReduxFormPayload[TFormData, TProps], 
        (Action[ReduxFormPayload[TFormData, TProps]]) | (ActionMeta[ReduxFormPayload[TFormData, TProps], Any])
      ], 
      ActionCreatorFunction[Any, Any], 
      ActionCreatorFunction[Any, Any], 
      ActionCreatorFunction[Any, Any], 
      ActionCreatorFunction[Any, Any]
    ],
    noSuccessPayload: Boolean
  ): FormSubmitHandler[TFormData, TProps, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindRoutineToReduxForm")(routine.asInstanceOf[js.Any], noSuccessPayload.asInstanceOf[js.Any])).asInstanceOf[FormSubmitHandler[TFormData, TProps, String]]
  
  inline def createRoutine[Payload](typePrefix: String): UnifiedRoutine[js.Function1[/* payload */ js.UndefOr[Payload], Action[js.UndefOr[Payload]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoutine")(typePrefix.asInstanceOf[js.Any]).asInstanceOf[UnifiedRoutine[js.Function1[/* payload */ js.UndefOr[Payload], Action[js.UndefOr[Payload]]]]]
  inline def createRoutine[Meta](typePrefix: String, payloadCreator: Null, metaCreator: ActionFunctionAny[Meta]): UnifiedRoutine[js.Function1[/* payload */ js.UndefOr[Any], ActionMeta[Any, Meta]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutine")(typePrefix.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[UnifiedRoutine[js.Function1[/* payload */ js.UndefOr[Any], ActionMeta[Any, Meta]]]]
  inline def createRoutine[Meta](typePrefix: String, payloadCreator: Unit, metaCreator: ActionFunctionAny[Meta]): UnifiedRoutine[js.Function1[/* payload */ js.UndefOr[Any], ActionMeta[Any, Meta]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutine")(typePrefix.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[UnifiedRoutine[js.Function1[/* payload */ js.UndefOr[Any], ActionMeta[Any, Meta]]]]
  inline def createRoutine[Payload](typePrefix: String, payloadCreator: ActionFunction0[Payload]): UnifiedRoutine[ActionFunction0[Action[Payload]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutine")(typePrefix.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[UnifiedRoutine[ActionFunction0[Action[Payload]]]]
  inline def createRoutine[Payload, Arg1](typePrefix: String, payloadCreator: ActionFunction1[Arg1, Payload]): UnifiedRoutine[ActionFunction1[Arg1, Action[Payload]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutine")(typePrefix.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[UnifiedRoutine[ActionFunction1[Arg1, Action[Payload]]]]
  inline def createRoutine[Payload, Meta](
    typePrefix: String,
    payloadCreator: ActionFunctionAny[Payload],
    metaCreator: ActionFunctionAny[Meta]
  ): UnifiedRoutine[ActionFunctionAny[ActionMeta[Payload, Meta]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutine")(typePrefix.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[UnifiedRoutine[ActionFunctionAny[ActionMeta[Payload, Meta]]]]
  inline def createRoutine[Payload, Meta, Arg1](
    typePrefix: String,
    payloadCreator: ActionFunction1[Arg1, Payload],
    metaCreator: ActionFunction1[Arg1, Meta]
  ): UnifiedRoutine[ActionFunction1[Arg1, ActionMeta[Payload, Meta]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutine")(typePrefix.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[UnifiedRoutine[ActionFunction1[Arg1, ActionMeta[Payload, Meta]]]]
  inline def createRoutine[Payload, Arg1, Arg2](typePrefix: String, payloadCreator: ActionFunction2[Arg1, Arg2, Payload]): UnifiedRoutine[ActionFunction2[Arg1, Arg2, Action[Payload]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutine")(typePrefix.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[UnifiedRoutine[ActionFunction2[Arg1, Arg2, Action[Payload]]]]
  inline def createRoutine[Payload, Meta, Arg1, Arg2](
    typePrefix: String,
    payloadCreator: ActionFunction2[Arg1, Arg2, Payload],
    metaCreator: ActionFunction2[Arg1, Arg2, Meta]
  ): UnifiedRoutine[ActionFunction2[Arg1, Arg2, ActionMeta[Payload, Meta]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutine")(typePrefix.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[UnifiedRoutine[ActionFunction2[Arg1, Arg2, ActionMeta[Payload, Meta]]]]
  inline def createRoutine[Payload, Arg1, Arg2, Arg3](typePrefix: String, payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload]): UnifiedRoutine[ActionFunction3[Arg1, Arg2, Arg3, Action[Payload]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutine")(typePrefix.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[UnifiedRoutine[ActionFunction3[Arg1, Arg2, Arg3, Action[Payload]]]]
  inline def createRoutine[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutine")(typePrefix.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[Routine[
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
  ]]
  inline def createRoutine[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](
    typePrefix: String,
    payloadCreator: Unit,
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutine")(typePrefix.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[Routine[
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
  ]]
  inline def createRoutine[Payload, Meta, Arg1, Arg2, Arg3](
    typePrefix: String,
    payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload],
    metaCreator: ActionFunction3[Arg1, Arg2, Arg3, Meta]
  ): UnifiedRoutine[ActionFunction3[Arg1, Arg2, Arg3, ActionMeta[Payload, Meta]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutine")(typePrefix.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[UnifiedRoutine[ActionFunction3[Arg1, Arg2, Arg3, ActionMeta[Payload, Meta]]]]
  inline def createRoutine[Payload, Arg1, Arg2, Arg3, Arg4](typePrefix: String, payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload]): UnifiedRoutine[ActionFunction4[Arg1, Arg2, Arg3, Arg4, Action[Payload]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutine")(typePrefix.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[UnifiedRoutine[ActionFunction4[Arg1, Arg2, Arg3, Arg4, Action[Payload]]]]
  inline def createRoutine[TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator](
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutine")(typePrefix.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any])).asInstanceOf[Routine[
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
  ]]
  inline def createRoutine[Payload, Meta, Arg1, Arg2, Arg3, Arg4](
    typePrefix: String,
    payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload],
    metaCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Meta]
  ): UnifiedRoutine[ActionFunction4[Arg1, Arg2, Arg3, Arg4, ActionMeta[Payload, Meta]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutine")(typePrefix.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[UnifiedRoutine[ActionFunction4[Arg1, Arg2, Arg3, Arg4, ActionMeta[Payload, Meta]]]]
  inline def createRoutine[TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator, TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutine")(typePrefix.asInstanceOf[js.Any], payloadCreator.asInstanceOf[js.Any], metaCreator.asInstanceOf[js.Any])).asInstanceOf[Routine[
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
  ]]
  
  inline def promisifyRoutine[TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator](
    routine: Routine[
      TTriggerActionCreator, 
      TRequestActionCreator, 
      // tslint:disable-line: no-unnecessary-generics
  TSuccessActionCreator, 
      // tslint:disable-line: no-unnecessary-generics
  TFailureActionCreator, 
      // tslint:disable-line: no-unnecessary-generics
  TFulfillActionCreator
    ]
  ): PromiseCreator[ResolvePayloadByActionCreator[TTriggerActionCreator]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promisifyRoutine")(routine.asInstanceOf[js.Any]).asInstanceOf[PromiseCreator[ResolvePayloadByActionCreator[TTriggerActionCreator]]]
  
  inline def routinePromiseWatcherSaga(): IterableIterator[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("routinePromiseWatcherSaga")().asInstanceOf[IterableIterator[Any]]
  
  type ActionCreatorFunction[Payload, Meta] = ActionFunctionAny[Action[Payload] | (ActionMeta[Payload, Meta])]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {  _ :{}} extends {  _ :TPayload} ? (payload : TPayload | undefined): std.PromiseLike<any> : (payload : TPayload): std.PromiseLike<any>
    }}}
    */
  @js.native
  trait BoundPromiseCreator[TPayload] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {  _ :{}} extends {  _ :TPayload} ? {} | undefined : TPayload
    }}}
    */
  @js.native
  trait PayloadTypeOrUndefinable[TPayload] extends StObject
  
  type PromiseCreator[TPayload] = js.Function2[
    /* payload */ PayloadTypeOrUndefinable[TPayload], 
    /* dispatch */ Dispatch[AnyAction], 
    PromiseLike[Any]
  ]
  
  trait ReduxFormPayload[TFormData, TProps] extends StObject {
    
    var props: TProps
    
    var values: TFormData
  }
  object ReduxFormPayload {
    
    inline def apply[TFormData, TProps](props: TProps, values: TFormData): ReduxFormPayload[TFormData, TProps] = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReduxFormPayload[TFormData, TProps]]
    }
    
    extension [Self <: ReduxFormPayload[?, ?], TFormData, TProps](x: Self & (ReduxFormPayload[TFormData, TProps])) {
      
      inline def setProps(value: TProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setValues(value: TFormData): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TMetaCreator extends redux-actions.redux-actions.ActionFunction0<TMeta> ? redux-actions.redux-actions.ActionFunction0<redux-actions.redux-actions.ActionMeta<any, TMeta>> : TMetaCreator extends redux-actions.redux-actions.ActionFunction1<TArg1, TMeta> ? redux-actions.redux-actions.ActionFunction1<TArg1, redux-actions.redux-actions.ActionMeta<any, TMeta>> : TMetaCreator extends redux-actions.redux-actions.ActionFunction2<TArg1, TArg2, TMeta> ? redux-actions.redux-actions.ActionFunction2<TArg1, TArg2, redux-actions.redux-actions.ActionMeta<any, TMeta>> : TMetaCreator extends redux-actions.redux-actions.ActionFunction3<TArg1, TArg2, TArg3, TMeta> ? redux-actions.redux-actions.ActionFunction3<TArg1, TArg2, TArg3, redux-actions.redux-actions.ActionMeta<any, TMeta>> : TMetaCreator extends redux-actions.redux-actions.ActionFunction4<TArg1, TArg2, TArg3, TArg4, TMeta> ? redux-actions.redux-actions.ActionFunction4<TArg1, TArg2, TArg3, TArg4, redux-actions.redux-actions.ActionMeta<any, TMeta>> : redux-actions.redux-actions.ActionFunctionAny<redux-actions.redux-actions.ActionMeta<any, TMeta>>
    }}}
    */
  @js.native
  trait ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TPayloadCreator extends redux-actions.redux-actions.ActionFunction0<TPayload> ? redux-actions.redux-actions.ActionFunction0<redux-actions.redux-actions.Action<TPayload>> : TPayloadCreator extends redux-actions.redux-actions.ActionFunction1<TArg1, TPayload> ? redux-actions.redux-actions.ActionFunction1<TArg1, redux-actions.redux-actions.Action<TPayload>> : TPayloadCreator extends redux-actions.redux-actions.ActionFunction2<TArg1, TArg2, TPayload> ? redux-actions.redux-actions.ActionFunction2<TArg1, TArg2, redux-actions.redux-actions.Action<TPayload>> : TPayloadCreator extends redux-actions.redux-actions.ActionFunction3<TArg1, TArg2, TArg3, TPayload> ? redux-actions.redux-actions.ActionFunction3<TArg1, TArg2, TArg3, redux-actions.redux-actions.Action<TPayload>> : TPayloadCreator extends redux-actions.redux-actions.ActionFunction4<TArg1, TArg2, TArg3, TArg4, TPayload> ? redux-actions.redux-actions.ActionFunction4<TArg1, TArg2, TArg3, TArg4, redux-actions.redux-actions.Action<TPayload>> : redux-actions.redux-actions.ActionFunctionAny<redux-actions.redux-actions.Action<TPayload>>
    }}}
    */
  @js.native
  trait ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TMetaCreator extends redux-actions.redux-actions.ActionFunction0<TMeta> ? redux-actions.redux-actions.ActionFunction0<redux-actions.redux-actions.ActionMeta<TPayload, TMeta>> : TMetaCreator extends redux-actions.redux-actions.ActionFunction1<TArg1, TMeta> ? redux-actions.redux-actions.ActionFunction1<TArg1, redux-actions.redux-actions.ActionMeta<TPayload, TMeta>> : TMetaCreator extends redux-actions.redux-actions.ActionFunction2<TArg1, TArg2, TMeta> ? redux-actions.redux-actions.ActionFunction2<TArg1, TArg2, redux-actions.redux-actions.ActionMeta<TPayload, TMeta>> : TMetaCreator extends redux-actions.redux-actions.ActionFunction3<TArg1, TArg2, TArg3, TMeta> ? redux-actions.redux-actions.ActionFunction3<TArg1, TArg2, TArg3, redux-actions.redux-actions.ActionMeta<TPayload, TMeta>> : TMetaCreator extends redux-actions.redux-actions.ActionFunction4<TArg1, TArg2, TArg3, TArg4, TMeta> ? redux-actions.redux-actions.ActionFunction4<TArg1, TArg2, TArg3, TArg4, redux-actions.redux-actions.ActionMeta<TPayload, TMeta>> : redux-actions.redux-actions.ActionFunctionAny<redux-actions.redux-actions.ActionMeta<TPayload, TMeta>>
    }}}
    */
  @js.native
  trait ResolveActionCreatorByPayloadMeta[TPayloadCreator, TMetaCreator, TPayload, TMeta, TArg1, TArg2, TArg3, TArg4] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TFunction extends (arg1 : infer TArg1, args : ...any): any ? TArg1 : undefined
    }}}
    */
  @js.native
  trait ResolveFunctionArg1Type[TFunction] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TFunction extends (arg1 : any, arg2 : infer TArg1, args : ...any): any ? TArg1 : undefined
    }}}
    */
  @js.native
  trait ResolveFunctionArg2Type[TFunction] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TFunction extends (arg1 : any, arg2 : any, arg3 : infer TArg1, args : ...any): any ? TArg1 : undefined
    }}}
    */
  @js.native
  trait ResolveFunctionArg3Type[TFunction] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TFunction extends (arg1 : any, arg2 : any, arg3 : any, arg4 : infer TArg1, args : ...any): any ? TArg1 : undefined
    }}}
    */
  @js.native
  trait ResolveFunctionArg4Type[TFunction] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TFunction extends (args : ...any): infer TReturn ? TReturn : undefined
    }}}
    */
  @js.native
  trait ResolveFunctionReturnType[TFunction] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TActionCreator extends (args : ...any): redux-actions.redux-actions.Action<infer TPayload> ? TPayload : undefined
    }}}
    */
  @js.native
  trait ResolvePayloadByActionCreator[TActionCreator] extends StObject
  
  type Routine[TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator] = TTriggerActionCreator & keyinRoutineStagesstring & (Failure[
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
    
    inline def FAILURE: typings.reduxSagaRoutines.reduxSagaRoutinesStrings.FAILURE = "FAILURE".asInstanceOf[typings.reduxSagaRoutines.reduxSagaRoutinesStrings.FAILURE]
    
    inline def FULFILL: typings.reduxSagaRoutines.reduxSagaRoutinesStrings.FULFILL = "FULFILL".asInstanceOf[typings.reduxSagaRoutines.reduxSagaRoutinesStrings.FULFILL]
    
    inline def REQUEST: typings.reduxSagaRoutines.reduxSagaRoutinesStrings.REQUEST = "REQUEST".asInstanceOf[typings.reduxSagaRoutines.reduxSagaRoutinesStrings.REQUEST]
    
    inline def SUCCESS: typings.reduxSagaRoutines.reduxSagaRoutinesStrings.SUCCESS = "SUCCESS".asInstanceOf[typings.reduxSagaRoutines.reduxSagaRoutinesStrings.SUCCESS]
    
    inline def TRIGGER: typings.reduxSagaRoutines.reduxSagaRoutinesStrings.TRIGGER = "TRIGGER".asInstanceOf[typings.reduxSagaRoutines.reduxSagaRoutinesStrings.TRIGGER]
  }
  
  type UnifiedRoutine[TActionCreator] = Routine[TActionCreator, TActionCreator, TActionCreator, TActionCreator, TActionCreator]
}
