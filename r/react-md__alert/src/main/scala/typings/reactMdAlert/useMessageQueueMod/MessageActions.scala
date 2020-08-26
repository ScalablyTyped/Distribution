package typings.reactMdAlert.useMessageQueueMod

import typings.reactMdAlert.messageQueueContextMod.DuplicateBehavior
import typings.reactMdAlert.messageQueueContextMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactMdAlert.useMessageQueueMod.AddMessageAction[M]
  - typings.reactMdAlert.useMessageQueueMod.PopMessageAction
  - typings.reactMdAlert.useMessageQueueMod.ResetQueueAction
*/
trait MessageActions[M /* <: Message */] extends js.Object

object MessageActions {
  @scala.inline
  def AddMessageAction[/* <: typings.reactMdAlert.messageQueueContextMod.Message */ M](duplicates: DuplicateBehavior, message: M, `type`: /* "ADD_MESSAGE" */ String): MessageActions[M] = {
    val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageActions[M]]
  }
  @scala.inline
  def PopMessageAction[/* <: typings.reactMdAlert.messageQueueContextMod.Message */ M](`type`: /* "POP_MESSAGE" */ String): MessageActions[M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageActions[M]]
  }
  @scala.inline
  def ResetQueueAction[/* <: typings.reactMdAlert.messageQueueContextMod.Message */ M](`type`: /* "RESET_QUEUE" */ String): MessageActions[M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageActions[M]]
  }
}

