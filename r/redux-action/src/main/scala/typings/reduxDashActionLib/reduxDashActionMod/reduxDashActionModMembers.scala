package typings
package reduxDashActionLib.reduxDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-action", JSImport.Namespace)
@js.native
object reduxDashActionModMembers extends js.Object {
  def createAction[Payload](): ActionFunction1[_, ThunkAction[Payload]] = js.native
  def createAction[Payload](payloadCreator: ActionFunctionAny[stdLib.Promise[Payload] | Payload]): ActionFunctionAny[ThunkAction[Payload]] = js.native
  def createAction[Payload](`type`: java.lang.String): ActionFunction1[_, ThunkAction[Payload]] = js.native
  def createAction[Payload](`type`: java.lang.String, payloadCreator: ActionFunctionAny[stdLib.Promise[Payload] | Payload]): ActionFunctionAny[ThunkAction[Payload]] = js.native
  def createAction[Payload, Meta](
    payloadCreator: ActionFunctionAny[stdLib.Promise[Payload] | Payload],
    metaCreator: ActionFunctionAny[Meta]
  ): ActionFunctionAny[ThunkMetaAction[Payload, Meta]] = js.native
  def createAction[Payload, Meta](
    `type`: java.lang.String,
    payloadCreator: ActionFunctionAny[stdLib.Promise[Payload] | Payload],
    metaCreator: ActionFunctionAny[Meta]
  ): ActionFunctionAny[ThunkMetaAction[Payload, Meta]] = js.native
  def createAction[Payload, Arg1, Arg2](payloadCreator: ActionFunction2[Arg1, Arg2, stdLib.Promise[Payload] | Payload]): ActionFunction2[Arg1, Arg2, ThunkAction[Payload]] = js.native
  def createAction[Payload, Arg1, Arg2, Arg3](payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, stdLib.Promise[Payload] | Payload]): ActionFunction3[Arg1, Arg2, Arg3, ThunkAction[Payload]] = js.native
  @JSName("createAction")
  def createAction_PayloadArg[Payload, Arg](): ActionFunction1[Arg, ThunkAction[Payload]] = js.native
  @JSName("createAction")
  def createAction_PayloadArg[Payload, Arg](`type`: java.lang.String): ActionFunction1[Arg, ThunkAction[Payload]] = js.native
  @JSName("createAction")
  def createAction_PayloadArgActionFunction1[Payload, Arg](payloadCreator: ActionFunction1[Arg, stdLib.Promise[Payload] | Payload]): ActionFunction1[Arg, ThunkAction[Payload]] = js.native
  def createReducer[State](defaultState: State, handlers: ReducerHandlers[State]): reduxLib.reduxMod.Reducer[State, reduxLib.reduxMod.AnyAction] = js.native
  def createSyncAction[Payload](`type`: java.lang.String): ActionFunctionAny[Action[Payload]] = js.native
  def createSyncAction[Payload](`type`: java.lang.String, payloadCreator: ActionFunctionAny[Payload]): ActionFunctionAny[Action[Payload]] = js.native
  def createSyncAction[Payload, Meta](
    `type`: java.lang.String,
    payloadCreator: ActionFunctionAny[Payload],
    metaCreator: ActionFunctionAny[Meta]
  ): ActionFunctionAny[MetaAction[Payload, Meta]] = js.native
}

