package typings.reactMdAlert.messageQueueContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
  /**
    * Boolean if the message should not automatically hide itself after the
    * timeout duration.  This should normally be enabled if you want to enforce
    * the user presses the action inside or it is a toast that will be hidden by
    * some other logic (like online/offline).
    *
    * @default false
    */
  var disableAutohide: js.UndefOr[Boolean] = js.native
  
  /**
    * If you have not enabled the prevent duplicated messages or the restart
    * message display timer functionality, this property can be omitted since it
    * is only used for those flows.
    *
    * When the `addMessage` action is called, the existing queue will be checked
    * for a message containing the new message's id. If it exists, it will not be
    * re-added to the queue. If the current message is being displayed, the
    * display timer will be restarted.
    */
  var messageId: js.UndefOr[String | Double] = js.native
  
  /**
    * An optional priority to set to the message if this message needs to be
    * shown to the user more quickly. The default behavior will be to add it to
    * the end of the message queue, but when the priority is set to `"next"` it
    * will be shown immediately if there are no messages being displayed or
    * immediately after the current displayed message is hidden. All other
    * existing messages will maintain their order but pushed behind this new
    * message.
    *
    * @default "normal"
    */
  var messagePriority: js.UndefOr[MessagePriority] = js.native
}
object Message {
  
  @scala.inline
  def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisableAutohide(value: Boolean): Self = this.set("disableAutohide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAutohide: Self = this.set("disableAutohide", js.undefined)
    
    @scala.inline
    def setMessageId(value: String | Double): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    
    @scala.inline
    def setMessagePriority(value: MessagePriority): Self = this.set("messagePriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessagePriority: Self = this.set("messagePriority", js.undefined)
  }
}
