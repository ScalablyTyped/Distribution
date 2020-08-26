package typings.reduxSagaRoutines.mod

import typings.reduxActions.mod.Action
import typings.reduxActions.mod.ActionFunction0
import typings.reduxActions.mod.ActionFunction1
import typings.reduxActions.mod.ActionFunction2
import typings.reduxActions.mod.ActionFunction3
import typings.reduxActions.mod.ActionFunction4
import typings.reduxActions.mod.ActionFunctionAny
import typings.reduxActions.mod.ActionMeta
import typings.reduxSagaRoutines.anon.FAILURE_
import typings.reduxSagaRoutines.anon.FULFILL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-saga-routines", "createRoutine")
@js.native
object createRoutine extends js.Object {
  def apply[Payload](typePrefix: String): UnifiedRoutine[js.Function1[/* payload */ js.UndefOr[Payload], Action[js.UndefOr[Payload]]]] = js.native
  def apply[Meta](
    typePrefix: String,
    payloadCreator: js.UndefOr[scala.Nothing],
    metaCreator: ActionFunctionAny[Meta]
  ): UnifiedRoutine[js.Function1[/* payload */ js.UndefOr[_], ActionMeta[_, Meta]]] = js.native
  def apply[Meta](typePrefix: String, payloadCreator: Null, metaCreator: ActionFunctionAny[Meta]): UnifiedRoutine[js.Function1[/* payload */ js.UndefOr[_], ActionMeta[_, Meta]]] = js.native
  def apply[Payload](typePrefix: String, payloadCreator: ActionFunction0[Payload]): UnifiedRoutine[ActionFunction0[Action[Payload]]] = js.native
  def apply[Payload, Arg1](typePrefix: String, payloadCreator: ActionFunction1[Arg1, Payload]): UnifiedRoutine[ActionFunction1[Arg1, Action[Payload]]] = js.native
  def apply[Payload, Meta](
    typePrefix: String,
    payloadCreator: ActionFunctionAny[Payload],
    metaCreator: ActionFunctionAny[Meta]
  ): UnifiedRoutine[ActionFunctionAny[ActionMeta[Payload, Meta]]] = js.native
  def apply[Payload, Arg1, Arg2](typePrefix: String, payloadCreator: ActionFunction2[Arg1, Arg2, Payload]): UnifiedRoutine[ActionFunction2[Arg1, Arg2, Action[Payload]]] = js.native
  def apply[Payload, Meta, Arg1, Arg2](
    typePrefix: String,
    payloadCreator: ActionFunction2[Arg1, Arg2, Payload],
    metaCreator: ActionFunction2[Arg1, Arg2, Meta]
  ): UnifiedRoutine[ActionFunction2[Arg1, Arg2, ActionMeta[Payload, Meta]]] = js.native
  def apply[Payload, Arg1, Arg2, Arg3](typePrefix: String, payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload]): UnifiedRoutine[ActionFunction3[Arg1, Arg2, Arg3, Action[Payload]]] = js.native
  def apply[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](
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
  def apply[TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](
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
  def apply[Payload, Meta, Arg1, Arg2, Arg3](
    typePrefix: String,
    payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload],
    metaCreator: ActionFunction3[Arg1, Arg2, Arg3, Meta]
  ): UnifiedRoutine[ActionFunction3[Arg1, Arg2, Arg3, ActionMeta[Payload, Meta]]] = js.native
  def apply[Payload, Arg1, Arg2, Arg3, Arg4](typePrefix: String, payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload]): UnifiedRoutine[ActionFunction4[Arg1, Arg2, Arg3, Arg4, Action[Payload]]] = js.native
  def apply[TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator](
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
  def apply[Payload, Meta, Arg1, Arg2, Arg3, Arg4](
    typePrefix: String,
    payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload],
    metaCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Meta]
  ): UnifiedRoutine[ActionFunction4[Arg1, Arg2, Arg3, Arg4, ActionMeta[Payload, Meta]]] = js.native
  def apply[TTriggerPayloadCreator, TRequestPayloadCreator, TSuccessPayloadCreator, TFailurePayloadCreator, TFulfillPayloadCreator, TTriggerMetaCreator, TRequestMetaCreator, TSuccessMetaCreator, TFailureMetaCreator, TFulfillMetaCreator](
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
}

