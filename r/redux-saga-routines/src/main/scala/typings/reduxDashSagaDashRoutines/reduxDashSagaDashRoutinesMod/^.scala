package typings.reduxDashSagaDashRoutines.reduxDashSagaDashRoutinesMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.reduxDashActions.reduxDashActionsMod.Action
import typings.reduxDashActions.reduxDashActionsMod.ActionFunction0
import typings.reduxDashActions.reduxDashActionsMod.ActionFunction1
import typings.reduxDashActions.reduxDashActionsMod.ActionFunction2
import typings.reduxDashActions.reduxDashActionsMod.ActionFunction3
import typings.reduxDashActions.reduxDashActionsMod.ActionFunction4
import typings.reduxDashActions.reduxDashActionsMod.ActionFunctionAny
import typings.reduxDashActions.reduxDashActionsMod.ActionMeta
import typings.reduxDashForm.libReduxFormMod.FormSubmitHandler
import typings.reduxDashSagaDashRoutines.Anon_FAILURE
import typings.reduxDashSagaDashRoutines.Anon_FAILUREFULFILL
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-saga-routines", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ROUTINE_PROMISE_ACTION: String = js.native
  def bindPromiseCreators(promiseCreators: NumberDictionary[PromiseCreator[js.Object]], dispatch: Dispatch[AnyAction]): NumberDictionary[BoundPromiseCreator[js.Object]] = js.native
  def bindPromiseCreators(promiseCreators: StringDictionary[PromiseCreator[js.Object]], dispatch: Dispatch[AnyAction]): StringDictionary[BoundPromiseCreator[js.Object]] = js.native
  def bindPromiseCreators[TPayload](promiseCreator: PromiseCreator[TPayload], dispatch: Dispatch[AnyAction]): BoundPromiseCreator[TPayload] = js.native
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
  def createRoutine[Payload](typePrefix: String): UnifiedRoutine[js.Function1[/* payload */ js.UndefOr[Payload], Action[js.UndefOr[Payload]]]] = js.native
  def createRoutine[Meta](
    typePrefix: String,
    payloadCreator: js.UndefOr[scala.Nothing],
    metaCreator: ActionFunctionAny[Meta]
  ): UnifiedRoutine[js.Function1[/* payload */ js.UndefOr[_], ActionMeta[_, Meta]]] = js.native
  def createRoutine[Meta](typePrefix: String, payloadCreator: Null, metaCreator: ActionFunctionAny[Meta]): UnifiedRoutine[js.Function1[/* payload */ js.UndefOr[_], ActionMeta[_, Meta]]] = js.native
  def createRoutine[Payload](typePrefix: String, payloadCreator: ActionFunction0[Payload]): UnifiedRoutine[ActionFunction0[Action[Payload]]] = js.native
  def createRoutine[Payload, Arg1](typePrefix: String, payloadCreator: ActionFunction1[Arg1, Payload]): UnifiedRoutine[ActionFunction1[Arg1, Action[Payload]]] = js.native
  def createRoutine[Payload, Meta](
    typePrefix: String,
    payloadCreator: ActionFunctionAny[Payload],
    metaCreator: ActionFunctionAny[Meta]
  ): UnifiedRoutine[ActionFunctionAny[ActionMeta[Payload, Meta]]] = js.native
  def createRoutine[Payload, Arg1, Arg2](typePrefix: String, payloadCreator: ActionFunction2[Arg1, Arg2, Payload]): UnifiedRoutine[ActionFunction2[Arg1, Arg2, Action[Payload]]] = js.native
  def createRoutine[Payload, Meta, Arg1, Arg2](
    typePrefix: String,
    payloadCreator: ActionFunction2[Arg1, Arg2, Payload],
    metaCreator: ActionFunction2[Arg1, Arg2, Meta]
  ): UnifiedRoutine[ActionFunction2[Arg1, Arg2, ActionMeta[Payload, Meta]]] = js.native
  def createRoutine[Payload, Arg1, Arg2, Arg3](typePrefix: String, payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload]): UnifiedRoutine[ActionFunction3[Arg1, Arg2, Arg3, Action[Payload]]] = js.native
  def createRoutine[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](
    typePrefix: String,
    payloadCreator: js.UndefOr[scala.Nothing],
    metaCreator: Anon_FAILUREFULFILL[
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
  def createRoutine[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](
    typePrefix: String,
    payloadCreator: Null,
    metaCreator: Anon_FAILUREFULFILL[
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
    typePrefix: String,
    payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload],
    metaCreator: ActionFunction3[Arg1, Arg2, Arg3, Meta]
  ): UnifiedRoutine[ActionFunction3[Arg1, Arg2, Arg3, ActionMeta[Payload, Meta]]] = js.native
  def createRoutine[Payload, Arg1, Arg2, Arg3, Arg4](typePrefix: String, payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload]): UnifiedRoutine[ActionFunction4[Arg1, Arg2, Arg3, Arg4, Action[Payload]]] = js.native
  def createRoutine[TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator](
    typePrefix: String,
    payloadCreator: Anon_FAILURE[
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
  def createRoutine[Payload, Meta, Arg1, Arg2, Arg3, Arg4](
    typePrefix: String,
    payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload],
    metaCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Meta]
  ): UnifiedRoutine[ActionFunction4[Arg1, Arg2, Arg3, Arg4, ActionMeta[Payload, Meta]]] = js.native
  def createRoutine[TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator, TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](
    typePrefix: String,
    payloadCreator: Anon_FAILURE[
      TRequestPayloadCreator, 
      TFailurePayloadCreator, 
      TFulfillPayloadCreator, 
      TSuccessPayloadCreator, 
      TTriggerPayloadCreator
    ],
    metaCreator: Anon_FAILUREFULFILL[
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
    typePrefix: String,
    payloadCreator: ActionFunction1[Arg1, Payload],
    metaCreator: ActionFunction1[Arg1, Meta]
  ): UnifiedRoutine[ActionFunction1[Arg1, ActionMeta[Payload, Meta]]] = js.native
  def promisifyRoutine(
    routine: Routine[
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _], 
      ActionCreatorFunction[_, _]
    ]
  ): PromiseCreator[js.Object] = js.native
  def routinePromiseWatcherSaga(): IterableIterator[_] = js.native
}

