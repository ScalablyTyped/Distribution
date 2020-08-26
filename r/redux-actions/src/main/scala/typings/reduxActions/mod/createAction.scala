package typings.reduxActions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-actions", "createAction")
@js.native
object createAction extends js.Object {
  def apply(actionType: String): ActionFunctionAny[Action[_]] = js.native
  def apply[Meta](
    actionType: String,
    payloadCreator: js.UndefOr[scala.Nothing],
    metaCreator: ActionFunctionAny[Meta]
  ): ActionFunctionAny[ActionMeta[_, Meta]] = js.native
  def apply[Meta](actionType: String, payloadCreator: Null, metaCreator: ActionFunctionAny[Meta]): ActionFunctionAny[ActionMeta[_, Meta]] = js.native
  def apply[Payload](actionType: String, payloadCreator: ActionFunction0[Payload]): ActionFunction0[Action[Payload]] = js.native
  def apply[Payload, Arg1](actionType: String, payloadCreator: ActionFunction1[Arg1, Payload]): ActionFunction1[Arg1, Action[Payload]] = js.native
  def apply[Payload, Meta](
    actionType: String,
    payloadCreator: ActionFunctionAny[Payload],
    metaCreator: ActionFunctionAny[Meta]
  ): ActionFunctionAny[ActionMeta[Payload, Meta]] = js.native
  def apply[Payload, Arg1, Arg2](actionType: String, payloadCreator: ActionFunction2[Arg1, Arg2, Payload]): ActionFunction2[Arg1, Arg2, Action[Payload]] = js.native
  def apply[Payload, Meta, Arg1, Arg2](
    actionType: String,
    payloadCreator: ActionFunction2[Arg1, Arg2, Payload],
    metaCreator: ActionFunction2[Arg1, Arg2, Meta]
  ): ActionFunction2[Arg1, Arg2, ActionMeta[Payload, Meta]] = js.native
  def apply[Payload, Arg1, Arg2, Arg3](actionType: String, payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload]): ActionFunction3[Arg1, Arg2, Arg3, Action[Payload]] = js.native
  def apply[Payload, Meta, Arg1, Arg2, Arg3](
    actionType: String,
    payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, Payload],
    metaCreator: ActionFunction3[Arg1, Arg2, Arg3, Meta]
  ): ActionFunction3[Arg1, Arg2, Arg3, ActionMeta[Payload, Meta]] = js.native
  def apply[Payload, Arg1, Arg2, Arg3, Arg4](actionType: String, payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload]): ActionFunction4[Arg1, Arg2, Arg3, Arg4, Action[Payload]] = js.native
  def apply[Payload, Meta, Arg1, Arg2, Arg3, Arg4](
    actionType: String,
    payloadCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Payload],
    metaCreator: ActionFunction4[Arg1, Arg2, Arg3, Arg4, Meta]
  ): ActionFunction4[Arg1, Arg2, Arg3, Arg4, ActionMeta[Payload, Meta]] = js.native
}

