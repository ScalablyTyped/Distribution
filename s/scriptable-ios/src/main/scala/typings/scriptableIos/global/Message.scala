package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Sends a message._
  *
  * Constructs a message to be sent either as a text message or an iMessage.
  * @see https://docs.scriptable.app/message/#-new-message
  */
@JSGlobal("Message")
@js.native
/**
  * _Sends a message._
  *
  * Constructs a message to be sent either as a text message or an iMessage.
  * @see https://docs.scriptable.app/message/#-new-message
  */
class Message ()
  extends StObject
     with typings.scriptableIos.Message {
  
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
  /* CompleteClass */
  override def addDataAttachment(data: typings.scriptableIos.Data, uti: String, filename: String): Unit = js.native
  
  /**
    * _Adds a file attachment to the message._
    * @param filePath - Path of file to add to the message.
    * @see https://docs.scriptable.app/message/#-addfileattachment
    */
  /* CompleteClass */
  override def addFileAttachment(filePath: String): Unit = js.native
  
  /**
    * _Adds an image attachment to the message._
    * @param image - Image to add to the message.
    * @see https://docs.scriptable.app/message/#-addimageattachment
    */
  /* CompleteClass */
  override def addImageAttachment(image: typings.scriptableIos.Image): Unit = js.native
  
  /**
    * _Body of the message._
    *
    * Body of the message to send. You will have a chance to modify this before the message is sent.
    * @see https://docs.scriptable.app/message/#body
    */
  /* CompleteClass */
  var body: String = js.native
  
  /**
    * _Recipients of the message._
    *
    * Array of recipients to send the message to. Elements in the array should be phone numbers. You will have a chance to modify this before the message is sent.
    * @see https://docs.scriptable.app/message/#recipients
    */
  /* CompleteClass */
  var recipients: js.Array[String] = js.native
  
  /**
    * _Send the message._
    *
    * Presents a screen from which the message can be sent. The message will not be sent until you have confirmed it from the presented screen.
    * @see https://docs.scriptable.app/message/#-send
    */
  /* CompleteClass */
  override def send(): js.Promise[Unit] = js.native
}
