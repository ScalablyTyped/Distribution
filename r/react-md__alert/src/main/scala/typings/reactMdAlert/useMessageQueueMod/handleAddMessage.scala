package typings.reactMdAlert.useMessageQueueMod

import typings.reactMdAlert.messageQueueContextMod.DuplicateBehavior
import typings.reactMdAlert.messageQueueContextMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/alert/types/useMessageQueue", "handleAddMessage")
@js.native
object handleAddMessage extends js.Object {
  
  def apply[M /* <: Message */](state: js.Array[M], message: M, duplicates: DuplicateBehavior): js.Array[M] = js.native
}
