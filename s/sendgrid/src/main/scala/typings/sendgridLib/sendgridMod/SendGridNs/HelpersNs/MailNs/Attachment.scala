package typings
package sendgridLib.sendgridMod.SendGridNs.HelpersNs.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  def getContent(): java.lang.String
  def getContentId(): java.lang.String
  def getDisposition(): java.lang.String
  def getFilename(): java.lang.String
  def getType(): java.lang.String
  def setContent(content: java.lang.String): scala.Unit
  def setContentId(contentId: java.lang.String): scala.Unit
  def setDisposition(disposition: java.lang.String): scala.Unit
  def setFilename(filename: java.lang.String): scala.Unit
  def setType(`type`: java.lang.String): scala.Unit
  def toJSON(): sendgridLib.Anon_Content
}

object Attachment {
  @scala.inline
  def apply(
    getContent: () => java.lang.String,
    getContentId: () => java.lang.String,
    getDisposition: () => java.lang.String,
    getFilename: () => java.lang.String,
    getType: () => java.lang.String,
    setContent: java.lang.String => scala.Unit,
    setContentId: java.lang.String => scala.Unit,
    setDisposition: java.lang.String => scala.Unit,
    setFilename: java.lang.String => scala.Unit,
    setType: java.lang.String => scala.Unit,
    toJSON: () => sendgridLib.Anon_Content
  ): Attachment = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent), getContentId = js.Any.fromFunction0(getContentId), getDisposition = js.Any.fromFunction0(getDisposition), getFilename = js.Any.fromFunction0(getFilename), getType = js.Any.fromFunction0(getType), setContent = js.Any.fromFunction1(setContent), setContentId = js.Any.fromFunction1(setContentId), setDisposition = js.Any.fromFunction1(setDisposition), setFilename = js.Any.fromFunction1(setFilename), setType = js.Any.fromFunction1(setType), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Attachment]
  }
}

