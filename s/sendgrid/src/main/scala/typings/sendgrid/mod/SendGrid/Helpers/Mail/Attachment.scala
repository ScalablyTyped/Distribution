package typings.sendgrid.mod.SendGrid.Helpers.Mail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  def getContent(): String
  def getContentId(): String
  def getDisposition(): String
  def getFilename(): String
  def getType(): String
  def setContent(content: String): Unit
  def setContentId(contentId: String): Unit
  def setDisposition(disposition: String): Unit
  def setFilename(filename: String): Unit
  def setType(`type`: String): Unit
  def toJSON(): typings.sendgrid.anon.Content
}

object Attachment {
  @scala.inline
  def apply(
    getContent: () => String,
    getContentId: () => String,
    getDisposition: () => String,
    getFilename: () => String,
    getType: () => String,
    setContent: String => Unit,
    setContentId: String => Unit,
    setDisposition: String => Unit,
    setFilename: String => Unit,
    setType: String => Unit,
    toJSON: () => typings.sendgrid.anon.Content
  ): Attachment = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent), getContentId = js.Any.fromFunction0(getContentId), getDisposition = js.Any.fromFunction0(getDisposition), getFilename = js.Any.fromFunction0(getFilename), getType = js.Any.fromFunction0(getType), setContent = js.Any.fromFunction1(setContent), setContentId = js.Any.fromFunction1(setContentId), setDisposition = js.Any.fromFunction1(setDisposition), setFilename = js.Any.fromFunction1(setFilename), setType = js.Any.fromFunction1(setType), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Attachment]
  }
}

