package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Sends a message._
  *
  * Constructs a message to be sent either as a text message or an iMessage.
  * @see https://docs.scriptable.app/message/#-new-message
  */
@js.native
trait Message extends js.Object {
  
  /**
    * _Adds a data attachment to the message._
    *
    * When adding a data attachment to the message, you are responsible for providing a valid Uniform Type Identifier and filename. It is advised to use `addImageAttachment` and
    * `addFileAttachment` whenever possible.
    * @param data - Data representation of file to add to the message.
    * @param uti - UTI of file represented by the data.
    * @param filename - Name of the file represented by the data.
    * @see https://docs.scriptable.app/message/#-adddataattachment
    */
  def addDataAttachment(data: Data, uti: String, filename: String): Unit = js.native
  
  /**
    * _Adds a file attachment to the message._
    * @param filePath - Path of file to add to the message.
    * @see https://docs.scriptable.app/message/#-addfileattachment
    */
  def addFileAttachment(filePath: String): Unit = js.native
  
  /**
    * _Adds an image attachment to the message._
    * @param image - Image to add to the message.
    * @see https://docs.scriptable.app/message/#-addimageattachment
    */
  def addImageAttachment(image: Image): Unit = js.native
  
  /**
    * _Body of the message._
    *
    * Body of the message to send. You will have a chance to modify this before the message is sent.
    * @see https://docs.scriptable.app/message/#body
    */
  var body: String = js.native
  
  /**
    * _Recipients of the message._
    *
    * Array of recipients to send the message to. Elements in the array should be phone numbers. You will have a chance to modify this before the message is sent.
    * @see https://docs.scriptable.app/message/#recipients
    */
  var recipients: js.Array[String] = js.native
  
  /**
    * _Send the message._
    *
    * Presents a screen from which the message can be sent. The message will not be sent until you have confirmed it from the presented screen.
    * @see https://docs.scriptable.app/message/#-send
    */
  def send(): js.Promise[Unit] = js.native
}
object Message {
  
  @scala.inline
  def apply(
    addDataAttachment: (Data, String, String) => Unit,
    addFileAttachment: String => Unit,
    addImageAttachment: Image => Unit,
    body: String,
    recipients: js.Array[String],
    send: () => js.Promise[Unit]
  ): Message = {
    val __obj = js.Dynamic.literal(addDataAttachment = js.Any.fromFunction3(addDataAttachment), addFileAttachment = js.Any.fromFunction1(addFileAttachment), addImageAttachment = js.Any.fromFunction1(addImageAttachment), body = body.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], send = js.Any.fromFunction0(send))
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
    def setAddDataAttachment(value: (Data, String, String) => Unit): Self = this.set("addDataAttachment", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddFileAttachment(value: String => Unit): Self = this.set("addFileAttachment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddImageAttachment(value: Image => Unit): Self = this.set("addImageAttachment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsVarargs(value: String*): Self = this.set("recipients", js.Array(value :_*))
    
    @scala.inline
    def setRecipients(value: js.Array[String]): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend(value: () => js.Promise[Unit]): Self = this.set("send", js.Any.fromFunction0(value))
  }
}
