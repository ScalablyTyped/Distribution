package typings.reduxAction.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-action", "createSyncAction")
@js.native
object createSyncAction extends js.Object {
  def apply[Payload](`type`: String): ActionFunctionAny[Action[Payload]] = js.native
  def apply[Payload](`type`: String, payloadCreator: ActionFunctionAny[Payload]): ActionFunctionAny[Action[Payload]] = js.native
  def apply[Payload, Meta](`type`: String, payloadCreator: ActionFunctionAny[Payload], metaCreator: ActionFunctionAny[Meta]): ActionFunctionAny[MetaAction[Payload, Meta]] = js.native
}

