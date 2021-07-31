package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Sends a message._
  *
  * Constructs a message to be sent either as a text message or an iMessage.
  * @see https://docs.scriptable.app/message/#-new-message
  */
trait Message extends StObject {
  
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
  def addDataAttachment(data: Data, uti: String, filename: String): Unit
  
  /**
    * _Adds a file attachment to the message._
    * @param filePath - Path of file to add to the message.
    * @see https://docs.scriptable.app/message/#-addfileattachment
    */
  def addFileAttachment(filePath: String): Unit
  
  /**
    * _Adds an image attachment to the message._
    * @param image - Image to add to the message.
    * @see https://docs.scriptable.app/message/#-addimageattachment
    */
  def addImageAttachment(image: Image): Unit
  
  /**
    * _Body of the message._
    *
    * Body of the message to send. You will have a chance to modify this before the message is sent.
    * @see https://docs.scriptable.app/message/#body
    */
  var body: String
  
  /**
    * _Recipients of the message._
    *
    * Array of recipients to send the message to. Elements in the array should be phone numbers. You will have a chance to modify this before the message is sent.
    * @see https://docs.scriptable.app/message/#recipients
    */
  var recipients: js.Array[String]
  
  /**
    * _Send the message._
    *
    * Presents a screen from which the message can be sent. The message will not be sent until you have confirmed it from the presented screen.
    * @see https://docs.scriptable.app/message/#-send
    */
  def send(): js.Promise[Unit]
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
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddDataAttachment(value: (Data, String, String) => Unit): Self = StObject.set(x, "addDataAttachment", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddFileAttachment(value: String => Unit): Self = StObject.set(x, "addFileAttachment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddImageAttachment(value: Image => Unit): Self = StObject.set(x, "addImageAttachment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipients(value: js.Array[String]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsVarargs(value: String*): Self = StObject.set(x, "recipients", js.Array(value :_*))
    
    @scala.inline
    def setSend(value: () => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction0(value))
  }
}
