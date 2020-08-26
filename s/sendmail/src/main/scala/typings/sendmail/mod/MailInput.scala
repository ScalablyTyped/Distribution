package typings.sendmail.mod

import typings.sendmail.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailInput extends js.Object {
  var attachments: js.UndefOr[js.Array[Content]] = js.native
  var bcc: js.UndefOr[String] = js.native
  var cc: js.UndefOr[String] = js.native
  var charset: js.UndefOr[String] = js.native
  var content: js.UndefOr[String] = js.native
  var encoding: js.UndefOr[String] = js.native
  var from: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var html: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var replyTo: js.UndefOr[String] = js.native
  var returnTo: js.UndefOr[String] = js.native
  var subject: String = js.native
  var to: String = js.native
  var `type`: js.UndefOr[String] = js.native
}

object MailInput {
  @scala.inline
  def apply(from: String, subject: String, to: String): MailInput = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailInput]
  }
  @scala.inline
  implicit class MailInputOps[Self <: MailInput] (val x: Self) extends AnyVal {
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
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachmentsVarargs(value: Content*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[Content]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setBcc(value: String): Self = this.set("bcc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBcc: Self = this.set("bcc", js.undefined)
    @scala.inline
    def setCc(value: String): Self = this.set("cc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCc: Self = this.set("cc", js.undefined)
    @scala.inline
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setReplyTo(value: String): Self = this.set("replyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyTo: Self = this.set("replyTo", js.undefined)
    @scala.inline
    def setReturnTo(value: String): Self = this.set("returnTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnTo: Self = this.set("returnTo", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

