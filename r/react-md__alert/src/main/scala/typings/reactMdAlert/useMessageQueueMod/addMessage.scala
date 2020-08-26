package typings.reactMdAlert.useMessageQueueMod

import typings.reactMdAlert.messageQueueContextMod.DuplicateBehavior
import typings.reactMdAlert.messageQueueContextMod.Message
import typings.reactMdAlert.messageQueueContextMod.ToastMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/alert/types/useMessageQueue", "addMessage")
@js.native
object addMessage extends js.Object {
  def apply[M /* <: Message */](message: M, duplicates: DuplicateBehavior): AddMessageAction[ToastMessage] = js.native
}

