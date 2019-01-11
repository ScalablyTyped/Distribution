package typings
package reduxDashActionLib.reduxDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-action", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createAction[Payload](): reduxDashActionLib.reduxDashActionMod.ActionFunction1[_, reduxDashActionLib.reduxDashActionMod.ThunkAction[Payload]] = js.native
  def createAction[Payload](
    payloadCreator: reduxDashActionLib.reduxDashActionMod.ActionFunctionAny[js.Promise[Payload] | Payload]
  ): reduxDashActionLib.reduxDashActionMod.ActionFunctionAny[reduxDashActionLib.reduxDashActionMod.ThunkAction[Payload]] = js.native
  def createAction[Payload](`type`: java.lang.String): reduxDashActionLib.reduxDashActionMod.ActionFunction1[_, reduxDashActionLib.reduxDashActionMod.ThunkAction[Payload]] = js.native
  def createAction[Payload](
    `type`: java.lang.String,
    payloadCreator: reduxDashActionLib.reduxDashActionMod.ActionFunctionAny[js.Promise[Payload] | Payload]
  ): reduxDashActionLib.reduxDashActionMod.ActionFunctionAny[reduxDashActionLib.reduxDashActionMod.ThunkAction[Payload]] = js.native
  def createAction[Payload, Meta](
    payloadCreator: reduxDashActionLib.reduxDashActionMod.ActionFunctionAny[js.Promise[Payload] | Payload],
    metaCreator: reduxDashActionLib.reduxDashActionMod.ActionFunctionAny[Meta]
  ): reduxDashActionLib.reduxDashActionMod.ActionFunctionAny[reduxDashActionLib.reduxDashActionMod.ThunkMetaAction[Payload, Meta]] = js.native
  def createAction[Payload, Meta](
    `type`: java.lang.String,
    payloadCreator: reduxDashActionLib.reduxDashActionMod.ActionFunctionAny[js.Promise[Payload] | Payload],
    metaCreator: reduxDashActionLib.reduxDashActionMod.ActionFunctionAny[Meta]
  ): reduxDashActionLib.reduxDashActionMod.ActionFunctionAny[reduxDashActionLib.reduxDashActionMod.ThunkMetaAction[Payload, Meta]] = js.native
  def createAction[Payload, Arg1, Arg2](
    payloadCreator: reduxDashActionLib.reduxDashActionMod.ActionFunction2[Arg1, Arg2, js.Promise[Payload] | Payload]
  ): reduxDashActionLib.reduxDashActionMod.ActionFunction2[Arg1, Arg2, reduxDashActionLib.reduxDashActionMod.ThunkAction[Payload]] = js.native
  def createAction[Payload, Arg1, Arg2, Arg3](
    payloadCreator: reduxDashActionLib.reduxDashActionMod.ActionFunction3[Arg1, Arg2, Arg3, js.Promise[Payload] | Payload]
  ): reduxDashActionLib.reduxDashActionMod.ActionFunction3[Arg1, Arg2, Arg3, reduxDashActionLib.reduxDashActionMod.ThunkAction[Payload]] = js.native
  @JSName("createAction")
  def createAction_PayloadArg[Payload, Arg](): reduxDashActionLib.reduxDashActionMod.ActionFunction1[Arg, reduxDashActionLib.reduxDashActionMod.ThunkAction[Payload]] = js.native
  @JSName("createAction")
  def createAction_PayloadArg[Payload, Arg](`type`: java.lang.String): reduxDashActionLib.reduxDashActionMod.ActionFunction1[Arg, reduxDashActionLib.reduxDashActionMod.ThunkAction[Payload]] = js.native
  @JSName("createAction")
  def createAction_PayloadArgActionFunction1[Payload, Arg](
    payloadCreator: reduxDashActionLib.reduxDashActionMod.ActionFunction1[Arg, js.Promise[Payload] | Payload]
  ): reduxDashActionLib.reduxDashActionMod.ActionFunction1[Arg, reduxDashActionLib.reduxDashActionMod.ThunkAction[Payload]] = js.native
  def createReducer[State](defaultState: State, handlers: reduxDashActionLib.reduxDashActionMod.ReducerHandlers[State]): reduxLib.reduxMod.Reducer[State, reduxLib.reduxMod.AnyAction] = js.native
  def createSyncAction[Payload](`type`: java.lang.String): reduxDashActionLib.reduxDashActionMod.ActionFunctionAny[reduxDashActionLib.reduxDashActionMod.Action[Payload]] = js.native
  def createSyncAction[Payload](
    `type`: java.lang.String,
    payloadCreator: reduxDashActionLib.reduxDashActionMod.ActionFunctionAny[Payload]
  ): reduxDashActionLib.reduxDashActionMod.ActionFunctionAny[reduxDashActionLib.reduxDashActionMod.Action[Payload]] = js.native
  def createSyncAction[Payload, Meta](
    `type`: java.lang.String,
    payloadCreator: reduxDashActionLib.reduxDashActionMod.ActionFunctionAny[Payload],
    metaCreator: reduxDashActionLib.reduxDashActionMod.ActionFunctionAny[Meta]
  ): reduxDashActionLib.reduxDashActionMod.ActionFunctionAny[reduxDashActionLib.reduxDashActionMod.MetaAction[Payload, Meta]] = js.native
}

