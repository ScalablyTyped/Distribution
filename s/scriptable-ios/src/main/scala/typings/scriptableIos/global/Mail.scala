package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Sends a mail._
  *
  * Constructs a mail to be sent either as a text message or an iMessage.
  * @see https://docs.scriptable.app/mail/#-new-mail
  */
@JSGlobal("Mail")
@js.native
/**
  * _Sends a mail._
  *
  * Constructs a mail to be sent either as a text message or an iMessage.
  * @see https://docs.scriptable.app/mail/#-new-mail
  */
class Mail ()
  extends typings.scriptableIos.Mail {
  /**
    * _Recipients to set BCC on the mail._
    *
    * Array of recipients to set as BCC on the mail. Elements in the array should be e-mail addresses. You will have a chance to modify this before the mail is sent.
    * @see https://docs.scriptable.app/mail/#bccrecipients
    */
  /* CompleteClass */
  override var bccRecipients: js.Array[String] = js.native
  /**
    * _Body of the mail._
    *
    * Body of the mail to send. You will have a chance to modify this before the mail is sent.
    * @see https://docs.scriptable.app/mail/#body
    */
  /* CompleteClass */
  override var body: String = js.native
  /**
    * _Recipients to set CC on the mail._
    *
    * Array of recipients to set as CC on the mail. Elements in the array should be e-mail addresses. You will have a chance to modify this before the mail is sent.
    * @see https://docs.scriptable.app/mail/#ccrecipients
    */
  /* CompleteClass */
  override var ccRecipients: js.Array[String] = js.native
  /**
    * _Whether body is HTML._
    *
    * Set to true if the body of the mail is HTML. Defaults to false.
    * @see https://docs.scriptable.app/mail/#isbodyhtml
    */
  /* CompleteClass */
  override var isBodyHTML: Boolean = js.native
  /**
    * _Preferred email address to use in the from field._
    *
    * Sets the preferred email addressed to use when sending the mail. If no account with the preferred email address is set up, the default email address is used.
    * @see https://docs.scriptable.app/mail/#preferredsendingemailaddress
    */
  /* CompleteClass */
  override var preferredSendingEmailAddress: String = js.native
  /**
    * _Subject of the mail._
    *
    * Subject of the mail to send. You will have a chance to modify this before the mail is sent.
    * @see https://docs.scriptable.app/mail/#subject
    */
  /* CompleteClass */
  override var subject: String = js.native
  /**
    * _Recipients of the mail._
    *
    * Array of recipients to send the mail to. Elements in the array should be e-mail addresses. You will have a chance to modify this before the mail is sent.
    * @see https://docs.scriptable.app/mail/#torecipients
    */
  /* CompleteClass */
  override var toRecipients: js.Array[String] = js.native
  /**
    * _Adds a data attachment to the mail._
    *
    * When adding a data attachment to the mail, you are responsible for providing a valid MIME type and filename. It is advised to use `addImageAttachment` and `addFileAttachment`
    * whenever possible.
    * @param data - Data representation of file to add to the mail.
    * @param mimeType - MIME type of file represented by the data.
    * @param filename - Name of the file represented by the data.
    * @see https://docs.scriptable.app/mail/#-adddataattachment
    */
  /* CompleteClass */
  override def addDataAttachment(data: typings.scriptableIos.Data, mimeType: String, filename: String): Unit = js.native
  /**
    * _Adds a file attachment to the mail._
    * @param filePath - Path of file to add to the mail.
    * @see https://docs.scriptable.app/mail/#-addfileattachment
    */
  /* CompleteClass */
  override def addFileAttachment(filePath: String): Unit = js.native
  /**
    * _Adds an image attachment to the mail._
    * @param image - Image to add to the mail.
    * @see https://docs.scriptable.app/mail/#-addimageattachment
    */
  /* CompleteClass */
  override def addImageAttachment(image: typings.scriptableIos.Image): Unit = js.native
  /**
    * _Send the mail._
    *
    * Presents a screen from which the mail can be sent. The mail will not be sent until you have confirmed it from the presented screen.
    * @see https://docs.scriptable.app/mail/#-send
    */
  /* CompleteClass */
  override def send(): js.Promise[Unit] = js.native
}

