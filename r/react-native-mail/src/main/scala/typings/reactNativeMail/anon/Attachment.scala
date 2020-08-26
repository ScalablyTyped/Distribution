package typings.reactNativeMail.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachment extends js.Object {
  var attachment: js.UndefOr[Name] = js.native
  var bccRecipients: js.UndefOr[js.Array[String]] = js.native
  var body: String = js.native
  var ccRecipients: js.UndefOr[js.Array[String]] = js.native
  var isHTML: Boolean = js.native
  var recipients: js.UndefOr[js.Array[String]] = js.native
  var subject: String = js.native
}

object Attachment {
  @scala.inline
  def apply(body: String, isHTML: Boolean, subject: String): Attachment = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isHTML = isHTML.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsHTML(value: Boolean): Self = this.set("isHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachment(value: Name): Self = this.set("attachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachment: Self = this.set("attachment", js.undefined)
    @scala.inline
    def setBccRecipientsVarargs(value: String*): Self = this.set("bccRecipients", js.Array(value :_*))
    @scala.inline
    def setBccRecipients(value: js.Array[String]): Self = this.set("bccRecipients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBccRecipients: Self = this.set("bccRecipients", js.undefined)
    @scala.inline
    def setCcRecipientsVarargs(value: String*): Self = this.set("ccRecipients", js.Array(value :_*))
    @scala.inline
    def setCcRecipients(value: js.Array[String]): Self = this.set("ccRecipients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCcRecipients: Self = this.set("ccRecipients", js.undefined)
    @scala.inline
    def setRecipientsVarargs(value: String*): Self = this.set("recipients", js.Array(value :_*))
    @scala.inline
    def setRecipients(value: js.Array[String]): Self = this.set("recipients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
  }
  
}

