package typings.sendgrid.mod.SendGrid.Helpers.Mail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachment extends js.Object {
  def getContent(): String = js.native
  def getContentId(): String = js.native
  def getDisposition(): String = js.native
  def getFilename(): String = js.native
  def getType(): String = js.native
  def setContent(content: String): Unit = js.native
  def setContentId(contentId: String): Unit = js.native
  def setDisposition(disposition: String): Unit = js.native
  def setFilename(filename: String): Unit = js.native
  def setType(`type`: String): Unit = js.native
  def toJSON(): typings.sendgrid.anon.Content = js.native
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
  @scala.inline
  implicit class AttachmentOps[Self <: Attachment] (val x: Self) extends AnyVal {
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
    def setGetContent(value: () => String): Self = this.set("getContent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContentId(value: () => String): Self = this.set("getContentId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDisposition(value: () => String): Self = this.set("getDisposition", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFilename(value: () => String): Self = this.set("getFilename", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => String): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setSetContent(value: String => Unit): Self = this.set("setContent", js.Any.fromFunction1(value))
    @scala.inline
    def setSetContentId(value: String => Unit): Self = this.set("setContentId", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDisposition(value: String => Unit): Self = this.set("setDisposition", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFilename(value: String => Unit): Self = this.set("setFilename", js.Any.fromFunction1(value))
    @scala.inline
    def setSetType(value: String => Unit): Self = this.set("setType", js.Any.fromFunction1(value))
    @scala.inline
    def setToJSON(value: () => typings.sendgrid.anon.Content): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

