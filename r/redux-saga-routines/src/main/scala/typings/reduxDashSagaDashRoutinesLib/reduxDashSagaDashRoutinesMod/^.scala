package typings
package reduxDashSagaDashRoutinesLib.reduxDashSagaDashRoutinesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-saga-routines", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ROUTINE_PROMISE_ACTION: java.lang.String = js.native
  def bindPromiseCreators(
    promiseCreators: org.scalablytyped.runtime.NumberDictionary[PromiseCreator[js.Object]],
    dispatch: reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]
  ): org.scalablytyped.runtime.NumberDictionary[BoundPromiseCreator[js.Object]] = js.native
  def bindPromiseCreators(
    promiseCreators: org.scalablytyped.runtime.StringDictionary[PromiseCreator[js.Object]],
    dispatch: reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]
  ): org.scalablytyped.runtime.StringDictionary[BoundPromiseCreator[js.Object]] = js.native
  def bindPromiseCreators[TPayload](
    promiseCreator: PromiseCreator[TPayload],
    dispatch: reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]
  ): BoundPromiseCreator[TPayload] = js.native
  def bindRoutineToReduxForm[TFormData, TProps](
    routine: Routine[
      reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[
        ReduxFormPayload[TFormData, TProps], 
        (reduxDashActionsLib.reduxDashActionsMod.Action[ReduxFormPayload[TFormData, TProps]]) | (reduxDashActionsLib.reduxDashActionsMod.ActionMeta[ReduxFormPayload[TFormData, TProps], _])
      ], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _]
    ]
  ): reduxDashFormLib.libReduxFormMod.FormSubmitHandler[TFormData, TProps, java.lang.String] = js.native
  def bindRoutineToReduxForm[TFormData, TProps](
    routine: Routine[
      reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[
        ReduxFormPayload[TFormData, TProps], 
        (reduxDashActionsLib.reduxDashActionsMod.Action[ReduxFormPayload[TFormData, TProps]]) | (reduxDashActionsLib.reduxDashActionsMod.ActionMeta[ReduxFormPayload[TFormData, TProps], _])
      ], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _]
    ],
    noSuccessPayload: scala.Boolean
  ): reduxDashFormLib.libReduxFormMod.FormSubmitHandler[TFormData, TProps, java.lang.String] = js.native
  def createRoutine[Payload](typePrefix: java.lang.String): UnifiedRoutine[
    js.Function1[
      /* payload */ js.UndefOr[Payload], 
      reduxDashActionsLib.reduxDashActionsMod.Action[js.UndefOr[Payload]]
    ]
  ] = js.native
  def createRoutine[Meta](
    typePrefix: java.lang.String,
    payloadCreator: js.UndefOr[scala.Nothing],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[Meta]
  ): UnifiedRoutine[
    js.Function1[
      /* payload */ js.UndefOr[_], 
      reduxDashActionsLib.reduxDashActionsMod.ActionMeta[_, Meta]
    ]
  ] = js.native
  def createRoutine[Payload](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction0[Payload]
  ): UnifiedRoutine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction0[reduxDashActionsLib.reduxDashActionsMod.Action[Payload]]
  ] = js.native
  def createRoutine[Meta](
    typePrefix: java.lang.String,
    payloadCreator: scala.Null,
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[Meta]
  ): UnifiedRoutine[
    js.Function1[
      /* payload */ js.UndefOr[_], 
      reduxDashActionsLib.reduxDashActionsMod.ActionMeta[_, Meta]
    ]
  ] = js.native
  def createRoutine[Payload, Arg1](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[Arg1, Payload]
  ): UnifiedRoutine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[Arg1, reduxDashActionsLib.reduxDashActionsMod.Action[Payload]]
  ] = js.native
  def createRoutine[Payload, Meta](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[Payload],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[Meta]
  ): UnifiedRoutine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[reduxDashActionsLib.reduxDashActionsMod.ActionMeta[Payload, Meta]]
  ] = js.native
  def createRoutine[Payload, Arg1, Arg2](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[Arg1, Arg2, Payload]
  ): UnifiedRoutine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[Arg1, Arg2, reduxDashActionsLib.reduxDashActionsMod.Action[Payload]]
  ] = js.native
  def createRoutine[Payload, Meta, Arg1, Arg2](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[Arg1, Arg2, Payload],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[Arg1, Arg2, Meta]
  ): UnifiedRoutine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[Arg1, Arg2, reduxDashActionsLib.reduxDashActionsMod.ActionMeta[Payload, Meta]]
  ] = js.native
  def createRoutine[Payload, Arg1, Arg2, Arg3](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[Arg1, Arg2, Arg3, Payload]
  ): UnifiedRoutine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[Arg1, Arg2, Arg3, reduxDashActionsLib.reduxDashActionsMod.Action[Payload]]
  ] = js.native
  def createRoutine[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](
    typePrefix: java.lang.String,
    payloadCreator: js.UndefOr[scala.Nothing],
    metaCreator: reduxDashSagaDashRoutinesLib.Anon_FAILUREFULFILL[
      TRequestMetaCreator, 
      TFailureMetaCreator, 
      TTriggerMetaCreator, 
      TSuccessMetaCreator, 
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
  def createRoutine[Payload, Meta, Arg1, Arg2, Arg3](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[Arg1, Arg2, Arg3, Payload],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[Arg1, Arg2, Arg3, Meta]
  ): UnifiedRoutine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[Arg1, Arg2, Arg3, reduxDashActionsLib.reduxDashActionsMod.ActionMeta[Payload, Meta]]
  ] = js.native
  def createRoutine[Payload, Arg1, Arg2, Arg3, Arg4](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload]
  ): UnifiedRoutine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[Arg1, Arg2, Arg3, Arg4, reduxDashActionsLib.reduxDashActionsMod.Action[Payload]]
  ] = js.native
  def createRoutine[TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashSagaDashRoutinesLib.Anon_FAILURE[
      TRequestPayloadCreator, 
      TFailurePayloadCreator, 
      TFulfillPayloadCreator, 
      TSuccessPayloadCreator, 
      TTriggerPayloadCreator
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
  def createRoutine[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](
    typePrefix: java.lang.String,
    payloadCreator: scala.Null,
    metaCreator: reduxDashSagaDashRoutinesLib.Anon_FAILUREFULFILL[
      TRequestMetaCreator, 
      TFailureMetaCreator, 
      TTriggerMetaCreator, 
      TSuccessMetaCreator, 
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
  def createRoutine[Payload, Meta, Arg1, Arg2, Arg3, Arg4](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[Arg1, Arg2, Arg3, Arg4, Meta]
  ): UnifiedRoutine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[
      Arg1, 
      Arg2, 
      Arg3, 
      Arg4, 
      reduxDashActionsLib.reduxDashActionsMod.ActionMeta[Payload, Meta]
    ]
  ] = js.native
  def createRoutine[TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator, TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashSagaDashRoutinesLib.Anon_FAILURE[
      TRequestPayloadCreator, 
      TFailurePayloadCreator, 
      TFulfillPayloadCreator, 
      TSuccessPayloadCreator, 
      TTriggerPayloadCreator
    ],
    metaCreator: reduxDashSagaDashRoutinesLib.Anon_FAILUREFULFILL[
      TRequestMetaCreator, 
      TFailureMetaCreator, 
      TTriggerMetaCreator, 
      TSuccessMetaCreator, 
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
  @JSName("createRoutine")
  def createRoutine_PayloadMetaArg1[Payload, Meta, Arg1](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[Arg1, Payload],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[Arg1, Meta]
  ): UnifiedRoutine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[Arg1, reduxDashActionsLib.reduxDashActionsMod.ActionMeta[Payload, Meta]]
  ] = js.native
  def promisifyRoutine(
    routine: Routine[
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _]
    ]
  ): PromiseCreator[js.Object] = js.native
  def routinePromiseWatcherSaga(): stdLib.IterableIterator[_] = js.native
}

