package typings.reduxDashSagaDashRoutines

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashSagaDashRoutinesMod {
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
  import typings.reduxDashSagaDashRoutines.Anon_Failure

  type ActionCreatorFunction[Payload, Meta] = ActionFunctionAny[Action[Payload] | (ActionMeta[Payload, Meta])]
  type BoundPromiseCreator[TPayload] = js.Function1[/* payload */ TPayload, js.Thenable[js.Any]]
  type PromiseCreator[TPayload] = js.Function2[/* payload */ TPayload, /* dispatch */ Dispatch[AnyAction], js.Thenable[js.Any]]
  type ResolveActionCreatorByMeta[TMetaCreator, TMeta, TArg1, TArg2, TArg3, TArg4] = (ActionFunctionAny[ActionMeta[js.Any, TMeta]]) | (ActionFunction4[TArg1, TArg2, TArg3, TArg4, ActionMeta[js.Any, TMeta]]) | (ActionFunction3[TArg1, TArg2, TArg3, ActionMeta[js.Any, TMeta]]) | (ActionFunction2[TArg1, TArg2, ActionMeta[js.Any, TMeta]]) | (ActionFunction1[TArg1, ActionMeta[js.Any, TMeta]]) | (ActionFunction0[ActionMeta[js.Any, TMeta]])
  type ResolveActionCreatorByPayload[TPayloadCreator, TPayload, TArg1, TArg2, TArg3, TArg4] = ActionFunctionAny[Action[TPayload]] | (ActionFunction4[TArg1, TArg2, TArg3, TArg4, Action[TPayload]]) | (ActionFunction3[TArg1, TArg2, TArg3, Action[TPayload]]) | (ActionFunction2[TArg1, TArg2, Action[TPayload]]) | (ActionFunction1[TArg1, Action[TPayload]]) | ActionFunction0[Action[TPayload]]
  type ResolveActionCreatorByPayloadMeta[TPayloadCreator, TMetaCreator, TPayload, TMeta, TArg1, TArg2, TArg3, TArg4] = (ActionFunctionAny[ActionMeta[TPayload, TMeta]]) | (ActionFunction4[TArg1, TArg2, TArg3, TArg4, ActionMeta[TPayload, TMeta]]) | (ActionFunction3[TArg1, TArg2, TArg3, ActionMeta[TPayload, TMeta]]) | (ActionFunction2[TArg1, TArg2, ActionMeta[TPayload, TMeta]]) | (ActionFunction1[TArg1, ActionMeta[TPayload, TMeta]]) | (ActionFunction0[ActionMeta[TPayload, TMeta]])
  type ResolveFunctionArg1Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionArg2Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionArg3Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionArg4Type[TFunction] = js.UndefOr[scala.Nothing]
  type ResolveFunctionReturnType[TFunction] = js.UndefOr[scala.Nothing]
  type Routine[TTriggerActionCreator, TRequestActionCreator, TSuccessActionCreator, TFailureActionCreator, TFulfillActionCreator] = TTriggerActionCreator with typings.reduxDashSagaDashRoutines.reduxDashSagaDashRoutinesStrings.Routine with js.Any with (Anon_Failure[
    TFulfillActionCreator, 
    TFailureActionCreator, 
    TRequestActionCreator, 
    TTriggerActionCreator, 
    TSuccessActionCreator
  ])
  type UnifiedRoutine[TActionCreator] = Routine[TActionCreator, TActionCreator, TActionCreator, TActionCreator, TActionCreator]
}
