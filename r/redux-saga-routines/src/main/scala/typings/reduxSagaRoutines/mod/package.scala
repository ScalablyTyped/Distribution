package typings.reduxSagaRoutines

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionCreatorFunction[Payload, Meta] = typings.reduxActions.mod.ActionFunctionAny[
    typings.reduxActions.mod.Action[Payload] | (typings.reduxActions.mod.ActionMeta[Payload, Meta])
  ]
  type BoundPromiseCreator[TPayload] = js.Function1[/* payload */ TPayload, js.Thenable[js.Any]]
  type PromiseCreator[TPayload] = js.Function2[
    /* payload */ TPayload, 
    /* dispatch */ typings.redux.mod.Dispatch[typings.redux.mod.AnyAction], 
    js.Thenable[js.Any]
  ]
  type ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4] = (typings.reduxActions.mod.ActionFunctionAny[typings.reduxActions.mod.ActionMeta[js.Any, TMeta]]) | (typings.reduxActions.mod.ActionFunction4[TArg1, TArg2, TArg3, TArg4, typings.reduxActions.mod.ActionMeta[js.Any, TMeta]]) | (typings.reduxActions.mod.ActionFunction3[TArg1, TArg2, TArg3, typings.reduxActions.mod.ActionMeta[js.Any, TMeta]]) | (typings.reduxActions.mod.ActionFunction2[TArg1, TArg2, typings.reduxActions.mod.ActionMeta[js.Any, TMeta]]) | (typings.reduxActions.mod.ActionFunction1[TArg1, typings.reduxActions.mod.ActionMeta[js.Any, TMeta]]) | (typings.reduxActions.mod.ActionFunction0[typings.reduxActions.mod.ActionMeta[js.Any, TMeta]])
  type ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4] = typings.reduxActions.mod.ActionFunctionAny[typings.reduxActions.mod.Action[TPayload]] | (typings.reduxActions.mod.ActionFunction4[TArg1, TArg2, TArg3, TArg4, typings.reduxActions.mod.Action[TPayload]]) | (typings.reduxActions.mod.ActionFunction3[TArg1, TArg2, TArg3, typings.reduxActions.mod.Action[TPayload]]) | (typings.reduxActions.mod.ActionFunction2[TArg1, TArg2, typings.reduxActions.mod.Action[TPayload]]) | (typings.reduxActions.mod.ActionFunction1[TArg1, typings.reduxActions.mod.Action[TPayload]]) | typings.reduxActions.mod.ActionFunction0[typings.reduxActions.mod.Action[TPayload]]
  type ResolveActionCreatorByPayloadMeta[TPayloadCreator, TMetaCreator, TPayload, TMeta, TArg1, TArg2, TArg3, TArg4] = (typings.reduxActions.mod.ActionFunctionAny[typings.reduxActions.mod.ActionMeta[TPayload, TMeta]]) | (typings.reduxActions.mod.ActionFunction4[TArg1, TArg2, TArg3, TArg4, typings.reduxActions.mod.ActionMeta[TPayload, TMeta]]) | (typings.reduxActions.mod.ActionFunction3[TArg1, TArg2, TArg3, typings.reduxActions.mod.ActionMeta[TPayload, TMeta]]) | (typings.reduxActions.mod.ActionFunction2[TArg1, TArg2, typings.reduxActions.mod.ActionMeta[TPayload, TMeta]]) | (typings.reduxActions.mod.ActionFunction1[TArg1, typings.reduxActions.mod.ActionMeta[TPayload, TMeta]]) | (typings.reduxActions.mod.ActionFunction0[typings.reduxActions.mod.ActionMeta[TPayload, TMeta]])
  type ResolveFunctionArg1Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionArg2Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionArg3Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionArg4Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionReturnType[TFunction] = js.UndefOr[scala.Nothing]
  type Routine[TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator] = TTriggerActionCreator with typings.reduxSagaRoutines.anon.keyinRoutineStagesstring with (typings.reduxSagaRoutines.anon.Failure[
    TTriggerActionCreator, 
    TRequestActionCreator, 
    TSuccessActionCreator, 
    TFailureActionCreator, 
    TFulfillActionCreator
  ])
  type UnifiedRoutine[TActionCreator] = typings.reduxSagaRoutines.mod.Routine[TActionCreator, TActionCreator, TActionCreator, TActionCreator, TActionCreator]
}
