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
      ]
    ]
  ): reduxDashFormLib.libReduxFormMod.FormSubmitHandler[TFormData, TProps, java.lang.String] = js.native
  def bindRoutineToReduxForm[TFormData, TProps](
    routine: Routine[
      reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[
        ReduxFormPayload[TFormData, TProps], 
        (reduxDashActionsLib.reduxDashActionsMod.Action[ReduxFormPayload[TFormData, TProps]]) | (reduxDashActionsLib.reduxDashActionsMod.ActionMeta[ReduxFormPayload[TFormData, TProps], _])
      ]
    ],
    noSuccessPayload: scala.Boolean
  ): reduxDashFormLib.libReduxFormMod.FormSubmitHandler[TFormData, TProps, java.lang.String] = js.native
  def createRoutine(typePrefix: java.lang.String): Routine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[reduxDashActionsLib.reduxDashActionsMod.Action[_]]
  ] = js.native
  def createRoutine[Meta](
    typePrefix: java.lang.String,
    payloadCreator: js.UndefOr[scala.Nothing],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[Meta]
  ): Routine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[reduxDashActionsLib.reduxDashActionsMod.ActionMeta[_, Meta]]
  ] = js.native
  def createRoutine[Payload](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction0[Payload]
  ): Routine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction0[reduxDashActionsLib.reduxDashActionsMod.Action[Payload]]
  ] = js.native
  def createRoutine[Meta](
    typePrefix: java.lang.String,
    payloadCreator: scala.Null,
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[Meta]
  ): Routine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[reduxDashActionsLib.reduxDashActionsMod.ActionMeta[_, Meta]]
  ] = js.native
  def createRoutine[Payload, Arg1](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[Arg1, Payload]
  ): Routine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[Arg1, reduxDashActionsLib.reduxDashActionsMod.Action[Payload]]
  ] = js.native
  def createRoutine[Payload, Meta](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[Payload],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[Meta]
  ): Routine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunctionAny[reduxDashActionsLib.reduxDashActionsMod.ActionMeta[Payload, Meta]]
  ] = js.native
  def createRoutine[Payload, Arg1, Arg2](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[Arg1, Arg2, Payload]
  ): Routine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[Arg1, Arg2, reduxDashActionsLib.reduxDashActionsMod.Action[Payload]]
  ] = js.native
  def createRoutine[Payload, Meta, Arg1, Arg2](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[Arg1, Arg2, Payload],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[Arg1, Arg2, Meta]
  ): Routine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction2[Arg1, Arg2, reduxDashActionsLib.reduxDashActionsMod.ActionMeta[Payload, Meta]]
  ] = js.native
  def createRoutine[Payload, Arg1, Arg2, Arg3](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[Arg1, Arg2, Arg3, Payload]
  ): Routine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[Arg1, Arg2, Arg3, reduxDashActionsLib.reduxDashActionsMod.Action[Payload]]
  ] = js.native
  def createRoutine[Payload, Meta, Arg1, Arg2, Arg3](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[Arg1, Arg2, Arg3, Payload],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[Arg1, Arg2, Arg3, Meta]
  ): Routine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction3[Arg1, Arg2, Arg3, reduxDashActionsLib.reduxDashActionsMod.ActionMeta[Payload, Meta]]
  ] = js.native
  def createRoutine[Payload, Arg1, Arg2, Arg3, Arg4](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload]
  ): Routine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[Arg1, Arg2, Arg3, Arg4, reduxDashActionsLib.reduxDashActionsMod.Action[Payload]]
  ] = js.native
  def createRoutine[Payload, Meta, Arg1, Arg2, Arg3, Arg4](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[Arg1, Arg2, Arg3, Arg4, Meta]
  ): Routine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction4[
      Arg1, 
      Arg2, 
      Arg3, 
      Arg4, 
      reduxDashActionsLib.reduxDashActionsMod.ActionMeta[Payload, Meta]
    ]
  ] = js.native
  @JSName("createRoutine")
  def createRoutine_Payload[Payload](typePrefix: java.lang.String): Routine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[Payload, reduxDashActionsLib.reduxDashActionsMod.Action[Payload]]
  ] = js.native
  @JSName("createRoutine")
  def createRoutine_PayloadMetaArg1[Payload, Meta, Arg1](
    typePrefix: java.lang.String,
    payloadCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[Arg1, Payload],
    metaCreator: reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[Arg1, Meta]
  ): Routine[
    reduxDashActionsLib.reduxDashActionsMod.ActionFunction1[Arg1, reduxDashActionsLib.reduxDashActionsMod.ActionMeta[Payload, Meta]]
  ] = js.native
  def promisifyRoutine(routine: Routine[ActionCreator]): PromiseCreator[js.Object] = js.native
  def routinePromiseWatcherSaga(): stdLib.Generator = js.native
}

