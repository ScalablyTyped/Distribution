package typings.reduxAction.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-action", "createAction")
@js.native
object createAction extends js.Object {
  
  def apply[Payload](): ActionFunction1[_, ThunkAction[Payload]] = js.native
  def apply[Payload](payloadCreator: ActionFunctionAny[js.Promise[Payload] | Payload]): ActionFunctionAny[ThunkAction[Payload]] = js.native
  def apply[Payload](`type`: String): ActionFunction1[_, ThunkAction[Payload]] = js.native
  def apply[Payload](`type`: String, payloadCreator: ActionFunctionAny[js.Promise[Payload] | Payload]): ActionFunctionAny[ThunkAction[Payload]] = js.native
  def apply[Payload, Meta](
    payloadCreator: ActionFunctionAny[js.Promise[Payload] | Payload],
    metaCreator: ActionFunctionAny[Meta]
  ): ActionFunctionAny[ThunkMetaAction[Payload, Meta]] = js.native
  def apply[Payload, Meta](
    `type`: String,
    payloadCreator: ActionFunctionAny[js.Promise[Payload] | Payload],
    metaCreator: ActionFunctionAny[Meta]
  ): ActionFunctionAny[ThunkMetaAction[Payload, Meta]] = js.native
  def apply[Payload, Arg1, Arg2](payloadCreator: ActionFunction2[Arg1, Arg2, js.Promise[Payload] | Payload]): ActionFunction2[Arg1, Arg2, ThunkAction[Payload]] = js.native
  def apply[Payload, Arg1, Arg2, Arg3](payloadCreator: ActionFunction3[Arg1, Arg2, Arg3, js.Promise[Payload] | Payload]): ActionFunction3[Arg1, Arg2, Arg3, ThunkAction[Payload]] = js.native
}
