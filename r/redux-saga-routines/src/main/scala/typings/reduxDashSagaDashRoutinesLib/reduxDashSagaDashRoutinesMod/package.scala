package typings
package reduxDashSagaDashRoutinesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashSagaDashRoutinesMod {
  type ActionCreatorFunction[Payload, Meta] = reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[
    reduxDashActionsLib.reduxDashActionsMod.Action[Payload] | (reduxDashActionsLib.reduxDashActionsMod.ActionMeta[Payload, Meta])
  ]
  type BoundPromiseCreator[TPayload] = js.Function1[/* payload */ TPayload, js.Thenable[js.Any]]
  type PromiseCreator[TPayload] = js.Function2[
    /* payload */ TPayload, 
    /* dispatch */ reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction], 
    js.Thenable[js.Any]
  ]
  type ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4] = (reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[reduxDashActionsLib.reduxDashActionsMod.ActionMeta[js.Any, TMeta]]) | (reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[
    TArg1, 
    TArg2, 
    TArg3, 
    TArg4, 
    reduxDashActionsLib.reduxDashActionsMod.ActionMeta[js.Any, TMeta]
  ]) | (reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[TArg1, TArg2, TArg3, reduxDashActionsLib.reduxDashActionsMod.ActionMeta[js.Any, TMeta]]) | (reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[TArg1, TArg2, reduxDashActionsLib.reduxDashActionsMod.ActionMeta[js.Any, TMeta]]) | (reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[TArg1, reduxDashActionsLib.reduxDashActionsMod.ActionMeta[js.Any, TMeta]]) | (reduxDashActionsLib.reduxDashActionsMod.ActionFunction0[reduxDashActionsLib.reduxDashActionsMod.ActionMeta[js.Any, TMeta]])
  type ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4] = reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[reduxDashActionsLib.reduxDashActionsMod.Action[TPayload]] | (reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[TArg1, TArg2, TArg3, TArg4, reduxDashActionsLib.reduxDashActionsMod.Action[TPayload]]) | (reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[TArg1, TArg2, TArg3, reduxDashActionsLib.reduxDashActionsMod.Action[TPayload]]) | (reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[TArg1, TArg2, reduxDashActionsLib.reduxDashActionsMod.Action[TPayload]]) | (reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[TArg1, reduxDashActionsLib.reduxDashActionsMod.Action[TPayload]]) | reduxDashActionsLib.reduxDashActionsMod.ActionFunction0[reduxDashActionsLib.reduxDashActionsMod.Action[TPayload]]
  type ResolveActionCreatorByPayloadMeta[TPayloadCreator, TMetaCreator, TPayload, TMeta, TArg1, TArg2, TArg3, TArg4] = (reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[reduxDashActionsLib.reduxDashActionsMod.ActionMeta[TPayload, TMeta]]) | (reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[
    TArg1, 
    TArg2, 
    TArg3, 
    TArg4, 
    reduxDashActionsLib.reduxDashActionsMod.ActionMeta[TPayload, TMeta]
  ]) | (reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[
    TArg1, 
    TArg2, 
    TArg3, 
    reduxDashActionsLib.reduxDashActionsMod.ActionMeta[TPayload, TMeta]
  ]) | (reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[TArg1, TArg2, reduxDashActionsLib.reduxDashActionsMod.ActionMeta[TPayload, TMeta]]) | (reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[TArg1, reduxDashActionsLib.reduxDashActionsMod.ActionMeta[TPayload, TMeta]]) | (reduxDashActionsLib.reduxDashActionsMod.ActionFunction0[reduxDashActionsLib.reduxDashActionsMod.ActionMeta[TPayload, TMeta]])
  type ResolveFunctionArg1Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionArg2Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionArg3Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionArg4Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionReturnType[TFunction] = js.UndefOr[scala.Nothing]
  type Routine[TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator] = TTriggerActionCreator with reduxDashSagaDashRoutinesLib.reduxDashSagaDashRoutinesLibStrings.Routine with js.Any with (reduxDashSagaDashRoutinesLib.Anon_Failure[
    TFulfillActionCreator, 
    TFailureActionCreator, 
    TRequestActionCreator, 
    TTriggerActionCreator, 
    TSuccessActionCreator
  ])
  type UnifiedRoutine[TActionCreator] = Routine[TActionCreator, TActionCreator, TActionCreator, TActionCreator, TActionCreator]
}
